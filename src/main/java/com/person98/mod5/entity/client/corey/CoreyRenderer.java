package com.person98.mod5.entity.client.corey;

import com.person98.mod5.Mod5;
import com.person98.mod5.entity.custom.CoreyEntity;
import com.person98.mod5.entity.layer.ModModelLayers;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class CoreyRenderer extends MobEntityRenderer<CoreyEntity, CoreyModel<CoreyEntity>> {
    private static final Identifier TEXTURE = new Identifier(Mod5.MOD_ID, "textures/entity/corey.png");

    public CoreyRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new CoreyModel<>(ctx.getPart(ModModelLayers.COREY)), 0.6f);
    }

    @Override
    public Identifier getTexture(CoreyEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(CoreyEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);


            super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
        }
    }


}