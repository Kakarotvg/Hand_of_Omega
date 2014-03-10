package kakarotvg.omega.render.itemrender;

import org.lwjgl.opengl.GL11;

import kakarotvg.omega.entity.tileentity.TileEntityComputerEntity;
import kakarotvg.omega.model.ModelComputer;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntityRendererChestHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

public class ItemComputerRenderer implements IItemRenderer {
    
    TileEntitySpecialRenderer render;
    private ModelComputer computermodel;
    private TileEntity dummytile;
    
    public ItemComputerRenderer(TileEntitySpecialRenderer render, TileEntity dummy) {
        computermodel = new ModelComputer();
        this.render = render;
        this.dummytile = dummy;
    }
    
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        // TODO Auto-generated method stub
        return true;
    }
    
    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        // TODO Auto-generated method stub
        return true;
    }
    
    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        if (type == IItemRenderer.ItemRenderType.ENTITY) GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
        this.render.renderTileEntityAt(this.dummytile, 0.0D, 0.0D, 0.0D, 0.0F);
    }
    
}
