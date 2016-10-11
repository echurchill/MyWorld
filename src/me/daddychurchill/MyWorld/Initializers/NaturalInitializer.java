package me.daddychurchill.MyWorld.Initializers;

import org.bukkit.TreeType;
import org.bukkit.material.MaterialData;
import org.bukkit.util.noise.NoiseGenerator;
import org.bukkit.util.noise.SimplexOctaveGenerator;

import me.daddychurchill.MyWorld.Blocks.AbstractedChunk;
import me.daddychurchill.MyWorld.Blocks.InitializeChunk;
import me.daddychurchill.MyWorld.Generators.AbstractedInitializer;
import me.daddychurchill.MyWorld.Generators.CoreGenerator;
import me.daddychurchill.MyWorld.Support.Odds;
import me.daddychurchill.MyWorld.Things.RealMaterial;

public class NaturalInitializer extends AbstractedInitializer {

	protected int specialBlockOdds; // 1/n chance that there is minerals on this level
	protected int specialsPerLayer; // number of minerals per layer
	protected int seabedLevel; // how thick is the bottom bit
	protected int middleThickness; // how thick is the middle bit
	protected int seaLevel; // how thick is the water bit
	protected int flowerOdds = 6; // 1/n chance that there is a flower on the grass, if there isn't a tree else make some tall grass
	protected TreeType treeType;
	protected int treesPerChunk;
	
	protected MaterialData materialBottom; // what is the stone made of?
	protected MaterialData materialMiddle; // what is dirt made of?
	protected MaterialData materialTop; // what is grass made of?
	protected MaterialData materialLiquidBase; // what is sand made of?
	protected MaterialData materialLiquid; // what is the liquid made of?
	protected MaterialData materialBlades; // what is a blade of grass made of?
	protected MaterialData materialFlower; // what is a flower made of?
	
	protected MaterialData materialMineral; // for later use in the populator
	protected MaterialData materialFertile;
//	protected int airId; 
	
	protected int shapeOctives = 3;
	protected double shapeXFactor = 1.0;
	protected double shapeZFactor = 1.0;
	protected double shapeFrequency = 0.5;
	protected double shapeAmplitude = 0.5;
	protected double shapeHScale = 1.0 / 64.0;
	protected double shapeVScale = 16.0;
	
	protected int noiseOctives = 5;
	protected double noiseXFactor = 1.0;
	protected double noiseZFactor = 1.0;
	protected double noiseFrequency = 0.5;
	protected double noiseAmplitude = 0.5;
	protected double noiseHScale = 1.0 / 64.0;
	protected double noiseVScale = 16.0;
	
	private Odds odds;
	private SimplexOctaveGenerator shapeGenerator;
	private SimplexOctaveGenerator shiftGenerator;
	private SimplexOctaveGenerator noiseGenerator;
	
	public NaturalInitializer(CoreGenerator generator) {
		super(generator);
		long worldSeed = generator.getWorld().getSeed(); 
		odds = new Odds(worldSeed);

		specialBlockOdds = odds.nextInt(3) + 1;
		specialsPerLayer = odds.nextInt(20) + 10;
		seaLevel = generator.getConfig().getStreetLevel();
		seabedLevel = generator.getConfig().getSeabedLevel();
		middleThickness = odds.nextBetween(3, 7);
		treeType = odds.nextBoolean() ? TreeType.BIRCH : TreeType.TREE;
		treesPerChunk = 2;
		
		shapeXFactor = odds.nextBetween(0.75, 1.25);
		shapeZFactor = odds.nextBetween(0.75, 1.25);
		shapeFrequency = odds.nextBetween(0.40, 0.60);
		shapeAmplitude = odds.nextBetween(0.40, 0.60);
		shapeHScale = odds.nextBetween(1.0 / 100.0, 1.0 / 150.0);
		shapeVScale = odds.nextBetween(13.0, 19.0);
		
		noiseXFactor = shapeXFactor / 2;
		noiseZFactor = shapeZFactor / 2;
		noiseFrequency = shapeFrequency * 4;
		noiseAmplitude = shapeAmplitude / 4;
		noiseHScale = odds.nextBetween(1.0 / 26.0, 1.0 / 34.0);
		noiseVScale = odds.nextBetween(1.0, 5.0);
		
		shapeGenerator = new SimplexOctaveGenerator(worldSeed, shapeOctives);
		shapeGenerator.setScale(shapeHScale);
		shiftGenerator = new SimplexOctaveGenerator(worldSeed, shapeOctives);
		shiftGenerator.setScale(shapeHScale / 2);
		noiseGenerator = new SimplexOctaveGenerator(worldSeed, noiseOctives);
		noiseGenerator.setScale(noiseHScale);
		
		materialBottom = RealMaterial.STONE;
		materialMiddle = RealMaterial.DIRT;
		materialTop = RealMaterial.GRASS;
		materialLiquidBase = RealMaterial.SAND;
		materialLiquid = RealMaterial.WATER_STATIONARY;
		materialBlades = RealMaterial.TALL_GRASS;
		materialFlower = odds.nextBoolean() ? RealMaterial.FLOWER_POPPY : RealMaterial.FLOWER_DANDELION;
		
		materialMineral = materialBottom;
		materialFertile = materialTop;
	}

	protected int getHeight(double x, double z) {
		double shapeY = shapeGenerator.noise(x / shapeXFactor, z / shapeZFactor, shapeFrequency, shapeAmplitude) * shapeVScale;
		double shiftY = shiftGenerator.noise((-x + 100) / shapeXFactor, (-z - 100) / shapeZFactor, shapeFrequency, shapeAmplitude) * shapeVScale * 1.25;
		if (shiftY > shapeY)
			shapeY = shiftY;
		
		double noiseY = noiseGenerator.noise(x / noiseXFactor, z / noiseZFactor, noiseFrequency, noiseAmplitude) * noiseVScale;
		
		return NoiseGenerator.floor(shapeY + noiseY) + seabedLevel;
	}

	@Override
	public void renderHere(InitializeChunk chunk) {
		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {
				int worldX = chunk.getBlockWorldX(x);
				int worldZ = chunk.getBlockWorldZ(z);
				int y = getHeight(worldX, worldZ);
				chunk.setBlocks(x, 1, y - middleThickness, z, materialBottom);
				
				chunk.setBlocks(x, y - middleThickness, y, z, materialMiddle);
				if (y < seaLevel) {
					chunk.setBlock(x, y, z, materialLiquidBase);
					chunk.setBlocks(x, y + 1, seaLevel, z, materialLiquid);
				} else
					chunk.setBlock(x, y, z, materialTop);
			}
		}
	}

	@Override
	public boolean isHere(AbstractedChunk chunk) {
		return true;
	}

}
