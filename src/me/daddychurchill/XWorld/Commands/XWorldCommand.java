package me.daddychurchill.XWorld.Commands;


import org.bukkit.entity.Player;

import me.daddychurchill.XWorld.XWorld;

public class XWorldCommand extends AbstractedCommand {

	public XWorldCommand(XWorld plugin)
    {
    	super(plugin);
    }

	@Override
	public String getKeyword() {
		return "XWorld";
	}

	@Override
	public boolean doCommand(Player player, String[] arguments) {
		player.sendMessage("Loading/creating XWorld... This might take a moment...");
		player.teleport(plugin.getXWorld().getSpawnLocation());
		return true;
	}
}
