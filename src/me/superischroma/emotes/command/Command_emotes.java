package me.superischroma.emotes.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.superischroma.emotes.Emotes;

public class Command_emotes implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String cmdLabel, String[] args) 
    {
        Player player = (Player) cs;
        if(cmdLabel.equalsIgnoreCase("emotes")) 
        {
            if (args.length == 0) {
			    player.sendMessage(Emotes.INGAME_PREFIX + ChatColor.GREEN + "Emotes " + "v" + Emotes.PLUGIN_VERSION + " running on " + Emotes.SERVER_NAME);
			    player.sendMessage(ChatColor.GREEN + "For a list of all commands, do " + "\"" + ChatColor.AQUA + "/emotes list" + ChatColor.GREEN + "\"" + ".");
			    return true;
			}
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("list")) {
					player.sendMessage(Emotes.INGAME_PREFIX + ChatColor.LIGHT_PURPLE + "List of commands:");
 					player.sendMessage(ChatColor.GREEN + "/emotes - Main command");
 					player.sendMessage(ChatColor.GREEN + "/laugh - Laugh!");
 					player.sendMessage(ChatColor.GREEN + "/raspberry - Blow a raspberry!");
 					player.sendMessage(ChatColor.GREEN + "/dance - Do a dance!");
 					player.sendMessage(ChatColor.GREEN + "/smile - Smile!");
 					player.sendMessage(ChatColor.GREEN + "/cry - Cry... cry away...");
 					player.sendMessage(ChatColor.GREEN + "/grin - Smirkity smirk smirk!");
 					player.sendMessage(ChatColor.GREEN + "/cheer - Cheeeer!");
 					player.sendMessage(ChatColor.GREEN + "/backflip - Do a backfilp!");
 					player.sendMessage(ChatColor.GREEN + "/greet - Greets everyone on the server!");
 					player.sendMessage(ChatColor.GREEN + "/hug - Hug!");
 					player.sendMessage(ChatColor.GREEN + "/kiss - Just a little smooch!");
 					player.sendMessage(ChatColor.GREEN + "/highfive - Broosss!");
 					player.sendMessage(ChatColor.GREEN + "/slap - Someone asleep? *SLAP*");
 					return true;
				}
			}
            
        }
        return false;
    }
}
