package kakarotvg.omega.armor;

import kakarotvg.omega.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Vgarmor extends ItemArmor {
    String armorfile;

    public Vgarmor(int id, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String armorfile) {
        super(id, par2EnumArmorMaterial, par3, par4);

        this.armorfile = armorfile;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
        if (armorfile == null)
            return null;

        return (Reference.MOD_ID +":"+ "textures/armor/" + armorfile + ".png");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
        this.itemIcon = register.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }

}
