package kakarotvg.omega.tools;

import kakarotvg.omega.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Vgpickaxe extends ItemPickaxe {
    
    public Vgpickaxe(ToolMaterial toolmaterial) {
        super(toolmaterial);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister register) {
        this.itemIcon = register.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }
    
}
