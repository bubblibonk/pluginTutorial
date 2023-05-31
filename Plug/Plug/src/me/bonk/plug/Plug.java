package me.bonk.plug;

import events.Events;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Plug extends JavaPlugin {
    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new Events(),this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN+ "Plug is enabled");
    }

    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Plug is disabled");
    }
}
