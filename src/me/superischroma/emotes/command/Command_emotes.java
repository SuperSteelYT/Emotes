package me.superischroma.emotes.command;

import java.io.File;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import me.superischroma.emotes.Emotes;

// You are NOT allowed to edit this file directly as it is a violation of our copyright. 

public class Command_emotes implements CommandExecutor {
    FileConfiguration config;
    File cfile;
    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String cmdLabel, String[] args) 
    {
        if(cmdLabel.equalsIgnoreCase("emotes")) 
        {
            if (!(cs instanceof Player))
            {
                Bukkit.getConsoleSender().sendMessage(Emotes.CONSOLE_SENDER);
                return true;
            }
            else
            {
            if (args.length == 0)
                        {
			    cs.sendMessage(Emotes.INGAME_PREFIX + ChatColor.GREEN + "Emotes " + "v" + Emotes.PLUGIN_VERSION + " running on " + Emotes.SERVER_NAME);
                            cs.sendMessage(ChatColor.GREEN + "Created by " + Emotes.AUTHOR + " for the WowieFreedom server.");
			    cs.sendMessage(ChatColor.GREEN + "For a list of all commands, do " + "\"" + ChatColor.AQUA + "/emotes list" + ChatColor.GREEN + "\"" + ".");
			    return true;
			}
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("list")) 
                                {
					cs.sendMessage(Emotes.INGAME_PREFIX + ChatColor.LIGHT_PURPLE + "List of commands:");
 					cs.sendMessage(ChatColor.GREEN + "/emotes - Main command");
 					cs.sendMessage(ChatColor.GREEN + "/laugh - Laugh!");
 					cs.sendMessage(ChatColor.GREEN + "/raspberry - Blow a raspberry!");
 					cs.sendMessage(ChatColor.GREEN + "/dance - Do a dance!");
 					cs.sendMessage(ChatColor.GREEN + "/smile - Smile!");
 					cs.sendMessage(ChatColor.GREEN + "/cry - Cry... cry away...");
 					cs.sendMessage(ChatColor.GREEN + "/grin - Smirkity smirk smirk!");
 					cs.sendMessage(ChatColor.GREEN + "/cheer - Cheeeer!");
 					cs.sendMessage(ChatColor.GREEN + "/backflip - Do a backfilp!");
 					cs.sendMessage(ChatColor.GREEN + "/greet - Greets everyone on the server!");
 					cs.sendMessage(ChatColor.GREEN + "/hug - Hug!");
 					cs.sendMessage(ChatColor.GREEN + "/kiss - Just a little smooch!");
 					cs.sendMessage(ChatColor.GREEN + "/highfive - Broosss!");
 					cs.sendMessage(ChatColor.GREEN + "/slap - Someone asleep? *SLAP*");
                                        cs.sendMessage(ChatColor.GREEN + "/flip - Do a flip!");
                                        cs.sendMessage(ChatColor.GREEN + "/eat - Eat a nice snack!");
                                        cs.sendMessage(ChatColor.GREEN + "/tableflip - Mad? Flip a table!");
                                        cs.sendMessage(ChatColor.GREEN + "/thumbsup - Give someone a thumbs up!");
                                        cs.sendMessage(ChatColor.GREEN + "/pinch - Pinch! Ow!");
 					return true;
				}
                                if (args[0].equalsIgnoreCase("reload")) 
                                {
                                   config = YamlConfiguration.loadConfiguration(cfile);
                                   cs.sendMessage(Emotes.INGAME_PREFIX + ChatColor.GRAY + "Emotes config reloaded.");
                                }
                        }
                }
        }
        return false;
    }
}
