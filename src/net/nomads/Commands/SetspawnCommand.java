package net.nomads.Commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by joshuabetz on 3/24/14.
 */
public class SetspawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){
            if(cmd.getName().equalsIgnoreCase("setspawn")){
                if(args.length == 0){
                    Player player = (Player) sender;
                    if(player.hasPermission("ptk.setspawn")){
                        Location loc = player.getLocation();
                        int x = loc.getBlockX();
                        int y = loc.getBlockY();
                        int z = loc.getBlockZ();
                        player.getWorld().setSpawnLocation(x, y, z);
                        player.sendMessage("§aThe Spawn Point has been set!");
                        player.sendMessage("§aX: " + x);
                        player.sendMessage("§aY: " + y);
                        player.sendMessage("§aZ: " + z);
                    }else{
                        player.sendMessage("§cYou do not have permission to use this command!");
                    }
                }else{
                    sender.sendMessage("§cUsage: /setspawn");
                }
            }
        }
        return false;
    }
}
