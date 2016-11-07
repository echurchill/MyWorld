package me.daddychurchill.XWorld.Worlds.Alex;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;
import me.daddychurchill.XWorld.Worlds.AbstractedWorldFactory;

public class AlexFactory extends AbstractedWorldFactory {

	public AlexFactory() {

	}

	@Override
	public String getStyle() {
		return "Alex";
	}

	@Override
	public AbstractWorld getWorld(CoreGenerator generator) {
		return new AlexWorld(generator);
	}

}
