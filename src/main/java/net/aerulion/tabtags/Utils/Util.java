package net.aerulion.tabtags.Utils;

import net.aerulion.tabtags.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Util {

    public static void FormatTablist() {
        if (isStafflerOnline()) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                if (Main.AllowedUsernames.contains(p.getName())) {
                    p.setPlayerListName(Main.StringWith + p.getName());
                } else {
                    p.setPlayerListName(Main.StringWithout + p.getName());
                }
            }
        } else {
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.setPlayerListName(p.getName());
            }
        }
    }

    public static boolean isStafflerOnline() {
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (Main.AllowedUsernames.contains(p.getName())) {
                return true;
            }
        }
        return false;
    }
}