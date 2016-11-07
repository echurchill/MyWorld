package me.daddychurchill.XWorld.Worlds;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.World;

import me.daddychurchill.XWorld.Blocks.AbstractedChunk;
import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Blocks.InitializeChunk;

public abstract class AbstractWorld {

	public abstract void renderHere(InitializeChunk chunk);
	public abstract void renderHere(FinalizeChunk chunk);
	
	public abstract int getSurfaceY(AbstractedChunk chunk, int x, int z);
	
	public int getBuildY(AbstractedChunk chunk, int x, int z) {
		return getSurfaceY(chunk, x, z) + 1;
	}
	
	public Location fixSpawnLocation(World world, Random random, Location location) {
		return location;
	}
}
