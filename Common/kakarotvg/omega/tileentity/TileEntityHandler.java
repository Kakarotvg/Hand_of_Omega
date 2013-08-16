package kakarotvg.omega.tileentity;

import kakarotvg.omega.IDHandler;
import net.minecraft.block.Block;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TileEntityHandler {

    public static Block darknesssolid;
    public static Block computer;

    public static void configureTileEntitys(Configuration config) {
        darknesssolid = new TileEntitySolidDarkness(IDHandler.darknesssolidID).setUnlocalizedName("soliddarknessicon");
        computer = new TileEntityComputer(IDHandler.computerID).setUnlocalizedName("computericon");
    }

    public static void registerTileEntitys(GameRegistry registry) {
        registry.registerBlock(darknesssolid, "darknesssolid");
        registry.registerBlock(computer, "computer");
    }

    public static void addNames(LanguageRegistry register) {
        register.addName(darknesssolid, "Darkness Extrapalator");
        register.addName(computer, "Laptop");
    }

}
