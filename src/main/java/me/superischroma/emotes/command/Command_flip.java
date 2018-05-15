package me.superischroma.emotes.command;

import me.superischroma.emotes.Emotes;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_flip implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String cmdLabel, String[] args) 
    {
        if (!(cs instanceof Player))
        {
            Bukkit.getConsoleSender().sendMessage(Emotes.CONSOLE_SENDER);
            return true;
        }
        else
        {
		if (cmdLabel.equalsIgnoreCase("flip")) {
			Bukkit.broadcastMessage(((Player) cs).getDisplayName() + ChatColor.GREEN + " does a flip!");
			return true;
		}
        }
        return false;
    }
}