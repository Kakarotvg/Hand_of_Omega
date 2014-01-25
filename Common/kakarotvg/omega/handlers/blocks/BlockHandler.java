package kakarotvg.omega.handlers.blocks;

import kakarotvg.omega.blocks.ItemMetaBlock;
import kakarotvg.omega.blocks.ItemMetaBlock2;
import kakarotvg.omega.blocks.MetaBlock;
import kakarotvg.omega.blocks.MetaBlock2;
import kakarotvg.omega.blocks.Vgblock;
import kakarotvg.omega.handlers.IDs.BlockIDs;
import kakarotvg.omega.handlers.creativetab.CreativetabHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHandler {

    // Urotark
    public static Block urotarkblock;
    public static Block urotarkore;
    // Pearl
    public static Block pearlblock;
    public static Block pearlore;
    // Sapphire
    public static Block sapphireblock;
    public static Block sapphireore;
    // Muscovite
    public static Block muscoviteblock;
    public static Block muscoviteore;
    // Ruby
    public static Block rubyblock;
    public static Block rubyore;
    // Uriotyke
    public static Block uriotykeblock;
    public static Block uriotykeore;
    // Gilder
    public static Block gilderblock;
    public static Block gilderore;
    // Selovar
    public static Block selovarblock;
    public static Block selovarore;
    // Parfilian
    public static Block parfilianblock;
    public static Block parfilianore;
    // Barium
    public static Block bariumblock;
    public static Block bariumore;
    // Radium
    public static Block radiumblock;
    public static Block radiumore;
    // Gallum
    public static Block gallumblock;
    public static Block gallumore;
    // Vanadium
    public static Block vanadiumblock;
    public static Block vanadiumore;
    // Scandium
    public static Block scandiumblock;
    public static Block scandiumore;
    // Bismuth
    public static Block bismuthblock;
    public static Block bismuthore;
    // Indium
    public static Block indiumblock;
    public static Block indiumore;
    // Platinum
    public static Block platinumblock;
    public static Block platinumore;
    // Darkness
    public static Block darknessblock;
    public static Block darknessore;
    // Light
    public static Block lightblock;
    public static Block lightore;
    // Omega
    public static Block omegablock;
    public static Block omegaore;
    // Bubble
    public static Block bubbleblock;
    // Berionvar
    public static Block berionvarblock;
    public static Block berionvarore;
    // charviole
    public static Block charvioleblock;
    public static Block charvioleore;
    // firlvear
    public static Block firlvearblock;
    public static Block firlvearore;
    // selmenrer
    public static Block selmenrerblock;
    public static Block selmenrerore;
    // verilion
    public static Block verilionblock;
    public static Block verilionore;
    // vielvor
    public static Block vielvorblock;
    public static Block vielvorore;
    // ???
    public static Block unknown;
    // tree stuff
    public static Block teallog;
    public static Block tealleaf;
    public static Block tealsapling;
    public static Block tealplank;

    public static void configureBlocks(Configuration config) {
        // BLOCKS
        // Urotark
        urotarkblock = new MetaBlock(BlockIDs.urotarkblockID, Material.iron).setUnlocalizedName("urotarkblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        // Muscovite
        muscoviteblock = new MetaBlock(BlockIDs.muscoviteblockID, Material.iron).setUnlocalizedName("muscoviteblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        // Gilder
        gilderblock = new MetaBlock(BlockIDs.gilderblockID, Material.iron).setUnlocalizedName("gilderblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        // Barium
        bariumblock = new MetaBlock(BlockIDs.bariumblockID, Material.iron).setUnlocalizedName("bariumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F).setHardness(50.0F).setResistance(2000.0F);
        // Vanadium
        vanadiumblock = new MetaBlock2(BlockIDs.vanadiumblockID, Material.iron).setUnlocalizedName("vanadiumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        // Bismuth
        bismuthblock = new MetaBlock2(BlockIDs.bismuthblockID, Material.iron).setUnlocalizedName("bismuthblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        // Platinum
        platinumblock = new Vgblock(BlockIDs.platinumblockID, Material.iron).setUnlocalizedName("platinumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        // Bubble
        bubbleblock = new Vgblock(BlockIDs.bubbleblockID, Material.iron).setUnlocalizedName("bubbleblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        // Berionvar
        berionvarblock = new MetaBlock2(BlockIDs.berionvarblockID, Material.iron).setUnlocalizedName("berionvarblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        // Firlvear
        firlvearblock = new MetaBlock2(BlockIDs.firlvearblockID, Material.iron).setUnlocalizedName("firlvearblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        // verilion
        verilionblock = new MetaBlock2(BlockIDs.verilionblockID, Material.iron).setUnlocalizedName("verilionblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        // Darkness
        darknessblock = new MetaBlock2(BlockIDs.darknessblockID, Material.iron).setUnlocalizedName("darknessblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        // Omega
        omegablock = new Vgblock(BlockIDs.omegablockID, Material.iron).setUnlocalizedName("omegablockanimated").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        // ???
        unknown = new Vgblock(BlockIDs.unknownID, Material.iron).setUnlocalizedName("???animated").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(5.0F).setResistance(8.0F);
        // ORES
        // Urotark
        urotarkore = new MetaBlock(BlockIDs.urotarkoreID, Material.rock).setUnlocalizedName("urotarkore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Muscovite
        muscoviteore = new MetaBlock(BlockIDs.muscoviteoreID, Material.rock).setUnlocalizedName("muscoviteore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // gilder
        gilderore = new MetaBlock(BlockIDs.gilderoreID, Material.rock).setUnlocalizedName("gilderore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // barium
        bariumore = new MetaBlock(BlockIDs.bariumoreID, Material.rock).setUnlocalizedName("bariumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // vanadium
        vanadiumore = new MetaBlock2(BlockIDs.vanadiumoreID, Material.rock).setUnlocalizedName("vanadiumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // bismuth
        bismuthore = new MetaBlock2(BlockIDs.bismuthoreID, Material.rock).setUnlocalizedName("bismuthore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // platinum
        platinumore = new Vgblock(BlockIDs.platinumoreID, Material.rock).setUnlocalizedName("platinumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // berionvar
        berionvarore = new MetaBlock2(BlockIDs.berionvaroreID, Material.rock).setUnlocalizedName("berionvarore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // firlvear
        firlvearore = new MetaBlock2(BlockIDs.firlvearoreID, Material.rock).setUnlocalizedName("firlvearore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // verilion
        verilionore = new MetaBlock2(BlockIDs.verilionoreID, Material.rock).setUnlocalizedName("verilionore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // darkness
        darknessore = new MetaBlock2(BlockIDs.darknessoreID, Material.rock).setUnlocalizedName("darknessore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // omega
        omegaore = new Vgblock(BlockIDs.omegaoreID, Material.rock).setUnlocalizedName("omegaore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);

    }

    public static void registerBlocks(GameRegistry registry) {
        // BLOCKS
        // Urotark
        registry.registerBlock(urotarkblock, ItemMetaBlock.class, "urotarkblock");
        // Muscovite
        registry.registerBlock(muscoviteblock, ItemMetaBlock.class, "muscoviteblock");
        // Gilder
        registry.registerBlock(gilderblock, ItemMetaBlock.class, "gilderblock");
        // Barium
        registry.registerBlock(bariumblock, ItemMetaBlock.class, "bariumblock");
        // Vanadium
        registry.registerBlock(vanadiumblock, ItemMetaBlock2.class, "vanadiumblock");
        // Bismuth
        registry.registerBlock(bismuthblock, ItemMetaBlock2.class, "bismuthblock");
        // Platinum
        registry.registerBlock(platinumblock, "platinumblock");
        // Bubble
        registry.registerBlock(bubbleblock, "bubbleblock");
        // Berionvar
        registry.registerBlock(berionvarblock, ItemMetaBlock2.class, "berionvarblock");
        // Firlvear
        registry.registerBlock(firlvearblock, ItemMetaBlock2.class, "firlvearblock");
        // verilion
        registry.registerBlock(verilionblock, ItemMetaBlock2.class, "verilionblock");
        // Darkness
        registry.registerBlock(darknessblock, ItemMetaBlock2.class, "darknessblock");
        // Omega
        registry.registerBlock(omegablock, "omegablock");
        // ???
        registry.registerBlock(unknown, "unknown");
        // ORES
        registry.registerBlock(urotarkore, ItemMetaBlock.class, "urotarkore");
        // Muscovite
        registry.registerBlock(muscoviteore, ItemMetaBlock.class, "muscoviteore");
        // Gilder
        registry.registerBlock(gilderore, ItemMetaBlock.class, "gilderore");
        // Barium
        registry.registerBlock(bariumore, ItemMetaBlock.class, "bariumore");
        // Vanadium
        registry.registerBlock(vanadiumore, ItemMetaBlock2.class, "vanadiumore");
        // Bismuth
        registry.registerBlock(bismuthore, ItemMetaBlock2.class, "bismuthore");
        // Platinum
        registry.registerBlock(platinumore, "platinumore");
        // Berionvar
        registry.registerBlock(berionvarore, ItemMetaBlock2.class, "berionvarore");
        // Firlvear
        registry.registerBlock(firlvearore, ItemMetaBlock2.class, "firlvearore");
        // verilion
        registry.registerBlock(verilionore, ItemMetaBlock2.class, "verilionore");
        // Darkness
        registry.registerBlock(darknessore, ItemMetaBlock2.class, "darknessore");
        // Omega
        registry.registerBlock(omegaore, "omegaore");

    }

    // meta set 1
    private static final String[] urotarkBlockNames = { "Urotark Block", "Pearl Block", "Sapphire Block" };
    private static final String[] urotarkoreNames = { "Urotark Ore", "Pearl Ore", "Sapphire Ore" };
    // meta set 2
    private static final String[] muscoviteBlockNames = { "Muscovite Block", "Ruby Block", "Uriotyke Block" };
    private static final String[] muscoviteoreNames = { "Muscovite Ore", "Ruby Ore", "Uriotyke Ore" };
    // meta set 3
    private static final String[] gilderBlockNames = { "Gilder Block", "Selovar Block", "Parfilian Block" };
    private static final String[] gilderoreNames = { "Gilder Ore", "Selovar Ore", "Parfilian Ore" };
    // meta set 4
    private static final String[] bariumBlockNames = { "Barium Block", "Radium Block", "Gallum Block" };
    private static final String[] bariumoreNames = { "Barium Ore", "Radium Ore", "Gallum Ore" };
    // meta set 5
    private static final String[] vanadiumBlockNames = { "Vanadium Block", "Scandium Block" };
    private static final String[] vanadiumoreNames = { "Vanadium Ore", "Scandium Ore" };
    // meta set 6
    private static final String[] bismuthBlockNames = { "Bismuth Block", "Indium Block" };
    private static final String[] bismuthoreNames = { "Bismuth Ore", "Indium Ore" };
    // meta set 7
    private static final String[] berionvarBlockNames = { "Berionvar Block", "Charviole Block" };
    private static final String[] berionvaroreNames = { "Berionvar Ore", "Charviole Ore" };
    // meta set 8
    private static final String[] firlvearBlockNames = { "Firlvear Block", "Selmenrer Block" };
    private static final String[] firlvearoreNames = { "Firlvear Ore", "Selmenrer Ore" };
    // meta set 9
    private static final String[] verilionBlockNames = { "Verilion Block", "Vielvor Block" };
    private static final String[] verilionoreNames = { "Verilion Ore", "Vielvor Ore" };
    // meta set 10
    private static final String[] darknessBlockNames = { "Darkness Block", "Light Block" };
    private static final String[] darknessoreNames = { "Darkness Ore", "Light Ore" };

    public static void setNames(LanguageRegistry registry) {

        for (int ix = 0; ix < 3; ix++) {
            // BLOCKS
            // meta set 1
            ItemStack urotarkblockStack = new ItemStack(urotarkblock, 1, ix);
            LanguageRegistry.addName(urotarkblockStack, urotarkBlockNames[urotarkblockStack.getItemDamage()]);
            // meta set 2
            ItemStack muscoviteblockStack = new ItemStack(muscoviteblock, 1, ix);
            LanguageRegistry.addName(muscoviteblockStack, muscoviteBlockNames[muscoviteblockStack.getItemDamage()]);
            // meta set 3
            ItemStack gilderblockStack = new ItemStack(gilderblock, 1, ix);
            LanguageRegistry.addName(gilderblockStack, gilderBlockNames[gilderblockStack.getItemDamage()]);
            // meta set 4
            ItemStack bariumblockStack = new ItemStack(bariumblock, 1, ix);
            LanguageRegistry.addName(bariumblockStack, bariumBlockNames[bariumblockStack.getItemDamage()]);

            // ORES
            // meta set1
            ItemStack urotarkoreStack = new ItemStack(urotarkore, 1, ix);
            LanguageRegistry.addName(urotarkoreStack, urotarkoreNames[urotarkoreStack.getItemDamage()]);
            // meta set2
            ItemStack muscoviteoreStack = new ItemStack(muscoviteore, 1, ix);
            LanguageRegistry.addName(muscoviteoreStack, muscoviteoreNames[muscoviteoreStack.getItemDamage()]);
            // meta set3
            ItemStack gilderoreStack = new ItemStack(gilderore, 1, ix);
            LanguageRegistry.addName(gilderoreStack, gilderoreNames[gilderoreStack.getItemDamage()]);
            // meta set 4
            ItemStack bariumoreStack = new ItemStack(bariumore, 1, ix);
            LanguageRegistry.addName(bariumoreStack, bariumoreNames[bariumoreStack.getItemDamage()]);
        }
        for (int ix = 0; ix < 2; ix++) {
            // BLOCKS
            // meta set 5
            ItemStack vanadiumblockStack = new ItemStack(vanadiumblock, 1, ix);
            LanguageRegistry.addName(vanadiumblockStack, vanadiumBlockNames[vanadiumblockStack.getItemDamage()]);
            // meta set 6
            ItemStack bismuthblockStack = new ItemStack(bismuthblock, 1, ix);
            LanguageRegistry.addName(bismuthblockStack, bismuthBlockNames[bismuthblockStack.getItemDamage()]);
            // meta set 7
            ItemStack berionvarblockStack = new ItemStack(berionvarblock, 1, ix);
            LanguageRegistry.addName(berionvarblockStack, berionvarBlockNames[berionvarblockStack.getItemDamage()]);
            // meta set 8
            ItemStack firlvearblockStack = new ItemStack(firlvearblock, 1, ix);
            LanguageRegistry.addName(firlvearblockStack, firlvearBlockNames[firlvearblockStack.getItemDamage()]);
            // meta set 9
            ItemStack verilionblockStack = new ItemStack(verilionblock, 1, ix);
            LanguageRegistry.addName(verilionblockStack, verilionBlockNames[verilionblockStack.getItemDamage()]);
            // meta set 10
            ItemStack darknessblockStack = new ItemStack(darknessblock, 1, ix);
            LanguageRegistry.addName(darknessblockStack, darknessBlockNames[darknessblockStack.getItemDamage()]);
            // ORES
            // meta set 5
            ItemStack vanadiumoreStack = new ItemStack(vanadiumore, 1, ix);
            LanguageRegistry.addName(vanadiumoreStack, vanadiumoreNames[vanadiumoreStack.getItemDamage()]);
            // meta set 6
            ItemStack bismuthoreStack = new ItemStack(bismuthore, 1, ix);
            LanguageRegistry.addName(bismuthoreStack, bismuthoreNames[bismuthoreStack.getItemDamage()]);
            // meta set 7
            ItemStack berionvaroreStack = new ItemStack(berionvarore, 1, ix);
            LanguageRegistry.addName(berionvaroreStack, berionvaroreNames[berionvaroreStack.getItemDamage()]);
            // meta set 8
            ItemStack firlvearoreStack = new ItemStack(firlvearore, 1, ix);
            LanguageRegistry.addName(firlvearoreStack, firlvearoreNames[firlvearoreStack.getItemDamage()]);
            // meta set 9
            ItemStack verilionoreStack = new ItemStack(verilionore, 1, ix);
            LanguageRegistry.addName(verilionoreStack, verilionoreNames[verilionoreStack.getItemDamage()]);
            // meta set 10
            ItemStack darknessoreStack = new ItemStack(darknessore, 1, ix);
            LanguageRegistry.addName(darknessoreStack, darknessoreNames[darknessoreStack.getItemDamage()]);

        }
        // Platinum
        registry.addName(platinumblock, "Platinum Block");
        registry.addName(platinumore, "Platinum Ore");
        // Bubble
        registry.addName(bubbleblock, "Bubble Block");
        // Omega
        registry.addName(omegablock, "Omega Block");
        registry.addName(omegaore, "Omega Ore");
        registry.addName(unknown, "Unknown");

    }

    public static void setHarvestlevel(MinecraftForge registry) {
        // urotark
        registry.setBlockHarvestLevel(urotarkblock, "pickaxe", 4);
        registry.setBlockHarvestLevel(urotarkore, "pickaxe", 3);
        // muscovite
        registry.setBlockHarvestLevel(muscoviteblock, "pickaxe", 5);
        registry.setBlockHarvestLevel(muscoviteore, "pickaxe", 4);
        // gilder
        registry.setBlockHarvestLevel(gilderblock, "pickaxe", 6);
        registry.setBlockHarvestLevel(gilderore, "pickaxe", 5);
        // barium
        registry.setBlockHarvestLevel(bariumblock, "pickaxe", 7);
        registry.setBlockHarvestLevel(bariumore, "pickaxe", 6);
        // vanadium
        registry.setBlockHarvestLevel(vanadiumblock, "pickaxe", 8);
        registry.setBlockHarvestLevel(vanadiumore, "pickaxe", 7);
        // bismuth
        registry.setBlockHarvestLevel(bismuthblock, "pickaxe", 9);
        registry.setBlockHarvestLevel(bismuthore, "pickaxe", 8);
        // platinum
        registry.setBlockHarvestLevel(platinumblock, "pickaxe", 10);
        registry.setBlockHarvestLevel(platinumore, "pickaxe", 9);
        // bubble
        registry.setBlockHarvestLevel(bubbleblock, "pickaxe", 2);
        // Berionvar
        registry.setBlockHarvestLevel(berionvarblock, "pickaxe", 11);
        registry.setBlockHarvestLevel(berionvarore, "pickaxe", 10);
        // Firlvear
        registry.setBlockHarvestLevel(firlvearblock, "pickaxe", 12);
        registry.setBlockHarvestLevel(firlvearore, "pickaxe", 10);
        // verilion
        registry.setBlockHarvestLevel(verilionblock, "pickaxe", 13);
        registry.setBlockHarvestLevel(verilionore, "pickaxe", 10);
        // darkness
        registry.setBlockHarvestLevel(darknessblock, "pickaxe", 20);
        registry.setBlockHarvestLevel(darknessore, "pickaxe", 10);
        // omega
        registry.setBlockHarvestLevel(omegablock, "pickaxe", 30);
        registry.setBlockHarvestLevel(omegaore, "pickaxe", 10);
        // ???
        registry.setBlockHarvestLevel(unknown, "pickaxe", 10);

    }

}
