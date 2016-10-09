package me.daddychurchill.MyWorld.Initializers;

import me.daddychurchill.MyWorld.Blocks.AbstractedChunk;
import me.daddychurchill.MyWorld.Blocks.InitializeChunk;
import me.daddychurchill.MyWorld.Generators.AbstractedInitializer;
import me.daddychurchill.MyWorld.Generators.CoreGenerator;
import me.daddychurchill.MyWorld.Things.RealMaterial;

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
