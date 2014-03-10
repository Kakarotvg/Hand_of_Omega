package kakarotvg.omega.items;

import kakarotvg.omega.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemBucket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class VgBucket extends ItemBucket {
    
    private String itemName;
    private int isFull;
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister register) {
        this.itemIcon = register.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }
    
    public VgBucket(Block par1, String name) {
        super(par1);
        this.itemName = name;
        this.setUnlocalizedName(name);
        
    }
    
}
