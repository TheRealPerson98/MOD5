package com.person98.mod5.entity.client.corey_creeper;

import com.person98.mod5.Mod5;
import com.person98.mod5.entity.custom.CoreyCreeperEntity;
import com.person98.mod5.entity.layer.ModModelLayers;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class CoreyCreeperRenderer extends MobEntityRenderer<CoreyCreeperEntity, CoreyCreeperModel<CoreyCreeperEntity>> {
    private static final Identifier TEXTURE = new Identifier(Mod5.MOD_ID, "textures/entity/corey_creeper.png");

    public CoreyCreeperRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new CoreyCreeperModel<>(ctx.getPart(ModModelLayers.COREY_CREEPER)), 0.6f);
    }

    @Override
    public Identifier getTexture(CoreyCreeperEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(CoreyCreeperEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);


            super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
        }
    }

}