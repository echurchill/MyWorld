package me.daddychurchill.XWorld.Blocks;

import org.bukkit.material.MaterialData;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Support.Odds;
import me.daddychurchill.XWorld.Things.RealMaterial;

public abstract class AbstractedBlocks {

	private CoreGenerator generator;
	
	public AbstractedBlocks(CoreGenerator generator) {
		this.generator = generator;
	}
	
	public abstract Odds getOdds();
	public abstract int getSizeX();
	public abstract int getSizeY();
	public abstract int getSizeZ();

	public CoreGenerator getGenerator() {
		return generator;
	}
	
	// sub-classes need to implement these two
	public abstract MaterialData getBlock(int x, int y, int z);
	public abstract void setBlock(int x, int y, int z, MaterialData data);

	// default implementation, certain sub-classes implement this differently
	public void setBlocks(int x1, int x2, int y1, int y2, int z1, int z2, MaterialData data) {
		for (int x = x1; x < x2; x++) {
			for (int z = z1; z < z2; z++) {
				for (int y = y1; y < y2; y++) {
					setBlock(x, y, z, data);
				}
			}
		}
	}

	// default implementation, certain sub-classes implement this differently
	public boolean isEmpty(int x, int y, int z) {
		return isType(x, y, z, RealMaterial.AIR);
	}
	
	public boolean isEmpty(int x1, int x2, int y, int z1, int z2) {
		for (int x = x1; x < x2; x++)
			for (int z = z1; z < z2; z++)
				if (!isEmpty(x, y, z))
					return false;
		return true;
	}
	
	public boolean isEmpty(int x1, int x2, int y1, int y2, int z1, int z2) {
		for (int x = x1; x < x2; x++)
			for (int y = y1; y < y2; y++)
				for (int z = z1; z < z2; z++)
					if (!isEmpty(x, y, z))
						return false;
		return true;
	}
	
	public boolean isType(int x, int y, int z, MaterialData data) {
		return getBlock(x, y, z).equals(data);
	}
	
	public boolean isTypes(int x, int y, int z, MaterialData ... datas) {
		MaterialData there = getBlock(x, y, z);
		for (MaterialData data : datas) {
			if (there.equals(data))
				return true;
		}
		return false;
	}
	
	// layers
	public void setBlocks(int y, MaterialData data) {
		setBlocks(0, getSizeX(), y, y + 1, 0, getSizeZ(), data);
	}
	
	public void setBlocks(int y1, int y2, MaterialData data) {
		setBlocks(0, getSizeX(), y1, y2, 0, getSizeZ(), data);
	}

	// columns 
	public void setBlocks(int x, int y1, int y2, int z, MaterialData data) {
		setBlocks(x, x + 1, y1, y2, z, z + 1, data);
	}
	
	// slices
	public void setBlocks(int x1, int x2, int y, int z1, int z2, MaterialData data) {
		setBlocks(x1, x2, y, y + 1, z1, z2, data);
	}

	// walls
	public void setWalls(int x1, int x2, int y, int z1, int z2, MaterialData data) {
		setWalls(x1, x2, y, y + 1, z1, z2, data);
	}
	public void setWalls(int x1, int x2, int y1, int y2, int z1, int z2, MaterialData data) {
		setBlocks(x1, x2, y1, y2, z1, z1 + 1, data);
		setBlocks(x1, x2, y1, y2, z2 - 1, z2, data);
		setBlocks(x1, x1 + 1, y1, y2, z1 + 1, z2 - 1, data);
		setBlocks(x2 - 1, x2, y1, y2, z1 + 1, z2 - 1, data);
	}
	
	// emptying
	public void emptyBlock(int x, int y, int z) {
		setBlock(x, y, z, RealMaterial.AIR);
	}
	
	public void emptyBlocks(int x, int y1, int y2, int z) {
		setBlocks(x, y1, y2, z, RealMaterial.AIR);
	}
	
	public void emptyBlocks(int x1, int x2, int y, int z1, int z2) {
		setBlocks(x1, x2, y, z1, z2, RealMaterial.AIR);
	}

	public void emptyBlocks(int x1, int x2, int y1, int y2, int z1, int z2) {
		setBlocks(x1, x2, y1, y2, z1, z2, RealMaterial.AIR);
	}
	
	public void emptyBlocks(int y) {
		setBlocks(y, RealMaterial.AIR);
	}
	
	public void emptyBlocks(int y1, int y2) {
		setBlocks(y1, y2, RealMaterial.AIR);
	}
	
	// foundations
	public void setBlocksBelow(int x, int y, int z, MaterialData data) {
		for (int b = y - 1; y >= 0; y--)
			if (isEmpty(x, b, z))
				setBlock(x, b, z, data);
	}
	
	public void setBlocksBelow(int x1, int x2, int y, int z1, int z2, MaterialData data) {
		for (int x = x1; x < x2; x++)
			for (int z = z1; z < z2; z++)
				setBlocksBelow(x, y, z, data);
	}
}
