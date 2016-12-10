package me.daddychurchill.XWorld.Worlds.DiscWorld;

import me.daddychurchill.XWorld.Blocks.InitializeChunk;
import me.daddychurchill.XWorld.Things.RealMaterial;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;
import me.daddychurchill.XWorld.Worlds.Standard.NaturalTerrainInitializer;

public class DiscWorldTerrainInitializer extends NaturalTerrainInitializer {
	
	private int discTop;
	private static int discTopPlus = 24;

	public DiscWorldTerrainInitializer(DiscWorldShape shape) {
		super(shape);
		
		discTop = shape.getDiscTop();
	}
	
	@Override
	protected void renderHere(AbstractWorld world, InitializeChunk chunk, int x, int y, int z, 
			int topsoilThickness, int seaLevel) {
		
		if (y >= discTop)
			chunk.setBlocks(x, 1, y + discTopPlus, z, RealMaterial.SMOOTH_BRICK_CRACKED);
		else
			super.renderHere(world, chunk, x, y, z, topsoilThickness, seaLevel);
	}
}
