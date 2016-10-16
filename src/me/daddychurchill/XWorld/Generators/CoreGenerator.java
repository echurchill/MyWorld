package me.daddychurchill.XWorld.Generators;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;

import me.daddychurchill.XWorld.Config;
import me.daddychurchill.XWorld.XWorld;
import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Blocks.InitializeChunk;
import me.daddychurchill.XWorld.Support.Odds;
import me.daddychurchill.XWorld.Worlds.AbstractedWorld;
import me.daddychurchill.XWorld.Worlds.WorldFactory;
import me.daddychurchill.XWorld.Worlds.BigTree.BigTreeFactory;
import me.daddychurchill.XWorld.Worlds.SimpleNature.SimpleNatureFactory;
import me.daddychurchill.XWorld.Worlds.TreesAndSuch.TreesAndSuchFactory;

public class CoreGenerator extends ChunkGenerator {

	private XWorld plugin;
	private String worldname;
	private String worldstyle;
	private AbstractedWorld worldmaker;
	private Config config;
	private World world;
	private BlockCallback blockCallback;

	public CoreGenerator(XWorld plugin, String name, String style){
		super();
		
		this.plugin = plugin;
		this.config = new Config(this);
		this.worldname = name;
		this.worldstyle = style;

		addDefaultWorldType(new SimpleNatureFactory());
		addWorldType(new TreesAndSuchFactory());
		addWorldType(new BigTreeFactory());
	}
	
	@Override
	public List<BlockPopulator> getDefaultPopulators(World world) {
		this.world = world;
		worldmaker = findWorldType(worldstyle);

		blockCallback = new BlockCallback(this);
		return Arrays.asList((BlockPopulator) blockCallback);
	}
	
	public XWorld getPlugin() {
		return plugin;
	}

	public World getWorld() {
		return world;
	}

	public AbstractedWorld getWorldMaker() {
		return worldmaker;
	}

	public String getWorldname() {
		return worldname;
	}

	public String getWorldstyle() {
		return worldstyle;
	}
	
	public Config getConfig() {
		return config;
	}
	
	public void reportMessage(String message) {
		plugin.reportMessage(message);
	}

	public void reportMessage(String message1, String message2) {
		plugin.reportMessage(message1, message2);
	}
	
	public void reportFormatted(String format, Object ... objects) {
		plugin.reportMessage(String.format(format, objects));
	}

	public void reportException(String message, Exception e) {
		plugin.reportException(message, e);
	}
	
	@Override
	public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome) {
		try {

			// place to work
			InitializeChunk chunk = new InitializeChunk(this, this.createChunkData(world), biome, new Odds(random), x, z);
			
			// let the world maker do its thing
			worldmaker.renderHere(chunk);
		
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
			worldmaker.renderHere(chunk);
		
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

	private Map<String, WorldFactory> worldFactories;
	private WorldFactory defaultWorld;
	
	private void addDefaultWorldType(WorldFactory factory) {
		addWorldType(factory);
		defaultWorld = factory;
	}
	
	private void addWorldType(WorldFactory factory) {
		if (worldFactories == null) {
			worldFactories = new HashMap<String, WorldFactory>();
			defaultWorld = factory;
		}
		
		// this style shouldn't be already here!
		assert(!worldFactories.containsKey(factory.getStyle()));
		worldFactories.put(factory.getStyle(), factory);
	}
	
	private AbstractedWorld findWorldType(String id) {
		WorldFactory worldFactory = null;
		if (worldFactories != null)
			worldFactory = worldFactories.get(id);
		if (worldFactory == null)
			worldFactory = defaultWorld;
		
		// better have found something!
		assert(worldFactory != null);
		return worldFactory.getWorld(this);
	}
}
