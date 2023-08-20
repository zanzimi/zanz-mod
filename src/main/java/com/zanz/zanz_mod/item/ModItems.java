package com.zanz.zanz_mod.item;

import com.zanz.zanz_mod.ZanzMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ZanzMod.MOD_ID);

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber", () -> new Item(new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", () -> new Item(new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> CARNATION = ITEMS.register("carnation", () -> new Item(new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine", () -> new Item(new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> RAUCHTOPAZ = ITEMS.register("rauchtopaz", () -> new Item(new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> SAPHIRE = ITEMS.register("saphire", () -> new Item(new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> SLITTHER = ITEMS.register("slitther", () -> new Item(new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));

    public static final RegistryObject<Item> NELITTHER_SWORD = ITEMS.register("nelitther_sword", () -> new SwordItem(ModItemTier.NELITTHER, 9, -2.0f,new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> NELITTHER_PICKAXE = ITEMS.register("nelitther_pickaxe", () -> new PickaxeItem(ModItemTier.NELITTHER, 5, -1f, new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> NELITTHER_SHOVEL = ITEMS.register("nelitther_shovel", () -> new ShovelItem(ModItemTier.NELITTHER, 3, -1f, new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> NELITTHER_AXE = ITEMS.register("nelitther_axe", () -> new AxeItem(ModItemTier.NELITTHER, 11, -1f,new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> NELITTHER_HOE = ITEMS.register("nelitther_hoe", () -> new HoeItem(ModItemTier.NELITTHER, 0, -1f, new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> NELITTHER_BOOTS = ITEMS.register("nelitther_boots", () -> new ArmorItem(ModArmorMaterial.NELITTHER, EquipmentSlotType.FEET, new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> NELITTHER_LEGGINGS = ITEMS.register("nelitther_leggings", () -> new ArmorItem(ModArmorMaterial.NELITTHER, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> NELITTHER_CHESTPLATE = ITEMS.register("nelitther_chestplate", () -> new ArmorItem(ModArmorMaterial.NELITTHER, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> NELITTHER_HELMET = ITEMS.register("nelitther_helmet", () -> new ArmorItem(ModArmorMaterial.NELITTHER, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));

    public static final RegistryObject<Item> SLITTHER_SWORD = ITEMS.register("slitther_sword", () -> new SwordItem(ModItemTier.SLITTHER, 14, -1.8f, new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> SLITTHER_PICKAXE = ITEMS.register("slitther_pickaxe", () -> new PickaxeItem(ModItemTier.SLITTHER, 6, -1f, new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> SLITTHER_SHOVEL = ITEMS.register("slitther_shovel", () -> new ShovelItem(ModItemTier.SLITTHER, 4, -1f, new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> SLITTHER_AXE = ITEMS.register("slitther_axe", () -> new AxeItem(ModItemTier.SLITTHER, 17, -1f, new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> SLITTHER_HOE = ITEMS.register("slitther_hoe", () -> new HoeItem(ModItemTier.SLITTHER, 0, -1f, new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> SLITTHER_BOOTS = ITEMS.register("slitther_boots", () -> new ArmorItem(ModArmorMaterial.SLITTHER, EquipmentSlotType.FEET, new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> SLITTHER_LEGGINGS = ITEMS.register("slitther_leggings", () -> new ArmorItem(ModArmorMaterial.SLITTHER, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> SLITTHER_CHESTPLATE = ITEMS.register("slitther_chestplate", () -> new ArmorItem(ModArmorMaterial.SLITTHER, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    public static final RegistryObject<Item> SLITTHER_HELMET = ITEMS.register("slitther_helmet", () -> new ArmorItem(ModArmorMaterial.SLITTHER, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
