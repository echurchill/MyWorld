package me.daddychurchill.XWorld.Reusable.Populators;

import org.bukkit.TreeType;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Generators.AbstractPopulator;
import me.daddychurchill.XWorld.Support.Odds;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public abstract class AbstractTreePopulator extends AbstractPopulator {

	// 0---64---128---192---255
	// 0% 100% 50% 0% 0% non-redwoods
	// 0% 0% 50% 100% 0% redwoods
	private double getOddsOfRedwoods(int y) {
		if (y < 64)
			return 0.0;
		else if (y > 192)
			return (64.0 - (y - 192.0)) / 64.0;
		else
			return (y - 64.0) / 128.0;
	}

	private double getOddsOfNonRedwoods(int y) {
		if (y < 64)
			return 0.0;
		else if (y > 192)
			return 0.0;
		else
			return 1 - (y - 64.0) / 128.0;
	}

	private static TreeType doNotPlant = TreeType.CHORUS_PLANT;

	private TreeType getTreeTypeBasedOnAltitude(Odds odds, int y) {
		if (odds.playOdds(getOddsOfNonRedwoods(y))) {
			if (odds.playOdds(Odds.oddsUnlikely))
				return odds.getOneOf(TreeType.TALL_BIRCH, TreeType.BIG_TREE, TreeType.DARK_OAK);
//				return odds.getOneOf(TreeType.JUNGLE, TreeType.TALL_BIRCH, TreeType.ACACIA, TreeType.COCOA_TREE);
			else
				return odds.getOneOf(TreeType.TREE, TreeType.BIRCH, TreeType.ACACIA, TreeType.SMALL_JUNGLE,
						TreeType.JUNGLE_BUSH);
		} else if (odds.playOdds(getOddsOfRedwoods(y))) {
			if (odds.playOdds(Odds.oddsUnlikely))
				return TreeType.MEGA_REDWOOD;
			else
				return odds.getOneOf(TreeType.REDWOOD, TreeType.TALL_REDWOOD);

		} else
			return doNotPlant;
	}

	protected void plantTreeNear(AbstractWorld world, FinalizeChunk chunk, int x, int z) {
		Odds odds = chunk.getOdds();
		plantTree(world, chunk, x + odds.nextBetween(-1, 2), z + odds.nextBetween(-1, 2));
	}

	protected void plantTree(AbstractWorld world, FinalizeChunk chunk, int x, int z) {
		int y = world.getSurfaceY(chunk, x, z);
		plantTree(world, chunk, x, y, z, getTreeTypeBasedOnAltitude(chunk.getOdds(), y));
	}

	protected void plantTree(AbstractWorld world, FinalizeChunk chunk, int x, int z, TreeType tree) {
		plantTree(world, chunk, x, world.getSurfaceY(chunk, x, z), z, tree);
	}

	private void plantTree(AbstractWorld world, FinalizeChunk chunk, int x, int y, int z, TreeType tree) {
		if (tree != doNotPlant && y < FinalizeChunk.Height - 20)
			chunk.plantTree(x, y, z, tree);
	}
}
