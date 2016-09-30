package me.daddychurchill.MyWorld.Populators;

import me.daddychurchill.MyWorld.Blocks.AbstractedBlocks;
import me.daddychurchill.MyWorld.Blocks.FinalizeBlocks;
import me.daddychurchill.MyWorld.Blocks.RealMaterial;
import me.daddychurchill.MyWorld.Generators.AbstractedPopulator;

public class SingleTreePopulator extends AbstractedPopulator {

	public SingleTreePopulator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void renderHere(FinalizeBlocks blocks) {
		int y1 = blocks.getConfig().getStreetLevel();
		int y2 = y1 + 6;
		blocks.setBlocks(7, 9, y1, y2, 7, 9, RealMaterial.LOG_BIRCH);
	}

	@Override
	public boolean isHere(AbstractedBlocks blocks) {
		return true;
	}

}
