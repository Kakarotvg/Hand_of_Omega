package kakarotvg.omega.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelJungleAsasin extends ModelBase {
    //fields
    ModelRenderer Back;
    ModelRenderer Back1;
    ModelRenderer Back2;
    ModelRenderer Back3;
    ModelRenderer Back4;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer headspike;
    ModelRenderer headspike2;
    ModelRenderer shoulderspike;
    ModelRenderer Shape3;

    public ModelJungleAsasin() {
        textureWidth = 128;
        textureHeight = 64;

        Back = new ModelRenderer(this, 107, 0);
        Back.addBox(0F, 0F, 0F, 6, 4, 4);
        Back.setRotationPoint(-3F, 9F, 2F);
        Back.setTextureSize(128, 64);
        Back.mirror = true;
        setRotation(Back, -0.6981317F, 0F, 0F);
        Back1 = new ModelRenderer(this, 107, 0);
        Back1.addBox(0F, 0F, 0F, 6, 4, 4);
        Back1.setRotationPoint(-3F, 7F, 2F);
        Back1.setTextureSize(128, 64);
        Back1.mirror = true;
        setRotation(Back1, -0.3839724F, 0F, 0F);
        Back2 = new ModelRenderer(this, 107, 0);
        Back2.addBox(0F, 0F, 0F, 6, 4, 4);
        Back2.setRotationPoint(-3F, 5F, 1F);
        Back2.setTextureSize(128, 64);
        Back2.mirror = true;
        setRotation(Back2, -0.1919862F, 0F, 0F);
        Back3 = new ModelRenderer(this, 107, 0);
        Back3.addBox(0F, 0F, 0F, 6, 4, 4);
        Back3.setRotationPoint(-3F, 2F, 1F);
        Back3.setTextureSize(128, 64);
        Back3.mirror = true;
        setRotation(Back3, -0.2792527F, 0F, 0F);
        Back4 = new ModelRenderer(this, 107, 0);
        Back4.addBox(0F, 0F, 0F, 6, 4, 4);
        Back4.setRotationPoint(-3F, 0F, 0F);
        Back4.setTextureSize(128, 64);
        Back4.mirror = true;
        setRotation(Back4, -0.3141593F, 0F, 0F);
        head = new ModelRenderer(this, 0, 27);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, 0F, 0F);
        head.setTextureSize(128, 64);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        body = new ModelRenderer(this, 0, 46);
        body.addBox(-4F, 0F, -2F, 8, 12, 6);
        body.setRotationPoint(0F, 0F, -1F);
        body.setTextureSize(128, 64);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        rightarm = new ModelRenderer(this, 40, 0);
        rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
        rightarm.setRotationPoint(-5F, 2F, 0F);
        rightarm.setTextureSize(128, 64);
        rightarm.mirror = true;
        setRotation(rightarm, 0F, 0F, 0F);
        leftarm = new ModelRenderer(this, 40, 0);
        leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
        leftarm.setRotationPoint(5F, 2F, 0F);
        leftarm.setTextureSize(128, 64);
        leftarm.mirror = true;
        setRotation(leftarm, 0F, 0F, 0F);
        rightleg = new ModelRenderer(this, 0, 0);
        rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        rightleg.setRotationPoint(-2F, 12F, 0F);
        rightleg.setTextureSize(128, 64);
        rightleg.mirror = true;
        setRotation(rightleg, 0F, 0F, 0F);
        leftleg = new ModelRenderer(this, 0, 0);
        leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        leftleg.setRotationPoint(2F, 12F, 0F);
        leftleg.setTextureSize(128, 64);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
        headspike = new ModelRenderer(this, 61, 15);
        headspike.addBox(0F, 0F, 0F, 6, 6, 6);
        headspike.setRotationPoint(-3F, -7F, 2F);
        headspike.setTextureSize(128, 64);
        headspike.mirror = true;
        setRotation(headspike, -0.8901179F, 0F, 0F);
        headspike2 = new ModelRenderer(this, 61, 15);
        headspike2.addBox(0F, 0F, 0F, 6, 6, 6);
        headspike2.setRotationPoint(-3F, -5F, -4F);
        headspike2.setTextureSize(128, 64);
        headspike2.mirror = true;
        setRotation(headspike2, 1.012291F, 0F, 0F);
        shoulderspike = new ModelRenderer(this, 18, 0);
        shoulderspike.addBox(0F, 0F, 0F, 4, 4, 4);
        shoulderspike.setRotationPoint(2F, -1F, -2F);
        shoulderspike.setTextureSize(128, 64);
        shoulderspike.mirror = true;
        setRotation(shoulderspike, 0F, 0F, -0.5585054F);
        shoulderspike.mirror = false;
        Shape3 = new ModelRenderer(this, 18, 0);
        Shape3.addBox(0F, 0F, 0F, 4, 4, 4);
        Shape3.setRotationPoint(-2F, -1F, -2F);
        Shape3.setTextureSize(128, 64);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 0F, 2.129302F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Back.render(f5);
        Back1.render(f5);
        Back2.render(f5);
        Back3.render(f5);
        Back4.render(f5);
        head.render(f5);
        body.render(f5);
        rightarm.render(f5);
        leftarm.render(f5);
        rightleg.render(f5);
        leftleg.render(f5);
        headspike.render(f5);
        headspike2.render(f5);
        shoulderspike.render(f5);
        Shape3.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        this.leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;

        this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
    }

}
