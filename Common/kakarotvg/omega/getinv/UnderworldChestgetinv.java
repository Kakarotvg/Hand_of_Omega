package kakarotvg.omega.getinv;

import static net.minecraftforge.common.util.ForgeDirection.DOWN;
import kakarotvg.omega.blocks.UnderworldChest;
import kakarotvg.omega.handlers.tileentity.TileEntityHandler;
import kakarotvg.omega.tileentity.TileEntityUnderworldChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;

public class UnderworldChestgetinv {
    
    public static IInventory getInventory(World world, int par2, int par3, int par4) {
        Object object = (TileEntityChest) world.getTileEntity(par2, par3, par4);
        
        if (object == null) {
            return null;
        }
        else if (world.isSideSolid(par2, par3 + 1, par4, DOWN)) {
            return null;
        }
        else if (UnderworldChest.isOcelotBlockingChest(world, par2, par3, par4)) {
            return null;
        }
        else if (world.getBlock(par2 - 1, par3, par4) == TileEntityHandler.underworldchest && (world.isSideSolid(par2 - 1, par3 + 1, par4, DOWN) || UnderworldChest.isOcelotBlockingChest(world, par2 - 1, par3, par4))) {
            return null;
        }
        else if (world.getBlock(par2 + 1, par3, par4) == TileEntityHandler.underworldchest && (world.isSideSolid(par2 + 1, par3 + 1, par4, DOWN) || UnderworldChest.isOcelotBlockingChest(world, par2 + 1, par3, par4))) {
            return null;
        }
        else if (world.getBlock(par2, par3, par4 - 1) == TileEntityHandler.underworldchest && (world.isSideSolid(par2, par3 + 1, par4 - 1, DOWN) || UnderworldChest.isOcelotBlockingChest(world, par2, par3, par4 - 1))) {
            return null;
        }
        else if (world.getBlock(par2, par3, par4 + 1) == TileEntityHandler.underworldchest && (world.isSideSolid(par2, par3 + 1, par4 + 1, DOWN) || UnderworldChest.isOcelotBlockingChest(world, par2, par3, par4 + 1))) {
            return null;
        }
        else {
            if (world.getBlock(par2 - 1, par3, par4) == TileEntityHandler.underworldchest) {
                object = new InventoryLargeChest("Underworld Chest", (TileEntityChest) world.getTileEntity(par2 - 1, par3, par4), (IInventory) object);
            }
            
            if (world.getBlock(par2 + 1, par3, par4) == TileEntityHandler.underworldchest) {
                object = new InventoryLargeChest("Underworld Chest", (IInventory) object, (TileEntityChest) world.getTileEntity(par2 + 1, par3, par4));
            }
            
            if (world.getBlock(par2, par3, par4 - 1) == TileEntityHandler.underworldchest) {
                object = new InventoryLargeChest("Underworld Chest", (TileEntityChest) world.getTileEntity(par2, par3, par4 - 1), (IInventory) object);
            }
            
            if (world.getBlock(par2, par3, par4 + 1) == TileEntityHandler.underworldchest) {
                object = new InventoryLargeChest("Underworld Chest", (IInventory) object, (TileEntityChest) world.getTileEntity(par2, par3, par4 + 1));
            }
            
            return (IInventory) object;
        }
    }
}
