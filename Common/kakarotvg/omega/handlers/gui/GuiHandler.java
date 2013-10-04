package kakarotvg.omega.handlers.gui;

import kakarotvg.omega.container.ContainerComputer;
import kakarotvg.omega.container.ContainerTealworkbench;
import kakarotvg.omega.container.Containerunderworldchest;
import kakarotvg.omega.entity.tileentity.TileEntityComputerEntity;
import kakarotvg.omega.getinv.UnderworldChestgetinv;
import kakarotvg.omega.gui.ComputerGui;
import kakarotvg.omega.gui.Guitealworkbench;
import kakarotvg.omega.gui.UChestGui;
import kakarotvg.omega.handlers.tileentity.TileEntityHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileentity = world.getBlockTileEntity(x, y, z);

        if (tileentity instanceof TileEntityComputerEntity) {
            return new ContainerComputer(player.inventory, (TileEntityComputerEntity) tileentity);
        }

        if (UnderworldChestgetinv.getInventory(world, x, y, z) != null) {
            return new Containerunderworldchest(player.inventory, UnderworldChestgetinv.getInventory(world, x, y, z));
        }

        switch (ID) {
            case 0:
                return ID == 0 && world.getBlockId(x, y, z) == TileEntityHandler.tealworkbench.blockID ? new ContainerTealworkbench(player.inventory, world, x, y, z) : null;
        }

        return true;

    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileentity = world.getBlockTileEntity(x, y, z);

        if (tileentity instanceof TileEntityComputerEntity) {
            return new ComputerGui(player.inventory, (TileEntityComputerEntity) tileentity);
        }

        if (UnderworldChestgetinv.getInventory(world, x, y, z) != null) {
            return new UChestGui(player.inventory, UnderworldChestgetinv.getInventory(world, x, y, z));
        }

        switch (ID) {
            case 0:
                return ID == 0 && world.getBlockId(x, y, z) == TileEntityHandler.tealworkbench.blockID ? new Guitealworkbench(player.inventory, world, x, y, z) : null;
        }

        return true;

    }

}
