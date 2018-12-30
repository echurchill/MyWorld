package me.daddychurchill.XWorld.Reusable.Populators;

import org.bukkit.Material;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Generators.AbstractPopulator;
import me.daddychurchill.XWorld.Support.Odds;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public class NaturalSurfacePopulator extends AbstractPopulator {

	private double oddsOfSpawn;

	public NaturalSurfacePopulator() {
		this.oddsOfSpawn = Odds.oddsEven;
	}

	public NaturalSurfacePopulator(double oddsOfSpawn) {
		this.oddsOfSpawn = oddsOfSpawn;
	}

	@Override
	public void renderHere(AbstractWorld world, FinalizeChunk chunk) {
		Odds odds = chunk.getOdds();
		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {
				int y = world.getSurfaceY(chunk, x, z);
				if (odds.playOdds(oddsOfSpawn) && chunk.isEmpty(x, y, z)
						&& chunk.isType(x, y - 1, z, Material.GRASS_BLOCK)) {
					if (odds.playOdds(Odds.oddsLikely))
						chunk.setBlock(x, y, z, Material.TALL_GRASS);
					else {
						switch (odds.rollDice()) {
						default:
						case 0:
						case 1:
						case 2:
							chunk.setBlock(x, y, z, Material.POPPY);
							break;
						case 3:
							chunk.setBlock(x, y, z, Material.RED_TULIP);
							break;
						case 4:
							chunk.setBlock(x, y, z, Material.WHITE_TULIP);
							break;
						case 5:
							chunk.setBlock(x, y, z, Material.DANDELION);
							break;
						}
					}
				}
			}
		}
	}

	@Override
	public boolean isHere(AbstractWorld world, FinalizeChunk chunk) {
		return true;
	}

}
