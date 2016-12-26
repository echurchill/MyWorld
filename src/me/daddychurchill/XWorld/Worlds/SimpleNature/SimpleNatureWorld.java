package me.daddychurchill.XWorld.Worlds.SimpleNature;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.ShapedWorld;
import me.daddychurchill.XWorld.Worlds.Shapes.NaturalGroundShape;
import me.daddychurchill.XWorld.Worlds.Standard.NaturalSurfacePopulator;
import me.daddychurchill.XWorld.Worlds.Standard.SimpleTerrainInitializer;
import me.daddychurchill.XWorld.Worlds.Standard.SimpleTreePopulator;

public class SimpleNatureWorld extends ShapedWorld {
	
	public SimpleNatureWorld(CoreGenerator generator) {
		super(generator, new NaturalGroundShape(generator));
		
		initializers.add(new SimpleTerrainInitializer());
		
		populators.add(new SimpleTreePopulator());
		populators.add(new NaturalSurfacePopulator());
	}
}
