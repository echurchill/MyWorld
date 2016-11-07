package me.daddychurchill.XWorld.Worlds.Standard;
import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Generators.AbstractPopulator;
import me.daddychurchill.XWorld.Support.Odds;
import me.daddychurchill.XWorld.Things.RealMaterial;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public class GrassPopulator extends AbstractPopulator {

	private double oddsOfSpawn;
	
	public GrassPopulator() {
		this.oddsOfSpawn = Odds.oddsEven;
	}

	public GrassPopulator(double oddsOfSpawn) {
		this.oddsOfSpawn = oddsOfSpawn;
	}

	@Override
	public void renderHere(AbstractWorld world, FinalizeChunk chunk) {
		Odds odds = chunk.getOdds();
		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {
				int y = world.getSurfaceY(chunk, x, z);
				if (odds.playOdds(oddsOfSpawn) && chunk.isEmpty(x, y, z) && chunk.isType(x, y - 1, z, RealMaterial.GRASS))
					if (odds.playOdds(Odds.oddsLikely))
						chunk.setBlock(x, y, z, RealMaterial.TALL_GRASS);
					else switch (odds.rollDice()) {
					default:
					case 0:
					case 1:
					case 2:
						chunk.setBlock(x, y, z, RealMaterial.FLOWER_POPPY);
						break;
					case 3:
						chunk.setBlock(x, y, z, RealMaterial.FLOWER_RED_TULIP);
						break;
					case 4:
						chunk.setBlock(x, y, z, RealMaterial.FLOWER_WHITE_TULIP);
						break;
					case 5:
						chunk.setBlock(x, y, z, RealMaterial.FLOWER_DANDELION);
						break;
					}
			}
		}
	}

	@Override
	public boolean isHere(AbstractWorld world, FinalizeChunk chunk) {
		return true;
	}

}
