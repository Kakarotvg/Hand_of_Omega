package kakarotvg.omega;

import kakarotvg.omega.items.VgItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemHandler {

    // urotark
    public static Item urotark;
    public static Item urotarkingot;
    // pearl
    public static Item pearl;
    public static Item pearlingot;
    // sapphire
    public static Item sapphire;
    public static Item sapphireingot;
    // muscovite
    public static Item muscovite;
    public static Item muscoviteingot;
    // ruby
    public static Item ruby;
    public static Item rubyingot;
    // uriotyke
    public static Item uriotyke;
    public static Item uriotykeingot;
    // gilder
    public static Item gilder;
    public static Item gilderingot;
    // selovar
    public static Item selovar;
    public static Item selovaringot;
    // parfilian
    public static Item parfilian;
    public static Item parfilianingot;
    // barium
    public static Item barium;
    public static Item bariumingot;
    // radium
    public static Item radium;
    public static Item radiumingot;
    // gallum
    public static Item gallum;
    public static Item gallumingot;
    // vanadium
    public static Item vanadium;
    public static Item vanadiumingot;
    // scandium
    public static Item scandium;
    public static Item scandiumingot;
    // bismuth
    public static Item bismuth;
    public static Item bismuthingot;
    // indium
    public static Item indium;
    public static Item indiumingot;
    // platinum
    public static Item platinum;
    public static Item platinumingot;
    // darkness
    public static Item darkness;
    public static Item darknessingot;
    public static Item darknessshard;
    // light
    public static Item light;
    public static Item lightingot;
    public static Item lightshard;
    // omega
    public static Item omega;
    public static Item omegaingot;
    public static Item omegashards;
    // dawn
    public static Item dawn;
    public static Item dawningot;
    // bubble
    public static Item bubble;
    public static Item bubbles;
    // berionvar
    public static Item berionvar;
    public static Item berionvaringot;
    // charviole
    public static Item charviole;
    public static Item charvioleingot;
    // firlvear
    public static Item firlvear;
    public static Item firlvearingot;
    // selmenrer
    public static Item selmenrer;
    public static Item selmenreringot;
    // verilion
    public static Item verilion;
    public static Item verilioningot;
    // vielvor
    public static Item vielvor;
    public static Item vielvoringot;

    public static void configureItems(Configuration config) {
        // urotark
        urotark = new VgItem(config.get("Urotark IDs", "Urotark", 9000).getInt()).setUnlocalizedName("urotark").setCreativeTab(CreativetabHandler.vgtab2);
        urotarkingot = new VgItem(config.get("Urotark IDs", "Urotark Ingot", 9001).getInt()).setUnlocalizedName("urotarkingot").setCreativeTab(CreativetabHandler.vgtab2);
        // pearl
        pearl = new VgItem(config.get("Pearl IDs", "Pearl", 9002).getInt()).setUnlocalizedName("pearl").setCreativeTab(CreativetabHandler.vgtab2);
        pearlingot = new VgItem(config.get("Pearl IDs", "Pearl Ingot", 9003).getInt()).setUnlocalizedName("pearlingot").setCreativeTab(CreativetabHandler.vgtab2);
        // sapphire
        sapphire = new VgItem(config.get("Sapphire IDs", "Sapphire", 9004).getInt()).setUnlocalizedName("sapphire").setCreativeTab(CreativetabHandler.vgtab2);
        sapphireingot = new VgItem(config.get("Sapphire IDs", "Sapphire Ingot", 9005).getInt()).setUnlocalizedName("sapphireingot").setCreativeTab(CreativetabHandler.vgtab2);
        // muscovite
        muscovite = new VgItem(config.get("Muscovite IDs", "Muscovite", 9006).getInt()).setUnlocalizedName("muscovite").setCreativeTab(CreativetabHandler.vgtab2);
        muscoviteingot = new VgItem(config.get("Muscovite IDs", "Muscovite Ingot", 9007).getInt()).setUnlocalizedName("muscoviteingot").setCreativeTab(CreativetabHandler.vgtab2);
        // ruby
        ruby = new VgItem(config.get("Ruby IDs", "Ruby", 9008).getInt()).setUnlocalizedName("ruby").setCreativeTab(CreativetabHandler.vgtab2);
        rubyingot = new VgItem(config.get("Ruby IDs", "Ruby Ingot", 9009).getInt()).setUnlocalizedName("rubyingot").setCreativeTab(CreativetabHandler.vgtab2);
        // uriotyke
        uriotyke = new VgItem(config.get("Uriotyke IDs", "Uriotyke", 9010).getInt()).setUnlocalizedName("uriotyke").setCreativeTab(CreativetabHandler.vgtab2);
        uriotykeingot = new VgItem(config.get("Uriotyke IDs", "Uriotyke Ingot", 9011).getInt()).setUnlocalizedName("uriotykeingot").setCreativeTab(CreativetabHandler.vgtab2);
        // gilder
        gilder = new VgItem(config.get("Gilder IDs", "Gilder", 9012).getInt()).setUnlocalizedName("gilder").setCreativeTab(CreativetabHandler.vgtab2);
        gilderingot = new VgItem(config.get("Gilder IDs", "Gilder Ingot", 9013).getInt()).setUnlocalizedName("gilderingot").setCreativeTab(CreativetabHandler.vgtab2);
        // selovar
        selovar = new VgItem(config.get("Selovar IDs", "Selovar", 9014).getInt()).setUnlocalizedName("selovar").setCreativeTab(CreativetabHandler.vgtab2);
        selovaringot = new VgItem(config.get("Selovar IDs", "Selovar Ingot", 9015).getInt()).setUnlocalizedName("selovaringot").setCreativeTab(CreativetabHandler.vgtab2);
        // parfilian
        parfilian = new VgItem(config.get("Parfilian IDs", "Parfilian", 9016).getInt()).setUnlocalizedName("parfilian").setCreativeTab(CreativetabHandler.vgtab2);
        parfilianingot = new VgItem(config.get("Parfilian IDs", "Parfilian Ingot", 9017).getInt()).setUnlocalizedName("parfilianingot").setCreativeTab(CreativetabHandler.vgtab2);
        // barium
        barium = new VgItem(config.get("Barium IDs", "Barium", 9018).getInt()).setUnlocalizedName("barium").setCreativeTab(CreativetabHandler.vgtab2);
        bariumingot = new VgItem(config.get("Barium IDs", "Barium Ingot", 9019).getInt()).setUnlocalizedName("bariumingot").setCreativeTab(CreativetabHandler.vgtab2);
        // radium
        radium = new VgItem(config.get("Radium IDs", "Radium", 9020).getInt()).setUnlocalizedName("radium").setCreativeTab(CreativetabHandler.vgtab2);
        radiumingot = new VgItem(config.get("Radium IDs", "Radium Ingot", 9021).getInt()).setUnlocalizedName("radiumingot").setCreativeTab(CreativetabHandler.vgtab2);
        // gallum
        gallum = new VgItem(config.get("Gallum IDs", "Gallum", 9022).getInt()).setUnlocalizedName("gallum").setCreativeTab(CreativetabHandler.vgtab2);
        gallumingot = new VgItem(config.get("Gallum IDs", "Gallum Ingot", 9023).getInt()).setUnlocalizedName("gallumingot").setCreativeTab(CreativetabHandler.vgtab2);
        // vanadium
        vanadium = new VgItem(config.get("Vanadium IDs", "Vanadium", 9024).getInt()).setUnlocalizedName("vanadium").setCreativeTab(CreativetabHandler.vgtab2);
        vanadiumingot = new VgItem(config.get("Vanadium IDs", "Vanadium Ingot", 9025).getInt()).setUnlocalizedName("vanadiumingot").setCreativeTab(CreativetabHandler.vgtab2);
        // scandium
        scandium = new VgItem(config.get("Scandium IDs", "Scandium", 9026).getInt()).setUnlocalizedName("scandium").setCreativeTab(CreativetabHandler.vgtab2);
        scandiumingot = new VgItem(config.get("Scandium IDs", "Scandium Ingot", 9027).getInt()).setUnlocalizedName("scandiumingot").setCreativeTab(CreativetabHandler.vgtab2);
        // bismuth
        bismuth = new VgItem(config.get("Bismuth IDs", "Bismuth", 9028).getInt()).setUnlocalizedName("bismuth").setCreativeTab(CreativetabHandler.vgtab2);
        bismuthingot = new VgItem(config.get("Bismuth IDs", "Bismuth Ingot", 9029).getInt()).setUnlocalizedName("bismuthingot").setCreativeTab(CreativetabHandler.vgtab2);
        // indium
        indium = new VgItem(config.get("Indium IDs", "Indium", 9030).getInt()).setUnlocalizedName("indium").setCreativeTab(CreativetabHandler.vgtab2);
        indiumingot = new VgItem(config.get("Indium IDs", "Indium Ingot", 9031).getInt()).setUnlocalizedName("indiumingot").setCreativeTab(CreativetabHandler.vgtab2);
        // platinum
        platinum = new VgItem(config.get("Platinum IDs", "Platinum", 9032).getInt()).setUnlocalizedName("platinum").setCreativeTab(CreativetabHandler.vgtab2);
        platinumingot = new VgItem(config.get("Platinum IDs", "Platinum Ingot", 9033).getInt()).setUnlocalizedName("platinumingot").setCreativeTab(CreativetabHandler.vgtab2);
        // darkness
        darkness = new VgItem(config.get("Darkness IDs", "Darkness", 9034).getInt()).setUnlocalizedName("darkness").setCreativeTab(CreativetabHandler.vgtab2);
        darknessingot = new VgItem(config.get("Darkness IDs", "Darkness Ingot", 9035).getInt()).setUnlocalizedName("darknessingot").setCreativeTab(CreativetabHandler.vgtab2);
        darknessshard = new VgItem(config.get("Darkness IDs", "Darkness Shard", 9036).getInt()).setUnlocalizedName("darknessshard").setCreativeTab(CreativetabHandler.vgtab2);
        // light
        light = new VgItem(config.get("Light IDs", "Light", 9037).getInt()).setUnlocalizedName("light").setCreativeTab(CreativetabHandler.vgtab2);
        lightingot = new VgItem(config.get("Light IDs", "Light Ingot", 9038).getInt()).setUnlocalizedName("lightingot").setCreativeTab(CreativetabHandler.vgtab2);
        lightshard = new VgItem(config.get("Light IDs", "Light Shard", 9039).getInt()).setUnlocalizedName("lightshard").setCreativeTab(CreativetabHandler.vgtab2);
        // omega
        omega = new VgItem(config.get("Omega IDs", "Omega", 9040).getInt()).setUnlocalizedName("omegaanimated").setCreativeTab(CreativetabHandler.vgtab2);
        omegaingot = new VgItem(config.get("Omega IDs", "Omega Ingot", 9041).getInt()).setUnlocalizedName("omegaingot").setCreativeTab(CreativetabHandler.vgtab2);
        omegashards = new VgItem(config.get("Omega IDs", "Omega Shards", 9042).getInt()).setUnlocalizedName("omegashards").setCreativeTab(CreativetabHandler.vgtab2);
        // dawn
        dawn = new VgItem(config.get("Dawn IDs", "Dawn", 9043).getInt()).setUnlocalizedName("dawn").setCreativeTab(CreativetabHandler.vgtab2);
        dawningot = new VgItem(config.get("Dawn IDs", "Dawn Ingot", 9044).getInt()).setUnlocalizedName("dawningot").setCreativeTab(CreativetabHandler.vgtab2);
        // bubble
        bubble = new VgItem(config.get("Bubble IDs", "Bubble", 9045).getInt()).setUnlocalizedName("bubble").setCreativeTab(CreativetabHandler.vgtab2);
        bubbles = new VgItem(config.get("Bubble IDs", "Bubble Ingot", 9046).getInt()).setUnlocalizedName("bubbles").setCreativeTab(CreativetabHandler.vgtab2);
        // berionvar
        berionvar = new VgItem(config.get("Berionvar IDs", "Berionvar", 9047).getInt()).setUnlocalizedName("berionvar").setCreativeTab(CreativetabHandler.vgtab2);
        berionvaringot = new VgItem(config.get("Berionvar IDs", "Berionvar Ingot", 9048).getInt()).setUnlocalizedName("berionvaringot").setCreativeTab(CreativetabHandler.vgtab2);
        // charviole
        charviole = new VgItem(config.get("Charviole IDs", "Charviole", 9049).getInt()).setUnlocalizedName("charviole").setCreativeTab(CreativetabHandler.vgtab2);
        charvioleingot = new VgItem(config.get("Charviole IDs", "Charviole Ingot", 9050).getInt()).setUnlocalizedName("charvioleingot").setCreativeTab(CreativetabHandler.vgtab2);
        // firlvear
        firlvear = new VgItem(config.get("Firlvear IDs", "Firlvear", 9051).getInt()).setUnlocalizedName("firlvear").setCreativeTab(CreativetabHandler.vgtab2);
        firlvearingot = new VgItem(config.get("Firlvear IDs", "Firlvear Ingot", 9052).getInt()).setUnlocalizedName("firlvearingot").setCreativeTab(CreativetabHandler.vgtab2);
        // selmenrer
        selmenrer = new VgItem(config.get("Selmenrer IDs", "Selmenrer", 9053).getInt()).setUnlocalizedName("selmenrer").setCreativeTab(CreativetabHandler.vgtab2);
        selmenreringot = new VgItem(config.get("Selmenrer IDs", "Selmenrer Ingot", 9054).getInt()).setUnlocalizedName("selmenreringot").setCreativeTab(CreativetabHandler.vgtab2);
        // verilion
        verilion = new VgItem(config.get("Verilion IDs", "Verilion", 9055).getInt()).setUnlocalizedName("verilion").setCreativeTab(CreativetabHandler.vgtab2);
        verilioningot = new VgItem(config.get("Verilion IDs", "Verilion Ingot", 9056).getInt()).setUnlocalizedName("verilioningot").setCreativeTab(CreativetabHandler.vgtab2);
        // vielvor
        vielvor = new VgItem(config.get("Vielvor IDs", "Vielvor", 9057).getInt()).setUnlocalizedName("vielvor").setCreativeTab(CreativetabHandler.vgtab2);
        vielvoringot = new VgItem(config.get("Vielvor IDs", "Vielvor Ingot", 9058).getInt()).setUnlocalizedName("vielvoringot").setCreativeTab(CreativetabHandler.vgtab2);

    }

    public static void registerItems(GameRegistry registry) {
        // urotark
        registry.registerItem(urotark, "urotark");
        registry.registerItem(urotarkingot, "urotarkingot");
        // pearl
        registry.registerItem(pearl, "pearl");
        registry.registerItem(pearlingot, "pearlingot");
        // sapphire
        registry.registerItem(sapphire, "sapphire");
        registry.registerItem(sapphireingot, "sapphireingot");
        // muscovite
        registry.registerItem(muscovite, "muscovite");
        registry.registerItem(muscoviteingot, "muscoviteingot");
        // ruby
        registry.registerItem(ruby, "ruby");
        registry.registerItem(rubyingot, "rubyingot");
        // uriotyke
        registry.registerItem(uriotyke, "uriotyke");
        registry.registerItem(uriotykeingot, "uriotykeingot");
        // gilder
        registry.registerItem(gilder, "gilder");
        registry.registerItem(gilderingot, "gilderingot");
        // selovar
        registry.registerItem(selovar, "selovar");
        registry.registerItem(selovaringot, "selovaringot");
        // parfilian
        registry.registerItem(parfilian, "parfilian");
        registry.registerItem(parfilianingot, "parfilianingot");
        // barium
        registry.registerItem(barium, "barium");
        registry.registerItem(bariumingot, "bariumingot");
        // radium
        registry.registerItem(radium, "radium");
        registry.registerItem(radiumingot, "radiumingot");
        // gallum
        registry.registerItem(gallum, "gallum");
        registry.registerItem(gallumingot, "gallumingot");
        // vanadium
        registry.registerItem(vanadium, "vanadium");
        registry.registerItem(vanadiumingot, "vanadiumingot");
        // scandium
        registry.registerItem(scandium, "scandium");
        registry.registerItem(scandiumingot, "scandiumingot");
        // bismuth
        registry.registerItem(bismuth, "bismuth");
        registry.registerItem(bismuthingot, "bismuthingot");
        // indium
        registry.registerItem(indium, "indium");
        registry.registerItem(indiumingot, "indiumingot");
        // platinum
        registry.registerItem(platinum, "platinum");
        registry.registerItem(platinumingot, "platinumingot");
        // darkness
        registry.registerItem(darkness, "darkness");
        registry.registerItem(darknessingot, "darknessingot");
        registry.registerItem(darknessshard, "darknessshard");
        // light
        registry.registerItem(light, "light");
        registry.registerItem(lightingot, "lightingot");
        registry.registerItem(lightshard, "lightshard");
        // omega
        registry.registerItem(omega, "omega");
        registry.registerItem(omegaingot, "omegaingot");
        registry.registerItem(omegashards, "omegashards");
        // dawn
        registry.registerItem(dawn, "dawn");
        registry.registerItem(dawningot, "dawningot");
        // bubble
        registry.registerItem(bubble, "bubble");
        registry.registerItem(bubbles, "bubbles");
        // berionvar
        registry.registerItem(berionvar, "berionvar");
        registry.registerItem(berionvaringot, "berionvaringot");
        // charviole
        registry.registerItem(charviole, "charviole");
        registry.registerItem(charvioleingot, "charvioleingot");
        // firlvear
        registry.registerItem(firlvear, "firlvear");
        registry.registerItem(firlvearingot, "firlvearingot");
        // selmenrer
        registry.registerItem(selmenrer, "selmenrer");
        registry.registerItem(selmenreringot, "selmenreringot");
        // verilion
        registry.registerItem(verilion, "verilion");
        registry.registerItem(verilioningot, "verilioningot");
        // vielvor
        registry.registerItem(vielvor, "vielvor");
        registry.registerItem(vielvoringot, "vielvoringot");

    }

    public static void setNames(LanguageRegistry registry) {
        // urotark
        registry.addName(urotark, "Urotark");
        registry.addName(urotarkingot, "Urotark Ingot");
        // pearl
        registry.addName(pearl, "Pearl");
        registry.addName(pearlingot, "Pearl Ingot");
        // sapphire
        registry.addName(sapphire, "Sapphire");
        registry.addName(sapphireingot, "Sapphire Ingot");
        // muscovite
        registry.addName(muscovite, "Muscovite");
        registry.addName(muscoviteingot, "Muscovite Ingot");
        // ruby
        registry.addName(ruby, "Ruby");
        registry.addName(rubyingot, "Ruby Ingot");
        // uriotyke
        registry.addName(uriotyke, "Uriotyke");
        registry.addName(uriotykeingot, "Uriotyke Ingot");
        // gilder
        registry.addName(gilder, "Gilder");
        registry.addName(gilderingot, "Gilder Ingot");
        // selovar
        registry.addName(selovar, "Selovar");
        registry.addName(selovaringot, "Selovar Ingot");
        // parfilian
        registry.addName(parfilian, "Parfilian");
        registry.addName(parfilianingot, "Parfilian Ingot");
        // barium
        registry.addName(barium, "Barium");
        registry.addName(bariumingot, "Barium Ingot");
        // radium
        registry.addName(radium, "Radium");
        registry.addName(radiumingot, "Radium Ingot");
        // gallum
        registry.addName(gallum, "Gallum");
        registry.addName(gallumingot, "Gallum Ingot");
        // vanadium
        registry.addName(vanadium, "Vanadium");
        registry.addName(vanadiumingot, "Vanadium Ingot");
        // scandium
        registry.addName(scandium, "Scandium");
        registry.addName(scandiumingot, "Scandium Ingot");
        // bismuth
        registry.addName(bismuth, "Bismuth");
        registry.addName(bismuthingot, "Bismuth Ingot");
        // indium
        registry.addName(indium, "Indium");
        registry.addName(indiumingot, "Indium Ingot");
        // platinum
        registry.addName(platinum, "Platinum");
        registry.addName(platinumingot, "Platinum Ingot");
        // darkness
        registry.addName(darkness, "Darkness");
        registry.addName(darknessingot, "Darkness Ingot");
        registry.addName(darknessshard, "Darkness Shard");
        // light
        registry.addName(light, "Light");
        registry.addName(lightingot, "Light Ingot");
        registry.addName(lightshard, "Light Shard");
        // omega
        registry.addName(omega, "Omega");
        registry.addName(omegaingot, "Omega Ingot");
        registry.addName(omegashards, "Omega Shards");
        // dawn
        registry.addName(dawn, "Dawn");
        registry.addName(dawningot, "Dawn Ingot");
        // bubble
        registry.addName(bubble, "Bubble");
        registry.addName(bubbles, "Bubbles");
        // berionvar
        registry.addName(berionvar, "Berionvar");
        registry.addName(berionvaringot, "Berionvar Ingot");
        // charviole
        registry.addName(charviole, "Charviole");
        registry.addName(charvioleingot, "Charviole Ingot");
        // firlvear
        registry.addName(firlvear, "Firlvear");
        registry.addName(firlvearingot, "Firlvear Ingot");
        // selmenrer
        registry.addName(selmenrer, "Selmenrer");
        registry.addName(selmenreringot, "Selmenrer Ingot");
        // verilion
        registry.addName(verilion, "Verilion");
        registry.addName(verilioningot, "Verilion Ingot");
        // vielvor
        registry.addName(vielvor, "Vielvor");
        registry.addName(vielvoringot, "Vielvor Ingot");

    }

}
