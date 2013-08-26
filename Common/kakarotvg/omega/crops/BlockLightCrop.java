package kakarotvg.omega.crops;

import kakarotvg.omega.Reference;
import kakarotvg.omega.handlers.crops.CropHandler;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLightCrop extends BlockCrops {
    @SideOnly(Side.CLIENT)
    private Icon[] iconArray;

    public BlockLightCrop(int par1) {
        super(par1);
    }

    @SideOnly(Side.CLIENT)
    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2) {
        if (par2 < 7) {
            if (par2 == 6) {
                par2 = 5;
            }

            return this.iconArray[par2 >> 1];
        } else {
            return this.iconArray[8];
        }
    }

    /**
     * Generate a seed ItemStack for this crop.
     */
    protected int getSeedItem() {
        return CropHandler.lightseeds.itemID;
    }

    /**
     * Generate a crop produce ItemStack for this crop.
     */
    protected int getCropItem() {
        return CropHandler.lightseeds.itemID;
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
    public void registerIcons(IconRegister par1IconRegister) {
        this.iconArray = new Icon[9];

        for (int i = 0; i < this.iconArray.length; ++i) {
            this.iconArray[i] = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + i);
        }
    }
}
