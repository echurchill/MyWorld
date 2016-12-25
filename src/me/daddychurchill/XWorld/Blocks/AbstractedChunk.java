package me.daddychurchill.XWorld.Blocks;

import org.bukkit.Location;
import org.bukkit.block.Biome;
import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Support.Odds;

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
	
	public int getBlockWorldX(int x) {
		return chunkX * 16 + x;
	}

	public int getBlockWorldZ(int z) {
		return chunkZ * 16 + z;
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
	
	public Location getBlockWorldLocation(int x, int y, int z) {
		return new Location(getGenerator().getWorld(), chunkX * Width + x, y, chunkZ * Width + z);
	}
	
	// biome support
	public void setBiome(Biome biome) {
		for (int x = 0; x < Width; x++)
			for (int z = 0; z < Width; z++)
				setBiome(x, z, biome);
	}

	public abstract Biome getBiome(int x, int z);
	public abstract void setBiome(int x, int z, Biome biome);
}
