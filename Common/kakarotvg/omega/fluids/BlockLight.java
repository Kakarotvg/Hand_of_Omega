package kakarotvg.omega.fluids;

import kakarotvg.omega.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLight extends BlockFluidClassic {

    public BlockLight(int id) {
        super(id, LiquidHandler.Light, Material.water);
    }

    public Icon getIcon(int side, int meta) {
        return Block.waterMoving.getIcon(side, meta);
    }

    @Override
    public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z) {
        return 0xFFC400; // HEX color code
    }

}
