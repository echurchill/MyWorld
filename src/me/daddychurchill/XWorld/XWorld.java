package me.daddychurchill.XWorld;


import java.util.logging.Logger;

import org.bukkit.command.PluginCommand;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

import me.daddychurchill.XWorld.Commands.AbstractCommand;
import me.daddychurchill.XWorld.Commands.XWorldCommand;
import me.daddychurchill.XWorld.Generators.CoreGenerator;
import me.daddychurchill.XWorld.Worlds.Alex.AlexFactory;
import me.daddychurchill.XWorld.Worlds.BigTree.BigTreeFactory;
import me.daddychurchill.XWorld.Worlds.DiscWorld.DiscWorldFactory;
import me.daddychurchill.XWorld.Worlds.RingWorld.RingWorldFactory;
import me.daddychurchill.XWorld.Worlds.SimpleNature.SimpleNatureFactory;
import me.daddychurchill.XWorld.Worlds.TreesAndSuch.TreesAndSuchFactory;

public class XWorld extends JavaPlugin{
	
	public static final Logger log = Logger.getLogger("Minecraft.XWorld");
   	
    public XWorld() {
		super();
		
		CoreGenerator.addWorldType(new TreesAndSuchFactory());
		CoreGenerator.addWorldType(new SimpleNatureFactory());
		CoreGenerator.addWorldType(new AlexFactory());
		CoreGenerator.addWorldType(new BigTreeFactory());
		CoreGenerator.addWorldType(new RingWorldFactory());
		CoreGenerator.addWorldType(new DiscWorldFactory());
	}

	public CoreGenerator getCoreGenerator(String name, String style){
		return CoreGenerator.getCoreGeneratorFor(this, name, style);
	}
    
    @Override
	public ChunkGenerator getDefaultWorldGenerator(String name, String style){
    	return getCoreGenerator(name, style);
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
		addCommand(new XWorldCommand(this));

		// configFile can be retrieved via getConfig()
		//reportMessage("Enabled" );
	}
	
	private void addCommand(AbstractCommand exec) {
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

