package com.person98.mod5.datagen;

import com.person98.mod5.block.ModBlocks;
import com.person98.mod5.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COREY_STICK, 2)
                .pattern("R ")
                .pattern("R ")
                .input('R', ModBlocks.COREY_PLANKS)
                .criterion(hasItem(ModBlocks.COREY_PLANKS), conditionsFromItem(ModBlocks.COREY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COREY_STICK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.COREY_PLANKS, 4)
                .input(ModBlocks.BROWN_COREY_BLOCK)
                .criterion(hasItem(ModBlocks.BROWN_COREY_BLOCK), conditionsFromItem(ModBlocks.BROWN_COREY_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.COREY_PLANKS)));




        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COREY_AXE, 1)
                .pattern(" RR")
                .pattern(" CR")
                .pattern(" C ")

                .input('R', ModBlocks.COREY_PLANKS)
                .input('C', ModItems.COREY_STICK)
                .criterion(hasItem(ModBlocks.COREY_PLANKS), conditionsFromItem(ModBlocks.COREY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COREY_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COREY_HOE, 1)
                .pattern(" RR")
                .pattern(" C ")
                .pattern(" C ")

                .input('R', ModBlocks.COREY_PLANKS)
                .input('C', ModItems.COREY_STICK)
                .criterion(hasItem(ModBlocks.COREY_PLANKS), conditionsFromItem(ModBlocks.COREY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COREY_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COREY_PICKAXE, 1)
                .pattern("RRR")
                .pattern(" C ")
                .pattern(" C ")

                .input('R', ModBlocks.COREY_PLANKS)
                .input('C', ModItems.COREY_STICK)
                .criterion(hasItem(ModBlocks.COREY_PLANKS), conditionsFromItem(ModBlocks.COREY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COREY_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COREY_SHOVEL, 1)
                .pattern(" R ")
                .pattern(" C ")
                .pattern(" C ")

                .input('R', ModBlocks.COREY_PLANKS)
                .input('C', ModItems.COREY_STICK)
                .criterion(hasItem(ModBlocks.COREY_PLANKS), conditionsFromItem(ModBlocks.COREY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COREY_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COREY_SWORD, 1)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" C ")

                .input('R', ModBlocks.COREY_PLANKS)
                .input('C', ModItems.COREY_STICK)
                .criterion(hasItem(ModBlocks.COREY_PLANKS), conditionsFromItem(ModBlocks.COREY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COREY_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COREY_HELMET, 1)
                .pattern("RRR")
                .pattern("R R")

                .input('R', ModItems.COREY)
                .criterion(hasItem(ModItems.COREY), conditionsFromItem(ModItems.COREY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COREY_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COREY_CHESTPLATE, 1)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")

                .input('R', ModItems.COREY)
                .criterion(hasItem(ModItems.COREY), conditionsFromItem(ModItems.COREY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COREY_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COREY_LEGGINGS, 1)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")

                .input('R', ModItems.COREY)
                .criterion(hasItem(ModItems.COREY), conditionsFromItem(ModItems.COREY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COREY_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COREY_BOOTS, 1)
                .pattern("R R")
                .pattern("R R")

                .input('R', ModItems.COREY)
                .criterion(hasItem(ModItems.COREY), conditionsFromItem(ModItems.COREY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COREY_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.COREY_BLOCK, 1)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")

                .input('R', ModItems.COREY)
                .criterion(hasItem(ModItems.COREY), conditionsFromItem(ModItems.COREY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.COREY_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COREY, 9)
                .input(ModBlocks.COREY_BLOCK)
                .criterion(hasItem(ModBlocks.COREY_BLOCK), conditionsFromItem(ModBlocks.COREY_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COREY)));

        offerSmelting(exporter, List.of(ModItems.RAW_COREY, ModBlocks.COREY_ORE), RecipeCategory.MISC, ModItems.COREY,
                0.25f, 200, "corey");

    }
}