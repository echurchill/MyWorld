package me.daddychurchill.XWorld.Worlds.TreesAndSuch;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.ChunkedWorld;

public class TreesAndSuchWorld extends ChunkedWorld {

	public TreesAndSuchWorld(CoreGenerator generator) {
		super();
		
		initializers.add(new FlatTerrainInitializer());
		populators.add(new BushPopulator());
		populators.add(new WoodenFencePopulator());
		populators.add(new SingleTreePopulator());
	}
}
