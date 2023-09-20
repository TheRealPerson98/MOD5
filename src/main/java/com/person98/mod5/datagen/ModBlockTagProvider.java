package com.person98.mod5.datagen;

import com.person98.mod5.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.COREY_BLOCK,
                        ModBlocks.COREY_ORE
                );

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.COREY_BLOCK,
                        ModBlocks.GREEN_COREY_BLOCK_SAPLING
                        );

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.COREY_ORE,
                        ModBlocks.PURPLE_COREY_BLOCK);

        getOrCreateTagBuilder(BlockTags.VALID_SPAWN)
                .add(ModBlocks.COREY_BLOCK,
                        ModBlocks.COREY_ORE,
                        ModBlocks.PURPLE_COREY_BLOCK,
                        ModBlocks.GREEN_COREY_BLOCK,
                        ModBlocks.GRAY_COREY_BLOCK,
                        ModBlocks.BROWN_COREY_BLOCK,
                        ModBlocks.DARK_GREEN_COREY_BLOCK,
                        ModBlocks.GREEN_COREY_BLOCK_SAPLING
                        );

        // Tag for Tool Material Netherite
//        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
//                .add(ModBlocks.NETHER_PINK_GARNET_ORE);
//
//        // Tag for our custom Tool Material (Pink Garnet)
//        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
//                .add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);

    }
}