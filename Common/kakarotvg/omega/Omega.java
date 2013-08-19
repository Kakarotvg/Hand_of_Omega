package kakarotvg.omega;

import kakarotvg.omega.entity.TileEntityComputerEntity;
import kakarotvg.omega.entity.TileEntityDarknessSolidEntity;
import kakarotvg.omega.handlers.ArmorHandler;
import kakarotvg.omega.handlers.BlockHandler;
import kakarotvg.omega.handlers.CraftingHandler;
import kakarotvg.omega.handlers.CreativetabHandler;
import kakarotvg.omega.handlers.CropHandler;
import kakarotvg.omega.handlers.IDHandler;
import kakarotvg.omega.handlers.ItemHandler;
import kakarotvg.omega.handlers.LiquidHandler;
import kakarotvg.omega.handlers.TileEntityHandler;
import kakarotvg.omega.handlers.ToolHandler;
import kakarotvg.omega.handlers.VgEventHandler;
import kakarotvg.omega.proxys.CommonProxy;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_N, version = Reference.MOD_V)
@NetworkMod(serverSideRequired = false, clientSideRequired = true)
public class Omega {

    @Instance(Reference.MOD_N)
    public static Omega instance;

    @SidedProxy(clientSide = "kakarotvg.omega.proxys.ClientProxy", serverSide = "kakarotvg.omega.proxys.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        IDHandler.createConfiguration(config);
        config.save();

        VgEventHandler.Events();

        BlockHandler.configureBlocks(config);
        BlockHandler.registerBlocks(new GameRegistry());
        BlockHandler.setNames(new LanguageRegistry());
        BlockHandler.setHarvestlevel(new MinecraftForge());

        ItemHandler.configureItems(config);
        ItemHandler.registerItems(new GameRegistry());
        ItemHandler.setNames(new LanguageRegistry());

        ToolHandler.configureTools(config);
        ToolHandler.registerItem(new GameRegistry());
        ToolHandler.setNames(new LanguageRegistry());
        ToolHandler.setToolClass(new MinecraftForge());

        ArmorHandler.configreArmor(config);
        ArmorHandler.registerArmor(new GameRegistry());
        ArmorHandler.setNames(new LanguageRegistry());

        CropHandler.configurecrops(config);
        CropHandler.registercrops(new GameRegistry());
        CropHandler.addnames(new LanguageRegistry());

        CreativetabHandler.setNames(new LanguageRegistry());

        CraftingHandler.addCrafting(new GameRegistry());
        CraftingHandler.addSmelting(new GameRegistry());

        LiquidHandler.configurefluids(config);
        LiquidHandler.registerfluids(new GameRegistry());
        LiquidHandler.addNames(new LanguageRegistry());
        LiquidHandler.fluidContainerRegistry();

        TileEntityHandler.configureTileEntitys(config);
        TileEntityHandler.registerTileEntitys(new GameRegistry());
        TileEntityHandler.addNames(new LanguageRegistry());

        GameRegistry.registerWorldGenerator(new WorldGen());
        GameRegistry.registerTileEntity(TileEntityDarknessSolidEntity.class, "tileEntityDarknessSolid");
        GameRegistry.registerTileEntity(TileEntityComputerEntity.class, "tileEntityComputer");

        // loads the init method of Commonproxy
        proxy.init();

    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
