package me.daddychurchill.XWorld.Blocks;

import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.type.Snow;
import org.bukkit.generator.ChunkGenerator.BiomeGrid;
import org.bukkit.generator.ChunkGenerator.ChunkData;
import org.bukkit.util.noise.NoiseGenerator;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Support.Odds;

public class InitializeChunk extends AbstractedChunk {

	private ChunkData bukkitChunkData;
	private BiomeGrid bukkitBiomeData;

	public InitializeChunk(CoreGenerator generator, ChunkData bukkitChunkData, BiomeGrid bukkitBiomeData, Odds odds,
			int chunkX, int chunkZ) {
		super(generator, odds, chunkX, chunkZ);

		this.bukkitChunkData = bukkitChunkData;
		this.bukkitBiomeData = bukkitBiomeData;
	}

	public ChunkData getRawData() {
		return bukkitChunkData;
	}

	@Override
	public Material getBlock(int x, int y, int z) {
		return bukkitChunkData.getType(x, y, z);
	}

	@Override
	public void setBlock(int x, int y, int z, Material material) {
		bukkitChunkData.setBlock(x, y, z, material);
	}

	@Override
	public void setBlocks(int x1, int x2, int y1, int y2, int z1, int z2, Material material) {
		bukkitChunkData.setRegion(x1, y1, z1, x2, y2, z2, material);
	}

	@Override
	public boolean isEmpty(int x, int y, int z) {
		return bukkitChunkData.getType(x, y, z) == Material.AIR;
	}

	@Override
	public Biome getBiome(int x, int z) {
		return bukkitBiomeData.getBiome(x, z);
	}

	@Override
	public void setBiome(int x, int z, Biome biome) {
		bukkitBiomeData.setBiome(x, z, biome);
	}

	public void setSnow(int x, int y, int z, double level) {
		bukkitChunkData.setBlock(x, y, z, Material.SNOW);
		BlockData data = bukkitChunkData.getBlockData(x, y, z);
		if (data instanceof Snow) {
			Snow snow = (Snow) data;
			snow.setLayers(NoiseGenerator.floor((level - Math.floor(level)) * 8.0) + 1);
			bukkitChunkData.setBlock(x, y, z, snow);
		}
	}
}
