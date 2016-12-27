package me.daddychurchill.XWorld.Worlds.DiscWorld;

import me.daddychurchill.XWorld.Blocks.InitializeChunk;
import me.daddychurchill.XWorld.Things.RealMaterial;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;
import me.daddychurchill.XWorld.Worlds.Standard.NaturalTerrainInitializer;

public class DiscWorldTerrainInitializer extends NaturalTerrainInitializer {
	
	private int discTop;

	public DiscWorldTerrainInitializer(DiscWorldShape shape) {
		super(shape);
		
		discTop = shape.getDiscTop();
	}
	
	@Override
	protected void renderHere(AbstractWorld world, InitializeChunk chunk, int x, int y, int z, 
			int topsoilThickness, int seaLevel) {
		
//		chunk.setBlock(x, 0, z, RealMaterial.BEDROCK);
//		chunk.setBlocks(x, 1, y, z, RealMaterial.SMOOTH_BRICK_CRACKED);
		
		if (y >= discTop - 8) {
			super.renderHere(world, chunk, x, y - 1, z, 0, seaLevel);
			chunk.setBlock(x, y - 1, z, RealMaterial.SNOW_BLOCK);
			double doubleY = worldShape.getSurfaceNoiseOnWorld(x, z);
			chunk.setBlock(x, y, z, RealMaterial.realSnow(doubleY));
//			chunk.setBlocks(x, y - 8, y, z, RealMaterial.ENDER_STONE);
		} else
			super.renderHere(world, chunk, x, y, z, topsoilThickness, seaLevel);
	}
}