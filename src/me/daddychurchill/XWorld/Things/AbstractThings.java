package me.daddychurchill.XWorld.Things;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

public abstract class AbstractThings {

	public AbstractThings() {
		// nothing to do
	}

	protected static void assertTest(Material material) {
		// no problem, everything works here
	}
	
	protected static MaterialData define(Material material) {
		assertTest(material);
		return new MaterialData(material);
	}
	
	@SuppressWarnings("deprecation")
	protected static MaterialData define(Material material, int data) {
		assertTest(material);
		return new MaterialData(material, (byte)data);
	}
	
	@SuppressWarnings("deprecation")
	protected static MaterialData define(Material material, int data, int orWith) {
		assertTest(material);
		return new MaterialData(material, (byte)(data + orWith));
	}
}
