package net.aerulion.tabtags;

import net.aerulion.tabtags.Listener.JoinQuitListener;
import net.aerulion.tabtags.Utils.CMD_RELOAD;
import net.aerulion.tabtags.Utils.Config;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class Main extends JavaPlugin {

    public static Main plugin;
    public static String StringWith;
    public static String StringWithout;
    public static List<String> AllowedUsernames;

    public void onEnable() {
        plugin = this;
        Config.copyDefault();
        Config.LoadData();
        getServer().getPluginManager().registerEvents(new JoinQuitListener(), this);
        getCommand("tabtagsreload").setExecutor(new CMD_RELOAD());
        getCommand("tabtagsreload").setTabCompleter(new CMD_RELOAD());
    }
}