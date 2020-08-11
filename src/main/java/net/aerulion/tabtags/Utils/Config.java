package net.aerulion.tabtags.Utils;

import net.aerulion.tabtags.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class Config {

    public static void copyDefault() {
        FileConfiguration cfg = getFileConfiguration();
        cfg.options().copyDefaults(true);
        cfg.addDefault("StringWithIcon", "§a\u24C8 §f");
        cfg.addDefault("StringWithoutIcon", "   §f");
        cfg.addDefault("AllowedUsers", Arrays.asList("PutUsernamesHere"));
        try {
            cfg.save(getFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File getFile() {
        return new File("plugins/TabTags", "config.yml");
    }

    public static FileConfiguration getFileConfiguration() {
        return YamlConfiguration.loadConfiguration(getFile());
    }

    public static void LoadData() {
        FileConfiguration cfg = getFileConfiguration();
        Main.StringWith = cfg.getString("StringWithIcon");
        Main.StringWithout = cfg.getString("StringWithoutIcon");
        Main.AllowedUsernames = cfg.getStringList("AllowedUsers");
    }
}