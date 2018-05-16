package me.superischroma.emotes;

import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import me.superischroma.emotes.command.*;

/*
 Release Details:
 Version 1.17
 Compiled by Super_

 Changelog:
 Small update - file directory changes & removed some unused imports

 Planned Changes:
 Work on EmotesCommand.java and config file
*/

public class Emotes extends JavaPlugin implements Listener {
        
        
	// Prefixes
	public static final String CONSOLE_PREFIX = "[Emotes] ";
	public static final String INGAME_PREFIX = ChatColor.DARK_AQUA + "[Emotes] ";
	
	// Settings
	public static final String SERVER_NAME = "WowieFreedom";
	public static final String PLUGIN_VERSION = "1.17";
        
        // Variables
        public static final String PLAYER_NOT_FOUND = INGAME_PREFIX + ChatColor.GRAY + "Player not found!";
        public static final String CONSOLE_SENDER = ChatColor.RED + "You cannot execute this command from console!";
        
        // Author; Editing this is NOT allowed.
	public static final String AUTHOR = "Super_";
        

        // Making it easier to send messages to console
	ConsoleCommandSender console = getServer().getConsoleSender();
        
	// When the plugin enables
        @Override
	public void onEnable() {
		console.sendMessage(CONSOLE_PREFIX + "Enabled Emotes v" + PLUGIN_VERSION);
                // Commands
                this.getCommand("emotes").setExecutor(new Command_emotes());
                this.getCommand("backflip").setExecutor(new Command_backflip());
                this.getCommand("cheer").setExecutor(new Command_cheer());
                this.getCommand("cry").setExecutor(new Command_cry());
                this.getCommand("dance").setExecutor(new Command_dance());
                this.getCommand("greet").setExecutor(new Command_greet());
                this.getCommand("grin").setExecutor(new Command_grin());
                this.getCommand("highfive").setExecutor(new Command_highfive());
                this.getCommand("hug").setExecutor(new Command_hug());
                this.getCommand("kiss").setExecutor(new Command_kiss());
                this.getCommand("laugh").setExecutor(new Command_laugh());
                this.getCommand("raspberry").setExecutor(new Command_raspberry());
                this.getCommand("slap").setExecutor(new Command_slap());
                this.getCommand("smile").setExecutor(new Command_smile());
                this.getCommand("thumbsup").setExecutor(new Command_thumbsup());
                this.getCommand("flip").setExecutor(new Command_flip());
                this.getCommand("eat").setExecutor(new Command_eat());
                this.getCommand("tableflip").setExecutor(new Command_tableflip());
                this.getCommand("pinch").setExecutor(new Command_pinch());
                Bukkit.getServer().getPluginManager().registerEvents(this, this);
                
	}
	
	// When the plugin disables
        @Override
	public void onDisable() {
		console.sendMessage(CONSOLE_PREFIX + "Disabled Emotes v" + PLUGIN_VERSION);
	}
}