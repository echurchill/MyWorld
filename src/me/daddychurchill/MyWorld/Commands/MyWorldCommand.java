package me.daddychurchill.MyWorld.Commands;


import org.bukkit.entity.Player;

import me.daddychurchill.MyWorld.MyWorld;

public class MyWorldCommand extends AbstractedCommand {

	public MyWorldCommand(MyWorld plugin)
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
