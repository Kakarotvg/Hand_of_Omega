package kakarotvg.omega.items;

import java.util.List;

import kakarotvg.omega.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MetaItem3 extends Item {

    public MetaItem3(int id) {
        super(id);
        setHasSubtypes(true);
    }

    @SideOnly(Side.CLIENT)
    private Icon[] icons;

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
        icons = new Icon[16];

        for (int i = 0; i < icons.length; i++) {
            icons[i] = register.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)) + i);
        }
    }

    public static final String[] names = new String[] { "urotarkingot", "pearlingot", "sapphireingot", "muscoviteingot", "rubyingot", "uriotykeingot", "gilderingot", "selovaringot", "parfilianingot", "bariumingot", "radiumingot", "gallumingot", "vanadiumingot", "scandiumingot", "bismuthingot", "indiumingot" };

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = MathHelper.clamp_int(itemstack.getItemDamage(), 0, 15);
        return super.getUnlocalizedName() + "." + names[i];
    }

    public Icon getIconFromDamage(int par1) {
        return icons[par1];
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubItems(int par1, CreativeTabs tab, List list) {
        for (int i = 0; i < 16; i++) {
            list.add(new ItemStack(par1, 1, i));
        }
    }
}
