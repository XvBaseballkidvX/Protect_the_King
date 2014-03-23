package net.nomads.Items;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

/**
 * Created by joshuabetz on 3/23/14.
 */
public class Icons {

    public static ItemStack ARCHER_ICON;
    public static ItemStack KNIGHT_ICON;
    public static ItemStack MAGE_ICON;
    public static ItemStack REAPER_ICON;

    public static void addIcons(){
        //TODO Make all of the icons
    }

    public ItemStack setData(ItemStack item, String name, List<String> lore){
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }
}
