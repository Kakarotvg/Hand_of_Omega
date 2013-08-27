package kakarotvg.omega.render.mobs;

import kakarotvg.omega.Reference;
import kakarotvg.omega.entity.mobs.EntityJungleAssasin;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderJungleAssasin extends RenderLiving {
    private static final ResourceLocation field_110833_a = new ResourceLocation(Reference.MOD_ID + ":" + "textures/mob/JungleAssasin.png");

    public RenderJungleAssasin(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
    }

    protected ResourceLocation func_110832_a(EntityJungleAssasin par1EntityCow) {
        return field_110833_a;
    }

    protected ResourceLocation func_110775_a(Entity par1Entity) {
        return this.func_110832_a((EntityJungleAssasin) par1Entity);
    }
}