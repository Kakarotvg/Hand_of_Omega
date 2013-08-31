package kakarotvg.omega;

import kakarotvg.omega.handlers.IDs.IDHandler;
import kakarotvg.omega.handlers.armor.ArmorHandler;
import kakarotvg.omega.handlers.blocks.BlockHandler;
import kakarotvg.omega.handlers.crafting.CraftingHandler;
import kakarotvg.omega.handlers.creativetab.CreativetabHandler;
import kakarotvg.omega.handlers.crops.CropHandler;
import kakarotvg.omega.handlers.events.VgEventHandler;
import kakarotvg.omega.handlers.gui.GuiHandler;
import kakarotvg.omega.handlers.item.ItemHandler;
import kakarotvg.omega.handlers.liquids.LiquidHandler;
import kakarotvg.omega.handlers.tileentity.TileEntityHandler;
import kakarotvg.omega.handlers.tools.ToolHandler;
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
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_N, version = Reference.MOD_V)
@NetworkMod(serverSideRequired = false, clientSideRequired = true, channels = Reference.channels, packetHandler = VgPacketHandler.class)
public class Omega {

    @Instance(Reference.MOD_ID)
    public static Omega instance;
    private GuiHandler guihandler = new GuiHandler();

    @SidedProxy(clientSide = "kakarotvg.omega.proxys.ClientProxy", serverSide = "kakarotvg.omega.proxys.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        IDHandler.createConfiguration(config);
        config.save();

        VgEventHandler.Events();
        VgEventHandler.registerSound();

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

        LiquidHandler.configurefluids(config);
        LiquidHandler.registerfluids(new GameRegistry());
        LiquidHandler.addNames(new LanguageRegistry());
        LiquidHandler.fluidContainerRegistry();

        TileEntityHandler.configureTileEntitys(config);
        TileEntityHandler.registerTileEntitys(new GameRegistry());
        TileEntityHandler.addNames(new LanguageRegistry());
        TileEntityHandler.tileentityRegistry(new GameRegistry());

        GameRegistry.registerWorldGenerator(new WorldGen());
        NetworkRegistry.instance().registerGuiHandler(this, guihandler);

        CraftingHandler.addCrafting(new GameRegistry());
        CraftingHandler.addSmelting(new GameRegistry());

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
