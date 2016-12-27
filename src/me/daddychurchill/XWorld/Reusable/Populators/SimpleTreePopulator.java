package me.daddychurchill.XWorld.Reusable.Populators;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Support.Odds;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public class SimpleTreePopulator extends AbstractTreePopulator {

	private double oddsOfSpawn;
	
	public SimpleTreePopulator() {
		this.oddsOfSpawn = Odds.oddsLikely;
	}
	
	public SimpleTreePopulator(double oddsOfSpawn) {
		this.oddsOfSpawn = oddsOfSpawn;
	}

	@Override
	public void renderHere(AbstractWorld world, FinalizeChunk chunk) {
		Odds odds = chunk.getOdds();
		if (odds.playOdds(oddsOfSpawn))
			if (odds.playOdds(oddsOfSpawn)) {
				plantTree(world, chunk, odds.nextBetween(13, 15), odds.nextBetween(6, 10));
				plantTree(world, chunk, odds.nextBetween(6, 10), odds.nextBetween(13, 15));
			} else {
				plantTree(world, chunk, odds.nextBetween(6, 15), odds.nextBetween(6, 15));
			}
	}
	
	@Override
	public boolean isHere(AbstractWorld world, FinalizeChunk chunk) {
		return chunk.getOdds().playOdds(oddsOfSpawn);
	}

}
