package com.kakarotvg.omega.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelEliminator extends ModelBase {
    // fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer line1;
    ModelRenderer line2;
    ModelRenderer line3;
    ModelRenderer line4;
    ModelRenderer back;
    ModelRenderer hood;

    public ModelEliminator() {
        textureWidth = 128;
        textureHeight = 64;

        head = new ModelRenderer(this, 70, 22);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, 0F, 0F);
        head.setTextureSize(128, 64);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        body = new ModelRenderer(this, 16, 41);
        body.addBox(-4F, 0F, -2F, 8, 12, 4);
        body.setRotationPoint(0F, 0F, 0F);
        body.setTextureSize(128, 64);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        rightarm = new ModelRenderer(this, 48, 41);
        rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
        rightarm.setRotationPoint(-5F, 2F, 0F);
        rightarm.setTextureSize(128, 64);
        rightarm.mirror = true;
        setRotation(rightarm, -1.27409F, 0F, 0F);
        leftarm = new ModelRenderer(this, 49, 41);
        leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
        leftarm.setRotationPoint(5F, 2F, 0F);
        leftarm.setTextureSize(128, 64);
        leftarm.mirror = true;
        setRotation(leftarm, -0.9599311F, 0F, 0F);
        rightleg = new ModelRenderer(this, 0, 26);
        rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        rightleg.setRotationPoint(-2F, 12F, 0F);
        rightleg.setTextureSize(128, 64);
        rightleg.mirror = true;
        setRotation(rightleg, 0F, 0F, 0F);
        leftleg = new ModelRenderer(this, 0, 25);
        leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        leftleg.setRotationPoint(2F, 12F, 0F);
        leftleg.setTextureSize(128, 64);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
        line1 = new ModelRenderer(this, 59, 0);
        line1.addBox(0F, 0F, 0F, 1, 10, 3);
        line1.setRotationPoint(3F, 1F, 5F);
        line1.setTextureSize(128, 64);
        line1.mirror = true;
        setRotation(line1, 0F, 3.141593F, 0F);
        line2 = new ModelRenderer(this, 59, 0);
        line2.addBox(0F, 0F, 0F, 1, 10, 3);
        line2.setRotationPoint(-3F, 1F, 2F);
        line2.setTextureSize(128, 64);
        line2.mirror = true;
        setRotation(line2, 0F, 0F, 0F);
        line3 = new ModelRenderer(this, 36, 0);
        line3.addBox(0F, 0F, 0F, 6, 1, 3);
        line3.setRotationPoint(-3F, 1F, 2F);
        line3.setTextureSize(128, 64);
        line3.mirror = true;
        setRotation(line3, 0F, 0F, 0F);
        line4 = new ModelRenderer(this, 36, 0);
        line4.addBox(0F, 0F, 0F, 6, 1, 3);
        line4.setRotationPoint(-3F, 10F, 2F);
        line4.setTextureSize(128, 64);
        line4.mirror = true;
        setRotation(line4, 0F, 0F, 0F);
        back = new ModelRenderer(this, 37, 18);
        back.addBox(0F, 0F, 0F, 6, 10, 1);
        back.setRotationPoint(-3F, 1F, 4F);
        back.setTextureSize(128, 64);
        back.mirror = true;
        setRotation(back, 0F, 0F, 0F);
        hood = new ModelRenderer(this, 0, 0);
        hood.addBox(0F, 0F, 0F, 6, 6, 6);
        hood.setRotationPoint(-3F, -2F, -1.466667F);
        hood.setTextureSize(128, 64);
        hood.mirror = true;
        setRotation(hood, 0.7853982F, 0F, 0F);
    }

    public void render(Entity par1entity, float par2, float par3, float par4, float par5, float par6, float par7) {
        super.render(par1entity, par2, par3, par4, par5, par6, par7);
        setRotationAngles(par2, par3, par4, par5, par6, par7, par1entity);
        head.render(par7);
        body.render(par7);
        rightarm.render(par7);
        leftarm.render(par7);
        rightleg.render(par7);
        leftleg.render(par7);
        line1.render(par7);
        line2.render(par7);
        line3.render(par7);
        line4.render(par7);
        back.render(par7);
        hood.render(par7);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7entity);
        this.leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
        this.rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float) Math.PI) * 1.4F * par2;

        this.rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
        this.leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float) Math.PI) * 1.4F * par2;
    }

}
