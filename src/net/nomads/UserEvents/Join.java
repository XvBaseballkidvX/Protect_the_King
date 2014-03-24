package net.nomads.UserEvents;

import net.nomads.Items.Materials;
import net.nomads.PTK.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by joshuabetz on 3/23/14.
 */
public class Join implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        this.executeOnJoin(player);
    }

    public void executeOnJoin(Player player){
        int max, online;
        max = Main.getInstance().getServer().getMaxPlayers();
        online = Bukkit.getOnlinePlayers().length;
        Bukkit.broadcastMessage(Main.getInstance().getPrefix() + "" + player.getName() + " has joined! (" + online + "/" + max + ")");
        player.getInventory().setItem(0, Materials.CLASS_MENU_SELECTOR);
        player.teleport(player.getWorld().getSpawnLocation());
    }
}
