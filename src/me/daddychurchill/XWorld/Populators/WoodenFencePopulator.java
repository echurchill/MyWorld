package me.daddychurchill.XWorld.Populators;

import me.daddychurchill.XWorld.Blocks.AbstractedChunk;
import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Generators.AbstractedPopulator;
import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Things.RealMaterial;

public class WoodenFencePopulator extends AbstractedPopulator {

	public WoodenFencePopulator(CoreGenerator generator) {
		super(generator);
	}

	@Override
	public void renderHere(FinalizeChunk chunk) {
		int y1 = chunk.getGenerator().getConfig().getStreetLevel();
		chunk.setWalls(1, 14, y1, 1, 14, RealMaterial.FENCE);
	}

	@Override
	public boolean isHere(AbstractedChunk chunk) {
		return (chunk.getChunkX() % 5 == 0 || chunk.getChunkZ() % 5 == 0);

	}

}
