package me.daddychurchill.XWorld.Generators;


import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;

import me.daddychurchill.XWorld.Config;
import me.daddychurchill.XWorld.XWorld;
import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Blocks.InitializeChunk;
import me.daddychurchill.XWorld.Commands.XWorldCommand;
import me.daddychurchill.XWorld.Support.Odds;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;
import me.daddychurchill.XWorld.Worlds.WorldFactory;
import me.daddychurchill.XWorld.Worlds.BigFlat.BigFlatFactory;
import me.daddychurchill.XWorld.Worlds.BigTree.BigTreeFactory;
import me.daddychurchill.XWorld.Worlds.SimpleNature.SimpleNatureFactory;
import me.daddychurchill.XWorld.Worlds.TreesAndSuch.TreesAndSuchFactory;

public class CoreGenerator extends ChunkGenerator {

	// all the registered world factories
	private static Map<String, WorldFactory> worldFactories = new HashMap<String, WorldFactory>();
	private static WorldFactory defaultFactory = null;
	
	// what can we make?
	static {
		addWorldType(new TreesAndSuchFactory());
		addWorldType(new SimpleNatureFactory());
		addWorldType(new BigFlatFactory());
		addWorldType(new BigTreeFactory());
	}
	
	private XWorld worldPlugin;
	private String worldName;
	private String worldStyle;
	private AbstractWorld worldMaker;
	private Config worldConfig;
	private World worldMinecraft;
	private BlockCallback blockCallback;

	public CoreGenerator(XWorld plugin, String name, String style){
		super();
		
		worldPlugin = plugin;
		worldConfig = new Config(this);
		worldName = name;
		worldStyle = style;
	}
	
	public static CoreGenerator getCoreGeneratorFor(XWorld plugin, String name, String style) {
		return new CoreGenerator(plugin, name, style);
	}
	
	@Override
	public List<BlockPopulator> getDefaultPopulators(World world) {
		worldMinecraft = world;
		
		WorldFactory factory = findWorldFactory(worldStyle);
		assert(factory != null);
		
		worldMaker = factory.getWorld(this);
		worldStyle = factory.getStyle(); // reset this to what it ends up as
		
//		worldPlugin.reportMessage("Style = " + worldStyle);
//		worldPlugin.reportMessage("Maker = " + worldMaker.toString());

		this.blockCallback = new BlockCallback(this);
		return Arrays.asList((BlockPopulator) blockCallback);
	}
	
	@Override
	public Location getFixedSpawnLocation(World world, Random random) {
		Location result = super.getFixedSpawnLocation(world, random);
		if (result == null)
			result = new Location(world, random.nextInt(64) - 32, world.getSeaLevel(), random.nextInt(64) - 32);
		
		return worldMaker.fixSpawnLocation(world, random, result);
	}
	
	public XWorld getPlugin() {
		return worldPlugin;
	}

	public World getWorld() {
		return worldMinecraft;
	}

	public AbstractWorld getWorldMaker() {
		return worldMaker;
	}

	public String getName() {
		return worldName;
	}

	public String getStyle() {
		return worldStyle;
	}
	
	public Config getConfig() {
		return worldConfig;
	}
	
	public void reportMessage(String message) {
		worldPlugin.reportMessage(message);
	}

	public void reportMessage(String message1, String message2) {
		worldPlugin.reportMessage(message1, message2);
	}
	
	public void reportFormatted(String format, Object ... objects) {
		worldPlugin.reportMessage(String.format(format, objects));
	}

	public void reportException(String message, Exception e) {
		worldPlugin.reportException(message, e);
	}
	
	@Override
	public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome) {
		try {

			// place to work
			InitializeChunk chunk = new InitializeChunk(this, this.createChunkData(world), biome, new Odds(random), x, z);
			
			// let the world maker do its thing
			worldMaker.renderHere(chunk);
		
			// all done!
			return chunk.getRawData();
			
		} catch (Exception e) {
			reportException("Generator FAILED", e);
			return null;
		} 
	}
	
	public void populate(World world, Random random, Chunk source) {
		try {

		
			// where are we?
			int chunkX = source.getX();
			int chunkZ = source.getZ();
			
			// place to work
			FinalizeChunk chunk = new FinalizeChunk(this, new Odds(random), source, chunkX, chunkZ);
			
			// let the world maker do its thing
			worldMaker.renderHere(chunk);
		
		} catch (Exception e) {
			reportException("Populator FAILED", e);
		} 
	}

	private static class BlockCallback extends BlockPopulator {

		private CoreGenerator chunkGen;
		
		public BlockCallback(CoreGenerator chunkGen){
			this.chunkGen = chunkGen;
		}
		
		@Override
		public void populate(World world, Random random, Chunk source) {
			chunkGen.populate(world, random, source);
		}
	}

//	private static void addDefaultWorldType(WorldFactory factory) {
//		addWorldType(factory);
//		defaultFactory = factory;
//	}
	
	private static void addWorldType(WorldFactory factory) {
		if (defaultFactory == null)
			defaultFactory = factory;
		
		// this style shouldn't be already here!
		String style = factory.getStyle().toUpperCase();
		assert(!XWorldCommand.ifParam(style));
		assert(!worldFactories.containsKey(style));
		worldFactories.put(style, factory);
	}
	
	public static boolean supportsWorldType(String id) {
		return worldFactories.containsKey(id.toUpperCase());
	}
	
	public static String getDefaultWorldType() {
		return defaultFactory.getStyle();
	}
	
	public static String[] getWorldTypes() {
		assert(worldFactories != null);
		int index = 0;
		String[] results = new String[worldFactories.size()];
		Collection<WorldFactory> factories = worldFactories.values();
		Iterator<WorldFactory> looper = factories.iterator();
		while (looper.hasNext()) {
			WorldFactory factory = looper.next();
			results[index] = factory.getStyle();
			index++;
		}
		return results;
	}
	
	private WorldFactory findWorldFactory(String id) {
		WorldFactory worldFactory = null;
		if (worldFactories != null)
			worldFactory = worldFactories.get(id.toUpperCase());
		if (worldFactory == null)
			worldFactory = defaultFactory;
		
		// better have found something!
		return worldFactory;
	}
	
}
