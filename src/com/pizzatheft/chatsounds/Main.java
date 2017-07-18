package com.pizzatheft.chatsounds;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	public void onEnable() {
		 
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		 
		}
    
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
    	Player p = e.getPlayer();
    	String message = e.getMessage();
            if(message.contains("")) {
                p.playSound(p.getLocation(), Sound.UI_BUTTON_CLICK, 0.75F, 2.0F);
            }
    }
}