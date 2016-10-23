package me.daddychurchill.XWorld.Commands;


import org.bukkit.entity.Player;

import me.daddychurchill.XWorld.XWorld;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public abstract class AbstractCommand implements CommandExecutor {
    private final XWorld plugin;
    protected XWorld getPlugin() {
    	return plugin;
    }

    public abstract String getKeyword();
    public abstract boolean doCommand(Player player, Command command, String[] arguments);
    
    public AbstractCommand(XWorld plugin)
    {
        this.plugin = plugin;
    }
    
    protected boolean ifMatch(String argument, String ... matches) {
    	for (int i = 0; i < matches.length; i++)
    		if (argument.equalsIgnoreCase(matches[i]))
    			return true;
    	return false;
    }

	public boolean onCommand(CommandSender sender, Command command, String label, String[] split) 
    {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (player.hasPermission(getKeyword() + ".command")) {
				return doCommand(player, command, split);
			} else {
				sender.sendMessage("You do not have permission to use this command");
			}
		} else {
			sender.sendMessage("This command is only usable by a player");
		}
		return false;
    }
	
	protected void reportMessage(String message) {
		plugin.reportMessage(message);
	}

	protected void reportMessage(String message1, String message2) {
		plugin.reportMessage(message1, message2);
	}

	protected void reportException(String message, Exception e) {
		plugin.reportException(message, e);
	}
}
