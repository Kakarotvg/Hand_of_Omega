package com.kakarotvg.omega.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMetaBlock extends ItemBlock {

    public ItemMetaBlock(Block par1) {
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
            case 2: {
                name = "third";
                break;
            }
            default:
                name = "broken";
        }
        return getUnlocalizedName() + "." + name;
    }

    @Override
    public int getMetadata(int par1) {
        return par1;
    }
}