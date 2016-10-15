package me.daddychurchill.XWorld;


import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.command.PluginCommand;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

import me.daddychurchill.XWorld.Commands.AbstractedCommand;
import me.daddychurchill.XWorld.Commands.MyWorldCommand;
import me.daddychurchill.XWorld.Generators.CoreGenerator;

public class XWorld extends JavaPlugin{
	
	public static final Logger log = Logger.getLogger("Minecraft.MyWorld");
   	
    public XWorld() {
		super();
	}

	@Override
	public ChunkGenerator getDefaultWorldGenerator(String name, String style){
		return getChunkGenerator(name, style);
	}
	
	private ChunkGenerator getChunkGenerator(String name, String style) {
		CoreGenerator generator = new CoreGenerator(this, name, style);

		return generator;
	}

	@Override
	public void onDisable() {
		// remember for the next time
		saveConfig();
		
		// tell the world we are out of here
		//reportMessage("Disabled");
	}

	@Override
	public void onEnable() {
		
		// figure out permissions and associated commands
		addCommand(new MyWorldCommand(this));

		// configFile can be retrieved via getConfig()
		//reportMessage("Enabled" );
	}
	
	private void addCommand(AbstractedCommand exec) {
		if (exec != null) {
			PluginCommand cmd = getCommand(exec.getKeyword());
			if (cmd != null) {
				cmd.setExecutor(exec);
				return;
			}
			reportMessage("!!!! Cannot create command for " + exec.getKeyword());
		} else
			reportMessage("!!!! Cannot create command for NULL");
	}
	
    // prime world support (loosely based on ExpansiveTerrain)
	public final static String worldPrime_Name = "MyWorld";
	private World worldPrime = null;
	public World getMyWorld() {
		
		// created yet?
		if (worldPrime == null) {
			
			// built yet?
			worldPrime = Bukkit.getServer().getWorld(worldPrime_Name);
			if (worldPrime == null) {
				
				// if neither then create/build it!
				WorldCreator creator = new WorldCreator(worldPrime_Name);
				creator.environment(World.Environment.NORMAL);
				creator.generator(getChunkGenerator(worldPrime_Name, ""));
				worldPrime = Bukkit.getServer().createWorld(creator);
			}
		}
		return worldPrime;
	}
	
	public String getPluginName() {
		return getDescription().getName();
	}
	
	private String getQuotedPluginName() {
		return "[" + getPluginName() + "]";
	}
	
	public void reportMessage(String message) {
		if (!message.startsWith("["))
			message = " " + message;
		log.info(getQuotedPluginName() + message);
	}

	public void reportMessage(String message1, String message2) {
		reportMessage(message1);
		log.info(" \\__" + message2);
	}

	public void reportException(String message, Exception e) {
		reportMessage(message, "Exception: " + e.getMessage());
		e.printStackTrace();
	}
	
}

