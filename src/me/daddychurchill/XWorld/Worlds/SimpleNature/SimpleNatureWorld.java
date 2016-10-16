package me.daddychurchill.XWorld.Worlds.SimpleNature;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.ChunkedWorld;

public class SimpleNatureWorld extends ChunkedWorld {
	
	public SimpleNatureWorld(CoreGenerator generator) {
		
		initializers.add(new NaturalInitializer(generator));
	}
}
