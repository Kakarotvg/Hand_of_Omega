package kakarotvg.omega.crops;

import kakarotvg.omega.CreativetabHandler;
import kakarotvg.omega.IDHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CropHandler {

    public static Block darknesscrop;
    public static Item darknessseeds;
    public static Block lightcrop;
    public static Item lightseeds;

    public static void configurecrops(Configuration config) {
        darknesscrop = new BlockDarknessCrop(IDHandler.darknesscropID).setUnlocalizedName("darknesscrop");
        darknessseeds = new VgSeeds(IDHandler.darknessseedsID, 4, 0.3F, darknesscrop.blockID, Block.tilledField.blockID).setUnlocalizedName("darknessseeds").setCreativeTab(CreativetabHandler.vgtab2);
        lightcrop = new BlockLightCrop(IDHandler.lightcropID).setUnlocalizedName("lightcrop");
        lightseeds = new VgSeeds(IDHandler.lightseedsID, 4, 0.3F, lightcrop.blockID, Block.tilledField.blockID).setUnlocalizedName("lightseeds").setCreativeTab(CreativetabHandler.vgtab2);

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
