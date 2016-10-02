package me.daddychurchill.MyWorld.Worlds;

import me.daddychurchill.MyWorld.Generators.CoreGenerator;
import me.daddychurchill.MyWorld.Initializers.FlatTerrainInitializer;
import me.daddychurchill.MyWorld.Populators.BushPopulator;
import me.daddychurchill.MyWorld.Populators.SingleTreePopulator;
import me.daddychurchill.MyWorld.Populators.WoodenFencePopulator;

public class TreesOnlyWorld extends AbstractedWorld {

	public TreesOnlyWorld() {
		super();
	}

	@Override
	public void initializeGenerator(CoreGenerator generator) {

		generator.addInitializer(new FlatTerrainInitializer());
		
		generator.addPopulator(new SingleTreePopulator());
		generator.addPopulator(new WoodenFencePopulator());
		generator.addPopulator(new BushPopulator());
	}

}
