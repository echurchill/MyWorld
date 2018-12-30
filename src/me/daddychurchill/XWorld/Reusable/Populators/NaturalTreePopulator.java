package me.daddychurchill.XWorld.Reusable.Populators;

import org.bukkit.util.noise.SimplexOctaveGenerator;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Support.Odds;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;

public class NaturalTreePopulator extends AbstractTreePopulator {

	public NaturalTreePopulator(CoreGenerator generator) {
		super();

		long worldSeed = generator.getWorldSeed();
		treesGenerator = new SimplexOctaveGenerator(worldSeed + 100, noiseOctives);
		treesGenerator.setScale(noiseHScale);
	}

	private int noiseOctives = 4;
	private double noiseFrequency = 0.60;
	private double noiseAmplitude = 1.00;
	private double noiseHScale = 1.0 / 100.0;

	private SimplexOctaveGenerator treesGenerator;

	protected double getTreeOddsOnWorld(FinalizeChunk chunk, int x, int z) {
		double value = (treesGenerator.noise(chunk.getBlockWorldX(x), chunk.getBlockWorldZ(z), noiseFrequency,
				noiseAmplitude, true) * 2 + 1.0) / 2.0;
		return Math.min(1.0, Math.max(0.0, value));
	}

	private static int maxTrees = 4;
	private static int minAt = 2;
	private static int maxAt = 11;

	@Override
	public void renderHere(AbstractWorld world, FinalizeChunk chunk) {
		Odds odds = chunk.getOdds();

		for (int i = 0; i < maxTrees; i++) {
			int x = chunk.getOdds().nextBetween(minAt, maxAt);
			int z = chunk.getOdds().nextBetween(minAt, maxAt);
			double theOdds = getTreeOddsOnWorld(chunk, x, z);
			if (odds.playOdds(theOdds))
				plantTreeNear(world, chunk, x, z);
		}
	}

	@Override
	public boolean isHere(AbstractWorld world, FinalizeChunk chunk) {
		return true;
	}

}
