package com.blitzlego.blitzutils.data.client;

import com.blitzlego.blitzutils.BlitzUtils;
import com.blitzlego.blitzutils.setup.ModItems;
import com.blitzlego.blitzutils.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, BlitzUtils.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        copy(ModTags.Blocks.ORES_COPPER, ModTags.Items.ORES_COPPER);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);

        copy(ModTags.Blocks.STORAGE_BLOCKS_COPPER, ModTags.Items.STORAGE_BLOCKS_COPPER);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        tag(ModTags.Items.INGOTS_COPPER).add(ModItems.COPPER_INGOT.get());
        tag(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_COPPER);
    }
}
