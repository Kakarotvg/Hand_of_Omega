package kakarotvg.omega.crops;

import kakarotvg.omega.Reference;
import kakarotvg.omega.handlers.crops.CropHandler;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLightCrop extends BlockCrops {
    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;
    
    public BlockLightCrop() {
        super();
    }
    
    @SideOnly(Side.CLIENT)
    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public IIcon getIcon(int par1, int par2) {
        if (par2 < 7) {
            if (par2 == 6) {
                par2 = 5;
            }
            
            return this.iconArray[par2 >> 1];
        }
        else {
            return this.iconArray[8];
        }
    }
    
    /**
     * Generate a seed ItemStack for this crop.
     */
    protected Item getSeedItem() {
        return CropHandler.lightseeds;
    }
    
    /**
     * Generate a crop produce ItemStack for this crop.
     */
    protected Item getCropItem() {
        return CropHandler.lightseeds;
    }
    
    /**
     * Drops the block items with a specified chance of dropping the specified
     * items
     */
    
    @SideOnly(Side.CLIENT)
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IIconRegister par1IconRegister) {
        this.iconArray = new IIcon[9];
        
        for (int i = 0; i < this.iconArray.length; ++i) {
            this.iconArray[i] = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + i);
        }
    }
}
