package com.person98.mod5.block;

import com.person98.mod5.Mod5;
import com.person98.mod5.world.biome.tree.DogwoodSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block PURPLE_COREY_BLOCK = registerBlock("purple_corey_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GREEN_COREY_BLOCK = registerBlock("green_corey_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GREEN_COREY_BLOCK_SAPLING = registerBlock("green_corey_block_sapling",
            new SaplingBlock(new DogwoodSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)));
    public static final Block GRAY_COREY_BLOCK = registerBlock("gray_corey_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block DARK_GREEN_COREY_BLOCK = registerBlock("dark_green_corey_block",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block BROWN_COREY_BLOCK = registerBlock("brown_corey_block",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(1.5f)));
    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Mod5.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Mod5.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Mod5.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Mod5.LOGGER.info("Registering ModBlocks for " + Mod5.MOD_ID);
    }
}