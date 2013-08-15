package kakarotvg.omega;

import kakarotvg.omega.armor.ArmorHandler;
import kakarotvg.omega.blocks.BlockHandler;
import kakarotvg.omega.crops.CropHandler;
import kakarotvg.omega.events.VgEventHandler;
import kakarotvg.omega.fluids.LiquidHandler;
import kakarotvg.omega.fluids.DarknessFluid;
import kakarotvg.omega.items.ItemHandler;
import kakarotvg.omega.items.VgBucket;
import kakarotvg.omega.tools.ToolHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.fluids.FluidRegistry;
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

    @SidedProxy(clientSide = "kakarotvg.omega.client.ClientProxy", serverSide = "kakarotvg.omega.CommonProxy")
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

        GameRegistry.registerWorldGenerator(new WorldGen());

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
