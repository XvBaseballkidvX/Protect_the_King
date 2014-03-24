package net.nomads.UserEvents;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

/**
 * Created by joshuabetz on 3/24/14.
 */
public class HungerLoss implements Listener {

    @EventHandler
    public void onFoodLoss(FoodLevelChangeEvent event){
        event.setCancelled(true);
    }
}
