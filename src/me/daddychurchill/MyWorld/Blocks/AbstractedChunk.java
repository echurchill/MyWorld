package me.daddychurchill.MyWorld.Blocks;

import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.material.MaterialData;

import me.daddychurchill.MyWorld.Generators.CoreGenerator;
import me.daddychurchill.MyWorld.Support.Odds;

public abstract class AbstractedChunk extends AbstractedBlocks {

	public final static int Width = 16;
	public final static int Height = 256;
	
	private Odds odds;
	private int chunkX;
	private int chunkZ;

	public AbstractedChunk(CoreGenerator generator, Odds odds, int chunkX, int chunkZ) {
		super(generator);

		this.odds = odds;
		this.chunkX = chunkX;
		this.chunkZ = chunkZ;
	}

	@Override
	public Odds getOdds() {
		return odds;
	}

	public int getChunkX() {
		return chunkX;
	}

	public int getChunkZ() {
		return chunkZ;
	}
	
	@Override
	public int getSizeX() {
		return Width;
	}
	
	@Override
	public int getSizeY() {
		return Height;
	}
	
	@Override
	public int getSizeZ() {
		return Width;
	}
	
	@Override
	public int getGroundY() {
		return getGenerator().getConfig().getStreetLevel();
	}
	
	public Location getBlockWorldLocation(int x, int y, int z) {
		return new Location(getGenerator().getWorld(), chunkX * Width + x, y, chunkZ * Width + z);
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
