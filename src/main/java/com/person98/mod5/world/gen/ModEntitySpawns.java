package com.person98.mod5.world.gen;

import com.person98.mod5.entity.ModEntities;
import com.person98.mod5.world.biome.ModBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.BlockState;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

public class ModEntitySpawns {
    public static void addSpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(ModBiomes.TEST_BIOME, BiomeKeys.PLAINS),
                SpawnGroup.CREATURE, ModEntities.COREY_CREEPER, 15, 1, 3);

        SpawnRestriction.register(ModEntities.COREY_CREEPER, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(ModBiomes.TEST_BIOME, BiomeKeys.PLAINS),
                SpawnGroup.CREATURE, ModEntities.COREY, 16, 1, 3);

        SpawnRestriction.register(ModEntities.COREY, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(ModBiomes.TEST_BIOME, BiomeKeys.PLAINS),
                SpawnGroup.CREATURE, ModEntities.COREY_PIG, 16, 1, 3);

        SpawnRestriction.register(ModEntities.COREY_PIG, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);
    }
}