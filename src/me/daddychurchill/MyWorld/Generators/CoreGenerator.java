package me.daddychurchill.MyWorld.Generators;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;

import me.daddychurchill.MyWorld.Config;
import me.daddychurchill.MyWorld.MyWorld;
import me.daddychurchill.MyWorld.Blocks.FinalizeChunk;
import me.daddychurchill.MyWorld.Blocks.InitializeChunk;
import me.daddychurchill.MyWorld.Support.Odds;

public class CoreGenerator extends ChunkGenerator {

	private MyWorld plugin;
	private Config config;
	private World world;
	private BlockCallback blockCallback;
	private List<AbstractedInitializer> initializers;
	private List<AbstractedPopulator> populators;
	
	public CoreGenerator(MyWorld plugin, Config config){
		super();
		initializers = new ArrayList<AbstractedInitializer>();
		populators = new ArrayList<AbstractedPopulator>();
		
		this.plugin = plugin;
		this.config = config;
		this.config.getWorldMaker().initializeGenerator(this);
	}
	
	@Override
	public List<BlockPopulator> getDefaultPopulators(World world) {
		this.world = world;
		blockCallback = new BlockCallback(this);
		return Arrays.asList((BlockPopulator) blockCallback);
	}
	
	public MyWorld getPlugin() {
		return plugin;
	}

	public World getWorld() {
		return world;
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
}
