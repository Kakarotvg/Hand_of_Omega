package kakarotvg.omega.fluids;

import kakarotvg.omega.Reference;
import kakarotvg.omega.handlers.liquids.LiquidHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
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

    public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity entity) {
        if (entity instanceof EntityPlayer) {
            ((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 200, 10));
            ((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 200, 10));
            ((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 200, 10));
        }
    }

}
