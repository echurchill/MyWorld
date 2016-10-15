package me.daddychurchill.XWorld.Worlds;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Initializers.FlatTerrainInitializer;
import me.daddychurchill.XWorld.Populators.BushPopulator;
import me.daddychurchill.XWorld.Populators.SingleTreePopulator;
import me.daddychurchill.XWorld.Populators.WoodenFencePopulator;

public class TreesOnlyWorld extends AbstractedWorld {

	public TreesOnlyWorld() {
		super();
	}

	@Override
	public void initializeGenerator(CoreGenerator generator) {

		generator.addInitializer(new FlatTerrainInitializer(generator));
		
		generator.addPopulator(new SingleTreePopulator(generator));
		generator.addPopulator(new WoodenFencePopulator(generator));
		generator.addPopulator(new BushPopulator(generator));
	}
}
