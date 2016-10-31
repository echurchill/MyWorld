package me.daddychurchill.XWorld.Worlds.BigFlat;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Generators.AbstractPopulator;
import me.daddychurchill.XWorld.Things.RealMaterial;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public class BigFlatPopulator extends AbstractPopulator {

	public BigFlatPopulator() {

	}

	@Override
	public boolean isHere(AbstractWorld world, FinalizeChunk chunk) {
		return true;
	}

	@Override
	public void renderHere(AbstractWorld world, FinalizeChunk chunk) {
		for (int x = 1; x < 16; x = x + 2) {
			for (int z = 1; z < 16; z = z + 2) {
				int y = world.getSurfaceY(chunk, x, z);
				
				chunk.setBlocks(x, y, y + 5, z, RealMaterial.ANDESITE);
			}
		}
	}

}
