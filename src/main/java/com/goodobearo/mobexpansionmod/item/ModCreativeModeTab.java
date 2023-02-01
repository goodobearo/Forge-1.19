package com.goodobearo.mobexpansionmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOB_EXPANSION_MOD_TAB = new CreativeModeTab("mobexpansionresources") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLANK_CRYSTAL.get());
        }
    };

    public static final CreativeModeTab MOB_EXPANSION_MOD_TAB_2 = new CreativeModeTab("mobexpansionblocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RED_CRYSTAL.get());
        }
    };
}
