package me.daddychurchill.XWorld.Worlds.SimpleNature;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.ShapedWorld;
import me.daddychurchill.XWorld.Worlds.Shapes.NaturalGroundShape;
import me.daddychurchill.XWorld.Worlds.Standard.DebugTreePopulator;
import me.daddychurchill.XWorld.Worlds.Standard.NaturalSurfacePopulator;
import me.daddychurchill.XWorld.Worlds.Standard.NaturalTerrainInitializer;

public class SimpleNatureWorld extends ShapedWorld {
	
	public SimpleNatureWorld(CoreGenerator generator) {
		super(generator, new NaturalGroundShape(generator));
		
		initializers.add(new NaturalTerrainInitializer(getWorldShape()));
		
//		populators.add(new SimpleTreePopulator());
		populators.add(new DebugTreePopulator());
		populators.add(new NaturalSurfacePopulator());
	}
}
