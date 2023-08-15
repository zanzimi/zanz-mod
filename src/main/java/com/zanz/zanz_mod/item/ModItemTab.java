package com.zanz.zanz_mod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemTab {
    public static final ItemGroup MOD_MATERIAL_TAB = new ItemGroup("mod_material_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.CITRINE.get());
        }
    };
}
