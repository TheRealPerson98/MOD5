package com.person98.mod5.entity;

import com.person98.mod5.Mod5;
import com.person98.mod5.block.ModBlocks;
import com.person98.mod5.entity.custom.CoreyCreeperEntity;
import com.person98.mod5.entity.custom.CoreyEntity;
import com.person98.mod5.entity.custom.CoreyPigEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<CoreyCreeperEntity> COREY_CREEPER = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Mod5.MOD_ID, "corey_creeper"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CoreyCreeperEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.95f)).build());

    public static final EntityType<CoreyEntity> COREY = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Mod5.MOD_ID, "corey"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CoreyEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.95f)).build());

    public static final EntityType<CoreyPigEntity> COREY_PIG = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Mod5.MOD_ID, "corey_pig"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CoreyPigEntity::new)
                    .dimensions(EntityDimensions.fixed(0.9f, 0.9f)).build());
    public static void registerModEntities() {
        Mod5.LOGGER.info("Registering Mod Entities for " + Mod5.MOD_ID);
    }
}