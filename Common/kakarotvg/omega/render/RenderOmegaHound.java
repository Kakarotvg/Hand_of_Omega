package kakarotvg.omega.render;

import kakarotvg.omega.Reference;
import kakarotvg.omega.entity.EntityOmegaHound;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderOmegaHound extends RenderLiving {
    private static final ResourceLocation field_110833_a = new ResourceLocation(Reference.MOD_ID + ":" + "textures/mob/Omegahound.png");

    public RenderOmegaHound(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
    }

    protected ResourceLocation func_110832_a(EntityOmegaHound par1EntityCow) {
        return field_110833_a;
    }

    protected ResourceLocation func_110775_a(Entity par1Entity) {
        return this.func_110832_a((EntityOmegaHound) par1Entity);
    }
}
