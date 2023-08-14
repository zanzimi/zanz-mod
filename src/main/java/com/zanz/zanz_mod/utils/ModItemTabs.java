package com.zanz.zanz_mod.utils;

import com.zanz.zanz_mod.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;

public class ModItemTabs {
    public static ItemGroup createNewTab(String id, RegistryObject<Item> icon) {
        return new ItemGroup(id) {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(icon.get());
            }
        };
    }

    public static ItemGroup MOD_MATERIAL_TAB = createNewTab("mod_materials_tab", ModItems.CITRINE);
}
