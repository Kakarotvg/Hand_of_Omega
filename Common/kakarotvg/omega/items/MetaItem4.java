package kakarotvg.omega.items;

import java.util.List;

import javax.swing.Icon;

import kakarotvg.omega.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MetaItem4 extends Item {
    
    public MetaItem4() {
        super();
        setHasSubtypes(true);
    }
    
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister register) {
        icons = new IIcon[12];
        
        for (int i = 0; i < icons.length; i++) {
            icons[i] = register.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)) + i);
        }
    }
    
    public static final String[] names = new String[] { "platinumingot", "darknessingot", "lightingot", "omegaingot", "dawningot", "bubbles", "berionvaringot", "charvioleingot", "firlvearingot", "selmenreringot", "verilioningot", "vielvoringot" };
    
    public String getUnlocalizedName(ItemStack itemstack) {
        int i = MathHelper.clamp_int(itemstack.getItemDamage(), 0, 15);
        return super.getUnlocalizedName() + "." + names[i];
    }
    
    public IIcon getIconFromDamage(int par1) {
        return icons[par1];
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void getSubItems(Item par1, CreativeTabs tab, List list) {
        for (int i = 0; i < 12; i++) {
            list.add(new ItemStack(this, 1, i));
        }
    }
}
