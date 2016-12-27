package me.daddychurchill.XWorld.Reusable.Shapes;

import me.daddychurchill.XWorld.Blocks.AbstractedChunk;

public class FlatGroundShape extends AbstractedShape {

	private int groundLevel;
	
	public FlatGroundShape(int groundLevel) {
		this.groundLevel = groundLevel;
	}

	@Override
	public int getSeabedLevel() {
		return groundLevel;
	}

	@Override
	public int getMiddleThickness() {
		return 1;
	}

	@Override
	public int getSeaLevel() {
		return groundLevel;
	}
	
	@Override
	public int getSnowLevel() {
		return (AbstractedChunk.Height - groundLevel) / 2 + groundLevel;
	}

	@Override
	public double getSurfaceYOnWorld(double x, double z) {
		return groundLevel;
	}
	
	@Override
	public double getSurfaceNoiseOnWorld(double x, double z) {
		return 0;
	}
	
	@Override
	public int getSurfaceY(AbstractedChunk chunk, int x, int z) {
		return groundLevel; // faster than letting the default implementation handle this
	}

}
