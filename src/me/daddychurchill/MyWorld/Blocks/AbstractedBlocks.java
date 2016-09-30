package me.daddychurchill.MyWorld.Blocks;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.material.MaterialData;

import me.daddychurchill.MyWorld.CoreGenerator;

public abstract class AbstractedBlocks {

	protected CoreGenerator generator;
	protected int chunkX;
	protected int chunkZ;
	protected Random random;
	
	public static int Width = 16;
	
	public AbstractedBlocks(CoreGenerator generator, Random random, int chunkX, int chunkZ) {
		this.generator = generator;
		this.chunkX = chunkX;
		this.chunkZ = chunkZ;
		this.random = random;
	}
	
	public CoreGenerator getGenerator() {
		return generator;
	}
	
	public int getChunkX() {
		return chunkX;
	}

	public int getChunkZ() {
		return chunkZ;
	}
	
	public Random getRandom() {
		return random;
	}

	public Location getBlockWorldLocation(int x, int y, int z) {
		return new Location(generator.getWorld(), chunkX * Width + x, y, chunkZ * Width + z);
	}
	
	// simple 
	public abstract MaterialData getBlock(int x, int y, int z);
	public abstract void setBlock(int x, int y, int z, MaterialData data);
	public abstract void setBlocks(int x1, int x2, int y1, int y2, int z1, int z2, MaterialData data);
	
	// layers
	public void setBlocks(int y, MaterialData data) {
		setBlocks(0, 16, y, y + 1, 0, 16, data);
	}
	public void setBlocks(int y1, int y2, MaterialData data) {
		setBlocks(0, 16, y1, y2, 0, 16, data);
	}
	
	// columns 
	public void setBlocks(int x, int y1, int y2, int z, MaterialData data) {
		setBlocks(x, x + 1, y1, y2, z, z + 1, data);
	}
	
	// slices
	public void setBlocks(int x1, int x2, int y, int z1, int z2, MaterialData data) {
		setBlocks(x1, x2, y, y + 1, z1, z2, data);
	}

	// biome support
	public abstract Biome getBiome(int x, int z);
	public abstract void setBiome(int x, int z, Biome biome);
	public void setBiome(Biome biome) {
		for (int x = 0; x < 16; x++)
			for (int z = 0; z < 16; z++)
				setBiome(x, z, biome);
	}
}
