package kakarotvg.omega.handlers;

import kakarotvg.omega.items.VgItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.fluids.FluidContainerRegistry;
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
        urotark = new VgItem(IDHandler.urotarkID).setUnlocalizedName("urotark").setCreativeTab(CreativetabHandler.vgtab2);
        urotarkingot = new VgItem(IDHandler.urotarkingotID).setUnlocalizedName("urotarkingot").setCreativeTab(CreativetabHandler.vgtab2);
        // pearl
        pearl = new VgItem(IDHandler.pearlID).setUnlocalizedName("pearl").setCreativeTab(CreativetabHandler.vgtab2);
        pearlingot = new VgItem(IDHandler.pearlingotID).setUnlocalizedName("pearlingot").setCreativeTab(CreativetabHandler.vgtab2);
        // sapphire
        sapphire = new VgItem(IDHandler.sapphireID).setUnlocalizedName("sapphire").setCreativeTab(CreativetabHandler.vgtab2);
        sapphireingot = new VgItem(IDHandler.sapphireingotID).setUnlocalizedName("sapphireingot").setCreativeTab(CreativetabHandler.vgtab2);
        // muscovite
        muscovite = new VgItem(IDHandler.muscoviteID).setUnlocalizedName("muscovite").setCreativeTab(CreativetabHandler.vgtab2);
        muscoviteingot = new VgItem(IDHandler.muscoviteingotID).setUnlocalizedName("muscoviteingot").setCreativeTab(CreativetabHandler.vgtab2);
        // ruby
        ruby = new VgItem(IDHandler.rubyID).setUnlocalizedName("ruby").setCreativeTab(CreativetabHandler.vgtab2);
        rubyingot = new VgItem(IDHandler.rubyingotID).setUnlocalizedName("rubyingot").setCreativeTab(CreativetabHandler.vgtab2);
        // uriotyke
        uriotyke = new VgItem(IDHandler.uriotykeID).setUnlocalizedName("uriotyke").setCreativeTab(CreativetabHandler.vgtab2);
        uriotykeingot = new VgItem(IDHandler.uriotykeingotID).setUnlocalizedName("uriotykeingot").setCreativeTab(CreativetabHandler.vgtab2);
        // gilder
        gilder = new VgItem(IDHandler.gilderID).setUnlocalizedName("gilder").setCreativeTab(CreativetabHandler.vgtab2);
        gilderingot = new VgItem(IDHandler.gilderingotID).setUnlocalizedName("gilderingot").setCreativeTab(CreativetabHandler.vgtab2);
        // selovar
        selovar = new VgItem(IDHandler.selovarID).setUnlocalizedName("selovar").setCreativeTab(CreativetabHandler.vgtab2);
        selovaringot = new VgItem(IDHandler.selovaringotID).setUnlocalizedName("selovaringot").setCreativeTab(CreativetabHandler.vgtab2);
        // parfilian
        parfilian = new VgItem(IDHandler.parfilianID).setUnlocalizedName("parfilian").setCreativeTab(CreativetabHandler.vgtab2);
        parfilianingot = new VgItem(IDHandler.parfilianingotID).setUnlocalizedName("parfilianingot").setCreativeTab(CreativetabHandler.vgtab2);
        // barium
        barium = new VgItem(IDHandler.bariumID).setUnlocalizedName("barium").setCreativeTab(CreativetabHandler.vgtab2);
        bariumingot = new VgItem(IDHandler.bariumingotID).setUnlocalizedName("bariumingot").setCreativeTab(CreativetabHandler.vgtab2);
        // radium
        radium = new VgItem(IDHandler.radiumID).setUnlocalizedName("radium").setCreativeTab(CreativetabHandler.vgtab2);
        radiumingot = new VgItem(IDHandler.radiumingotID).setUnlocalizedName("radiumingot").setCreativeTab(CreativetabHandler.vgtab2);
        // gallum
        gallum = new VgItem(IDHandler.gallumID).setUnlocalizedName("gallum").setCreativeTab(CreativetabHandler.vgtab2);
        gallumingot = new VgItem(IDHandler.gallumingotID).setUnlocalizedName("gallumingot").setCreativeTab(CreativetabHandler.vgtab2);
        // vanadium
        vanadium = new VgItem(IDHandler.vanadiumID).setUnlocalizedName("vanadium").setCreativeTab(CreativetabHandler.vgtab2);
        vanadiumingot = new VgItem(IDHandler.vanadiumingotID).setUnlocalizedName("vanadiumingot").setCreativeTab(CreativetabHandler.vgtab2);
        // scandium
        scandium = new VgItem(IDHandler.scandiumID).setUnlocalizedName("scandium").setCreativeTab(CreativetabHandler.vgtab2);
        scandiumingot = new VgItem(IDHandler.scandiumingotID).setUnlocalizedName("scandiumingot").setCreativeTab(CreativetabHandler.vgtab2);
        // bismuth
        bismuth = new VgItem(IDHandler.bismuthID).setUnlocalizedName("bismuth").setCreativeTab(CreativetabHandler.vgtab2);
        bismuthingot = new VgItem(IDHandler.bismuthingotID).setUnlocalizedName("bismuthingot").setCreativeTab(CreativetabHandler.vgtab2);
        // indium
        indium = new VgItem(IDHandler.indiumID).setUnlocalizedName("indium").setCreativeTab(CreativetabHandler.vgtab2);
        indiumingot = new VgItem(IDHandler.indiumingotID).setUnlocalizedName("indiumingot").setCreativeTab(CreativetabHandler.vgtab2);
        // platinum
        platinum = new VgItem(IDHandler.platinumID).setUnlocalizedName("platinum").setCreativeTab(CreativetabHandler.vgtab2);
        platinumingot = new VgItem(IDHandler.platinumingotID).setUnlocalizedName("platinumingot").setCreativeTab(CreativetabHandler.vgtab2);
        // darkness
        darkness = new VgItem(IDHandler.darknessID).setUnlocalizedName("darkness").setCreativeTab(CreativetabHandler.vgtab2);
        darknessingot = new VgItem(IDHandler.darknessingotID).setUnlocalizedName("darknessingot").setCreativeTab(CreativetabHandler.vgtab2);
        darknessshard = new VgItem(IDHandler.darknessshardID).setUnlocalizedName("darknessshard").setCreativeTab(CreativetabHandler.vgtab2);
        // light
        light = new VgItem(IDHandler.lightID).setUnlocalizedName("light").setCreativeTab(CreativetabHandler.vgtab2);
        lightingot = new VgItem(IDHandler.lightingotID).setUnlocalizedName("lightingot").setCreativeTab(CreativetabHandler.vgtab2);
        lightshard = new VgItem(IDHandler.lightshardID).setUnlocalizedName("lightshard").setCreativeTab(CreativetabHandler.vgtab2);
        // omega
        omega = new VgItem(IDHandler.omegaID).setUnlocalizedName("omegaanimated").setCreativeTab(CreativetabHandler.vgtab2);
        omegaingot = new VgItem(IDHandler.omegaingotID).setUnlocalizedName("omegaingot").setCreativeTab(CreativetabHandler.vgtab2);
        omegashards = new VgItem(IDHandler.omegashardsID).setUnlocalizedName("omegashards").setCreativeTab(CreativetabHandler.vgtab2);
        // dawn
        dawn = new VgItem(IDHandler.dawnID).setUnlocalizedName("dawn").setCreativeTab(CreativetabHandler.vgtab2);
        dawningot = new VgItem(IDHandler.dawningotID).setUnlocalizedName("dawningot").setCreativeTab(CreativetabHandler.vgtab2);
        // bubble
        bubble = new VgItem(IDHandler.bubbleID).setUnlocalizedName("bubble").setCreativeTab(CreativetabHandler.vgtab2);
        bubbles = new VgItem(IDHandler.bubblesID).setUnlocalizedName("bubbles").setCreativeTab(CreativetabHandler.vgtab2);
        // berionvar
        berionvar = new VgItem(IDHandler.berionvarID).setUnlocalizedName("berionvar").setCreativeTab(CreativetabHandler.vgtab2);
        berionvaringot = new VgItem(IDHandler.berionvaringotID).setUnlocalizedName("berionvaringot").setCreativeTab(CreativetabHandler.vgtab2);
        // charviole
        charviole = new VgItem(IDHandler.charvioleID).setUnlocalizedName("charviole").setCreativeTab(CreativetabHandler.vgtab2);
        charvioleingot = new VgItem(IDHandler.charvioleingotID).setUnlocalizedName("charvioleingot").setCreativeTab(CreativetabHandler.vgtab2);
        // firlvear
        firlvear = new VgItem(IDHandler.firlvearID).setUnlocalizedName("firlvear").setCreativeTab(CreativetabHandler.vgtab2);
        firlvearingot = new VgItem(IDHandler.firlvearingotID).setUnlocalizedName("firlvearingot").setCreativeTab(CreativetabHandler.vgtab2);
        // selmenrer
        selmenrer = new VgItem(IDHandler.selmenrerID).setUnlocalizedName("selmenrer").setCreativeTab(CreativetabHandler.vgtab2);
        selmenreringot = new VgItem(IDHandler.selmenreringotID).setUnlocalizedName("selmenreringot").setCreativeTab(CreativetabHandler.vgtab2);
        // verilion
        verilion = new VgItem(IDHandler.verilionID).setUnlocalizedName("verilion").setCreativeTab(CreativetabHandler.vgtab2);
        verilioningot = new VgItem(IDHandler.verilioningotID).setUnlocalizedName("verilioningot").setCreativeTab(CreativetabHandler.vgtab2);
        // vielvor
        vielvor = new VgItem(IDHandler.vielvorID).setUnlocalizedName("vielvor").setCreativeTab(CreativetabHandler.vgtab2);
        vielvoringot = new VgItem(IDHandler.vielvoringotID).setUnlocalizedName("vielvoringot").setCreativeTab(CreativetabHandler.vgtab2);

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
