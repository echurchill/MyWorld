package me.daddychurchill.XWorld.Worlds.TreesAndSuch;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Reusable.Initializers.SimpleTerrainInitializer;
import me.daddychurchill.XWorld.Reusable.Populators.NaturalSurfacePopulator;
import me.daddychurchill.XWorld.Reusable.Populators.SimpleTreePopulator;
import me.daddychurchill.XWorld.Worlds.FlatChunkedWorld;

public class TreesAndSuchWorld extends FlatChunkedWorld {

	public TreesAndSuchWorld(CoreGenerator generator) {
		super();

		initializers.add(new SimpleTerrainInitializer());
		populators.add(new NaturalSurfacePopulator());
		populators.add(new WoodenFencePopulator());
		populators.add(new SimpleTreePopulator());
	}

	@Override
	protected int getTopY() {
		return 64;
	}
}
