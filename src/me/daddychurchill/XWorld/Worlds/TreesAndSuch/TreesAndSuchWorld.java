package me.daddychurchill.XWorld.Worlds.TreesAndSuch;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.FlatChunkedWorld;
import me.daddychurchill.XWorld.Worlds.Standard.GrassPopulator;
import me.daddychurchill.XWorld.Worlds.Standard.SimpleTerrainInitializer;
import me.daddychurchill.XWorld.Worlds.Standard.SimpleTreePopulator;

public class TreesAndSuchWorld extends FlatChunkedWorld {

	public TreesAndSuchWorld(CoreGenerator generator) {
		super();
		
		initializers.add(new SimpleTerrainInitializer());
		populators.add(new GrassPopulator());
		populators.add(new WoodenFencePopulator());
		populators.add(new SimpleTreePopulator());
	}
	
	@Override
	protected int getTopY() {
		return 64;
	}
}
