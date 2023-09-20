package com.person98.mod5.entity.layer;

import com.person98.mod5.Mod5;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer COREY_CREEPER =
            new EntityModelLayer(new Identifier(Mod5.MOD_ID, "corey_creeper"), "main");

    public static final EntityModelLayer COREY =
            new EntityModelLayer(new Identifier(Mod5.MOD_ID, "corey"), "main");

    public static final EntityModelLayer COREY_PIG =
            new EntityModelLayer(new Identifier(Mod5.MOD_ID, "corey_pig"), "main");
}