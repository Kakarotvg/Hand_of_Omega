package kakarotvg.omega.handlers.IDs;

import net.minecraftforge.common.Configuration;

public class ArmorIDs {

    // config categories
    public static String urotarkids = "Urotark IDs";
    public static String pearlids = "Pearl IDs";
    public static String sapphireids = "Sapphire IDs";
    public static String muscoviteids = "Muscovite IDs";
    public static String rubyids = "Ruby IDs";
    public static String uriotykeids = "Uriotyke IDs";
    public static String gilderids = "Gilder IDs";
    public static String selovarids = "Selovar IDs";
    public static String parfilianids = "Parfilian IDs";
    public static String bariumids = "Barium IDs";
    public static String radiumids = "Radium IDs";
    public static String gallumids = "Gallum IDs";
    public static String vanadiumids = "Vanadium IDs";
    public static String scandiumids = "Scandium IDs";
    public static String bismuthids = "Bismuth IDs";
    public static String indiumids = "Indium IDs";
    public static String platinumids = "Platinum IDs";
    public static String berionvarids = "Berionvar IDs";
    public static String charvioleids = "Charviole IDs";
    public static String firlvearids = "Firlvear IDs";
    public static String selmenrerids = "Selmenrer IDs";
    public static String verilionids = "Verilion IDs";
    public static String vielvorids = "Vielvor IDs";
    public static String darknessids = "Darkness IDs";
    public static String lightids = "Light IDs";
    public static String omegaids = "Omega IDs";
    public static String invisibleids = "Invisible IDs";

    // ARMOR IDS
    // urotark ids
    public static int urotarkhelmID;
    public static int urotarkplateID;
    public static int urotarklegsID;
    public static int urotarkbootsID;
    // pearl ids
    public static int pearlhelmID;
    public static int pearlplateID;
    public static int pearllegsID;
    public static int pearlbootsID;
    // sapphire ids
    public static int sapphirehelmID;
    public static int sapphireplateID;
    public static int sapphirelegsID;
    public static int sapphirebootsID;
    // muscovite ids
    public static int muscovitehelmID;
    public static int muscoviteplateID;
    public static int muscovitelegsID;
    public static int muscovitebootsID;
    // ruby ids
    public static int rubyhelmID;
    public static int rubyplateID;
    public static int rubylegsID;
    public static int rubybootsID;
    // uriotyke ids
    public static int uriotykehelmID;
    public static int uriotykeplateID;
    public static int uriotykelegsID;
    public static int uriotykebootsID;
    // gilder ids
    public static int gilderhelmID;
    public static int gilderplateID;
    public static int gilderlegsID;
    public static int gilderbootsID;
    // selovar ids
    public static int selovarhelmID;
    public static int selovarplateID;
    public static int selovarlegsID;
    public static int selovarbootsID;
    // parfilian ids
    public static int parfilianhelmID;
    public static int parfilianplateID;
    public static int parfilianlegsID;
    public static int parfilianbootsID;
    // barium ids
    public static int bariumhelmID;
    public static int bariumplateID;
    public static int bariumlegsID;
    public static int bariumbootsID;
    // radium ids
    public static int radiumhelmID;
    public static int radiumplateID;
    public static int radiumlegsID;
    public static int radiumbootsID;
    // gallum ids
    public static int gallumhelmID;
    public static int gallumplateID;
    public static int gallumlegsID;
    public static int gallumbootsID;
    // vanadium ids
    public static int vanadiumhelmID;
    public static int vanadiumplateID;
    public static int vanadiumlegsID;
    public static int vanadiumbootsID;
    // scandium ids
    public static int scandiumhelmID;
    public static int scandiumplateID;
    public static int scandiumlegsID;
    public static int scandiumbootsID;
    // bismuth ids
    public static int bismuthhelmID;
    public static int bismuthplateID;
    public static int bismuthlegsID;
    public static int bismuthbootsID;
    // indium ids
    public static int indiumhelmID;
    public static int indiumplateID;
    public static int indiumlegsID;
    public static int indiumbootsID;
    // platinum ids
    public static int platinumhelmID;
    public static int platinumplateID;
    public static int platinumlegsID;
    public static int platinumbootsID;
    // berionvar ids
    public static int berionvarhelmID;
    public static int berionvarplateID;
    public static int berionvarlegsID;
    public static int berionvarbootsID;
    // charviole ids
    public static int charviolehelmID;
    public static int charvioleplateID;
    public static int charviolelegsID;
    public static int charviolebootsID;
    // firlvear ids
    public static int firlvearhelmID;
    public static int firlvearplateID;
    public static int firlvearlegsID;
    public static int firlvearbootsID;
    // selmenrer ids
    public static int selmenrerhelmID;
    public static int selmenrerplateID;
    public static int selmenrerlegsID;
    public static int selmenrerbootsID;
    // verilion ids
    public static int verilionhelmID;
    public static int verilionplateID;
    public static int verilionlegsID;
    public static int verilionbootsID;
    // vielvor ids
    public static int vielvorhelmID;
    public static int vielvorplateID;
    public static int vielvorlegsID;
    public static int vielvorbootsID;
    // darkness ids
    public static int darknesshelmID;
    public static int darknessplateID;
    public static int darknesslegsID;
    public static int darknessbootsID;
    // light ids
    public static int lighthelmID;
    public static int lightplateID;
    public static int lightlegsID;
    public static int lightbootsID;
    // omega ids
    public static int omegahelmID;
    public static int omegaplateID;
    public static int omegalegsID;
    public static int omegabootsID;
    // invisible ids
    public static int invisiblehelmID;
    public static int invisibleplateID;
    public static int invisiblelegsID;
    public static int invisiblebootsID;

    public static void configureArmorIDs(Configuration config) {
        // ARMOR IDS
        // urotark ids
        urotarkhelmID = config.get(urotarkids, "Urotark Helmet", 9400).getInt();
        urotarkplateID = config.get(urotarkids, "Urotark Chestplate", 9401).getInt();
        urotarklegsID = config.get(urotarkids, "Urotark Leggings", 9402).getInt();
        urotarkbootsID = config.get(urotarkids, "Urotark Boots", 9403).getInt();
        // pearl ids
        pearlhelmID = config.get(pearlids, "Pearl Helmet", 9404).getInt();
        pearlplateID = config.get(pearlids, "Pearl Chestplate", 9405).getInt();
        pearllegsID = config.get(pearlids, "Pearl Leggings", 9406).getInt();
        pearlbootsID = config.get(pearlids, "Pearl Boots", 9407).getInt();
        // sapphire ids
        sapphirehelmID = config.get(sapphireids, "Sapphire Helmet", 9408).getInt();
        sapphireplateID = config.get(sapphireids, "Sapphire Chestplate", 9409).getInt();
        sapphirelegsID = config.get(sapphireids, "Sapphire Leggings", 9410).getInt();
        sapphirebootsID = config.get(sapphireids, "Sapphire Boots", 9411).getInt();
        // muscovite ids
        muscovitehelmID = config.get(muscoviteids, "Muscovite Helmet", 9412).getInt();
        muscoviteplateID = config.get(muscoviteids, "Muscovite Chestplate", 9413).getInt();
        muscovitelegsID = config.get(muscoviteids, "Muscovite Leggings", 9414).getInt();
        muscovitebootsID = config.get(muscoviteids, "Muscovite Boots", 9415).getInt();
        // ruby ids
        rubyhelmID = config.get(rubyids, "Ruby Helmet", 9416).getInt();
        rubyplateID = config.get(rubyids, "Ruby Chestplate", 9417).getInt();
        rubylegsID = config.get(rubyids, "Ruby Leggings", 9418).getInt();
        rubybootsID = config.get(rubyids, "Ruby Boots", 9419).getInt();
        // uriotyke ids
        uriotykehelmID = config.get(uriotykeids, "Uriotyke Helmet", 9420).getInt();
        uriotykeplateID = config.get(uriotykeids, "Uriotyke Chestplate", 9421).getInt();
        uriotykelegsID = config.get(uriotykeids, "Uriotyke Leggings", 9422).getInt();
        uriotykebootsID = config.get(uriotykeids, "Uriotyke Boots", 9423).getInt();
        // gilder ids
        gilderhelmID = config.get(gilderids, "Gilder Helmet", 9424).getInt();
        gilderplateID = config.get(gilderids, "Gilder Chestplate", 9425).getInt();
        gilderlegsID = config.get(gilderids, "Gilder Leggings", 9426).getInt();
        gilderbootsID = config.get(gilderids, "Gilder Boots", 9427).getInt();
        // selovar ids
        selovarhelmID = config.get(selovarids, "Selovar Helmet", 9428).getInt();
        selovarplateID = config.get(selovarids, "Selovar Chestplate", 9429).getInt();
        selovarlegsID = config.get(selovarids, "Selovar Leggings", 9430).getInt();
        selovarbootsID = config.get(selovarids, "Selovar Boots", 9431).getInt();
        // parfilian ids
        parfilianhelmID = config.get(parfilianids, "Parfilian Helmet", 9432).getInt();
        parfilianplateID = config.get(parfilianids, "Parfilian Chestplate", 9433).getInt();
        parfilianlegsID = config.get(parfilianids, "Parfilian Leggings", 9434).getInt();
        parfilianbootsID = config.get(parfilianids, "Parfilian Boots", 9435).getInt();
        // barium ids
        bariumhelmID = config.get(bariumids, "Barium Helmet", 9436).getInt();
        bariumplateID = config.get(bariumids, "Barium Chestplate", 9437).getInt();
        bariumlegsID = config.get(bariumids, "Barium Leggings", 9438).getInt();
        bariumbootsID = config.get(bariumids, "Barium Boots", 9439).getInt();
        // radium ids
        radiumhelmID = config.get(radiumids, "Radium Helmet", 9440).getInt();
        radiumplateID = config.get(radiumids, "Radium Chestplate", 9441).getInt();
        radiumlegsID = config.get(radiumids, "Radium Leggings", 9442).getInt();
        radiumbootsID = config.get(radiumids, "Radium Boots", 9443).getInt();
        // gallum ids
        gallumhelmID = config.get(gallumids, "Gallum Helmet", 9444).getInt();
        gallumplateID = config.get(gallumids, "Gallum Chestplate", 9445).getInt();
        gallumlegsID = config.get(gallumids, "Gallum Leggings", 9446).getInt();
        gallumbootsID = config.get(gallumids, "Gallum Boots", 9447).getInt();
        // vanadium ids
        vanadiumhelmID = config.get(vanadiumids, "Vanadium Helmet", 9448).getInt();
        vanadiumplateID = config.get(vanadiumids, "Vanadium Chestplate", 9449).getInt();
        vanadiumlegsID = config.get(vanadiumids, "Vanadium Leggings", 9450).getInt();
        vanadiumbootsID = config.get(vanadiumids, "Vanadium Boots", 9451).getInt();
        // scandium ids
        scandiumhelmID = config.get(scandiumids, "Scandium Helmet", 9452).getInt();
        scandiumplateID = config.get(scandiumids, "Scandium Chestplate", 9453).getInt();
        scandiumlegsID = config.get(scandiumids, "Scandium Leggings", 9454).getInt();
        scandiumbootsID = config.get(scandiumids, "Scandium Boots", 9455).getInt();
        // bismuth ids
        bismuthhelmID = config.get(bismuthids, "Bismuth Helmet", 9456).getInt();
        bismuthplateID = config.get(bismuthids, "Bismuth Chestplate", 9457).getInt();
        bismuthlegsID = config.get(bismuthids, "Bismuth Leggings", 9458).getInt();
        bismuthbootsID = config.get(bismuthids, "Bismuth Boots", 9459).getInt();
        // indium ids
        indiumhelmID = config.get(indiumids, "Indium Helmet", 9460).getInt();
        indiumplateID = config.get(indiumids, "Indium Chestplate", 9461).getInt();
        indiumlegsID = config.get(indiumids, "Indium Leggings", 9462).getInt();
        indiumbootsID = config.get(indiumids, "Indium Boots", 9463).getInt();
        // platinum ids
        platinumhelmID = config.get(platinumids, "Platinum Helmet", 9464).getInt();
        platinumplateID = config.get(platinumids, "Platinum Chestplate", 9465).getInt();
        platinumlegsID = config.get(platinumids, "Platinum Leggings", 9466).getInt();
        platinumbootsID = config.get(platinumids, "Platinum Boots", 9467).getInt();
        // berionvar ids
        berionvarhelmID = config.get(berionvarids, "Berionvar Helmet", 9468).getInt();
        berionvarplateID = config.get(berionvarids, "Berionvar Chestplate", 9469).getInt();
        berionvarlegsID = config.get(berionvarids, "Berionvar Leggings", 9470).getInt();
        berionvarbootsID = config.get(berionvarids, "Berionvar Boots", 9471).getInt();
        // charviole ids
        charviolehelmID = config.get(charvioleids, "Chariole Helmet", 9472).getInt();
        charvioleplateID = config.get(charvioleids, "Chariole Chestplate", 9473).getInt();
        charviolelegsID = config.get(charvioleids, "Chariole Leggings", 9474).getInt();
        charviolebootsID = config.get(charvioleids, "Chariole Boots", 9475).getInt();
        // firlvear ids
        firlvearhelmID = config.get(firlvearids, "Firlvear Helmet", 9476).getInt();
        firlvearplateID = config.get(firlvearids, "Firlvear Chestplate", 9477).getInt();
        firlvearlegsID = config.get(firlvearids, "Firlvear Leggings", 9478).getInt();
        firlvearbootsID = config.get(firlvearids, "Firlvear Boots", 9479).getInt();
        // selmenrer ids
        selmenrerhelmID = config.get(selmenrerids, "Selmenrer Helmet", 9480).getInt();
        selmenrerplateID = config.get(selmenrerids, "Selmenrer Chestplate", 9481).getInt();
        selmenrerlegsID = config.get(selmenrerids, "Selmenrer Leggings", 9482).getInt();
        selmenrerbootsID = config.get(selmenrerids, "Selmenrer Boots", 9483).getInt();
        // verilion ids
        verilionhelmID = config.get(verilionids, "Verilion Helmet", 9484).getInt();
        verilionplateID = config.get(verilionids, "Verilion Chestplate", 9485).getInt();
        verilionlegsID = config.get(verilionids, "Verilion Leggings", 9486).getInt();
        verilionbootsID = config.get(verilionids, "Verilion Boots", 9487).getInt();
        // vielvor ids
        vielvorhelmID = config.get(vielvorids, "Vielvor Helmet", 9488).getInt();
        vielvorplateID = config.get(vielvorids, "Vielvor Chestplate", 9489).getInt();
        vielvorlegsID = config.get(vielvorids, "Vielvor Leggings", 9490).getInt();
        vielvorbootsID = config.get(vielvorids, "Vielvor Boots", 9491).getInt();
        // darkness ids
        darknesshelmID = config.get(darknessids, "Darkness Helmet", 9492).getInt();
        darknessplateID = config.get(darknessids, "Darkness Chestplate", 9493).getInt();
        darknesslegsID = config.get(darknessids, "Darkness Leggings", 9494).getInt();
        darknessbootsID = config.get(darknessids, "Darkness Boots", 9495).getInt();
        // light ids
        lighthelmID = config.get(lightids, "Light Helmet", 9496).getInt();
        lightplateID = config.get(lightids, "Light Chestplate", 9497).getInt();
        lightlegsID = config.get(lightids, "Light Leggings", 9498).getInt();
        lightbootsID = config.get(lightids, "Light Boots", 9499).getInt();
        // omega ids
        omegahelmID = config.get(omegaids, "Omega Helmet", 9500).getInt();
        omegaplateID = config.get(omegaids, "Omega Chestplate", 9501).getInt();
        omegalegsID = config.get(omegaids, "Omega Leggings", 9502).getInt();
        omegabootsID = config.get(omegaids, "Omega Boots", 9503).getInt();
     // invisible ids
        invisiblehelmID = config.get(invisibleids, "Invisible Helmet", 9504).getInt();
        invisibleplateID = config.get(invisibleids, "Invisible Chestplate", 9505).getInt();
        invisiblelegsID = config.get(invisibleids, "Invisible Leggings", 9506).getInt();
        invisiblebootsID = config.get(invisibleids, "Invisible Boots", 9507).getInt();
    }
}
