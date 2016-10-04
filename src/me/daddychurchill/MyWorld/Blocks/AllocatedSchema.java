package me.daddychurchill.MyWorld.Blocks;

import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.material.MaterialData;

import me.daddychurchill.MyWorld.Generators.CoreGenerator;
import me.daddychurchill.MyWorld.Support.Odds;

public abstract class AllocatedSchema extends AbstractedSchema {

	private int sizeX;
	private int sizeY;
	private int sizeZ;
	private MaterialData[][][] arrayOfData;

	public AllocatedSchema(CoreGenerator generator, Odds odds, int sizeX, int sizeY, int sizeZ) {
		super(generator, odds);

		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.sizeZ = sizeZ;
		arrayOfData = new MaterialData[sizeX][sizeY][sizeZ];
		for (int x = 0; x < sizeX; x++)
			for (int y = 0; y < sizeY; y++)
				for (int z = 0; z < sizeZ; z++)
					arrayOfData[x][y][z] = new MaterialData(Material.AIR);
	}
	
	@Override
	public int getSizeX() {
		return sizeX;
	}
	
	@Override
	public int getSizeY() {
		return sizeY;
	}
	
	@Override
	public int getSizeZ() {
		return sizeZ;
	}
	
	protected MaterialData[][][] getData() {
		return arrayOfData;
	}
	
	@Override
	public Biome getBiome(int x, int z) {
		return Biome.PLAINS;
	}
	
	protected int clamp(int i, int max) {
		if (i < 0)
			return 0;
		else if (i > max - 1)
			return max - 1;
		else
			return i;
	}
	
	@Override
	public MaterialData getBlock(int x, int y, int z) {
		x = clamp(x, sizeX);
		y = clamp(y, sizeY);
		z = clamp(z, sizeZ);
		return arrayOfData[x][y][z];
	}
	
	@Override
	public void setBiome(int x, int z, Biome biome) {
		// schemas don't support biomes
	}
	
	@Override
	public void setBiome(Biome biome) {
		// schemas don't support biomes
	}
	
	@Override
	public void setBlock(int x, int y, int z, MaterialData data) {
		x = clamp(x, sizeX);
		y = clamp(y, sizeY);
		z = clamp(z, sizeZ);
		arrayOfData[x][y][z] = data;
	}
	
	@Override
	public void setBlocks(int x1, int x2, int y1, int y2, int z1, int z2, MaterialData data) {
		x1 = clamp(x1, sizeX);
		y1 = clamp(y1, sizeY);
		z1 = clamp(z1, sizeZ);
		x2 = clamp(x2, sizeX);
		y2 = clamp(y2, sizeY);
		z2 = clamp(z2, sizeZ);
		for (int x = x1; x < x2; x++)
			for (int y = y1; y < y2; y++)
				for (int z = z1; z < z2; z++)
					arrayOfData[x][y][z] = data;
	}
	
	@Override
	public void setBlocks(int y, MaterialData data) {
		setBlocks(0, sizeX, y, y + 1, 0, sizeZ, data);
	}
	
	@Override
	public void setBlocks(int y1, int y2, MaterialData data) {
		setBlocks(0, sizeX, y1, y2, 0, sizeZ, data);
	}
	
	@Override
	public boolean isEmpty(int x, int y, int z) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
