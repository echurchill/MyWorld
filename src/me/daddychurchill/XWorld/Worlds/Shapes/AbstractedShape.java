package me.daddychurchill.XWorld.Worlds.Shapes;

import org.bukkit.util.noise.NoiseGenerator;

import me.daddychurchill.XWorld.Blocks.AbstractedChunk;

public abstract class AbstractedShape {

	public abstract int getSeabedLevel();
	public abstract int getMiddleThickness();
	public abstract int getSeaLevel();
	public abstract int getSnowLevel();

	public abstract double getSurfaceYOnWorld(double x, double z);
	
	public int getSurfaceY(AbstractedChunk chunk, int x, int z) {
		return NoiseGenerator.floor(getSurfaceYOnWorld(chunk.getBlockWorldX(x), chunk.getBlockWorldZ(z)));
	}

}
