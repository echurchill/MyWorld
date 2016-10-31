package me.daddychurchill.XWorld.Worlds.TreesAndSuch;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.FlatChunkedWorld;
import me.daddychurchill.XWorld.Worlds.Standard.GrassPopulator;
import me.daddychurchill.XWorld.Worlds.Standard.FlatTerrainInitializer;
import me.daddychurchill.XWorld.Worlds.Standard.SingleTreePopulator;

public class TreesAndSuchWorld extends FlatChunkedWorld {

	public TreesAndSuchWorld(CoreGenerator generator) {
		super();
		
		initializers.add(new FlatTerrainInitializer());
		populators.add(new GrassPopulator());
		populators.add(new WoodenFencePopulator());
		populators.add(new SingleTreePopulator());
	}
	
	@Override
	protected int getTopY() {
		return 64;
	}
}
