package me.daddychurchill.MyWorld.Populators;
import me.daddychurchill.MyWorld.Blocks.AbstractedChunk;
import me.daddychurchill.MyWorld.Blocks.FinalizeChunk;
import me.daddychurchill.MyWorld.Generators.AbstractedPopulator;
import me.daddychurchill.MyWorld.Support.Odds;
import me.daddychurchill.MyWorld.Things.RealMaterial;

public class BushPopulator extends AbstractedPopulator {

	public BushPopulator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void renderHere(FinalizeChunk chunk) {
		int y1 = chunk.getGenerator().getConfig().getStreetLevel();
		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {
				if (chunk.getOdds().rollDiceFor(0) && chunk.isEmpty(x, y1, z))
					chunk.setBlock(x, y1, z, RealMaterial.TALL_GRASS);
			}
		}
	}

	@Override
	public boolean isHere(AbstractedChunk chunk) {
		return chunk.getOdds().playOdds(Odds.oddsEnormouslyLikely);
	}

}
