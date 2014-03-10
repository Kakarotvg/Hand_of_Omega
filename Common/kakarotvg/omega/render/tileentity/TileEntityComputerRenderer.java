package kakarotvg.omega.render.tileentity;

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
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.client.FMLClientHandler;

public class TileEntityComputerRenderer extends TileEntitySpecialRenderer {
    
    // The model of your block
    public final ModelComputer model;
    private static final ResourceLocation resourceloc = new ResourceLocation(Reference.MOD_ID, "textures/TileEntity/Computer.png");
    
    public TileEntityComputerRenderer() {
        this.model = new ModelComputer();
    }
    
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
        // The PushMatrix tells the renderer to "start" doing something.
        GL11.glPushMatrix();
        
        // This is setting the initial location.
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        // This is the texture of your block. It's pathed to be the same place
        // as your other blocks here.
        // This rotation part is very important! Without it, your model will
        // render upside-down! And for some reason you DO need PushMatrix again!
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(resourceloc);
        GL11.glPushMatrix();
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        if (te.getWorldObj() == null) {
            GL11.glRotatef(te.blockMetadata * (180), 0.0F, 1.0F, 0.0F);
            this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        }
        else {
            adjustLightFixture(te.getWorldObj(), te.xCoord, te.yCoord, te.zCoord, te.blockType);
        }
        // A reference to your Model file. Again, very important.
        // Tell it to stop rendering for both the PushMatrix's
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
    
    // Set the lighting stuff, so it changes it's brightness properly.
    private void adjustLightFixture(World world, int i, int j, int k, Block block) {
        if (world != null) {
            int dir = world.getBlockMetadata(i, j, k);
            
            GL11.glPushMatrix();
            // This line actually rotates the renderer.
            GL11.glRotatef(dir * (90F), 0F, 1F, 0F);
            
            this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
            /*
             * Place your rendering code here.
             */
            
            GL11.glPopMatrix();
        }
        
    }
}
