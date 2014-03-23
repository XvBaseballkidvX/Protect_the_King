package net.nomads.Items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by joshuabetz on 3/23/14.
 */
public class Contents {

    ItemStack[] ARCHER_ARMOR = new ItemStack[]{new ItemStack(Material.LEATHER_HELMET)
    , new ItemStack(Material.LEATHER_CHESTPLATE)
    , new ItemStack(Material.LEATHER_LEGGINGS)
    , new ItemStack(Material.LEATHER_BOOTS)};

    ItemStack[] ARCHER_CONTENTS = new ItemStack[]{new ItemStack(Material.BOW)
    , new ItemStack(Material.ARROW, 32)
    , new ItemStack(Material.WOOD_SWORD)};

    ItemStack[] KNIGHT_ARMOR = new ItemStack[]{new ItemStack(Material.IRON_HELMET)
    , new ItemStack(Material.IRON_CHESTPLATE)
    , new ItemStack(Material.IRON_LEGGINGS)
    , new ItemStack(Material.IRON_BOOTS)};

    ItemStack[] KNIGHT_CONTENTS = new ItemStack[]{new ItemStack(Material.IRON_SWORD)};


}
