package de.knork31.blockstats.commands;

import de.knork31.blockstats.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ConsoleLogCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if(!(sender instanceof Player)){ sender.sendMessage(Main.PREFIX + "This command can only be executed by non Idiots!"); return false;}
        Player player = (Player) sender;


        return false;
    }
}
