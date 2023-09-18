package com.person98.mod5.util;

import com.person98.mod5.Mod5;
import com.person98.mod5.block.ModBlocks;
import com.person98.mod5.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.util.Identifier;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerModCompostables();
        registerCommands();
        registerEvents();
        registerPotionRecipes();
        registerCustomTrades();
        registerStrippables();
        registerFlammables();
        registerAttributes();
        createPortal();
    }

    private static void createPortal() {
        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.PURPLE_COREY_BLOCK)
                .lightWithItem(ModItems.COREY_LIGHTHER)
                .destDimID(new Identifier(Mod5.MOD_ID, "corey"))
                .tintColor(0xF86B08)
                .registerPortal();
    }

    private static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

    }

    private static void registerAttributes() {
    }

    private static void registerModCompostables() {

    }

    private static void registerCommands() {

    }

    private static void registerFlammables() {

    }

    private static void registerStrippables() {

    }

    private static void registerEvents() {

    }

    private static void registerPotionRecipes() {
    }

    private static void registerCustomTrades() {

    }
}