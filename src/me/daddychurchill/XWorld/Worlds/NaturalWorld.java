package me.daddychurchill.XWorld.Worlds;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Initializers.NaturalInitializer;

public class NaturalWorld extends AbstractedWorld {

	public NaturalWorld() {
	}

	@Override
	public void initializeGenerator(CoreGenerator generator) {
		generator.addInitializer(new NaturalInitializer(generator));
		
		// stuff on top?
	}
}
