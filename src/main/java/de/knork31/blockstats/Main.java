package de.knork31.blockstats;

import de.knork31.blockstats.commands.BlokstatsCommand;
import de.knork31.blockstats.commands.ConsoleLogCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static String PREFIX = "§bSAMM§0:§8 ";

    public void log (String text) {
        Bukkit.getConsoleSender().sendMessage(PREFIX + text);
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        log(PREFIX + "plugin loading");

        getCommand("blockStats").setExecutor(new BlokstatsCommand());
        getCommand("consoleLog").setExecutor(new ConsoleLogCommand());

        log(PREFIX + "plugin loaded");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        log(PREFIX + "plugin unloaded");
    }
}
