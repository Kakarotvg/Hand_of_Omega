package kakarotvg.omega.handlers.tools;

import kakarotvg.omega.handlers.creativetab.CreativetabHandler;
import kakarotvg.omega.tools.Vgaxe;
import kakarotvg.omega.tools.Vghoe;
import kakarotvg.omega.tools.Vgpickaxe;
import kakarotvg.omega.tools.Vgshovel;
import kakarotvg.omega.tools.Vgsword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ToolHandler {
    
    // urotark
    public static Item urotarkaxe;
    public static Item urotarkhoe;
    public static Item urotarkshovel;
    public static Item urotarksword;
    public static Item urotarkpickaxe;
    // pearl
    public static Item pearlaxe;
    public static Item pearlhoe;
    public static Item pearlshovel;
    public static Item pearlsword;
    public static Item pearlpickaxe;
    // sapphire
    public static Item sapphireaxe;
    public static Item sapphirehoe;
    public static Item sapphireshovel;
    public static Item sapphiresword;
    public static Item sapphirepickaxe;
    // muscovite
    public static Item muscoviteaxe;
    public static Item muscovitehoe;
    public static Item muscoviteshovel;
    public static Item muscovitesword;
    public static Item muscovitepickaxe;
    // ruby
    public static Item rubyaxe;
    public static Item rubyhoe;
    public static Item rubyshovel;
    public static Item rubysword;
    public static Item rubypickaxe;
    // uriotyke
    public static Item uriotykeaxe;
    public static Item uriotykehoe;
    public static Item uriotykeshovel;
    public static Item uriotykesword;
    public static Item uriotykepickaxe;
    // gilder
    public static Item gilderaxe;
    public static Item gilderhoe;
    public static Item gildershovel;
    public static Item gildersword;
    public static Item gilderpickaxe;
    // selovar
    public static Item selovaraxe;
    public static Item selovarhoe;
    public static Item selovarshovel;
    public static Item selovarsword;
    public static Item selovarpickaxe;
    // parfilian
    public static Item parfilianaxe;
    public static Item parfilianhoe;
    public static Item parfilianshovel;
    public static Item parfiliansword;
    public static Item parfilianpickaxe;
    // barium
    public static Item bariumaxe;
    public static Item bariumhoe;
    public static Item bariumshovel;
    public static Item bariumsword;
    public static Item bariumpickaxe;
    // radium
    public static Item radiumaxe;
    public static Item radiumhoe;
    public static Item radiumshovel;
    public static Item radiumsword;
    public static Item radiumpickaxe;
    // gallum
    public static Item gallumaxe;
    public static Item gallumhoe;
    public static Item gallumshovel;
    public static Item gallumsword;
    public static Item gallumpickaxe;
    // vanadium
    public static Item vanadiumaxe;
    public static Item vanadiumhoe;
    public static Item vanadiumshovel;
    public static Item vanadiumsword;
    public static Item vanadiumpickaxe;
    // scandium
    public static Item scandiumaxe;
    public static Item scandiumhoe;
    public static Item scandiumshovel;
    public static Item scandiumsword;
    public static Item scandiumpickaxe;
    // bismuth
    public static Item bismuthaxe;
    public static Item bismuthhoe;
    public static Item bismuthshovel;
    public static Item bismuthsword;
    public static Item bismuthpickaxe;
    // indium
    public static Item indiumaxe;
    public static Item indiumhoe;
    public static Item indiumshovel;
    public static Item indiumsword;
    public static Item indiumpickaxe;
    // platinum
    public static Item platinumaxe;
    public static Item platinumhoe;
    public static Item platinumshovel;
    public static Item platinumsword;
    public static Item platinumpickaxe;
    // darkness
    public static Item darknessaxe;
    public static Item darknesshoe;
    public static Item darknessshovel;
    public static Item darknesssword;
    public static Item darknesspickaxe;
    // light
    public static Item lightaxe;
    public static Item lighthoe;
    public static Item lightshovel;
    public static Item lightsword;
    public static Item lightpickaxe;
    // omega
    public static Item omegaaxe;
    public static Item omegahoe;
    public static Item omegashovel;
    public static Item omegasword;
    public static Item omegahand;
    public static Item omegapickaxe;
    // bubble
    public static Item bubblesword;
    // Berionvar
    public static Item berionvaraxe;
    public static Item berionvarhoe;
    public static Item berionvarshovel;
    public static Item berionvarsword;
    public static Item berionvarpickaxe;
    // Charviole
    public static Item charvioleaxe;
    public static Item charviolehoe;
    public static Item charvioleshovel;
    public static Item charviolesword;
    public static Item charviolepickaxe;
    // Firlvear
    public static Item firlvearaxe;
    public static Item firlvearhoe;
    public static Item firlvearshovel;
    public static Item firlvearsword;
    public static Item firlvearpickaxe;
    // selmenrer
    public static Item selmenreraxe;
    public static Item selmenrerhoe;
    public static Item selmenrershovel;
    public static Item selmenrersword;
    public static Item selmenrerpickaxe;
    // verilion
    public static Item verilionaxe;
    public static Item verilionhoe;
    public static Item verilionshovel;
    public static Item verilionsword;
    public static Item verilionpickaxe;
    // vielvor
    public static Item vielvoraxe;
    public static Item vielvorhoe;
    public static Item vielvorshovel;
    public static Item vielvorsword;
    public static Item vielvorpickaxe;
    // invisible
    public static Item invisibledagger;
    
    // urotark
    public static ToolMaterial UROTARKTOOLS = EnumHelper.addToolMaterial("UROTARK TOOLS", 4, 2000, 12, 8, 10);
    public static ToolMaterial UROTARKSWORD = EnumHelper.addToolMaterial("UROTARKSWORD", 4, 2000, 12, 10, 10);
    // pearl
    public static ToolMaterial PEARLTOOLS = EnumHelper.addToolMaterial("PEARL TOOLS", 4, 2100, 13, 10, 10);
    public static ToolMaterial PEARLSWORD = EnumHelper.addToolMaterial("PEARLSWORD", 4, 2100, 13, 12, 10);
    // sapphire
    public static ToolMaterial SAPPHIRETOOLS = EnumHelper.addToolMaterial("SAPPHIRE TOOLS", 4, 2200, 14, 12, 10);
    public static ToolMaterial SAPPHIRESWORD = EnumHelper.addToolMaterial("SAPPHIRESWORD", 4, 2200, 14, 14, 10);
    // muscovite
    public static ToolMaterial MUSCOVITETOOLS = EnumHelper.addToolMaterial("MUSCOVITE TOOLS", 5, 2300, 15, 14, 10);
    public static ToolMaterial MUSCOVITESWORD = EnumHelper.addToolMaterial("MUSCOVITESWORD", 5, 2300, 15, 16, 10);
    // ruby
    public static ToolMaterial RUBYTOOLS = EnumHelper.addToolMaterial("RUBY TOOLS", 5, 2400, 16, 16, 10);
    public static ToolMaterial RUBYSWORD = EnumHelper.addToolMaterial("RUBYSWORD", 5, 2400, 16, 18, 10);
    // uriotyke
    public static ToolMaterial URIOTYKETOOLS = EnumHelper.addToolMaterial("URIOTYKE TOOLS", 5, 2500, 17, 18, 10);
    public static ToolMaterial URIOTYKESWORD = EnumHelper.addToolMaterial("URIOTYKESWORD", 5, 2500, 17, 20, 10);
    // gilder
    public static ToolMaterial GILDERTOOLS = EnumHelper.addToolMaterial("GILDER TOOLS", 6, 2600, 18, 20, 10);
    public static ToolMaterial GILDERSWORD = EnumHelper.addToolMaterial("GILDERSWORD", 6, 2600, 18, 22, 10);
    // selovar
    public static ToolMaterial SELOVARTOOLS = EnumHelper.addToolMaterial("SELOVAR TOOLS", 6, 2700, 18, 22, 10);
    public static ToolMaterial SELOVARSWORD = EnumHelper.addToolMaterial("SELOVARSWORD", 6, 2700, 18, 24, 10);
    // parfilian
    public static ToolMaterial PARFILIANTOOLS = EnumHelper.addToolMaterial("PARFILIAN TOOLS", 6, 2800, 18, 24, 10);
    public static ToolMaterial PARFILIANSWORD = EnumHelper.addToolMaterial("PARFILIANSWORD", 6, 2800, 18, 26, 10);
    // barium
    public static ToolMaterial BARIUMTOOLS = EnumHelper.addToolMaterial("BARIUM TOOLS", 7, 2900, 19, 26, 10);
    public static ToolMaterial BARIUMSWORD = EnumHelper.addToolMaterial("BARIUMSWORD", 7, 2900, 19, 28, 10);
    // radium
    public static ToolMaterial RADIUMTOOLS = EnumHelper.addToolMaterial("RADIUM TOOLS", 7, 3000, 20, 28, 10);
    public static ToolMaterial RADIUMSWORD = EnumHelper.addToolMaterial("RADIUMSWORD", 7, 3000, 20, 30, 10);
    // gallum
    public static ToolMaterial GALLUMTOOLS = EnumHelper.addToolMaterial("GALLUM TOOLS", 7, 3100, 21, 30, 10);
    public static ToolMaterial GALLUMSWORD = EnumHelper.addToolMaterial("GALLUMSWORD", 7, 3100, 21, 32, 10);
    // vanadium
    public static ToolMaterial VANADIUMTOOLS = EnumHelper.addToolMaterial("VANADIUM TOOLS", 8, 3200, 22, 32, 10);
    public static ToolMaterial VANADIUMSWORD = EnumHelper.addToolMaterial("VANADIUMSWORD", 8, 3200, 22, 34, 10);
    // scandium
    public static ToolMaterial SCANDIUMTOOLS = EnumHelper.addToolMaterial("SCANDIUM TOOLS", 8, 3300, 23, 34, 10);
    public static ToolMaterial SCANDIUMSWORD = EnumHelper.addToolMaterial("SCANDIUMSWORD", 8, 3300, 23, 36, 10);
    // bismuth
    public static ToolMaterial BISMUTHTOOLS = EnumHelper.addToolMaterial("BISMUTH TOOLS", 9, 3400, 24, 36, 10);
    public static ToolMaterial BISMUTHSWORD = EnumHelper.addToolMaterial("BISMUTHSWORD", 9, 3400, 24, 38, 10);
    // indium
    public static ToolMaterial INDIUMTOOLS = EnumHelper.addToolMaterial("INDIUM TOOLS", 9, 3500, 25, 38, 10);
    public static ToolMaterial INDIUMSWORD = EnumHelper.addToolMaterial("INDIUMSWORD", 9, 3500, 25, 40, 10);
    // platinum
    public static ToolMaterial PLATINUMTOOLS = EnumHelper.addToolMaterial("PLATINUM TOOLS", 10, 3600, 26, 40, 10);
    public static ToolMaterial PLATINUMSWORD = EnumHelper.addToolMaterial("PLATINUMSWORD", 10, 3600, 26, 42, 10);
    // darkness
    public static ToolMaterial DARKNESSTOOLS = EnumHelper.addToolMaterial("DARKNESS TOOLS", 20, 5000, 40, 65, 10);
    public static ToolMaterial DARKNESSSWORD = EnumHelper.addToolMaterial("DARKNESSSWORD", 20, 5000, 40, 65, 10);
    // light
    public static ToolMaterial LIGHTTOOLS = EnumHelper.addToolMaterial("LIGHT TOOLS", 20, 5000, 40, 65, 10);
    public static ToolMaterial LIGHTSWORD = EnumHelper.addToolMaterial("LIGHTSWORD", 20, 5000, 40, 65, 10);
    // omega
    public static ToolMaterial OMEGATOOLS = EnumHelper.addToolMaterial("OMEGA TOOLS", 25, 6000, 50, 75, 10);
    public static ToolMaterial OMEGASWORD = EnumHelper.addToolMaterial("OMEGASWORD", 25, 6000, 50, 75, 10);
    // bubble
    public static ToolMaterial BUBBLESWORD = EnumHelper.addToolMaterial("BUBBLESWORD", 3, 400, 3, 3, 10);
    // Berionvar
    public static ToolMaterial BERIONVARTOOLS = EnumHelper.addToolMaterial("BERIONVAR TOOLS", 11, 3700, 27, 44, 10);
    public static ToolMaterial BERIONVARSWORD = EnumHelper.addToolMaterial("BERIONVARSWORD", 11, 3700, 27, 46, 10);
    // Charviole
    public static ToolMaterial CHARVIOLETOOLS = EnumHelper.addToolMaterial("CHARVIOLE TOOLS", 12, 3800, 28, 46, 10);
    public static ToolMaterial CHARVIOLESWORD = EnumHelper.addToolMaterial("CHARVIOLESWORD", 12, 3800, 28, 48, 10);
    // Firlvear
    public static ToolMaterial FIRLVEARTOOLS = EnumHelper.addToolMaterial("FIRLVEAR TOOLS", 13, 3900, 29, 48, 10);
    public static ToolMaterial FIRLVEARSWORD = EnumHelper.addToolMaterial("FIRLVEARSWORD", 13, 3900, 29, 50, 10);
    // selmenrer
    public static ToolMaterial SELMENRERTOOLS = EnumHelper.addToolMaterial("SELMENRER TOOLS", 14, 4000, 30, 50, 10);
    public static ToolMaterial SELMENRERSWORD = EnumHelper.addToolMaterial("SELMENRERSWORD", 14, 4000, 30, 52, 10);
    // verilion
    public static ToolMaterial VERILIONTOOLS = EnumHelper.addToolMaterial("VERILION TOOLS", 15, 4100, 31, 52, 10);
    public static ToolMaterial VERILIONSWORD = EnumHelper.addToolMaterial("VERILIONSWORD", 15, 4100, 31, 54, 10);
    // vielvor
    public static ToolMaterial VIELVORTOOLS = EnumHelper.addToolMaterial("VIELVOR TOOLS", 16, 4200, 32, 54, 10);
    public static ToolMaterial VIELVORSWORD = EnumHelper.addToolMaterial("VIELVORSWORD", 16, 4200, 32, 56, 10);
    // invisble
    public static ToolMaterial INVISIBLESWORD = EnumHelper.addToolMaterial("INVISIBLESWORD", 20, 5000, 40, 65, 10);
    
    public static void configureTools() {
        // urotark
        urotarkaxe = new Vgaxe(UROTARKTOOLS).setUnlocalizedName("urotarkaxe").setCreativeTab(CreativetabHandler.vgtab3);
        urotarkhoe = new Vghoe(UROTARKTOOLS).setUnlocalizedName("urotarkhoe").setCreativeTab(CreativetabHandler.vgtab3);
        urotarkshovel = new Vgshovel(UROTARKTOOLS).setUnlocalizedName("urotarkshovel").setCreativeTab(CreativetabHandler.vgtab3);
        urotarksword = new Vgsword(UROTARKSWORD).setUnlocalizedName("urotarksword").setCreativeTab(CreativetabHandler.vgtab4);
        urotarkpickaxe = new Vgpickaxe(UROTARKTOOLS).setUnlocalizedName("urotarkpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // pearl
        pearlaxe = new Vgaxe(PEARLTOOLS).setUnlocalizedName("pearlaxe").setCreativeTab(CreativetabHandler.vgtab3);
        pearlhoe = new Vghoe(PEARLTOOLS).setUnlocalizedName("pearlhoe").setCreativeTab(CreativetabHandler.vgtab3);
        pearlshovel = new Vgshovel(PEARLTOOLS).setUnlocalizedName("pearlshovel").setCreativeTab(CreativetabHandler.vgtab3);
        pearlsword = new Vgsword(PEARLSWORD).setUnlocalizedName("pearlsword").setCreativeTab(CreativetabHandler.vgtab4);
        pearlpickaxe = new Vgpickaxe(PEARLTOOLS).setUnlocalizedName("pearlpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // sapphire
        sapphireaxe = new Vgaxe(SAPPHIRETOOLS).setUnlocalizedName("sapphireaxe").setCreativeTab(CreativetabHandler.vgtab3);
        sapphirehoe = new Vghoe(SAPPHIRETOOLS).setUnlocalizedName("sapphirehoe").setCreativeTab(CreativetabHandler.vgtab3);
        sapphireshovel = new Vgshovel(SAPPHIRETOOLS).setUnlocalizedName("sapphireshovel").setCreativeTab(CreativetabHandler.vgtab3);
        sapphiresword = new Vgsword(SAPPHIRESWORD).setUnlocalizedName("sapphiresword").setCreativeTab(CreativetabHandler.vgtab4);
        sapphirepickaxe = new Vgpickaxe(SAPPHIRETOOLS).setUnlocalizedName("sapphirepickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // muscovite
        muscoviteaxe = new Vgaxe(MUSCOVITETOOLS).setUnlocalizedName("muscoviteaxe").setCreativeTab(CreativetabHandler.vgtab3);
        muscovitehoe = new Vghoe(MUSCOVITETOOLS).setUnlocalizedName("muscovitehoe").setCreativeTab(CreativetabHandler.vgtab3);
        muscoviteshovel = new Vgshovel(MUSCOVITETOOLS).setUnlocalizedName("muscoviteshovel").setCreativeTab(CreativetabHandler.vgtab3);
        muscovitesword = new Vgsword(MUSCOVITESWORD).setUnlocalizedName("muscovitesword").setCreativeTab(CreativetabHandler.vgtab4);
        muscovitepickaxe = new Vgpickaxe(MUSCOVITETOOLS).setUnlocalizedName("muscovitepickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // ruby
        rubyaxe = new Vgaxe(RUBYTOOLS).setUnlocalizedName("rubyaxe").setCreativeTab(CreativetabHandler.vgtab3);
        rubyhoe = new Vghoe(RUBYTOOLS).setUnlocalizedName("rubyhoe").setCreativeTab(CreativetabHandler.vgtab3);
        rubyshovel = new Vgshovel(RUBYTOOLS).setUnlocalizedName("rubyshovel").setCreativeTab(CreativetabHandler.vgtab3);
        rubysword = new Vgsword(RUBYSWORD).setUnlocalizedName("rubysword").setCreativeTab(CreativetabHandler.vgtab4);
        rubypickaxe = new Vgpickaxe(RUBYTOOLS).setUnlocalizedName("rubypickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // uriotyke
        uriotykeaxe = new Vgaxe(URIOTYKETOOLS).setUnlocalizedName("uriotykeaxe").setCreativeTab(CreativetabHandler.vgtab3);
        uriotykehoe = new Vghoe(URIOTYKETOOLS).setUnlocalizedName("uriotykehoe").setCreativeTab(CreativetabHandler.vgtab3);
        uriotykeshovel = new Vgshovel(URIOTYKETOOLS).setUnlocalizedName("uriotykeshovel").setCreativeTab(CreativetabHandler.vgtab3);
        uriotykesword = new Vgsword(URIOTYKESWORD).setUnlocalizedName("uriotykesword").setCreativeTab(CreativetabHandler.vgtab4);
        uriotykepickaxe = new Vgpickaxe(URIOTYKETOOLS).setUnlocalizedName("uriotykepickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // gilder
        gilderaxe = new Vgaxe(GILDERTOOLS).setUnlocalizedName("gilderaxe").setCreativeTab(CreativetabHandler.vgtab3);
        gilderhoe = new Vghoe(GILDERTOOLS).setUnlocalizedName("gilderhoe").setCreativeTab(CreativetabHandler.vgtab3);
        gildershovel = new Vgshovel(GILDERTOOLS).setUnlocalizedName("gildershovel").setCreativeTab(CreativetabHandler.vgtab3);
        gildersword = new Vgsword(GILDERSWORD).setUnlocalizedName("gildersword").setCreativeTab(CreativetabHandler.vgtab4);
        gilderpickaxe = new Vgpickaxe(GILDERTOOLS).setUnlocalizedName("gilderpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // selovar
        selovaraxe = new Vgaxe(SELOVARTOOLS).setUnlocalizedName("selovaraxe").setCreativeTab(CreativetabHandler.vgtab3);
        selovarhoe = new Vghoe(SELOVARTOOLS).setUnlocalizedName("selovarhoe").setCreativeTab(CreativetabHandler.vgtab3);
        selovarshovel = new Vgshovel(SELOVARTOOLS).setUnlocalizedName("selovarshovel").setCreativeTab(CreativetabHandler.vgtab3);
        selovarsword = new Vgsword(SELOVARSWORD).setUnlocalizedName("selovarsword").setCreativeTab(CreativetabHandler.vgtab4);
        selovarpickaxe = new Vgpickaxe(SELOVARTOOLS).setUnlocalizedName("selovarpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // parfilian
        parfilianaxe = new Vgaxe(PARFILIANTOOLS).setUnlocalizedName("parfilianaxe").setCreativeTab(CreativetabHandler.vgtab3);
        parfilianhoe = new Vghoe(PARFILIANTOOLS).setUnlocalizedName("parfilianhoe").setCreativeTab(CreativetabHandler.vgtab3);
        parfilianshovel = new Vgshovel(PARFILIANTOOLS).setUnlocalizedName("parfilianshovel").setCreativeTab(CreativetabHandler.vgtab3);
        parfiliansword = new Vgsword(PARFILIANSWORD).setUnlocalizedName("parfiliansword").setCreativeTab(CreativetabHandler.vgtab4);
        parfilianpickaxe = new Vgpickaxe(PARFILIANTOOLS).setUnlocalizedName("parfilianpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // barium
        bariumaxe = new Vgaxe(BARIUMTOOLS).setUnlocalizedName("bariumaxe").setCreativeTab(CreativetabHandler.vgtab3);
        bariumhoe = new Vghoe(BARIUMTOOLS).setUnlocalizedName("bariumhoe").setCreativeTab(CreativetabHandler.vgtab3);
        bariumshovel = new Vgshovel(BARIUMTOOLS).setUnlocalizedName("bariumshovel").setCreativeTab(CreativetabHandler.vgtab3);
        bariumsword = new Vgsword(BARIUMSWORD).setUnlocalizedName("bariumsword").setCreativeTab(CreativetabHandler.vgtab4);
        bariumpickaxe = new Vgpickaxe(BARIUMTOOLS).setUnlocalizedName("bariumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // radium
        radiumaxe = new Vgaxe(RADIUMTOOLS).setUnlocalizedName("radiumaxe").setCreativeTab(CreativetabHandler.vgtab3);
        radiumhoe = new Vghoe(RADIUMTOOLS).setUnlocalizedName("radiumhoe").setCreativeTab(CreativetabHandler.vgtab3);
        radiumshovel = new Vgshovel(RADIUMTOOLS).setUnlocalizedName("radiumshovel").setCreativeTab(CreativetabHandler.vgtab3);
        radiumsword = new Vgsword(RADIUMSWORD).setUnlocalizedName("radiumsword").setCreativeTab(CreativetabHandler.vgtab4);
        radiumpickaxe = new Vgpickaxe(RADIUMTOOLS).setUnlocalizedName("radiumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // gallum
        gallumaxe = new Vgaxe(GALLUMTOOLS).setUnlocalizedName("gallumaxe").setCreativeTab(CreativetabHandler.vgtab3);
        gallumhoe = new Vghoe(GALLUMTOOLS).setUnlocalizedName("gallumhoe").setCreativeTab(CreativetabHandler.vgtab3);
        gallumshovel = new Vgshovel(GALLUMTOOLS).setUnlocalizedName("gallumshovel").setCreativeTab(CreativetabHandler.vgtab3);
        gallumsword = new Vgsword(GALLUMSWORD).setUnlocalizedName("gallumsword").setCreativeTab(CreativetabHandler.vgtab4);
        gallumpickaxe = new Vgpickaxe(GALLUMTOOLS).setUnlocalizedName("gallumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // vanadium
        vanadiumaxe = new Vgaxe(VANADIUMTOOLS).setUnlocalizedName("vanadiumaxe").setCreativeTab(CreativetabHandler.vgtab3);
        vanadiumhoe = new Vghoe(VANADIUMTOOLS).setUnlocalizedName("vanadiumhoe").setCreativeTab(CreativetabHandler.vgtab3);
        vanadiumshovel = new Vgshovel(VANADIUMTOOLS).setUnlocalizedName("vanadiumshovel").setCreativeTab(CreativetabHandler.vgtab3);
        vanadiumsword = new Vgsword(VANADIUMSWORD).setUnlocalizedName("vanadiumsword").setCreativeTab(CreativetabHandler.vgtab4);
        vanadiumpickaxe = new Vgpickaxe(VANADIUMTOOLS).setUnlocalizedName("vanadiumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // scandium
        scandiumaxe = new Vgaxe(SCANDIUMTOOLS).setUnlocalizedName("scandiumaxe").setCreativeTab(CreativetabHandler.vgtab3);
        scandiumhoe = new Vghoe(SCANDIUMTOOLS).setUnlocalizedName("scandiumhoe").setCreativeTab(CreativetabHandler.vgtab3);
        scandiumshovel = new Vgshovel(SCANDIUMTOOLS).setUnlocalizedName("scandiumshovel").setCreativeTab(CreativetabHandler.vgtab3);
        scandiumsword = new Vgsword(SCANDIUMSWORD).setUnlocalizedName("scandiumsword").setCreativeTab(CreativetabHandler.vgtab4);
        scandiumpickaxe = new Vgpickaxe(SCANDIUMTOOLS).setUnlocalizedName("scandiumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // bismuth
        bismuthaxe = new Vgaxe(BISMUTHTOOLS).setUnlocalizedName("bismuthaxe").setCreativeTab(CreativetabHandler.vgtab3);
        bismuthhoe = new Vghoe(BISMUTHTOOLS).setUnlocalizedName("bismuthhoe").setCreativeTab(CreativetabHandler.vgtab3);
        bismuthshovel = new Vgshovel(BISMUTHTOOLS).setUnlocalizedName("bismuthshovel").setCreativeTab(CreativetabHandler.vgtab3);
        bismuthsword = new Vgsword(BISMUTHSWORD).setUnlocalizedName("bismuthsword").setCreativeTab(CreativetabHandler.vgtab4);
        bismuthpickaxe = new Vgpickaxe(BISMUTHTOOLS).setUnlocalizedName("bismuthpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // indium
        indiumaxe = new Vgaxe(INDIUMTOOLS).setUnlocalizedName("indiumaxe").setCreativeTab(CreativetabHandler.vgtab3);
        indiumhoe = new Vghoe(INDIUMTOOLS).setUnlocalizedName("indiumhoe").setCreativeTab(CreativetabHandler.vgtab3);
        indiumshovel = new Vgshovel(INDIUMTOOLS).setUnlocalizedName("indiumshovel").setCreativeTab(CreativetabHandler.vgtab3);
        indiumsword = new Vgsword(INDIUMSWORD).setUnlocalizedName("indiumsword").setCreativeTab(CreativetabHandler.vgtab4);
        indiumpickaxe = new Vgpickaxe(INDIUMTOOLS).setUnlocalizedName("indiumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // platinum
        platinumaxe = new Vgaxe(PLATINUMTOOLS).setUnlocalizedName("platinumaxe").setCreativeTab(CreativetabHandler.vgtab3);
        platinumhoe = new Vghoe(PLATINUMTOOLS).setUnlocalizedName("platinumhoe").setCreativeTab(CreativetabHandler.vgtab3);
        platinumshovel = new Vgshovel(PLATINUMTOOLS).setUnlocalizedName("platinumshovel").setCreativeTab(CreativetabHandler.vgtab3);
        platinumsword = new Vgsword(PLATINUMSWORD).setUnlocalizedName("platinumsword").setCreativeTab(CreativetabHandler.vgtab4);
        platinumpickaxe = new Vgpickaxe(PLATINUMTOOLS).setUnlocalizedName("platinumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // darkness
        darknessaxe = new Vgaxe(DARKNESSTOOLS).setUnlocalizedName("darknessaxe").setCreativeTab(CreativetabHandler.vgtab3);
        darknesshoe = new Vghoe(DARKNESSTOOLS).setUnlocalizedName("darknesshoe").setCreativeTab(CreativetabHandler.vgtab3);
        darknessshovel = new Vgshovel(DARKNESSTOOLS).setUnlocalizedName("darknessshovel").setCreativeTab(CreativetabHandler.vgtab3);
        darknesssword = new Vgsword(DARKNESSSWORD).setUnlocalizedName("darknesssword").setCreativeTab(CreativetabHandler.vgtab4);
        darknesspickaxe = new Vgpickaxe(DARKNESSTOOLS).setUnlocalizedName("darknesspickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // light
        lightaxe = new Vgaxe(LIGHTTOOLS).setUnlocalizedName("lightaxe").setCreativeTab(CreativetabHandler.vgtab3);
        lighthoe = new Vghoe(LIGHTTOOLS).setUnlocalizedName("lighthoe").setCreativeTab(CreativetabHandler.vgtab3);
        lightshovel = new Vgshovel(LIGHTTOOLS).setUnlocalizedName("lightshovel").setCreativeTab(CreativetabHandler.vgtab3);
        lightsword = new Vgsword(LIGHTSWORD).setUnlocalizedName("lightsword").setCreativeTab(CreativetabHandler.vgtab4);
        lightpickaxe = new Vgpickaxe(LIGHTTOOLS).setUnlocalizedName("lightpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // omega
        omegaaxe = new Vgaxe(OMEGATOOLS).setUnlocalizedName("omegaaxe").setCreativeTab(CreativetabHandler.vgtab3);
        omegahoe = new Vghoe(OMEGATOOLS).setUnlocalizedName("omegahoe").setCreativeTab(CreativetabHandler.vgtab3);
        omegashovel = new Vgshovel(OMEGATOOLS).setUnlocalizedName("omegashovel").setCreativeTab(CreativetabHandler.vgtab3);
        omegasword = new Vgsword(OMEGASWORD).setUnlocalizedName("omegasword").setCreativeTab(CreativetabHandler.vgtab4);
        omegahand = new Vgsword(OMEGASWORD).setUnlocalizedName("omegahand").setCreativeTab(CreativetabHandler.vgtab4);
        omegapickaxe = new Vgpickaxe(OMEGATOOLS).setUnlocalizedName("omegapickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // Berionvar
        berionvaraxe = new Vgaxe(BERIONVARTOOLS).setUnlocalizedName("berionvaraxe").setCreativeTab(CreativetabHandler.vgtab3);
        berionvarhoe = new Vghoe(BERIONVARTOOLS).setUnlocalizedName("berionvarhoe").setCreativeTab(CreativetabHandler.vgtab3);
        berionvarshovel = new Vgshovel(BERIONVARTOOLS).setUnlocalizedName("berionvarshovel").setCreativeTab(CreativetabHandler.vgtab3);
        berionvarsword = new Vgsword(BERIONVARSWORD).setUnlocalizedName("berionvarsword").setCreativeTab(CreativetabHandler.vgtab4);
        berionvarpickaxe = new Vgpickaxe(BERIONVARTOOLS).setUnlocalizedName("berionvarpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // Charviole
        charvioleaxe = new Vgaxe(CHARVIOLETOOLS).setUnlocalizedName("charvioleaxe").setCreativeTab(CreativetabHandler.vgtab3);
        charviolehoe = new Vghoe(CHARVIOLETOOLS).setUnlocalizedName("charviolehoe").setCreativeTab(CreativetabHandler.vgtab3);
        charvioleshovel = new Vgshovel(CHARVIOLETOOLS).setUnlocalizedName("charvioleshovel").setCreativeTab(CreativetabHandler.vgtab3);
        charviolesword = new Vgsword(CHARVIOLESWORD).setUnlocalizedName("charviolesword").setCreativeTab(CreativetabHandler.vgtab4);
        charviolepickaxe = new Vgpickaxe(CHARVIOLETOOLS).setUnlocalizedName("charviolepickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // Firlvear
        firlvearaxe = new Vgaxe(FIRLVEARTOOLS).setUnlocalizedName("firlvearaxe").setCreativeTab(CreativetabHandler.vgtab3);
        firlvearhoe = new Vghoe(FIRLVEARTOOLS).setUnlocalizedName("firlvearhoe").setCreativeTab(CreativetabHandler.vgtab3);
        firlvearshovel = new Vgshovel(FIRLVEARTOOLS).setUnlocalizedName("firlvearshovel").setCreativeTab(CreativetabHandler.vgtab3);
        firlvearsword = new Vgsword(FIRLVEARSWORD).setUnlocalizedName("firlvearsword").setCreativeTab(CreativetabHandler.vgtab4);
        firlvearpickaxe = new Vgpickaxe(FIRLVEARTOOLS).setUnlocalizedName("firlvearpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // selmenrer
        selmenreraxe = new Vgaxe(SELMENRERTOOLS).setUnlocalizedName("selmenreraxe").setCreativeTab(CreativetabHandler.vgtab3);
        selmenrerhoe = new Vghoe(SELMENRERTOOLS).setUnlocalizedName("selmenrerhoe").setCreativeTab(CreativetabHandler.vgtab3);
        selmenrershovel = new Vgshovel(SELMENRERTOOLS).setUnlocalizedName("selmenrershovel").setCreativeTab(CreativetabHandler.vgtab3);
        selmenrersword = new Vgsword(SELMENRERSWORD).setUnlocalizedName("selmenrersword").setCreativeTab(CreativetabHandler.vgtab4);
        selmenrerpickaxe = new Vgpickaxe(SELMENRERTOOLS).setUnlocalizedName("selmenrerpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // verilion
        verilionaxe = new Vgaxe(VERILIONTOOLS).setUnlocalizedName("verilionaxe").setCreativeTab(CreativetabHandler.vgtab3);
        verilionhoe = new Vghoe(VERILIONTOOLS).setUnlocalizedName("verilionhoe").setCreativeTab(CreativetabHandler.vgtab3);
        verilionshovel = new Vgshovel(VERILIONTOOLS).setUnlocalizedName("verilionshovel").setCreativeTab(CreativetabHandler.vgtab3);
        verilionsword = new Vgsword(VERILIONSWORD).setUnlocalizedName("verilionsword").setCreativeTab(CreativetabHandler.vgtab4);
        verilionpickaxe = new Vgpickaxe(VERILIONTOOLS).setUnlocalizedName("verilionpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // vielvor
        vielvoraxe = new Vgaxe(VIELVORTOOLS).setUnlocalizedName("vielvoraxe").setCreativeTab(CreativetabHandler.vgtab3);
        vielvorhoe = new Vghoe(VIELVORTOOLS).setUnlocalizedName("vielvorhoe").setCreativeTab(CreativetabHandler.vgtab3);
        vielvorshovel = new Vgshovel(VIELVORTOOLS).setUnlocalizedName("vielvorshovel").setCreativeTab(CreativetabHandler.vgtab3);
        vielvorsword = new Vgsword(VIELVORSWORD).setUnlocalizedName("vielvorsword").setCreativeTab(CreativetabHandler.vgtab4);
        vielvorpickaxe = new Vgpickaxe(VIELVORTOOLS).setUnlocalizedName("vielvorpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // invisible
        invisibledagger = new Vgsword(INVISIBLESWORD).setUnlocalizedName("invisibledagger").setCreativeTab(CreativetabHandler.vgtab4);
    }
    
    public static void registerItem(GameRegistry registry) {
        // urotark
        registry.registerItem(urotarkaxe, "urotarkaxe");
        registry.registerItem(urotarkhoe, "urotarkhoe");
        registry.registerItem(urotarkshovel, "urotarkshovel");
        registry.registerItem(urotarksword, "urotarksword");
        registry.registerItem(urotarkpickaxe, "urotarkpickaxe");
        // pearl
        registry.registerItem(pearlaxe, "pearlaxe");
        registry.registerItem(pearlhoe, "pearlhoe");
        registry.registerItem(pearlshovel, "pearlshovel");
        registry.registerItem(pearlsword, "pearlsword");
        registry.registerItem(pearlpickaxe, "pearlpickaxe");
        // sapphire
        registry.registerItem(sapphireaxe, "sapphireaxe");
        registry.registerItem(sapphirehoe, "sapphirehoe");
        registry.registerItem(sapphireshovel, "sapphireshovel");
        registry.registerItem(sapphiresword, "sapphiresword");
        registry.registerItem(sapphirepickaxe, "sapphirepickaxe");
        // muscovite
        registry.registerItem(muscoviteaxe, "muscoviteaxe");
        registry.registerItem(muscovitehoe, "muscovitehoe");
        registry.registerItem(muscoviteshovel, "muscoviteshovel");
        registry.registerItem(muscovitesword, "muscovitesword");
        registry.registerItem(muscovitepickaxe, "muscovitepickaxe");
        // ruby
        registry.registerItem(rubyaxe, "rubyaxe");
        registry.registerItem(rubyhoe, "rubyhoe");
        registry.registerItem(rubyshovel, "rubyshovel");
        registry.registerItem(rubysword, "rubysword");
        registry.registerItem(rubypickaxe, "rubypickaxe");
        // uriotyke
        registry.registerItem(uriotykeaxe, "uriotykeaxe");
        registry.registerItem(uriotykehoe, "uriotykehoe");
        registry.registerItem(uriotykeshovel, "uriotykeshovel");
        registry.registerItem(uriotykesword, "uriotykesword");
        registry.registerItem(uriotykepickaxe, "uriotykepickaxe");
        // gilder
        registry.registerItem(gilderaxe, "gilderaxe");
        registry.registerItem(gilderhoe, "gilderhoe");
        registry.registerItem(gildershovel, "gildershovel");
        registry.registerItem(gildersword, "gildersword");
        registry.registerItem(gilderpickaxe, "gilderpickaxe");
        // selovar
        registry.registerItem(selovaraxe, "selovaraxe");
        registry.registerItem(selovarhoe, "selovarhoe");
        registry.registerItem(selovarshovel, "selovarshovel");
        registry.registerItem(selovarsword, "selovarsword");
        registry.registerItem(selovarpickaxe, "selovarpickaxe");
        // parfilian
        registry.registerItem(parfilianaxe, "parfilianaxe");
        registry.registerItem(parfilianhoe, "parfilianhoe");
        registry.registerItem(parfilianshovel, "parfilianshovel");
        registry.registerItem(parfiliansword, "parfiliansword");
        registry.registerItem(parfilianpickaxe, "parfilianpickaxe");
        // barium
        registry.registerItem(bariumaxe, "bariumaxe");
        registry.registerItem(bariumhoe, "bariumhoe");
        registry.registerItem(bariumshovel, "bariumshovel");
        registry.registerItem(bariumsword, "bariumsword");
        registry.registerItem(bariumpickaxe, "bariumpickaxe");
        // radium
        registry.registerItem(radiumaxe, "radiumaxe");
        registry.registerItem(radiumhoe, "radiumhoe");
        registry.registerItem(radiumshovel, "radiumshovel");
        registry.registerItem(radiumsword, "radiumsword");
        registry.registerItem(radiumpickaxe, "radiumpickaxe");
        // gallum
        registry.registerItem(gallumaxe, "gallumaxe");
        registry.registerItem(gallumhoe, "gallumhoe");
        registry.registerItem(gallumshovel, "gallumshovel");
        registry.registerItem(gallumsword, "gallumsword");
        registry.registerItem(gallumpickaxe, "gallumpickaxe");
        // vanadium
        registry.registerItem(vanadiumaxe, "vanadiumaxe");
        registry.registerItem(vanadiumhoe, "vanadiumhoe");
        registry.registerItem(vanadiumshovel, "vanadiumshovel");
        registry.registerItem(vanadiumsword, "vanadiumsword");
        registry.registerItem(vanadiumpickaxe, "vanadiumpickaxe");
        // scandium
        registry.registerItem(scandiumaxe, "scandiumaxe");
        registry.registerItem(scandiumhoe, "scandiumhoe");
        registry.registerItem(scandiumshovel, "scandiumshovel");
        registry.registerItem(scandiumsword, "scandiumsword");
        registry.registerItem(scandiumpickaxe, "scandiumpickaxe");
        // bismuth
        registry.registerItem(bismuthaxe, "bismuthaxe");
        registry.registerItem(bismuthhoe, "bismuthhoe");
        registry.registerItem(bismuthshovel, "bismuthshovel");
        registry.registerItem(bismuthsword, "bismuthsword");
        registry.registerItem(bismuthpickaxe, "bismuthpickaxe");
        // indium
        registry.registerItem(indiumaxe, "indiumaxe");
        registry.registerItem(indiumhoe, "indiumhoe");
        registry.registerItem(indiumshovel, "indiumshovel");
        registry.registerItem(indiumsword, "indiumsword");
        registry.registerItem(indiumpickaxe, "indiumpickaxe");
        // platinum
        registry.registerItem(platinumaxe, "platinumaxe");
        registry.registerItem(platinumhoe, "platinumhoe");
        registry.registerItem(platinumshovel, "platinumshovel");
        registry.registerItem(platinumsword, "platinumsword");
        registry.registerItem(platinumpickaxe, "platinumpickaxe");
        // darkness
        registry.registerItem(darknessaxe, "darknessaxe");
        registry.registerItem(darknesshoe, "darknesshoe");
        registry.registerItem(darknessshovel, "darknessshovel");
        registry.registerItem(darknesssword, "darknesssword");
        registry.registerItem(darknesspickaxe, "darknesspickaxe");
        // light
        registry.registerItem(lightaxe, "lightaxe");
        registry.registerItem(lighthoe, "lighthoe");
        registry.registerItem(lightshovel, "lightshovel");
        registry.registerItem(lightsword, "lightsword");
        registry.registerItem(lightpickaxe, "lightpickaxe");
        // omega
        registry.registerItem(omegaaxe, "omegaaxe");
        registry.registerItem(omegahoe, "omegahoe");
        registry.registerItem(omegashovel, "omegashovel");
        registry.registerItem(omegasword, "omegasword");
        registry.registerItem(omegahand, "omegahand");
        registry.registerItem(omegapickaxe, "omegapickaxe");
        // bubble
        registry.registerItem(bubblesword, "bubblesword");
        // Berionvar
        registry.registerItem(berionvaraxe, "berionvaraxe");
        registry.registerItem(berionvarhoe, "berionvarhoe");
        registry.registerItem(berionvarshovel, "berionvarshovel");
        registry.registerItem(berionvarsword, "berionvarsword");
        registry.registerItem(berionvarpickaxe, "berionvarpickaxe");
        // Charviole
        registry.registerItem(charvioleaxe, "charvioleaxe");
        registry.registerItem(charviolehoe, "charviolehoe");
        registry.registerItem(charvioleshovel, "charvioleshovel");
        registry.registerItem(charviolesword, "charviolesword");
        registry.registerItem(charviolepickaxe, "charviolepickaxe");
        // Firlvear
        registry.registerItem(firlvearaxe, "firlvearaxe");
        registry.registerItem(firlvearhoe, "firlvearhoe");
        registry.registerItem(firlvearshovel, "firlvearshovel");
        registry.registerItem(firlvearsword, "firlvearsword");
        registry.registerItem(firlvearpickaxe, "firlvearpickaxe");
        // selmenrer
        registry.registerItem(selmenreraxe, "selmenreraxe");
        registry.registerItem(selmenrerhoe, "selmenrerhoe");
        registry.registerItem(selmenrershovel, "selmenrershovel");
        registry.registerItem(selmenrersword, "selmenrersword");
        registry.registerItem(selmenrerpickaxe, "selmenrerpickaxe");
        // verilion
        registry.registerItem(verilionaxe, "verilionaxe");
        registry.registerItem(verilionhoe, "verilionhoe");
        registry.registerItem(verilionshovel, "verilionshovel");
        registry.registerItem(verilionsword, "verilionsword");
        registry.registerItem(verilionpickaxe, "verilionpickaxe");
        // vielvor
        registry.registerItem(vielvoraxe, "vielvoraxe");
        registry.registerItem(vielvorhoe, "vielvorhoe");
        registry.registerItem(vielvorshovel, "vielvorshovel");
        registry.registerItem(vielvorsword, "vielvorsword");
        registry.registerItem(vielvorpickaxe, "vielvorpickaxe");
        // invisible
        registry.registerItem(invisibledagger, "invisibledagger");
    }
    
    /*
     * public static void setNames(LanguageRegistry registry) { // urotark
     * registry.addName(urotarkaxe, "Urotark Axe"); registry.addName(urotarkhoe,
     * "Urotark Hoe"); registry.addName(urotarkshovel, "Urotark Shovel");
     * registry.addName(urotarksword, "Urotark Sword");
     * registry.addName(urotarkpickaxe, "Urotark Pickaxe"); // pearl
     * registry.addName(pearlaxe, "Pearl Axe"); registry.addName(pearlhoe,
     * "Pearl Hoe"); registry.addName(pearlshovel, "Pearl Shovel");
     * registry.addName(pearlsword, "Pearl Sword");
     * registry.addName(pearlpickaxe, "Pearl Pickaxe"); // sapphire
     * registry.addName(sapphireaxe, "Sapphire Axe");
     * registry.addName(sapphirehoe, "Sapphire Hoe");
     * registry.addName(sapphireshovel, "Sapphire Shovel");
     * registry.addName(sapphiresword, "Sapphire Sword");
     * registry.addName(sapphirepickaxe, "Sapphire Pickaxe"); // muscovite
     * registry.addName(muscoviteaxe, "Muscovite Axe");
     * registry.addName(muscovitehoe, "Muscovite Hoe");
     * registry.addName(muscoviteshovel, "Muscovite Shovel");
     * registry.addName(muscovitesword, "Muscovite Sword");
     * registry.addName(muscovitepickaxe, "Muscovite Pickaxe"); // ruby
     * registry.addName(rubyaxe, "Ruby Axe"); registry.addName(rubyhoe,
     * "Ruby Hoe"); registry.addName(rubyshovel, "Ruby Shovel");
     * registry.addName(rubysword, "Ruby Sword"); registry.addName(rubypickaxe,
     * "Ruby Pickaxe"); // uriotyke registry.addName(uriotykeaxe,
     * "Uriotyke Axe"); registry.addName(uriotykehoe, "Uriotyke Hoe");
     * registry.addName(uriotykeshovel, "Uriotyke Shovel");
     * registry.addName(uriotykesword, "Uriotyke Sword");
     * registry.addName(uriotykepickaxe, "Uriotyke Pickaxe"); // gilder
     * registry.addName(gilderaxe, "Gilder Axe"); registry.addName(gilderhoe,
     * "Gilder Hoe"); registry.addName(gildershovel, "Gilder Shovel");
     * registry.addName(gildersword, "Gilder Sword");
     * registry.addName(gilderpickaxe, "Gilder Pickaxe"); // selovar
     * registry.addName(selovaraxe, "Selovar Axe"); registry.addName(selovarhoe,
     * "Selovar Hoe"); registry.addName(selovarshovel, "Selovar Shovel");
     * registry.addName(selovarsword, "Selovar Sword");
     * registry.addName(selovarpickaxe, "Selovar Pickaxe"); // parfilian
     * registry.addName(parfilianaxe, "Parfilian Axe");
     * registry.addName(parfilianhoe, "Parfilian Hoe");
     * registry.addName(parfilianshovel, "Parfilian Shovel");
     * registry.addName(parfiliansword, "Parfilian Sword");
     * registry.addName(parfilianpickaxe, "Parfilian Pickaxe"); // barium
     * registry.addName(bariumaxe, "Barium Axe"); registry.addName(bariumhoe,
     * "Barium Hoe"); registry.addName(bariumshovel, "Barium Shovel");
     * registry.addName(bariumsword, "Barium Sword");
     * registry.addName(bariumpickaxe, "Barium Pickaxe"); // radium
     * registry.addName(radiumaxe, "Radium Axe"); registry.addName(radiumhoe,
     * "Radium Hoe"); registry.addName(radiumshovel, "Radium Shovel");
     * registry.addName(radiumsword, "Radium Sword");
     * registry.addName(radiumpickaxe, "Radium Pickaxe"); // gallum
     * registry.addName(gallumaxe, "Gallum Axe"); registry.addName(gallumhoe,
     * "Gallum Hoe"); registry.addName(gallumshovel, "Gallum Shovel");
     * registry.addName(gallumsword, "Gallum Sword");
     * registry.addName(gallumpickaxe, "Gallum Pickaxe"); // vanadium
     * registry.addName(vanadiumaxe, "Vanadium Axe");
     * registry.addName(vanadiumhoe, "Vanadium Hoe");
     * registry.addName(vanadiumshovel, "Vanadium Shovel");
     * registry.addName(vanadiumsword, "Vanadium Sword");
     * registry.addName(vanadiumpickaxe, "Vanadium Pickaxe"); // scandium
     * registry.addName(scandiumaxe, "Scandium Axe");
     * registry.addName(scandiumhoe, "Scandium Hoe");
     * registry.addName(scandiumshovel, "Scandium Shovel");
     * registry.addName(scandiumsword, "Scandium Sword");
     * registry.addName(scandiumpickaxe, "Scandium Pickaxe"); // bismuth
     * registry.addName(bismuthaxe, "Bismuth Axe"); registry.addName(bismuthhoe,
     * "Bismuth Hoe"); registry.addName(bismuthshovel, "Bismuth Shovel");
     * registry.addName(bismuthsword, "Bismuth Sword");
     * registry.addName(bismuthpickaxe, "Bismuth Pickaxe"); // indium
     * registry.addName(indiumaxe, "Indium Axe"); registry.addName(indiumhoe,
     * "Indium Hoe"); registry.addName(indiumshovel, "Indium Shovel");
     * registry.addName(indiumsword, "Indium Sword");
     * registry.addName(indiumpickaxe, "Indium Pickaxe"); // platinum
     * registry.addName(platinumaxe, "Platinum Axe");
     * registry.addName(platinumhoe, "Platinum Hoe");
     * registry.addName(platinumshovel, "Platinum Shovel");
     * registry.addName(platinumsword, "Platinum Sword");
     * registry.addName(platinumpickaxe, "Platinum Pickaxe"); // darkness
     * registry.addName(darknessaxe, "Darkness Axe");
     * registry.addName(darknesshoe, "Darkness Hoe");
     * registry.addName(darknessshovel, "Darkness Shovel");
     * registry.addName(darknesssword, "Darkness Sword");
     * registry.addName(darknesspickaxe, "Darkness Pickaxe"); // light
     * registry.addName(lightaxe, "Light Axe"); registry.addName(lighthoe,
     * "Light Hoe"); registry.addName(lightshovel, "Light Shovel");
     * registry.addName(lightsword, "Light Sword");
     * registry.addName(lightpickaxe, "Light Pickaxe"); // omega
     * registry.addName(omegaaxe, "Omega Axe"); registry.addName(omegahoe,
     * "Omega Hoe"); registry.addName(omegashovel, "Omega Shovel");
     * registry.addName(omegasword, "Omega Sword"); registry.addName(omegahand,
     * "Omega Hand"); registry.addName(omegapickaxe, "Omega Pickaxe"); // bubble
     * registry.addName(bubblesword, "Bubble Sword"); // Berionvar
     * registry.addName(berionvaraxe, "Berionvar Axe");
     * registry.addName(berionvarhoe, "Berionvar Hoe");
     * registry.addName(berionvarshovel, "Berionvar Shovel");
     * registry.addName(berionvarsword, "Berionvar Sword");
     * registry.addName(berionvarpickaxe, "Berionvar Pickaxe"); // Charviole
     * registry.addName(charvioleaxe, "Charviole Axe");
     * registry.addName(charviolehoe, "Charviole Hoe");
     * registry.addName(charvioleshovel, "Charviole Shovel");
     * registry.addName(charviolesword, "Charviole Sword");
     * registry.addName(charviolepickaxe, "Charviole Pickaxe"); // Firlvear
     * registry.addName(firlvearaxe, "Firlvear Axe");
     * registry.addName(firlvearhoe, "Firlvear Hoe");
     * registry.addName(firlvearshovel, "Firlvear Shovel");
     * registry.addName(firlvearsword, "Firlvear Sword");
     * registry.addName(firlvearpickaxe, "Firlvear Pickaxe"); // selmenrer
     * registry.addName(selmenreraxe, "Selmenrer Axe");
     * registry.addName(selmenrerhoe, "Selmenrer Hoe");
     * registry.addName(selmenrershovel, "Selmenrer Shovel");
     * registry.addName(selmenrersword, "Selmenrer Sword");
     * registry.addName(selmenrerpickaxe, "Selmenrer Pickaxe"); // verilion
     * registry.addName(verilionaxe, "Verilion Axe");
     * registry.addName(verilionhoe, "Verilion Hoe");
     * registry.addName(verilionshovel, "Verilion Shovel");
     * registry.addName(verilionsword, "Verilion Sword");
     * registry.addName(verilionpickaxe, "Verilion Pickaxe"); // vielvor
     * registry.addName(vielvoraxe, "Vielvor Axe"); registry.addName(vielvorhoe,
     * "Vielvor Hoe"); registry.addName(vielvorshovel, "Vielvor Shovel");
     * registry.addName(vielvorsword, "Vielvor Sword");
     * registry.addName(vielvorpickaxe, "Vielvor Pickaxe"); // invisible
     * registry.addName(invisibledagger, "Invisible Dagger"); }
     */
    
}
