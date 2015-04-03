package com.kakarotvg.omega.handlers.armor;

import com.kakarotvg.omega.Omega;
import com.kakarotvg.omega.armor.DarknessArmor;
import com.kakarotvg.omega.armor.LightArmor;
import com.kakarotvg.omega.armor.OmegaArmor;
import com.kakarotvg.omega.armor.Vgarmor;
import com.kakarotvg.omega.handlers.creativetab.CreativetabHandler;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ArmorHandler {
    
    // urotark
    public static Item urotarkhelm;
    public static Item urotarkplate;
    public static Item urotarklegs;
    public static Item urotarkboots;
    // pearl
    public static Item pearlhelm;
    public static Item pearlplate;
    public static Item pearllegs;
    public static Item pearlboots;
    // sapphire
    public static Item sapphirehelm;
    public static Item sapphireplate;
    public static Item sapphirelegs;
    public static Item sapphireboots;
    // muscovite
    public static Item muscovitehelm;
    public static Item muscoviteplate;
    public static Item muscovitelegs;
    public static Item muscoviteboots;
    // ruby
    public static Item rubyhelm;
    public static Item rubyplate;
    public static Item rubylegs;
    public static Item rubyboots;
    // uriotyke
    public static Item uriotykehelm;
    public static Item uriotykeplate;
    public static Item uriotykelegs;
    public static Item uriotykeboots;
    // gilder
    public static Item gilderhelm;
    public static Item gilderplate;
    public static Item gilderlegs;
    public static Item gilderboots;
    // selovar
    public static Item selovarhelm;
    public static Item selovarplate;
    public static Item selovarlegs;
    public static Item selovarboots;
    // parfilian
    public static Item parfilianhelm;
    public static Item parfilianplate;
    public static Item parfilianlegs;
    public static Item parfilianboots;
    // barium
    public static Item bariumhelm;
    public static Item bariumplate;
    public static Item bariumlegs;
    public static Item bariumboots;
    // radium
    public static Item radiumhelm;
    public static Item radiumplate;
    public static Item radiumlegs;
    public static Item radiumboots;
    // gallum
    public static Item gallumhelm;
    public static Item gallumplate;
    public static Item gallumlegs;
    public static Item gallumboots;
    // vanadium
    public static Item vanadiumhelm;
    public static Item vanadiumplate;
    public static Item vanadiumlegs;
    public static Item vanadiumboots;
    // scandium
    public static Item scandiumhelm;
    public static Item scandiumplate;
    public static Item scandiumlegs;
    public static Item scandiumboots;
    // bismuth
    public static Item bismuthhelm;
    public static Item bismuthplate;
    public static Item bismuthlegs;
    public static Item bismuthboots;
    // indium
    public static Item indiumhelm;
    public static Item indiumplate;
    public static Item indiumlegs;
    public static Item indiumboots;
    // platinum
    public static Item platinumhelm;
    public static Item platinumplate;
    public static Item platinumlegs;
    public static Item platinumboots;
    // darkness
    public static Item darknesshelm;
    public static Item darknessplate;
    public static Item darknesslegs;
    public static Item darknessboots;
    // light
    public static Item lighthelm;
    public static Item lightplate;
    public static Item lightlegs;
    public static Item lightboots;
    // omega
    public static Item omegahelm;
    public static Item omegaplate;
    public static Item omegalegs;
    public static Item omegaboots;
    // berionvar
    public static Item berionvarhelm;
    public static Item berionvarplate;
    public static Item berionvarlegs;
    public static Item berionvarboots;
    // charviole
    public static Item charviolehelm;
    public static Item charvioleplate;
    public static Item charviolelegs;
    public static Item charvioleboots;
    // firlvear
    public static Item firlvearhelm;
    public static Item firlvearplate;
    public static Item firlvearlegs;
    public static Item firlvearboots;
    // selmenrer
    public static Item selmenrerhelm;
    public static Item selmenrerplate;
    public static Item selmenrerlegs;
    public static Item selmenrerboots;
    // verilion
    public static Item verilionhelm;
    public static Item verilionplate;
    public static Item verilionlegs;
    public static Item verilionboots;
    // vielvor
    public static Item vielvorhelm;
    public static Item vielvorplate;
    public static Item vielvorlegs;
    public static Item vielvorboots;
    // invisible
    public static Item invisiblehelm;
    public static Item invisibleplate;
    public static Item invisiblelegs;
    public static Item invisibleboots;
    
    // urotark
    public static ArmorMaterial UROTARKARMOR = EnumHelper.addArmorMaterial("UROTARKARMOR", 600, new int[] { 6, 11, 9, 6 }, 10);
    // pearl
    public static ArmorMaterial PEARLARMOR = EnumHelper.addArmorMaterial("PEARLARMOR", 700, new int[] { 7, 12, 10, 7 }, 10);
    // sapphire
    public static ArmorMaterial SAPPHIREARMOR = EnumHelper.addArmorMaterial("SAPPHIREARMOR", 800, new int[] { 8, 13, 11, 8 }, 10);
    // muscovite
    public static ArmorMaterial MUSCOVITEARMOR = EnumHelper.addArmorMaterial("MUSCOVITEARMOR", 900, new int[] { 9, 14, 12, 9 }, 10);
    // ruby
    public static ArmorMaterial RUBYARMOR = EnumHelper.addArmorMaterial("RUBYARMOR", 1000, new int[] { 10, 15, 13, 10 }, 10);
    // uriotyke
    public static ArmorMaterial URIOTYKEARMOR = EnumHelper.addArmorMaterial("URIOTYKEARMOR", 1100, new int[] { 11, 16, 14, 11 }, 10);
    // gilder
    public static ArmorMaterial GILDERARMOR = EnumHelper.addArmorMaterial("GILDERARMOR", 1200, new int[] { 12, 17, 15, 12 }, 10);
    // selovar
    public static ArmorMaterial SELOVARARMOR = EnumHelper.addArmorMaterial("SELOVARARMOR", 1300, new int[] { 13, 18, 16, 13 }, 10);
    // parfilian
    public static ArmorMaterial PARFILIANARMOR = EnumHelper.addArmorMaterial("PARFILIANARMOR", 1400, new int[] { 14, 19, 17, 14 }, 10);
    // barium
    public static ArmorMaterial BARIUMARMOR = EnumHelper.addArmorMaterial("BARIUMARMOR", 1500, new int[] { 15, 20, 18, 15 }, 10);
    // radium
    public static ArmorMaterial RADIUMARMOR = EnumHelper.addArmorMaterial("RADIUMARMOR", 1600, new int[] { 16, 21, 19, 16 }, 10);
    // gallum
    public static ArmorMaterial GALLUMARMOR = EnumHelper.addArmorMaterial("GALLUMARMOR", 1700, new int[] { 17, 22, 20, 17 }, 10);
    // vanadium
    public static ArmorMaterial VANADIUMARMOR = EnumHelper.addArmorMaterial("VANADIUMARMOR", 1800, new int[] { 18, 23, 21, 18 }, 10);
    // scandium
    public static ArmorMaterial SCANDIUMARMOR = EnumHelper.addArmorMaterial("SCANDIUMARMOR", 1900, new int[] { 19, 24, 22, 19 }, 10);
    // bismuth
    public static ArmorMaterial BISMUTHARMOR = EnumHelper.addArmorMaterial("BISMUTHARMOR", 2000, new int[] { 20, 25, 23, 20 }, 10);
    // indium
    public static ArmorMaterial INDIUMARMOR = EnumHelper.addArmorMaterial("INDIUMARMOR", 2100, new int[] { 21, 26, 24, 21 }, 10);
    // platinum
    public static ArmorMaterial PLATINUMARMOR = EnumHelper.addArmorMaterial("PLATINUMARMOR", 2200, new int[] { 22, 27, 25, 22 }, 10);
    // darkness
    public static ArmorMaterial DARKNESSARMOR = EnumHelper.addArmorMaterial("DARKNESSARMOR", 3000, new int[] { 35, 40, 38, 35 }, 10);
    // light
    public static ArmorMaterial LIGHTARMOR = EnumHelper.addArmorMaterial("LIGHTARMOR", 3000, new int[] { 35, 40, 38, 35 }, 10);
    // omega
    public static ArmorMaterial OMEGAARMOR = EnumHelper.addArmorMaterial("OMEGAARMOR", 3500, new int[] { 40, 45, 43, 40 }, 10);
    // berionvar
    public static ArmorMaterial BERIONVARARMOR = EnumHelper.addArmorMaterial("BERIONVARARMOR", 2300, new int[] { 23, 28, 26, 23 }, 10);
    // charviole
    public static ArmorMaterial CHARVIOLEARMOR = EnumHelper.addArmorMaterial("CHARVIOLEARMOR", 2400, new int[] { 24, 29, 27, 24 }, 10);
    // firlvear
    public static ArmorMaterial FIRLVEARARMOR = EnumHelper.addArmorMaterial("FIRLVEARARMOR", 2500, new int[] { 25, 30, 28, 25 }, 10);
    // selmenrer
    public static ArmorMaterial SELMENRERARMOR = EnumHelper.addArmorMaterial("SELMENRERARMOR", 2600, new int[] { 26, 31, 29, 26 }, 10);
    // verilion
    public static ArmorMaterial VERILIONARMOR = EnumHelper.addArmorMaterial("VERILIONARMOR", 2700, new int[] { 27, 32, 30, 27 }, 10);
    // vielvor
    public static ArmorMaterial VIELVORARMOR = EnumHelper.addArmorMaterial("VIELVORARMOR", 2800, new int[] { 28, 33, 31, 28 }, 10);
    // invisible
    public static ArmorMaterial INVISIBLEARMOR = EnumHelper.addArmorMaterial("INVISIBLEARMOR", 3000, new int[] { 35, 40, 38, 35 }, 10);
    
    public static void configreArmor() {
        // urotark
        urotarkhelm = new Vgarmor(UROTARKARMOR, Omega.proxy.addArmor("UROTARKARMOR"), 0, "VGUROTARKARMOR_1").setUnlocalizedName("vgurotarkhelm").setCreativeTab(CreativetabHandler.vgtab4);
        urotarkplate = new Vgarmor(UROTARKARMOR, Omega.proxy.addArmor("UROTARKARMOR"), 1, "VGUROTARKARMOR_1").setUnlocalizedName("vgurotarkplate").setCreativeTab(CreativetabHandler.vgtab4);
        urotarklegs = new Vgarmor(UROTARKARMOR, Omega.proxy.addArmor("UROTARKARMOR"), 2, "VGUROTARKARMOR_2").setUnlocalizedName("vgurotarklegs").setCreativeTab(CreativetabHandler.vgtab4);
        urotarkboots = new Vgarmor(UROTARKARMOR, Omega.proxy.addArmor("UROTARKARMOR"), 3, "VGUROTARKARMOR_1").setUnlocalizedName("vgurotarkboots").setCreativeTab(CreativetabHandler.vgtab4);
        // pearl
        pearlhelm = new Vgarmor(PEARLARMOR, Omega.proxy.addArmor("PEARLARMOR"), 0, "VGPEARLARMOR_1").setUnlocalizedName("vgpearlhelm").setCreativeTab(CreativetabHandler.vgtab4);
        pearlplate = new Vgarmor(PEARLARMOR, Omega.proxy.addArmor("PEARLARMOR"), 1, "VGPEARLARMOR_1").setUnlocalizedName("vgpearlplate").setCreativeTab(CreativetabHandler.vgtab4);
        pearllegs = new Vgarmor(PEARLARMOR, Omega.proxy.addArmor("PEARLARMOR"), 2, "VGPEARLARMOR_2").setUnlocalizedName("vgpearllegs").setCreativeTab(CreativetabHandler.vgtab4);
        pearlboots = new Vgarmor(PEARLARMOR, Omega.proxy.addArmor("PEARLARMOR"), 3, "VGPEARLARMOR_1").setUnlocalizedName("vgpearlboots").setCreativeTab(CreativetabHandler.vgtab4);
        // sapphire
        sapphirehelm = new Vgarmor(SAPPHIREARMOR, Omega.proxy.addArmor("SAPPHIREARMOR"), 0, "VGSAPPHIREARMOR_1").setUnlocalizedName("vgsapphirehelm").setCreativeTab(CreativetabHandler.vgtab4);
        sapphireplate = new Vgarmor(SAPPHIREARMOR, Omega.proxy.addArmor("SAPPHIREARMOR"), 1, "VGSAPPHIREARMOR_1").setUnlocalizedName("vgsapphireplate").setCreativeTab(CreativetabHandler.vgtab4);
        sapphirelegs = new Vgarmor(SAPPHIREARMOR, Omega.proxy.addArmor("SAPPHIREARMOR"), 2, "VGSAPPHIREARMOR_2").setUnlocalizedName("vgsapphirelegs").setCreativeTab(CreativetabHandler.vgtab4);
        sapphireboots = new Vgarmor(SAPPHIREARMOR, Omega.proxy.addArmor("SAPPHIREARMOR"), 3, "VGSAPPHIREARMOR_1").setUnlocalizedName("vgsapphireboots").setCreativeTab(CreativetabHandler.vgtab4);
        // muscovite
        muscovitehelm = new Vgarmor(MUSCOVITEARMOR, Omega.proxy.addArmor("MUSCOVITEARMOR"), 0, "VGMUSCOVITEARMOR_1").setUnlocalizedName("vgmuscovitehelm").setCreativeTab(CreativetabHandler.vgtab4);
        muscoviteplate = new Vgarmor(MUSCOVITEARMOR, Omega.proxy.addArmor("MUSCOVITEARMOR"), 1, "VGMUSCOVITEARMOR_1").setUnlocalizedName("vgmuscoviteplate").setCreativeTab(CreativetabHandler.vgtab4);
        muscovitelegs = new Vgarmor(MUSCOVITEARMOR, Omega.proxy.addArmor("MUSCOVITEARMOR"), 2, "VGMUSCOVITEARMOR_2").setUnlocalizedName("vgmuscovitelegs").setCreativeTab(CreativetabHandler.vgtab4);
        muscoviteboots = new Vgarmor(MUSCOVITEARMOR, Omega.proxy.addArmor("MUSCOVITEARMOR"), 3, "VgMUSCOVITEARMOR_1").setUnlocalizedName("vgmuscoviteboots").setCreativeTab(CreativetabHandler.vgtab4);
        // ruby
        rubyhelm = new Vgarmor(RUBYARMOR, Omega.proxy.addArmor("RUBYARMOR"), 0, "VGRUBYARMOR_1").setUnlocalizedName("vgrubyhelm").setCreativeTab(CreativetabHandler.vgtab4);
        rubyplate = new Vgarmor(RUBYARMOR, Omega.proxy.addArmor("RUBYARMOR"), 1, "VGRUBYARMOR_1").setUnlocalizedName("vgrubyplate").setCreativeTab(CreativetabHandler.vgtab4);
        rubylegs = new Vgarmor(RUBYARMOR, Omega.proxy.addArmor("RUBYARMOR"), 2, "VGRUBYARMOR_2").setUnlocalizedName("vgrubylegs").setCreativeTab(CreativetabHandler.vgtab4);
        rubyboots = new Vgarmor(RUBYARMOR, Omega.proxy.addArmor("RUBYARMOR"), 3, "VGRUBYARMOR_1").setUnlocalizedName("vgrubyboots").setCreativeTab(CreativetabHandler.vgtab4);
        // uriotyke
        uriotykehelm = new Vgarmor(URIOTYKEARMOR, Omega.proxy.addArmor("URIOTYKEARMOR"), 0, "VGURIOTYKEARMOR_1").setUnlocalizedName("vguriotykehelm").setCreativeTab(CreativetabHandler.vgtab4);
        uriotykeplate = new Vgarmor(URIOTYKEARMOR, Omega.proxy.addArmor("URIOTYKEARMOR"), 1, "VgURIOTYKEARMOR_1").setUnlocalizedName("vguriotykeplate").setCreativeTab(CreativetabHandler.vgtab4);
        uriotykelegs = new Vgarmor(URIOTYKEARMOR, Omega.proxy.addArmor("URIOTYKEARMOR"), 2, "VGURIOTYKEARMOR_2").setUnlocalizedName("vguriotykelegs").setCreativeTab(CreativetabHandler.vgtab4);
        uriotykeboots = new Vgarmor(URIOTYKEARMOR, Omega.proxy.addArmor("URIOTYKEARMOR"), 3, "VGURIOTYKEARMOR_1").setUnlocalizedName("vguriotykeboots").setCreativeTab(CreativetabHandler.vgtab4);
        // gilder
        gilderhelm = new Vgarmor(GILDERARMOR, Omega.proxy.addArmor("GILDERARMOR"), 0, "VGGILDERARMOR_1").setUnlocalizedName("vggilderhelm").setCreativeTab(CreativetabHandler.vgtab4);
        gilderplate = new Vgarmor(GILDERARMOR, Omega.proxy.addArmor("GILDERARMOR"), 1, "VGGILDERARMOR_1").setUnlocalizedName("vggilderplate").setCreativeTab(CreativetabHandler.vgtab4);
        gilderlegs = new Vgarmor(GILDERARMOR, Omega.proxy.addArmor("GILDERARMOR"), 2, "VGGILDERARMOR_2").setUnlocalizedName("vggilderlegs").setCreativeTab(CreativetabHandler.vgtab4);
        gilderboots = new Vgarmor(GILDERARMOR, Omega.proxy.addArmor("GILDERARMOR"), 3, "VGGILDERARMOR_1").setUnlocalizedName("vggilderboots").setCreativeTab(CreativetabHandler.vgtab4);
        // selovar
        selovarhelm = new Vgarmor(SELOVARARMOR, Omega.proxy.addArmor("SELOVARARMOR"), 0, "VGSELOVARARMOR_1").setUnlocalizedName("vgselovarhelm").setCreativeTab(CreativetabHandler.vgtab4);
        selovarplate = new Vgarmor(SELOVARARMOR, Omega.proxy.addArmor("SELOVARARMOR"), 1, "VGSELOVARARMOR_1").setUnlocalizedName("vgselovarplate").setCreativeTab(CreativetabHandler.vgtab4);
        selovarlegs = new Vgarmor(SELOVARARMOR, Omega.proxy.addArmor("SELOVARARMOR"), 2, "VGSELOVARARMOR_2").setUnlocalizedName("vgselovarlegs").setCreativeTab(CreativetabHandler.vgtab4);
        selovarboots = new Vgarmor(SELOVARARMOR, Omega.proxy.addArmor("SELOVARARMOR"), 3, "VGSELOVARARMOR_1").setUnlocalizedName("vgselovarboots").setCreativeTab(CreativetabHandler.vgtab4);
        // parfilian
        parfilianhelm = new Vgarmor(PARFILIANARMOR, Omega.proxy.addArmor("PARFILIANARMOR"), 0, "VGPARFILIANARMOR_1").setUnlocalizedName("vgparfilianhelm").setCreativeTab(CreativetabHandler.vgtab4);
        parfilianplate = new Vgarmor(PARFILIANARMOR, Omega.proxy.addArmor("PARFILIANARMOR"), 1, "VGPARFILIANARMOR_1").setUnlocalizedName("vgparfilianplate").setCreativeTab(CreativetabHandler.vgtab4);
        parfilianlegs = new Vgarmor(PARFILIANARMOR, Omega.proxy.addArmor("PARFILIANARMOR"), 2, "VGPARFILIANARMOR_2").setUnlocalizedName("vgparfilianlegs").setCreativeTab(CreativetabHandler.vgtab4);
        parfilianboots = new Vgarmor(PARFILIANARMOR, Omega.proxy.addArmor("PARFILIANARMOR"), 3, "VGPARFILIANARMOR_1").setUnlocalizedName("vgparfilianboots").setCreativeTab(CreativetabHandler.vgtab4);
        // barium
        bariumhelm = new Vgarmor(BARIUMARMOR, Omega.proxy.addArmor("BARIUMARMOR"), 0, "VGBARIUMARMOR_1").setUnlocalizedName("vgbariumhelm").setCreativeTab(CreativetabHandler.vgtab4);
        bariumplate = new Vgarmor(BARIUMARMOR, Omega.proxy.addArmor("BARIUMARMOR"), 1, "VGBARIUMARMOR_1").setUnlocalizedName("vgbariumplate").setCreativeTab(CreativetabHandler.vgtab4);
        bariumlegs = new Vgarmor(BARIUMARMOR, Omega.proxy.addArmor("BARIUMARMOR"), 2, "VGBARIUMARMOR_2").setUnlocalizedName("vgbariumlegs").setCreativeTab(CreativetabHandler.vgtab4);
        bariumboots = new Vgarmor(BARIUMARMOR, Omega.proxy.addArmor("BARIUMARMOR"), 3, "VGBARIUMARMOR_1").setUnlocalizedName("vgbariumboots").setCreativeTab(CreativetabHandler.vgtab4);
        // radium
        radiumhelm = new Vgarmor(RADIUMARMOR, Omega.proxy.addArmor("RADIUMARMOR"), 0, "VGRADIUMARMOR_1").setUnlocalizedName("vgradiumhelm").setCreativeTab(CreativetabHandler.vgtab4);
        radiumplate = new Vgarmor(RADIUMARMOR, Omega.proxy.addArmor("RADIUMARMOR"), 1, "VGRADIUMARMOR_1").setUnlocalizedName("vgradiumplate").setCreativeTab(CreativetabHandler.vgtab4);
        radiumlegs = new Vgarmor(RADIUMARMOR, Omega.proxy.addArmor("RADIUMARMOR"), 2, "VGRADIUMARMOR_2").setUnlocalizedName("vgradiumlegs").setCreativeTab(CreativetabHandler.vgtab4);
        radiumboots = new Vgarmor(RADIUMARMOR, Omega.proxy.addArmor("RADIUMARMOR"), 3, "VGRADIUMARMOR_1").setUnlocalizedName("vgradiumboots").setCreativeTab(CreativetabHandler.vgtab4);
        // gallum
        gallumhelm = new Vgarmor(GALLUMARMOR, Omega.proxy.addArmor("GALLUMARMOR"), 0, "VGGALLUMARMOR_1").setUnlocalizedName("vggallumhelm").setCreativeTab(CreativetabHandler.vgtab4);
        gallumplate = new Vgarmor(GALLUMARMOR, Omega.proxy.addArmor("GALLUMARMOR"), 1, "VGGALLUMARMOR_1").setUnlocalizedName("vggallumplate").setCreativeTab(CreativetabHandler.vgtab4);
        gallumlegs = new Vgarmor(GALLUMARMOR, Omega.proxy.addArmor("GALLUMARMOR"), 2, "VGGALLUMARMOR_2").setUnlocalizedName("vggallumlegs").setCreativeTab(CreativetabHandler.vgtab4);
        gallumboots = new Vgarmor(GALLUMARMOR, Omega.proxy.addArmor("GALLUMARMOR"), 3, "VGGALLUMARMOR_1").setUnlocalizedName("vggallumboots").setCreativeTab(CreativetabHandler.vgtab4);
        // vanadium
        vanadiumhelm = new Vgarmor(VANADIUMARMOR, Omega.proxy.addArmor("VANADIUMARMOR"), 0, "VGVANADIUMARMOR_1").setUnlocalizedName("vgvanadiumhelm").setCreativeTab(CreativetabHandler.vgtab4);
        vanadiumplate = new Vgarmor(VANADIUMARMOR, Omega.proxy.addArmor("VANADIUMARMOR"), 1, "VGVANADIUMARMOR_1").setUnlocalizedName("vgvanadiumplate").setCreativeTab(CreativetabHandler.vgtab4);
        vanadiumlegs = new Vgarmor(VANADIUMARMOR, Omega.proxy.addArmor("VANADIUMARMOR"), 2, "VGVANADIUMARMOR_2").setUnlocalizedName("vgvanadiumlegs").setCreativeTab(CreativetabHandler.vgtab4);
        vanadiumboots = new Vgarmor(VANADIUMARMOR, Omega.proxy.addArmor("VANADIUMARMOR"), 3, "VGVANADIUMARMOR_1").setUnlocalizedName("vgvanadiumboots").setCreativeTab(CreativetabHandler.vgtab4);
        // scandium
        scandiumhelm = new Vgarmor(SCANDIUMARMOR, Omega.proxy.addArmor("SCANDIUMARMOR"), 0, "VGSCANDIUMARMOR_1").setUnlocalizedName("vgscandiumhelm").setCreativeTab(CreativetabHandler.vgtab4);
        scandiumplate = new Vgarmor(SCANDIUMARMOR, Omega.proxy.addArmor("SCANDIUMARMOR"), 1, "VGSCANDIUMARMOR_1").setUnlocalizedName("vgscandiumplate").setCreativeTab(CreativetabHandler.vgtab4);
        scandiumlegs = new Vgarmor(SCANDIUMARMOR, Omega.proxy.addArmor("SCANDIUMARMOR"), 2, "VGSCANDIUMARMOR_2").setUnlocalizedName("vgscandiumlegs").setCreativeTab(CreativetabHandler.vgtab4);
        scandiumboots = new Vgarmor(SCANDIUMARMOR, Omega.proxy.addArmor("SCANDIUMARMOR"), 3, "VGSCANDIUMARMOR_1").setUnlocalizedName("vgscandiumboots").setCreativeTab(CreativetabHandler.vgtab4);
        // bismuth
        bismuthhelm = new Vgarmor(BISMUTHARMOR, Omega.proxy.addArmor("BISMUTHARMOR"), 0, "VGBISMUTHARMOR_1").setUnlocalizedName("vgbismuthhelm").setCreativeTab(CreativetabHandler.vgtab4);
        bismuthplate = new Vgarmor(BISMUTHARMOR, Omega.proxy.addArmor("BISMUTHARMOR"), 1, "VGBISMUTHARMOR_1").setUnlocalizedName("vgbismuthplate").setCreativeTab(CreativetabHandler.vgtab4);
        bismuthlegs = new Vgarmor(BISMUTHARMOR, Omega.proxy.addArmor("BISMUTHARMOR"), 2, "VGBISMUTHARMOR_2").setUnlocalizedName("vgbismuthlegs").setCreativeTab(CreativetabHandler.vgtab4);
        bismuthboots = new Vgarmor(BISMUTHARMOR, Omega.proxy.addArmor("BISMUTHARMOR"), 3, "VGBISMUTHARMOR_1").setUnlocalizedName("vgbismuthboots").setCreativeTab(CreativetabHandler.vgtab4);
        // indium
        indiumhelm = new Vgarmor(INDIUMARMOR, Omega.proxy.addArmor("INDIUMARMOR"), 0, "VGINDIUMARMOR_1").setUnlocalizedName("vgindiumhelm").setCreativeTab(CreativetabHandler.vgtab4);
        indiumplate = new Vgarmor(INDIUMARMOR, Omega.proxy.addArmor("INDIUMARMOR"), 1, "VGINDIUMARMOR_1").setUnlocalizedName("vgindiumplate").setCreativeTab(CreativetabHandler.vgtab4);
        indiumlegs = new Vgarmor(INDIUMARMOR, Omega.proxy.addArmor("INDIUMARMOR"), 2, "VGINDIUMARMOR_2").setUnlocalizedName("vgindiumlegs").setCreativeTab(CreativetabHandler.vgtab4);
        indiumboots = new Vgarmor(INDIUMARMOR, Omega.proxy.addArmor("INDIUMARMOR"), 3, "VGINDIUMARMOR_1").setUnlocalizedName("vgindiumboots").setCreativeTab(CreativetabHandler.vgtab4);
        // platinum
        platinumhelm = new Vgarmor(PLATINUMARMOR, Omega.proxy.addArmor("PLATINUMARMOR"), 0, "VGPLATINUMARMOR_1").setUnlocalizedName("vgplatinumhelm").setCreativeTab(CreativetabHandler.vgtab4);
        platinumplate = new Vgarmor(PLATINUMARMOR, Omega.proxy.addArmor("PLATINUMARMOR"), 1, "VGPLATINUMARMOR_1").setUnlocalizedName("vgplatinumplate").setCreativeTab(CreativetabHandler.vgtab4);
        platinumlegs = new Vgarmor(PLATINUMARMOR, Omega.proxy.addArmor("PLATINUMARMOR"), 2, "VGPLATINUMARMOR_2").setUnlocalizedName("vgplatinumlegs").setCreativeTab(CreativetabHandler.vgtab4);
        platinumboots = new Vgarmor(PLATINUMARMOR, Omega.proxy.addArmor("PLATINUMARMOR"), 3, "VGPLATINUMARMOR_1").setUnlocalizedName("vgplatinumboots").setCreativeTab(CreativetabHandler.vgtab4);
        // darkness
        darknesshelm = new DarknessArmor(DARKNESSARMOR, Omega.proxy.addArmor("DARKNESSARMOR"), 0, "VGDARKNESSARMOR_1").setUnlocalizedName("vgdarknesshelm").setCreativeTab(CreativetabHandler.vgtab4);
        darknessplate = new DarknessArmor(DARKNESSARMOR, Omega.proxy.addArmor("DARKNESSARMOR"), 1, "VGDARKNESSARMOR_1").setUnlocalizedName("vgdarknessplate").setCreativeTab(CreativetabHandler.vgtab4);
        darknesslegs = new DarknessArmor(DARKNESSARMOR, Omega.proxy.addArmor("DARKNESSARMOR"), 2, "VGDARKNESSARMOR_2").setUnlocalizedName("vgdarknesslegs").setCreativeTab(CreativetabHandler.vgtab4);
        darknessboots = new DarknessArmor(DARKNESSARMOR, Omega.proxy.addArmor("DARKNESSARMOR"), 3, "VGDARKNESSARMOR_1").setUnlocalizedName("vgdarknessboots").setCreativeTab(CreativetabHandler.vgtab4);
        // light
        lighthelm = new LightArmor(LIGHTARMOR, Omega.proxy.addArmor("LIGHTARMOR"), 0, "VGLIGHTARMOR_1").setUnlocalizedName("vglighthelm").setCreativeTab(CreativetabHandler.vgtab4);
        lightplate = new LightArmor(LIGHTARMOR, Omega.proxy.addArmor("LIGHTARMOR"), 1, "VGLIGHTARMOR_1").setUnlocalizedName("vglightplate").setCreativeTab(CreativetabHandler.vgtab4);
        lightlegs = new LightArmor(LIGHTARMOR, Omega.proxy.addArmor("LIGHTARMOR"), 2, "VGLIGHTARMOR_2").setUnlocalizedName("vglightlegs").setCreativeTab(CreativetabHandler.vgtab4);
        lightboots = new LightArmor(LIGHTARMOR, Omega.proxy.addArmor("LIGHTARMOR"), 3, "VGLIGHTARMOR_1").setUnlocalizedName("vglightboots").setCreativeTab(CreativetabHandler.vgtab4);
        // omega
        omegahelm = new OmegaArmor(OMEGAARMOR, Omega.proxy.addArmor("OMEGAARMOR"), 0, "VGOMEGAARMOR_1").setUnlocalizedName("vgomegahelm").setCreativeTab(CreativetabHandler.vgtab4);
        omegaplate = new OmegaArmor(OMEGAARMOR, Omega.proxy.addArmor("OMEGAARMOR"), 1, "VGOMEGAARMOR_1").setUnlocalizedName("vgomegaplate").setCreativeTab(CreativetabHandler.vgtab4);
        omegalegs = new OmegaArmor(OMEGAARMOR, Omega.proxy.addArmor("OMEGAARMOR"), 2, "VGOMEGAARMOR_2").setUnlocalizedName("vgomegalegs").setCreativeTab(CreativetabHandler.vgtab4);
        omegaboots = new OmegaArmor(OMEGAARMOR, Omega.proxy.addArmor("OMEGAARMOR"), 3, "VGOMEGAARMOR_1").setUnlocalizedName("vgomegaboots").setCreativeTab(CreativetabHandler.vgtab4);
        // berionvar
        berionvarhelm = new Vgarmor(BERIONVARARMOR, Omega.proxy.addArmor("BERIONVARARMOR"), 0, "VGBERIONVARARMOR_1").setUnlocalizedName("vgberionvarhelm").setCreativeTab(CreativetabHandler.vgtab4);
        berionvarplate = new Vgarmor(BERIONVARARMOR, Omega.proxy.addArmor("BERIONVARARMOR"), 1, "VGBERIONVARARMOR_1").setUnlocalizedName("vgberionvarplate").setCreativeTab(CreativetabHandler.vgtab4);
        berionvarlegs = new Vgarmor(BERIONVARARMOR, Omega.proxy.addArmor("BERIONVARARMOR"), 2, "VGBERIONVARARMOR_2").setUnlocalizedName("vgberionvarlegs").setCreativeTab(CreativetabHandler.vgtab4);
        berionvarboots = new Vgarmor(BERIONVARARMOR, Omega.proxy.addArmor("BERIONVARARMOR"), 3, "VGBERIONVARARMOR_1").setUnlocalizedName("vgberionvarboots").setCreativeTab(CreativetabHandler.vgtab4);
        // charviole
        charviolehelm = new Vgarmor(CHARVIOLEARMOR, Omega.proxy.addArmor("CHARVIOLEARMOR"), 0, "VGCHARVIOLEARMOR_1").setUnlocalizedName("vgcharviolehelm").setCreativeTab(CreativetabHandler.vgtab4);
        charvioleplate = new Vgarmor(CHARVIOLEARMOR, Omega.proxy.addArmor("CHARVIOLEARMOR"), 1, "VGCHARVIOLEARMOR_1").setUnlocalizedName("vgcharvioleplate").setCreativeTab(CreativetabHandler.vgtab4);
        charviolelegs = new Vgarmor(CHARVIOLEARMOR, Omega.proxy.addArmor("CHARVIOLEARMOR"), 2, "VGCHARVIOLEARMOR_2").setUnlocalizedName("vgcharviolelegs").setCreativeTab(CreativetabHandler.vgtab4);
        charvioleboots = new Vgarmor(CHARVIOLEARMOR, Omega.proxy.addArmor("CHARVIOLEARMOR"), 3, "VGCHARVIOLEARMOR_1").setUnlocalizedName("vgcharvioleboots").setCreativeTab(CreativetabHandler.vgtab4);
        // firlvear
        firlvearhelm = new Vgarmor(FIRLVEARARMOR, Omega.proxy.addArmor("FIRLVEARARMOR"), 0, "VGFIRLVEARARMOR_1").setUnlocalizedName("vgfirlvearhelm").setCreativeTab(CreativetabHandler.vgtab4);
        firlvearplate = new Vgarmor(FIRLVEARARMOR, Omega.proxy.addArmor("FIRLVEARARMOR"), 1, "VGFIRLVEARARMOR_1").setUnlocalizedName("vgfirlvearplate").setCreativeTab(CreativetabHandler.vgtab4);
        firlvearlegs = new Vgarmor(FIRLVEARARMOR, Omega.proxy.addArmor("FIRLVEARARMOR"), 2, "VGFIRLVEARARMOR_2").setUnlocalizedName("vgfirlvearlegs").setCreativeTab(CreativetabHandler.vgtab4);
        firlvearboots = new Vgarmor(FIRLVEARARMOR, Omega.proxy.addArmor("FIRLVEARARMOR"), 3, "VGFIRLVEARARMOR_1").setUnlocalizedName("vgfirlvearboots").setCreativeTab(CreativetabHandler.vgtab4);
        // selmenrer
        selmenrerhelm = new Vgarmor(SELMENRERARMOR, Omega.proxy.addArmor("SELMENRERARMOR"), 0, "VGSELMENRERARMOR_1").setUnlocalizedName("vgselmenrerhelm").setCreativeTab(CreativetabHandler.vgtab4);
        selmenrerplate = new Vgarmor(SELMENRERARMOR, Omega.proxy.addArmor("SELMENRERARMOR"), 1, "VGSELMENRERARMOR_1").setUnlocalizedName("vgselmenrerplate").setCreativeTab(CreativetabHandler.vgtab4);
        selmenrerlegs = new Vgarmor(SELMENRERARMOR, Omega.proxy.addArmor("SELMENRERARMOR"), 2, "VGSELMENRERARMOR_2").setUnlocalizedName("vgselmenrerlegs").setCreativeTab(CreativetabHandler.vgtab4);
        selmenrerboots = new Vgarmor(SELMENRERARMOR, Omega.proxy.addArmor("SELMENRERARMOR"), 3, "VGSELMENRERARMOR_1").setUnlocalizedName("vgselmenrerboots").setCreativeTab(CreativetabHandler.vgtab4);
        // verilion
        verilionhelm = new Vgarmor(VERILIONARMOR, Omega.proxy.addArmor("VERILIONARMOR"), 0, "VGVERILIONARMOR_1").setUnlocalizedName("vgverilionhelm").setCreativeTab(CreativetabHandler.vgtab4);
        verilionplate = new Vgarmor(VERILIONARMOR, Omega.proxy.addArmor("VERILIONARMOR"), 1, "VGVERILIONARMOR_1").setUnlocalizedName("vgverilionplate").setCreativeTab(CreativetabHandler.vgtab4);
        verilionlegs = new Vgarmor(VERILIONARMOR, Omega.proxy.addArmor("VERILIONARMOR"), 2, "VGVERILIONARMOR_2").setUnlocalizedName("vgverilionlegs").setCreativeTab(CreativetabHandler.vgtab4);
        verilionboots = new Vgarmor(VERILIONARMOR, Omega.proxy.addArmor("VERILIONARMOR"), 3, "VGVERILIONARMOR_1").setUnlocalizedName("vgverilionboots").setCreativeTab(CreativetabHandler.vgtab4);
        // vielvor
        vielvorhelm = new Vgarmor(VIELVORARMOR, Omega.proxy.addArmor("VIELVORARMOR"), 0, "VGVIELVORARMOR_1").setUnlocalizedName("vgvielvorhelm").setCreativeTab(CreativetabHandler.vgtab4);
        vielvorplate = new Vgarmor(VIELVORARMOR, Omega.proxy.addArmor("VIELVORARMOR"), 1, "VGVIELVORARMOR_1").setUnlocalizedName("vgvielvorplate").setCreativeTab(CreativetabHandler.vgtab4);
        vielvorlegs = new Vgarmor(VIELVORARMOR, Omega.proxy.addArmor("VIELVORARMOR"), 2, "VGVIELVORARMOR_2").setUnlocalizedName("vgvielvorlegs").setCreativeTab(CreativetabHandler.vgtab4);
        vielvorboots = new Vgarmor(VIELVORARMOR, Omega.proxy.addArmor("VIELVORARMOR"), 3, "VGVIELVORARMOR_1").setUnlocalizedName("vgvielvorboots").setCreativeTab(CreativetabHandler.vgtab4);
        // Invisible armor
        invisiblehelm = new Vgarmor(INVISIBLEARMOR, Omega.proxy.addArmor("INVISIBLEARMOR"), 0, "VGINVISIBLEARMOR_1").setUnlocalizedName("vginvisiblehelm").setCreativeTab(CreativetabHandler.vgtab4);
        invisibleplate = new Vgarmor(INVISIBLEARMOR, Omega.proxy.addArmor("INVISIBLEARMOR"), 1, "VGINVISIBLEARMOR_1").setUnlocalizedName("vginvisibleplate").setCreativeTab(CreativetabHandler.vgtab4);
        invisiblelegs = new Vgarmor(INVISIBLEARMOR, Omega.proxy.addArmor("INVISIBLEARMOR"), 2, "VGINVISIBLEARMOR_2").setUnlocalizedName("vginvisiblelegs").setCreativeTab(CreativetabHandler.vgtab4);
        invisibleboots = new Vgarmor(INVISIBLEARMOR, Omega.proxy.addArmor("INVISIBLEARMOR"), 3, "VGINVISIBLEARMOR_1").setUnlocalizedName("vginvisibleboots").setCreativeTab(CreativetabHandler.vgtab4);
    }
    
    public static void registerArmor(GameRegistry register) {
        // urotark
        register.registerItem(urotarkhelm, "vgurotarkhelm");
        register.registerItem(urotarkplate, "vgurotarkplate");
        register.registerItem(urotarklegs, "vgurotarklegs");
        register.registerItem(urotarkboots, "vgurotarkboots");
        // pearl
        register.registerItem(pearlhelm, "vgpearlhelm");
        register.registerItem(pearlplate, "vgpearlplate");
        register.registerItem(pearllegs, "vgpearllegs");
        register.registerItem(pearlboots, "vgpearlboots");
        // sapphire
        register.registerItem(sapphirehelm, "vgsapphirehelm");
        register.registerItem(sapphireplate, "vgsapphireplate");
        register.registerItem(sapphirelegs, "vgsapphirelegs");
        register.registerItem(sapphireboots, "vgsapphireboots");
        // muscovite
        register.registerItem(muscovitehelm, "vgmuscovitehelm");
        register.registerItem(muscoviteplate, "vgmuscoviteplate");
        register.registerItem(muscovitelegs, "vgmuscovitelegs");
        register.registerItem(muscoviteboots, "vgmuscoviteboots");
        // ruby
        register.registerItem(rubyhelm, "vgrubyhelm");
        register.registerItem(rubyplate, "vgrubyplate");
        register.registerItem(rubylegs, "vgrubylegs");
        register.registerItem(rubyboots, "vgrubyboots");
        // uriotyke
        register.registerItem(uriotykehelm, "vguriotykehelm");
        register.registerItem(uriotykeplate, "vguriotykeplate");
        register.registerItem(uriotykelegs, "vguriotykelegs");
        register.registerItem(uriotykeboots, "vguriotykeboots");
        // gilder
        register.registerItem(gilderhelm, "vggilderhelm");
        register.registerItem(gilderplate, "vggilderplate");
        register.registerItem(gilderlegs, "vggilderlegs");
        register.registerItem(gilderboots, "vggilderboots");
        // selovar
        register.registerItem(selovarhelm, "vgselovarhelm");
        register.registerItem(selovarplate, "vgselovarplate");
        register.registerItem(selovarlegs, "vgselovarlegs");
        register.registerItem(selovarboots, "vgselovarboots");
        // parfilian
        register.registerItem(parfilianhelm, "vgparfilianhelm");
        register.registerItem(parfilianplate, "vgparfilianplate");
        register.registerItem(parfilianlegs, "vgparfilianlegs");
        register.registerItem(parfilianboots, "vgparfilianboots");
        // barium
        register.registerItem(bariumhelm, "vgbariumhelm");
        register.registerItem(bariumplate, "vgbariumplate");
        register.registerItem(bariumlegs, "vgbariumlegs");
        register.registerItem(bariumboots, "vgbariumboots");
        // radium
        register.registerItem(radiumhelm, "vgradiumhelm");
        register.registerItem(radiumplate, "vgradiumplate");
        register.registerItem(radiumlegs, "vgradiumlegs");
        register.registerItem(radiumboots, "vgradiumboots");
        // gallum
        register.registerItem(gallumhelm, "vggallumhelm");
        register.registerItem(gallumplate, "vggallumplate");
        register.registerItem(gallumlegs, "vggallumlegs");
        register.registerItem(gallumboots, "vggallumboots");
        // vanadium
        register.registerItem(vanadiumhelm, "vgvanadiumhelm");
        register.registerItem(vanadiumplate, "vgvanadiumplate");
        register.registerItem(vanadiumlegs, "vgvanadiumlegs");
        register.registerItem(vanadiumboots, "vgvanadiumboots");
        // scandium
        register.registerItem(scandiumhelm, "vgscandiumhelm");
        register.registerItem(scandiumplate, "vgscandiumplate");
        register.registerItem(scandiumlegs, "vgscandiumlegs");
        register.registerItem(scandiumboots, "vgscandiumboots");
        // bismuth
        register.registerItem(bismuthhelm, "vgbismuthhelm");
        register.registerItem(bismuthplate, "vgbismuthplate");
        register.registerItem(bismuthlegs, "vgbismuthlegs");
        register.registerItem(bismuthboots, "vgbismuthboots");
        // indium
        register.registerItem(indiumhelm, "vgindiumhelm");
        register.registerItem(indiumplate, "vgindiumplate");
        register.registerItem(indiumlegs, "vgindiumlegs");
        register.registerItem(indiumboots, "vgindiumboots");
        // platinum
        register.registerItem(platinumhelm, "vgplatinumhelm");
        register.registerItem(platinumplate, "vgplatinumplate");
        register.registerItem(platinumlegs, "vgplatinumlegs");
        register.registerItem(platinumboots, "vgplatinumboots");
        // darkness
        register.registerItem(darknesshelm, "vgdarknesshelm");
        register.registerItem(darknessplate, "vgdarknessplate");
        register.registerItem(darknesslegs, "vgdarknesslegs");
        register.registerItem(darknessboots, "vgdarknessboots");
        // light
        register.registerItem(lighthelm, "vglighthelm");
        register.registerItem(lightplate, "vglightplate");
        register.registerItem(lightlegs, "vglightlegs");
        register.registerItem(lightboots, "vglightboots");
        // omega
        register.registerItem(omegahelm, "vgomegahelm");
        register.registerItem(omegaplate, "vgomegaplate");
        register.registerItem(omegalegs, "vgomegalegs");
        register.registerItem(omegaboots, "vgomegaboots");
        // berionvar
        register.registerItem(berionvarhelm, "vgberionvarhelm");
        register.registerItem(berionvarplate, "vgberionvarplate");
        register.registerItem(berionvarlegs, "vgberionvarlegs");
        register.registerItem(berionvarboots, "vgberionvarboots");
        // charviole
        register.registerItem(charviolehelm, "vgcharviolehelm");
        register.registerItem(charvioleplate, "vgcharvioleplate");
        register.registerItem(charviolelegs, "vgcharviolelegs");
        register.registerItem(charvioleboots, "vgcharvioleboots");
        // firlvear
        register.registerItem(firlvearhelm, "vgfirlvearhelm");
        register.registerItem(firlvearplate, "vgfirlvearplate");
        register.registerItem(firlvearlegs, "vgfirlvearlegs");
        register.registerItem(firlvearboots, "vgfirlvearboots");
        // selmenrer
        register.registerItem(selmenrerhelm, "vgselmenrerhelm");
        register.registerItem(selmenrerplate, "vgselmenrerplate");
        register.registerItem(selmenrerlegs, "vgselmenrerlegs");
        register.registerItem(selmenrerboots, "vgselmenrerboots");
        // verilion
        register.registerItem(verilionhelm, "vgverilionhelm");
        register.registerItem(verilionplate, "vgverilionplate");
        register.registerItem(verilionlegs, "vgverilionlegs");
        register.registerItem(verilionboots, "vgverilionboots");
        // vielvor
        register.registerItem(vielvorhelm, "vgvielvorhelm");
        register.registerItem(vielvorplate, "vgvielvorplate");
        register.registerItem(vielvorlegs, "vgvielvorlegs");
        register.registerItem(vielvorboots, "vgvielvorboots");
        // invisible
        register.registerItem(invisiblehelm, "vginvisiblehelm");
        register.registerItem(invisibleplate, "vginvisibleplate");
        register.registerItem(invisiblelegs, "vginvisiblelegs");
        register.registerItem(invisibleboots, "vginvisibleboots");
    }
    
}
