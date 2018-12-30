package me.daddychurchill.XWorld.Reusable.Initializers;

import org.bukkit.Material;

import me.daddychurchill.XWorld.Blocks.InitializeChunk;
import me.daddychurchill.XWorld.Generators.AbstractInitializer;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public class SimpleTerrainInitializer extends AbstractInitializer {

	public SimpleTerrainInitializer() {

	}

	@Override
	public void renderHere(AbstractWorld world, InitializeChunk chunk) {
		for (int x = 0; x < 16; x++)
			for (int z = 0; z < 16; z++) {
				int y = world.getSurfaceY(chunk, x, z);
				assert (y > 0);
				if (y > 0)
					chunk.setBlock(x, 0, z, Material.BEDROCK);
				if (y > 1)
					chunk.setBlock(x, y - 1, z, Material.GRASS_BLOCK);
				if (y > 2)
					chunk.setBlocks(x, 1, y - 1, z, Material.DIRT);
				// need to figure out how to introduce stones into this
				// need to add rocks and boulders poking out of the ground
			}
	}

	@Override
	public boolean isHere(AbstractWorld world, InitializeChunk chunk) {
		return true;
	}
}
