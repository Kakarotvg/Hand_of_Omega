package com.kakarotvg.omega.handlers.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.kakarotvg.omega.handlers.armor.ArmorHandler;
import com.kakarotvg.omega.handlers.blocks.BlockHandler;
import com.kakarotvg.omega.handlers.item.ItemHandler;
import com.kakarotvg.omega.handlers.tools.ToolHandler;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingHandler {

	public static void addCrafting(GameRegistry register) {
		// Urotark
		register.addRecipe(new ItemStack(BlockHandler.urotarkblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.urotark);
		register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4), new Object[] { BlockHandler.urotarkblock });
		register.addRecipe(new ItemStack(ToolHandler.urotarkaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.urotarkingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.urotarkhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.urotarkingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.urotarkshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.urotarkingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.urotarksword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.urotarkingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.urotarkpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.urotarkingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.urotarkhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.urotarkingot);
		register.addRecipe(new ItemStack(ArmorHandler.urotarkplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.urotarkingot);
		register.addRecipe(new ItemStack(ArmorHandler.urotarklegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.urotarkingot);
		register.addRecipe(new ItemStack(ArmorHandler.urotarkboots, 1), "   ", "U U", "U U", 'U', ItemHandler.urotarkingot);
		// Pearl
		register.addRecipe(new ItemStack(BlockHandler.pearlblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.pearl);
		register.addShapelessRecipe(new ItemStack(ItemHandler.pearl, 4), new Object[] { BlockHandler.pearlblock });
		register.addRecipe(new ItemStack(ToolHandler.pearlaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.pearlingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.pearlhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.pearlingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.pearlshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.pearlingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.pearlsword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.pearlingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.pearlpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.pearlingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.pearlhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.pearlingot);
		register.addRecipe(new ItemStack(ArmorHandler.pearlplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.pearlingot);
		register.addRecipe(new ItemStack(ArmorHandler.pearllegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.pearlingot);
		register.addRecipe(new ItemStack(ArmorHandler.pearlboots, 1), "   ", "U U", "U U", 'U', ItemHandler.pearlingot);
		// Sapphire
		register.addRecipe(new ItemStack(BlockHandler.sapphireblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.sapphire);
		register.addShapelessRecipe(new ItemStack(ItemHandler.sapphire, 4), new Object[] { BlockHandler.sapphireblock });
		register.addRecipe(new ItemStack(ToolHandler.sapphireaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.sapphireingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.sapphirehoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.sapphireingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.sapphireshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.sapphireingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.sapphiresword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.sapphireingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.sapphirepickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.sapphireingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.sapphirehelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.sapphireingot);
		register.addRecipe(new ItemStack(ArmorHandler.sapphireplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.sapphireingot);
		register.addRecipe(new ItemStack(ArmorHandler.sapphirelegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.sapphireingot);
		register.addRecipe(new ItemStack(ArmorHandler.sapphireboots, 1), "   ", "U U", "U U", 'U', ItemHandler.sapphireingot);
		// Muscovite
		register.addRecipe(new ItemStack(BlockHandler.muscoviteblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.muscovite);
		register.addShapelessRecipe(new ItemStack(ItemHandler.muscovite, 4), new Object[] { BlockHandler.muscoviteblock });
		register.addRecipe(new ItemStack(ToolHandler.muscoviteaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.muscoviteingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.muscovitehoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.muscoviteingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.muscoviteshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.muscoviteingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.muscovitesword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.muscoviteingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.muscovitepickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.muscoviteingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.muscovitehelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.muscoviteingot);
		register.addRecipe(new ItemStack(ArmorHandler.muscoviteplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.muscoviteingot);
		register.addRecipe(new ItemStack(ArmorHandler.muscovitelegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.muscoviteingot);
		register.addRecipe(new ItemStack(ArmorHandler.muscoviteboots, 1), "   ", "U U", "U U", 'U', ItemHandler.muscoviteingot);
		// Ruby
		register.addRecipe(new ItemStack(BlockHandler.rubyblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.ruby);
		register.addShapelessRecipe(new ItemStack(ItemHandler.ruby, 4), new Object[] { BlockHandler.rubyblock });
		register.addRecipe(new ItemStack(ToolHandler.rubyaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.rubyingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.rubyhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.rubyingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.rubyshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.rubyingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.rubysword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.rubyingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.rubypickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.rubyingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.rubyhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.rubyingot);
		register.addRecipe(new ItemStack(ArmorHandler.rubyplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.rubyingot);
		register.addRecipe(new ItemStack(ArmorHandler.rubylegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.rubyingot);
		register.addRecipe(new ItemStack(ArmorHandler.rubyboots, 1), "   ", "U U", "U U", 'U', ItemHandler.rubyingot);
		// Uriotyke
		register.addRecipe(new ItemStack(BlockHandler.uriotykeblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.uriotyke);
		register.addShapelessRecipe(new ItemStack(ItemHandler.uriotyke, 4), new Object[] { BlockHandler.uriotykeblock });
		register.addRecipe(new ItemStack(ToolHandler.uriotykeaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.uriotykeingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.uriotykehoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.uriotykeingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.uriotykeshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.uriotykeingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.uriotykesword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.uriotykeingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.uriotykepickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.uriotykeingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.uriotykehelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.uriotykeingot);
		register.addRecipe(new ItemStack(ArmorHandler.uriotykeplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.uriotykeingot);
		register.addRecipe(new ItemStack(ArmorHandler.uriotykelegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.uriotykeingot);
		register.addRecipe(new ItemStack(ArmorHandler.uriotykeboots, 1), "   ", "U U", "U U", 'U', ItemHandler.uriotykeingot);
		// Gilder
		register.addRecipe(new ItemStack(BlockHandler.gilderblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.gilder);
		register.addShapelessRecipe(new ItemStack(ItemHandler.gilder, 4), new Object[] { BlockHandler.gilderblock });
		register.addRecipe(new ItemStack(ToolHandler.gilderaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.gilderingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.gilderhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.gilderingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.gildershovel, 1), " U ", " s ", " s ", 'U', ItemHandler.gilderingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.gildersword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.gilderingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.gilderpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.gilderingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.gilderhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.gilderingot);
		register.addRecipe(new ItemStack(ArmorHandler.gilderplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.gilderingot);
		register.addRecipe(new ItemStack(ArmorHandler.gilderlegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.gilderingot);
		register.addRecipe(new ItemStack(ArmorHandler.gilderboots, 1), "   ", "U U", "U U", 'U', ItemHandler.gilderingot);
		// Selovar
		register.addRecipe(new ItemStack(BlockHandler.selovarblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.selovar);
		register.addShapelessRecipe(new ItemStack(ItemHandler.selovar, 4), new Object[] { BlockHandler.selovarblock });
		register.addRecipe(new ItemStack(ToolHandler.selovaraxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.selovaringot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.selovarhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.selovaringot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.selovarshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.selovaringot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.selovarsword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.selovaringot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.selovarpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.selovaringot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.selovarhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.selovaringot);
		register.addRecipe(new ItemStack(ArmorHandler.selovarplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.selovaringot);
		register.addRecipe(new ItemStack(ArmorHandler.selovarlegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.selovaringot);
		register.addRecipe(new ItemStack(ArmorHandler.selovarboots, 1), "   ", "U U", "U U", 'U', ItemHandler.selovaringot);
		// Parfilian
		register.addRecipe(new ItemStack(BlockHandler.parfilianblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.parfilian);
		register.addShapelessRecipe(new ItemStack(ItemHandler.parfilian, 4), new Object[] { BlockHandler.parfilianblock });
		register.addRecipe(new ItemStack(ToolHandler.parfilianaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.parfilianingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.parfilianhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.parfilianingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.parfilianshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.parfilianingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.parfiliansword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.parfilianingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.parfilianpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.parfilianingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.parfilianhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.parfilianingot);
		register.addRecipe(new ItemStack(ArmorHandler.parfilianplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.parfilianingot);
		register.addRecipe(new ItemStack(ArmorHandler.parfilianlegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.parfilianingot);
		register.addRecipe(new ItemStack(ArmorHandler.parfilianboots, 1), "   ", "U U", "U U", 'U', ItemHandler.parfilianingot);
		// Barium
		register.addRecipe(new ItemStack(BlockHandler.bariumblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.barium);
		register.addShapelessRecipe(new ItemStack(ItemHandler.barium, 4), new Object[] { BlockHandler.bariumblock });
		register.addRecipe(new ItemStack(ToolHandler.bariumaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.bariumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.bariumhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.bariumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.bariumshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.bariumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.bariumsword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.bariumingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.bariumpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.bariumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.bariumhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.bariumingot);
		register.addRecipe(new ItemStack(ArmorHandler.bariumplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.bariumingot);
		register.addRecipe(new ItemStack(ArmorHandler.bariumlegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.bariumingot);
		register.addRecipe(new ItemStack(ArmorHandler.bariumboots, 1), "   ", "U U", "U U", 'U', ItemHandler.bariumingot);
		// Radium
		register.addRecipe(new ItemStack(BlockHandler.radiumblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.radium);
		register.addShapelessRecipe(new ItemStack(ItemHandler.radium, 4), new Object[] { BlockHandler.radiumblock });
		register.addRecipe(new ItemStack(ToolHandler.radiumaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.radiumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.radiumhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.radiumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.radiumshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.radiumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.radiumsword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.radiumingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.radiumpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.radiumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.radiumhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.radiumingot);
		register.addRecipe(new ItemStack(ArmorHandler.radiumplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.radiumingot);
		register.addRecipe(new ItemStack(ArmorHandler.radiumlegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.radiumingot);
		register.addRecipe(new ItemStack(ArmorHandler.radiumboots, 1), "   ", "U U", "U U", 'U', ItemHandler.radiumingot);
		// Gallum
		register.addRecipe(new ItemStack(BlockHandler.gallumblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.gallum);
		register.addShapelessRecipe(new ItemStack(ItemHandler.gallum, 4), new Object[] { BlockHandler.gallumblock });
		register.addRecipe(new ItemStack(ToolHandler.gallumaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.gallumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.gallumhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.gallumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.gallumshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.gallumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.gallumsword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.gallumingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.gallumpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.gallumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.gallumhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.gallumingot);
		register.addRecipe(new ItemStack(ArmorHandler.gallumplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.gallumingot);
		register.addRecipe(new ItemStack(ArmorHandler.gallumlegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.gallumingot);
		register.addRecipe(new ItemStack(ArmorHandler.gallumboots, 1), "   ", "U U", "U U", 'U', ItemHandler.gallumingot);
		// Vanadium
		register.addRecipe(new ItemStack(BlockHandler.vanadiumblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.vanadium);
		register.addShapelessRecipe(new ItemStack(ItemHandler.vanadium, 4), new Object[] { BlockHandler.vanadiumblock });
		register.addRecipe(new ItemStack(ToolHandler.vanadiumaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.vanadiumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.vanadiumhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.vanadiumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.vanadiumshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.vanadiumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.vanadiumsword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.vanadiumingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.vanadiumpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.vanadiumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.vanadiumhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.vanadiumingot);
		register.addRecipe(new ItemStack(ArmorHandler.vanadiumplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.vanadiumingot);
		register.addRecipe(new ItemStack(ArmorHandler.vanadiumlegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.vanadiumingot);
		register.addRecipe(new ItemStack(ArmorHandler.vanadiumboots, 1), "   ", "U U", "U U", 'U', ItemHandler.vanadiumingot);
		// Scandium
		register.addRecipe(new ItemStack(BlockHandler.scandiumblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.scandium);
		register.addShapelessRecipe(new ItemStack(ItemHandler.scandium, 4), new Object[] { BlockHandler.scandiumblock });
		register.addRecipe(new ItemStack(ToolHandler.scandiumaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.scandiumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.scandiumhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.scandiumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.scandiumshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.scandiumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.scandiumsword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.scandiumingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.scandiumpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.scandiumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.scandiumhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.scandiumingot);
		register.addRecipe(new ItemStack(ArmorHandler.scandiumplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.scandiumingot);
		register.addRecipe(new ItemStack(ArmorHandler.scandiumlegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.scandiumingot);
		register.addRecipe(new ItemStack(ArmorHandler.scandiumboots, 1), "   ", "U U", "U U", 'U', ItemHandler.scandiumingot);
		// Bismuth
		register.addRecipe(new ItemStack(BlockHandler.bismuthblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.bismuth);
		register.addShapelessRecipe(new ItemStack(ItemHandler.bismuth, 4), new Object[] { BlockHandler.bismuthblock });
		register.addRecipe(new ItemStack(ToolHandler.bismuthaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.bismuthingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.bismuthhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.bismuthingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.bismuthshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.bismuthingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.bismuthsword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.bismuthingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.bismuthpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.bismuthingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.bismuthhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.bismuthingot);
		register.addRecipe(new ItemStack(ArmorHandler.bismuthplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.bismuthingot);
		register.addRecipe(new ItemStack(ArmorHandler.bismuthlegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.bismuthingot);
		register.addRecipe(new ItemStack(ArmorHandler.bismuthboots, 1), "   ", "U U", "U U", 'U', ItemHandler.bismuthingot);
		// Indium
		register.addRecipe(new ItemStack(BlockHandler.indiumblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.indium);
		register.addShapelessRecipe(new ItemStack(ItemHandler.indium, 4), new Object[] { BlockHandler.indiumblock });
		register.addRecipe(new ItemStack(ToolHandler.indiumaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.indiumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.indiumhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.indiumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.indiumshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.indiumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.indiumsword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.indiumingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.indiumpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.indiumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.indiumhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.indiumingot);
		register.addRecipe(new ItemStack(ArmorHandler.indiumplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.indiumingot);
		register.addRecipe(new ItemStack(ArmorHandler.indiumlegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.indiumingot);
		register.addRecipe(new ItemStack(ArmorHandler.indiumboots, 1), "   ", "U U", "U U", 'U', ItemHandler.indiumingot);
		// Platinum
		register.addRecipe(new ItemStack(BlockHandler.platinumblock, 1), "PPP", "PPP", "PPP", 'P', ItemHandler.platinum);
		register.addShapelessRecipe(new ItemStack(ItemHandler.platinum, 4), new Object[] { BlockHandler.platinumblock });
		register.addRecipe(new ItemStack(ToolHandler.platinumaxe, 1), "PP ", "Ps ", " s ", 'P', ItemHandler.platinumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.platinumhoe, 1), "PP ", " s ", " s ", 'P', ItemHandler.platinumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.platinumshovel, 1), " P ", " s ", " s ", 'P', ItemHandler.platinumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.platinumsword, 1), "gPg", "gPg", " s ", 'P', ItemHandler.platinumingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.platinumpickaxe, 1), "PPP", " s ", " s ", 'P', ItemHandler.platinumingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.platinumhelm, 1), "PPP", "P P", "   ", 'P', ItemHandler.platinumingot);
		register.addRecipe(new ItemStack(ArmorHandler.platinumplate, 1), "P P", "PPP", "PPP", 'P', ItemHandler.platinumingot);
		register.addRecipe(new ItemStack(ArmorHandler.platinumlegs, 1), "PPP", "P P", "P P", 'P', ItemHandler.platinumingot);
		register.addRecipe(new ItemStack(ArmorHandler.platinumboots, 1), "   ", "P P", "P P", 'P', ItemHandler.platinumingot);
		// Darkness
		register.addRecipe(new ItemStack(ItemHandler.darkness, 1), "DDD", "DDD", "DDD", 'D', ItemHandler.darknessshard);
		register.addRecipe(new ItemStack(BlockHandler.darknessblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.darkness);
		register.addShapelessRecipe(new ItemStack(ItemHandler.darkness, 4), new Object[] { BlockHandler.darknessblock });
		register.addRecipe(new ItemStack(ToolHandler.darknessaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.darknessingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.darknesshoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.darknessingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.darknessshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.darknessingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.darknesssword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.darknessingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.darknesspickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.darknessingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.darknesshelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.darknessingot);
		register.addRecipe(new ItemStack(ArmorHandler.darknessplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.darknessingot);
		register.addRecipe(new ItemStack(ArmorHandler.darknesslegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.darknessingot);
		register.addRecipe(new ItemStack(ArmorHandler.darknessboots, 1), "   ", "U U", "U U", 'U', ItemHandler.darknessingot);
		// Light
		register.addRecipe(new ItemStack(ItemHandler.light, 1), "LLL", "LLL", "LLL", 'L', ItemHandler.lightshard);
		register.addRecipe(new ItemStack(BlockHandler.lightblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.light);
		register.addShapelessRecipe(new ItemStack(ItemHandler.light, 4), new Object[] { BlockHandler.lightblock });
		register.addRecipe(new ItemStack(ToolHandler.lightaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.lightingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.lighthoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.lightingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.lightshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.lightingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.lightsword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.lightingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.lightpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.lightingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.lighthelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.lightingot);
		register.addRecipe(new ItemStack(ArmorHandler.lightplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.lightingot);
		register.addRecipe(new ItemStack(ArmorHandler.lightlegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.lightingot);
		register.addRecipe(new ItemStack(ArmorHandler.lightboots, 1), "   ", "U U", "U U", 'U', ItemHandler.lightingot);
		// Omega
		register.addRecipe(new ItemStack(ItemHandler.omega, 1), "OOO", "OOO", "OOO", 'O', ItemHandler.omegashards);
		register.addRecipe(new ItemStack(BlockHandler.omegablock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.omega);
		register.addShapelessRecipe(new ItemStack(ItemHandler.omega, 4), new Object[] { BlockHandler.omegablock });
		register.addRecipe(new ItemStack(ToolHandler.omegaaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.omegaingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.omegahoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.omegaingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.omegashovel, 1), " U ", " s ", " s ", 'U', ItemHandler.omegaingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.omegasword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.omegaingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.omegapickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.omegaingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.omegahelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.omegaingot);
		register.addRecipe(new ItemStack(ArmorHandler.omegaplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.omegaingot);
		register.addRecipe(new ItemStack(ArmorHandler.omegalegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.omegaingot);
		register.addRecipe(new ItemStack(ArmorHandler.omegaboots, 1), "   ", "U U", "U U", 'U', ItemHandler.omegaingot);
		// Berionvar
		register.addRecipe(new ItemStack(BlockHandler.berionvarblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.berionvar);
		register.addShapelessRecipe(new ItemStack(ItemHandler.berionvar, 4), new Object[] { BlockHandler.berionvarblock });
		register.addRecipe(new ItemStack(ToolHandler.berionvaraxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.berionvaringot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.berionvarhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.berionvaringot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.berionvarshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.berionvaringot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.berionvarsword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.berionvaringot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.berionvarpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.berionvaringot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.berionvarhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.berionvaringot);
		register.addRecipe(new ItemStack(ArmorHandler.berionvarplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.berionvaringot);
		register.addRecipe(new ItemStack(ArmorHandler.berionvarlegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.berionvaringot);
		register.addRecipe(new ItemStack(ArmorHandler.berionvarboots, 1), "   ", "U U", "U U", 'U', ItemHandler.berionvaringot);
		// Charviole
		register.addRecipe(new ItemStack(BlockHandler.charvioleblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.charviole);
		register.addShapelessRecipe(new ItemStack(ItemHandler.charviole, 4), new Object[] { BlockHandler.charvioleblock });
		register.addRecipe(new ItemStack(ToolHandler.charvioleaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.charvioleingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.charviolehoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.charvioleingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.charvioleshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.charvioleingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.charviolesword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.charvioleingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.charviolepickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.charvioleingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.charviolehelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.charvioleingot);
		register.addRecipe(new ItemStack(ArmorHandler.charvioleplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.charvioleingot);
		register.addRecipe(new ItemStack(ArmorHandler.charviolelegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.charvioleingot);
		register.addRecipe(new ItemStack(ArmorHandler.charvioleboots, 1), "   ", "U U", "U U", 'U', ItemHandler.charvioleingot);
		// Firlvear
		register.addRecipe(new ItemStack(BlockHandler.firlvearblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.firlvear);
		register.addShapelessRecipe(new ItemStack(ItemHandler.firlvear, 4), new Object[] { BlockHandler.firlvearblock });
		register.addRecipe(new ItemStack(ToolHandler.firlvearaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.firlvearingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.firlvearhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.firlvearingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.firlvearshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.firlvearingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.firlvearsword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.firlvearingot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.firlvearpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.firlvearingot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.firlvearhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.firlvearingot);
		register.addRecipe(new ItemStack(ArmorHandler.firlvearplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.firlvearingot);
		register.addRecipe(new ItemStack(ArmorHandler.firlvearlegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.firlvearingot);
		register.addRecipe(new ItemStack(ArmorHandler.firlvearboots, 1), "   ", "U U", "U U", 'U', ItemHandler.firlvearingot);
		// Selmenrer
		register.addRecipe(new ItemStack(BlockHandler.selmenrerblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.selmenrer);
		register.addShapelessRecipe(new ItemStack(ItemHandler.selmenrer, 4), new Object[] { BlockHandler.selmenrerblock });
		register.addRecipe(new ItemStack(ToolHandler.selmenreraxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.selmenreringot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.selmenrerhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.selmenreringot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.selmenrershovel, 1), " U ", " s ", " s ", 'U', ItemHandler.selmenreringot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.selmenrersword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.selmenreringot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.selmenrerpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.selmenreringot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.selmenrerhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.selmenreringot);
		register.addRecipe(new ItemStack(ArmorHandler.selmenrerplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.selmenreringot);
		register.addRecipe(new ItemStack(ArmorHandler.selmenrerlegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.selmenreringot);
		register.addRecipe(new ItemStack(ArmorHandler.selmenrerboots, 1), "   ", "U U", "U U", 'U', ItemHandler.selmenreringot);
		// Verilion
		register.addRecipe(new ItemStack(BlockHandler.verilionblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.verilion);
		register.addShapelessRecipe(new ItemStack(ItemHandler.verilion, 4), new Object[] { BlockHandler.verilionblock });
		register.addRecipe(new ItemStack(ToolHandler.verilionaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.verilioningot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.verilionhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.verilioningot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.verilionshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.verilioningot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.verilionsword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.verilioningot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.verilionpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.verilioningot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.verilionhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.verilioningot);
		register.addRecipe(new ItemStack(ArmorHandler.verilionplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.verilioningot);
		register.addRecipe(new ItemStack(ArmorHandler.verilionlegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.verilioningot);
		register.addRecipe(new ItemStack(ArmorHandler.verilionboots, 1), "   ", "U U", "U U", 'U', ItemHandler.verilioningot);
		// Vielvor
		register.addRecipe(new ItemStack(BlockHandler.vielvorblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.vielvor);
		register.addShapelessRecipe(new ItemStack(ItemHandler.vielvor, 4), new Object[] { BlockHandler.vielvorblock });
		register.addRecipe(new ItemStack(ToolHandler.vielvoraxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.vielvoringot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.vielvorhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.vielvoringot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.vielvorshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.vielvoringot, 's', Items.stick);
		register.addRecipe(new ItemStack(ToolHandler.vielvorsword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.vielvoringot, 's', Items.stick, 'g', Items.gold_ingot);
		register.addRecipe(new ItemStack(ToolHandler.vielvorpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.vielvoringot, 's', Items.stick);
		register.addRecipe(new ItemStack(ArmorHandler.vielvorhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.vielvoringot);
		register.addRecipe(new ItemStack(ArmorHandler.vielvorplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.vielvoringot);
		register.addRecipe(new ItemStack(ArmorHandler.vielvorlegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.vielvoringot);
		register.addRecipe(new ItemStack(ArmorHandler.vielvorboots, 1), "   ", "U U", "U U", 'U', ItemHandler.vielvoringot);
		// invisible
		register.addRecipe(new ItemStack(ArmorHandler.invisibleboots, 1), "   ", "d l", "d l", 'l', new ItemStack(ItemHandler.platinum, 1, 2), 'd', new ItemStack(ItemHandler.platinum, 1, 1));
		register.addRecipe(new ItemStack(ArmorHandler.invisiblehelm, 1), "dld", "d l", "   ", 'l', new ItemStack(ItemHandler.platinum, 1, 2), 'd', new ItemStack(ItemHandler.platinum, 1, 1));
		register.addRecipe(new ItemStack(ArmorHandler.invisibleplate, 1), "d l", "dll", "ddl", 'l', new ItemStack(ItemHandler.platinum, 1, 2), 'd', new ItemStack(ItemHandler.platinum, 1, 1));
		register.addRecipe(new ItemStack(ArmorHandler.invisiblelegs, 1), "dld", "d l", "l l", 'l', new ItemStack(ItemHandler.platinum, 1, 2), 'd', new ItemStack(ItemHandler.platinum, 1, 1));
		register.addRecipe(new ItemStack(ToolHandler.invisibledagger, 1), " l ", " d ", " s ", 'l', new ItemStack(ItemHandler.platinum, 1, 2), 'd', new ItemStack(ItemHandler.platinum, 1, 1), 's', Items.stick);

	}

	public static void addSmelting(GameRegistry register) {
		// urotark
		register.addSmelting(BlockHandler.urotarkore, new ItemStack(ItemHandler.urotark, 1), 6.0F);
		register.addSmelting(BlockHandler.urotarkblock, new ItemStack(ItemHandler.urotarkingot, 1), 6.0F);
		// pearl
		register.addSmelting(BlockHandler.pearlore, new ItemStack(ItemHandler.pearl, 1), 6.0F);
		register.addSmelting(BlockHandler.pearlblock, new ItemStack(ItemHandler.pearlingot, 1), 6.0F);
		// sapphire
		register.addSmelting(BlockHandler.sapphireore, new ItemStack(ItemHandler.sapphire, 1), 6.0F);
		register.addSmelting(BlockHandler.sapphireblock, new ItemStack(ItemHandler.sapphireingot, 1), 6.0F);
		// muscovite
		register.addSmelting(BlockHandler.muscoviteore, new ItemStack(ItemHandler.muscovite, 1), 6.0F);
		register.addSmelting(BlockHandler.muscoviteblock, new ItemStack(ItemHandler.muscoviteingot, 1), 6.0F);
		// ruby
		register.addSmelting(BlockHandler.rubyore, new ItemStack(ItemHandler.ruby, 1), 6.0F);
		register.addSmelting(BlockHandler.rubyblock, new ItemStack(ItemHandler.rubyingot, 1), 6.0F);
		// uriotyke
		register.addSmelting(BlockHandler.uriotykeore, new ItemStack(ItemHandler.uriotyke, 1), 6.0F);
		register.addSmelting(BlockHandler.uriotykeblock, new ItemStack(ItemHandler.uriotykeingot, 1), 6.0F);
		// gilder
		register.addSmelting(BlockHandler.gilderore, new ItemStack(ItemHandler.gilder, 1), 6.0F);
		register.addSmelting(BlockHandler.gilderblock, new ItemStack(ItemHandler.gilderingot, 1), 6.0F);
		// selovar
		register.addSmelting(BlockHandler.selovarore, new ItemStack(ItemHandler.selovar, 1), 6.0F);
		register.addSmelting(BlockHandler.selovarblock, new ItemStack(ItemHandler.selovaringot, 1), 6.0F);
		// parfilian
		register.addSmelting(BlockHandler.parfilianore, new ItemStack(ItemHandler.parfilian, 1), 6.0F);
		register.addSmelting(BlockHandler.parfilianblock, new ItemStack(ItemHandler.parfilianingot, 1), 6.0F);
		// barium
		register.addSmelting(BlockHandler.bariumore, new ItemStack(ItemHandler.barium, 1), 6.0F);
		register.addSmelting(BlockHandler.bariumblock, new ItemStack(ItemHandler.bariumingot, 1), 6.0F);
		// radium
		register.addSmelting(BlockHandler.radiumore, new ItemStack(ItemHandler.radium, 1), 6.0F);
		register.addSmelting(BlockHandler.radiumblock, new ItemStack(ItemHandler.radiumingot, 1), 6.0F);
		// gallum
		register.addSmelting(BlockHandler.gallumore, new ItemStack(ItemHandler.gallum, 1), 6.0F);
		register.addSmelting(BlockHandler.gallumblock, new ItemStack(ItemHandler.gallumingot, 1), 6.0F);
		// vanadium
		register.addSmelting(BlockHandler.vanadiumore, new ItemStack(ItemHandler.vanadium, 1), 6.0F);
		register.addSmelting(BlockHandler.vanadiumblock, new ItemStack(ItemHandler.vanadiumingot, 1), 6.0F);
		// scandium
		register.addSmelting(BlockHandler.scandiumore, new ItemStack(ItemHandler.scandium, 1), 6.0F);
		register.addSmelting(BlockHandler.scandiumblock, new ItemStack(ItemHandler.scandiumingot, 1), 6.0F);
		// bismuth
		register.addSmelting(BlockHandler.bismuthore, new ItemStack(ItemHandler.bismuth, 1), 6.0F);
		register.addSmelting(BlockHandler.bismuthblock, new ItemStack(ItemHandler.bismuthingot, 1), 6.0F);
		// indium
		register.addSmelting(BlockHandler.indiumore, new ItemStack(ItemHandler.indium, 1), 6.0F);
		register.addSmelting(BlockHandler.indiumblock, new ItemStack(ItemHandler.indiumingot, 1), 6.0F);
		// platinum
		register.addSmelting(BlockHandler.platinumore, new ItemStack(ItemHandler.platinum, 1), 22.0F);
		register.addSmelting(BlockHandler.platinumblock, new ItemStack(ItemHandler.platinumingot, 1), 22.0F);
		// darkness
		register.addSmelting(BlockHandler.darknessore, new ItemStack(ItemHandler.darknessshard, 1), 6.0F);
		register.addSmelting(BlockHandler.darknessblock, new ItemStack(ItemHandler.darknessingot, 1), 6.0F);
		// light
		register.addSmelting(BlockHandler.lightore, new ItemStack(ItemHandler.lightshard, 1), 6.0F);
		register.addSmelting(BlockHandler.lightblock, new ItemStack(ItemHandler.lightingot, 1), 6.0F);
		// omega
		register.addSmelting(BlockHandler.omegaore, new ItemStack(ItemHandler.omegashards, 1), 6.0F);
		register.addSmelting(BlockHandler.omegablock, new ItemStack(ItemHandler.omegaingot, 1), 6.0F);
		// Berionvar
		register.addSmelting(BlockHandler.berionvarore, new ItemStack(ItemHandler.berionvar, 1), 6.0F);
		register.addSmelting(BlockHandler.berionvarblock, new ItemStack(ItemHandler.berionvaringot, 1), 6.0F);
		// Charviole
		register.addSmelting(BlockHandler.charvioleore, new ItemStack(ItemHandler.charviole, 1), 6.0F);
		register.addSmelting(BlockHandler.charvioleblock, new ItemStack(ItemHandler.charvioleingot, 1), 6.0F);
		// Firlvear
		register.addSmelting(BlockHandler.firlvearore, new ItemStack(ItemHandler.firlvear, 1), 6.0F);
		register.addSmelting(BlockHandler.firlvearblock, new ItemStack(ItemHandler.firlvearingot, 1), 6.0F);
		// Selmenrer
		register.addSmelting(BlockHandler.selmenrerore, new ItemStack(ItemHandler.selmenrer, 1), 6.0F);
		register.addSmelting(BlockHandler.selmenrerblock, new ItemStack(ItemHandler.selmenreringot, 1), 6.0F);
		// Verilion
		register.addSmelting(BlockHandler.verilionore, new ItemStack(ItemHandler.verilion, 1), 6.0F);
		register.addSmelting(BlockHandler.verilionblock, new ItemStack(ItemHandler.verilioningot, 1), 6.0F);
		// Vielvor
		register.addSmelting(BlockHandler.vielvorore, new ItemStack(ItemHandler.vielvor, 1), 6.0F);
		register.addSmelting(BlockHandler.vielvorblock, new ItemStack(ItemHandler.vielvoringot, 1), 6.0F);

	}

}
