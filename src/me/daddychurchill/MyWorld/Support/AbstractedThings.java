package me.daddychurchill.MyWorld.Support;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.material.MaterialData;

public abstract class AbstractedThings {

	public AbstractedThings() {
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
	protected static MaterialData define(Material material, DyeColor color) {
		assertTest(material);
		return new MaterialData(material, color.getData());
	}
	
}
