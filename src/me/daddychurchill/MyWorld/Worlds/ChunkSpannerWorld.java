package me.daddychurchill.MyWorld.Worlds;

import me.daddychurchill.MyWorld.Generators.CoreGenerator;
import me.daddychurchill.MyWorld.Initializers.FlatTerrainInitializer;

public class ChunkSpannerWorld extends AbstractedWorld {

	public ChunkSpannerWorld() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeGenerator(CoreGenerator generator) {
		generator.addInitializer(new FlatTerrainInitializer());
		
//		generator.addPopulator(new SingleTreePopulator());
//		generator.addPopulator(new WoodenFencePopulator());
//		generator.addPopulator(new BushPopulator());
	}

}
