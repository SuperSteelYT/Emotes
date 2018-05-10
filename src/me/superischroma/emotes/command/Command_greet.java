package me.superischroma.emotes.command;

import me.superischroma.emotes.Emotes;
import static me.superischroma.emotes.Emotes.INGAME_PREFIX;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_greet implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String cmdLabel, String[] args) 
    {
        Player player = (Player) cs;
		if (cmdLabel.equalsIgnoreCase("greet")) {
            if (args.length == 0)
            {
                Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " greets everyone!");
                return true;
            }
            if (args.length > 1)
            {
                return false;
            }
            Player p = Bukkit.getPlayer(args[0]);
            if (p == null)
            {
                cs.sendMessage(Emotes.PLAYER_NOT_FOUND);
                return true;
            }
            Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " greets " + p.getDisplayName() + ChatColor.GREEN + "!");
            return true;
		}
        return false;
    }
}