package me.daddychurchill.XWorld.Worlds.TreesAndSuch;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Generators.AbstractPopulator;
import me.daddychurchill.XWorld.Things.RealMaterial;

public class WoodenFencePopulator extends AbstractPopulator {

	public WoodenFencePopulator() {
	}

	@Override
	public void renderHere(FinalizeChunk chunk) {
		int y1 = chunk.getGenerator().getConfig().getStreetLevel();
		chunk.setWalls(1, 14, y1, 1, 14, RealMaterial.FENCE);
	}

	@Override
	public boolean isHere(FinalizeChunk chunk) {
		return (chunk.getChunkX() % 5 == 0 || chunk.getChunkZ() % 5 == 0);

	}

}
