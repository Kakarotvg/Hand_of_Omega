package com.kakarotvg.omega.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelComputer extends ModelBase {
    //fields
    ModelRenderer Screen;
    ModelRenderer Keyboard;
    ModelRenderer Shape1;

    public ModelComputer() {
        textureWidth = 128;
        textureHeight = 64;

        Screen = new ModelRenderer(this, 0, 39);
        Screen.addBox(0F, 0F, 0F, 16, 12, 2);
        Screen.setRotationPoint(-8F, 10F, 6F);
        Screen.setTextureSize(128, 64);
        Screen.mirror = true;
        setRotation(Screen, 0F, 0F, 0F);
        Keyboard = new ModelRenderer(this, 0, 0);
        Keyboard.addBox(0F, 0F, 0F, 16, 2, 16);
        Keyboard.setRotationPoint(-8F, 22F, -8F);
        Keyboard.setTextureSize(128, 64);
        Keyboard.mirror = true;
        setRotation(Keyboard, 0F, 0F, 0F);
        Shape1 = new ModelRenderer(this, 0, 26);
        Shape1.addBox(0F, 0F, 0F, 16, 1, 1);
        Shape1.setRotationPoint(-8F, 21F, 5F);
        Shape1.setTextureSize(128, 64);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Screen.render(f5);
        Keyboard.render(f5);
        Shape1.render(f5);
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
