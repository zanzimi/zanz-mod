package com.zanz.zanz_mod.items;

import com.zanz.zanz_mod.utils.ModItemTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class MaterialItem extends Item {
    public MaterialItem() {
        super(new Properties().tab(ModItemTabs.MOD_MATERIAL_TAB));
    }
}
