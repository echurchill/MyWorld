package me.daddychurchill.XWorld.Worlds;

import me.daddychurchill.XWorld.Generators.CoreGenerator;

public abstract class AbstractedWorldFactory {

	public AbstractedWorldFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract String getStyle();
	public abstract AbstractWorld getWorld(CoreGenerator generator);
}
