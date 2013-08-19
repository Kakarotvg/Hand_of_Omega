package kakarotvg.omega.fluids;

import kakarotvg.omega.Reference;
import kakarotvg.omega.handlers.LiquidHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDarkness extends BlockFluidClassic {

    public BlockDarkness(int id) {
        super(id, LiquidHandler.Darkness, Material.water);
    }

    public Icon getIcon(int side, int meta) {
        return Block.waterMoving.getIcon(side, meta);
    }

    @Override
    public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z) {
        return 0x000000; // HEX color code
    }

}
