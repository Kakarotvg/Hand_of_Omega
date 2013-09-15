package kakarotvg.omega.handlers.IDs;

import net.minecraftforge.common.Configuration;

public class ItemIDs {

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
    public static String bubbleids = "Bubble IDs";
    public static String darknessids = "Darkness IDs";
    public static String lightids = "Light IDs";
    public static String omegaids = "Omega IDs";
    public static String dawnids = "Dawn IDs";
    public static String liquidids = "Liquid IDs";
    public static String cropids = "Crop IDs";

    // ITEM IDS
    // urotark ids
    public static int urotarkID;
    public static int urotarkingotID;
    // platinum ids
    public static int platinumID;
    public static int platinumingotID;
    // berionvar ids
    public static int berionvarID;
    public static int berionvaringotID;
    // charviole ids
    public static int charvioleID;
    public static int charvioleingotID;
    // firlvear ids
    public static int firlvearID;
    public static int firlvearingotID;
    // selmenrer ids
    public static int selmenrerID;
    public static int selmenreringotID;
    // verilion ids
    public static int verilionID;
    public static int verilioningotID;
    // vielvor ids
    public static int vielvorID;
    public static int vielvoringotID;
    // bubble ids
    public static int bubbleID;
    public static int bubblesID;
    // darkness ids
    public static int darknessID;
    public static int darknessingotID;
    public static int darknessshardID;
    public static int soliddarknessID;
    // light ids
    public static int lightID;
    public static int lightingotID;
    public static int lightshardID;
    // omega ids
    public static int omegaID;
    public static int omegaingotID;
    public static int omegashardsID;
    // dawn ids
    public static int dawnID;
    public static int dawningotID;
    // LIQUID IDS
    public static int darknessbucketID;
    public static int lightbucketID;

    // CROP IDS
    public static int darknessseedsID;
    public static int lightseedsID;

    public static void ConfigureItemIDs(Configuration config) {
        // ITEM IDS    
        // urotark ids
        urotarkID = config.get(urotarkids, "Urotark", 9000).getInt();
        urotarkingotID = config.get(urotarkids, "Urotark Ingot", 9001).getInt();
        // platinum ids
        platinumID = config.get(platinumids, "Platinum", 9002).getInt();
        platinumingotID = config.get(platinumids, "Platinum Ingot", 9003).getInt();
        // darkness ids
        darknessshardID = config.get(darknessids, "Darkness Shards", 9004).getInt();
        // light ids
        lightshardID = config.get(lightids, "Light Shards", 9005).getInt();
        // omega ids
        omegashardsID = config.get(omegaids, "Omega Shards", 9006).getInt();
        // new darkness ids
        soliddarknessID = config.get(darknessids, "Solid Darkness", 9007).getInt();

        // LIQUID IDS
        darknessbucketID = config.get(liquidids, "Darkness Bucket", 9008).getInt();
        lightbucketID = config.get(liquidids, "Light Bucket", 9009).getInt();

        // CROP IDS
        darknessseedsID = config.get(cropids, "Darkness Seeds", 9010).getInt();
        lightseedsID = config.get(cropids, "Light Seeds", 9011).getInt();
    }

}
