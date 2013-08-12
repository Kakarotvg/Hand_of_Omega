package kakarotvg.omega;

import kakarotvg.omega.crops.BlockDarknessCrop;
import kakarotvg.omega.crops.BlockLightCrop;
import kakarotvg.omega.crops.VgSeeds;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CropHandler {

    public static Block darknesscrop;
    public static Item darknessseeds;
    public static Block lightcrop;
    public static Item lightseeds;

    public static void configurecrops(Configuration config) {
        darknesscrop = new BlockDarknessCrop(config.get("Darkness IDs", "Darkness Crop", 2800).getInt()).setUnlocalizedName("darknesscrop");
        darknessseeds = new VgSeeds(config.get("Darkness IDs", "Darkness seeds", 9800).getInt(), 4, 0.3F, darknesscrop.blockID, Block.tilledField.blockID).setUnlocalizedName("darknessseeds").setCreativeTab(CreativetabHandler.vgtab2);
        lightcrop = new BlockLightCrop(config.get("Light IDs", "Light Crop", 2801).getInt()).setUnlocalizedName("lightcrop");
        lightseeds = new VgSeeds(config.get("Light IDs", "Light Seeds", 9801).getInt(), 4, 0.3F, lightcrop.blockID, Block.tilledField.blockID).setUnlocalizedName("lightseeds").setCreativeTab(CreativetabHandler.vgtab2);

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
