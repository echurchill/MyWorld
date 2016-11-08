package me.daddychurchill.XWorld.Worlds.RingWorld;

import me.daddychurchill.XWorld.Blocks.InitializeChunk;
import me.daddychurchill.XWorld.Things.RealMaterial;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;
import me.daddychurchill.XWorld.Worlds.Standard.NaturalTerrainInitializer;

public class RingWorldTerrainInitializer extends NaturalTerrainInitializer {
	
	private int ringTop;
	private static int ringTopWith = 24;

	public RingWorldTerrainInitializer(RingWorldShape shape) {
		super(shape);
		
		ringTop = shape.getRingTop();
	}
	
	@Override
	protected void renderHere(AbstractWorld world, InitializeChunk chunk, int x, int y, int z, 
			int topsoilThickness, int seaLevel) {
		
		if (y >= ringTop)
			chunk.setBlocks(x, 1, y + ringTopWith, z, RealMaterial.SMOOTH_BRICK_CRACKED);
		else
			super.renderHere(world, chunk, x, y, z, topsoilThickness, seaLevel);
	}
}
