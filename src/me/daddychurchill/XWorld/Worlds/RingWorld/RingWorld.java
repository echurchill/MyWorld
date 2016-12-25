package me.daddychurchill.XWorld.Worlds.RingWorld;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.ShapedWorld;
import me.daddychurchill.XWorld.Worlds.Standard.NaturalSurfacePopulator;
import me.daddychurchill.XWorld.Worlds.Standard.SimpleTreePopulator;

public class RingWorld extends ShapedWorld {

	public RingWorld(CoreGenerator generator) {
		super(generator, new RingWorldShape(generator, 200, 120));
		
		initializers.add(new RingWorldTerrainInitializer((RingWorldShape)getWorldShape()));
		
		populators.add(new SimpleTreePopulator());
		populators.add(new NaturalSurfacePopulator());
	}
}
