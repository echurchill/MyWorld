package me.daddychurchill.XWorld.Blocks;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.material.MaterialData;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Support.Odds;

public class RestorableBlocks extends AbstractedBlocks {

	private List<StoredBlock> oldBlocks;
	private AbstractedChunk oldChunk;
	
	//TODO: Do not call this puppy
	@Deprecated 
	public RestorableBlocks(CoreGenerator generator) {
		super(generator);
	}

	public RestorableBlocks(AbstractedChunk chunk) {
		super(chunk.getGenerator());
		oldChunk = chunk;
		oldBlocks = new ArrayList<StoredBlock>();
	}

	private static class StoredBlock {
		private int oldX;
		private int oldY;
		private int oldZ;
		private MaterialData oldData;
		
		public StoredBlock(int x, int y, int z, MaterialData data) {
			oldX = x;
			oldY = y;
			oldZ = z;
			oldData = data;
		}
		
		public void restoreBlock(AbstractedChunk chunk) {
//			chunk.setBlock(oldX, oldY, oldZ, RealMaterial.GLOWSTONE);
			chunk.setBlock(oldX, oldY, oldZ, oldData);
		}
	}
	
	@Override
	public MaterialData getBlock(int x, int y, int z) {
		return oldChunk.getBlock(x, y, z);
	}
	
	@Override
	public void setBlock(int x, int y, int z, MaterialData data) {
		oldBlocks.add(new StoredBlock(x, y, z, oldChunk.getBlock(x, y, z)));
		oldChunk.setBlock(x, y, z, data);
	}
	
	public void restoreBlocks() {
		for (StoredBlock rollBackBlock : oldBlocks) {
			rollBackBlock.restoreBlock(oldChunk);
		}
		oldBlocks.clear();
	}

	@Override
	public Odds getOdds() {
		return oldChunk.getOdds();
	}

	@Override
	public int getSizeX() {
		return oldChunk.getSizeX();
	}

	@Override
	public int getSizeY() {
		return oldChunk.getSizeY();
	}

	@Override
	public int getSizeZ() {
		return oldChunk.getSizeZ();
	}
}
