package kakarotvg.omega.handlers.blocks;

import kakarotvg.omega.blocks.ItemMetaBlock;
import kakarotvg.omega.blocks.ItemMetaBlock2;
import kakarotvg.omega.blocks.MetaBlock;
import kakarotvg.omega.blocks.MetaBlock2;
import kakarotvg.omega.blocks.Vgblock;
import kakarotvg.omega.handlers.creativetab.CreativetabHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
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
    
    public static void configureBlocks() {
        // BLOCKS
        // Urotark
        urotarkblock = new MetaBlock(Material.iron).setBlockName("urotarkblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
        // Muscovite
        muscoviteblock = new MetaBlock(Material.iron).setBlockName("muscoviteblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
        // Gilder
        gilderblock = new MetaBlock(Material.iron).setBlockName("gilderblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
        // Barium
        bariumblock = new MetaBlock(Material.iron).setBlockName("bariumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
        // Vanadium
        vanadiumblock = new MetaBlock2(Material.iron).setBlockName("vanadiumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
        // Bismuth
        bismuthblock = new MetaBlock2(Material.iron).setBlockName("bismuthblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
        // Platinum
        platinumblock = new Vgblock(Material.iron).setBlockName("platinumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
        // Berionvar
        berionvarblock = new MetaBlock2(Material.iron).setBlockName("berionvarblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
        // Firlvear
        firlvearblock = new MetaBlock2(Material.iron).setBlockName("firlvearblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
        // verilion
        verilionblock = new MetaBlock2(Material.iron).setBlockName("verilionblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
        // Darkness
        darknessblock = new MetaBlock2(Material.iron).setBlockName("darknessblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
        // Omega
        omegablock = new Vgblock(Material.iron).setBlockName("omegablockanimated").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
        // ???
        unknown = new Vgblock(Material.iron).setBlockName("???animated").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(8.0F);
        // ORES
        // Urotark
        urotarkore = new MetaBlock(Material.rock).setBlockName("urotarkore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
        // Muscovite
        muscoviteore = new MetaBlock(Material.rock).setBlockName("muscoviteore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
        // gilder
        gilderore = new MetaBlock(Material.rock).setBlockName("gilderore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
        // barium
        bariumore = new MetaBlock(Material.rock).setBlockName("bariumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
        // vanadium
        vanadiumore = new MetaBlock2(Material.rock).setBlockName("vanadiumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
        // bismuth
        bismuthore = new MetaBlock2(Material.rock).setBlockName("bismuthore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
        // platinum
        platinumore = new Vgblock(Material.rock).setBlockName("platinumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
        // berionvar
        berionvarore = new MetaBlock2(Material.rock).setBlockName("berionvarore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
        // firlvear
        firlvearore = new MetaBlock2(Material.rock).setBlockName("firlvearore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
        // verilion
        verilionore = new MetaBlock2(Material.rock).setBlockName("verilionore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
        // darkness
        darknessore = new MetaBlock2(Material.rock).setBlockName("darknessore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
        // omega
        omegaore = new Vgblock(Material.rock).setBlockName("omegaore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
        
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
    
    /*
     * public static void setNames(LanguageRegistry registry) {
     * 
     * for (int ix = 0; ix < 3; ix++) { // BLOCKS // meta set 1 ItemStack
     * urotarkblockStack = new ItemStack(urotarkblock, 1, ix);
     * LanguageRegistry.addName(urotarkblockStack,
     * urotarkBlockNames[urotarkblockStack.getItemDamage()]); // meta set 2
     * ItemStack muscoviteblockStack = new ItemStack(muscoviteblock, 1, ix);
     * LanguageRegistry.addName(muscoviteblockStack,
     * muscoviteBlockNames[muscoviteblockStack.getItemDamage()]); // meta set 3
     * ItemStack gilderblockStack = new ItemStack(gilderblock, 1, ix);
     * LanguageRegistry.addName(gilderblockStack,
     * gilderBlockNames[gilderblockStack.getItemDamage()]); // meta set 4
     * ItemStack bariumblockStack = new ItemStack(bariumblock, 1, ix);
     * LanguageRegistry.addName(bariumblockStack,
     * bariumBlockNames[bariumblockStack.getItemDamage()]);
     * 
     * // ORES // meta set1 ItemStack urotarkoreStack = new
     * ItemStack(urotarkore, 1, ix); LanguageRegistry.addName(urotarkoreStack,
     * urotarkoreNames[urotarkoreStack.getItemDamage()]); // meta set2 ItemStack
     * muscoviteoreStack = new ItemStack(muscoviteore, 1, ix);
     * LanguageRegistry.addName(muscoviteoreStack,
     * muscoviteoreNames[muscoviteoreStack.getItemDamage()]); // meta set3
     * ItemStack gilderoreStack = new ItemStack(gilderore, 1, ix);
     * LanguageRegistry.addName(gilderoreStack,
     * gilderoreNames[gilderoreStack.getItemDamage()]); // meta set 4 ItemStack
     * bariumoreStack = new ItemStack(bariumore, 1, ix);
     * LanguageRegistry.addName(bariumoreStack,
     * bariumoreNames[bariumoreStack.getItemDamage()]); } for (int ix = 0; ix <
     * 2; ix++) { // BLOCKS // meta set 5 ItemStack vanadiumblockStack = new
     * ItemStack(vanadiumblock, 1, ix);
     * LanguageRegistry.addName(vanadiumblockStack,
     * vanadiumBlockNames[vanadiumblockStack.getItemDamage()]); // meta set 6
     * ItemStack bismuthblockStack = new ItemStack(bismuthblock, 1, ix);
     * LanguageRegistry.addName(bismuthblockStack,
     * bismuthBlockNames[bismuthblockStack.getItemDamage()]); // meta set 7
     * ItemStack berionvarblockStack = new ItemStack(berionvarblock, 1, ix);
     * LanguageRegistry.addName(berionvarblockStack,
     * berionvarBlockNames[berionvarblockStack.getItemDamage()]); // meta set 8
     * ItemStack firlvearblockStack = new ItemStack(firlvearblock, 1, ix);
     * LanguageRegistry.addName(firlvearblockStack,
     * firlvearBlockNames[firlvearblockStack.getItemDamage()]); // meta set 9
     * ItemStack verilionblockStack = new ItemStack(verilionblock, 1, ix);
     * LanguageRegistry.addName(verilionblockStack,
     * verilionBlockNames[verilionblockStack.getItemDamage()]); // meta set 10
     * ItemStack darknessblockStack = new ItemStack(darknessblock, 1, ix);
     * LanguageRegistry.addName(darknessblockStack,
     * darknessBlockNames[darknessblockStack.getItemDamage()]); // ORES // meta
     * set 5 ItemStack vanadiumoreStack = new ItemStack(vanadiumore, 1, ix);
     * LanguageRegistry.addName(vanadiumoreStack,
     * vanadiumoreNames[vanadiumoreStack.getItemDamage()]); // meta set 6
     * ItemStack bismuthoreStack = new ItemStack(bismuthore, 1, ix);
     * LanguageRegistry.addName(bismuthoreStack,
     * bismuthoreNames[bismuthoreStack.getItemDamage()]); // meta set 7
     * ItemStack berionvaroreStack = new ItemStack(berionvarore, 1, ix);
     * LanguageRegistry.addName(berionvaroreStack,
     * berionvaroreNames[berionvaroreStack.getItemDamage()]); // meta set 8
     * ItemStack firlvearoreStack = new ItemStack(firlvearore, 1, ix);
     * LanguageRegistry.addName(firlvearoreStack,
     * firlvearoreNames[firlvearoreStack.getItemDamage()]); // meta set 9
     * ItemStack verilionoreStack = new ItemStack(verilionore, 1, ix);
     * LanguageRegistry.addName(verilionoreStack,
     * verilionoreNames[verilionoreStack.getItemDamage()]); // meta set 10
     * ItemStack darknessoreStack = new ItemStack(darknessore, 1, ix);
     * LanguageRegistry.addName(darknessoreStack,
     * darknessoreNames[darknessoreStack.getItemDamage()]);
     * 
     * } // Platinum registry.addName(platinumblock, "Platinum Block");
     * registry.addName(platinumore, "Platinum Ore"); // Omega
     * registry.addName(omegablock, "Omega Block"); registry.addName(omegaore,
     * "Omega Ore"); registry.addName(unknown, "Unknown");
     * 
     * }
     */
    
    public static void setHarvestLevel(MinecraftForge registry) {
        // urotark
        urotarkblock.setHarvestLevel("pickaxe", 4);
        urotarkore.setHarvestLevel("pickaxe", 3);
        // muscovite
        muscoviteblock.setHarvestLevel("pickaxe", 5);
        muscoviteore.setHarvestLevel("pickaxe", 4);
        // gilder
        gilderblock.setHarvestLevel("pickaxe", 6);
        gilderore.setHarvestLevel("pickaxe", 5);
        // barium
        bariumblock.setHarvestLevel("pickaxe", 7);
        bariumore.setHarvestLevel("pickaxe", 6);
        // vanadium
        vanadiumblock.setHarvestLevel("pickaxe", 8);
        vanadiumore.setHarvestLevel("pickaxe", 7);
        // bismuth
        bismuthblock.setHarvestLevel("pickaxe", 9);
        bismuthore.setHarvestLevel("pickaxe", 8);
        // platinum
        platinumblock.setHarvestLevel("pickaxe", 10);
        platinumore.setHarvestLevel("pickaxe", 9);
        // Berionvar
        berionvarblock.setHarvestLevel("pickaxe", 11);
        berionvarore.setHarvestLevel("pickaxe", 10);
        // Firlvear
        firlvearblock.setHarvestLevel("pickaxe", 12);
        firlvearore.setHarvestLevel("pickaxe", 10);
        // verilion
        verilionblock.setHarvestLevel("pickaxe", 13);
        verilionore.setHarvestLevel("pickaxe", 10);
        // darkness
        darknessblock.setHarvestLevel("pickaxe", 20);
        darknessore.setHarvestLevel("pickaxe", 10);
        // omega
        omegablock.setHarvestLevel("pickaxe", 30);
        omegaore.setHarvestLevel("pickaxe", 10);
        // ???
        unknown.setHarvestLevel("pickaxe", 10);
        
    }
    
}
