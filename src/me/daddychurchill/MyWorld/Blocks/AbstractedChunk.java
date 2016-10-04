package me.daddychurchill.MyWorld.Blocks;

import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.material.MaterialData;

import me.daddychurchill.MyWorld.Generators.CoreGenerator;
import me.daddychurchill.MyWorld.Support.Odds;

public abstract class AbstractedChunk extends AbstractedBlocks {

	public final static int Width = 16;
	public final static int Height = 256;
	
	protected int chunkX;
	protected int chunkZ;

	public AbstractedChunk(CoreGenerator generator, Odds odds, int chunkX, int chunkZ) {
		super(generator, odds);

		this.chunkX = chunkX;
		this.chunkZ = chunkZ;
	}

	public int getChunkX() {
		return chunkX;
	}

	public int getChunkZ() {
		return chunkZ;
	}
	
	public Location getBlockWorldLocation(int x, int y, int z) {
		return new Location(generator.getWorld(), chunkX * Width + x, y, chunkZ * Width + z);
	}
	
	@Override
	public void setBlocks(int y, MaterialData data) {
		setBlocks(0, Width, y, y + 1, 0, Width, data);
	}
	@Override
	public void setBlocks(int y1, int y2, MaterialData data) {
		setBlocks(0, Width, y1, y2, 0, Width, data);
	}
	
	@Override
	public void setBiome(Biome biome) {
		for (int x = 0; x < 16; x++)
			for (int z = 0; z < 16; z++)
				setBiome(x, z, biome);
	}
}
