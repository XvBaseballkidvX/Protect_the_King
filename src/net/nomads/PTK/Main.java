package net.nomads.PTK;

/**
 * Created by joshuabetz on 3/22/14.
 */


//I just had to make the classes for da git :3

public class Main {

    private static Main instance;

    public void onEnable(){
        instance = this;
    }

    public void onDisable(){

    }

    public Main get(){
        return instance;
    }
}
