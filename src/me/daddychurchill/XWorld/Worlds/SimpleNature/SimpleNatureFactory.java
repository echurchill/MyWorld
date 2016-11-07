package me.daddychurchill.XWorld.Worlds.SimpleNature;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;
import me.daddychurchill.XWorld.Worlds.AbstractedWorldFactory;

public class SimpleNatureFactory extends AbstractedWorldFactory {

	public SimpleNatureFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getStyle() {
		return "SimpleNature";
	}

	@Override
	public AbstractWorld getWorld(CoreGenerator generator) {
		return new SimpleNatureWorld(generator);
	}

}
