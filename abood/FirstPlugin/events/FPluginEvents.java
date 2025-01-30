package com.abood.FirstPlugin.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class FPluginEvents implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.GREEN +"welcome " + player.getName());

    }
    @EventHandler
    public void onPlayerWalk(PlayerMoveEvent event) {
        Player player = event.getPlayer();
       int x= player.getLocation().getBlockX();
       int y = player.getLocation().getBlockY();
       int z = player.getLocation().getBlockZ();
        Material block = player.getWorld().getBlockAt(x, y-1, z).getType();

        if(block == Material.STONE) {
            player.sendMessage(ChatColor.GREEN + player.getName() + " you're standing on Stone, fucking idiot ");
        }

    }


}
