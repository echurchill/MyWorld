package me.daddychurchill.XWorld;

import org.bukkit.configuration.file.FileConfiguration;

import me.daddychurchill.XWorld.Generators.CoreGenerator;

public class Config {
	private CoreGenerator generator;
	
	private int streetLevel;
	private int seabedLevel;
	
	public final static int defaultStreetLevel = 64;
	public final static int defaultSeabedLevel = 32;
	
	public Config(CoreGenerator generator) {
		super();
		
		this.generator = generator;
		
		// remember the globals
		int globalStreetLevel = defaultStreetLevel;
		int globalSeabedLevel = defaultSeabedLevel;
		
		// global read yet?
		FileConfiguration config = generator.getPlugin().getConfig();
		config.options().header("XWorld Global Options");
		config.addDefault("Global.StreetLevel", defaultStreetLevel);
		config.addDefault("Global.SeabedLevel", defaultSeabedLevel);
		config.options().copyDefaults(true);
		generator.getPlugin().saveConfig();
		
		// now read out the bits for real
		globalStreetLevel = config.getInt("Global.StreetLevel");
		globalSeabedLevel = config.getInt("Global.SeabedLevel");
		
		// grab the world specific values else use the globals
		streetLevel = getWorldInt(config, "StreetLevel", globalStreetLevel);
		seabedLevel = getWorldInt(config, "SeabedLevel", globalSeabedLevel);
	}
	
	private int getWorldInt(FileConfiguration config, String option, int global) {
		int result = global;
		String path = generator.getName() + "." + option;
		if (config.isSet(path))
			result = config.getInt(path);
		return result;
	}
	
//	private double getWorldDouble(FileConfiguration config, String option, double global) {
//		double result = global;
//		String path = worldname + "." + option;
//		if (config.isSet(path))
//			result = config.getDouble(path);
//		return result;
//	}
//	
//	private boolean getWorldBoolean(FileConfiguration config, String option, boolean global) {
//		boolean result = global;
//		String path = worldname + "." + option;
//		if (config.isSet(path))
//			result = config.getBoolean(path);
//		return result;
//	}
	
	public int getStreetLevel() {
		return streetLevel;
	}

	public int getSeabedLevel() {
		return seabedLevel;
	}
	
}
