package kakarotvg.omega.handlers.gui;

import kakarotvg.omega.container.ContainerComputer;
import kakarotvg.omega.entity.TileEntityComputerEntity;
import kakarotvg.omega.gui.ComputerGui;
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

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileentity = world.getBlockTileEntity(x, y, z);

        if (tileentity instanceof TileEntityComputerEntity) {
            return new ComputerGui(player.inventory, (TileEntityComputerEntity) tileentity);
        }

        return null;
    }

}
