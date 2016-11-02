package me.daddychurchill.XWorld.Worlds.Standard;

import org.bukkit.TreeType;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Generators.AbstractPopulator;
import me.daddychurchill.XWorld.Support.Odds;
import me.daddychurchill.XWorld.Things.RealMaterial;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public class SingleTreePopulator extends AbstractPopulator {

	private double oddsOfSpawn;
	
	public SingleTreePopulator() {
		this.oddsOfSpawn = Odds.oddsLikely;
	}
	
	public SingleTreePopulator(double oddsOfSpawn) {
		this.oddsOfSpawn = oddsOfSpawn;
	}

	@Override
	public void renderHere(AbstractWorld world, FinalizeChunk chunk) {
		Odds odds = chunk.getOdds();
		int x = odds.nextBetween(6, 10);
		int z = odds.nextBetween(6, 10);
		int y = world.getSurfaceY(chunk, x, z);
		
		if (odds.playOdds(Odds.oddsPrettyUnlikely)) {
			chunk.emptyBlocks(x, x + 2, y, z, z + 2);
			chunk.setBlocksBelow(x, x + 2, y, z, z + 2, RealMaterial.DIRT);
			chunk.generateTree(x, y, z, TreeType.DARK_OAK, TreeType.MEGA_REDWOOD);
		} else {
			chunk.emptyBlock(x, y, z);
			chunk.setBlocksBelow(x, y, z, RealMaterial.DIRT);
			chunk.generateTree(x, y, z, TreeType.TREE, TreeType.BIG_TREE, 
										TreeType.BIRCH, TreeType.TALL_BIRCH, 
										TreeType.REDWOOD, TreeType.TALL_REDWOOD);
		}
	}

	@Override
	public boolean isHere(AbstractWorld world, FinalizeChunk chunk) {
		return chunk.getOdds().playOdds(oddsOfSpawn);
	}

}
