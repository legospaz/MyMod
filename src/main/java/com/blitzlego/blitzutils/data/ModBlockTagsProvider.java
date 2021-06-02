package com.blitzlego.blitzutils.data;

import com.blitzlego.blitzutils.BlitzUtils;
import com.blitzlego.blitzutils.setup.ModBlocks;
import com.blitzlego.blitzutils.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;


public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider (DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, BlitzUtils.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags()
    {
        tag(ModTags.Blocks.ORES_COPPER).add(ModBlocks.COPPER_ORE.get());
        tag(Tags.Blocks.ORES).add(ModBlocks.COPPER_ORE.get());

        tag(ModTags.Blocks.STORAGE_BLOCKS_COPPER).add(ModBlocks.COPPER_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).add(ModBlocks.COPPER_BLOCK.get());


    }
}
