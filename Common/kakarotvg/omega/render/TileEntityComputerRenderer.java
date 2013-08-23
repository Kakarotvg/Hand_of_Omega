package kakarotvg.omega.render;

import kakarotvg.omega.Reference;
import kakarotvg.omega.model.ModelComputer;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

public class TileEntityComputerRenderer extends TileEntitySpecialRenderer {

    //The model of your block
    public final ModelComputer model;
    private static final ResourceLocation resourceloc = new ResourceLocation(Reference.MOD_ID + ":" + "textures/tileentity/computer.png");

    public TileEntityComputerRenderer() {
        this.model = new ModelComputer();
    }

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
        //The PushMatrix tells the renderer to "start" doing something.
        GL11.glPushMatrix();
        //This is setting the initial location.
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        //This is the texture of your block. It's pathed to be the same place as your other blocks here.
        //This rotation part is very important! Without it, your model will render upside-down! And for some reason you DO need PushMatrix again!                       
        GL11.glPushMatrix();
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);

        adjustLightFixture(te.worldObj, te.xCoord, te.yCoord, te.zCoord, te.blockType);
        //A reference to your Model file. Again, very important.
        //Tell it to stop rendering for both the PushMatrix's
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }

    //Set the lighting stuff, so it changes it's brightness properly.       
    private void adjustLightFixture(World world, int i, int j, int k, Block block) {

        int dir = world.getBlockMetadata(i, j, k);

        GL11.glPushMatrix();
        //This line actually rotates the renderer.
        GL11.glRotatef(dir * (90F), 0F, 1F, 0F);
        Minecraft.getMinecraft().renderEngine.func_110577_a(resourceloc);
        this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        /*
         * Place your rendering code here.
         */

        GL11.glPopMatrix();

    }
}
