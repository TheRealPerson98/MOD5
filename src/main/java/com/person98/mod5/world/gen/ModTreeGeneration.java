package com.person98.mod5.world.gen;

import com.person98.mod5.Mod5;
import com.person98.mod5.world.biome.ModBiomes;
import com.person98.mod5.world.biome.tree.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        Mod5.LOGGER.info("loaded ModTreeGeneration");
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.TEST_BIOME),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.COREY_PLACED_KEY);

    }
}
