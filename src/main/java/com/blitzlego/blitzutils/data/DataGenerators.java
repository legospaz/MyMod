package com.blitzlego.blitzutils.data;

import com.blitzlego.blitzutils.BlitzUtils;
import com.blitzlego.blitzutils.data.client.ModBlockStateProvider;
import com.blitzlego.blitzutils.data.client.ModItemModelProvider;
import com.blitzlego.blitzutils.data.client.ModItemTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = BlitzUtils.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators
{
    private DataGenerators() {}
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));

        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(gen, existingFileHelper);
        gen.addProvider(blockTags);
        gen.addProvider(new ModItemTagsProvider(gen, blockTags, existingFileHelper));
    }
}
