package me.daddychurchill.MyWorld.Populators;

import me.daddychurchill.MyWorld.Blocks.AbstractedBlocks;
import me.daddychurchill.MyWorld.Blocks.FinalizeBlocks;
import me.daddychurchill.MyWorld.Generators.AbstractedPopulator;
import me.daddychurchill.MyWorld.Things.RealMaterial;

public class WoodenFencePopulator extends AbstractedPopulator {

	public WoodenFencePopulator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void renderHere(FinalizeBlocks blocks) {
		int y1 = blocks.getGenerator().getConfig().getStreetLevel();
		blocks.setWallBlocks(1, 14, y1, 1, 14, RealMaterial.FENCE);
	}

	@Override
	public boolean isHere(AbstractedBlocks blocks) {
		return (blocks.getChunkX() % 5 == 0 || blocks.getChunkZ() % 5 == 0);

	}

}
