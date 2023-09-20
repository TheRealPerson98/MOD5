package com.person98.mod5.datagen;

import com.person98.mod5.block.ModBlocks;
import com.person98.mod5.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BROWN_COREY_BLOCK);
        addDrop(ModBlocks.GREEN_COREY_BLOCK);
        addDrop(ModBlocks.GRAY_COREY_BLOCK);
        addDrop(ModBlocks.PURPLE_COREY_BLOCK);
        addDrop(ModBlocks.DARK_GREEN_COREY_BLOCK);
        addDrop(ModBlocks.GREEN_COREY_BLOCK_SAPLING);

        addDrop(ModBlocks.COREY_BLOCK);
        addDrop(ModBlocks.COREY_ORE, oreDrops(ModBlocks.COREY_ORE, ModItems.RAW_COREY));



//        addDrop(ModBlocks.PINK_GARNET_STAIRS);
//        addDrop(ModBlocks.PINK_GARNET_SLAB, slabDrops(ModBlocks.PINK_GARNET_SLAB));
//        addDrop(ModBlocks.PINK_GARNET_BUTTON);
//        addDrop(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
//        addDrop(ModBlocks.PINK_GARNET_FENCE);
//        addDrop(ModBlocks.PINK_GARNET_FENCE_GATE);
//        addDrop(ModBlocks.PINK_GARNET_WALL);
//        addDrop(ModBlocks.PINK_GARNET_TRAPDOOR);
//        addDrop(ModBlocks.PINK_GARNET_DOOR, doorDrops(ModBlocks.PINK_GARNET_DOOR));




    }
}
