package com.kakarotvg.omega.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOmegakiller extends ModelBase {
    // fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;

    public ModelOmegakiller() {
        textureWidth = 64;
        textureHeight = 32;

        Head = new ModelRenderer(this, 0, 0);
        Head.addBox(0F, 0F, 0F, 8, 8, 8);
        Head.setRotationPoint(0F, 0F, 0F);
        Head.setTextureSize(64, 32);
        Head.mirror = true;
        setRotation(Head, 0F, 0F, 0F);
        Body = new ModelRenderer(this, 42, 3);
        Body.addBox(0F, 0F, 0F, 6, 8, 4);
        Body.setRotationPoint(1F, 8F, 2F);
        Body.setTextureSize(64, 32);
        Body.mirror = true;
        setRotation(Body, 0F, 0F, 0F);
        leg1 = new ModelRenderer(this, 19, 20);
        leg1.addBox(0F, 0F, 0F, 4, 5, 4);
        leg1.setRotationPoint(2F, 15F, -2F);
        leg1.setTextureSize(64, 32);
        leg1.mirror = true;
        setRotation(leg1, 0F, 0F, 0F);
        leg2 = new ModelRenderer(this, 19, 20);
        leg2.addBox(0F, 0F, 0F, 4, 5, 4);
        leg2.setRotationPoint(2F, 15F, 6F);
        leg2.setTextureSize(64, 32);
        leg2.mirror = true;
        setRotation(leg2, 0F, 0F, 0F);
        leg3 = new ModelRenderer(this, 19, 20);
        leg3.addBox(0F, 0F, 0F, 4, 5, 4);
        leg3.setRotationPoint(7F, 15F, 2F);
        leg3.setTextureSize(64, 32);
        leg3.mirror = true;
        setRotation(leg3, 0F, 0F, 0F);
        leg4 = new ModelRenderer(this, 19, 20);
        leg4.addBox(0F, 0F, 0F, 4, 5, 4);
        leg4.setRotationPoint(-3F, 15F, 2F);
        leg4.setTextureSize(64, 32);
        leg4.mirror = true;
        setRotation(leg4, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Head.render(f5);
        Body.render(f5);
        leg1.render(f5);
        leg2.render(f5);
        leg3.render(f5);
        leg4.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
