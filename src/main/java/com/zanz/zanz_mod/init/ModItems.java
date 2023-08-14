package com.zanz.zanz_mod.init;

import com.zanz.zanz_mod.ZanzMod;
import com.zanz.zanz_mod.items.MaterialItem;
import com.zanz.zanz_mod.utils.ModItemTabs;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ZanzMod.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine", MaterialItem::new);

    public static final void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
