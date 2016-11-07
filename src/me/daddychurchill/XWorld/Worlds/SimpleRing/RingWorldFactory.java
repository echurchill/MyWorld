package me.daddychurchill.XWorld.Worlds.SimpleRing;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;
import me.daddychurchill.XWorld.Worlds.AbstractedWorldFactory;

public class RingWorldFactory extends AbstractedWorldFactory {

	public RingWorldFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getStyle() {
		return "RingWorld";
	}

	@Override
	public AbstractWorld getWorld(CoreGenerator generator) {
		return new RingWorld(generator);
	}

}
