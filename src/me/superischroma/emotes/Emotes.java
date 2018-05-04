package me.superischroma.emotes;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public class Emotes extends JavaPlugin implements Listener {
    
	// Prefixes
	String cprefix = "[Emotes] ";
	String igprefix = ChatColor.DARK_AQUA + "[Emotes] ";
	
	// Settings; likely a temporary thing in the code
	String servername = "WowieFreedom";
	String version = "1.11.1";
	
    // Making it easier to send messages to console
	ConsoleCommandSender console = getServer().getConsoleSender();
	
	// When the plugin enables
	public void onEnable() {
		console.sendMessage(cprefix + "Enabled Emotes v" + version);
		// Checks for players using onPlayerJoin()
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	// When the plugin disables
	public void onDisable() {
		console.sendMessage(cprefix + "Disabled Emotes v" + version);
	}
	// All commands
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		// Defining "player"
		Player player = (Player) sender;
		
		// Main command; tells info about the plugin
		// You CANNOT edit this command as if you change it, I lose my credit for creating the plugin
		if (commandLabel.equalsIgnoreCase("emotes")) {
			if (args.length == 0) {
			    player.sendMessage(igprefix + ChatColor.GREEN + "Emotes " + "v" + version + " running on " + servername);
			    player.sendMessage(ChatColor.GREEN + "For a list of all commands, do " + "\"" + ChatColor.AQUA + "/emotes list" + ChatColor.GREEN + "\"" + ".");
			    return true;
			}
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("list")) {
					player.sendMessage(igprefix + ChatColor.LIGHT_PURPLE + "List of commands:");
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
		// Emote commands
		if (commandLabel.equalsIgnoreCase("laugh")) {
			if (args.length == 0)
            {
                Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " laughs!");
                return true;
            }
            if (args.length > 1)
            {
                return false;
            }
            Player p = Bukkit.getPlayer(args[0]);
            if (p == null)
            {
                sender.sendMessage(igprefix + ChatColor.GRAY + "Player not found!");
                return true;
            }
            Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " laughs at " + p.getDisplayName() + ChatColor.GREEN + "!");
            return true;
		}
		if (commandLabel.equalsIgnoreCase("raspberry")) {
			if (args.length == 0)
            {
                Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " blows a raspberry!");
                return true;
            }
            if (args.length > 1)
            {
                return false;
            }
            Player p = Bukkit.getPlayer(args[0]);
            if (p == null)
            {
                sender.sendMessage(igprefix + ChatColor.GRAY + "Player not found!");
                return true;
            }
            Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " blows a raspberry at " + p.getDisplayName() + ChatColor.GREEN + "!");
            return true;
		}
		if (commandLabel.equalsIgnoreCase("dance")) {
			if (args.length == 0)
            {
                Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " does a dance!");
                return true;
            }
            if (args.length > 1)
            {
                return false;
            }
            Player p = Bukkit.getPlayer(args[0]);
            if (p == null)
            {
                sender.sendMessage(igprefix + ChatColor.GRAY + "Player not found!");
                return true;
            }
            Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " dances with " + p.getDisplayName() + ChatColor.GREEN + "!");
            return true;
		}
		if (commandLabel.equalsIgnoreCase("smile")) {
			if (args.length == 0)
            {
                Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " smiles!");
                return true;
            }
            if (args.length > 1)
            {
                return false;
            }
            Player p = Bukkit.getPlayer(args[0]);
            if (p == null)
            {
                sender.sendMessage(igprefix + ChatColor.GRAY + "Player not found!");
                return true;
            }
            Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " smiles at " + p.getDisplayName() + ChatColor.GREEN + "!");
            return true;
		}
		if (commandLabel.equalsIgnoreCase("cry")) {
			if (args.length == 0)
            {
                Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " cries.");
                return true;
            }
            if (args.length > 1)
            {
                return false;
            }
            Player p = Bukkit.getPlayer(args[0]);
            if (p == null)
            {
                sender.sendMessage(igprefix + ChatColor.GRAY + "Player not found!");
                return true;
            }
            Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " cries on " + p.getDisplayName() + ChatColor.GREEN + ".");
            return true;
		}
		if (commandLabel.equalsIgnoreCase("grin")) {
			if (args.length == 0)
            {
                Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " grins!");
                return true;
            }
            if (args.length > 1)
            {
                return false;
            }
            Player p = Bukkit.getPlayer(args[0]);
            if (p == null)
            {
                sender.sendMessage(igprefix + ChatColor.GRAY + "Player not found!");
                return true;
            }
            Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " grins at " + p.getDisplayName() + ChatColor.GREEN + "!");
            return true;
		}
		if (commandLabel.equalsIgnoreCase("cheer")) {
			if (args.length == 0)
            {
                Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " cheers!");
                return true;
            }
            if (args.length > 1)
            {
                return false;
            }
            Player p = Bukkit.getPlayer(args[0]);
            if (p == null)
            {
                sender.sendMessage(igprefix + ChatColor.GRAY + "Player not found!");
                return true;
            }
            Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " cheers for " + p.getDisplayName() + ChatColor.GREEN + "!");
            return true;
		}
		if (commandLabel.equalsIgnoreCase("backflip")) {
			Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " does a backflip!");
			return true;
		}
		if (commandLabel.equalsIgnoreCase("greet")) {
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
                sender.sendMessage(igprefix + ChatColor.GRAY + "Player not found!");
                return true;
            }
            Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " greets " + p.getDisplayName() + ChatColor.GREEN + "!");
            return true;
		}
		if (commandLabel.equalsIgnoreCase("hug")) {
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
                sender.sendMessage(igprefix + ChatColor.GRAY + "Player not found!");
                return true;
            }
            Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " hugs " + p.getDisplayName() + ChatColor.GREEN + "!");
            return true;
        }
		if (commandLabel.equalsIgnoreCase("kiss")) {
            if (args.length == 0)
            {
                Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " puckers up!");
                return true;
            }
            if (args.length > 1)
            {
                return false;
            }
            Player p = Bukkit.getPlayer(args[0]);
            if (p == null)
            {
                sender.sendMessage(igprefix + ChatColor.GRAY + "Player not found!");
                return true;
            }
            Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " kisses " + p.getDisplayName() + ChatColor.GREEN + "!");
            return true;
        }
		if (commandLabel.equalsIgnoreCase("highfive")) {
            if (args.length == 0)
            {
                Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " raises his hand for a highfive!");
                return true;
            }
            if (args.length > 1)
            {
                return false;
            }
            Player p = Bukkit.getPlayer(args[0]);
            if (p == null)
            {
                sender.sendMessage(igprefix + ChatColor.GRAY + "Player not found!");
                return true;
            }
            Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " highfives " + p.getDisplayName() + ChatColor.GREEN + "!");
            return true;
        }
		if (commandLabel.equalsIgnoreCase("slap")) {
            if (args.length == 0)
            {
                Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " slaps themselves!");
                return true;
            }
            if (args.length > 1)
            {
                return false;
            }
            Player p = Bukkit.getPlayer(args[0]);
            if (p == null)
            {
                sender.sendMessage(igprefix + ChatColor.GRAY + "Player not found!");
                return true;
            }
            Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " slaps " + p.getDisplayName() + ChatColor.GREEN + "!");
            return true;
        }
		return false;
	}
}
