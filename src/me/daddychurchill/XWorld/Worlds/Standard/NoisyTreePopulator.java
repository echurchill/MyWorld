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

	private int noiseOctives = 1;
	private double noiseFrequency = 1.0;
	private double noiseAmplitude = 1.0;
	private double noiseHScale = 3.0;
	
	private SimplexOctaveGenerator noiseGenerator;
	
	protected double getTreeOddsOnWorld(FinalizeChunk chunk) {
		return (noiseGenerator.noise(chunk.getChunkX(), chunk.getChunkZ(), noiseFrequency, noiseAmplitude) + 1.0) / 2.0;
	}

	@Override
	public void renderHere(AbstractWorld world, FinalizeChunk chunk) {
		Odds odds = chunk.getOdds();
		double treeOdds = getTreeOddsOnWorld(chunk);
		
		if (odds.playOdds(treeOdds))
			plantTreeNear(world, chunk, 5, 5);
		if (odds.playOdds(treeOdds))
			plantTreeNear(world, chunk, 5, 13);
		if (odds.playOdds(treeOdds))
			plantTreeNear(world, chunk, 13, 5);
		if (odds.playOdds(treeOdds))
			plantTreeNear(world, chunk, 13, 13);
	}
	
	@Override
	public boolean isHere(AbstractWorld world, FinalizeChunk chunk) {
		Odds odds = chunk.getOdds();
		return odds.playOdds(Odds.oddsAlwaysGoingToHappen);
	}

}
