package kakarotvg.omega;

import kakarotvg.omega.blocks.VgFluid;
import kakarotvg.omega.items.VgBucket;
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
        MinecraftForge.EVENT_BUS.register(new VgBucket(0, 0, null));
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        LiquidHandler.configurefluids(config);
        BlockHandler.configureBlocks(config);
        ItemHandler.configureItems(config);
        ToolHandler.configureTools(config);
        ArmorHandler.configreArmor(config);
        CropHandler.configurecrops(config);
        config.save();

        LiquidHandler.registerfluids(new GameRegistry());
        LiquidHandler.addNames(new LanguageRegistry());
        BlockHandler.registerBlocks(new GameRegistry());
        BlockHandler.setNames(new LanguageRegistry());
        BlockHandler.setHarvestlevel(new MinecraftForge());

        ItemHandler.registerItems(new GameRegistry());
        ItemHandler.setNames(new LanguageRegistry());
        CreativetabHandler.setNames(new LanguageRegistry());
        ToolHandler.registerItem(new GameRegistry());
        ToolHandler.setNames(new LanguageRegistry());
        ToolHandler.setToolClass(new MinecraftForge());
        ArmorHandler.registerArmor(new GameRegistry());
        ArmorHandler.setNames(new LanguageRegistry());
        CraftingHandler.addCrafting(new GameRegistry());
        CraftingHandler.addSmelting(new GameRegistry());
        CropHandler.registercrops(new GameRegistry());
        CropHandler.addnames(new LanguageRegistry());

        GameRegistry.registerWorldGenerator(new WorldGen());

        FluidContainerRegistry.registerFluidContainer(LiquidHandler.Darkness, new ItemStack(ItemHandler.darknessbucket, 1, 1), new ItemStack(Item.bucketEmpty));
        // loads the init method of Commonproxy
        proxy.init();
        MinecraftForge.addGrassSeed(new ItemStack(CropHandler.darknessseeds), 10);
        MinecraftForge.addGrassSeed(new ItemStack(CropHandler.lightseeds), 10);

    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
