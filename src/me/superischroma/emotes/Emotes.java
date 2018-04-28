package me.superischroma.emotes;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import net.md_5.bungee.api.ChatColor;

public class Emotes extends JavaPlugin implements Listener {
    
	// Prefixes
	String cprefix = "[Emotes] ";
	String igprefix = ChatColor.DARK_AQUA + "[Emotes] ";
	
	// Settings; likely a temporary thing in the code
	String servername = "WowieFreedom";
	String version = "1.0";
	
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
		
		Player player = (Player) sender;
		
		// Main command; tells info about the plugin
		// You CANNOT edit this command as if you change it, I lose my credit for creating the plugin
		if (commandLabel.equalsIgnoreCase("emotes")) {
			if (args.length == 0) {
			    player.sendMessage(igprefix + ChatColor.GREEN + "Emotes " + "v" + version + " running on " + servername);
			    player.sendMessage(ChatColor.GREEN + "For a list of all commands, do " + "\"" + ChatColor.AQUA + "/emotes list" + ChatColor.GREEN + "\"" + ".");
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
				}
			}
		}
		// Emote commands
		
		if (commandLabel.equalsIgnoreCase("laugh")) {
			Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " laughs!");
		}
		if (commandLabel.equalsIgnoreCase("raspberry")) {
			Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " blows a raspberry!");
		}
		if (commandLabel.equalsIgnoreCase("dance")) {
			Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " does a dance!");
		}
		if (commandLabel.equalsIgnoreCase("smile")) {
			Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " smiles!");
		}
		if (commandLabel.equalsIgnoreCase("cry")) {
			Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " cries.");
		}
		if (commandLabel.equalsIgnoreCase("grin")) {
			Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " grins!");
		}
		if (commandLabel.equalsIgnoreCase("cheer")) {
			Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " cheers!");
		}
		if (commandLabel.equalsIgnoreCase("backflip")) {
			Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " does a backflip!");
		}
		if (commandLabel.equalsIgnoreCase("greet")) {
			Bukkit.broadcastMessage(player.getDisplayName() + ChatColor.GREEN + " greets all!");
		}
		
		return false;
		
	}
	
}