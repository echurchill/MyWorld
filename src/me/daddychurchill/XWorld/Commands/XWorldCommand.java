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
	
	private static String NetherId1 = "Nether";
	private static String TheEndId1 = "The_End";
	private static String TheEndId2 = "TheEnd";
	private static String TheEndId3 = "End";
	private static String ListMode1 = "List";
	
	public static boolean ifParam(String param) {
		return ifMatch(param, NetherId1, TheEndId1, TheEndId2, TheEndId3, ListMode1);
	}
	
	@Override
	public boolean doCommand(Player player, Command command, String[] arguments) {

		// look at arguments
		boolean listMode = false;
		String worldType = "";
		Environment worldEnvironment = Environment.NORMAL;
		for (int i = 0; i < arguments.length; i++) {
			String argument = arguments[i];
			if (ifMatch(argument, NetherId1))
				worldEnvironment = Environment.NETHER;
			else if (ifMatch(argument, TheEndId1, TheEndId2, TheEndId3))
				worldEnvironment = Environment.THE_END;
			else if (ifMatch(argument, ListMode1))
				listMode = true;
			else if (CoreGenerator.supportsWorldType(arguments[i]))
				worldType = arguments[i];
		}
		
		// show the user what we can do?
		if (listMode) {
			StringBuilder result = new StringBuilder();
			result.append("/");
			result.append(getKeyword());
			result.append(" ");
			result.append(ListMode1);
			result.append(" | [");
			result.append(NetherId1);
			result.append(" | ");
			result.append(TheEndId1);
			result.append(" ]");
			String[] worldTypes = CoreGenerator.getWorldTypes();
			for (int i = 0; i < worldTypes.length; i++) {
				result.append(" ");
				result.append(worldTypes[i]);
			}
			player.sendMessage(result.toString());
			return true;
		} else {
			
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
}
