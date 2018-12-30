package me.daddychurchill.XWorld.Worlds.DiscWorld;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Reusable.Populators.NaturalSurfacePopulator;
import me.daddychurchill.XWorld.Reusable.Populators.NaturalTreePopulator;
import me.daddychurchill.XWorld.Worlds.ShapedWorld;

public class DiscWorld extends ShapedWorld {

	public DiscWorld(CoreGenerator generator) {
		super(generator, new DiscWorldShape(generator, 1000, 32, 30, 245));

		initializers.add(new DiscWorldTerrainInitializer((DiscWorldShape) getWorldShape()));

		populators.add(new NaturalTreePopulator(generator));
		populators.add(new NaturalSurfacePopulator());
	}
}
