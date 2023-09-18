package com.person98.mod5.datagen;

import com.person98.mod5.block.ModBlocks;
import com.person98.mod5.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool CoreyTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_COREY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_COREY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_COREY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_COREY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_GREEN_COREY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_COREY_BLOCK_SAPLING);

}

    private void registerCustomLamp(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COREY_LIGHTHER, Models.GENERATED);

    }
}