package kakarotvg.omega.computer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import kakarotvg.omega.handlers.item.ItemHandler;
import kakarotvg.omega.handlers.liquids.LiquidHandler;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;

public class ComputerRecipes {
    private static final ComputerRecipes smeltingBase = new ComputerRecipes();
    /**
     * The list of smelting results.
     */
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    private static final String __OBFID = "CL_00000085";
    
    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static ComputerRecipes smelting() {
        return smeltingBase;
    }
    
    private ComputerRecipes() {
        this.addsmelting(new ItemStack(LiquidHandler.darknessbucket, 1), new ItemStack(ItemHandler.soliddarkness), 0.5F);
    }
    
    public void addsmelting(ItemStack p_151394_1_, ItemStack p_151394_2_, float p_151394_3_) {
        this.smeltingList.put(p_151394_1_, p_151394_2_);
        this.experienceList.put(p_151394_2_, Float.valueOf(p_151394_3_));
    }
    
    /**
     * Returns the smelting result of an item.
     */
    public ItemStack getSmeltingResult(ItemStack p_151395_1_) {
        Iterator iterator = this.smeltingList.entrySet().iterator();
        Entry entry;
        
        do {
            if (!iterator.hasNext()) {
                return null;
            }
            
            entry = (Entry) iterator.next();
        }
        while (!this.func_151397_a(p_151395_1_, (ItemStack) entry.getKey()));
        
        return (ItemStack) entry.getValue();
    }
    
    private boolean func_151397_a(ItemStack p_151397_1_, ItemStack p_151397_2_) {
        return p_151397_2_.getItem() == p_151397_1_.getItem() && (p_151397_2_.getItemDamage() == 32767 || p_151397_2_.getItemDamage() == p_151397_1_.getItemDamage());
    }
    
    public Map getSmeltingList() {
        return this.smeltingList;
    }
    
    public float func_151398_b(ItemStack p_151398_1_) {
        float ret = p_151398_1_.getItem().getSmeltingExperience(p_151398_1_);
        if (ret != -1) return ret;
        
        Iterator iterator = this.experienceList.entrySet().iterator();
        Entry entry;
        
        do {
            if (!iterator.hasNext()) {
                return 0.0F;
            }
            
            entry = (Entry) iterator.next();
        }
        while (!this.func_151397_a(p_151398_1_, (ItemStack) entry.getKey()));
        
        return ((Float) entry.getValue()).floatValue();
    }
}
