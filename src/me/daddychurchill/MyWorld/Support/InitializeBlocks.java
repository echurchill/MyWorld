package me.daddychurchill.MyWorld.Support;

import java.util.Random;

import org.bukkit.generator.ChunkGenerator.BiomeGrid;
import org.bukkit.generator.ChunkGenerator.ChunkData;

import me.daddychurchill.MyWorld.Generator;

public class InitializeBlocks extends AbstractedBlocks {

	public ChunkData chunkData;
	public BiomeGrid biomeData;
	
	public InitializeBlocks(Generator generator, ChunkData chunk, BiomeGrid biome, Random random, int chunkX, int chunkZ) {
		super(generator, random, chunkX, chunkZ);
		
		this.chunkData = chunk;
	}

}
