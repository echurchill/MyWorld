package me.daddychurchill.MyWorld.Initializers;

import me.daddychurchill.MyWorld.Blocks.AbstractedBlocks;
import me.daddychurchill.MyWorld.Blocks.InitializeBlocks;
import me.daddychurchill.MyWorld.Generators.AbstractedInitializer;
import me.daddychurchill.MyWorld.Things.RealMaterial;

public class FlatTerrainInitializer extends AbstractedInitializer {

	public FlatTerrainInitializer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void renderHere(InitializeBlocks blocks) {
		int y1 = blocks.getGenerator().getConfig().getStreetLevel();
		blocks.setBlocks(0, RealMaterial.BEDROCK);
		blocks.setBlocks(1, y1 - 1, RealMaterial.DIRT);
		blocks.setBlocks(y1 - 1, RealMaterial.GRASS);
	}

	@Override
	public boolean isHere(AbstractedBlocks blocks) {
		return true;
	}

}
