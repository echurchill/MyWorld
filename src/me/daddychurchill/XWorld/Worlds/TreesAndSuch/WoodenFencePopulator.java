package me.daddychurchill.XWorld.Worlds.TreesAndSuch;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Generators.AbstractPopulator;
import me.daddychurchill.XWorld.Things.RealMaterial;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public class WoodenFencePopulator extends AbstractPopulator {

	public WoodenFencePopulator() {
	}

	@Override
	public void renderHere(AbstractWorld world, FinalizeChunk chunk) {
		int y1 = world.getSurfaceY(chunk, 0, 0);
		chunk.setWalls(1, 14, y1, 1, 14, RealMaterial.FENCE);
	}

	@Override
	public boolean isHere(AbstractWorld world, FinalizeChunk chunk) {
		return (chunk.getChunkX() % 5 == 0 || chunk.getChunkZ() % 5 == 0);

	}

}
