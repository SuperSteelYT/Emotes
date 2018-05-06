package me.superischroma.emotes.command;

import static me.superischroma.emotes.Emotes.INGAME_PREFIX;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_hug implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String cmdLabel, String[] args) 
    {
        Player player = (Player) cs;
                    if (cmdLabel.equalsIgnoreCase("hug")) {
                if (args.length == 0)
                {
                    Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " hugs themselves!");
                    return true;
                }
                if (args.length > 1)
                {
                    return false;
                }
            Player p = Bukkit.getPlayer(args[0]);
                if (p == null)
                {
                    cs.sendMessage(INGAME_PREFIX + ChatColor.GRAY + "Player not found!");
                    return true;
                }
            Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " hugs " + p.getDisplayName() + ChatColor.GREEN + "!");
            return true;
            }
        return false;
    }
}
