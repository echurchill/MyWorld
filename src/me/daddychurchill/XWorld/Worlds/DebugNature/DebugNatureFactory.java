package me.daddychurchill.XWorld.Worlds.DebugNature;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;
import me.daddychurchill.XWorld.Worlds.AbstractedWorldFactory;

public class DebugNatureFactory extends AbstractedWorldFactory {

	public DebugNatureFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getStyle() {
		return "DebugNature";
	}

	@Override
	public AbstractWorld getWorld(CoreGenerator generator) {
		return new DebugNatureWorld(generator);
	}

}
