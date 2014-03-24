package net.nomads.Objects;

import org.bukkit.ChatColor;
import org.bukkit.Location;


/**
 * Created by joshuabetz on 3/23/14.
 */
public class Team {

    private String name;
    private ChatColor color;
    private Location spawnpoint;

    public Team(String name, ChatColor color, Location spawnpoint){
        this.name = name;
        this.color = color;
        this.spawnpoint = spawnpoint;
    }

    public String getName(){
        return this.name;
    }

    public ChatColor getColor(){
        return this.color;
    }

    public Location getSpawnPoint(){
        return this.spawnpoint;
    }
}
