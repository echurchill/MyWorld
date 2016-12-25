package me.daddychurchill.XWorld.Worlds.Standard;

import org.bukkit.TreeType;
import org.bukkit.block.BlockFace;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public class DebugTreePopulator extends AbstractTreePopulator {

	public DebugTreePopulator() {

	}

	@Override
	public boolean isHere(AbstractWorld world, FinalizeChunk chunk) {
		return true;
	}
	
	private void debugTree(AbstractWorld world, FinalizeChunk chunk, TreeType tree) {
		int y = world.getSurfaceY(chunk, 6, 6);
		chunk.setSign(6, y, 6, BlockFace.NORTH, tree.toString());
		plantTree(world, chunk, 6, 8, tree);
	}

	@Override
	public void renderHere(AbstractWorld world, FinalizeChunk chunk) {
		int ndx = Math.abs(chunk.getChunkX()) % 14;
		switch (ndx) {
		case 0:
			debugTree(world, chunk, TreeType.ACACIA);
			break;
		case 1:
			debugTree(world, chunk, TreeType.BIG_TREE);
			break;
		case 2:
			debugTree(world, chunk, TreeType.BIRCH);
			break;
		case 3:
			debugTree(world, chunk, TreeType.COCOA_TREE);
			break;
		case 4:
			debugTree(world, chunk, TreeType.DARK_OAK);
			break;
		case 5:
			debugTree(world, chunk, TreeType.JUNGLE);
			break;
		case 6:
			debugTree(world, chunk, TreeType.JUNGLE_BUSH);
			break;
		case 7:
			debugTree(world, chunk, TreeType.MEGA_REDWOOD);
			break;
		case 8:
			debugTree(world, chunk, TreeType.REDWOOD);
			break;
		case 9:
			debugTree(world, chunk, TreeType.SMALL_JUNGLE);
			break;
		case 10:
			debugTree(world, chunk, TreeType.SWAMP);
			break;
		case 11:
			debugTree(world, chunk, TreeType.TALL_BIRCH);
			break;
		case 12:
			debugTree(world, chunk, TreeType.TALL_REDWOOD);
			break;
		case 13:
			debugTree(world, chunk, TreeType.TREE);
			break;
		default:
			debugTree(world, chunk, TreeType.RED_MUSHROOM);
			break;
		}
	}

}
