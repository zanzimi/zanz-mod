package com.zanz.zanz_mod.world.gen;


import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;
import com.zanz.zanz_mod.block.ModBlocks;


public enum OreType {

    AMBER(Lazy.of(ModBlocks.AMBER_ORE), 8, 1, 8),
    AMETHYST(Lazy.of(ModBlocks.AMETHYST_ORE), 8, 1, 8),
    CARNATION(Lazy.of(ModBlocks.CARNATION_ORE), 8, 1, 8),
    CITRINE(Lazy.of(ModBlocks.CITRINE_ORE), 8, 1, 8),
    RAUCHTOPAZ(Lazy.of(ModBlocks.RAUCHTOPAZ_ORE), 8, 1, 8),
    RUBY(Lazy.of(ModBlocks.RUBY_ORE), 8, 1, 8),
    SAPHIRE(Lazy.of(ModBlocks.SAPHIRE_ORE), 8, 1, 8),
    TOPAZ(Lazy.of(ModBlocks.TOPAZ_ORE), 8, 1, 8),;

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if(block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
