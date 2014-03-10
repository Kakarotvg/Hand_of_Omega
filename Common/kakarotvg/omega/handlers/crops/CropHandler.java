package kakarotvg.omega.handlers.crops;

import kakarotvg.omega.crops.BlockDarknessCrop;
import kakarotvg.omega.crops.BlockLightCrop;
import kakarotvg.omega.crops.VgSeeds;
import kakarotvg.omega.handlers.creativetab.CreativetabHandler;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CropHandler {
    
    public static Block darknesscrop;
    public static Item darknessseeds;
    public static Block lightcrop;
    public static Item lightseeds;
    
    public static void configurecrops() {
        darknesscrop = new BlockDarknessCrop().setBlockName("darknesscrop");
        darknessseeds = new VgSeeds(darknesscrop, Blocks.farmland).setUnlocalizedName("darknessseeds").setCreativeTab(CreativetabHandler.vgtab2);
        lightcrop = new BlockLightCrop().setBlockName("lightcrop");
        lightseeds = new VgSeeds(lightcrop, Blocks.farmland).setUnlocalizedName("lightseeds").setCreativeTab(CreativetabHandler.vgtab2);
        
        MinecraftForge.addGrassSeed(new ItemStack(CropHandler.darknessseeds), 3);
        MinecraftForge.addGrassSeed(new ItemStack(CropHandler.lightseeds), 3);
        
    }
    
    public static void registercrops(GameRegistry register) {
        register.registerBlock(darknesscrop, "darknesscrop");
        register.registerItem(darknessseeds, "darknessseeds");
        register.registerBlock(lightcrop, "lightcrop");
        register.registerItem(lightseeds, "lightseeds");
    }
    
    public static void addnames(LanguageRegistry registry) {
        registry.addName(darknesscrop, "Darkness Crop");
        registry.addName(darknessseeds, "Darkness Seeds");
        registry.addName(lightcrop, "Light Crop");
        registry.addName(lightseeds, "Light Seeds");
        
    }
}
