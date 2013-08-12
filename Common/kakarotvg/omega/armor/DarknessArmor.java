package kakarotvg.omega.armor;

import java.util.List;

import kakarotvg.omega.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DarknessArmor extends ItemArmor {
    String armorfile;

    public DarknessArmor(int id, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String armorfile) {
        super(id, par2EnumArmorMaterial, par3, par4);

        this.armorfile = armorfile;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
        if (armorfile == null)
            return null;

        return (Reference.MOD_ID + ":" + "textures/armor/" + armorfile + ".png");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
        this.itemIcon = register.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }

    @Override
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
        ItemStack is = new ItemStack(par1, 1, 0);

        is.addEnchantment(Enchantment.blastProtection, 4);
        is.addEnchantment(Enchantment.protection, 5);
        is.addEnchantment(Enchantment.thorns, 8);
        is.addEnchantment(Enchantment.unbreaking, 3);
        is.addEnchantment(Enchantment.fortune, 9);
        is.addEnchantment(Enchantment.featherFalling, 2);
        par3List.add(is);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack) {
        return EnumRarity.epic;
    }

}
