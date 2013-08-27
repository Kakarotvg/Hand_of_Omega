package kakarotvg.omega.render.mobs;

import kakarotvg.omega.Reference;
import kakarotvg.omega.entity.mobs.EntitySlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSlayer extends RenderLiving {
    private static final ResourceLocation field_110833_a = new ResourceLocation(Reference.MOD_ID + ":" + "textures/mob/Slayer.png");

    public RenderSlayer(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
    }

    protected ResourceLocation func_110832_a(EntitySlayer par1EntityCow) {
        return field_110833_a;
    }

    protected ResourceLocation func_110775_a(Entity par1Entity) {
        return this.func_110832_a((EntitySlayer) par1Entity);
    }
}
