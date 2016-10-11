package me.daddychurchill.MyWorld.Worlds;

import me.daddychurchill.MyWorld.Generators.CoreGenerator;
import me.daddychurchill.MyWorld.Initializers.NaturalInitializer;

public class NaturalWorld extends AbstractedWorld {

	public NaturalWorld() {
	}

	@Override
	public void initializeGenerator(CoreGenerator generator) {
		generator.addInitializer(new NaturalInitializer(generator));
		
		// stuff on top?
	}
}
