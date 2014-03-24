package net.nomads.Managers;

import net.nomads.Items.Contents;
import net.nomads.Objects.Kit;
import net.nomads.PTK.Main;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;

/**
 * Created by joshuabetz on 3/23/14.
 */
public class KitManager {

    private static KitManager man = new KitManager();

    public static KitManager get(){
        return man;
    }

    HashMap<String, Kit> map = new HashMap<String, Kit>();

    ArrayList<Kit> kits = new ArrayList<Kit>();

    Kit ARCHER;
    Kit KNIGHT;
    Kit REAPER;
    Kit MAGE;

    public void addKits(){

        ARCHER = new Kit("Archer", Contents.ARCHER_CONTENTS, Contents.ARCHER_ARMOR, "ptk.kit.default");
        KNIGHT = new Kit("Knight", Contents.KNIGHT_CONTENTS, Contents.KNIGHT_ARMOR, "ptk.kit.default");
        REAPER = new Kit("Reaper", null, null, "ptk.kit.vip");
        MAGE = new Kit("Mage", null, null, "ptk.kit.vip");

        kits.add(ARCHER);
        kits.add(KNIGHT);
        kits.add(REAPER);
        kits.add(MAGE);

        Main.getInstance().getLogger().log(Level.INFO, "Loaded " + kits.size() + " kits!");

    }

    public Kit getPlayerKit(String name){
        if(map.containsKey(name)){
            return map.get(name);
        }else{
            return ARCHER;
        }
    }

    public Kit getClickedKit(ItemStack clicked){
        ItemMeta meta = clicked.getItemMeta();
        String display = meta.getDisplayName();
        String compare = ChatColor.stripColor(display);
        for(Kit kit : kits){
            if(kit.getName().equalsIgnoreCase(compare)){
                return kit;
            }
        }
        return null;
    }

    public void putPlayerToKit(String name, Kit kit){
        map.put(name, kit);
    }
}
