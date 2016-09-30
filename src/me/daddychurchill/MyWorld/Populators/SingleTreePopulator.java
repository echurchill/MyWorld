package me.daddychurchill.MyWorld.Populators;

import org.bukkit.TreeType;

import me.daddychurchill.MyWorld.Blocks.AbstractedBlocks;
import me.daddychurchill.MyWorld.Blocks.FinalizeBlocks;
import me.daddychurchill.MyWorld.Generators.AbstractedPopulator;

public class SingleTreePopulator extends AbstractedPopulator {

	public SingleTreePopulator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void renderHere(FinalizeBlocks blocks) {
		int y1 = blocks.getGenerator().getConfig().getStreetLevel();
		blocks.generateTree(7, y1, 7, TreeType.TREE, TreeType.BIG_TREE, 
									  TreeType.BIRCH, TreeType.TALL_BIRCH, 
									  TreeType.DARK_OAK,
									  TreeType.REDWOOD, TreeType.TALL_REDWOOD, TreeType.MEGA_REDWOOD);
	}

	@Override
	public boolean isHere(AbstractedBlocks blocks) {
		return true;
	}

}
