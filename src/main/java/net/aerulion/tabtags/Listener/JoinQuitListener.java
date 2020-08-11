package net.aerulion.tabtags.Listener;

import net.aerulion.tabtags.Main;
import net.aerulion.tabtags.Utils.Util;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;


public class JoinQuitListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Util.FormatTablist();
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Bukkit.getServer().getScheduler().runTaskLater(Main.plugin, Util::FormatTablist, 1L);
    }
}