package com.kakarotvg.omega.handlers.creativetab;

import com.kakarotvg.omega.handlers.armor.ArmorHandler;
import com.kakarotvg.omega.handlers.blocks.BlockHandler;
import com.kakarotvg.omega.handlers.item.ItemHandler;
import com.kakarotvg.omega.handlers.tools.ToolHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CreativetabHandler {
    
    public static CreativeTabs vgtab = new CreativeTabs("vgtab") {
        public Item getTabIconItem() {
            // TODO Auto-generated method stub
            return Item.getItemFromBlock(BlockHandler.urotarkblock);
        }
        
    };
    
    public static CreativeTabs vgtab2 = new CreativeTabs("vgtab2") {
        public ItemStack getIconItemStack() {
            return new ItemStack(ItemHandler.urotark, 1, 7);
        }
        
        @Override
        public Item getTabIconItem() {
            return null;
        }
    };
    
    public static CreativeTabs vgtab3 = new CreativeTabs("vgtab3") {
        public ItemStack getIconItemStack() {
            return new ItemStack(ToolHandler.muscovitepickaxe, 1, 0);
        }
        
        @Override
        public Item getTabIconItem() {
            return null;
        }
    };
    
    public static CreativeTabs vgtab4 = new CreativeTabs("vgtab4") {
        
        public ItemStack getIconItemStack() {
            return new ItemStack(ArmorHandler.gallumplate, 1, 0);
        }
        
        @Override
        public Item getTabIconItem() {
            return null;
        }
        
    };
    
    /*
     * public static void setNames(LanguageRegistry registry) {
     * registry.instance().addStringLocalization("itemGroup.vgtab", "en_US",
     * "Omega Blocks");
     * registry.instance().addStringLocalization("itemGroup.vgtab2", "en_US",
     * "Omega Items");
     * registry.instance().addStringLocalization("itemGroup.vgtab3", "en_US",
     * "Omega Tools");
     * registry.instance().addStringLocalization("itemGroup.vgtab4", "en_US",
     * "Omega Combat");
     * 
     * }
     */
    
}
