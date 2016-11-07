package me.daddychurchill.XWorld.Worlds.Standard;

import org.bukkit.material.MaterialData;
import me.daddychurchill.XWorld.Blocks.InitializeChunk;
import me.daddychurchill.XWorld.Generators.AbstractInitializer;
import me.daddychurchill.XWorld.Things.RealMaterial;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;
import me.daddychurchill.XWorld.Worlds.Shapes.AbstractedShape;

public class NaturalTerrainInitializer extends AbstractInitializer {

	//protected int specialBlockOdds; // 1/n chance that there is minerals on this level
	//protected int specialsPerLayer; // number of minerals per layer
	//protected int flowerOdds = 6; // 1/n chance that there is a flower on the grass, if there isn't a tree else make some tall grass
	//protected TreeType treeType;
	//protected int treesPerChunk;
	
	protected MaterialData materialBottom; // what is the stone made of?
	protected MaterialData materialMiddle; // what is dirt made of?
	protected MaterialData materialTop; // what is grass made of?
	protected MaterialData materialLiquidBase; // what is sand made of?
	protected MaterialData materialLiquid; // what is the liquid made of?
	//protected MaterialData materialBlades; // what is a blade of grass made of?
	//protected MaterialData materialFlower; // what is a flower made of?
	
	//protected MaterialData materialMineral; // for later use in the populator
	//protected MaterialData materialFertile;
	//protected int airId; 
	AbstractedShape worldShape;
	
	public NaturalTerrainInitializer(AbstractedShape shape) {
		worldShape = shape;
		
		materialBottom = RealMaterial.STONE;
		materialMiddle = RealMaterial.DIRT;
		materialTop = RealMaterial.GRASS;
		materialLiquidBase = RealMaterial.SAND;
		materialLiquid = RealMaterial.WATER_STATIONARY;
		//materialBlades = RealMaterial.TALL_GRASS;
		//materialFlower = odds.nextBoolean() ? RealMaterial.FLOWER_POPPY : RealMaterial.FLOWER_DANDELION;
		
		//materialMineral = materialBottom;
		//materialFertile = materialTop;
	}

	@Override
	public void renderHere(AbstractWorld world, InitializeChunk chunk) {
		int middleThickness = worldShape.getMiddleThickness();
		int seaLevel = worldShape.getSeaLevel();
		
		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {
				int y = world.getSurfaceY(chunk, x, z);
				if (y > 0) {
					chunk.setBlock(x, 0, y, RealMaterial.BEDROCK);
					chunk.setBlocks(x, 1, y - middleThickness, z, materialBottom);
					chunk.setBlocks(x, y - middleThickness, y - 1, z, materialMiddle);
					
					if (y - 1 < seaLevel) {
						chunk.setBlock(x, y - 1, z, materialLiquidBase);
						chunk.setBlocks(x, y, seaLevel, z, materialLiquid);
					} else
						chunk.setBlock(x, y - 1, z, materialTop);
				}
			}
		}
	}

	@Override
	public boolean isHere(AbstractWorld world, InitializeChunk chunk) {
		return true;
	}
}
