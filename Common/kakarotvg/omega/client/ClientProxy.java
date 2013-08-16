package kakarotvg.omega.client;

import kakarotvg.omega.CommonProxy;
import kakarotvg.omega.entity.EntityEliminator;
import kakarotvg.omega.entity.EntityOmegaHound;
import kakarotvg.omega.entity.EntityOmegakiller;
import kakarotvg.omega.entity.EntitySlayer;
import kakarotvg.omega.entity.TileEntityComputerEntity;
import kakarotvg.omega.entity.TileEntityDarknessSolidEntity;
import kakarotvg.omega.model.ModelEliminator;
import kakarotvg.omega.model.ModelOmegaHound;
import kakarotvg.omega.model.ModelOmegakiller;
import kakarotvg.omega.model.ModelSlayer;
import kakarotvg.omega.render.RenderEliminator;
import kakarotvg.omega.render.RenderOmegaHound;
import kakarotvg.omega.render.RenderOmegaKiller;
import kakarotvg.omega.render.RenderSlayer;
import kakarotvg.omega.render.TileEntityComputerRenderer;
import kakarotvg.omega.render.TileEntityDarknessSolidRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    public void registerRenderInformation() {
        // Renders the Mobs
        RenderingRegistry.registerEntityRenderingHandler(EntityOmegaHound.class, new RenderOmegaHound(new ModelOmegaHound(), 0.05F));
        RenderingRegistry.registerEntityRenderingHandler(EntityOmegakiller.class, new RenderOmegaKiller(new ModelOmegakiller(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEliminator.class, new RenderEliminator(new ModelEliminator(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlayer.class, new RenderSlayer(new ModelSlayer(), 0.5F));

    }

    public void registerRenderThings() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDarknessSolidEntity.class, new TileEntityDarknessSolidRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityComputerEntity.class, new TileEntityComputerRenderer());
    }

    @Override
    public void registerRenders() {

    }

    @Override
    public int addArmor(String armor) {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }

}
