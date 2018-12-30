package me.daddychurchill.XWorld.Worlds.SimpleNature;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Reusable.Initializers.SimpleTerrainInitializer;
import me.daddychurchill.XWorld.Reusable.Populators.NaturalSurfacePopulator;
import me.daddychurchill.XWorld.Reusable.Populators.SimpleTreePopulator;
import me.daddychurchill.XWorld.Reusable.Shapes.NaturalGroundShape;
import me.daddychurchill.XWorld.Worlds.ShapedWorld;

public class SimpleNatureWorld extends ShapedWorld {

	public SimpleNatureWorld(CoreGenerator generator) {
		super(generator, new NaturalGroundShape(generator));

		initializers.add(new SimpleTerrainInitializer());

		populators.add(new SimpleTreePopulator());
		populators.add(new NaturalSurfacePopulator());
	}
}
