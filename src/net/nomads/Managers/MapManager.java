package net.nomads.Managers;

import net.nomads.Objects.Map;
import org.bukkit.Bukkit;


/**
 * Created by joshuabetz on 3/23/14.
 */
public class MapManager {

    private static MapManager m = new MapManager();

    public static MapManager getMaps(){
        return m;
    }

    Map map = new Map(Bukkit.getServer().getWorlds().get(0).getSpawnLocation());

    public Map getDefaultMap(){
        return map;
    }
}
