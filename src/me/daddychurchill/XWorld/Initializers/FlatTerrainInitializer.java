package me.daddychurchill.XWorld.Initializers;

import me.daddychurchill.XWorld.Blocks.AbstractedChunk;
import me.daddychurchill.XWorld.Blocks.InitializeChunk;
import me.daddychurchill.XWorld.Generators.AbstractedInitializer;
import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Things.RealMaterial;

public class FlatTerrainInitializer extends AbstractedInitializer {

	public FlatTerrainInitializer(CoreGenerator generator) {
		super(generator);
	}

	@Override
	public void renderHere(InitializeChunk blocks) {
		int y1 = blocks.getGenerator().getConfig().getStreetLevel();
		blocks.setBlocks(0, RealMaterial.BEDROCK);
		blocks.setBlocks(1, y1 - 1, RealMaterial.DIRT);
		blocks.setBlocks(y1 - 1, RealMaterial.GRASS);
	}

	@Override
	public boolean isHere(AbstractedChunk chunk) {
		return true;
	}

}
