package com.person98.mod5.item;

import com.person98.mod5.Mod5;
import com.person98.mod5.block.ModBlocks;
import com.person98.mod5.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item COREY_LIGHTHER = registerItem("corey_lighter",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Mod5.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {


        entries.add(ModBlocks.PURPLE_COREY_BLOCK);
        entries.add(ModBlocks.GREEN_COREY_BLOCK);
    }

    public static void registerModItems() {
        Mod5.LOGGER.info("Registering Mod Items for " + Mod5.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}