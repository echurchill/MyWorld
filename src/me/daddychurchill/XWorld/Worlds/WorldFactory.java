package me.daddychurchill.XWorld.Worlds;

import me.daddychurchill.XWorld.Generators.CoreGenerator;

public abstract class WorldFactory {

	public WorldFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract String getStyle();
	public abstract AbstractWorld getWorld(CoreGenerator generator);
}
