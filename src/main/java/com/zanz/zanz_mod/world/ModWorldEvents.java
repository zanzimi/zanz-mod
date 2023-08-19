package com.zanz.zanz_mod.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.zanz.zanz_mod.ZanzMod;
import com.zanz.zanz_mod.world.gen.ModOreGeneration;

@Mod.EventBusSubscriber(modid = ZanzMod.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
    }
}
