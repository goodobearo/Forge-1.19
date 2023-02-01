package com.goodobearo.mobexpansionmod.item;

import com.goodobearo.mobexpansionmod.MobExpansionMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MobExpansionMod.MOD_ID);

    public static final RegistryObject<Item> BLANK_CRYSTAL = ITEMS.register("blank_crystal", () -> new Item( new Item.Properties().tab(ModCreativeModeTab.MOB_EXPANSION_MOD_TAB)));
    public static final RegistryObject<Item> RED_CRYSTAL = ITEMS.register("red_crystal", () -> new Item( new Item.Properties().tab(ModCreativeModeTab.MOB_EXPANSION_MOD_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
