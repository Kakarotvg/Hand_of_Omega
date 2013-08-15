package kakarotvg.omega.armor;

import kakarotvg.omega.CreativetabHandler;
import kakarotvg.omega.IDHandler;
import kakarotvg.omega.Omega;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

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

    // urotark
    public static EnumArmorMaterial UROTARKARMOR = EnumHelper.addArmorMaterial("UROTARKARMOR", 600, new int[] { 6, 11, 9, 6 }, 10);
    // pearl
    public static EnumArmorMaterial PEARLARMOR = EnumHelper.addArmorMaterial("PEARLARMOR", 700, new int[] { 7, 12, 10, 7 }, 10);
    // sapphire
    public static EnumArmorMaterial SAPPHIREARMOR = EnumHelper.addArmorMaterial("SAPPHIREARMOR", 800, new int[] { 8, 13, 11, 8 }, 10);
    // muscovite
    public static EnumArmorMaterial MUSCOVITEARMOR = EnumHelper.addArmorMaterial("MUSCOVITEARMOR", 900, new int[] { 9, 14, 12, 9 }, 10);
    // ruby
    public static EnumArmorMaterial RUBYARMOR = EnumHelper.addArmorMaterial("RUBYARMOR", 1000, new int[] { 10, 15, 13, 10 }, 10);
    // uriotyke
    public static EnumArmorMaterial URIOTYKEARMOR = EnumHelper.addArmorMaterial("URIOTYKEARMOR", 1100, new int[] { 11, 16, 14, 11 }, 10);
    // gilder
    public static EnumArmorMaterial GILDERARMOR = EnumHelper.addArmorMaterial("GILDERARMOR", 1200, new int[] { 12, 17, 15, 12 }, 10);
    // selovar
    public static EnumArmorMaterial SELOVARARMOR = EnumHelper.addArmorMaterial("SELOVARARMOR", 1300, new int[] { 13, 18, 16, 13 }, 10);
    // parfilian
    public static EnumArmorMaterial PARFILIANARMOR = EnumHelper.addArmorMaterial("PARFILIANARMOR", 1400, new int[] { 14, 19, 17, 14 }, 10);
    // barium
    public static EnumArmorMaterial BARIUMARMOR = EnumHelper.addArmorMaterial("BARIUMARMOR", 1500, new int[] { 15, 20, 18, 15 }, 10);
    // radium
    public static EnumArmorMaterial RADIUMARMOR = EnumHelper.addArmorMaterial("RADIUMARMOR", 1600, new int[] { 16, 21, 19, 16 }, 10);
    // gallum
    public static EnumArmorMaterial GALLUMARMOR = EnumHelper.addArmorMaterial("GALLUMARMOR", 1700, new int[] { 17, 22, 20, 17 }, 10);
    // vanadium
    public static EnumArmorMaterial VANADIUMARMOR = EnumHelper.addArmorMaterial("VANADIUMARMOR", 1800, new int[] { 18, 23, 21, 18 }, 10);
    // scandium
    public static EnumArmorMaterial SCANDIUMARMOR = EnumHelper.addArmorMaterial("SCANDIUMARMOR", 1900, new int[] { 19, 24, 22, 19 }, 10);
    // bismuth
    public static EnumArmorMaterial BISMUTHARMOR = EnumHelper.addArmorMaterial("BISMUTHARMOR", 2000, new int[] { 20, 25, 23, 20 }, 10);
    // indium
    public static EnumArmorMaterial INDIUMARMOR = EnumHelper.addArmorMaterial("INDIUMARMOR", 2100, new int[] { 21, 26, 24, 21 }, 10);
    // platinum
    public static EnumArmorMaterial PLATINUMARMOR = EnumHelper.addArmorMaterial("PLATINUMARMOR", 2200, new int[] { 22, 27, 25, 22 }, 10);
    // darkness
    public static EnumArmorMaterial DARKNESSARMOR = EnumHelper.addArmorMaterial("DARKNESSARMOR", 3000, new int[] { 35, 40, 38, 35 }, 10);
    // light
    public static EnumArmorMaterial LIGHTARMOR = EnumHelper.addArmorMaterial("LIGHTARMOR", 3000, new int[] { 35, 40, 38, 35 }, 10);
    // omega
    public static EnumArmorMaterial OMEGAARMOR = EnumHelper.addArmorMaterial("OMEGAARMOR", 3500, new int[] { 40, 45, 43, 40 }, 10);
    // berionvar
    public static EnumArmorMaterial BERIONVARARMOR = EnumHelper.addArmorMaterial("BERIONVARARMOR", 2300, new int[] { 23, 28, 26, 23 }, 10);
    // charviole
    public static EnumArmorMaterial CHARVIOLEARMOR = EnumHelper.addArmorMaterial("CHARVIOLEARMOR", 2400, new int[] { 24, 29, 27, 24 }, 10);
    // firlvear
    public static EnumArmorMaterial FIRLVEARARMOR = EnumHelper.addArmorMaterial("FIRLVEARARMOR", 2500, new int[] { 25, 30, 28, 25 }, 10);
    // selmenrer
    public static EnumArmorMaterial SELMENRERARMOR = EnumHelper.addArmorMaterial("SELMENRERARMOR", 2600, new int[] { 26, 31, 29, 26 }, 10);
    // verilion
    public static EnumArmorMaterial VERILIONARMOR = EnumHelper.addArmorMaterial("VERILIONARMOR", 2700, new int[] { 27, 32, 30, 27 }, 10);
    // vielvor
    public static EnumArmorMaterial VIELVORARMOR = EnumHelper.addArmorMaterial("VIELVORARMOR", 2800, new int[] { 28, 33, 31, 28 }, 10);

    public static void configreArmor(Configuration config) {
        // urotark
        urotarkhelm = new Vgarmor(IDHandler.urotarkhelmID, UROTARKARMOR, Omega.proxy.addArmor("UROTARKARMOR"), 0, "UROTARKARMOR_1").setUnlocalizedName("urotarkhelm").setCreativeTab(CreativetabHandler.vgtab4);
        urotarkplate = new Vgarmor(IDHandler.urotarkplateID, UROTARKARMOR, Omega.proxy.addArmor("UROTARKARMOR"), 1, "UROTARKARMOR_1").setUnlocalizedName("urotarkplate").setCreativeTab(CreativetabHandler.vgtab4);
        urotarklegs = new Vgarmor(IDHandler.urotarklegsID, UROTARKARMOR, Omega.proxy.addArmor("UROTARKARMOR"), 2, "UROTARKARMOR_2").setUnlocalizedName("urotarklegs").setCreativeTab(CreativetabHandler.vgtab4);
        urotarkboots = new Vgarmor(IDHandler.urotarkbootsID, UROTARKARMOR, Omega.proxy.addArmor("UROTARKARMOR"), 3, "UROTARKARMOR_1").setUnlocalizedName("urotarkboots").setCreativeTab(CreativetabHandler.vgtab4);
        // pearl
        pearlhelm = new Vgarmor(IDHandler.pearlhelmID, PEARLARMOR, Omega.proxy.addArmor("PEARLARMOR"), 0, "PEARLARMOR_1").setUnlocalizedName("pearlhelm").setCreativeTab(CreativetabHandler.vgtab4);
        pearlplate = new Vgarmor(IDHandler.pearlplateID, PEARLARMOR, Omega.proxy.addArmor("PEARLARMOR"), 1, "PEARLARMOR_1").setUnlocalizedName("pearlplate").setCreativeTab(CreativetabHandler.vgtab4);
        pearllegs = new Vgarmor(IDHandler.pearllegsID, PEARLARMOR, Omega.proxy.addArmor("PEARLARMOR"), 2, "PEARLARMOR_2").setUnlocalizedName("pearllegs").setCreativeTab(CreativetabHandler.vgtab4);
        pearlboots = new Vgarmor(IDHandler.pearlbootsID, PEARLARMOR, Omega.proxy.addArmor("PEARLARMOR"), 3, "PEARLARMOR_1").setUnlocalizedName("pearlboots").setCreativeTab(CreativetabHandler.vgtab4);
        // sapphire
        sapphirehelm = new Vgarmor(IDHandler.sapphirehelmID, SAPPHIREARMOR, Omega.proxy.addArmor("SAPPHIREARMOR"), 0, "SAPPHIREARMOR_1").setUnlocalizedName("sapphirehelm").setCreativeTab(CreativetabHandler.vgtab4);
        sapphireplate = new Vgarmor(IDHandler.sapphireplateID, SAPPHIREARMOR, Omega.proxy.addArmor("SAPPHIREARMOR"), 1, "SAPPHIREARMOR_1").setUnlocalizedName("sapphireplate").setCreativeTab(CreativetabHandler.vgtab4);
        sapphirelegs = new Vgarmor(IDHandler.sapphirelegsID, SAPPHIREARMOR, Omega.proxy.addArmor("SAPPHIREARMOR"), 2, "SAPPHIREARMOR_2").setUnlocalizedName("sapphirelegs").setCreativeTab(CreativetabHandler.vgtab4);
        sapphireboots = new Vgarmor(IDHandler.sapphirebootsID, SAPPHIREARMOR, Omega.proxy.addArmor("SAPPHIREARMOR"), 3, "SAPPHIREARMOR_1").setUnlocalizedName("sapphireboots").setCreativeTab(CreativetabHandler.vgtab4);
        // muscovite
        muscovitehelm = new Vgarmor(IDHandler.muscovitehelmID, MUSCOVITEARMOR, Omega.proxy.addArmor("MUSCOVITEARMOR"), 0, "MUSCOVITEARMOR_1").setUnlocalizedName("muscovitehelm").setCreativeTab(CreativetabHandler.vgtab4);
        muscoviteplate = new Vgarmor(IDHandler.muscoviteplateID, MUSCOVITEARMOR, Omega.proxy.addArmor("MUSCOVITEARMOR"), 1, "MUSCOVITEARMOR_1").setUnlocalizedName("muscoviteplate").setCreativeTab(CreativetabHandler.vgtab4);
        muscovitelegs = new Vgarmor(IDHandler.muscovitelegsID, MUSCOVITEARMOR, Omega.proxy.addArmor("MUSCOVITEARMOR"), 2, "MUSCOVITEARMOR_2").setUnlocalizedName("muscovitelegs").setCreativeTab(CreativetabHandler.vgtab4);
        muscoviteboots = new Vgarmor(IDHandler.muscovitebootsID, MUSCOVITEARMOR, Omega.proxy.addArmor("MUSCOVITEARMOR"), 3, "MUSCOVITEARMOR_1").setUnlocalizedName("muscoviteboots").setCreativeTab(CreativetabHandler.vgtab4);
        // ruby
        rubyhelm = new Vgarmor(IDHandler.rubyhelmID, RUBYARMOR, Omega.proxy.addArmor("RUBYARMOR"), 0, "RUBYARMOR_1").setUnlocalizedName("rubyhelm").setCreativeTab(CreativetabHandler.vgtab4);
        rubyplate = new Vgarmor(IDHandler.rubyplateID, RUBYARMOR, Omega.proxy.addArmor("RUBYARMOR"), 1, "RUBYARMOR_1").setUnlocalizedName("rubyplate").setCreativeTab(CreativetabHandler.vgtab4);
        rubylegs = new Vgarmor(IDHandler.rubylegsID, RUBYARMOR, Omega.proxy.addArmor("RUBYARMOR"), 2, "RUBYARMOR_2").setUnlocalizedName("rubylegs").setCreativeTab(CreativetabHandler.vgtab4);
        rubyboots = new Vgarmor(IDHandler.rubybootsID, RUBYARMOR, Omega.proxy.addArmor("RUBYARMOR"), 3, "RUBYARMOR_1").setUnlocalizedName("rubyboots").setCreativeTab(CreativetabHandler.vgtab4);
        // uriotyke
        uriotykehelm = new Vgarmor(IDHandler.uriotykehelmID, URIOTYKEARMOR, Omega.proxy.addArmor("URIOTYKEARMOR"), 0, "URIOTYKEARMOR_1").setUnlocalizedName("uriotykehelm").setCreativeTab(CreativetabHandler.vgtab4);
        uriotykeplate = new Vgarmor(IDHandler.uriotykeplateID, URIOTYKEARMOR, Omega.proxy.addArmor("URIOTYKEARMOR"), 1, "URIOTYKEARMOR_1").setUnlocalizedName("uriotykeplate").setCreativeTab(CreativetabHandler.vgtab4);
        uriotykelegs = new Vgarmor(IDHandler.uriotykelegsID, URIOTYKEARMOR, Omega.proxy.addArmor("URIOTYKEARMOR"), 2, "URIOTYKEARMOR_2").setUnlocalizedName("uriotykelegs").setCreativeTab(CreativetabHandler.vgtab4);
        uriotykeboots = new Vgarmor(IDHandler.uriotykebootsID, URIOTYKEARMOR, Omega.proxy.addArmor("URIOTYKEARMOR"), 3, "URIOTYKEARMOR_1").setUnlocalizedName("uriotykeboots").setCreativeTab(CreativetabHandler.vgtab4);
        // gilder
        gilderhelm = new Vgarmor(IDHandler.gilderhelmID, GILDERARMOR, Omega.proxy.addArmor("GILDERARMOR"), 0, "GILDERARMOR_1").setUnlocalizedName("gilderhelm").setCreativeTab(CreativetabHandler.vgtab4);
        gilderplate = new Vgarmor(IDHandler.gilderplateID, GILDERARMOR, Omega.proxy.addArmor("GILDERARMOR"), 1, "GILDERARMOR_1").setUnlocalizedName("gilderplate").setCreativeTab(CreativetabHandler.vgtab4);
        gilderlegs = new Vgarmor(IDHandler.gilderlegsID, GILDERARMOR, Omega.proxy.addArmor("GILDERARMOR"), 2, "GILDERARMOR_2").setUnlocalizedName("gilderlegs").setCreativeTab(CreativetabHandler.vgtab4);
        gilderboots = new Vgarmor(IDHandler.gilderbootsID, GILDERARMOR, Omega.proxy.addArmor("GILDERARMOR"), 3, "GILDERARMOR_1").setUnlocalizedName("gilderboots").setCreativeTab(CreativetabHandler.vgtab4);
        // selovar
        selovarhelm = new Vgarmor(IDHandler.selovarhelmID, SELOVARARMOR, Omega.proxy.addArmor("SELOVARARMOR"), 0, "SELOVARARMOR_1").setUnlocalizedName("selovarhelm").setCreativeTab(CreativetabHandler.vgtab4);
        selovarplate = new Vgarmor(IDHandler.selovarplateID, SELOVARARMOR, Omega.proxy.addArmor("SELOVARARMOR"), 1, "SELOVARARMOR_1").setUnlocalizedName("selovarplate").setCreativeTab(CreativetabHandler.vgtab4);
        selovarlegs = new Vgarmor(IDHandler.selovarlegsID, SELOVARARMOR, Omega.proxy.addArmor("SELOVARARMOR"), 2, "SELOVARARMOR_2").setUnlocalizedName("selovarlegs").setCreativeTab(CreativetabHandler.vgtab4);
        selovarboots = new Vgarmor(IDHandler.selovarbootsID, SELOVARARMOR, Omega.proxy.addArmor("SELOVARARMOR"), 3, "SELOVARARMOR_1").setUnlocalizedName("selovarboots").setCreativeTab(CreativetabHandler.vgtab4);
        // parfilian
        parfilianhelm = new Vgarmor(IDHandler.parfilianhelmID, PARFILIANARMOR, Omega.proxy.addArmor("PARFILIANARMOR"), 0, "PARFILIANARMOR_1").setUnlocalizedName("parfilianhelm").setCreativeTab(CreativetabHandler.vgtab4);
        parfilianplate = new Vgarmor(IDHandler.parfilianplateID, PARFILIANARMOR, Omega.proxy.addArmor("PARFILIANARMOR"), 1, "PARFILIANARMOR_1").setUnlocalizedName("parfilianplate").setCreativeTab(CreativetabHandler.vgtab4);
        parfilianlegs = new Vgarmor(IDHandler.parfilianlegsID, PARFILIANARMOR, Omega.proxy.addArmor("PARFILIANARMOR"), 2, "PARFILIANARMOR_2").setUnlocalizedName("parfilianlegs").setCreativeTab(CreativetabHandler.vgtab4);
        parfilianboots = new Vgarmor(IDHandler.parfilianbootsID, PARFILIANARMOR, Omega.proxy.addArmor("PARFILIANARMOR"), 3, "PARFILIANARMOR_1").setUnlocalizedName("parfilianboots").setCreativeTab(CreativetabHandler.vgtab4);
        // barium
        bariumhelm = new Vgarmor(IDHandler.bariumhelmID, BARIUMARMOR, Omega.proxy.addArmor("BARIUMARMOR"), 0, "BARIUMARMOR_1").setUnlocalizedName("bariumhelm").setCreativeTab(CreativetabHandler.vgtab4);
        bariumplate = new Vgarmor(IDHandler.bariumplateID, BARIUMARMOR, Omega.proxy.addArmor("BARIUMARMOR"), 1, "BARIUMARMOR_1").setUnlocalizedName("bariumplate").setCreativeTab(CreativetabHandler.vgtab4);
        bariumlegs = new Vgarmor(IDHandler.bariumlegsID, BARIUMARMOR, Omega.proxy.addArmor("BARIUMARMOR"), 2, "BARIUMARMOR_2").setUnlocalizedName("bariumlegs").setCreativeTab(CreativetabHandler.vgtab4);
        bariumboots = new Vgarmor(IDHandler.bariumbootsID, BARIUMARMOR, Omega.proxy.addArmor("BARIUMARMOR"), 3, "BARIUMARMOR_1").setUnlocalizedName("bariumboots").setCreativeTab(CreativetabHandler.vgtab4);
        // radium
        radiumhelm = new Vgarmor(IDHandler.radiumhelmID, RADIUMARMOR, Omega.proxy.addArmor("RADIUMARMOR"), 0, "RADIUMARMOR_1").setUnlocalizedName("radiumhelm").setCreativeTab(CreativetabHandler.vgtab4);
        radiumplate = new Vgarmor(IDHandler.radiumplateID, RADIUMARMOR, Omega.proxy.addArmor("RADIUMARMOR"), 1, "RADIUMARMOR_1").setUnlocalizedName("radiumplate").setCreativeTab(CreativetabHandler.vgtab4);
        radiumlegs = new Vgarmor(IDHandler.radiumlegsID, RADIUMARMOR, Omega.proxy.addArmor("RADIUMARMOR"), 2, "RADIUMARMOR_2").setUnlocalizedName("radiumlegs").setCreativeTab(CreativetabHandler.vgtab4);
        radiumboots = new Vgarmor(IDHandler.radiumbootsID, RADIUMARMOR, Omega.proxy.addArmor("RADIUMARMOR"), 3, "RADIUMARMOR_1").setUnlocalizedName("radiumboots").setCreativeTab(CreativetabHandler.vgtab4);
        // gallum
        gallumhelm = new Vgarmor(IDHandler.gallumhelmID, GALLUMARMOR, Omega.proxy.addArmor("GALLUMARMOR"), 0, "GALLUMARMOR_1").setUnlocalizedName("gallumhelm").setCreativeTab(CreativetabHandler.vgtab4);
        gallumplate = new Vgarmor(IDHandler.gallumplateID, GALLUMARMOR, Omega.proxy.addArmor("GALLUMARMOR"), 1, "GALLUMARMOR_1").setUnlocalizedName("gallumplate").setCreativeTab(CreativetabHandler.vgtab4);
        gallumlegs = new Vgarmor(IDHandler.gallumlegsID, GALLUMARMOR, Omega.proxy.addArmor("GALLUMARMOR"), 2, "GALLUMARMOR_2").setUnlocalizedName("gallumlegs").setCreativeTab(CreativetabHandler.vgtab4);
        gallumboots = new Vgarmor(IDHandler.gallumbootsID, GALLUMARMOR, Omega.proxy.addArmor("GALLUMARMOR"), 3, "GALLUMARMOR_1").setUnlocalizedName("gallumboots").setCreativeTab(CreativetabHandler.vgtab4);
        // vanadium
        vanadiumhelm = new Vgarmor(IDHandler.vanadiumhelmID, VANADIUMARMOR, Omega.proxy.addArmor("VANADIUMARMOR"), 0, "VANADIUMARMOR_1").setUnlocalizedName("vanadiumhelm").setCreativeTab(CreativetabHandler.vgtab4);
        vanadiumplate = new Vgarmor(IDHandler.vanadiumplateID, VANADIUMARMOR, Omega.proxy.addArmor("VANADIUMARMOR"), 1, "VANADIUMARMOR_1").setUnlocalizedName("vanadiumplate").setCreativeTab(CreativetabHandler.vgtab4);
        vanadiumlegs = new Vgarmor(IDHandler.vanadiumlegsID, VANADIUMARMOR, Omega.proxy.addArmor("VANADIUMARMOR"), 2, "VANADIUMARMOR_2").setUnlocalizedName("vanadiumlegs").setCreativeTab(CreativetabHandler.vgtab4);
        vanadiumboots = new Vgarmor(IDHandler.vanadiumbootsID, VANADIUMARMOR, Omega.proxy.addArmor("VANADIUMARMOR"), 3, "VANADIUMARMOR_1").setUnlocalizedName("vanadiumboots").setCreativeTab(CreativetabHandler.vgtab4);
        // scandium
        scandiumhelm = new Vgarmor(IDHandler.scandiumhelmID, SCANDIUMARMOR, Omega.proxy.addArmor("SCANDIUMARMOR"), 0, "SCANDIUMARMOR_1").setUnlocalizedName("scandiumhelm").setCreativeTab(CreativetabHandler.vgtab4);
        scandiumplate = new Vgarmor(IDHandler.scandiumplateID, SCANDIUMARMOR, Omega.proxy.addArmor("SCANDIUMARMOR"), 1, "SCANDIUMARMOR_1").setUnlocalizedName("scandiumplate").setCreativeTab(CreativetabHandler.vgtab4);
        scandiumlegs = new Vgarmor(IDHandler.scandiumlegsID, SCANDIUMARMOR, Omega.proxy.addArmor("SCANDIUMARMOR"), 2, "SCANDIUMARMOR_2").setUnlocalizedName("scandiumlegs").setCreativeTab(CreativetabHandler.vgtab4);
        scandiumboots = new Vgarmor(IDHandler.scandiumbootsID, SCANDIUMARMOR, Omega.proxy.addArmor("SCANDIUMARMOR"), 3, "SCANDIUMARMOR_1").setUnlocalizedName("scandiumboots").setCreativeTab(CreativetabHandler.vgtab4);
        // bismuth
        bismuthhelm = new Vgarmor(IDHandler.bismuthhelmID, BISMUTHARMOR, Omega.proxy.addArmor("BISMUTHARMOR"), 0, "BISMUTHARMOR_1").setUnlocalizedName("bismuthhelm").setCreativeTab(CreativetabHandler.vgtab4);
        bismuthplate = new Vgarmor(IDHandler.bismuthplateID, BISMUTHARMOR, Omega.proxy.addArmor("BISMUTHARMOR"), 1, "BISMUTHARMOR_1").setUnlocalizedName("bismuthplate").setCreativeTab(CreativetabHandler.vgtab4);
        bismuthlegs = new Vgarmor(IDHandler.bismuthlegsID, BISMUTHARMOR, Omega.proxy.addArmor("BISMUTHARMOR"), 2, "BISMUTHARMOR_2").setUnlocalizedName("bismuthlegs").setCreativeTab(CreativetabHandler.vgtab4);
        bismuthboots = new Vgarmor(IDHandler.bismuthbootsID, BISMUTHARMOR, Omega.proxy.addArmor("BISMUTHARMOR"), 3, "BISMUTHARMOR_1").setUnlocalizedName("bismuthboots").setCreativeTab(CreativetabHandler.vgtab4);
        // indium
        indiumhelm = new Vgarmor(IDHandler.indiumhelmID, INDIUMARMOR, Omega.proxy.addArmor("INDIUMARMOR"), 0, "INDIUMARMOR_1").setUnlocalizedName("indiumhelm").setCreativeTab(CreativetabHandler.vgtab4);
        indiumplate = new Vgarmor(IDHandler.indiumplateID, INDIUMARMOR, Omega.proxy.addArmor("INDIUMARMOR"), 1, "INDIUMARMOR_1").setUnlocalizedName("indiumplate").setCreativeTab(CreativetabHandler.vgtab4);
        indiumlegs = new Vgarmor(IDHandler.indiumlegsID, INDIUMARMOR, Omega.proxy.addArmor("INDIUMARMOR"), 2, "INDIUMARMOR_2").setUnlocalizedName("indiumlegs").setCreativeTab(CreativetabHandler.vgtab4);
        indiumboots = new Vgarmor(IDHandler.indiumbootsID, INDIUMARMOR, Omega.proxy.addArmor("INDIUMARMOR"), 3, "INDIUMARMOR_1").setUnlocalizedName("indiumboots").setCreativeTab(CreativetabHandler.vgtab4);
        // platinum
        platinumhelm = new Vgarmor(IDHandler.platinumhelmID, PLATINUMARMOR, Omega.proxy.addArmor("PLATINUMARMOR"), 0, "PLATINUMARMOR_1").setUnlocalizedName("platinumhelm").setCreativeTab(CreativetabHandler.vgtab4);
        platinumplate = new Vgarmor(IDHandler.platinumplateID, PLATINUMARMOR, Omega.proxy.addArmor("PLATINUMARMOR"), 1, "PLATINUMARMOR_1").setUnlocalizedName("platinumplate").setCreativeTab(CreativetabHandler.vgtab4);
        platinumlegs = new Vgarmor(IDHandler.platinumlegsID, PLATINUMARMOR, Omega.proxy.addArmor("PLATINUMARMOR"), 2, "PLATINUMARMOR_2").setUnlocalizedName("platinumlegs").setCreativeTab(CreativetabHandler.vgtab4);
        platinumboots = new Vgarmor(IDHandler.platinumbootsID, PLATINUMARMOR, Omega.proxy.addArmor("PLATINUMARMOR"), 3, "PLATINUMARMOR_1").setUnlocalizedName("platinumboots").setCreativeTab(CreativetabHandler.vgtab4);
        // darkness
        darknesshelm = new DarknessArmor(IDHandler.darknesshelmID, DARKNESSARMOR, Omega.proxy.addArmor("DARKNESSARMOR"), 0, "DARKNESSARMOR_1").setUnlocalizedName("darknesshelm").setCreativeTab(CreativetabHandler.vgtab4);
        darknessplate = new DarknessArmor(IDHandler.darknessplateID, DARKNESSARMOR, Omega.proxy.addArmor("DARKNESSARMOR"), 1, "DARKNESSARMOR_1").setUnlocalizedName("darknessplate").setCreativeTab(CreativetabHandler.vgtab4);
        darknesslegs = new DarknessArmor(IDHandler.darknesslegsID, DARKNESSARMOR, Omega.proxy.addArmor("DARKNESSARMOR"), 2, "DARKNESSARMOR_2").setUnlocalizedName("darknesslegs").setCreativeTab(CreativetabHandler.vgtab4);
        darknessboots = new DarknessArmor(IDHandler.darknessbootsID, DARKNESSARMOR, Omega.proxy.addArmor("DARKNESSARMOR"), 3, "DARKNESSARMOR_1").setUnlocalizedName("darknessboots").setCreativeTab(CreativetabHandler.vgtab4);
        // light
        lighthelm = new LightArmor(IDHandler.lighthelmID, LIGHTARMOR, Omega.proxy.addArmor("LIGHTARMOR"), 0, "LIGHTARMOR_1").setUnlocalizedName("lighthelm").setCreativeTab(CreativetabHandler.vgtab4);
        lightplate = new LightArmor(IDHandler.lightplateID, LIGHTARMOR, Omega.proxy.addArmor("LIGHTARMOR"), 1, "LIGHTARMOR_1").setUnlocalizedName("lightplate").setCreativeTab(CreativetabHandler.vgtab4);
        lightlegs = new LightArmor(IDHandler.lightlegsID, LIGHTARMOR, Omega.proxy.addArmor("LIGHTARMOR"), 2, "LIGHTARMOR_2").setUnlocalizedName("lightlegs").setCreativeTab(CreativetabHandler.vgtab4);
        lightboots = new LightArmor(IDHandler.lightbootsID, LIGHTARMOR, Omega.proxy.addArmor("LIGHTARMOR"), 3, "LIGHTARMOR_1").setUnlocalizedName("lightboots").setCreativeTab(CreativetabHandler.vgtab4);
        // omega
        omegahelm = new OmegaArmor(IDHandler.omegahelmID, OMEGAARMOR, Omega.proxy.addArmor("OMEGAARMOR"), 0, "OMEGAARMOR_1").setUnlocalizedName("omegahelm").setCreativeTab(CreativetabHandler.vgtab4);
        omegaplate = new OmegaArmor(IDHandler.omegaplateID, OMEGAARMOR, Omega.proxy.addArmor("OMEGAARMOR"), 1, "OMEGAARMOR_1").setUnlocalizedName("omegaplate").setCreativeTab(CreativetabHandler.vgtab4);
        omegalegs = new OmegaArmor(IDHandler.omegalegsID, OMEGAARMOR, Omega.proxy.addArmor("OMEGAARMOR"), 2, "OMEGAARMOR_2").setUnlocalizedName("omegalegs").setCreativeTab(CreativetabHandler.vgtab4);
        omegaboots = new OmegaArmor(IDHandler.omegabootsID, OMEGAARMOR, Omega.proxy.addArmor("OMEGAARMOR"), 3, "OMEGAARMOR_1").setUnlocalizedName("omegaboots").setCreativeTab(CreativetabHandler.vgtab4);
        // berionvar
        berionvarhelm = new Vgarmor(IDHandler.berionvarhelmID, BERIONVARARMOR, Omega.proxy.addArmor("BERIONVARARMOR"), 0, "BERIONVARARMOR_1").setUnlocalizedName("berionvarhelm").setCreativeTab(CreativetabHandler.vgtab4);
        berionvarplate = new Vgarmor(IDHandler.berionvarplateID, BERIONVARARMOR, Omega.proxy.addArmor("BERIONVARARMOR"), 1, "BERIONVARARMOR_1").setUnlocalizedName("berionvarplate").setCreativeTab(CreativetabHandler.vgtab4);
        berionvarlegs = new Vgarmor(IDHandler.berionvarlegsID, BERIONVARARMOR, Omega.proxy.addArmor("BERIONVARARMOR"), 2, "BERIONVARARMOR_2").setUnlocalizedName("berionvarlegs").setCreativeTab(CreativetabHandler.vgtab4);
        berionvarboots = new Vgarmor(IDHandler.berionvarbootsID, BERIONVARARMOR, Omega.proxy.addArmor("BERIONVARARMOR"), 3, "BERIONVARARMOR_1").setUnlocalizedName("berionvarboots").setCreativeTab(CreativetabHandler.vgtab4);
        // charviole
        charviolehelm = new Vgarmor(IDHandler.charviolehelmID, CHARVIOLEARMOR, Omega.proxy.addArmor("CHARVIOLEARMOR"), 0, "CHARVIOLEARMOR_1").setUnlocalizedName("charviolehelm").setCreativeTab(CreativetabHandler.vgtab4);
        charvioleplate = new Vgarmor(IDHandler.charvioleplateID, CHARVIOLEARMOR, Omega.proxy.addArmor("CHARVIOLEARMOR"), 1, "CHARVIOLEARMOR_1").setUnlocalizedName("charvioleplate").setCreativeTab(CreativetabHandler.vgtab4);
        charviolelegs = new Vgarmor(IDHandler.charviolelegsID, CHARVIOLEARMOR, Omega.proxy.addArmor("CHARVIOLEARMOR"), 2, "CHARVIOLEARMOR_2").setUnlocalizedName("charviolelegs").setCreativeTab(CreativetabHandler.vgtab4);
        charvioleboots = new Vgarmor(IDHandler.charviolebootsID, CHARVIOLEARMOR, Omega.proxy.addArmor("CHARVIOLEARMOR"), 3, "CHARVIOLEARMOR_1").setUnlocalizedName("charvioleboots").setCreativeTab(CreativetabHandler.vgtab4);
        // firlvear
        firlvearhelm = new Vgarmor(IDHandler.firlvearhelmID, FIRLVEARARMOR, Omega.proxy.addArmor("FIRLVEARARMOR"), 0, "FIRLVEARARMOR_1").setUnlocalizedName("firlvearhelm").setCreativeTab(CreativetabHandler.vgtab4);
        firlvearplate = new Vgarmor(IDHandler.firlvearplateID, FIRLVEARARMOR, Omega.proxy.addArmor("FIRLVEARARMOR"), 1, "FIRLVEARARMOR_1").setUnlocalizedName("firlvearplate").setCreativeTab(CreativetabHandler.vgtab4);
        firlvearlegs = new Vgarmor(IDHandler.firlvearlegsID, FIRLVEARARMOR, Omega.proxy.addArmor("FIRLVEARARMOR"), 2, "FIRLVEARARMOR_2").setUnlocalizedName("firlvearlegs").setCreativeTab(CreativetabHandler.vgtab4);
        firlvearboots = new Vgarmor(IDHandler.firlvearbootsID, FIRLVEARARMOR, Omega.proxy.addArmor("FIRLVEARARMOR"), 3, "FIRLVEARARMOR_1").setUnlocalizedName("firlvearboots").setCreativeTab(CreativetabHandler.vgtab4);
        // selmenrer
        selmenrerhelm = new Vgarmor(IDHandler.selmenrerhelmID, SELMENRERARMOR, Omega.proxy.addArmor("SELMENRERARMOR"), 0, "SELMENRERARMOR_1").setUnlocalizedName("selmenrerhelm").setCreativeTab(CreativetabHandler.vgtab4);
        selmenrerplate = new Vgarmor(IDHandler.selmenrerplateID, SELMENRERARMOR, Omega.proxy.addArmor("SELMENRERARMOR"), 1, "SELMENRERARMOR_1").setUnlocalizedName("selmenrerplate").setCreativeTab(CreativetabHandler.vgtab4);
        selmenrerlegs = new Vgarmor(IDHandler.selmenrerlegsID, SELMENRERARMOR, Omega.proxy.addArmor("SELMENRERARMOR"), 2, "SELMENRERARMOR_2").setUnlocalizedName("selmenrerlegs").setCreativeTab(CreativetabHandler.vgtab4);
        selmenrerboots = new Vgarmor(IDHandler.selmenrerbootsID, SELMENRERARMOR, Omega.proxy.addArmor("SELMENRERARMOR"), 3, "SELMENRERARMOR_1").setUnlocalizedName("selmenrerboots").setCreativeTab(CreativetabHandler.vgtab4);
        // verilion
        verilionhelm = new Vgarmor(IDHandler.verilionhelmID, VERILIONARMOR, Omega.proxy.addArmor("VERILIONARMOR"), 0, "VERILIONARMOR_1").setUnlocalizedName("verilionhelm").setCreativeTab(CreativetabHandler.vgtab4);
        verilionplate = new Vgarmor(IDHandler.verilionplateID, VERILIONARMOR, Omega.proxy.addArmor("VERILIONARMOR"), 1, "VERILIONARMOR_1").setUnlocalizedName("verilionplate").setCreativeTab(CreativetabHandler.vgtab4);
        verilionlegs = new Vgarmor(IDHandler.verilionlegsID, VERILIONARMOR, Omega.proxy.addArmor("VERILIONARMOR"), 2, "VERILIONARMOR_2").setUnlocalizedName("verilionlegs").setCreativeTab(CreativetabHandler.vgtab4);
        verilionboots = new Vgarmor(IDHandler.verilionbootsID, VERILIONARMOR, Omega.proxy.addArmor("VERILIONARMOR"), 3, "VERILIONARMOR_1").setUnlocalizedName("verilionboots").setCreativeTab(CreativetabHandler.vgtab4);
        // vielvor
        vielvorhelm = new Vgarmor(IDHandler.vielvorhelmID, VIELVORARMOR, Omega.proxy.addArmor("VIELVORARMOR"), 0, "VIELVORARMOR_1").setUnlocalizedName("vielvorhelm").setCreativeTab(CreativetabHandler.vgtab4);
        vielvorplate = new Vgarmor(IDHandler.vielvorplateID, VIELVORARMOR, Omega.proxy.addArmor("VIELVORARMOR"), 1, "VIELVORARMOR_1").setUnlocalizedName("vielvorplate").setCreativeTab(CreativetabHandler.vgtab4);
        vielvorlegs = new Vgarmor(IDHandler.vielvorlegsID, VIELVORARMOR, Omega.proxy.addArmor("VIELVORARMOR"), 2, "VIELVORARMOR_2").setUnlocalizedName("vielvorlegs").setCreativeTab(CreativetabHandler.vgtab4);
        vielvorboots = new Vgarmor(IDHandler.vielvorbootsID, VIELVORARMOR, Omega.proxy.addArmor("VIELVORARMOR"), 3, "VIELVORARMOR_1").setUnlocalizedName("vielvorboots").setCreativeTab(CreativetabHandler.vgtab4);
    }

    public static void registerArmor(GameRegistry register) {
        // urotark
        register.registerItem(urotarkhelm, "urotarkhelm");
        register.registerItem(urotarkplate, "urotarkplate");
        register.registerItem(urotarklegs, "urotarklegs");
        register.registerItem(urotarkboots, "urotarkboots");
        // pearl
        register.registerItem(pearlhelm, "pearlhelm");
        register.registerItem(pearlplate, "pearlplate");
        register.registerItem(pearllegs, "pearllegs");
        register.registerItem(pearlboots, "pearlboots");
        // sapphire
        register.registerItem(sapphirehelm, "sapphirehelm");
        register.registerItem(sapphireplate, "sapphireplate");
        register.registerItem(sapphirelegs, "sapphirelegs");
        register.registerItem(sapphireboots, "sapphireboots");
        // muscovite
        register.registerItem(muscovitehelm, "muscovitehelm");
        register.registerItem(muscoviteplate, "muscoviteplate");
        register.registerItem(muscovitelegs, "muscovitelegs");
        register.registerItem(muscoviteboots, "muscoviteboots");
        // ruby
        register.registerItem(rubyhelm, "rubyhelm");
        register.registerItem(rubyplate, "rubyplate");
        register.registerItem(rubylegs, "rubylegs");
        register.registerItem(rubyboots, "rubyboots");
        // uriotyke
        register.registerItem(uriotykehelm, "uriotykehelm");
        register.registerItem(uriotykeplate, "uriotykeplate");
        register.registerItem(uriotykelegs, "uriotykelegs");
        register.registerItem(uriotykeboots, "uriotykeboots");
        // gilder
        register.registerItem(gilderhelm, "gilderhelm");
        register.registerItem(gilderplate, "gilderplate");
        register.registerItem(gilderlegs, "gilderlegs");
        register.registerItem(gilderboots, "gilderboots");
        // selovar
        register.registerItem(selovarhelm, "selovarhelm");
        register.registerItem(selovarplate, "selovarplate");
        register.registerItem(selovarlegs, "selovarlegs");
        register.registerItem(selovarboots, "selovarboots");
        // parfilian
        register.registerItem(parfilianhelm, "parfilianhelm");
        register.registerItem(parfilianplate, "parfilianplate");
        register.registerItem(parfilianlegs, "parfilianlegs");
        register.registerItem(parfilianboots, "parfilianboots");
        // barium
        register.registerItem(bariumhelm, "bariumhelm");
        register.registerItem(bariumplate, "bariumplate");
        register.registerItem(bariumlegs, "bariumlegs");
        register.registerItem(bariumboots, "bariumboots");
        // radium
        register.registerItem(radiumhelm, "radiumhelm");
        register.registerItem(radiumplate, "radiumplate");
        register.registerItem(radiumlegs, "radiumlegs");
        register.registerItem(radiumboots, "radiumboots");
        // gallum
        register.registerItem(gallumhelm, "gallumhelm");
        register.registerItem(gallumplate, "gallumplate");
        register.registerItem(gallumlegs, "gallumlegs");
        register.registerItem(gallumboots, "gallumboots");
        // vanadium
        register.registerItem(vanadiumhelm, "vanadiumhelm");
        register.registerItem(vanadiumplate, "vanadiumplate");
        register.registerItem(vanadiumlegs, "vanadiumlegs");
        register.registerItem(vanadiumboots, "vanadiumboots");
        // scandium
        register.registerItem(scandiumhelm, "scandiumhelm");
        register.registerItem(scandiumplate, "scandiumplate");
        register.registerItem(scandiumlegs, "scandiumlegs");
        register.registerItem(scandiumboots, "scandiumboots");
        // bismuth
        register.registerItem(bismuthhelm, "bismuthhelm");
        register.registerItem(bismuthplate, "bismuthplate");
        register.registerItem(bismuthlegs, "bismuthlegs");
        register.registerItem(bismuthboots, "bismuthboots");
        // indium
        register.registerItem(indiumhelm, "indiumhelm");
        register.registerItem(indiumplate, "indiumplate");
        register.registerItem(indiumlegs, "indiumlegs");
        register.registerItem(indiumboots, "indiumboots");
        // platinum
        register.registerItem(platinumhelm, "platinumhelm");
        register.registerItem(platinumplate, "platinumplate");
        register.registerItem(platinumlegs, "platinumlegs");
        register.registerItem(platinumboots, "platinumboots");
        // darkness
        register.registerItem(darknesshelm, "darknesshelm");
        register.registerItem(darknessplate, "darknessplate");
        register.registerItem(darknesslegs, "darknesslegs");
        register.registerItem(darknessboots, "darknessboots");
        // light
        register.registerItem(lighthelm, "lighthelm");
        register.registerItem(lightplate, "lightplate");
        register.registerItem(lightlegs, "lightlegs");
        register.registerItem(lightboots, "lightboots");
        // omega
        register.registerItem(omegahelm, "omegahelm");
        register.registerItem(omegaplate, "omegaplate");
        register.registerItem(omegalegs, "omegalegs");
        register.registerItem(omegaboots, "omegaboots");
        // berionvar
        register.registerItem(berionvarhelm, "berionvarhelm");
        register.registerItem(berionvarplate, "berionvarplate");
        register.registerItem(berionvarlegs, "berionvarlegs");
        register.registerItem(berionvarboots, "berionvarboots");
        // charviole
        register.registerItem(charviolehelm, "charviolehelm");
        register.registerItem(charvioleplate, "charvioleplate");
        register.registerItem(charviolelegs, "charviolelegs");
        register.registerItem(charvioleboots, "charvioleboots");
        // firlvear
        register.registerItem(firlvearhelm, "firlvearhelm");
        register.registerItem(firlvearplate, "firlvearplate");
        register.registerItem(firlvearlegs, "firlvearlegs");
        register.registerItem(firlvearboots, "firlvearboots");
        // selmenrer
        register.registerItem(selmenrerhelm, "selmenrerhelm");
        register.registerItem(selmenrerplate, "selmenrerplate");
        register.registerItem(selmenrerlegs, "selmenrerlegs");
        register.registerItem(selmenrerboots, "selmenrerboots");
        // verilion
        register.registerItem(verilionhelm, "verilionhelm");
        register.registerItem(verilionplate, "verilionplate");
        register.registerItem(verilionlegs, "verilionlegs");
        register.registerItem(verilionboots, "verilionboots");
        // vielvor
        register.registerItem(vielvorhelm, "vielvorhelm");
        register.registerItem(vielvorplate, "vielvorplate");
        register.registerItem(vielvorlegs, "vielvorlegs");
        register.registerItem(vielvorboots, "vielvorboots");
    }

    public static void setNames(LanguageRegistry register) {
        // urotark
        register.addName(urotarkhelm, "Urotark Helmet");
        register.addName(urotarkplate, "Urotark Chestplate");
        register.addName(urotarklegs, "Urotark Leggins");
        register.addName(urotarkboots, "Urotark Boots");
        // pearl
        register.addName(pearlhelm, "Pearl Helmet");
        register.addName(pearlplate, "Pearl Chestplate");
        register.addName(pearllegs, "Pearl Leggins");
        register.addName(pearlboots, "Pearl Boots");
        // sapphire
        register.addName(sapphirehelm, "Sapphire Helmet");
        register.addName(sapphireplate, "Sapphire Chestplate");
        register.addName(sapphirelegs, "Sapphire Leggins");
        register.addName(sapphireboots, "Sapphire Boots");
        // muscovite
        register.addName(muscovitehelm, "Muscovite Helmet");
        register.addName(muscoviteplate, "Muscovite Chestplate");
        register.addName(muscovitelegs, "Muscovite Leggins");
        register.addName(muscoviteboots, "Muscovite Boots");
        // ruby
        register.addName(rubyhelm, "Ruby Helmet");
        register.addName(rubyplate, "Ruby Chestplate");
        register.addName(rubylegs, "Ruby Leggins");
        register.addName(rubyboots, "Ruby Boots");
        // uriotyke
        register.addName(uriotykehelm, "Uriotyke Helmet");
        register.addName(uriotykeplate, "Uriotyke Chestplate");
        register.addName(uriotykelegs, "Uriotyke Leggins");
        register.addName(uriotykeboots, "Uriotyke Boots");
        // gilder
        register.addName(gilderhelm, "Gilder Helmet");
        register.addName(gilderplate, "Gilder Chestplate");
        register.addName(gilderlegs, "Gilder Leggins");
        register.addName(gilderboots, "Gilder Boots");
        // selovar
        register.addName(selovarhelm, "Selovar Helmet");
        register.addName(selovarplate, "Selovar Chestplate");
        register.addName(selovarlegs, "Selovar Leggins");
        register.addName(selovarboots, "Selovar Boots");
        // parfilian
        register.addName(parfilianhelm, "Parfilian Helmet");
        register.addName(parfilianplate, "Parfilian Chestplate");
        register.addName(parfilianlegs, "Parfilian Leggins");
        register.addName(parfilianboots, "Parfilian Boots");
        // barium
        register.addName(bariumhelm, "Barium Helmet");
        register.addName(bariumplate, "Barium Chestplate");
        register.addName(bariumlegs, "Barium Leggins");
        register.addName(bariumboots, "Barium Boots");
        // radium
        register.addName(radiumhelm, "Radium Helmet");
        register.addName(radiumplate, "Radium Chestplate");
        register.addName(radiumlegs, "Radium Leggins");
        register.addName(radiumboots, "Radium Boots");
        // gallum
        register.addName(gallumhelm, "Gallum Helmet");
        register.addName(gallumplate, "Gallum Chestplate");
        register.addName(gallumlegs, "Gallum Leggins");
        register.addName(gallumboots, "Gallum Boots");
        // vanadium
        register.addName(vanadiumhelm, "Vanadium Helmet");
        register.addName(vanadiumplate, "Vanadium Chestplate");
        register.addName(vanadiumlegs, "Vanadium Leggins");
        register.addName(vanadiumboots, "Vanadium Boots");
        // scandium
        register.addName(scandiumhelm, "Scandium Helmet");
        register.addName(scandiumplate, "Scandium Chestplate");
        register.addName(scandiumlegs, "Scandium Leggins");
        register.addName(scandiumboots, "Scandium Boots");
        // bismuth
        register.addName(bismuthhelm, "Bismuth Helmet");
        register.addName(bismuthplate, "Bismuth Chestplate");
        register.addName(bismuthlegs, "Bismuth Leggins");
        register.addName(bismuthboots, "Bismuth Boots");
        // indium
        register.addName(indiumhelm, "Indium Helmet");
        register.addName(indiumplate, "Indium Chestplate");
        register.addName(indiumlegs, "Indium Leggins");
        register.addName(indiumboots, "Indium Boots");
        // platinum
        register.addName(platinumhelm, "Platinum Helmet");
        register.addName(platinumplate, "Platinum Chestplate");
        register.addName(platinumlegs, "Platinum Leggins");
        register.addName(platinumboots, "Platinum Boots");
        // darkness
        register.addName(darknesshelm, "Darkness Helmet");
        register.addName(darknessplate, "Darkness Chestplate");
        register.addName(darknesslegs, "Darkness Leggins");
        register.addName(darknessboots, "Darkness Boots");
        // light
        register.addName(lighthelm, "Light Helmet");
        register.addName(lightplate, "Light Chestplate");
        register.addName(lightlegs, "Light Leggins");
        register.addName(lightboots, "Light Boots");
        // omega
        register.addName(omegahelm, "Omega Helmet");
        register.addName(omegaplate, "Omega Chestplate");
        register.addName(omegalegs, "Omega Leggins");
        register.addName(omegaboots, "Omega Boots");
        // berionvar
        register.addName(berionvarhelm, "Berionvar Helmet");
        register.addName(berionvarplate, "Berionvar Chestplate");
        register.addName(berionvarlegs, "Berionvar Leggins");
        register.addName(berionvarboots, "Berionvar Boots");
        // charviole
        register.addName(charviolehelm, "Charviole Helmet");
        register.addName(charvioleplate, "Charviole Chestplate");
        register.addName(charviolelegs, "Charviole Leggins");
        register.addName(charvioleboots, "Charviole Boots");
        // firlvear
        register.addName(firlvearhelm, "Firlvear Helmet");
        register.addName(firlvearplate, "Firlvear Chestplate");
        register.addName(firlvearlegs, "Firlvear Leggins");
        register.addName(firlvearboots, "Firlvear Boots");
        // selmenrer
        register.addName(selmenrerhelm, "Selmenrer Helmet");
        register.addName(selmenrerplate, "Selmenrer Chestplate");
        register.addName(selmenrerlegs, "Selmenrer Leggins");
        register.addName(selmenrerboots, "Selmenrer Boots");
        // verilion
        register.addName(verilionhelm, "Verilion Helmet");
        register.addName(verilionplate, "Verilion Chestplate");
        register.addName(verilionlegs, "Verilion Leggins");
        register.addName(verilionboots, "Verilion Boots");
        // vielvor
        register.addName(vielvorhelm, "Vielvor Helmet");
        register.addName(vielvorplate, "Vielvor Chestplate");
        register.addName(vielvorlegs, "Vielvor Leggins");
        register.addName(vielvorboots, "Vielvor Boots");
    }

}
