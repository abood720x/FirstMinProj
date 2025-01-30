package com.abood.FirstPlugin;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import com.abood.FirstPlugin.events.FPluginEvents;

public class FPlugin extends JavaPlugin {
    @Override
   public void onEnable() {
        getServer().getPluginManager().registerEvents(new FPluginEvents() ,this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Hello World!");

    }

    @Override
    public void onDisable() {

        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Bye World!");

    }

}
