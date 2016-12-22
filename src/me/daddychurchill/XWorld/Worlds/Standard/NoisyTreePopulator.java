package me.daddychurchill.XWorld.Worlds.Standard;

import org.bukkit.util.noise.SimplexOctaveGenerator;

import me.daddychurchill.XWorld.Blocks.FinalizeChunk;
import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Support.Odds;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;


public class NoisyTreePopulator extends AbstractTreePopulator {

	public NoisyTreePopulator(CoreGenerator generator) {
		super();
		
		long worldSeed = generator.getWorldSeed(); 
		noiseGenerator = new SimplexOctaveGenerator(worldSeed, noiseOctives);
		noiseGenerator.setScale(noiseHScale);
	}

	private int noiseOctives = 5;
	private double noiseFrequency = 0.5;
	private double noiseAmplitude = 0.5;
	private double noiseHScale = 1.0 / 64.0;
	
	private SimplexOctaveGenerator noiseGenerator;
	
	protected double getTreeOddsOnWorld(double x, double z) {
		return noiseGenerator.noise(x, z, noiseFrequency, noiseAmplitude);
	}

	@Override
	public void renderHere(AbstractWorld world, FinalizeChunk chunk) {
		Odds odds = chunk.getOdds();
		
		plantTree(world, chunk, odds, odds.nextBetween(13, 15), odds.nextBetween(6, 10));
	}
	
	@Override
	public boolean isHere(AbstractWorld world, FinalizeChunk chunk) {
		Odds odds = chunk.getOdds();
		return odds.playOdds(Odds.oddsAlwaysGoingToHappen);
	}

}
