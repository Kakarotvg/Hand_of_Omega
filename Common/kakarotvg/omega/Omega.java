package kakarotvg.omega;

import kakarotvg.omega.generation.WorldGen;
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
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_N, version = Reference.MOD_V)
public class Omega {
    
    @Instance(Reference.MOD_ID)
    public static Omega instance;
    private GuiHandler guihandler = new GuiHandler();
    
    @SidedProxy(clientSide = "kakarotvg.omega.proxys.ClientProxy", serverSide = "kakarotvg.omega.proxys.CommonProxy")
    public static CommonProxy proxy;
    
    public static final VgPacketHandler packethandler = new VgPacketHandler();
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        packethandler.initialise();
        VgEventHandler.Events();
        
        BlockHandler.configureBlocks();
        BlockHandler.registerBlocks(new GameRegistry());
        // BlockHandler.setNames(new LanguageRegistry());
        BlockHandler.setHarvestLevel(new MinecraftForge());
        
        ItemHandler.configureItems();
        ItemHandler.registerItems(new GameRegistry());
        // ItemHandler.setNames(new LanguageRegistry());
        
        ToolHandler.configureTools();
        ToolHandler.registerItem(new GameRegistry());
        // ToolHandler.setNames(new LanguageRegistry());
        
        ArmorHandler.configreArmor();
        ArmorHandler.registerArmor(new GameRegistry());
        // ArmorHandler.setNames(new LanguageRegistry());
        
        CropHandler.configurecrops();
        CropHandler.registercrops(new GameRegistry());
        // CropHandler.addnames(new LanguageRegistry());
        
        LiquidHandler.configurefluids();
        LiquidHandler.registerfluids(new GameRegistry());
        // LiquidHandler.addNames(new LanguageRegistry());
        LiquidHandler.fluidContainerRegistry();
        
        TileEntityHandler.configureTileEntitys();
        TileEntityHandler.registerTileEntitys(new GameRegistry());
        // TileEntityHandler.addNames(new LanguageRegistry());
        TileEntityHandler.tileentityRegistry(new GameRegistry());
        
        GameRegistry.registerWorldGenerator(new WorldGen(), 0);
        NetworkRegistry.INSTANCE.registerGuiHandler(this, guihandler);
        
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
        packethandler.postInitialise();
    }
    
}
