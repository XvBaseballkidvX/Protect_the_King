package net.nomads.Objects;

import net.nomads.PTK.Main;
import org.bukkit.Location;
import org.bukkit.World;

/**
 * Created by joshuabetz on 3/23/14.
 */
public class Map {

    private Location start;

    public Map(Location start){
        this.start = start;
    }

    public World getWorld(){
        World world = Main.getInstance().getServer().getWorlds().get(0);
        return world;
    }

    public String getWorldName(){
        return getWorld().getName();
    }

    public Location getStartLocation(){
        return this.start;
    }
}
