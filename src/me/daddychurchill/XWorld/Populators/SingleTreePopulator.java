package me.daddychurchill.XWorld.Populators;

import org.bukkit.TreeType;

import me.daddychurchill.XWorld.Blocks.AbstractedChunk;
import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Generators.AbstractedPopulator;
import me.daddychurchill.XWorld.Generators.CoreGenerator;

public class SingleTreePopulator extends AbstractedPopulator {

	public SingleTreePopulator(CoreGenerator generator) {
		super(generator);
		
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
