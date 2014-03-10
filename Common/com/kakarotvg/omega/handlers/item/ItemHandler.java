package com.kakarotvg.omega.handlers.item;

import com.kakarotvg.omega.handlers.creativetab.CreativetabHandler;
import com.kakarotvg.omega.items.MetaItem;
import com.kakarotvg.omega.items.MetaItem2;
import com.kakarotvg.omega.items.MetaItem3;
import com.kakarotvg.omega.items.MetaItem4;
import com.kakarotvg.omega.items.VgItem;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemHandler {
    
    // urotark
    public static Item urotark;
    public static Item urotarkingot;
    // platinum
    public static Item platinum;
    public static Item platinumingot;
    // darkness
    public static Item darknessshard;
    // light
    public static Item lightshard;
    // omega
    public static Item omegashards;
    // new darkness
    public static Item soliddarkness;
    
    public static void configureItems() {
        
        // urotark
        urotark = new MetaItem().setUnlocalizedName("urotark").setCreativeTab(CreativetabHandler.vgtab2);
        urotarkingot = new MetaItem3().setUnlocalizedName("urotarkingot").setCreativeTab(CreativetabHandler.vgtab2);
        // platinum
        platinum = new MetaItem2().setUnlocalizedName("platinum").setCreativeTab(CreativetabHandler.vgtab2);
        platinumingot = new MetaItem4().setUnlocalizedName("platinumingot").setCreativeTab(CreativetabHandler.vgtab2);
        // darkness=
        darknessshard = new VgItem().setUnlocalizedName("darknessshard").setCreativeTab(CreativetabHandler.vgtab2);
        // light
        lightshard = new VgItem().setUnlocalizedName("lightshard").setCreativeTab(CreativetabHandler.vgtab2);
        // omega
        omegashards = new VgItem().setUnlocalizedName("omegashards").setCreativeTab(CreativetabHandler.vgtab2);
        // new darkness
        soliddarkness = new VgItem().setUnlocalizedName("soliddarkness").setCreativeTab(CreativetabHandler.vgtab2);
    }
    
    public static void registerItems(GameRegistry registry) {
        // urotark
        registry.registerItem(urotark, "urotark");
        registry.registerItem(urotarkingot, "urotarkingot");
        // platinum
        registry.registerItem(platinum, "platinum");
        registry.registerItem(platinumingot, "platinumingot");
        // darkness
        registry.registerItem(darknessshard, "darknessshard");
        // light
        registry.registerItem(lightshard, "lightshard");
        // omega
        registry.registerItem(omegashards, "omegashards");
        // new darkness
        registry.registerItem(soliddarkness, "Solid.Darkness");
    }
    
}
