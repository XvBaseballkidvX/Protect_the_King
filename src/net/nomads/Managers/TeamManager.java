package net.nomads.Managers;

import net.nomads.Objects.Team;
import org.bukkit.ChatColor;
import org.bukkit.Location;

import java.util.HashMap;

/**
 * Created by joshuabetz on 3/23/14.
 */
public class TeamManager {

    private static TeamManager man = new TeamManager();


    public static TeamManager getTeams(){
        return man;
    }

    HashMap<String, Team> map = new HashMap<String, Team>();

    Team RED, BLUE;

    Location RED_SPAWN = LocationManager.getLocation("redspawn");
    Location BLUE_SPAWN = LocationManager.getLocation("bluespawn");

    public void registerTeams(){
        RED = new Team("RED", ChatColor.RED, RED_SPAWN);
        BLUE = new Team("BLUE", ChatColor.BLUE, BLUE_SPAWN);
    }

    public Team getTeam(String name){
        if(map.containsKey(name)){
            return map.get(name);
        }else{
            return null;
        }
    }

    public String getPrefix(String name){
        Team team = this.getTeam(name);
        String prefix = team.getColor() + "[" + team.getName() + "]";
        return prefix;
    }
}
