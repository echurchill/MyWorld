package me.daddychurchill.XWorld.Worlds.DiscWorld;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.ShapedWorld;
import me.daddychurchill.XWorld.Worlds.Standard.GrassPopulator;
import me.daddychurchill.XWorld.Worlds.Standard.SingleTreePopulator;

public class DiscWorld extends ShapedWorld {

	public DiscWorld(CoreGenerator generator) {
		super(generator, new DiscWorldShape(generator, 200, 120));
		
		initializers.add(new DiscWorldTerrainInitializer((DiscWorldShape)getWorldShape()));
		
		populators.add(new SingleTreePopulator());
		populators.add(new GrassPopulator());
	}
}
