package me.daddychurchill.MyWorld.Support;


import org.bukkit.entity.Player;

import me.daddychurchill.MyWorld.MyWorld;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public abstract class AbstractedCommand implements CommandExecutor {
    protected final MyWorld plugin;

    public abstract String getKeyword();
    public abstract boolean doCommand(Player player, String[] arguments);
    
    public AbstractedCommand(MyWorld plugin)
    {
        this.plugin = plugin;
    }

	public boolean onCommand(CommandSender sender, Command command, String label, String[] split) 
    {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (player.hasPermission(getKeyword() + ".command")) {
				return doCommand(player, split);
			} else {
				sender.sendMessage("You do not have permission to use this command");
				return false;
			}
		} else {
			sender.sendMessage("This command is only usable by a player");
			return false;
		}
    }
}
