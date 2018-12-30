package me.daddychurchill.XWorld.Worlds.DebugNature;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Reusable.Initializers.SimpleTerrainInitializer;
import me.daddychurchill.XWorld.Reusable.Populators.DebugTreePopulator;
import me.daddychurchill.XWorld.Reusable.Shapes.NaturalGroundShape;
import me.daddychurchill.XWorld.Worlds.ShapedWorld;

public class DebugNatureWorld extends ShapedWorld {

	public DebugNatureWorld(CoreGenerator generator) {
		super(generator, new NaturalGroundShape(generator));

		initializers.add(new SimpleTerrainInitializer());

		populators.add(new DebugTreePopulator());
	}

}
