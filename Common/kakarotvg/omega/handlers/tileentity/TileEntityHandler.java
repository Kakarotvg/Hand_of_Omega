package kakarotvg.omega.handlers.tileentity;

import kakarotvg.omega.blocks.UnderworldChest;
import kakarotvg.omega.entity.TileEntityComputerEntity;
import kakarotvg.omega.entity.TileEntityDarknessSolidEntity;
import kakarotvg.omega.handlers.IDs.IDHandler;
import kakarotvg.omega.handlers.creativetab.CreativetabHandler;
import kakarotvg.omega.tileentity.TileEntityComputer;
import kakarotvg.omega.tileentity.TileEntitySolidDarkness;
import kakarotvg.omega.tileentity.TileEntityUnderworldChest;
import net.minecraft.block.Block;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TileEntityHandler {

    public static Block darknesssolid;
    public static Block computer;
    public static Block computerburn;
    public static Block underworldchest;

    public static void configureTileEntitys(Configuration config) {
        darknesssolid = new TileEntitySolidDarkness(IDHandler.darknesssolidID).setUnlocalizedName("soliddarknessicon");
        computer = new TileEntityComputer(IDHandler.computeridleID, false).setUnlocalizedName("computericon").setCreativeTab(CreativetabHandler.vgtab);
        computerburn = new TileEntityComputer(IDHandler.computerburnID, true).setUnlocalizedName("computericon");
        underworldchest = new UnderworldChest(IDHandler.underworldchestID, 0).setUnlocalizedName("underworldchest").setCreativeTab(CreativetabHandler.vgtab);
    }

    public static void registerTileEntitys(GameRegistry registry) {
        registry.registerBlock(darknesssolid, "darknesssolid");
        registry.registerBlock(computer, "computer");
        registry.registerBlock(underworldchest, "underworldchest");
    }

    public static void addNames(LanguageRegistry register) {
        register.addName(darknesssolid, "Darkness Extrapalator");
        register.addName(computer, "Laptop");
        register.addName(underworldchest, "Underworld Chest");
    }

    public static void tileentityRegistry(GameRegistry registry) {
        registry.registerTileEntity(TileEntityDarknessSolidEntity.class, "tileEntityDarknessSolid");
        registry.registerTileEntity(TileEntityComputerEntity.class, "tileEntityComputer");
        registry.registerTileEntity(TileEntityUnderworldChest.class, "TileEntityUnderworldChest");
    }

}
