package net.treyhutson.tutorialmod.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.treyhutson.tutorialmod.TutorialMod;
import net.treyhutson.tutorialmod.entity.custom.MantisEntity;

public class MantisRenderer extends MobEntityRenderer<MantisEntity, MantisEntityRenderState, MantisModel<MantisEntity>> {

    public MantisRenderer(EntityRendererFactory.Context context) {
        super(context, new MantisModel<>(context.getPart(MantisModel.MANTIS)), 0.75f );
    }

    @Override
    public MantisEntityRenderState createRenderState() {
        return new MantisEntityRenderState();
    }

    @Override
    public Identifier getTexture(MantisEntityRenderState state) {
        return Identifier.of(TutorialMod.MOD_ID, "textures/entity/mantis/mantis.png");
    }

    public void render(MantisEntity livingEntity, MantisEntityRenderState mantisEntityRenderState, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if (livingEntity.isBaby()) {
            matrixStack.scale(0.5F, 0.5F, 0.5F);
        } else  {
            matrixStack.scale(1F, 1F, 1F);
        }

        super.render(mantisEntityRenderState, matrixStack, vertexConsumerProvider, i);
    }
}
