package me.daddychurchill.XWorld.Worlds.BigFlat;

import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.AbstractWorld;
import me.daddychurchill.XWorld.Worlds.WorldFactory;

public class BigFlatFactory extends WorldFactory {

	public BigFlatFactory() {

	}

	@Override
	public String getStyle() {
		return "BigFlat";
	}

	@Override
	public AbstractWorld getWorld(CoreGenerator generator) {
		return new BigFlatWorld(generator);
	}

}
