package me.daddychurchill.XWorld.Worlds.DiscWorld;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.ShapedWorld;
import me.daddychurchill.XWorld.Worlds.Standard.GrassPopulator;
import me.daddychurchill.XWorld.Worlds.Standard.NoisyTreePopulator;

public class DiscWorld extends ShapedWorld {

	public DiscWorld(CoreGenerator generator) {
		super(generator, new DiscWorldShape(generator, 500, 64, 20, 225));
		
		initializers.add(new DiscWorldTerrainInitializer((DiscWorldShape)getWorldShape()));
		
		populators.add(new NoisyTreePopulator(generator));
		populators.add(new GrassPopulator());
	}
}
