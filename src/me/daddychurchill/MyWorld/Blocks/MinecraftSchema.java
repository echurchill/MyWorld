package me.daddychurchill.MyWorld.Blocks;

import org.bukkit.block.Biome;
import org.bukkit.material.MaterialData;

import me.daddychurchill.MyWorld.Generators.CoreGenerator;

public class MinecraftSchema extends AbstractedSchema {

	public MinecraftSchema(CoreGenerator generator, String URI) {
		super(generator);
		assert(false); //TODO: I need to actually implement this!
	}

	@Override
	public int getSizeX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSizeY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSizeZ() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGroundY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MaterialData getBlock(int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBlock(int x, int y, int z, MaterialData data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBlocks(int x1, int x2, int y1, int y2, int z1, int z2, MaterialData data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty(int x, int y, int z) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setBlocks(int y, MaterialData data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBlocks(int y1, int y2, MaterialData data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Biome getBiome(int x, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBiome(int x, int z, Biome biome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBiome(Biome biome) {
		// TODO Auto-generated method stub
		
	}

}
