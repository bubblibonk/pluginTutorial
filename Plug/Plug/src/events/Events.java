package events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import static org.bukkit.Bukkit.getServer;

public class Events implements Listener {
    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event){
       Player player = event.getPlayer();
       player.sendMessage(ChatColor.DARK_PURPLE + "Welcome to the server");
    }
    @EventHandler
    public static void onPlayerQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();
        Location cords = player.getLocation();
        int x = player.getLocation().getBlockX();
        int y = player.getLocation().getBlockY();
        int z = player.getLocation().getBlockZ();
        getServer().broadcastMessage(ChatColor.BLUE + player.getDisplayName() + " left at x: " +x + " y: " + y + " z: " +z);
    }
}

