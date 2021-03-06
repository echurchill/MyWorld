package me.daddychurchill.XWorld.Worlds.MotherTree;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;
import me.daddychurchill.XWorld.Worlds.AbstractedWorldFactory;

public class BigTreeFactory extends AbstractedWorldFactory {

	public BigTreeFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getStyle() {
		return "BigTree";
	}

	@Override
	public AbstractWorld getWorld(CoreGenerator generator) {
		return new BigTreeWorld(generator);
	}

}
