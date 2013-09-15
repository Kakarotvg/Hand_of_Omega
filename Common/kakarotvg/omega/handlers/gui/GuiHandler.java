package kakarotvg.omega.handlers.gui;

import kakarotvg.omega.container.ContainerComputer;
import kakarotvg.omega.container.Containerunderworldchest;
import kakarotvg.omega.entity.tileentity.TileEntityComputerEntity;
import kakarotvg.omega.gui.ComputerGui;
import kakarotvg.omega.gui.UChestGui;
import kakarotvg.omega.tileentity.TileEntityUnderworldChest;
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

        if (tileentity instanceof TileEntityUnderworldChest) {
            return new Containerunderworldchest(player.inventory, (TileEntityUnderworldChest) tileentity);
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileentity = world.getBlockTileEntity(x, y, z);

        if (tileentity instanceof TileEntityComputerEntity) {
            return new ComputerGui(player.inventory, (TileEntityComputerEntity) tileentity);
        }

        if (tileentity instanceof TileEntityUnderworldChest) {
            return new UChestGui(player.inventory, (TileEntityUnderworldChest) tileentity);
        }

        return null;
    }

}
