package kakarotvg.omega.handlers.item;

import kakarotvg.omega.handlers.IDs.ItemIDs;
import kakarotvg.omega.handlers.creativetab.CreativetabHandler;
import kakarotvg.omega.items.MetaItem;
import kakarotvg.omega.items.MetaItem2;
import kakarotvg.omega.items.MetaItem3;
import kakarotvg.omega.items.MetaItem4;
import kakarotvg.omega.items.VgItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

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

    public static void configureItems(Configuration config) {

        // urotark
        urotark = new MetaItem(ItemIDs.urotarkID).setUnlocalizedName("urotark").setCreativeTab(CreativetabHandler.vgtab2);
        urotarkingot = new MetaItem3(ItemIDs.urotarkingotID).setUnlocalizedName("urotarkingot").setCreativeTab(CreativetabHandler.vgtab2);
        // platinum
        platinum = new MetaItem2(ItemIDs.platinumID).setUnlocalizedName("platinum").setCreativeTab(CreativetabHandler.vgtab2);
        platinumingot = new MetaItem4(ItemIDs.platinumingotID).setUnlocalizedName("platinumingot").setCreativeTab(CreativetabHandler.vgtab2);
        // darkness=
        darknessshard = new VgItem(ItemIDs.darknessshardID).setUnlocalizedName("darknessshard").setCreativeTab(CreativetabHandler.vgtab2);
        // light
        lightshard = new VgItem(ItemIDs.lightshardID).setUnlocalizedName("lightshard").setCreativeTab(CreativetabHandler.vgtab2);
        // omega
        omegashards = new VgItem(ItemIDs.omegashardsID).setUnlocalizedName("omegashards").setCreativeTab(CreativetabHandler.vgtab2);
        // new darkness
        soliddarkness = new VgItem(ItemIDs.soliddarknessID).setUnlocalizedName("soliddarkness").setCreativeTab(CreativetabHandler.vgtab2);
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

    private static final String[] urotarkItemNames = { "Urotark", "Pearl", "Sapphire", "Muscovite", "Ruby", "Uriotyke", "Gilder", "Selovar", "Parfilian", "Barium", "Radium", "Gallum", "Vanadium", "Scandium", "Bismuth", "Indium" };
    private static final String[] platinumItemNames = { "Platinum", "Darkness", "Light", "Omega", "Dawn", "Bubble", "Berionvar", "Charviole", "Firlvear", "Selmenrer", "Verilion", "Vielvor" };
    private static final String[] urotarkingotItemNames = { "Urotark Ingot", "Pearl Ingot", "Sapphire Ingot", "Muscovite Ingot", "Ruby Ingot", "Uriotyke Ingot", "Gilder Ingot", "Selovar Ingot", "Parfilian Ingot", "Barium Ingot", "Radium Ingot", "Gallum Ingot", "Vanadium Ingot", "Scandium Ingot", "Bismuth Ingot", "Indium Ingot" };
    private static final String[] platinumingotItemNames = { "Platinum Ingot", "Darkness Ingot", "Light Ingot", "Omega Ingot", "Dawn Ingot", "Bubbles", "Berionvar Ingot", "Charviole Ingot", "Firlvear Ingot", "Selmenrer Ingot", "Verilion Ingot", "Vielvor Ingot" };

    public static void setNames(LanguageRegistry registry) {
        for (int ix = 0; ix < 16; ix++) {
            // meta set 1
            ItemStack urotarkitemStack = new ItemStack(urotark, 1, ix);
            LanguageRegistry.addName(urotarkitemStack, urotarkItemNames[urotarkitemStack.getItemDamage()]);
            // meta set 3
            ItemStack urotarkingotitemStack = new ItemStack(urotarkingot, 1, ix);
            LanguageRegistry.addName(urotarkingotitemStack, urotarkingotItemNames[urotarkingotitemStack.getItemDamage()]);

        }

        for (int ix = 0; ix < 12; ix++) {
            // meta set 2
            ItemStack platinumitemStack = new ItemStack(platinum, 1, ix);
            LanguageRegistry.addName(platinumitemStack, platinumItemNames[platinumitemStack.getItemDamage()]);
            // meta set 4
            ItemStack platinumingotitemStack = new ItemStack(platinumingot, 1, ix);
            LanguageRegistry.addName(platinumingotitemStack, platinumingotItemNames[platinumingotitemStack.getItemDamage()]);

        }
        // darkness
        registry.addName(darknessshard, "Darkness Shard");
        // light
        registry.addName(lightshard, "Light Shard");
        // omega
        registry.addName(omegashards, "Omega Shards");
        // New darkenss
        registry.addName(soliddarkness, "Solid Darkness");

    }
}
