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


                        entries.add(ModItems.COREY_LIGHTHER);




                    }).build());

    public static void registerItemGroups() {

    }
}