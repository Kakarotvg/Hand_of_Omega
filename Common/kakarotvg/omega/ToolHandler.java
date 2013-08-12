package kakarotvg.omega;

import kakarotvg.omega.tools.Vgaxe;
import kakarotvg.omega.tools.Vghoe;
import kakarotvg.omega.tools.Vgpickaxe;
import kakarotvg.omega.tools.Vgshovel;
import kakarotvg.omega.tools.Vgsword;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

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

    // urotark
    public static EnumToolMaterial UROTARKTOOLS = EnumHelper.addToolMaterial("UROTARK TOOLS", 4, 2000, 12, 8, 10);
    public static EnumToolMaterial UROTARKSWORD = EnumHelper.addToolMaterial("UROTARKSWORD", 4, 2000, 12, 10, 10);
    // pearl
    public static EnumToolMaterial PEARLTOOLS = EnumHelper.addToolMaterial("PEARL TOOLS", 4, 2100, 13, 10, 10);
    public static EnumToolMaterial PEARLSWORD = EnumHelper.addToolMaterial("PEARLSWORD", 4, 2100, 13, 12, 10);
    // sapphire
    public static EnumToolMaterial SAPPHIRETOOLS = EnumHelper.addToolMaterial("SAPPHIRE TOOLS", 4, 2200, 14, 12, 10);
    public static EnumToolMaterial SAPPHIRESWORD = EnumHelper.addToolMaterial("SAPPHIRESWORD", 4, 2200, 14, 14, 10);
    // muscovite
    public static EnumToolMaterial MUSCOVITETOOLS = EnumHelper.addToolMaterial("MUSCOVITE TOOLS", 5, 2300, 15, 14, 10);
    public static EnumToolMaterial MUSCOVITESWORD = EnumHelper.addToolMaterial("MUSCOVITESWORD", 5, 2300, 15, 16, 10);
    // ruby
    public static EnumToolMaterial RUBYTOOLS = EnumHelper.addToolMaterial("RUBY TOOLS", 5, 2400, 16, 16, 10);
    public static EnumToolMaterial RUBYSWORD = EnumHelper.addToolMaterial("RUBYSWORD", 5, 2400, 16, 18, 10);
    // uriotyke
    public static EnumToolMaterial URIOTYKETOOLS = EnumHelper.addToolMaterial("URIOTYKE TOOLS", 5, 2500, 17, 18, 10);
    public static EnumToolMaterial URIOTYKESWORD = EnumHelper.addToolMaterial("URIOTYKESWORD", 5, 2500, 17, 20, 10);
    // gilder
    public static EnumToolMaterial GILDERTOOLS = EnumHelper.addToolMaterial("GILDER TOOLS", 6, 2600, 18, 20, 10);
    public static EnumToolMaterial GILDERSWORD = EnumHelper.addToolMaterial("GILDERSWORD", 6, 2600, 18, 22, 10);
    // selovar
    public static EnumToolMaterial SELOVARTOOLS = EnumHelper.addToolMaterial("SELOVAR TOOLS", 6, 2700, 18, 22, 10);
    public static EnumToolMaterial SELOVARSWORD = EnumHelper.addToolMaterial("SELOVARSWORD", 6, 2700, 18, 24, 10);
    // parfilian
    public static EnumToolMaterial PARFILIANTOOLS = EnumHelper.addToolMaterial("PARFILIAN TOOLS", 6, 2800, 18, 24, 10);
    public static EnumToolMaterial PARFILIANSWORD = EnumHelper.addToolMaterial("PARFILIANSWORD", 6, 2800, 18, 26, 10);
    // barium
    public static EnumToolMaterial BARIUMTOOLS = EnumHelper.addToolMaterial("BARIUM TOOLS", 7, 2900, 19, 26, 10);
    public static EnumToolMaterial BARIUMSWORD = EnumHelper.addToolMaterial("BARIUMSWORD", 7, 2900, 19, 28, 10);
    // radium
    public static EnumToolMaterial RADIUMTOOLS = EnumHelper.addToolMaterial("RADIUM TOOLS", 7, 3000, 20, 28, 10);
    public static EnumToolMaterial RADIUMSWORD = EnumHelper.addToolMaterial("RADIUMSWORD", 7, 3000, 20, 30, 10);
    // gallum
    public static EnumToolMaterial GALLUMTOOLS = EnumHelper.addToolMaterial("GALLUM TOOLS", 7, 3100, 21, 30, 10);
    public static EnumToolMaterial GALLUMSWORD = EnumHelper.addToolMaterial("GALLUMSWORD", 7, 3100, 21, 32, 10);
    // vanadium
    public static EnumToolMaterial VANADIUMTOOLS = EnumHelper.addToolMaterial("VANADIUM TOOLS", 8, 3200, 22, 32, 10);
    public static EnumToolMaterial VANADIUMSWORD = EnumHelper.addToolMaterial("VANADIUMSWORD", 8, 3200, 22, 34, 10);
    // scandium
    public static EnumToolMaterial SCANDIUMTOOLS = EnumHelper.addToolMaterial("SCANDIUM TOOLS", 8, 3300, 23, 34, 10);
    public static EnumToolMaterial SCANDIUMSWORD = EnumHelper.addToolMaterial("SCANDIUMSWORD", 8, 3300, 23, 36, 10);
    // bismuth
    public static EnumToolMaterial BISMUTHTOOLS = EnumHelper.addToolMaterial("BISMUTH TOOLS", 9, 3400, 24, 36, 10);
    public static EnumToolMaterial BISMUTHSWORD = EnumHelper.addToolMaterial("BISMUTHSWORD", 9, 3400, 24, 38, 10);
    // indium
    public static EnumToolMaterial INDIUMTOOLS = EnumHelper.addToolMaterial("INDIUM TOOLS", 9, 3500, 25, 38, 10);
    public static EnumToolMaterial INDIUMSWORD = EnumHelper.addToolMaterial("INDIUMSWORD", 9, 3500, 25, 40, 10);
    // platinum
    public static EnumToolMaterial PLATINUMTOOLS = EnumHelper.addToolMaterial("PLATINUM TOOLS", 10, 3600, 26, 40, 10);
    public static EnumToolMaterial PLATINUMSWORD = EnumHelper.addToolMaterial("PLATINUMSWORD", 10, 3600, 26, 42, 10);
    // darkness
    public static EnumToolMaterial DARKNESSTOOLS = EnumHelper.addToolMaterial("DARKNESS TOOLS", 20, 5000, 40, 65, 10);
    public static EnumToolMaterial DARKNESSSWORD = EnumHelper.addToolMaterial("DARKNESSSWORD", 20, 5000, 40, 65, 10);
    // light
    public static EnumToolMaterial LIGHTTOOLS = EnumHelper.addToolMaterial("LIGHT TOOLS", 20, 5000, 40, 65, 10);
    public static EnumToolMaterial LIGHTSWORD = EnumHelper.addToolMaterial("LIGHTSWORD", 20, 5000, 40, 65, 10);
    // omega
    public static EnumToolMaterial OMEGATOOLS = EnumHelper.addToolMaterial("OMEGA TOOLS", 25, 6000, 50, 75, 10);
    public static EnumToolMaterial OMEGASWORD = EnumHelper.addToolMaterial("OMEGASWORD", 25, 6000, 50, 75, 10);
    // bubble
    public static EnumToolMaterial BUBBLESWORD = EnumHelper.addToolMaterial("BUBBLESWORD", 3, 400, 3, 3, 10);
    // Berionvar
    public static EnumToolMaterial BERIONVARTOOLS = EnumHelper.addToolMaterial("BERIONVAR TOOLS", 11, 3700, 27, 44, 10);
    public static EnumToolMaterial BERIONVARSWORD = EnumHelper.addToolMaterial("BERIONVARSWORD", 11, 3700, 27, 46, 10);
    // Charviole
    public static EnumToolMaterial CHARVIOLETOOLS = EnumHelper.addToolMaterial("CHARVIOLE TOOLS", 12, 3800, 28, 46, 10);
    public static EnumToolMaterial CHARVIOLESWORD = EnumHelper.addToolMaterial("CHARVIOLESWORD", 12, 3800, 28, 48, 10);
    // Firlvear
    public static EnumToolMaterial FIRLVEARTOOLS = EnumHelper.addToolMaterial("FIRLVEAR TOOLS", 13, 3900, 29, 48, 10);
    public static EnumToolMaterial FIRLVEARSWORD = EnumHelper.addToolMaterial("FIRLVEARSWORD", 13, 3900, 29, 50, 10);
    // selmenrer
    public static EnumToolMaterial SELMENRERTOOLS = EnumHelper.addToolMaterial("SELMENRER TOOLS", 14, 4000, 30, 50, 10);
    public static EnumToolMaterial SELMENRERSWORD = EnumHelper.addToolMaterial("SELMENRERSWORD", 14, 4000, 30, 52, 10);
    // verilion
    public static EnumToolMaterial VERILIONTOOLS = EnumHelper.addToolMaterial("VERILION TOOLS", 15, 4100, 31, 52, 10);
    public static EnumToolMaterial VERILIONSWORD = EnumHelper.addToolMaterial("VERILIONSWORD", 15, 4100, 31, 54, 10);
    // vielvor
    public static EnumToolMaterial VIELVORTOOLS = EnumHelper.addToolMaterial("VIELVOR TOOLS", 16, 4200, 32, 54, 10);
    public static EnumToolMaterial VIELVORSWORD = EnumHelper.addToolMaterial("VIELVORSWORD", 16, 4200, 32, 56, 10);

    public static void configureTools(Configuration config) {
        // urotark
        urotarkaxe = new Vgaxe(config.get("Urotark IDs", "Urotark Axe", 9100).getInt(), UROTARKTOOLS).setUnlocalizedName("urotarkaxe").setCreativeTab(CreativetabHandler.vgtab3);
        urotarkhoe = new Vghoe(config.get("Urotark IDs", "Urotark Hoe", 9101).getInt(), UROTARKTOOLS).setUnlocalizedName("urotarkhoe").setCreativeTab(CreativetabHandler.vgtab3);
        urotarkshovel = new Vgshovel(config.get("Urotark IDs", "Urotark Shovel", 9102).getInt(), UROTARKTOOLS).setUnlocalizedName("urotarkshovel").setCreativeTab(CreativetabHandler.vgtab3);
        urotarksword = new Vgsword(config.get("Urotark IDs", "Urotark Sword", 9103).getInt(), UROTARKSWORD).setUnlocalizedName("urotarksword").setCreativeTab(CreativetabHandler.vgtab4);
        urotarkpickaxe = new Vgpickaxe(config.get("Urotark IDs", "Urotark Pickaxe", 9104).getInt(), UROTARKTOOLS).setUnlocalizedName("urotarkpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // pearl
        pearlaxe = new Vgaxe(config.get("Pearl IDs", "Pearl Axe", 9105).getInt(), PEARLTOOLS).setUnlocalizedName("pearlaxe").setCreativeTab(CreativetabHandler.vgtab3);
        pearlhoe = new Vghoe(config.get("Pearl IDs", "Pearl Hoe", 9106).getInt(), PEARLTOOLS).setUnlocalizedName("pearlhoe").setCreativeTab(CreativetabHandler.vgtab3);
        pearlshovel = new Vgshovel(config.get("Pearl IDs", "Pearl Shovel", 9107).getInt(), PEARLTOOLS).setUnlocalizedName("pearlshovel").setCreativeTab(CreativetabHandler.vgtab3);
        pearlsword = new Vgsword(config.get("Pearl IDs", "Pearl Sword", 9108).getInt(), PEARLSWORD).setUnlocalizedName("pearlsword").setCreativeTab(CreativetabHandler.vgtab4);
        pearlpickaxe = new Vgpickaxe(config.get("Pearl IDs", "Pearl Pickaxe", 9109).getInt(), PEARLTOOLS).setUnlocalizedName("pearlpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // sapphire
        sapphireaxe = new Vgaxe(config.get("Sapphire IDs", "Sapphire Axe", 9110).getInt(), SAPPHIRETOOLS).setUnlocalizedName("sapphireaxe").setCreativeTab(CreativetabHandler.vgtab3);
        sapphirehoe = new Vghoe(config.get("Sapphire IDs", "Sapphire Hoe", 9111).getInt(), SAPPHIRETOOLS).setUnlocalizedName("sapphirehoe").setCreativeTab(CreativetabHandler.vgtab3);
        sapphireshovel = new Vgshovel(config.get("Sapphire IDs", "Sapphire Shovel", 9112).getInt(), SAPPHIRETOOLS).setUnlocalizedName("sapphireshovel").setCreativeTab(CreativetabHandler.vgtab3);
        sapphiresword = new Vgsword(config.get("Sapphire IDs", "Sapphire Sword", 9113).getInt(), SAPPHIRESWORD).setUnlocalizedName("sapphiresword").setCreativeTab(CreativetabHandler.vgtab4);
        sapphirepickaxe = new Vgpickaxe(config.get("Sapphire IDs", "Sapphire Pickaxe", 9114).getInt(), SAPPHIRETOOLS).setUnlocalizedName("sapphirepickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // muscovite
        muscoviteaxe = new Vgaxe(config.get("muscovite IDs", "muscovite Axe", 9115).getInt(), MUSCOVITETOOLS).setUnlocalizedName("muscoviteaxe").setCreativeTab(CreativetabHandler.vgtab3);
        muscovitehoe = new Vghoe(config.get("muscovite IDs", "muscovite Hoe", 9116).getInt(), MUSCOVITETOOLS).setUnlocalizedName("muscovitehoe").setCreativeTab(CreativetabHandler.vgtab3);
        muscoviteshovel = new Vgshovel(config.get("muscovite IDs", "muscovite Shovel", 9117).getInt(), MUSCOVITETOOLS).setUnlocalizedName("muscoviteshovel").setCreativeTab(CreativetabHandler.vgtab3);
        muscovitesword = new Vgsword(config.get("muscovite IDs", "muscovite Sword", 9118).getInt(), MUSCOVITESWORD).setUnlocalizedName("muscovitesword").setCreativeTab(CreativetabHandler.vgtab4);
        muscovitepickaxe = new Vgpickaxe(config.get("muscovite IDs", "muscovite Pickaxe", 9119).getInt(), MUSCOVITETOOLS).setUnlocalizedName("muscovitepickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // ruby
        rubyaxe = new Vgaxe(config.get("Ruby IDs", "Ruby Axe", 9120).getInt(), RUBYTOOLS).setUnlocalizedName("rubyaxe").setCreativeTab(CreativetabHandler.vgtab3);
        rubyhoe = new Vghoe(config.get("Ruby IDs", "Ruby Hoe", 9121).getInt(), RUBYTOOLS).setUnlocalizedName("rubyhoe").setCreativeTab(CreativetabHandler.vgtab3);
        rubyshovel = new Vgshovel(config.get("Ruby IDs", "Ruby Shovel", 9122).getInt(), RUBYTOOLS).setUnlocalizedName("rubyshovel").setCreativeTab(CreativetabHandler.vgtab3);
        rubysword = new Vgsword(config.get("Ruby IDs", "Ruby Sword", 9123).getInt(), RUBYSWORD).setUnlocalizedName("rubysword").setCreativeTab(CreativetabHandler.vgtab4);
        rubypickaxe = new Vgpickaxe(config.get("Ruby IDs", "Ruby Pickaxe", 9124).getInt(), RUBYTOOLS).setUnlocalizedName("rubypickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // uriotyke
        uriotykeaxe = new Vgaxe(config.get("Uriotyke IDs", "Uriotyke Axe", 9125).getInt(), URIOTYKETOOLS).setUnlocalizedName("uriotykeaxe").setCreativeTab(CreativetabHandler.vgtab3);
        uriotykehoe = new Vghoe(config.get("Uriotyke IDs", "Uriotyke Hoe", 9126).getInt(), URIOTYKETOOLS).setUnlocalizedName("uriotykehoe").setCreativeTab(CreativetabHandler.vgtab3);
        uriotykeshovel = new Vgshovel(config.get("Uriotyke IDs", "Uriotyke Shovel", 9127).getInt(), URIOTYKETOOLS).setUnlocalizedName("uriotykeshovel").setCreativeTab(CreativetabHandler.vgtab3);
        uriotykesword = new Vgsword(config.get("Uriotyke IDs", "Uriotyke Sword", 9128).getInt(), URIOTYKESWORD).setUnlocalizedName("uriotykesword").setCreativeTab(CreativetabHandler.vgtab4);
        uriotykepickaxe = new Vgpickaxe(config.get("Uriotyke IDs", "Uriotyke Pickaxe", 9129).getInt(), URIOTYKETOOLS).setUnlocalizedName("uriotykepickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // gilder
        gilderaxe = new Vgaxe(config.get("Gilder IDs", "Gilder Axe", 9130).getInt(), GILDERTOOLS).setUnlocalizedName("gilderaxe").setCreativeTab(CreativetabHandler.vgtab3);
        gilderhoe = new Vghoe(config.get("Gilder IDs", "Gilder Hoe", 9140).getInt(), GILDERTOOLS).setUnlocalizedName("gilderhoe").setCreativeTab(CreativetabHandler.vgtab3);
        gildershovel = new Vgshovel(config.get("Gilder IDs", "Gilder Shovel", 9142).getInt(), GILDERTOOLS).setUnlocalizedName("gildershovel").setCreativeTab(CreativetabHandler.vgtab3);
        gildersword = new Vgsword(config.get("Gilder IDs", "Gilder Sword", 9143).getInt(), GILDERSWORD).setUnlocalizedName("gildersword").setCreativeTab(CreativetabHandler.vgtab4);
        gilderpickaxe = new Vgpickaxe(config.get("Gilder IDs", "Gilder Pickaxe", 9144).getInt(), GILDERTOOLS).setUnlocalizedName("gilderpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // selovar
        selovaraxe = new Vgaxe(config.get("Selovar IDs", "Selovar Axe", 9145).getInt(), SELOVARTOOLS).setUnlocalizedName("selovaraxe").setCreativeTab(CreativetabHandler.vgtab3);
        selovarhoe = new Vghoe(config.get("Selovar IDs", "Selovar Hoe", 9146).getInt(), SELOVARTOOLS).setUnlocalizedName("selovarhoe").setCreativeTab(CreativetabHandler.vgtab3);
        selovarshovel = new Vgshovel(config.get("Selovar IDs", "Selovar Shovel", 9147).getInt(), SELOVARTOOLS).setUnlocalizedName("selovarshovel").setCreativeTab(CreativetabHandler.vgtab3);
        selovarsword = new Vgsword(config.get("Selovar IDs", "Selovar Sword", 9148).getInt(), SELOVARSWORD).setUnlocalizedName("selovarsword").setCreativeTab(CreativetabHandler.vgtab4);
        selovarpickaxe = new Vgpickaxe(config.get("Selovar IDs", "Selovar Pickaxe", 9149).getInt(), SELOVARTOOLS).setUnlocalizedName("selovarpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // parfilian
        parfilianaxe = new Vgaxe(config.get("Parfilian IDs", "Parfilian Axe", 9150).getInt(), PARFILIANTOOLS).setUnlocalizedName("parfilianaxe").setCreativeTab(CreativetabHandler.vgtab3);
        parfilianhoe = new Vghoe(config.get("Parfilian IDs", "Parfilian Hoe", 9151).getInt(), PARFILIANTOOLS).setUnlocalizedName("parfilianhoe").setCreativeTab(CreativetabHandler.vgtab3);
        parfilianshovel = new Vgshovel(config.get("Parfilian IDs", "Parfilian Shovel", 9152).getInt(), PARFILIANTOOLS).setUnlocalizedName("parfilianshovel").setCreativeTab(CreativetabHandler.vgtab3);
        parfiliansword = new Vgsword(config.get("Parfilian IDs", "Parfilian Sword", 9153).getInt(), PARFILIANSWORD).setUnlocalizedName("parfiliansword").setCreativeTab(CreativetabHandler.vgtab4);
        parfilianpickaxe = new Vgpickaxe(config.get("Parfilian IDs", "Parfilian Pickaxe", 9154).getInt(), PARFILIANTOOLS).setUnlocalizedName("parfilianpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // barium
        bariumaxe = new Vgaxe(config.get("Barium IDs", "Barium Axe", 9155).getInt(), BARIUMTOOLS).setUnlocalizedName("bariumaxe").setCreativeTab(CreativetabHandler.vgtab3);
        bariumhoe = new Vghoe(config.get("Barium IDs", "Barium Hoe", 9156).getInt(), BARIUMTOOLS).setUnlocalizedName("bariumhoe").setCreativeTab(CreativetabHandler.vgtab3);
        bariumshovel = new Vgshovel(config.get("Barium IDs", "Barium Shovel", 9157).getInt(), BARIUMTOOLS).setUnlocalizedName("bariumshovel").setCreativeTab(CreativetabHandler.vgtab3);
        bariumsword = new Vgsword(config.get("Barium IDs", "Barium Sword", 9158).getInt(), BARIUMSWORD).setUnlocalizedName("bariumsword").setCreativeTab(CreativetabHandler.vgtab4);
        bariumpickaxe = new Vgpickaxe(config.get("Barium IDs", "Barium Pickaxe", 9159).getInt(), BARIUMTOOLS).setUnlocalizedName("bariumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // radium
        radiumaxe = new Vgaxe(config.get("Radium IDs", "Radium Axe", 9160).getInt(), RADIUMTOOLS).setUnlocalizedName("radiumaxe").setCreativeTab(CreativetabHandler.vgtab3);
        radiumhoe = new Vghoe(config.get("Radium IDs", "Radium Hoe", 9161).getInt(), RADIUMTOOLS).setUnlocalizedName("radiumhoe").setCreativeTab(CreativetabHandler.vgtab3);
        radiumshovel = new Vgshovel(config.get("Radium IDs", "Radium Shovel", 9162).getInt(), RADIUMTOOLS).setUnlocalizedName("radiumshovel").setCreativeTab(CreativetabHandler.vgtab3);
        radiumsword = new Vgsword(config.get("Radium IDs", "Radium Sword", 9163).getInt(), RADIUMSWORD).setUnlocalizedName("radiumsword").setCreativeTab(CreativetabHandler.vgtab4);
        radiumpickaxe = new Vgpickaxe(config.get("Radium IDs", "Radium Pickaxe", 9164).getInt(), RADIUMTOOLS).setUnlocalizedName("radiumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // gallum
        gallumaxe = new Vgaxe(config.get("Gallum IDs", "Gallum Axe", 9165).getInt(), GALLUMTOOLS).setUnlocalizedName("gallumaxe").setCreativeTab(CreativetabHandler.vgtab3);
        gallumhoe = new Vghoe(config.get("Gallum IDs", "Gallum Hoe", 9166).getInt(), GALLUMTOOLS).setUnlocalizedName("gallumhoe").setCreativeTab(CreativetabHandler.vgtab3);
        gallumshovel = new Vgshovel(config.get("Gallum IDs", "Gallum Shovel", 9167).getInt(), GALLUMTOOLS).setUnlocalizedName("gallumshovel").setCreativeTab(CreativetabHandler.vgtab3);
        gallumsword = new Vgsword(config.get("Gallum IDs", "Gallum Sword", 9168).getInt(), GALLUMSWORD).setUnlocalizedName("gallumsword").setCreativeTab(CreativetabHandler.vgtab4);
        gallumpickaxe = new Vgpickaxe(config.get("Gallum IDs", "Gallum Pickaxe", 9169).getInt(), GALLUMTOOLS).setUnlocalizedName("gallumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // vanadium
        vanadiumaxe = new Vgaxe(config.get("Vanadium IDs", "Vanadium Axe", 9170).getInt(), VANADIUMTOOLS).setUnlocalizedName("vanadiumaxe").setCreativeTab(CreativetabHandler.vgtab3);
        vanadiumhoe = new Vghoe(config.get("Vanadium IDs", "Vanadium Hoe", 9172).getInt(), VANADIUMTOOLS).setUnlocalizedName("vanadiumhoe").setCreativeTab(CreativetabHandler.vgtab3);
        vanadiumshovel = new Vgshovel(config.get("Vanadium IDs", "Vanadium Shovel", 9173).getInt(), VANADIUMTOOLS).setUnlocalizedName("vanadiumshovel").setCreativeTab(CreativetabHandler.vgtab3);
        vanadiumsword = new Vgsword(config.get("Vanadium IDs", "Vanadium Sword", 9174).getInt(), VANADIUMSWORD).setUnlocalizedName("vanadiumsword").setCreativeTab(CreativetabHandler.vgtab4);
        vanadiumpickaxe = new Vgpickaxe(config.get("Vanadium IDs", "Vanadium Pickaxe", 9175).getInt(), VANADIUMTOOLS).setUnlocalizedName("vanadiumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // scandium
        scandiumaxe = new Vgaxe(config.get("Scandium IDs", "Scandium Axe", 9176).getInt(), SCANDIUMTOOLS).setUnlocalizedName("scandiumaxe").setCreativeTab(CreativetabHandler.vgtab3);
        scandiumhoe = new Vghoe(config.get("Scandium IDs", "Scandium Hoe", 9177).getInt(), SCANDIUMTOOLS).setUnlocalizedName("scandiumhoe").setCreativeTab(CreativetabHandler.vgtab3);
        scandiumshovel = new Vgshovel(config.get("Scandium IDs", "Scandium Shovel", 9178).getInt(), SCANDIUMTOOLS).setUnlocalizedName("scandiumshovel").setCreativeTab(CreativetabHandler.vgtab3);
        scandiumsword = new Vgsword(config.get("Scandium IDs", "Scandium Sword", 9179).getInt(), SCANDIUMSWORD).setUnlocalizedName("scandiumsword").setCreativeTab(CreativetabHandler.vgtab4);
        scandiumpickaxe = new Vgpickaxe(config.get("Scandium IDs", "Scandium Pickaxe", 9180).getInt(), SCANDIUMTOOLS).setUnlocalizedName("scandiumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // bismuth
        bismuthaxe = new Vgaxe(config.get("Bismuth IDs", "Bismuth Axe", 9181).getInt(), BISMUTHTOOLS).setUnlocalizedName("bismuthaxe").setCreativeTab(CreativetabHandler.vgtab3);
        bismuthhoe = new Vghoe(config.get("Bismuth IDs", "Bismuth Hoe", 9182).getInt(), BISMUTHTOOLS).setUnlocalizedName("bismuthhoe").setCreativeTab(CreativetabHandler.vgtab3);
        bismuthshovel = new Vgshovel(config.get("Bismuth IDs", "Bismuth Shovel", 9183).getInt(), BISMUTHTOOLS).setUnlocalizedName("bismuthshovel").setCreativeTab(CreativetabHandler.vgtab3);
        bismuthsword = new Vgsword(config.get("Bismuth IDs", "Bismuth Sword", 9184).getInt(), BISMUTHSWORD).setUnlocalizedName("bismuthsword").setCreativeTab(CreativetabHandler.vgtab4);
        bismuthpickaxe = new Vgpickaxe(config.get("Bismuth IDs", "Bismuth Pickaxe", 9185).getInt(), BISMUTHTOOLS).setUnlocalizedName("bismuthpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // indium
        indiumaxe = new Vgaxe(config.get("Indium IDs", "Indium Axe", 9186).getInt(), INDIUMTOOLS).setUnlocalizedName("indiumaxe").setCreativeTab(CreativetabHandler.vgtab3);
        indiumhoe = new Vghoe(config.get("Indium IDs", "Indium Hoe", 9187).getInt(), INDIUMTOOLS).setUnlocalizedName("indiumhoe").setCreativeTab(CreativetabHandler.vgtab3);
        indiumshovel = new Vgshovel(config.get("Indium IDs", "Indium Shovel", 9188).getInt(), INDIUMTOOLS).setUnlocalizedName("indiumshovel").setCreativeTab(CreativetabHandler.vgtab3);
        indiumsword = new Vgsword(config.get("Indium IDs", "Indium Sword", 9189).getInt(), INDIUMSWORD).setUnlocalizedName("indiumsword").setCreativeTab(CreativetabHandler.vgtab4);
        indiumpickaxe = new Vgpickaxe(config.get("Indium IDs", "Indium Pickaxe", 9190).getInt(), INDIUMTOOLS).setUnlocalizedName("indiumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // platinum
        platinumaxe = new Vgaxe(config.get("Platinum IDs", "Platinum Axe", 9191).getInt(), PLATINUMTOOLS).setUnlocalizedName("platinumaxe").setCreativeTab(CreativetabHandler.vgtab3);
        platinumhoe = new Vghoe(config.get("Platinum IDs", "Platinum Hoe", 9192).getInt(), PLATINUMTOOLS).setUnlocalizedName("platinumhoe").setCreativeTab(CreativetabHandler.vgtab3);
        platinumshovel = new Vgshovel(config.get("Platinum IDs", "Platinum Shovel", 9193).getInt(), PLATINUMTOOLS).setUnlocalizedName("platinumshovel").setCreativeTab(CreativetabHandler.vgtab3);
        platinumsword = new Vgsword(config.get("Platinum IDs", "Platinum Sword", 9194).getInt(), PLATINUMSWORD).setUnlocalizedName("platinumsword").setCreativeTab(CreativetabHandler.vgtab4);
        platinumpickaxe = new Vgpickaxe(config.get("Platinum IDs", "Platinum Pickaxe", 9195).getInt(), PLATINUMTOOLS).setUnlocalizedName("platinumpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // darkness
        darknessaxe = new Vgaxe(config.get("Darkness IDs", "Darkness Axe", 9196).getInt(), DARKNESSTOOLS).setUnlocalizedName("darknessaxe").setCreativeTab(CreativetabHandler.vgtab3);
        darknesshoe = new Vghoe(config.get("Darkness IDs", "Darkness Hoe", 9197).getInt(), DARKNESSTOOLS).setUnlocalizedName("darknesshoe").setCreativeTab(CreativetabHandler.vgtab3);
        darknessshovel = new Vgshovel(config.get("Darkness IDs", "Darkness Shovel", 9198).getInt(), DARKNESSTOOLS).setUnlocalizedName("darknessshovel").setCreativeTab(CreativetabHandler.vgtab3);
        darknesssword = new Vgsword(config.get("Darkness IDs", "Darkness Sword", 9199).getInt(), DARKNESSSWORD).setUnlocalizedName("darknesssword").setCreativeTab(CreativetabHandler.vgtab4);
        darknesspickaxe = new Vgpickaxe(config.get("Darkness IDs", "Darkness Pickaxe", 9200).getInt(), DARKNESSTOOLS).setUnlocalizedName("darknesspickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // light
        lightaxe = new Vgaxe(config.get("Light IDs", "Light Axe", 9201).getInt(), LIGHTTOOLS).setUnlocalizedName("lightaxe").setCreativeTab(CreativetabHandler.vgtab3);
        lighthoe = new Vghoe(config.get("Light IDs", "Light Hoe", 9202).getInt(), LIGHTTOOLS).setUnlocalizedName("lighthoe").setCreativeTab(CreativetabHandler.vgtab3);
        lightshovel = new Vgshovel(config.get("Light IDs", "Light Shovel", 9203).getInt(), LIGHTTOOLS).setUnlocalizedName("lightshovel").setCreativeTab(CreativetabHandler.vgtab3);
        lightsword = new Vgsword(config.get("Light IDs", "Light Sword", 9204).getInt(), LIGHTSWORD).setUnlocalizedName("lightsword").setCreativeTab(CreativetabHandler.vgtab4);
        lightpickaxe = new Vgpickaxe(config.get("Light IDs", "Light Pickaxe", 9205).getInt(), LIGHTTOOLS).setUnlocalizedName("lightpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // omega
        omegaaxe = new Vgaxe(config.get("Omega IDs", "Omega Axe", 9206).getInt(), OMEGATOOLS).setUnlocalizedName("omegaaxe").setCreativeTab(CreativetabHandler.vgtab3);
        omegahoe = new Vghoe(config.get("Omega IDs", "Omega Hoe", 9207).getInt(), OMEGATOOLS).setUnlocalizedName("omegahoe").setCreativeTab(CreativetabHandler.vgtab3);
        omegashovel = new Vgshovel(config.get("Omega IDs", "Omega Shovel", 9208).getInt(), OMEGATOOLS).setUnlocalizedName("omegashovel").setCreativeTab(CreativetabHandler.vgtab3);
        omegasword = new Vgsword(config.get("Omega IDs", "Omega Sword", 9209).getInt(), OMEGASWORD).setUnlocalizedName("omegasword").setCreativeTab(CreativetabHandler.vgtab4);
        omegahand = new Vgsword(config.get("Omega IDs", "Omega Hand", 9210).getInt(), OMEGASWORD).setUnlocalizedName("omegahand").setCreativeTab(CreativetabHandler.vgtab4);
        omegapickaxe = new Vgpickaxe(config.get("Omega IDs", "Omega Pickaxe", 9211).getInt(), OMEGATOOLS).setUnlocalizedName("omegapickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // bubble
        bubblesword = new Vgsword(config.get("Bubble IDs", "Bubble Sword", 9212).getInt(), BUBBLESWORD).setUnlocalizedName("bubblesword").setCreativeTab(CreativetabHandler.vgtab4);
        // Berionvar
        berionvaraxe = new Vgaxe(config.get("Berionvar IDs", "Berionvar Axe", 9213).getInt(), BERIONVARTOOLS).setUnlocalizedName("berionvaraxe").setCreativeTab(CreativetabHandler.vgtab3);
        berionvarhoe = new Vghoe(config.get("Berionvar IDs", "Berionvar Hoe", 9214).getInt(), BERIONVARTOOLS).setUnlocalizedName("berionvarhoe").setCreativeTab(CreativetabHandler.vgtab3);
        berionvarshovel = new Vgshovel(config.get("Berionvar IDs", "Berionvar Shovel", 9215).getInt(), BERIONVARTOOLS).setUnlocalizedName("berionvarshovel").setCreativeTab(CreativetabHandler.vgtab3);
        berionvarsword = new Vgsword(config.get("Berionvar IDs", "Berionvar Sword", 9216).getInt(), BERIONVARSWORD).setUnlocalizedName("berionvarsword").setCreativeTab(CreativetabHandler.vgtab4);
        berionvarpickaxe = new Vgpickaxe(config.get("Berionvar IDs", "Berionvar Pickaxe", 9217).getInt(), BERIONVARTOOLS).setUnlocalizedName("berionvarpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // Charviole
        charvioleaxe = new Vgaxe(config.get("Charviole IDs", "Charviole Axe", 9218).getInt(), CHARVIOLETOOLS).setUnlocalizedName("charvioleaxe").setCreativeTab(CreativetabHandler.vgtab3);
        charviolehoe = new Vghoe(config.get("Charviole IDs", "Charviole Hoe", 9219).getInt(), CHARVIOLETOOLS).setUnlocalizedName("charviolehoe").setCreativeTab(CreativetabHandler.vgtab3);
        charvioleshovel = new Vgshovel(config.get("Charviole IDs", "Charviole Shovel", 9220).getInt(), CHARVIOLETOOLS).setUnlocalizedName("charvioleshovel").setCreativeTab(CreativetabHandler.vgtab3);
        charviolesword = new Vgsword(config.get("Charviole IDs", "Charviole Sword", 9221).getInt(), CHARVIOLESWORD).setUnlocalizedName("charviolesword").setCreativeTab(CreativetabHandler.vgtab4);
        charviolepickaxe = new Vgpickaxe(config.get("Charviole IDs", "Charviole Pickaxe", 9222).getInt(), CHARVIOLETOOLS).setUnlocalizedName("charviolepickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // Firlvear
        firlvearaxe = new Vgaxe(config.get("Firlvear IDs", "Firlvear Axe", 9223).getInt(), FIRLVEARTOOLS).setUnlocalizedName("firlvearaxe").setCreativeTab(CreativetabHandler.vgtab3);
        firlvearhoe = new Vghoe(config.get("Firlvear IDs", "Firlvear Hoe", 9224).getInt(), FIRLVEARTOOLS).setUnlocalizedName("firlvearhoe").setCreativeTab(CreativetabHandler.vgtab3);
        firlvearshovel = new Vgshovel(config.get("Firlvear IDs", "Firlvear Shovel", 9225).getInt(), FIRLVEARTOOLS).setUnlocalizedName("firlvearshovel").setCreativeTab(CreativetabHandler.vgtab3);
        firlvearsword = new Vgsword(config.get("Firlvear IDs", "Firlvear Sword", 9226).getInt(), FIRLVEARSWORD).setUnlocalizedName("firlvearsword").setCreativeTab(CreativetabHandler.vgtab4);
        firlvearpickaxe = new Vgpickaxe(config.get("Firlvear IDs", "Firlvear Pickaxe", 9227).getInt(), FIRLVEARTOOLS).setUnlocalizedName("firlvearpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // selmenrer
        selmenreraxe = new Vgaxe(config.get("Selmenrer IDs", "Selmenrer Axe", 9228).getInt(), SELMENRERTOOLS).setUnlocalizedName("selmenreraxe").setCreativeTab(CreativetabHandler.vgtab3);
        selmenrerhoe = new Vghoe(config.get("Selmenrer IDs", "Selmenrer Hoe", 9229).getInt(), SELMENRERTOOLS).setUnlocalizedName("selmenrerhoe").setCreativeTab(CreativetabHandler.vgtab3);
        selmenrershovel = new Vgshovel(config.get("Selmenrer IDs", "Selmenrer Shovel", 9230).getInt(), SELMENRERTOOLS).setUnlocalizedName("selmenrershovel").setCreativeTab(CreativetabHandler.vgtab3);
        selmenrersword = new Vgsword(config.get("Selmenrer IDs", "Selmenrer Sword", 9231).getInt(), SELMENRERSWORD).setUnlocalizedName("selmenrersword").setCreativeTab(CreativetabHandler.vgtab4);
        selmenrerpickaxe = new Vgpickaxe(config.get("Selmenrer IDs", "Selmenrer Pickaxe", 9232).getInt(), SELMENRERTOOLS).setUnlocalizedName("selmenrerpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // verilion
        verilionaxe = new Vgaxe(config.get("Verilion IDs", "Verilion Axe", 9233).getInt(), VERILIONTOOLS).setUnlocalizedName("verilionaxe").setCreativeTab(CreativetabHandler.vgtab3);
        verilionhoe = new Vghoe(config.get("Verilion IDs", "Verilion Hoe", 9234).getInt(), VERILIONTOOLS).setUnlocalizedName("verilionhoe").setCreativeTab(CreativetabHandler.vgtab3);
        verilionshovel = new Vgshovel(config.get("Verilion IDs", "Verilion Shovel", 9235).getInt(), VERILIONTOOLS).setUnlocalizedName("verilionshovel").setCreativeTab(CreativetabHandler.vgtab3);
        verilionsword = new Vgsword(config.get("Verilion IDs", "Verilion Sword", 9236).getInt(), VERILIONSWORD).setUnlocalizedName("verilionsword").setCreativeTab(CreativetabHandler.vgtab4);
        verilionpickaxe = new Vgpickaxe(config.get("Verilion IDs", "Verilion Pickaxe", 9237).getInt(), VERILIONTOOLS).setUnlocalizedName("verilionpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
        // vielvor
        vielvoraxe = new Vgaxe(config.get("Vielvor IDs", "Vielvor Axe", 9238).getInt(), VIELVORTOOLS).setUnlocalizedName("vielvoraxe").setCreativeTab(CreativetabHandler.vgtab3);
        vielvorhoe = new Vghoe(config.get("Vielvor IDs", "Vielvor Hoe", 9239).getInt(), VIELVORTOOLS).setUnlocalizedName("vielvorhoe").setCreativeTab(CreativetabHandler.vgtab3);
        vielvorshovel = new Vgshovel(config.get("Vielvor IDs", "Vielvor Shovel", 9240).getInt(), VIELVORTOOLS).setUnlocalizedName("vielvorshovel").setCreativeTab(CreativetabHandler.vgtab3);
        vielvorsword = new Vgsword(config.get("Vielvor IDs", "Vielvor Sword", 9241).getInt(), VIELVORSWORD).setUnlocalizedName("vielvorsword").setCreativeTab(CreativetabHandler.vgtab4);
        vielvorpickaxe = new Vgpickaxe(config.get("Vielvor IDs", "Vielvor Pickaxe", 9242).getInt(), VIELVORTOOLS).setUnlocalizedName("vielvorpickaxe").setCreativeTab(CreativetabHandler.vgtab3);
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
    }

    public static void setNames(LanguageRegistry registry) {
        // urotark
        registry.addName(urotarkaxe, "Urotark Axe");
        registry.addName(urotarkhoe, "Urotark Hoe");
        registry.addName(urotarkshovel, "Urotark Shovel");
        registry.addName(urotarksword, "Urotark Sword");
        registry.addName(urotarkpickaxe, "Urotark Pickaxe");
        // pearl
        registry.addName(pearlaxe, "Pearl Axe");
        registry.addName(pearlhoe, "Pearl Hoe");
        registry.addName(pearlshovel, "Pearl Shovel");
        registry.addName(pearlsword, "Pearl Sword");
        registry.addName(pearlpickaxe, "Pearl Pickaxe");
        // sapphire
        registry.addName(sapphireaxe, "Sapphire Axe");
        registry.addName(sapphirehoe, "Sapphire Hoe");
        registry.addName(sapphireshovel, "Sapphire Shovel");
        registry.addName(sapphiresword, "Sapphire Sword");
        registry.addName(sapphirepickaxe, "Sapphire Pickaxe");
        // muscovite
        registry.addName(muscoviteaxe, "Muscovite Axe");
        registry.addName(muscovitehoe, "Muscovite Hoe");
        registry.addName(muscoviteshovel, "Muscovite Shovel");
        registry.addName(muscovitesword, "Muscovite Sword");
        registry.addName(muscovitepickaxe, "Muscovite Pickaxe");
        // ruby
        registry.addName(rubyaxe, "Ruby Axe");
        registry.addName(rubyhoe, "Ruby Hoe");
        registry.addName(rubyshovel, "Ruby Shovel");
        registry.addName(rubysword, "Ruby Sword");
        registry.addName(rubypickaxe, "Ruby Pickaxe");
        // uriotyke
        registry.addName(uriotykeaxe, "Uriotyke Axe");
        registry.addName(uriotykehoe, "Uriotyke Hoe");
        registry.addName(uriotykeshovel, "Uriotyke Shovel");
        registry.addName(uriotykesword, "Uriotyke Sword");
        registry.addName(uriotykepickaxe, "Uriotyke Pickaxe");
        // gilder
        registry.addName(gilderaxe, "Gilder Axe");
        registry.addName(gilderhoe, "Gilder Hoe");
        registry.addName(gildershovel, "Gilder Shovel");
        registry.addName(gildersword, "Gilder Sword");
        registry.addName(gilderpickaxe, "Gilder Pickaxe");
        // selovar
        registry.addName(selovaraxe, "Selovar Axe");
        registry.addName(selovarhoe, "Selovar Hoe");
        registry.addName(selovarshovel, "Selovar Shovel");
        registry.addName(selovarsword, "Selovar Sword");
        registry.addName(selovarpickaxe, "Selovar Pickaxe");
        // parfilian
        registry.addName(parfilianaxe, "Parfilian Axe");
        registry.addName(parfilianhoe, "Parfilian Hoe");
        registry.addName(parfilianshovel, "Parfilian Shovel");
        registry.addName(parfiliansword, "Parfilian Sword");
        registry.addName(parfilianpickaxe, "Parfilian Pickaxe");
        // barium
        registry.addName(bariumaxe, "Barium Axe");
        registry.addName(bariumhoe, "Barium Hoe");
        registry.addName(bariumshovel, "Barium Shovel");
        registry.addName(bariumsword, "Barium Sword");
        registry.addName(bariumpickaxe, "Barium Pickaxe");
        // radium
        registry.addName(radiumaxe, "Radium Axe");
        registry.addName(radiumhoe, "Radium Hoe");
        registry.addName(radiumshovel, "Radium Shovel");
        registry.addName(radiumsword, "Radium Sword");
        registry.addName(radiumpickaxe, "Radium Pickaxe");
        // gallum
        registry.addName(gallumaxe, "Gallum Axe");
        registry.addName(gallumhoe, "Gallum Hoe");
        registry.addName(gallumshovel, "Gallum Shovel");
        registry.addName(gallumsword, "Gallum Sword");
        registry.addName(gallumpickaxe, "Gallum Pickaxe");
        // vanadium
        registry.addName(vanadiumaxe, "Vanadium Axe");
        registry.addName(vanadiumhoe, "Vanadium Hoe");
        registry.addName(vanadiumshovel, "Vanadium Shovel");
        registry.addName(vanadiumsword, "Vanadium Sword");
        registry.addName(vanadiumpickaxe, "Vanadium Pickaxe");
        // scandium
        registry.addName(scandiumaxe, "Scandium Axe");
        registry.addName(scandiumhoe, "Scandium Hoe");
        registry.addName(scandiumshovel, "Scandium Shovel");
        registry.addName(scandiumsword, "Scandium Sword");
        registry.addName(scandiumpickaxe, "Scandium Pickaxe");
        // bismuth
        registry.addName(bismuthaxe, "Bismuth Axe");
        registry.addName(bismuthhoe, "Bismuth Hoe");
        registry.addName(bismuthshovel, "Bismuth Shovel");
        registry.addName(bismuthsword, "Bismuth Sword");
        registry.addName(bismuthpickaxe, "Bismuth Pickaxe");
        // indium
        registry.addName(indiumaxe, "Indium Axe");
        registry.addName(indiumhoe, "Indium Hoe");
        registry.addName(indiumshovel, "Indium Shovel");
        registry.addName(indiumsword, "Indium Sword");
        registry.addName(indiumpickaxe, "Indium Pickaxe");
        // platinum
        registry.addName(platinumaxe, "Platinum Axe");
        registry.addName(platinumhoe, "Platinum Hoe");
        registry.addName(platinumshovel, "Platinum Shovel");
        registry.addName(platinumsword, "Platinum Sword");
        registry.addName(platinumpickaxe, "Platinum Pickaxe");
        // darkness
        registry.addName(darknessaxe, "Darkness Axe");
        registry.addName(darknesshoe, "Darkness Hoe");
        registry.addName(darknessshovel, "Darkness Shovel");
        registry.addName(darknesssword, "Darkness Sword");
        registry.addName(darknesspickaxe, "Darkness Pickaxe");
        // light
        registry.addName(lightaxe, "Light Axe");
        registry.addName(lighthoe, "Light Hoe");
        registry.addName(lightshovel, "Light Shovel");
        registry.addName(lightsword, "Light Sword");
        registry.addName(lightpickaxe, "Light Pickaxe");
        // omega
        registry.addName(omegaaxe, "Omega Axe");
        registry.addName(omegahoe, "Omega Hoe");
        registry.addName(omegashovel, "Omega Shovel");
        registry.addName(omegasword, "Omega Sword");
        registry.addName(omegahand, "Omega Hand");
        registry.addName(omegapickaxe, "Omega Pickaxe");
        // bubble
        registry.addName(bubblesword, "Bubble Sword");
        // Berionvar
        registry.addName(berionvaraxe, "Berionvar Axe");
        registry.addName(berionvarhoe, "Berionvar Hoe");
        registry.addName(berionvarshovel, "Berionvar Shovel");
        registry.addName(berionvarsword, "Berionvar Sword");
        registry.addName(berionvarpickaxe, "Berionvar Pickaxe");
        // Charviole
        registry.addName(charvioleaxe, "Charviole Axe");
        registry.addName(charviolehoe, "Charviole Hoe");
        registry.addName(charvioleshovel, "Charviole Shovel");
        registry.addName(charviolesword, "Charviole Sword");
        registry.addName(charviolepickaxe, "Charviole Pickaxe");
        // Firlvear
        registry.addName(firlvearaxe, "Firlvear Axe");
        registry.addName(firlvearhoe, "Firlvear Hoe");
        registry.addName(firlvearshovel, "Firlvear Shovel");
        registry.addName(firlvearsword, "Firlvear Sword");
        registry.addName(firlvearpickaxe, "Firlvear Pickaxe");
        // selmenrer
        registry.addName(selmenreraxe, "Selmenrer Axe");
        registry.addName(selmenrerhoe, "Selmenrer Hoe");
        registry.addName(selmenrershovel, "Selmenrer Shovel");
        registry.addName(selmenrersword, "Selmenrer Sword");
        registry.addName(selmenrerpickaxe, "Selmenrer Pickaxe");
        // verilion
        registry.addName(verilionaxe, "Verilion Axe");
        registry.addName(verilionhoe, "Verilion Hoe");
        registry.addName(verilionshovel, "Verilion Shovel");
        registry.addName(verilionsword, "Verilion Sword");
        registry.addName(verilionpickaxe, "Verilion Pickaxe");
        // vielvor
        registry.addName(vielvoraxe, "Vielvor Axe");
        registry.addName(vielvorhoe, "Vielvor Hoe");
        registry.addName(vielvorshovel, "Vielvor Shovel");
        registry.addName(vielvorsword, "Vielvor Sword");
        registry.addName(vielvorpickaxe, "Vielvor Pickaxe");
    }

    public static void setToolClass(MinecraftForge registry) {
        // urotark
        registry.setToolClass(urotarkaxe, "axe", 4);
        registry.setToolClass(urotarkhoe, "hoe", 4);
        registry.setToolClass(urotarkshovel, "shovel", 4);
        registry.setToolClass(urotarksword, "sword", 4);
        registry.setToolClass(urotarkpickaxe, "pickaxe", 4);
        // pearl
        registry.setToolClass(pearlaxe, "axe", 4);
        registry.setToolClass(pearlhoe, "hoe", 4);
        registry.setToolClass(pearlshovel, "shovel", 4);
        registry.setToolClass(pearlsword, "sword", 4);
        registry.setToolClass(pearlpickaxe, "pickaxe", 4);
        // sapphire
        registry.setToolClass(sapphireaxe, "axe", 4);
        registry.setToolClass(sapphirehoe, "hoe", 4);
        registry.setToolClass(sapphireshovel, "shovel", 4);
        registry.setToolClass(sapphiresword, "sword", 4);
        registry.setToolClass(sapphirepickaxe, "pickaxe", 4);
        // muscovite
        registry.setToolClass(muscoviteaxe, "axe", 5);
        registry.setToolClass(muscovitehoe, "hoe", 5);
        registry.setToolClass(muscoviteshovel, "shovel", 5);
        registry.setToolClass(muscovitesword, "sword", 5);
        registry.setToolClass(muscovitepickaxe, "pickaxe", 5);
        // ruby
        registry.setToolClass(rubyaxe, "axe", 5);
        registry.setToolClass(rubyhoe, "hoe", 5);
        registry.setToolClass(rubyshovel, "shovel", 5);
        registry.setToolClass(rubysword, "sword", 5);
        registry.setToolClass(rubypickaxe, "pickaxe", 5);
        // uriotyke
        registry.setToolClass(uriotykeaxe, "axe", 5);
        registry.setToolClass(uriotykehoe, "hoe", 5);
        registry.setToolClass(uriotykeshovel, "shovel", 5);
        registry.setToolClass(uriotykesword, "sword", 5);
        registry.setToolClass(uriotykepickaxe, "pickaxe", 5);
        // gilder
        registry.setToolClass(gilderaxe, "axe", 6);
        registry.setToolClass(gilderhoe, "hoe", 6);
        registry.setToolClass(gildershovel, "shovel", 6);
        registry.setToolClass(gildersword, "sword", 6);
        registry.setToolClass(gilderpickaxe, "pickaxe", 6);
        // selovar
        registry.setToolClass(selovaraxe, "axe", 6);
        registry.setToolClass(selovarhoe, "hoe", 6);
        registry.setToolClass(selovarshovel, "shovel", 6);
        registry.setToolClass(selovarsword, "sword", 6);
        registry.setToolClass(selovarpickaxe, "pickaxe", 6);
        // parfilian
        registry.setToolClass(parfilianaxe, "axe", 6);
        registry.setToolClass(parfilianhoe, "hoe", 6);
        registry.setToolClass(parfilianshovel, "shovel", 6);
        registry.setToolClass(parfiliansword, "sword", 6);
        registry.setToolClass(parfilianpickaxe, "pickaxe", 6);
        // barium
        registry.setToolClass(bariumaxe, "axe", 7);
        registry.setToolClass(bariumhoe, "hoe", 7);
        registry.setToolClass(bariumshovel, "shovel", 7);
        registry.setToolClass(bariumsword, "sword", 7);
        registry.setToolClass(bariumpickaxe, "pickaxe", 7);
        // radium
        registry.setToolClass(radiumaxe, "axe", 7);
        registry.setToolClass(radiumhoe, "hoe", 7);
        registry.setToolClass(radiumshovel, "shovel", 7);
        registry.setToolClass(radiumsword, "sword", 7);
        registry.setToolClass(radiumpickaxe, "pickaxe", 7);
        // gallum
        registry.setToolClass(gallumaxe, "axe", 7);
        registry.setToolClass(gallumhoe, "hoe", 7);
        registry.setToolClass(gallumshovel, "shovel", 7);
        registry.setToolClass(gallumsword, "sword", 7);
        registry.setToolClass(gallumpickaxe, "pickaxe", 7);
        // vanadium
        registry.setToolClass(vanadiumaxe, "axe", 8);
        registry.setToolClass(vanadiumhoe, "hoe", 8);
        registry.setToolClass(vanadiumshovel, "shovel", 8);
        registry.setToolClass(vanadiumsword, "sword", 8);
        registry.setToolClass(vanadiumpickaxe, "pickaxe", 8);
        // scandium
        registry.setToolClass(scandiumaxe, "axe", 8);
        registry.setToolClass(scandiumhoe, "hoe", 8);
        registry.setToolClass(scandiumshovel, "shovel", 8);
        registry.setToolClass(scandiumsword, "sword", 8);
        registry.setToolClass(scandiumpickaxe, "pickaxe", 8);
        // bismuth
        registry.setToolClass(bismuthaxe, "axe", 9);
        registry.setToolClass(bismuthhoe, "hoe", 9);
        registry.setToolClass(bismuthshovel, "shovel", 9);
        registry.setToolClass(bismuthsword, "sword", 9);
        registry.setToolClass(bismuthpickaxe, "pickaxe", 9);
        // indium
        registry.setToolClass(indiumaxe, "axe", 9);
        registry.setToolClass(indiumhoe, "hoe", 9);
        registry.setToolClass(indiumshovel, "shovel", 9);
        registry.setToolClass(indiumsword, "sword", 9);
        registry.setToolClass(indiumpickaxe, "pickaxe", 9);
        // platinum
        registry.setToolClass(platinumaxe, "axe", 10);
        registry.setToolClass(platinumhoe, "hoe", 10);
        registry.setToolClass(platinumshovel, "shovel", 10);
        registry.setToolClass(platinumsword, "sword", 10);
        registry.setToolClass(platinumpickaxe, "pickaxe", 10);
        // darkness
        registry.setToolClass(darknessaxe, "axe", 15);
        registry.setToolClass(darknesshoe, "hoe", 15);
        registry.setToolClass(darknessshovel, "shovel", 15);
        registry.setToolClass(darknesssword, "sword", 15);
        registry.setToolClass(darknesspickaxe, "pickaxe", 15);
        // light
        registry.setToolClass(lightaxe, "axe", 15);
        registry.setToolClass(lighthoe, "hoe", 15);
        registry.setToolClass(lightshovel, "shovel", 15);
        registry.setToolClass(lightsword, "sword", 15);
        registry.setToolClass(lightpickaxe, "pickaxe", 15);
        // omega
        registry.setToolClass(omegaaxe, "axe", 20);
        registry.setToolClass(omegahoe, "hoe", 20);
        registry.setToolClass(omegashovel, "shovel", 20);
        registry.setToolClass(omegasword, "sword", 20);
        registry.setToolClass(omegahand, "sword", 20);
        registry.setToolClass(omegapickaxe, "pickaxe", 20);
        // bubble
        registry.setToolClass(bubblesword, "sword", 3);
        // Berionvar
        registry.setToolClass(berionvaraxe, "axe", 11);
        registry.setToolClass(berionvarhoe, "hoe", 11);
        registry.setToolClass(berionvarshovel, "shovel", 11);
        registry.setToolClass(berionvarsword, "sword", 11);
        registry.setToolClass(berionvarpickaxe, "pickaxe", 11);
        // Charviole
        registry.setToolClass(charvioleaxe, "axe", 12);
        registry.setToolClass(charviolehoe, "hoe", 12);
        registry.setToolClass(charvioleshovel, "shovel", 12);
        registry.setToolClass(charviolesword, "sword", 12);
        registry.setToolClass(charviolepickaxe, "pickaxe", 12);
        // Firlvear
        registry.setToolClass(firlvearaxe, "axe", 13);
        registry.setToolClass(firlvearhoe, "hoe", 13);
        registry.setToolClass(firlvearshovel, "shovel", 13);
        registry.setToolClass(firlvearsword, "sword", 13);
        registry.setToolClass(firlvearpickaxe, "pickaxe", 14);
        // selmenrer
        registry.setToolClass(selmenreraxe, "axe", 15);
        registry.setToolClass(selmenrerhoe, "hoe", 15);
        registry.setToolClass(selmenrershovel, "shovel", 15);
        registry.setToolClass(selmenrersword, "sword", 15);
        registry.setToolClass(selmenrerpickaxe, "pickaxe", 15);
        // verilion
        registry.setToolClass(verilionaxe, "axe", 16);
        registry.setToolClass(verilionhoe, "hoe", 16);
        registry.setToolClass(verilionshovel, "shovel", 16);
        registry.setToolClass(verilionsword, "sword", 16);
        registry.setToolClass(verilionpickaxe, "pickaxe", 16);
        // vielvor
        registry.setToolClass(vielvoraxe, "axe", 17);
        registry.setToolClass(vielvorhoe, "hoe", 17);
        registry.setToolClass(vielvorshovel, "shovel", 17);
        registry.setToolClass(vielvorsword, "sword", 17);
        registry.setToolClass(vielvorpickaxe, "pickaxe", 17);
    }

}
