package kakarotvg.omega.render.itemrender;

import kakarotvg.omega.entity.tileentity.TileEntityComputerEntity;
import kakarotvg.omega.model.ModelComputer;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemComputerRenderer implements IItemRenderer {

    private ModelComputer computermodel;

    public ItemComputerRenderer() {
        computermodel = new ModelComputer();
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
        TileEntityRenderer.instance.renderTileEntityAt(new TileEntityComputerEntity(), 0.0D, 0.0D, 0.0D, 0.0f);
    }

}
