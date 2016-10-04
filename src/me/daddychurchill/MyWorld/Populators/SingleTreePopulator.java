package me.daddychurchill.MyWorld.Populators;

import org.bukkit.TreeType;

import me.daddychurchill.MyWorld.Blocks.AbstractedChunk;
import me.daddychurchill.MyWorld.Blocks.FinalizeChunk;
import me.daddychurchill.MyWorld.Generators.AbstractedPopulator;

public class SingleTreePopulator extends AbstractedPopulator {

	public SingleTreePopulator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void renderHere(FinalizeChunk chunk) {
		int y1 = chunk.getGenerator().getConfig().getStreetLevel();
		chunk.generateTree(7, y1, 7, TreeType.TREE, TreeType.BIG_TREE, 
									  TreeType.BIRCH, TreeType.TALL_BIRCH, 
									  TreeType.DARK_OAK,
									  TreeType.REDWOOD, TreeType.TALL_REDWOOD, TreeType.MEGA_REDWOOD);
	}

	@Override
	public boolean isHere(AbstractedChunk chunk) {
		return (chunk.getChunkX() % 3 == 0 || chunk.getChunkZ() % 3 == 0);
	}

}
