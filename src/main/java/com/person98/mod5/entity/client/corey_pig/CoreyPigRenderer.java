package com.person98.mod5.entity.client.corey_pig;

import com.person98.mod5.Mod5;
import com.person98.mod5.entity.custom.CoreyPigEntity;
import com.person98.mod5.entity.layer.ModModelLayers;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class CoreyPigRenderer extends MobEntityRenderer<CoreyPigEntity, CoreyPigModel<CoreyPigEntity>> {
    private static final Identifier TEXTURE = new Identifier(Mod5.MOD_ID, "textures/entity/corey_pig.png");

    public CoreyPigRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new CoreyPigModel<>(ctx.getPart(ModModelLayers.COREY_PIG)), 0.6f);
    }

    @Override
    public Identifier getTexture(CoreyPigEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(CoreyPigEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);


            super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
        }
    }

}