package me.daddychurchill.XWorld.Commands;


import org.bukkit.entity.Player;

import me.daddychurchill.XWorld.XWorld;

public class MyWorldCommand extends AbstractedCommand {

	public MyWorldCommand(XWorld plugin)
    {
    	super(plugin);
    }

	@Override
	public String getKeyword() {
		return "MyWorld";
	}

	@Override
	public boolean doCommand(Player player, String[] arguments) {
		player.sendMessage("Loading/creating MyWorld... This might take a moment...");
		player.teleport(plugin.getMyWorld().getSpawnLocation());
		return true;
	}
}
