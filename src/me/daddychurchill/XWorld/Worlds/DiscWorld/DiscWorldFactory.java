package me.daddychurchill.XWorld.Worlds.DiscWorld;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;
import me.daddychurchill.XWorld.Worlds.AbstractedWorldFactory;

public class DiscWorldFactory extends AbstractedWorldFactory {

	public DiscWorldFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getStyle() {
		return "DiscWorld";
	}

	@Override
	public AbstractWorld getWorld(CoreGenerator generator) {
		return new DiscWorld(generator);
	}
}
