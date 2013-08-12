package kakarotvg.omega;

import kakarotvg.omega.blocks.DarknessFlow;
import kakarotvg.omega.blocks.DarknessStill;
import kakarotvg.omega.blocks.Vgblock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.Configuration;
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
    // Bubble
    public static Block bubbleblock;
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

    // liquids
    public static Block darkliquidflow;
    public static Block darkliquidstill;
    public static Block lightliquidflow;
    public static Block lightliquidstill;

    public static void configureBlocks(Configuration config) {
        // Urotark
        urotarkblock = new Vgblock(config.get("Urotark IDs", "Urotark Block", 2500).getInt(), Material.iron).setUnlocalizedName("urotarkblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        urotarkore = new Vgblock(config.get("Urotark IDs", "Urotark Ore", 2501).getInt(), Material.rock).setUnlocalizedName("urotarkore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Pearl
        pearlblock = new Vgblock(config.get("Pearl IDs", "Pearl Block", 2502).getInt(), Material.iron).setUnlocalizedName("pearlblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        pearlore = new Vgblock(config.get("Pearl IDs", "Pearl Ore", 2503).getInt(), Material.rock).setUnlocalizedName("pearlore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Sapphire
        sapphireblock = new Vgblock(config.get("Sapphire IDs", "Sapphire Block", 2504).getInt(), Material.iron).setUnlocalizedName("sapphireblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        sapphireore = new Vgblock(config.get("Sapphire IDs", "Sapphire Ore", 2505).getInt(), Material.rock).setUnlocalizedName("sapphireore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Muscovite
        muscoviteblock = new Vgblock(config.get("Muscovite IDs", "Muscovite Block", 2506).getInt(), Material.iron).setUnlocalizedName("muscoviteblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        muscoviteore = new Vgblock(config.get("Muscovite IDs", "Muscovite Ore", 2507).getInt(), Material.rock).setUnlocalizedName("muscoviteore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Ruby
        rubyblock = new Vgblock(config.get("Ruby IDs", "Ruby Block", 2508).getInt(), Material.iron).setUnlocalizedName("rubyblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        rubyore = new Vgblock(config.get("Ruby IDs", "Ruby Ore", 2509).getInt(), Material.rock).setUnlocalizedName("rubyore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Uriotyke
        uriotykeblock = new Vgblock(config.get("Uriotyke IDs", "Uriotyke Block", 2510).getInt(), Material.iron).setUnlocalizedName("uriotykeblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        uriotykeore = new Vgblock(config.get("Uriotyke IDs", "Uriotyke Ore", 2511).getInt(), Material.rock).setUnlocalizedName("uriotykeore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Gilder
        gilderblock = new Vgblock(config.get("Gilder IDs", "Gilder Block", 2512).getInt(), Material.iron).setUnlocalizedName("gilderblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        gilderore = new Vgblock(config.get("Gilder IDs", "Gilder Ore", 2513).getInt(), Material.rock).setUnlocalizedName("gilderore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Selovar
        selovarblock = new Vgblock(config.get("Selovar IDs", "Selovar Block", 2514).getInt(), Material.iron).setUnlocalizedName("selovarblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        selovarore = new Vgblock(config.get("Selovar IDs", "Selovar Ore", 2515).getInt(), Material.rock).setUnlocalizedName("selovarore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Parfilian
        parfilianblock = new Vgblock(config.get("Parfilian IDs", "Parfilian Block", 2516).getInt(), Material.iron).setUnlocalizedName("parfilianblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        parfilianore = new Vgblock(config.get("Parfilian IDs", "Parfilian Ore", 2517).getInt(), Material.rock).setUnlocalizedName("parfilianore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Barium
        bariumblock = new Vgblock(config.get("Barium IDs", "Barium Block", 2518).getInt(), Material.iron).setUnlocalizedName("bariumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F).setHardness(50.0F).setResistance(2000.0F);
        bariumore = new Vgblock(config.get("Barium IDs", "Barium Ore", 2519).getInt(), Material.rock).setUnlocalizedName("bariumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Radium
        radiumblock = new Vgblock(config.get("Radium IDs", "Radium Block", 2520).getInt(), Material.iron).setUnlocalizedName("radiumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        radiumore = new Vgblock(config.get("Radium IDs", "Radium Ore", 2521).getInt(), Material.rock).setUnlocalizedName("radiumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Gallum
        gallumblock = new Vgblock(config.get("Gallum IDs", "Gallum Block", 2522).getInt(), Material.iron).setUnlocalizedName("gallumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        gallumore = new Vgblock(config.get("Gallum IDs", "Gallum Ore", 2523).getInt(), Material.rock).setUnlocalizedName("gallumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Vanadium
        vanadiumblock = new Vgblock(config.get("Vanadium IDs", "Vanadium Block", 2524).getInt(), Material.iron).setUnlocalizedName("vanadiumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        vanadiumore = new Vgblock(config.get("Vanadium IDs", "Vanadium Ore", 2525).getInt(), Material.rock).setUnlocalizedName("vanadiumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Scandium
        scandiumblock = new Vgblock(config.get("Scandium IDs", "Scandium Block", 2526).getInt(), Material.iron).setUnlocalizedName("scandiumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        scandiumore = new Vgblock(config.get("Scandium IDs", "Scandium Ore", 2527).getInt(), Material.rock).setUnlocalizedName("scandiumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Bismuth
        bismuthblock = new Vgblock(config.get("Bismuth IDs", "Bismuth Block", 2528).getInt(), Material.iron).setUnlocalizedName("bismuthblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        bismuthore = new Vgblock(config.get("Bismuth IDs", "Bismuth Ore", 2529).getInt(), Material.rock).setUnlocalizedName("bismuthore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Indium
        indiumblock = new Vgblock(config.get("Indium IDs", "Indium Block", 2530).getInt(), Material.iron).setUnlocalizedName("indiumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        indiumore = new Vgblock(config.get("Indium IDs", "Indium Ore", 2531).getInt(), Material.rock).setUnlocalizedName("indiumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Platinum
        platinumblock = new Vgblock(config.get("Platinum IDs", "Platinum Block", 2532).getInt(), Material.iron).setUnlocalizedName("platinumblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        platinumore = new Vgblock(config.get("Platinum IDs", "Platinum Ore", 2533).getInt(), Material.rock).setUnlocalizedName("platinumore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Bubble
        bubbleblock = new Vgblock(config.get("Bubble IDs", "Bubble Block", 2534).getInt(), Material.iron).setUnlocalizedName("bubbleblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        // Berionvar
        berionvarblock = new Vgblock(config.get("Berionvar IDs", "Berionvar Block", 2535).getInt(), Material.iron).setUnlocalizedName("berionvarblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        berionvarore = new Vgblock(config.get("Berionvar IDs", "Berionvar Ore", 2536).getInt(), Material.rock).setUnlocalizedName("berionvarore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Charviole
        charvioleblock = new Vgblock(config.get("Charviole IDs", "Charviole Block", 2537).getInt(), Material.iron).setUnlocalizedName("charvioleblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        charvioleore = new Vgblock(config.get("Charviole IDs", "Charviole Ore", 2538).getInt(), Material.rock).setUnlocalizedName("charvioleore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Firlvear
        firlvearblock = new Vgblock(config.get("Firlvear IDs", "Firlvear Block", 2539).getInt(), Material.iron).setUnlocalizedName("firlvearblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        firlvearore = new Vgblock(config.get("Firlvear IDs", "Firlvear Ore", 2540).getInt(), Material.rock).setUnlocalizedName("firlvearore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // selmenrer
        selmenrerblock = new Vgblock(config.get("Selmenrer IDs", "Selmenrer Block", 2541).getInt(), Material.iron).setUnlocalizedName("selmenrerblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        selmenrerore = new Vgblock(config.get("Selmenrer IDs", "Selmenrer Ore", 2542).getInt(), Material.rock).setUnlocalizedName("selmenrerore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // verilion
        verilionblock = new Vgblock(config.get("Verilion IDs", "Verilion Block", 2543).getInt(), Material.iron).setUnlocalizedName("verilionblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        verilionore = new Vgblock(config.get("Verilion IDs", "Verilion Ore", 2544).getInt(), Material.rock).setUnlocalizedName("verilionore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // vielvor
        vielvorblock = new Vgblock(config.get("Vielvor IDs", "Vielvor Block", 2545).getInt(), Material.iron).setUnlocalizedName("vielvorblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        vielvorore = new Vgblock(config.get("Vielvor IDs", "Vielvor Ore", 2546).getInt(), Material.rock).setUnlocalizedName("vielvorore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Darkness
        darknessblock = new Vgblock(config.get("Darkness IDs", "Darkness Block", 2547).getInt(), Material.iron).setUnlocalizedName("darknessblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        darknessore = new Vgblock(config.get("Darkness IDs", "Darkness Ore", 2548).getInt(), Material.rock).setUnlocalizedName("darknessore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Light
        lightblock = new Vgblock(config.get("Light IDs", "Light Block", 2549).getInt(), Material.iron).setUnlocalizedName("lightblock").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        lightore = new Vgblock(config.get("Light IDs", "Light Ore", 2550).getInt(), Material.rock).setUnlocalizedName("lightore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // Omega
        omegablock = new Vgblock(config.get("Omega IDs", "Omega Block", 2551).getInt(), Material.iron).setUnlocalizedName("omegablockanimated").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(50.0F).setResistance(2000.0F);
        omegaore = new Vgblock(config.get("Omega IDs", "Omega Ore", 2552).getInt(), Material.rock).setUnlocalizedName("omegaore").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
        // ???
        unknown = new Vgblock(config.get("??? IDs", "???", 2553).getInt(), Material.iron).setUnlocalizedName("???animated").setCreativeTab(CreativetabHandler.vgtab).setStepSound(Block.soundMetalFootstep).setHardness(5.0F).setResistance(8.0F);

        // Darkness liquid
        darkliquidflow = new DarknessFlow(config.get("Liquids", "Liquid Darkness(Flowing)", 2600).getInt(), "darkliquidflow");
        darkliquidstill = new DarknessStill(config.get("Liquids", "Liquid Darkness(Still)", 2601).getInt(), "darkliquidstill");
        lightliquidflow = new DarknessFlow(config.get("Liquids", "Liquid Light(Flowing)", 2602).getInt(), "lightliquidflow");
        lightliquidstill = new DarknessStill(config.get("Liquids", "Liquid Light(Still)", 2603).getInt(), "lightliquidstill");
        // tile entity
    }

    public static void registerBlocks(GameRegistry registry) {
        // Urotark
        registry.registerBlock(urotarkblock, "urotarkblock");
        registry.registerBlock(urotarkore, "urotarkore");
        // Pearl
        registry.registerBlock(pearlblock, "pearlblock");
        registry.registerBlock(pearlore, "pearlore");
        // Sapphire
        registry.registerBlock(sapphireblock, "sapphireblock");
        registry.registerBlock(sapphireore, "sapphireore");
        // Muscovite
        registry.registerBlock(muscoviteblock, "muscoviteblock");
        registry.registerBlock(muscoviteore, "muscoviteore");
        // Ruby
        registry.registerBlock(rubyblock, "rubyblock");
        registry.registerBlock(rubyore, "rubyore");
        // Uriotyke
        registry.registerBlock(uriotykeblock, "uriotykeblock");
        registry.registerBlock(uriotykeore, "uriotykeore");
        // Gilder
        registry.registerBlock(gilderblock, "gilderblock");
        registry.registerBlock(gilderore, "gilderore");
        // Selovar
        registry.registerBlock(selovarblock, "selovarblock");
        registry.registerBlock(selovarore, "selovarore");
        // Parfilian
        registry.registerBlock(parfilianblock, "parfilianblock");
        registry.registerBlock(parfilianore, "parfilianore");
        // Barium
        registry.registerBlock(bariumblock, "bariumblock");
        registry.registerBlock(bariumore, "bariumore");
        // Radium
        registry.registerBlock(radiumblock, "radiumblock");
        registry.registerBlock(radiumore, "radiumore");
        // Gallum
        registry.registerBlock(gallumblock, "gallumblock");
        registry.registerBlock(gallumore, "gallumore");
        // Vanadium
        registry.registerBlock(vanadiumblock, "vanadiumblock");
        registry.registerBlock(vanadiumore, "vanadiumore");
        // Scandium
        registry.registerBlock(scandiumblock, "scandiumblock");
        registry.registerBlock(scandiumore, "scandiumore");
        // Bismuth
        registry.registerBlock(bismuthblock, "bismuthblock");
        registry.registerBlock(bismuthore, "bismuthore");
        // Indium
        registry.registerBlock(indiumblock, "indiumblock");
        registry.registerBlock(indiumore, "indiumore");
        // Platinum
        registry.registerBlock(platinumblock, "platinumblock");
        registry.registerBlock(platinumore, "platinumore");
        // Bubble
        registry.registerBlock(bubbleblock, "bubbleblock");
        // Berionvar
        registry.registerBlock(berionvarblock, "berionvarblock");
        registry.registerBlock(berionvarore, "berionvarore");
        // Charviole
        registry.registerBlock(charvioleblock, "charvioleblock");
        registry.registerBlock(charvioleore, "charvioleore");
        // Firlvear
        registry.registerBlock(firlvearblock, "firlvearblock");
        registry.registerBlock(firlvearore, "firlvearore");
        // selmenrer
        registry.registerBlock(selmenrerblock, "selmenrerblock");
        registry.registerBlock(selmenrerore, "selmenrerore");
        // verilion
        registry.registerBlock(verilionblock, "verilionblock");
        registry.registerBlock(verilionore, "verilionore");
        // vielvor
        registry.registerBlock(vielvorblock, "vielvorblock");
        registry.registerBlock(vielvorore, "vielvorore");
        // Darkness
        registry.registerBlock(darknessblock, "darknessblock");
        registry.registerBlock(darknessore, "darknessore");
        // Light
        registry.registerBlock(lightblock, "lightblock");
        registry.registerBlock(lightore, "lightore");
        // Omega
        registry.registerBlock(omegablock, "omegablock");
        registry.registerBlock(omegaore, "omegaore");
        // ???
        registry.registerBlock(unknown, "unknown");

        // liquids
        registry.registerBlock(darkliquidstill, "darkliquidstill");
        registry.registerBlock(darkliquidflow, "darkliquidflow");
        registry.registerBlock(lightliquidstill, "lightliquidstill");
        registry.registerBlock(lightliquidflow, "lightliquidflow");
        // tileentity
    }

    public static void setNames(LanguageRegistry registry) {
        // Urotark
        registry.addName(urotarkblock, "Urotark Block");
        registry.addName(urotarkore, "Urotark Ore");
        // Pearl
        registry.addName(pearlblock, "Pearl Block");
        registry.addName(pearlore, "Pearl Ore");
        // Sapphire
        registry.addName(sapphireblock, "Sapphire Block");
        registry.addName(sapphireore, "Sapphire Ore");
        // Muscovite
        registry.addName(muscoviteblock, "Muscovite Block");
        registry.addName(muscoviteore, "Muscovite Ore");
        // Ruby
        registry.addName(rubyblock, "Ruby Block");
        registry.addName(rubyore, "Ruby Ore");
        // Uriotyke
        registry.addName(uriotykeblock, "Uriotyke Block");
        registry.addName(uriotykeore, "Uriotyke Ore");
        // Gilder
        registry.addName(gilderblock, "Gilder Block");
        registry.addName(gilderore, "Gilder Ore");
        // Selovar
        registry.addName(selovarblock, "Selovar Block");
        registry.addName(selovarore, "Selovar Ore");
        // Parfilian
        registry.addName(parfilianblock, "Parfilian Block");
        registry.addName(parfilianore, "Parfilian Ore");
        // Barium
        registry.addName(bariumblock, "Barium Block");
        registry.addName(bariumore, "Barium Ore");
        // Radium
        registry.addName(radiumblock, "Radium Block");
        registry.addName(radiumore, "Radium Ore");
        // Gallum
        registry.addName(gallumblock, "Gallum Block");
        registry.addName(gallumore, "Gallum Ore");
        // Vanadium
        registry.addName(vanadiumblock, "Vanadium Block");
        registry.addName(vanadiumore, "Vanadium Ore");
        // Scandium
        registry.addName(scandiumblock, "Scandium Block");
        registry.addName(scandiumore, "Scandium Ore");
        // Bismuth
        registry.addName(bismuthblock, "Bismuth Block");
        registry.addName(bismuthore, "Bismuth Ore");
        // Indium
        registry.addName(indiumblock, "Indium Block");
        registry.addName(indiumore, "Indium Ore");
        // Platinum
        registry.addName(platinumblock, "Platinum Block");
        registry.addName(platinumore, "Platinum Ore");
        // Bubble
        registry.addName(bubbleblock, "Bubble Block");
        // Berionvar
        registry.addName(berionvarblock, "Berionvar Block");
        registry.addName(berionvarore, "Berionvar Ore");
        // Charviole
        registry.addName(charvioleblock, "Charviole Block");
        registry.addName(charvioleore, "Charviole Ore");
        // Firlvear
        registry.addName(firlvearblock, "Firlvear Block");
        registry.addName(firlvearore, "Firlvear Ore");
        // selmenrer
        registry.addName(selmenrerblock, "Selmenrer Block");
        registry.addName(selmenrerore, "Selmenrer Ore");
        // verilion
        registry.addName(verilionblock, "Verilion Block");
        registry.addName(verilionore, "Verilion Ore");
        // vielvor
        registry.addName(vielvorblock, "Vielvor Block");
        registry.addName(vielvorore, "Vielvor Ore");
        // Darkness
        registry.addName(darknessblock, "Darkness Block");
        registry.addName(darknessore, "Darkness Ore");
        // Light
        registry.addName(lightblock, "Light Block");
        registry.addName(lightore, "Light Ore");
        // Omega
        registry.addName(omegablock, "Omega Block");
        registry.addName(omegaore, "Omega Ore");
        registry.addName(unknown, "Unknown");

        // liquids
        registry.addName(darkliquidstill, "Darkness(Still)");
        registry.addName(darkliquidflow, "Darkness(Flowing)");
        registry.addName(lightliquidstill, "Light(Still)");
        registry.addName(lightliquidflow, "Light(Flowing)");
    }

    public static void setHarvestlevel(MinecraftForge registry) {
        // urotark
        registry.setBlockHarvestLevel(urotarkblock, "pickaxe", 4);
        registry.setBlockHarvestLevel(urotarkore, "pickaxe", 3);
        // pearl
        registry.setBlockHarvestLevel(pearlblock, "pickaxe", 4);
        registry.setBlockHarvestLevel(pearlore, "pickaxe", 3);
        // sapphire
        registry.setBlockHarvestLevel(sapphireblock, "pickaxe", 4);
        registry.setBlockHarvestLevel(sapphireore, "pickaxe", 3);
        // muscovite
        registry.setBlockHarvestLevel(muscoviteblock, "pickaxe", 5);
        registry.setBlockHarvestLevel(muscoviteore, "pickaxe", 4);
        // ruby
        registry.setBlockHarvestLevel(rubyblock, "pickaxe", 5);
        registry.setBlockHarvestLevel(rubyore, "pickaxe", 4);
        // uriotyke
        registry.setBlockHarvestLevel(uriotykeblock, "pickaxe", 5);
        registry.setBlockHarvestLevel(uriotykeore, "pickaxe", 4);
        // gilder
        registry.setBlockHarvestLevel(gilderblock, "pickaxe", 6);
        registry.setBlockHarvestLevel(gilderore, "pickaxe", 5);
        // selovar
        registry.setBlockHarvestLevel(selovarblock, "pickaxe", 6);
        registry.setBlockHarvestLevel(selovarore, "pickaxe", 5);
        // parfilian
        registry.setBlockHarvestLevel(parfilianblock, "pickaxe", 6);
        registry.setBlockHarvestLevel(parfilianore, "pickaxe", 5);
        // barium
        registry.setBlockHarvestLevel(bariumblock, "pickaxe", 7);
        registry.setBlockHarvestLevel(bariumore, "pickaxe", 6);
        // radium
        registry.setBlockHarvestLevel(radiumblock, "pickaxe", 7);
        registry.setBlockHarvestLevel(radiumore, "pickaxe", 6);
        // gallum
        registry.setBlockHarvestLevel(gallumblock, "pickaxe", 7);
        registry.setBlockHarvestLevel(gallumore, "pickaxe", 6);
        // vanadium
        registry.setBlockHarvestLevel(vanadiumblock, "pickaxe", 8);
        registry.setBlockHarvestLevel(vanadiumore, "pickaxe", 7);
        // scandium
        registry.setBlockHarvestLevel(scandiumblock, "pickaxe", 8);
        registry.setBlockHarvestLevel(scandiumore, "pickaxe", 7);
        // bismuth
        registry.setBlockHarvestLevel(bismuthblock, "pickaxe", 9);
        registry.setBlockHarvestLevel(bismuthore, "pickaxe", 8);
        // indium
        registry.setBlockHarvestLevel(indiumblock, "pickaxe", 9);
        registry.setBlockHarvestLevel(indiumore, "pickaxe", 8);
        // platinum
        registry.setBlockHarvestLevel(platinumblock, "pickaxe", 10);
        registry.setBlockHarvestLevel(platinumore, "pickaxe", 9);
        // bubble
        registry.setBlockHarvestLevel(bubbleblock, "pickaxe", 2);
        // Berionvar
        registry.setBlockHarvestLevel(berionvarblock, "pickaxe", 11);
        registry.setBlockHarvestLevel(berionvarore, "pickaxe", 10);
        // Charviole
        registry.setBlockHarvestLevel(charvioleblock, "pickaxe", 11);
        registry.setBlockHarvestLevel(charvioleore, "pickaxe", 10);
        // Firlvear
        registry.setBlockHarvestLevel(firlvearblock, "pickaxe", 12);
        registry.setBlockHarvestLevel(firlvearore, "pickaxe", 10);
        // selmenrer
        registry.setBlockHarvestLevel(selmenrerblock, "pickaxe", 12);
        registry.setBlockHarvestLevel(selmenrerore, "pickaxe", 10);
        // verilion
        registry.setBlockHarvestLevel(verilionblock, "pickaxe", 13);
        registry.setBlockHarvestLevel(verilionore, "pickaxe", 10);
        // vielvor
        registry.setBlockHarvestLevel(vielvorblock, "pickaxe", 13);
        registry.setBlockHarvestLevel(vielvorore, "pickaxe", 10);
        // darkness
        registry.setBlockHarvestLevel(darknessblock, "pickaxe", 20);
        registry.setBlockHarvestLevel(darknessore, "pickaxe", 10);
        // light
        registry.setBlockHarvestLevel(lightblock, "pickaxe", 20);
        registry.setBlockHarvestLevel(lightore, "pickaxe", 10);
        // omega
        registry.setBlockHarvestLevel(omegablock, "pickaxe", 30);
        registry.setBlockHarvestLevel(omegaore, "pickaxe", 10);
        // ???
        registry.setBlockHarvestLevel(unknown, "pickaxe", 10);
    }

}
