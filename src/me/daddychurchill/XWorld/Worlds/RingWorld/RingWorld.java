package me.daddychurchill.XWorld.Worlds.RingWorld;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Reusable.Populators.NaturalSurfacePopulator;
import me.daddychurchill.XWorld.Reusable.Populators.SimpleTreePopulator;
import me.daddychurchill.XWorld.Worlds.ShapedWorld;

public class RingWorld extends ShapedWorld {

	public RingWorld(CoreGenerator generator) {
		super(generator, new RingWorldShape(generator, 200, 120));

		initializers.add(new RingWorldTerrainInitializer((RingWorldShape) getWorldShape()));

		populators.add(new SimpleTreePopulator());
		populators.add(new NaturalSurfacePopulator());
	}
}
