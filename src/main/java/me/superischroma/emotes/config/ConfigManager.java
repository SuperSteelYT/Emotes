package me.superischroma.emotes.config;

import java.io.File;
import java.io.IOException;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import me.superischroma.emotes.Emotes;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class ConfigManager {
    
    private Emotes plugin = Emotes.getPlugin(Emotes.class);
    
    // Files and File Configurations here
    public FileConfiguration playerscfg;
    public File configfile;
    
    // Setup and Check
    public void setup() 
    {
        if (!plugin.getDataFolder().exists()) 
        {
            plugin.getDataFolder().mkdir();
        }
        
        configfile = new File(plugin.getDataFolder(), "config.yml");
        
        if (!configfile.exists())
        {
        try 
        {
            configfile.createNewFile();
            } catch (IOException e) 
            {
            Bukkit.getServer().getConsoleSender()
                    .sendMessage(Emotes.CONSOLE_PREFIX + ChatColor.RED + "Could not create config.yml");
            }
        }
    
    playerscfg = YamlConfiguration.loadConfiguration(configfile);
    Bukkit.getServer().getConsoleSender()
                    .sendMessage(Emotes.CONSOLE_PREFIX + ChatColor.GREEN + "Created config.yml");
    }
    
    public FileConfiguration getPlayers() 
    {
        return playerscfg;
    }
    
    public void savePlayers() 
    {
        try 
        {
            playerscfg.save(configfile);
            Bukkit.getServer().getConsoleSender().sendMessage(Emotes.CONSOLE_PREFIX + ChatColor.GREEN + "Saved config.yml");
        } catch (IOException e) {
            Bukkit.getServer().getConsoleSender().sendMessage(Emotes.CONSOLE_PREFIX + ChatColor.RED + "Could not save config.yml");
        }
            
    }
    
    public void reloadPlayers() 
    {
        playerscfg = YamlConfiguration.loadConfiguration(configfile);
    }

}

