package net.nomads.Managers;

import net.nomads.PTK.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * Created by joshuabetz on 3/23/14.
 */
public class LocationManager {

    public static void teleportToLocation(Player player, String loc) {
        int x, y, z;
        float pitch, yaw;
        String world;
        x = Main.getInstance().getConfig().getInt(loc + ".x");
        y = Main.getInstance().getConfig().getInt(loc + ".y");
        z = Main.getInstance().getConfig().getInt(loc + ".z");
        pitch = Main.getInstance().getConfig().getInt(loc + ".pitch");
        yaw = Main.getInstance().getConfig().getInt(loc + ".yaw");
        world = (String) Main.getInstance().getConfig().getString(loc + ".world");
        Location tpLocation = new Location(Bukkit.getWorld(world), x, y, z);
        tpLocation.setPitch(pitch);
        tpLocation.setYaw(yaw);
        player.teleport(tpLocation);
    }

    public static void createLocation(Location loc, String locName) {
        float yaw = loc.getYaw();
        float pitch = loc.getPitch();
        int x, y, z;
        String world = loc.getWorld().getName();
        x = loc.getBlockX();
        y = loc.getBlockY();
        z = loc.getBlockZ();

        Main.getInstance().getConfig().set(locName + ".x", x);
        Main.getInstance().getConfig().set(locName + ".y", y);
        Main.getInstance().getConfig().set(locName + ".z", z);
        Main.getInstance().getConfig().set(locName + ".yaw", yaw);
        Main.getInstance().getConfig().set(locName + ".pitch", pitch);
        Main.getInstance().getConfig().set(locName + ".world", world);
        Main.getInstance().saveConfig();
    }

    public static Location getLocation(String loc){
        int x, y, z;
        float pitch, yaw;
        String world;
        x = Main.getInstance().getConfig().getInt(loc + ".x");
        y = Main.getInstance().getConfig().getInt(loc + ".y");
        z = Main.getInstance().getConfig().getInt(loc + ".z");
        pitch = Main.getInstance().getConfig().getInt(loc + ".pitch");
        yaw = Main.getInstance().getConfig().getInt(loc + ".yaw");
        world = (String) Main.getInstance().getConfig().getString(loc + ".world");
        Location tpLocation = new Location(Bukkit.getWorld(world), x, y, z);
        tpLocation.setPitch(pitch);
        tpLocation.setYaw(yaw);

        return tpLocation;
    }
}
