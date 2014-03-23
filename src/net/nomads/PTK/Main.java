package net.nomads.PTK;

import net.nomads.Managers.TeamManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by joshuabetz on 3/22/14.
 */


public class Main extends JavaPlugin{

    private static Main instance;

    public void onEnable(){
        instance = this;
        //TODO Register all listeners

        TeamManager.getTeams().registerTeams();

    }

    public void onDisable(){

    }

    public static Main getInstance(){
        return instance;
    }

    public String getPrefix(){
        return "§8[§cP.T.K§8]§7 ";
    }
}
