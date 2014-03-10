package kakarotvg.omega.handlers.tileentity;

import kakarotvg.omega.blocks.UnderworldChest;
import kakarotvg.omega.entity.tileentity.TileEntityComputerEntity;
import kakarotvg.omega.entity.tileentity.TileEntityDarknessSolidEntity;
import kakarotvg.omega.handlers.creativetab.CreativetabHandler;
import kakarotvg.omega.tileentity.TileEntityComputer;
import kakarotvg.omega.tileentity.TileEntityUnderworldChest;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TileEntityHandler {
    
    public static Block darknesssolid;
    public static Block computer;
    public static Block computerburn;
    public static Block underworldchest;
    public static Block tealworkbench;
    
    public static void configureTileEntitys() {
        computer = new TileEntityComputer(false).setBlockName("computericon").setCreativeTab(CreativetabHandler.vgtab).setHardness(2.5F);
        underworldchest = new UnderworldChest(0).setBlockName("underworldchest").setCreativeTab(CreativetabHandler.vgtab).setHardness(2.5F);
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
