package com.person98.mod5.datagen;

import com.person98.mod5.block.ModBlocks;
import com.person98.mod5.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

import java.util.Optional;

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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COREY_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COREY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COREY_BLOCK);

}

    private void registerCustomLamp(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COREY_LIGHTHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.COREY_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.COREY_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.COREY_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COREY_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.COREY_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COREY_HOE, Models.GENERATED);

        itemModelGenerator.register(ModItems.COREY_CREEPER_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));
        itemModelGenerator.register(ModItems.COREY_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));
        itemModelGenerator.register(ModItems.COREY_PIG_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COREY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COREY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COREY_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COREY_HELMET));

        itemModelGenerator.register(ModItems.COREY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_COREY, Models.GENERATED);


    }
}