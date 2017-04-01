package me.daddychurchill.XWorld.Worlds.DiscWorld;

import me.daddychurchill.XWorld.Blocks.InitializeChunk;
import me.daddychurchill.XWorld.Reusable.Initializers.NaturalTerrainInitializer;
import me.daddychurchill.XWorld.Things.RealMaterial;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public class DiscWorldTerrainInitializer extends NaturalTerrainInitializer {
	
	public DiscWorldTerrainInitializer(DiscWorldShape shape) {
		super(shape);

	}
	
	@Override
	protected void renderHere(AbstractWorld world, InitializeChunk chunk, int x, int y, int z, 
			int topsoilThickness, int seaLevel) {
		
		if (y >= worldShape.getSnowLevel()) {
			super.renderHere(world, chunk, x, y - 1, z, 0, seaLevel);
			chunk.setBlock(x, y - 1, z, RealMaterial.SNOW_BLOCK);
			double doubleY = worldShape.getSurfaceNoiseOnWorld(x, z);
//			chunk.setBlock(x, y, z, RealMaterial.GLOWSTONE);
			chunk.setBlock(x, y, z, RealMaterial.microSnow(doubleY));
//			chunk.setBlocks(x, y - 8, y, z, RealMaterial.ENDER_STONE);
		} else
			super.renderHere(world, chunk, x, y, z, topsoilThickness, seaLevel);
	}
}
