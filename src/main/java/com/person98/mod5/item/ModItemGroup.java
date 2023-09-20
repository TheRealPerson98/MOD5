package com.person98.mod5.item;

import com.person98.mod5.Mod5;
import com.person98.mod5.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Mod5.MOD_ID, "mod5_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mod5_group"))
                    .icon(() -> new ItemStack(ModBlocks.PURPLE_COREY_BLOCK)).entries((displayContext, entries) -> {


                        entries.add(ModBlocks.PURPLE_COREY_BLOCK);
                        entries.add(ModBlocks.GREEN_COREY_BLOCK);
                        entries.add(ModBlocks.GRAY_COREY_BLOCK);
                        entries.add(ModBlocks.BROWN_COREY_BLOCK);
                        entries.add(ModBlocks.DARK_GREEN_COREY_BLOCK);
                        entries.add(ModBlocks.GREEN_COREY_BLOCK_SAPLING);
                        entries.add(ModBlocks.COREY_PLANKS);

                        entries.add(ModBlocks.COREY_ORE);
                        entries.add(ModBlocks.COREY_BLOCK);


                        entries.add(ModItems.COREY_LIGHTHER);
                        entries.add(ModItems.COREY_STICK);

                        entries.add(ModItems.COREY_SWORD);
                        entries.add(ModItems.COREY_PICKAXE);
                        entries.add(ModItems.COREY_SHOVEL);
                        entries.add(ModItems.COREY_AXE);
                        entries.add(ModItems.COREY_HOE);

                        entries.add(ModItems.COREY_CREEPER_SPAWN_EGG);
                        entries.add(ModItems.COREY_SPAWN_EGG);
                        entries.add(ModItems.COREY_PIG_SPAWN_EGG);

                        entries.add(ModItems.COREY_HELMET);
                        entries.add(ModItems.COREY_CHESTPLATE);
                        entries.add(ModItems.COREY_LEGGINGS);
                        entries.add(ModItems.COREY_BOOTS);

                        entries.add(ModItems.COREY);
                        entries.add(ModItems.RAW_COREY);





                    }).build());

    public static void registerItemGroups() {

    }
}