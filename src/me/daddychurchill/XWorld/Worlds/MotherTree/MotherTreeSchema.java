package me.daddychurchill.XWorld.Worlds.MotherTree;

import org.bukkit.Material;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Schemas.ProceduralSchema;
import me.daddychurchill.XWorld.Support.Odds;

public class MotherTreeSchema extends ProceduralSchema {

	public MotherTreeSchema(CoreGenerator generator) {
		super(generator, 100, 150, 100);
	}

	@Override
	protected void initialize() {

		addClump(Odds.oddsEnormouslyLikely, 45, 100, 45, 5, 20);
		addClump(Odds.oddsEnormouslyLikely, 55, 100, 45, 5, 20);
		addClump(Odds.oddsEnormouslyLikely, 45, 100, 55, 5, 20);
		addClump(Odds.oddsEnormouslyLikely, 55, 100, 55, 5, 20);

		addClump(Odds.oddsLikely, 40, 100, 30, 5, 15);
		addClump(Odds.oddsLikely, 60, 100, 40, 5, 15);
		addClump(Odds.oddsLikely, 50, 100, 60, 5, 15);
		addClump(Odds.oddsLikely, 30, 100, 50, 5, 15);

		addClump(Odds.oddsSomewhatUnlikely, 50, 100, 30, 5, 15);
		addClump(Odds.oddsSomewhatUnlikely, 60, 100, 50, 5, 15);
		addClump(Odds.oddsSomewhatUnlikely, 40, 100, 60, 5, 15);
		addClump(Odds.oddsSomewhatUnlikely, 30, 100, 40, 5, 15);

		setBlocks(40, 60, 0, 100, 40, 60, Material.DARK_OAK_LOG);
	}

	private void addClump(double clumpOdds, int centerX, int centerY, int centerZ, int heightRange, int sizeRange) {
		Odds odds = getOdds();
		if (odds.playOdds(clumpOdds)) {
			int size = odds.nextPast(10, sizeRange);
			int y = centerY - odds.nextInt(heightRange);
			int halfSize = size / 2;
			setBlocks(centerX - halfSize, centerX + halfSize, y, y + size, centerZ - halfSize, centerZ + halfSize,
					Material.OAK_LEAVES);
		}
	}

}
