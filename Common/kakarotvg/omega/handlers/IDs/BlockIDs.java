package kakarotvg.omega.handlers.IDs;

import net.minecraftforge.common.Configuration;

public class BlockIDs {

    // config categories
    public static String urotarkids = "Urotark IDs";
    public static String muscoviteids = "Muscovite IDs";
    public static String gilderids = "Gilder IDs";
    public static String bariumids = "Barium IDs";
    public static String vanadiumids = "Vanadium IDs";
    public static String bismuthids = "Bismuth IDs";
    public static String platinumids = "Platinum IDs";
    public static String berionvarids = "Berionvar IDs";
    public static String firlvearids = "Firlvear IDs";
    public static String verilionids = "Verilion IDs";
    public static String bubbleids = "Bubble IDs";
    public static String darknessids = "Darkness IDs";
    public static String omegaids = "Omega IDs";
    public static String liquidids = "Liquid IDs";
    public static String cropids = "Crop IDs";
    public static String unknownids = "??? IDs";
    public static String tileentityids = "Tile Entity IDs";
    public static String treeids = "Tree IDs";

    // BLOCK IDS
    // urotark ids
    public static int urotarkoreID;
    public static int urotarkblockID;
    // pearl IDs
    public static int pearloreID;
    public static int pearlblockID;
    // sapphire IDs
    public static int sapphireoreID;
    public static int sapphireblockID;
    // muscovite IDs
    public static int muscoviteoreID;
    public static int muscoviteblockID;
    // ruby IDs
    public static int rubyoreID;
    public static int rubyblockID;
    // uriotyke IDs
    public static int uriotykeoreID;
    public static int uriotykeblockID;
    // gilder IDs
    public static int gilderoreID;
    public static int gilderblockID;
    // selovar IDs
    public static int selovaroreID;
    public static int selovarblockID;
    // parfilian IDs
    public static int parfilianoreID;
    public static int parfilianblockID;
    // barium IDs
    public static int bariumoreID;
    public static int bariumblockID;
    // radium IDs
    public static int radiumoreID;
    public static int radiumblockID;
    // gallum IDs
    public static int gallumoreID;
    public static int gallumblockID;
    // vanadium IDs
    public static int vanadiumoreID;
    public static int vanadiumblockID;
    // scandium IDs
    public static int scandiumoreID;
    public static int scandiumblockID;
    // bismuth IDs
    public static int bismuthoreID;
    public static int bismuthblockID;
    // indium IDs
    public static int indiumoreID;
    public static int indiumblockID;
    // platinum IDs
    public static int platinumoreID;
    public static int platinumblockID;
    // berionvar IDs
    public static int berionvaroreID;
    public static int berionvarblockID;
    // charviole IDs
    public static int charvioleoreID;
    public static int charvioleblockID;
    // firlvear IDs
    public static int firlvearoreID;
    public static int firlvearblockID;
    // selmenrer IDs
    public static int selmenreroreID;
    public static int selmenrerblockID;
    // verilion IDs
    public static int verilionoreID;
    public static int verilionblockID;
    // vielvor IDs
    public static int vielvororeID;
    public static int vielvorblockID;
    // bubble IDs
    public static int bubbleblockID;
    // darkness IDs
    public static int darknessoreID;
    public static int darknessblockID;
    // light IDs
    public static int lightoreID;
    public static int lightblockID;
    // omega IDs
    public static int omegaoreID;
    public static int omegablockID;
    // unknown IDs
    public static int unknownID;

    // LIQUID IDS
    public static int darknessfluidID;
    public static int lightfluidID;

    // CROP IDS
    public static int darknesscropID;
    public static int lightcropID;

    // TILE ENTITY IDS
    public static int darknesssolidID;
    public static int computeridleID;
    public static int underworldchestID;
    public static int tealworkbenchID;

    // TREE STUFF IDS
    public static int teallogID;
    public static int tealleafID;
    public static int tealsaplingID;
    public static int tealplankID;

    public static void configureBlockIDs(Configuration config) {
        // BLOCK IDS
        // urotark ids
        urotarkblockID = config.get(urotarkids, "Urotark Block", 2500).getInt();
        // muscovite ids
        muscoviteblockID = config.get(muscoviteids, "Muscovite Block", 2501).getInt();
        // gilder ids
        gilderblockID = config.get(gilderids, "Gilder Block", 2502).getInt();
        // barium ids
        bariumblockID = config.get(bariumids, "Barium Block", 2503).getInt();
        // vanadium ids
        vanadiumblockID = config.get(vanadiumids, "Vanadium Block", 2504).getInt();
        // bismuth ids
        bismuthblockID = config.get(bismuthids, "Bismuth Block", 2505).getInt();
        // platinum ids
        platinumblockID = config.get(platinumids, "Platinums Block", 2506).getInt();
        // berionvar ids
        berionvarblockID = config.get(berionvarids, "Berionvar Block", 2507).getInt();
        // firlvear ids
        firlvearblockID = config.get(firlvearids, "Firlvear Block", 2508).getInt();
        // verilion ids
        verilionblockID = config.get(verilionids, "Verilion Block", 2509).getInt();
        // bubble ids
        bubbleblockID = config.get(bubbleids, "Bubble Block", 2510).getInt();
        // darkness ids
        darknessblockID = config.get(darknessids, "Darkness Block", 2511).getInt();
        // omega ids
        omegablockID = config.get(omegaids, "Omega Block", 2512).getInt();
        // unknown ids
        unknownID = config.get(unknownids, "???", 2513).getInt();
        // ORE IDS
        // urotark
        urotarkoreID = config.get(urotarkids, "Urotark Ore", 2514).getInt();
        // muscovite
        muscoviteoreID = config.get(muscoviteids, "Muscovite Ore", 2515).getInt();
        // gilder
        gilderoreID = config.get(gilderids, "Gilder Ore", 2516).getInt();
        // barium
        bariumoreID = config.get(bariumids, "Barium Ore", 2517).getInt();
        // vanadium
        vanadiumoreID = config.get(vanadiumids, "Vanadium Ore", 2518).getInt();
        // bismuth
        bismuthoreID = config.get(bismuthids, "Bismuth Ore", 2519).getInt();
        // platinum
        platinumoreID = config.get(platinumids, "Platinums Ore", 2520).getInt();
        // berionvar
        berionvaroreID = config.get(berionvarids, "Berionvar Ore", 2521).getInt();
        // firlvear
        firlvearoreID = config.get(firlvearids, "Firlvear Ore", 2522).getInt();
        // verilion
        verilionoreID = config.get(verilionids, "Verilion Ore", 2523).getInt();
        // darkness
        darknessoreID = config.get(darknessids, "Darkness Ore", 2524).getInt();
        // omega
        omegaoreID = config.get(omegaids, "Omega Ore", 2525).getInt();

        // LIQUID IDS
        darknessfluidID = config.get(liquidids, "Darkness Fluid", 2526).getInt();
        lightfluidID = config.get(liquidids, "Light Fluid", 2527).getInt();

        // CROP IDS
        darknesscropID = config.get(cropids, "Darkness Crop", 2528).getInt();
        lightcropID = config.get(cropids, "Light Crop", 2529).getInt();

        // TILEENTITY IDS
        darknesssolidID = config.get(tileentityids, "Darkness Extrapalator", 2850).getInt();
        computeridleID = config.get(tileentityids, "Computer", 2851).getInt();
        underworldchestID = config.get(tileentityids, "Chest of the Underworld", 2853).getInt();
        tealworkbenchID = config.get(tileentityids, "Teal workbench", 2854).getInt();

        // TREE STUFF IDS
        teallogID = config.get(treeids, "Teal Log", 2855).getInt();
        tealleafID = config.get(treeids, "Teal Leaf", 2856).getInt();
        tealsaplingID = config.get(treeids, "Teal Sapling", 2857).getInt();
        tealplankID = config.get(treeids, "Teal Plank", 2858).getInt();
    }

}
