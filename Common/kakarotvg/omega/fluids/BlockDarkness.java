package kakarotvg.omega.fluids;

import kakarotvg.omega.handlers.liquids.LiquidHandler;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

public class BlockDarkness extends BlockFluidClassic {
    
    public BlockDarkness() {
        super(LiquidHandler.Darkness, Material.water);
        
    }
    
    public IIcon getIcon(int side, int meta) {
        return Blocks.water.getIcon(side, meta);
    }
    
    @Override
    public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z) {
        return 0x000000; // HEX color code
    }
    
    public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity entity) {
        if (entity instanceof EntityPlayer) {
            ((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.blindness.getId(), 200, 10));
            ((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.weakness.getId(), 200, 10));
            ((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 200, 10));
        }
    }
    
}
