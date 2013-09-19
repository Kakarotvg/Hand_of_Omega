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
    private static final ResourceLocation resourceloc = new ResourceLocation(Reference.MOD_ID, "textures/mob/Slayer.png");

    public RenderSlayer(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
    }

    protected ResourceLocation getAnnihilatorTextures(EntitySlayer par1EntityCow) {
        return resourceloc;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity) {
        return this.getAnnihilatorTextures((EntitySlayer) par1Entity);
    }
}
