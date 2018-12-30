package me.daddychurchill.XWorld.Schemas;

import org.bukkit.Material;

import me.daddychurchill.XWorld.Blocks.PasteableBlocks;
import me.daddychurchill.XWorld.Generators.CoreGenerator;

public abstract class AllocatedSchema extends PasteableBlocks {

	private int sizeX;
	private int sizeY;
	private int sizeZ;
	private Material[][][] arrayOfData;

	public AllocatedSchema(CoreGenerator generator, int sizeX, int sizeY, int sizeZ) {
		super(generator);

		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.sizeZ = sizeZ;
		arrayOfData = new Material[sizeX][sizeY][sizeZ];
		for (int x = 0; x < sizeX; x++)
			for (int y = 0; y < sizeY; y++)
				for (int z = 0; z < sizeZ; z++)
					arrayOfData[x][y][z] = null;

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

	protected Material[][][] getData() {
		return arrayOfData;
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
	public Material getBlock(int x, int y, int z) {
		x = clamp(x, sizeX);
		y = clamp(y, sizeY);
		z = clamp(z, sizeZ);
		return arrayOfData[x][y][z];
	}

	@Override
	public void setBlock(int x, int y, int z, Material data) {
		x = clamp(x, sizeX);
		y = clamp(y, sizeY);
		z = clamp(z, sizeZ);
		arrayOfData[x][y][z] = data;
	}

	@Override
	public void setBlocks(int x1, int x2, int y1, int y2, int z1, int z2, Material data) {
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
	public boolean isEmpty(int x, int y, int z) {
		// TODO Auto-generated method stub
		return false;
	}

}
