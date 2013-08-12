package kakarotvg.omega;

import net.minecraft.item.ItemStack;
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

    @SidedProxy(clientSide = "kakarotvg.omega.client.ClientProxy", serverSide = "kakarotvg.omega.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        BlockHandler.configureBlocks(config);
        ItemHandler.configureItems(config);
        ToolHandler.configureTools(config);
        ArmorHandler.configreArmor(config);
        CropHandler.configurecrops(config);
        config.save();

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

    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {
        // loads the init method of Commonproxy
        proxy.init();
        MinecraftForge.addGrassSeed(new ItemStack(CropHandler.darknessseeds), 10);
        MinecraftForge.addGrassSeed(new ItemStack(CropHandler.lightseeds), 10);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
