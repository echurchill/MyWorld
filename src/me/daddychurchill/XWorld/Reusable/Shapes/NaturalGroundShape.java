package me.daddychurchill.XWorld.Reusable.Shapes;

import org.bukkit.util.noise.SimplexOctaveGenerator;

import me.daddychurchill.XWorld.Blocks.AbstractedChunk;
import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Support.Odds;

public class NaturalGroundShape extends AbstractedShape {

	private int seabedLevel; // how thick is the bottom bit
	private int middleThickness; // how thick is the middle bit
	private int seaLevel; // how thick is the water bit

	private int shapeOctives = 3;
	private double shapeXFactor = 1.25;
	private double shapeZFactor = 1.25;
	private double shapeFrequency = 0.60;
	private double shapeAmplitude = 0.60;
	private double shapeHScale = 1.0 / 175.0;
	private double shapeVScale = 10.0;

	private int noiseOctives = 5;
	private double noiseXFactor = shapeXFactor / 2;
	private double noiseZFactor = shapeZFactor / 2;
	private double noiseFrequency = shapeFrequency * 4;
	private double noiseAmplitude = shapeAmplitude / 4;
	private double noiseHScale = 1.0 / 35.0;
	private double noiseVScale = 3.0;

	private Odds odds;
	private SimplexOctaveGenerator shapeGenerator;
	private SimplexOctaveGenerator shiftGenerator;
	private SimplexOctaveGenerator noiseGenerator;

	public NaturalGroundShape(CoreGenerator generator) {
		long worldSeed = generator.getWorldSeed();
		odds = new Odds(worldSeed);

		seaLevel = generator.getConfig().getStreetLevel();
		seabedLevel = generator.getConfig().getSeabedLevel();
		middleThickness = odds.nextBetween(3, 7);

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

	@Override
	public int getSnowLevel() {
		return (AbstractedChunk.Height - seaLevel) / 2 + seaLevel;
	}

	@Override
	public double getSurfaceNoiseOnWorld(double x, double z) {
		return noiseGenerator.noise(x / noiseXFactor, z / noiseZFactor, noiseFrequency, noiseAmplitude) * noiseVScale;
	}

	@Override
	public double getSurfaceYOnWorld(double x, double z) {
		double shapeY = shapeGenerator.noise(x / shapeXFactor, z / shapeZFactor, shapeFrequency, shapeAmplitude)
				* shapeVScale;
		double shiftY = shiftGenerator.noise((-x + 100) / shapeXFactor, (-z - 100) / shapeZFactor, shapeFrequency,
				shapeAmplitude) * shapeVScale * 1.50;
		if (shiftY > shapeY)
			shapeY = shiftY;

		return (shapeY + getSurfaceNoiseOnWorld(x, z)) + seaLevel;
	}
}
