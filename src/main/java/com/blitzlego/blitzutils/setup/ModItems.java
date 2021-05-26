package com.blitzlego.blitzutils.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ModItems
{
    public static final RegistryObject<Item> COPPER_INGOT = Registration.ITEMS.register("copper_ingot", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    static void register() {}
}
