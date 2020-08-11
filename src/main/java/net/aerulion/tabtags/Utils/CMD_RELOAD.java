package net.aerulion.tabtags.Utils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.Collections;
import java.util.List;

public class CMD_RELOAD implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.hasPermission("TabTags.Reload")) {
            sender.sendMessage("§7[§b§lTabTags§7] Config reloaded.");
            Config.LoadData();
            Util.FormatTablist();
            return true;
        }
        sender.sendMessage("§7[§b§lTabTags§7] No permission.");
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        return Collections.emptyList();
    }
}