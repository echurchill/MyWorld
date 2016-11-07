package me.daddychurchill.XWorld.Worlds.Alex;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Generators.AbstractPopulator;
import me.daddychurchill.XWorld.Things.RealMaterial;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public class AlexPopulator extends AbstractPopulator {

	public AlexPopulator() {

	}
	
	private static int spacesize = 4;

	@Override
	public boolean isHere(AbstractWorld world, FinalizeChunk chunk) {
		return chunk.getChunkX() % spacesize == 0 || chunk.getChunkZ() % spacesize == 0;
	}

	@Override
	public void renderHere(AbstractWorld world, FinalizeChunk chunk) {
//		for (int x = 1; x < 16; x = x + 4) {
//			for (int z = 1; z < 16; z = z + 4) {
//				int y = world.getSurfaceY(chunk, x, z);
//				
//				chunk.setBlocks(x, y, y + 5, z, RealMaterial.ANDESITE);
//			}
//		}

	
//		for (int x = 1; x < 16; x = x + 4) {
//			for (int z = 1; z < 16; z = z + 4) {
//				int y = world.getSurfaceY(chunk, x, z);
//				
//				chunk.setBlock(x, y, z, RealMaterial.CAKE_BLOCK);
//			}
//		}
		
//		for (int x = 0; x < 16; x++) {
//			int y = world.getSurfaceY(chunk, x, 0);
//		
//			chunk.setBlocks(x, y, y + 20, 0, RealMaterial.CAKE_BLOCK);
//		}
//
//		for (int z = 1; z < 16; z++) {
//			int y = world.getSurfaceY(chunk, 0, z);
//		
//			chunk.setBlocks(0, y, y + 20, z, RealMaterial.CAKE_BLOCK);
//		}

		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {
				int y = world.getSurfaceY(chunk, x, z);
			
				chunk.setBlocks(x, y, y + 20, z, RealMaterial.CAKE_BLOCK);
			}
		}
	
	}
}
