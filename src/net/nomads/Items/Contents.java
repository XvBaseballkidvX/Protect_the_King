package net.nomads.Items;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

/**
 * Created by joshuabetz on 3/23/14.
 */
public class Contents {

    public static ItemStack[] ARCHER_ARMOR = new ItemStack[]{new ItemStack(Material.LEATHER_HELMET),
    new ItemStack(Material.LEATHER_CHESTPLATE),
    new ItemStack(Material.LEATHER_LEGGINGS),
    new ItemStack(Material.LEATHER_BOOTS)};

    public static ItemStack[] ARCHER_CONTENTS = new ItemStack[]{new ItemStack(Material.BOW),
    new ItemStack(Material.ARROW, 32),
    new ItemStack(Material.WOOD_SWORD)};

    public static ItemStack[] KNIGHT_ARMOR = new ItemStack[]{new ItemStack(Material.IRON_HELMET),
    new ItemStack(Material.IRON_CHESTPLATE),
    new ItemStack(Material.IRON_LEGGINGS),
    new ItemStack(Material.IRON_BOOTS)};

    public static ItemStack[] KNIGHT_CONTENTS = new ItemStack[]{new ItemStack(Material.IRON_SWORD)};

    public static ItemStack REAPER_HELMET = setLeather(new ItemStack(Material.LEATHER_HELMET), Color.BLACK);
    public static ItemStack REAPER_CHESTPLATE = setLeather(new ItemStack(Material.LEATHER_CHESTPLATE), Color.BLACK);
    public static ItemStack REAPER_LEGGINGS = setLeather(new ItemStack(Material.LEATHER_LEGGINGS), Color.BLACK);
    public static ItemStack REAPER_BOOTS = setLeather(new ItemStack(Material.LEATHER_BOOTS), Color.BLACK);

    public static ItemStack[] REAPER_ARMOR = new ItemStack[]{REAPER_HELMET, REAPER_CHESTPLATE, REAPER_LEGGINGS, REAPER_BOOTS};
    



    public static ItemStack setLeather(ItemStack item, Color color){
        LeatherArmorMeta m = (LeatherArmorMeta) item.getItemMeta();
        m.setColor(color);
        item.setItemMeta(m);

        return item;

    }
}
