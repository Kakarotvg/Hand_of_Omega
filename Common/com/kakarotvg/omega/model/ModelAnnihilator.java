package com.kakarotvg.omega.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelAnnihilator extends ModelBase {
    //fields
    ModelRenderer shouldergaurd;
    ModelRenderer shouldergaurd1;
    ModelRenderer frontalbody;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer head3;
    ModelRenderer head5;
    ModelRenderer head4;
    ModelRenderer head2;

    public ModelAnnihilator() {
        textureWidth = 128;
        textureHeight = 64;

        shouldergaurd = new ModelRenderer(this, 0, 16);
        shouldergaurd.addBox(0F, 0F, 0F, 5, 4, 6);
        shouldergaurd.setRotationPoint(4F, 5F, -3F);
        shouldergaurd.setTextureSize(128, 64);
        shouldergaurd.mirror = true;
        setRotation(shouldergaurd, 0F, 0F, 0F);
        shouldergaurd1 = new ModelRenderer(this, 0, 16);
        shouldergaurd1.addBox(0F, 0F, 0F, 6, 4, 5);
        shouldergaurd1.setRotationPoint(-4F, 5F, -3F);
        shouldergaurd1.setTextureSize(128, 64);
        shouldergaurd1.mirror = true;
        setRotation(shouldergaurd1, 0F, 4.712389F, 0F);
        frontalbody = new ModelRenderer(this, 41, 0);
        frontalbody.addBox(0F, 0F, 1F, 6, 10, 1);
        frontalbody.setRotationPoint(-3F, 7F, -4F);
        frontalbody.setTextureSize(128, 64);
        frontalbody.mirror = true;
        setRotation(frontalbody, 0F, 0F, 0F);
        head = new ModelRenderer(this, 44, 26);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, 6F, -2F);
        head.setTextureSize(128, 64);
        head.mirror = true;
        setRotation(head, 0.3316126F, 0F, 0F);
        body = new ModelRenderer(this, 16, 47);
        body.addBox(-4F, 0F, -2F, 8, 12, 4);
        body.setRotationPoint(0F, 6F, 0F);
        body.setTextureSize(128, 64);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        leg3 = new ModelRenderer(this, 0, 32);
        leg3.addBox(-2F, 0F, -2F, 4, 6, 4);
        leg3.setRotationPoint(-3F, 18F, -3F);
        leg3.setTextureSize(128, 64);
        leg3.mirror = true;
        setRotation(leg3, 0F, 2.111848F, 0F);
        leg4 = new ModelRenderer(this, 0, 32);
        leg4.addBox(-2F, 0F, -2F, 4, 6, 4);
        leg4.setRotationPoint(3F, 18F, -3F);
        leg4.setTextureSize(128, 64);
        leg4.mirror = true;
        setRotation(leg4, 0F, 2.111848F, 0F);
        leg1 = new ModelRenderer(this, 0, 32);
        leg1.addBox(-2F, 0F, -2F, 4, 6, 4);
        leg1.setRotationPoint(-3F, 18F, 3F);
        leg1.setTextureSize(128, 64);
        leg1.mirror = true;
        setRotation(leg1, 0F, 2.111848F, 0F);
        leg2 = new ModelRenderer(this, 0, 32);
        leg2.addBox(-2F, 0F, -2F, 4, 6, 4);
        leg2.setRotationPoint(4F, 18F, 3F);
        leg2.setTextureSize(128, 64);
        leg2.mirror = true;
        setRotation(leg2, 0F, 2.111848F, -0.0058178F);
        rightarm = new ModelRenderer(this, 70, 0);
        rightarm.addBox(0F, 0F, 0F, 4, 9, 4);
        rightarm.setRotationPoint(4F, 7F, -2F);
        rightarm.setTextureSize(128, 64);
        rightarm.mirror = true;
        setRotation(rightarm, 0F, 0F, 0F);
        leftarm = new ModelRenderer(this, 70, 0);
        leftarm.addBox(0F, 0F, 0F, 4, 9, 4);
        leftarm.setRotationPoint(-4F, 7F, -2F);
        leftarm.setTextureSize(128, 64);
        leftarm.mirror = true;
        setRotation(leftarm, 0F, 4.712389F, 0F);
        head3 = new ModelRenderer(this, 89, 0);
        head3.addBox(0F, 0F, 0F, 8, 8, 8);
        head3.setRotationPoint(-4F, -2F, -6F);
        head3.setTextureSize(128, 64);
        head3.mirror = true;
        setRotation(head3, 0.252491F, 0F, 0F);
        head5 = new ModelRenderer(this, 89, 0);
        head5.addBox(0F, 0F, 0F, 8, 8, 8);
        head5.setRotationPoint(-4F, -3F, 0F);
        head5.setTextureSize(128, 64);
        head5.mirror = true;
        setRotation(head5, -0.3932809F, 0F, 0F);
        head4 = new ModelRenderer(this, 89, 0);
        head4.addBox(0F, 0F, 0F, 8, 8, 8);
        head4.setRotationPoint(-4F, 0F, 5F);
        head4.setTextureSize(128, 64);
        head4.mirror = true;
        setRotation(head4, -1.042543F, 0F, 0F);
        head2 = new ModelRenderer(this, 89, 0);
        head2.addBox(0F, 0F, 0F, 8, 8, 8);
        head2.setRotationPoint(-4F, 4F, -2F);
        head2.setTextureSize(128, 64);
        head2.mirror = true;
        setRotation(head2, 0.1477712F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        shouldergaurd.render(f5);
        shouldergaurd.render(f5);
        frontalbody.render(f5);
        head.render(f5);
        body.render(f5);
        leg3.render(f5);
        leg4.render(f5);
        leg1.render(f5);
        leg2.render(f5);
        rightarm.render(f5);
        leftarm.render(f5);
        head3.render(f5);
        head5.render(f5);
        head4.render(f5);
        head2.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
        this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leg4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;

        this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
    }

}
