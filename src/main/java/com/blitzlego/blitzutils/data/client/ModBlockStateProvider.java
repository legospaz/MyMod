package com.blitzlego.blitzutils.data.client;

import com.blitzlego.blitzutils.BlitzUtils;
import com.blitzlego.blitzutils.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen,  ExistingFileHelper exFileHelper) {
        super(gen, BlitzUtils.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //simpleBlock(ModBlocks.COPPER_BLOCK.get());
        simpleBlock(ModBlocks.COPPER_ORE.get());

    }
}
