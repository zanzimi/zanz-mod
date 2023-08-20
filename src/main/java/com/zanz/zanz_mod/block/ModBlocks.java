package com.zanz.zanz_mod.block;

import com.zanz.zanz_mod.ZanzMod;
import com.zanz.zanz_mod.item.ModItemTab;
import com.zanz.zanz_mod.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Properties;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ZanzMod.MOD_ID);

    public static final RegistryObject<Block> AMBER_ORE = registerBlock("amber_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));
    public static final RegistryObject<Block> AMBER_BLOCK = registerBlock("amber_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));
    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));
    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));
    public static final RegistryObject<Block> CARNATION_ORE = registerBlock("carnation_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));
    public static final RegistryObject<Block> CARNATION_BLOCK = registerBlock("carnation_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));
    public static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));
    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));
    public static final RegistryObject<Block> RAUCHTOPAZ_ORE = registerBlock("rauchtopaz_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));
    public static final RegistryObject<Block> RAUCHTOPAZ_BLOCK = registerBlock("rauchtopaz_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));
    public static final RegistryObject<Block> SAPHIRE_ORE = registerBlock("saphire_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));
    public static final RegistryObject<Block> SAPHIRE_BLOCK = registerBlock("saphire_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));
    public static final RegistryObject<Block> SLITTHER_BLOCK = registerBlock("slitther_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> TOPAZ_ORE = registerBlock("topaz_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));
    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ModItemTab.MOD_MATERIAL_TAB)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
