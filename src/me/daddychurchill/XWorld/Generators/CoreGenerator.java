package me.daddychurchill.XWorld.Generators;


import java.util.ArrayList;
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
import me.daddychurchill.XWorld.Worlds.NaturalWorld;
import me.daddychurchill.XWorld.Worlds.TreesOnlyWorld;

public class CoreGenerator extends ChunkGenerator {

	private XWorld plugin;
	private String worldname;
	private String worldstyle;
	private AbstractedWorld worldmaker;
	private Config config;
	private World world;
	private BlockCallback blockCallback;
	private List<AbstractedInitializer> initializers;
	private List<AbstractedPopulator> populators;

	public CoreGenerator(XWorld plugin, String name, String style){
		super();
		initializers = new ArrayList<AbstractedInitializer>();
		populators = new ArrayList<AbstractedPopulator>();
		
		this.plugin = plugin;
		this.config = new Config(this);
		this.worldname = name;
		this.worldstyle = style;

		addDefaultWorldType("Nature", new NaturalWorld());
		addWorldType("TreesOnly", new TreesOnlyWorld());
	}
	
	@Override
	public List<BlockPopulator> getDefaultPopulators(World world) {
		this.world = world;
		worldmaker = findWorldType(worldstyle);
		worldmaker.initializeGenerator(this);

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
	
	public void addInitializer(AbstractedInitializer initializer) {
		initializers.add(initializer);
	}

	public void addPopulator(AbstractedPopulator populator) {
		populators.add(populator);
	}

	@Override
	public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome) {
		try {

			// place to work
			InitializeChunk chunk = new InitializeChunk(this, this.createChunkData(world), biome, new Odds(random), x, z);
			
			// see who wants to initialize it?
			for (AbstractedInitializer generator : initializers) {
				if (generator.isHere(chunk))
					generator.renderHere(chunk);
			}
		
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
			
			// see who wants to populate it?
			for (AbstractedPopulator generator : populators) {
				if (generator.isHere(chunk))
					generator.renderHere(chunk);
			}
		
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

	private Map<String, AbstractedWorld> worldTypes;
	private AbstractedWorld defaultWorld;
	
	private void addDefaultWorldType(String id, AbstractedWorld worldType) {
		addWorldType(id, worldType);
		defaultWorld = worldType;
	}
	
	private void addWorldType(String id, AbstractedWorld worldType) {
		if (worldTypes == null) {
			worldTypes = new HashMap<String, AbstractedWorld>();
			defaultWorld = worldType;
		}
		worldTypes.put(id, worldType);
	}
	
	private AbstractedWorld findWorldType(String id) {
		AbstractedWorld worldType = null;
		if (worldTypes != null)
			worldType = worldTypes.get(id);
		if (worldType == null)
			worldType = defaultWorld;
		return worldType;
	}
}
