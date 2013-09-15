package kakarotvg.omega.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMetaBlock2 extends ItemBlock {

    public ItemMetaBlock2(int par1) {
        super(par1);
        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        String name = "";
        switch (itemstack.getItemDamage()) {
            case 0: {
                name = "first";
                break;
            }
            case 1: {
                name = "second";
                break;
            }
            default:
                name = "broken";
        }
        return getUnlocalizedName() + "." + name;
    }

    public int getMetadata(int par1) {
        return par1;
    }
}
