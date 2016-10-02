package me.daddychurchill.MyWorld.Populators;
import me.daddychurchill.MyWorld.Blocks.AbstractedBlocks;
import me.daddychurchill.MyWorld.Blocks.FinalizeBlocks;
import me.daddychurchill.MyWorld.Generators.AbstractedPopulator;
import me.daddychurchill.MyWorld.Support.Odds;
import me.daddychurchill.MyWorld.Things.RealMaterial;

public class BushPopulator extends AbstractedPopulator {

	public BushPopulator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void renderHere(FinalizeBlocks blocks) {
		int y1 = blocks.getGenerator().getConfig().getStreetLevel();
		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {
				if (blocks.getOdds().rollDiceFor(0) && blocks.isEmpty(x, y1, z))
					blocks.setBlock(x, y1, z, RealMaterial.TALL_GRASS);
			}
		}
	}

	@Override
	public boolean isHere(AbstractedBlocks blocks) {
		return blocks.getOdds().playOdds(Odds.oddsEnormouslyLikely);
	}

}
