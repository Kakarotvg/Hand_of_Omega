package com.kakarotvg.omega.handlers.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;

import com.kakarotvg.omega.blocks.Vgblock;
import com.kakarotvg.omega.handlers.creativetab.CreativetabHandler;

import cpw.mods.fml.common.registry.GameRegistry;

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
		urotarkblock = new Vgblock(Material.iron).setBlockName("vgurotarkblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Pearl
		pearlblock = new Vgblock(Material.iron).setBlockName("vgpearlblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Sapphire
		sapphireblock = new Vgblock(Material.iron).setBlockName("vgsapphireblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Muscovite
		muscoviteblock = new Vgblock(Material.iron).setBlockName("vgmuscoviteblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Ruby
		rubyblock = new Vgblock(Material.iron).setBlockName("vgrubyblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Uriotyke
		uriotykeblock = new Vgblock(Material.iron).setBlockName("vguriotykeblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Gilder
		gilderblock = new Vgblock(Material.iron).setBlockName("vggilderblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Selovar
		selovarblock = new Vgblock(Material.iron).setBlockName("vgselovarblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Parfilian
		parfilianblock = new Vgblock(Material.iron).setBlockName("vgparfilianblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Barium
		bariumblock = new Vgblock(Material.iron).setBlockName("vgbariumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Radium
		radiumblock = new Vgblock(Material.iron).setBlockName("vgradiumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Gallum
		gallumblock = new Vgblock(Material.iron).setBlockName("vggallumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Vanadium
		vanadiumblock = new Vgblock(Material.iron).setBlockName("vgvanadiumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Scandium
		scandiumblock = new Vgblock(Material.iron).setBlockName("vgscandiumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Bismuth
		bismuthblock = new Vgblock(Material.iron).setBlockName("vgbismuthblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Indium
		indiumblock = new Vgblock(Material.iron).setBlockName("vgindiumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Platinum
		platinumblock = new Vgblock(Material.iron).setBlockName("vgplatinumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Berionvar
		berionvarblock = new Vgblock(Material.iron).setBlockName("vgberionvarblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Charviole
		charvioleblock = new Vgblock(Material.iron).setBlockName("vgcharvioleblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Firlvear
		firlvearblock = new Vgblock(Material.iron).setBlockName("vgfirlvearblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Selmenrer
		selmenrerblock = new Vgblock(Material.iron).setBlockName("vgselmenrerblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// verilion
		verilionblock = new Vgblock(Material.iron).setBlockName("vgverilionblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Vielvor
		vielvorblock = new Vgblock(Material.iron).setBlockName("vgvielvorblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Darkness
		darknessblock = new Vgblock(Material.iron).setBlockName("vgdarknessblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Light
		lightblock = new Vgblock(Material.iron).setBlockName("vglightblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// Omega
		omegablock = new Vgblock(Material.iron).setBlockName("vgomegablockanimated").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(50.0F).setResistance(2000.0F);
		// ???
		unknown = new Vgblock(Material.iron).setBlockName("???animated").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeMetal).setHardness(5.0F).setResistance(8.0F);

		// ORES
		// Urotark
		urotarkore = new Vgblock(Material.rock).setBlockName("vgurotarkore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Pearl
		pearlore = new Vgblock(Material.rock).setBlockName("vgpearlore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Sapphire
		sapphireore = new Vgblock(Material.rock).setBlockName("vgsapphireore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Muscovite
		muscoviteore = new Vgblock(Material.rock).setBlockName("vgmuscoviteore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Ruby
		rubyore = new Vgblock(Material.rock).setBlockName("vgrubyore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Uriotyke
		uriotykeore = new Vgblock(Material.rock).setBlockName("vguriotykeore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Gilder
		gilderore = new Vgblock(Material.rock).setBlockName("vggilderore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Selovar
		selovarore = new Vgblock(Material.rock).setBlockName("vgselovarore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Parfilian
		parfilianore = new Vgblock(Material.rock).setBlockName("vgparfilianore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Barium
		bariumore = new Vgblock(Material.rock).setBlockName("vgbariumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Radium
		radiumore = new Vgblock(Material.rock).setBlockName("vgradiumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Gallum
		gallumore = new Vgblock(Material.rock).setBlockName("vggallumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Vanadium
		vanadiumore = new Vgblock(Material.rock).setBlockName("vgvanadiumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Scandium
		scandiumore = new Vgblock(Material.rock).setBlockName("vgscandiumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Bismuth
		bismuthore = new Vgblock(Material.rock).setBlockName("vgbismuthore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Indium
		indiumore = new Vgblock(Material.rock).setBlockName("vgindiumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Platinum
		platinumore = new Vgblock(Material.rock).setBlockName("vgplatinumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Berionvar
		berionvarore = new Vgblock(Material.rock).setBlockName("vgberionvarore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Charviole
		charvioleore = new Vgblock(Material.rock).setBlockName("vgcharvioleore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Firlvear
		firlvearore = new Vgblock(Material.rock).setBlockName("vgfirlvearore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Selmenrer
		selmenrerore = new Vgblock(Material.rock).setBlockName("vgselmenrerore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Verilion
		verilionore = new Vgblock(Material.rock).setBlockName("vgverilionore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Vielvor
		vielvorore = new Vgblock(Material.rock).setBlockName("vgvielvorore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Darkness
		darknessore = new Vgblock(Material.rock).setBlockName("vgdarknessore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Light
		lightore = new Vgblock(Material.rock).setBlockName("vglightore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);
		// Omega
		omegaore = new Vgblock(Material.rock).setBlockName("vgomegaore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundTypeStone).setHardness(3.0F).setResistance(5.0F);

	}

	public static void registerBlocks(GameRegistry registry) {
		// BLOCKS
		// Urotark
		registry.registerBlock(urotarkblock, "vgurotarkblock");
		// Pearl
		registry.registerBlock(pearlblock, "vgpearlblock");
		// Sapphire
		registry.registerBlock(sapphireblock, "vgsapphireblock");
		// Muscovite
		registry.registerBlock(muscoviteblock, "muscoviteblock");
		// Ruby
		registry.registerBlock(rubyblock, "vgrubyblock");
		// Uriotyke
		registry.registerBlock(uriotykeblock, "vguriotykeblock");
		// Gilder
		registry.registerBlock(gilderblock, "gilderblock");
		// Selovar
		registry.registerBlock(selovarblock, "vgselovarblock");
		// Parfilian
		registry.registerBlock(parfilianblock, "vgparfilianblock");
		// Barium
		registry.registerBlock(bariumblock, "vgbariumblock");
		// Radium
		registry.registerBlock(radiumblock, "vgradiumblock");
		// Gallum
		registry.registerBlock(gallumblock, "vggallumblock");
		// Vanadium
		registry.registerBlock(vanadiumblock, "vgvanadiumblock");
		// Scandium
		registry.registerBlock(scandiumblock, "vgscandiumblock");
		// Bismuth
		registry.registerBlock(bismuthblock, "bismuthblock");
		// Indium
		registry.registerBlock(indiumblock, "vgindiumblock");
		// Platinum
		registry.registerBlock(platinumblock, "vgplatinumblock");
		// Berionvar
		registry.registerBlock(berionvarblock, "vgberionvarblock");
		// Charviole
		registry.registerBlock(charvioleblock, "vgcharvioleblock");
		// Firlvear
		registry.registerBlock(firlvearblock, "vgfirlvearblock");
		// Selmenrer
		registry.registerBlock(selmenrerblock, "vgselmenrerblock");
		// Verilion
		registry.registerBlock(verilionblock, "vgverilionblock");
		// Vielvor
		registry.registerBlock(vielvorblock, "vgvielvorblock");
		// Darkness
		registry.registerBlock(darknessblock, "vgdarknessblock");
		// Light
		registry.registerBlock(lightblock, "vglightblock");
		// Omega
		registry.registerBlock(omegablock, "vgomegablock");
		// ???
		registry.registerBlock(unknown, "unknown");
		// ORES
		// Urotark
		registry.registerBlock(urotarkore, "vgurotarkore");
		// Pearl
		registry.registerBlock(pearlore, "vgpearlore");
		// Sapphire
		registry.registerBlock(sapphireore, "vgsapphireore");
		// Muscovite
		registry.registerBlock(muscoviteore, "vgmuscoviteore");
		// Ruby
		registry.registerBlock(rubyore, "vgrubyore");
		// Uriotyke
		registry.registerBlock(uriotykeore, "vguriotykeore");
		// Gilder
		registry.registerBlock(gilderore, "vggilderore");
		// Selovar
		registry.registerBlock(selovarore, "vgselovarore");
		// Parfilian
		registry.registerBlock(parfilianore, "vgparfilianore");
		// Barium
		registry.registerBlock(bariumore, "vgbariumore");
		// Radium
		registry.registerBlock(radiumore, "vgradiumore");
		// Gallum
		registry.registerBlock(gallumore, "vggallumore");
		// Vanadium
		registry.registerBlock(vanadiumore, "vgvanadiumore");
		// Scandium
		registry.registerBlock(scandiumore, "vgscandiumore");
		// Bismuth
		registry.registerBlock(bismuthore, "vgbismuthore");
		// Indium
		registry.registerBlock(indiumore, "vgindiumore");
		// Platinum
		registry.registerBlock(platinumore, "vgplatinumore");
		// Berionvar
		registry.registerBlock(berionvarore, "vgberionvarore");
		// Charviole
		registry.registerBlock(charvioleore, "vgcharvioleore");
		// Firlvear
		registry.registerBlock(firlvearore, "vgfirlvearore");
		// Selmenrer
		registry.registerBlock(selmenrerore, "vgselmenrerore");
		// Verilion
		registry.registerBlock(verilionore, "vgverilionore");
		// Vielvor
		registry.registerBlock(vielvorore, "vgvielvorore");
		// Darkness
		registry.registerBlock(darknessore, "vgdarknessore");
		// Light
		registry.registerBlock(lightore, "vglightore");
		// Omega
		registry.registerBlock(omegaore, "vgomegaore");

	}

	public static void setHarvestLevel(MinecraftForge registry) {
		// Urotark
		urotarkblock.setHarvestLevel("pickaxe", 4);
		urotarkore.setHarvestLevel("pickaxe", 3);
		// Pearl
		pearlblock.setHarvestLevel("pickaxe", 4);
		pearlore.setHarvestLevel("pickaxe", 3);
		// Sapphire
		sapphireblock.setHarvestLevel("pickaxe", 4);
		sapphireore.setHarvestLevel("pickaxe", 3);
		// Muscovite
		muscoviteblock.setHarvestLevel("pickaxe", 5);
		muscoviteore.setHarvestLevel("pickaxe", 4);
		// Ruby
		rubyblock.setHarvestLevel("pickaxe", 5);
		rubyore.setHarvestLevel("pickaxe", 4);
		// Uriotyke
		uriotykeblock.setHarvestLevel("pickaxe", 5);
		uriotykeore.setHarvestLevel("pickaxe", 4);
		// Gilder
		gilderblock.setHarvestLevel("pickaxe", 6);
		gilderore.setHarvestLevel("pickaxe", 5);
		// Selovar
		selovarblock.setHarvestLevel("pickaxe", 6);
		selovarore.setHarvestLevel("pickaxe", 5);
		// Parfilian
		parfilianblock.setHarvestLevel("pickaxe", 6);
		parfilianore.setHarvestLevel("pickaxe", 5);
		// Barium
		bariumblock.setHarvestLevel("pickaxe", 7);
		bariumore.setHarvestLevel("pickaxe", 6);
		// Radium
		radiumblock.setHarvestLevel("pickaxe", 7);
		radiumore.setHarvestLevel("pickaxe", 6);
		// Gallum
		gallumblock.setHarvestLevel("pickaxe", 7);
		gallumore.setHarvestLevel("pickaxe", 6);
		// Vanadium
		vanadiumblock.setHarvestLevel("pickaxe", 8);
		vanadiumore.setHarvestLevel("pickaxe", 7);
		// Scandium
		scandiumblock.setHarvestLevel("pickaxe", 8);
		scandiumore.setHarvestLevel("pickaxe", 7);
		// Bismuth
		bismuthblock.setHarvestLevel("pickaxe", 9);
		bismuthore.setHarvestLevel("pickaxe", 8);
		// Indium
		indiumblock.setHarvestLevel("pickaxe", 9);
		indiumore.setHarvestLevel("pickaxe", 8);
		// Platinum
		platinumblock.setHarvestLevel("pickaxe", 10);
		platinumore.setHarvestLevel("pickaxe", 9);
		// Berionvar
		berionvarblock.setHarvestLevel("pickaxe", 11);
		berionvarore.setHarvestLevel("pickaxe", 10);
		// Charviole
		charvioleblock.setHarvestLevel("pickaxe", 11);
		charvioleore.setHarvestLevel("pickaxe", 10);
		// Firlvear
		firlvearblock.setHarvestLevel("pickaxe", 12);
		firlvearore.setHarvestLevel("pickaxe", 11);
		// Selmenrer
		selmenrerblock.setHarvestLevel("pickaxe", 12);
		selmenrerore.setHarvestLevel("pickaxe", 11);
		// Verilion
		verilionblock.setHarvestLevel("pickaxe", 13);
		verilionore.setHarvestLevel("pickaxe", 12);
		// Vielvor
		vielvorblock.setHarvestLevel("pickaxe", 13);
		vielvorore.setHarvestLevel("pickaxe", 12);
		// Darkness
		darknessblock.setHarvestLevel("pickaxe", 20);
		darknessore.setHarvestLevel("pickaxe", 15);
		// Light
		lightblock.setHarvestLevel("pickaxe", 20);
		lightore.setHarvestLevel("pickaxe", 15);
		// Omega
		omegablock.setHarvestLevel("pickaxe", 30);
		omegaore.setHarvestLevel("pickaxe", 20);
		// ???
		unknown.setHarvestLevel("pickaxe", 10);

	}

}
