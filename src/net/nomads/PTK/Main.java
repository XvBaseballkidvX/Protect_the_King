package net.nomads.PTK;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by joshuabetz on 3/22/14.
 */


//I just had to make the classes for da git :3

public class Main extends JavaPlugin{

    private static Main instance;

    public void onEnable(){
        instance = this;
    }

    public void onDisable(){

    }

    public static Main getInstance(){
        return instance;
    }
}
