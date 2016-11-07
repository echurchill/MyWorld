package me.daddychurchill.XWorld.Worlds.Shapes;

import org.bukkit.util.noise.SimplexOctaveGenerator;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Support.Odds;

public class NaturalGroundShape extends AbstractedShape {

	private int seabedLevel; // how thick is the bottom bit
	private int middleThickness; // how thick is the middle bit
	private int seaLevel; // how thick is the water bit
	
	private int shapeOctives = 3;
	private double shapeXFactor = 1.0;
	private double shapeZFactor = 1.0;
	private double shapeFrequency = 0.5;
	private double shapeAmplitude = 0.5;
	private double shapeHScale = 1.0 / 64.0;
	private double shapeVScale = 16.0;
	
	private int noiseOctives = 5;
	private double noiseXFactor = 1.0;
	private double noiseZFactor = 1.0;
	private double noiseFrequency = 0.5;
	private double noiseAmplitude = 0.5;
	private double noiseHScale = 1.0 / 64.0;
	private double noiseVScale = 16.0;
	
	private Odds odds;
	private SimplexOctaveGenerator shapeGenerator;
	private SimplexOctaveGenerator shiftGenerator;
	private SimplexOctaveGenerator noiseGenerator;
	
	public NaturalGroundShape(CoreGenerator generator) {
		long worldSeed = generator.getWorldSeed(); 
		odds = new Odds(worldSeed);

		//specialBlockOdds = odds.nextInt(3) + 1;
		//specialsPerLayer = odds.nextInt(20) + 10;
		seaLevel = generator.getConfig().getStreetLevel();
		seabedLevel = generator.getConfig().getSeabedLevel();
		middleThickness = odds.nextBetween(3, 7);
		//treeType = odds.nextBoolean() ? TreeType.BIRCH : TreeType.TREE;
		//treesPerChunk = 2;
		
		shapeXFactor = odds.nextBetween(0.75, 1.25);
		shapeZFactor = odds.nextBetween(0.75, 1.25);
		shapeFrequency = odds.nextBetween(0.40, 0.60);
		shapeAmplitude = odds.nextBetween(0.40, 0.60);
		shapeHScale = odds.nextBetween(1.0 / 150.0, 1.0 / 200.0);
		shapeVScale = odds.nextBetween(15.0, 30.0);
		
		noiseXFactor = shapeXFactor / 2;
		noiseZFactor = shapeZFactor / 2;
		noiseFrequency = shapeFrequency * 4;
		noiseAmplitude = shapeAmplitude / 4;
		noiseHScale = odds.nextBetween(1.0 / 30.0, 1.0 / 40.0);
		noiseVScale = odds.nextBetween(1.0, 5.0);
		
		shapeGenerator = new SimplexOctaveGenerator(worldSeed, shapeOctives);
		shapeGenerator.setScale(shapeHScale);
		shiftGenerator = new SimplexOctaveGenerator(worldSeed, shapeOctives);
		shiftGenerator.setScale(shapeHScale / 2);
		noiseGenerator = new SimplexOctaveGenerator(worldSeed, noiseOctives);
		noiseGenerator.setScale(noiseHScale);
		
	}

	@Override
	public int getSeabedLevel() {
		return seabedLevel;
	}

	@Override
	public int getMiddleThickness() {
		return middleThickness;
	}

	@Override
	public int getSeaLevel() {
		return seaLevel;
	}
	
	protected double getSurfaceNoiseOnWorld(double x, double z) {
		return noiseGenerator.noise(x / noiseXFactor, z / noiseZFactor, noiseFrequency, noiseAmplitude) * noiseVScale;
	}

	@Override
	public double getSurfaceYOnWorld(double x, double z) {
		double shapeY = shapeGenerator.noise(x / shapeXFactor, z / shapeZFactor, shapeFrequency, shapeAmplitude) * shapeVScale;
		double shiftY = shiftGenerator.noise((-x + 100) / shapeXFactor, (-z - 100) / shapeZFactor, shapeFrequency, shapeAmplitude) * shapeVScale * 1.50;
		if (shiftY > shapeY)
			shapeY = shiftY;
		
		return (shapeY + getSurfaceNoiseOnWorld(x, z)) + seaLevel;
	}
}
