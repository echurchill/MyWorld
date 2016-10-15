package me.daddychurchill.XWorld.Worlds;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Initializers.FlatTerrainInitializer;

public class ChunkSpannerWorld extends AbstractedWorld {

	public ChunkSpannerWorld() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeGenerator(CoreGenerator generator) {
		generator.addInitializer(new FlatTerrainInitializer(generator));
		
//		generator.addPopulator(new SingleTreePopulator());
//		generator.addPopulator(new WoodenFencePopulator());
//		generator.addPopulator(new BushPopulator());
	}

}
