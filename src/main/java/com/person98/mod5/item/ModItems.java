package com.person98.mod5.item;

import com.person98.mod5.Mod5;
import com.person98.mod5.block.ModBlocks;
import com.person98.mod5.entity.ModEntities;
import com.person98.mod5.item.custom.ModPoisonSwordItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item COREY = registerItem("corey",
            new Item(new FabricItemSettings()));
    public static final Item RAW_COREY = registerItem("raw_corey",
            new Item(new FabricItemSettings()));


    public static final Item COREY_LIGHTHER = registerItem("corey_lighter",
            new Item(new FabricItemSettings()));
    public static final Item COREY_STICK = registerItem("corey_stick",
            new Item(new FabricItemSettings()));

    public static final Item COREY_SWORD = registerItem("corey_sword",
            new ModPoisonSwordItem(ModToolMaterial.COREY, 2, 2f, new FabricItemSettings()));

    public static final Item COREY_PICKAXE = registerItem("corey_pickaxe",
            new PickaxeItem(ModToolMaterial.COREY, 1, 1f, new FabricItemSettings()));
    public static final Item COREY_SHOVEL = registerItem("corey_shovel",
            new ShovelItem(ModToolMaterial.COREY, 0, 0f, new FabricItemSettings()));
    public static final Item COREY_AXE = registerItem("corey_axe",
            new AxeItem(ModToolMaterial.COREY, 6, -2f, new FabricItemSettings()));
    public static final Item COREY_HOE = registerItem("corey_hoe",
            new HoeItem(ModToolMaterial.COREY, 0, 0f, new FabricItemSettings()));

    public static final Item COREY_CREEPER_SPAWN_EGG = registerItem("corey_creeper_spawn_egg",
            new SpawnEggItem(ModEntities.COREY_CREEPER, 0x5F0AF8, 0x9308A0, new FabricItemSettings()));
    public static final Item COREY_SPAWN_EGG = registerItem("corey_spawn_egg",
            new SpawnEggItem(ModEntities.COREY, 0x0ADAF8, 0xF8F70A, new FabricItemSettings()));

    public static final Item COREY_PIG_SPAWN_EGG = registerItem("corey_pig_spawn_egg",
            new SpawnEggItem(ModEntities.COREY_PIG, 0xE00AF8, 0x0AF8F3, new FabricItemSettings()));

    public static final Item COREY_HELMET = registerItem("corey_helmet",
            new ArmorItem(ModArmorMaterials.COREY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COREY_CHESTPLATE = registerItem("corey_chestplate",
            new ArmorItem(ModArmorMaterials.COREY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COREY_LEGGINGS = registerItem("corey_leggings",
            new ArmorItem(ModArmorMaterials.COREY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COREY_BOOTS = registerItem("corey_boots",
            new ArmorItem(ModArmorMaterials.COREY, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Mod5.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {


        entries.add(ModBlocks.PURPLE_COREY_BLOCK);
        entries.add(ModBlocks.GREEN_COREY_BLOCK);
        entries.add(ModBlocks.BROWN_COREY_BLOCK);
        entries.add(ModBlocks.COREY_PLANKS);

        entries.add(COREY_STICK);
    }

    public static void registerModItems() {
        Mod5.LOGGER.info("Registering Mod Items for " + Mod5.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}