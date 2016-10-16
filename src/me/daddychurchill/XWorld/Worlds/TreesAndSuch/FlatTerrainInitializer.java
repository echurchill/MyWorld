package me.daddychurchill.XWorld.Worlds.TreesAndSuch;

import me.daddychurchill.XWorld.Blocks.InitializeChunk;
import me.daddychurchill.XWorld.Generators.AbstractedInitializer;
import me.daddychurchill.XWorld.Things.RealMaterial;

public class FlatTerrainInitializer implements AbstractedInitializer {

	public FlatTerrainInitializer() {

	}

	@Override
	public void renderHere(InitializeChunk chunk) {
		int y1 = chunk.getGenerator().getConfig().getStreetLevel();
		chunk.setBlocks(0, RealMaterial.BEDROCK);
		chunk.setBlocks(1, y1 - 1, RealMaterial.DIRT);
		chunk.setBlocks(y1 - 1, RealMaterial.GRASS);
	}

	@Override
	public boolean isHere(InitializeChunk chunk) {
		return true;
	}

}
