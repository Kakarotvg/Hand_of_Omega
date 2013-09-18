package kakarotvg.omega.getinv;

import static net.minecraftforge.common.ForgeDirection.DOWN;
import kakarotvg.omega.blocks.UnderworldChest;
import kakarotvg.omega.handlers.tileentity.TileEntityHandler;
import kakarotvg.omega.tileentity.TileEntityUnderworldChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.world.World;

public class UnderworldChestgetinv {

    public static IInventory getInventory(World par1World, int par2, int par3, int par4) {
        Object object = (TileEntityUnderworldChest) par1World.getBlockTileEntity(par2, par3, par4);

        if (object == null) {
            return null;
        }
        else if (par1World.isBlockSolidOnSide(par2, par3 + 1, par4, DOWN)) {
            return null;
        }
        else if (UnderworldChest.isOcelotBlockingChest(par1World, par2, par3, par4)) {
            return null;
        }
        else if (par1World.getBlockId(par2 - 1, par3, par4) == TileEntityHandler.underworldchest.blockID && (par1World.isBlockSolidOnSide(par2 - 1, par3 + 1, par4, DOWN) || UnderworldChest.isOcelotBlockingChest(par1World, par2 - 1, par3, par4))) {
            return null;
        }
        else if (par1World.getBlockId(par2 + 1, par3, par4) == TileEntityHandler.underworldchest.blockID && (par1World.isBlockSolidOnSide(par2 + 1, par3 + 1, par4, DOWN) || UnderworldChest.isOcelotBlockingChest(par1World, par2 + 1, par3, par4))) {
            return null;
        }
        else if (par1World.getBlockId(par2, par3, par4 - 1) == TileEntityHandler.underworldchest.blockID && (par1World.isBlockSolidOnSide(par2, par3 + 1, par4 - 1, DOWN) || UnderworldChest.isOcelotBlockingChest(par1World, par2, par3, par4 - 1))) {
            return null;
        }
        else if (par1World.getBlockId(par2, par3, par4 + 1) == TileEntityHandler.underworldchest.blockID && (par1World.isBlockSolidOnSide(par2, par3 + 1, par4 + 1, DOWN) || UnderworldChest.isOcelotBlockingChest(par1World, par2, par3, par4 + 1))) {
            return null;
        }
        else {
            if (par1World.getBlockId(par2 - 1, par3, par4) == TileEntityHandler.underworldchest.blockID) {
                object = new InventoryLargeChest("Underworld Chest", (TileEntityUnderworldChest) par1World.getBlockTileEntity(par2 - 1, par3, par4), (IInventory) object);
            }

            if (par1World.getBlockId(par2 + 1, par3, par4) == TileEntityHandler.underworldchest.blockID) {
                object = new InventoryLargeChest("Underworld Chest", (IInventory) object, (TileEntityUnderworldChest) par1World.getBlockTileEntity(par2 + 1, par3, par4));
            }

            if (par1World.getBlockId(par2, par3, par4 - 1) == TileEntityHandler.underworldchest.blockID) {
                object = new InventoryLargeChest("Underworld Chest", (TileEntityUnderworldChest) par1World.getBlockTileEntity(par2, par3, par4 - 1), (IInventory) object);
            }

            if (par1World.getBlockId(par2, par3, par4 + 1) == TileEntityHandler.underworldchest.blockID) {
                object = new InventoryLargeChest("Underworld Chest", (IInventory) object, (TileEntityUnderworldChest) par1World.getBlockTileEntity(par2, par3, par4 + 1));
            }

            return (IInventory) object;
        }
    }

}
