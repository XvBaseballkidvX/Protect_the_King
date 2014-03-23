package net.nomads.Objects;

import org.bukkit.inventory.ItemStack;

/**
 * Created by joshuabetz on 3/23/14.
 */
public class Kit {

    private String name;
    private ItemStack[] contents;
    private ItemStack[] armor;
    private String permission;

    public Kit(String name, ItemStack[] contents, ItemStack[] armor, String permission){
        this.name = name;
        this.contents = contents;
        this.armor = armor;
        this.permission = permission;
    }

    public String getName(){
        return this.name;
    }

    public ItemStack[] getContents(){
        return this.contents;
    }

    public ItemStack[] getArmor(){
        return this.armor;
    }

    public String getPermission(){
        return this.permission;
    }
}
