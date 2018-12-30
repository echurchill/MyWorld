package me.daddychurchill.XWorld.Schemas;

import org.bukkit.Material;

import me.daddychurchill.XWorld.Blocks.PasteableBlocks;
import me.daddychurchill.XWorld.Generators.CoreGenerator;

public class MinecraftSchema extends PasteableBlocks {

	public MinecraftSchema(CoreGenerator generator, String URI) {
		super(generator);
		assert (false); // TODO: I need to actually implement this!
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
	public Material getBlock(int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBlock(int x, int y, int z, Material data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBlocks(int x1, int x2, int y1, int y2, int z1, int z2, Material data) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEmpty(int x, int y, int z) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setBlocks(int y, Material data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBlocks(int y1, int y2, Material data) {
		// TODO Auto-generated method stub

	}
}
