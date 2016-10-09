package me.daddychurchill.MyWorld.Populators;

import me.daddychurchill.MyWorld.Blocks.AbstractedChunk;
import me.daddychurchill.MyWorld.Blocks.FinalizeChunk;
import me.daddychurchill.MyWorld.Generators.AbstractedPopulator;
import me.daddychurchill.MyWorld.Generators.CoreGenerator;
import me.daddychurchill.MyWorld.Things.RealMaterial;

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
