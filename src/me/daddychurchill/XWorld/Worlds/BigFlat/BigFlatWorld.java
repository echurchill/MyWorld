package me.daddychurchill.XWorld.Worlds.BigFlat;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.FlatChunkedWorld;
import me.daddychurchill.XWorld.Worlds.Standard.FlatTerrainInitializer;

public class BigFlatWorld extends FlatChunkedWorld {
	
	public BigFlatWorld(CoreGenerator generator) {
		
		initializers.add(new FlatTerrainInitializer());
		
		populators.add(new BigFlatPopulator());
	}
	
	@Override
	protected int getTopY() {
		return 16;
	}
}
