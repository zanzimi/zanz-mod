package com.zanz.zanz_mod.world;

import com.zanz.zanz_mod.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {

    public static void generateOres(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.AMBER_ORE.get().getDefaultState(), 2, 1, 16, 5);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.AMETHYST_ORE.get().getDefaultState(), 2, 1, 16, 5);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.CARNATION_ORE.get().getDefaultState(), 2, 1, 16, 5);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.CITRINE_ORE.get().getDefaultState(), 2, 1, 16, 5);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.RAUCHTOPAZ_ORE.get().getDefaultState(), 2, 1, 16, 5);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.RUBY_ORE.get().getDefaultState(), 2, 1, 16, 5);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.SAPHIRE_ORE.get().getDefaultState(), 2, 1, 16, 5);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.TOPAZ_ORE.get().getDefaultState(), 2, 1, 16, 5);

        }
    }

    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize)).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight))).square().count(amount));
    }
}