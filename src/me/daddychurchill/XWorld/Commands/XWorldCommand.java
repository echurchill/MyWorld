package me.daddychurchill.XWorld.Commands;


import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.World.Environment;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import me.daddychurchill.XWorld.XWorld;
import me.daddychurchill.XWorld.Generators.CoreGenerator;

public class XWorldCommand extends AbstractCommand {

	public XWorldCommand(XWorld plugin)
    {
    	super(plugin);
    }

	@Override
	public String getKeyword() {
		return "XWorld";
	}

	public final static String worldPrime_Name = "XWorld";
	
	@Override
	public boolean doCommand(Player player, Command command, String[] arguments) {

		// look at arguments
		String worldType = "";
		Environment worldEnvironment = Environment.NORMAL;
		for (int i = 0; i < arguments.length; i++) {
			String argument = arguments[i];
			if (ifMatch(argument, "Nether"))
				worldEnvironment = Environment.NETHER;
			else if (ifMatch(argument, "The_End", "TheEnd", "End"))
				worldEnvironment = Environment.THE_END;
			else if (CoreGenerator.supportsWorldType(arguments[i]))
				worldType = arguments[i];
		}
		
		// figure out what we call it
		String worldName = worldPrime_Name;
		if (worldType.isEmpty())
			worldType = CoreGenerator.getDefaultWorldType();
		else
			worldName = worldName + "_" + worldType;
		if (worldEnvironment != Environment.NORMAL)
			worldName = worldName + "_" + worldEnvironment.name();
		
		// find it!
		player.sendMessage("Loading/creating " + worldName + "... This might take a moment...");
		World world = Bukkit.getServer().getWorld(worldName);
		if (world == null) {
			
			// if not then create/build it!
			WorldCreator creator = new WorldCreator(worldName);
			creator.environment(worldEnvironment);
			
			CoreGenerator generator = getPlugin().getCoreGenerator(worldName, worldType);
			assert(generator != null);
			
			creator.generator(generator);
			world = Bukkit.getServer().createWorld(creator);
		}
		
		// found it! or not
		if (world == null)
			return false;
		else {
			player.teleport(world.getSpawnLocation());
			return true;
		}
	}
}
