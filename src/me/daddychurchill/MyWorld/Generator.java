package me.daddychurchill.MyWorld;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;

import me.daddychurchill.MyWorld.Support.FinalizeBlocks;
import me.daddychurchill.MyWorld.Support.InitializeBlocks;

public class Generator extends ChunkGenerator {

	private MyWorld plugin;
	public Config config;
	private BlockCallback blockCallback;
//	private Generator generators;
	
	public Generator(MyWorld plugin, Config config){
		super();
		this.plugin = plugin;
		this.config = config;
	}
	
	@Override
	public List<BlockPopulator> getDefaultPopulators(World world) {
		blockCallback = new BlockCallback(this);
		return Arrays.asList((BlockPopulator) blockCallback);
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

//			// who makes what?
//			if (generators == null)
//				generators = new Generator(world, config);
			
			// place to work
			InitializeBlocks initialBlocks = new InitializeBlocks(this, this.createChunkData(world), biome, random, x, z);
		
//			// figure out what everything looks like
//			PlatMap platmap = getPlatMap(x, z);
//			if (platmap != null) {
//				//CityWorld.reportMessage("generate X,Z = " + chunkX + "," + chunkZ);
//				platmap.generateChunk(initialBlocks, biome);
//			}
// OR
//			// figure out what everything looks like
//			generators.generate(byteChunk, random, chunkX, chunkZ);
			
			return initialBlocks.chunkData;
			
		} catch (Exception e) {
			reportException("Generator FAILED", e);
			return null;
		} 
	}
	
	public void populate(World world, Random random, Chunk source) {
		try {

		
	//		// who makes what?
	//		if (generators == null)
	//			generators = new Generator(world, config);
			
			// where are we?
			int chunkX = source.getX();
			int chunkZ = source.getZ();
			
			// place to work
			FinalizeBlocks populationBlocks = new FinalizeBlocks(this, random, source, chunkX, chunkZ);
			
	//		// figure out what everything looks like
	//		generators.populate(realChunk, random, chunkX, chunkZ);
		} catch (Exception e) {
			reportException("Populator FAILED", e);
		} 
	}

	private class BlockCallback extends BlockPopulator {

		private Generator chunkGen;
		
		public BlockCallback(Generator chunkGen){
			this.chunkGen = chunkGen;
		}
		
		@Override
		public void populate(World world, Random random, Chunk source) {
			chunkGen.populate(world, random, source);
		}
	}
}
