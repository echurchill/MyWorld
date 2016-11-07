package me.daddychurchill.XWorld.Worlds.Alex;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.ShapedWorld;
import me.daddychurchill.XWorld.Worlds.Shapes.NaturalGroundShape;
import me.daddychurchill.XWorld.Worlds.Standard.NaturalTerrainInitializer;

public class AlexWorld extends ShapedWorld {
	
	public AlexWorld(CoreGenerator generator) {
		super(generator, new NaturalGroundShape(generator));
		
		initializers.add(new NaturalTerrainInitializer(getWorldShape()));
		
		populators.add(new AlexPopulator());
	}
}
