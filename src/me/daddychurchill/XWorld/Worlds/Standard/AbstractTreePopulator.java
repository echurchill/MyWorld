package me.daddychurchill.XWorld.Worlds.Standard;

import org.bukkit.TreeType;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Generators.AbstractPopulator;
import me.daddychurchill.XWorld.Support.Odds;
import me.daddychurchill.XWorld.Things.RealMaterial;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public abstract class AbstractTreePopulator extends AbstractPopulator {

	// 0---64---128---192---255
	// 0%  100% 50%   0%    0%   non-redwoods
	// 0%  0%   50%   100%  0%   redwoods   
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
		if (odds.playOdds(getOddsOfRedwoods(y))) {
			if (odds.playOdds(Odds.oddsUnlikely))
				return TreeType.MEGA_REDWOOD;
			else
				return odds.getOneOf(TreeType.REDWOOD, TreeType.TALL_REDWOOD);
			
		} else if (odds.playOdds(getOddsOfNonRedwoods(y))) {
			if (odds.playOdds(Odds.oddsUnlikely))
				return odds.getOneOf(TreeType.DARK_OAK, TreeType.BIG_TREE, TreeType.TALL_BIRCH, TreeType.ACACIA);
			else
				return odds.getOneOf(TreeType.TREE, TreeType.BIRCH, TreeType.JUNGLE, TreeType.SMALL_JUNGLE, TreeType.COCOA_TREE);
		} else
			return doNotPlant;
	}
	
	protected void plantTree(AbstractWorld world, FinalizeChunk chunk, Odds odds, int x, int z) {
		int y = world.getSurfaceY(chunk, x, z);
		if (y > 0) {
			if (chunk.isFertile(x, y, z)) {
				TreeType tree = getTreeTypeBasedOnAltitude(odds, y);
				if (tree != doNotPlant)
					switch (tree) {
					case DARK_OAK:
					case MEGA_REDWOOD:
						chunk.emptyBlocks(x, x + 2, y, z, z + 2);
						chunk.setBlocksBelow(x, x + 2, y, z, z + 2, RealMaterial.DIRT);
						chunk.plantTree(x, y, z, tree);
						break;
					default:
						chunk.emptyBlock(x, y, z);
						chunk.setBlocksBelow(x, y, z, RealMaterial.DIRT);
						chunk.plantTree(x, y, z, tree);
						break;
					}
				else
					chunk.setBlocks(x, y, y + 20, z, RealMaterial.GOLD_BLOCK);
			}
		}
	}
}
