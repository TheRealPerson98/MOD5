package com.person98.mod5.world.biome;

import com.person98.mod5.Mod5;
import com.person98.mod5.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerraBlenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(Mod5.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, Mod5.MOD_ID, ModMaterialRules.makeRules());
    }
}