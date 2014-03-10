package com.kakarotvg.omega.handlers.blocks;

import com.kakarotvg.omega.blocks.ItemMetaBlock;
import com.kakarotvg.omega.blocks.ItemMetaBlock2;
import com.kakarotvg.omega.blocks.MetaBlock;
import com.kakarotvg.omega.blocks.MetaBlock2;
import com.kakarotvg.omega.blocks.Vgblock;
import com.kakarotvg.omega.handlers.creativetab.CreativetabHandler;

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
