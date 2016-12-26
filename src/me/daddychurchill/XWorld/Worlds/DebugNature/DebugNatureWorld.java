package me.daddychurchill.XWorld.Worlds.DebugNature;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.ShapedWorld;
import me.daddychurchill.XWorld.Worlds.Shapes.FlatGroundShape;
import me.daddychurchill.XWorld.Worlds.Standard.DebugTreePopulator;
import me.daddychurchill.XWorld.Worlds.Standard.SimpleTerrainInitializer;

public class DebugNatureWorld extends ShapedWorld {

	public DebugNatureWorld(CoreGenerator generator) {
		super(generator, new FlatGroundShape(32));
		
		initializers.add(new SimpleTerrainInitializer());
		
		populators.add(new DebugTreePopulator());
	}

}
