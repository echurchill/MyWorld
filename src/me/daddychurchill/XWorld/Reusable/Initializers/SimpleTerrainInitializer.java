package me.daddychurchill.XWorld.Reusable.Initializers;

import me.daddychurchill.XWorld.Blocks.InitializeChunk;
import me.daddychurchill.XWorld.Generators.AbstractInitializer;
import me.daddychurchill.XWorld.Things.RealMaterial;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public class SimpleTerrainInitializer extends AbstractInitializer {

	public SimpleTerrainInitializer() {

	}

	@Override
	public void renderHere(AbstractWorld world, InitializeChunk chunk) {
		int level = world.getSurfaceY(chunk, 0, 0);
		assert(level > 0);
		if (level > 0) 
			chunk.setBlocks(0, RealMaterial.BEDROCK);
		if (level > 1) 
			chunk.setBlocks(level - 1, RealMaterial.GRASS);
		if (level > 2) 
			chunk.setBlocks(1, level - 1, RealMaterial.DIRT);
		// need to figure out how to introduce stones into this
		// need to add rocks and boulders poking out of the ground
	}

	@Override
	public boolean isHere(AbstractWorld world, InitializeChunk chunk) {
		return true;
	}
}
