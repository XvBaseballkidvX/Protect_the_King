package net.nomads.Items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

/**
 * Created by joshuabetz on 3/24/14.
 */
public class Materials {

    public static ItemStack CLASS_MENU_SELECTOR;

    public static void registerMaterials(){

        CLASS_MENU_SELECTOR = setData(new ItemStack(Material.WATCH), "§6Class Menu §7(Right Click)", Arrays.asList(
                "§eClick to open!"
        ));
    }

    public static ItemStack setData(ItemStack item, String name, List<String> lore){
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }
}
