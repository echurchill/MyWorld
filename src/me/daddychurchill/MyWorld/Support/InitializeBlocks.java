package me.daddychurchill.MyWorld.Support;

import java.util.Random;

import org.bukkit.block.Biome;
import org.bukkit.generator.ChunkGenerator.BiomeGrid;
import org.bukkit.generator.ChunkGenerator.ChunkData;
import org.bukkit.material.MaterialData;

import me.daddychurchill.MyWorld.Generator;

public class InitializeBlocks extends AbstractedBlocks {

	public ChunkData chunkData;
	public BiomeGrid biomeData;
	
	public InitializeBlocks(Generator generator, ChunkData chunk, BiomeGrid biome, Random random, int chunkX, int chunkZ) {
		super(generator, random, chunkX, chunkZ);
		
		this.chunkData = chunk;
		this.biomeData = biome;
	}

	@Override
	public MaterialData getBlock(int x, int y, int z) {
		return chunkData.getTypeAndData(x, y, z);
	}

	@Override
	public void setBlock(int x, int y, int z, MaterialData data) {
		chunkData.setBlock(x, y, z, data);
	}

	@Override
	public void setBlocks(int x1, int x2, int y1, int y2, int z1, int z2, MaterialData data) {
		chunkData.setRegion(x1, y1, z1, x2, y2, z2, data);
	}

	@Override
	public Biome getBiome(int x, int z) {
		return biomeData.getBiome(x, z);
	}

	@Override
	public void setBiome(int x, int z, Biome biome) {
		biomeData.setBiome(x, z, biome);
	}
}
