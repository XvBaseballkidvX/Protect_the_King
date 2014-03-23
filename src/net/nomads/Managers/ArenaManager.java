package net.nomads.Managers;

import net.nomads.PTK.Main;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * Created by joshuabetz on 3/23/14.
 */
public class ArenaManager {

    private static ArenaManager m = new ArenaManager();

    public static ArenaManager getManager(){
        return m;
    }

    public boolean GAME_STATUS = false;

    public boolean getGameStatus(){
        return GAME_STATUS;
    }

    public void setGameStatus(boolean value){
        GAME_STATUS = value;
    }



    public void startGame(){
        final int TIMES = 30;
        Bukkit.broadcastMessage(Main.getInstance().getPrefix() + "Match starting in §c" + TIMES + " §7seconds!");

        new BukkitRunnable(){
            int index = TIMES -1;
            public void run(){
                if(index > 0){
                    index-=1;
                    
                }else{
                    this.cancel();
                    return;
                }
            }
        }.runTaskTimer(Main.getInstance(), 0, 20);
    }

    public void endGame(){

    }

    public void beginStartingTasks(){

    }
}
