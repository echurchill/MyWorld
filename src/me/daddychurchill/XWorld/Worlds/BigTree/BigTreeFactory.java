package me.daddychurchill.XWorld.Worlds.BigTree;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;
import me.daddychurchill.XWorld.Worlds.WorldFactory;

public class BigTreeFactory extends WorldFactory {

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
