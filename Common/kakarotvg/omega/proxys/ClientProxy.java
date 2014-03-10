package kakarotvg.omega.proxys;

import kakarotvg.omega.entity.mobs.EntityAnnihilator;
import kakarotvg.omega.entity.mobs.EntityEliminator;
import kakarotvg.omega.entity.mobs.EntityJungleAssasin;
import kakarotvg.omega.entity.mobs.EntityOmegaHound;
import kakarotvg.omega.entity.mobs.EntityOmegakiller;
import kakarotvg.omega.entity.mobs.EntitySlayer;
import kakarotvg.omega.entity.tileentity.TileEntityComputerEntity;
import kakarotvg.omega.handlers.tileentity.TileEntityHandler;
import kakarotvg.omega.model.ModelAnnihilator;
import kakarotvg.omega.model.ModelEliminator;
import kakarotvg.omega.model.ModelJungleAsasin;
import kakarotvg.omega.model.ModelOmegaHound;
import kakarotvg.omega.model.ModelOmegakiller;
import kakarotvg.omega.model.ModelSlayer;
import kakarotvg.omega.render.itemrender.ItemComputerRenderer;
import kakarotvg.omega.render.itemrender.UnderworldChestItemRender;
import kakarotvg.omega.render.mobs.RenderAnnihilator;
import kakarotvg.omega.render.mobs.RenderEliminator;
import kakarotvg.omega.render.mobs.RenderJungleAssasin;
import kakarotvg.omega.render.mobs.RenderOmegaHound;
import kakarotvg.omega.render.mobs.RenderOmegaKiller;
import kakarotvg.omega.render.mobs.RenderSlayer;
import kakarotvg.omega.render.tileentity.TileEntityComputerRenderer;
import kakarotvg.omega.render.tileentity.TileEntityUnderworldchestrenderer;
import kakarotvg.omega.tileentity.TileEntityUnderworldChest;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
    
    public void registerRenderInformation() {
        // Renders the Mobs
        RenderingRegistry.registerEntityRenderingHandler(EntityOmegaHound.class, new RenderOmegaHound(new ModelOmegaHound(), 0.05F));
        RenderingRegistry.registerEntityRenderingHandler(EntityOmegakiller.class, new RenderOmegaKiller(new ModelOmegakiller(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEliminator.class, new RenderEliminator(new ModelEliminator(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlayer.class, new RenderSlayer(new ModelSlayer(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAnnihilator.class, new RenderAnnihilator(new ModelAnnihilator(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityJungleAssasin.class, new RenderJungleAssasin(new ModelJungleAsasin(), 0.5F));
    }
    
    public void registerRenderThings() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityComputerEntity.class, new TileEntityComputerRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityUnderworldChest.class, new TileEntityUnderworldchestrenderer());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(TileEntityHandler.underworldchest), new UnderworldChestItemRender(null, null));
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(TileEntityHandler.computer), new ItemComputerRenderer(null, null));
    }
    
    @Override
    public void registerRenders() {
        
    }
    
    @Override
    public int addArmor(String armor) {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
    
}
