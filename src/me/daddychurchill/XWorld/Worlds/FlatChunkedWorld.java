package me.daddychurchill.XWorld.Worlds;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.World;

import me.daddychurchill.XWorld.Blocks.AbstractedChunk;

public abstract class FlatChunkedWorld extends ChunkedWorld {

	public FlatChunkedWorld() {
		// TODO Auto-generated constructor stub
	}

	protected abstract int getTopY();

	@Override
	public int getSurfaceY(AbstractedChunk chunk, int x, int z) {
		return getTopY();
	}

	@Override
	public Location fixSpawnLocation(World world, Random random, Location location) {
		return new Location(world, location.getX(), getTopY(), location.getZ());
	}
}
