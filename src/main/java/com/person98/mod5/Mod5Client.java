package com.person98.mod5;

import com.person98.mod5.entity.ModEntities;
import com.person98.mod5.entity.client.corey_creeper.CoreyCreeperModel;
import com.person98.mod5.entity.client.corey_creeper.CoreyCreeperRenderer;
import com.person98.mod5.entity.client.corey.CoreyModel;
import com.person98.mod5.entity.client.corey.CoreyRenderer;
import com.person98.mod5.entity.client.corey_pig.CoreyPigModel;
import com.person98.mod5.entity.client.corey_pig.CoreyPigRenderer;
import com.person98.mod5.entity.layer.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class Mod5Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.COREY_CREEPER, CoreyCreeperModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.COREY, CoreyModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.COREY_PIG, CoreyPigModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.COREY_CREEPER, CoreyCreeperRenderer::new);
        EntityRendererRegistry.register(ModEntities.COREY, CoreyRenderer::new);
        EntityRendererRegistry.register(ModEntities.COREY_PIG, CoreyPigRenderer::new);
    }
}
