package kakarotvg.omega.handlers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingHandler {

    public static void addCrafting(GameRegistry register) {
        // Urotark
        register.addRecipe(new ItemStack(BlockHandler.urotarkblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.urotark);
        register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4), new Object[] { BlockHandler.urotarkblock });
        register.addRecipe(new ItemStack(ToolHandler.urotarkaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.urotarkingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.urotarkhoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.urotarkingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.urotarkshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.urotarkingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.urotarksword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.urotarkingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.urotarkpickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.urotarkingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.urotarkhelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.urotarkingot);
        register.addRecipe(new ItemStack(ArmorHandler.urotarkplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.urotarkingot);
        register.addRecipe(new ItemStack(ArmorHandler.urotarklegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.urotarkingot);
        register.addRecipe(new ItemStack(ArmorHandler.urotarkboots, 1), "   ", "U U", "U U", 'U', ItemHandler.urotarkingot);
        // Pearl
        register.addRecipe(new ItemStack(BlockHandler.pearlblock, 1), "PPP", "PPP", "PPP", 'P', ItemHandler.pearl);
        register.addShapelessRecipe(new ItemStack(ItemHandler.pearl, 4), new Object[] { BlockHandler.pearlblock });
        register.addRecipe(new ItemStack(ToolHandler.pearlaxe, 1), "PP ", "Ps ", " s ", 'P', ItemHandler.pearlingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.pearlhoe, 1), "PP ", " s ", " s ", 'P', ItemHandler.pearlingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.pearlshovel, 1), " P ", " s ", " s ", 'P', ItemHandler.pearlingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.pearlsword, 1), "gPg", "gPg", " s ", 'P', ItemHandler.pearlingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.pearlpickaxe, 1), "PPP", " s ", " s ", 'P', ItemHandler.pearlingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.pearlhelm, 1), "PPP", "P P", "   ", 'P', ItemHandler.pearlingot);
        register.addRecipe(new ItemStack(ArmorHandler.pearlplate, 1), "P P", "PPP", "PPP", 'P', ItemHandler.pearlingot);
        register.addRecipe(new ItemStack(ArmorHandler.pearllegs, 1), "PPP", "P P", "P P", 'P', ItemHandler.pearlingot);
        register.addRecipe(new ItemStack(ArmorHandler.pearlboots, 1), "   ", "P P", "P P", 'P', ItemHandler.pearlingot);
        // Sapphire
        register.addRecipe(new ItemStack(BlockHandler.sapphireblock, 1), "SSS", "SSS", "SSS", 'S', ItemHandler.sapphire);
        register.addShapelessRecipe(new ItemStack(ItemHandler.sapphire, 4), new Object[] { BlockHandler.sapphireblock });
        register.addRecipe(new ItemStack(ToolHandler.sapphireaxe, 1), "SS ", "Ss ", " s ", 'S', ItemHandler.sapphireingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.sapphirehoe, 1), "SS ", " s ", " s ", 'S', ItemHandler.sapphireingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.sapphireshovel, 1), " S ", " s ", " s ", 'S', ItemHandler.sapphireingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.sapphiresword, 1), "gSg", "gSg", " s ", 'S', ItemHandler.sapphireingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.sapphirepickaxe, 1), "SSS", " s ", " s ", 'S', ItemHandler.sapphireingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.sapphirehelm, 1), "SSS", "S S", "   ", 'S', ItemHandler.sapphireingot);
        register.addRecipe(new ItemStack(ArmorHandler.sapphireplate, 1), "S S", "SSS", "SSS", 'S', ItemHandler.sapphireingot);
        register.addRecipe(new ItemStack(ArmorHandler.sapphirelegs, 1), "SSS", "S S", "S S", 'S', ItemHandler.sapphireingot);
        register.addRecipe(new ItemStack(ArmorHandler.sapphireboots, 1), "   ", "S S", "S S", 'S', ItemHandler.sapphireingot);
        // Muscovite
        register.addRecipe(new ItemStack(BlockHandler.muscoviteblock, 1), "MMM", "MMM", "MMM", 'M', ItemHandler.muscovite);
        register.addShapelessRecipe(new ItemStack(ItemHandler.muscovite, 4), new Object[] { BlockHandler.muscoviteblock });
        register.addRecipe(new ItemStack(ToolHandler.muscoviteaxe, 1), "MM ", "Ms ", " s ", 'M', ItemHandler.muscoviteingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.muscovitehoe, 1), "MM ", " s ", " s ", 'M', ItemHandler.muscoviteingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.muscoviteshovel, 1), " M ", " s ", " s ", 'M', ItemHandler.muscoviteingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.muscovitesword, 1), "gMg", "gMg", " s ", 'M', ItemHandler.muscoviteingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.muscovitepickaxe, 1), "MMM", " s ", " s ", 'M', ItemHandler.muscoviteingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.muscovitehelm, 1), "MMM", "M M", "   ", 'M', ItemHandler.muscoviteingot);
        register.addRecipe(new ItemStack(ArmorHandler.muscoviteplate, 1), "M M", "MMM", "MMM", 'M', ItemHandler.muscoviteingot);
        register.addRecipe(new ItemStack(ArmorHandler.muscovitelegs, 1), "MMM", "M M", "M M", 'M', ItemHandler.muscoviteingot);
        register.addRecipe(new ItemStack(ArmorHandler.muscoviteboots, 1), "   ", "M M", "M M", 'M', ItemHandler.muscoviteingot);
        // Ruby
        register.addRecipe(new ItemStack(BlockHandler.rubyblock, 1), "RRR", "RRR", "RRR", 'R', ItemHandler.ruby);
        register.addShapelessRecipe(new ItemStack(ItemHandler.ruby, 4), new Object[] { BlockHandler.rubyblock });
        register.addRecipe(new ItemStack(ToolHandler.rubyaxe, 1), "RR ", "Rs ", " s ", 'R', ItemHandler.rubyingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.rubyhoe, 1), "RR ", " s ", " s ", 'R', ItemHandler.rubyingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.rubyshovel, 1), " R ", " s ", " s ", 'R', ItemHandler.rubyingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.rubysword, 1), "gRg", "gRg", " s ", 'R', ItemHandler.rubyingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.rubypickaxe, 1), "RRR", " s ", " s ", 'R', ItemHandler.rubyingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.rubyhelm, 1), "RRR", "R R", "   ", 'R', ItemHandler.rubyingot);
        register.addRecipe(new ItemStack(ArmorHandler.rubyplate, 1), "R R", "RRR", "RRR", 'R', ItemHandler.rubyingot);
        register.addRecipe(new ItemStack(ArmorHandler.rubylegs, 1), "RRR", "R R", "R R", 'R', ItemHandler.rubyingot);
        register.addRecipe(new ItemStack(ArmorHandler.rubyboots, 1), "   ", "R R", "R R", 'R', ItemHandler.rubyingot);
        // Uriotyke
        register.addRecipe(new ItemStack(BlockHandler.uriotykeblock, 1), "UUU", "UUU", "UUU", 'U', ItemHandler.uriotyke);
        register.addShapelessRecipe(new ItemStack(ItemHandler.uriotyke, 4), new Object[] { BlockHandler.uriotykeblock });
        register.addRecipe(new ItemStack(ToolHandler.uriotykeaxe, 1), "UU ", "Us ", " s ", 'U', ItemHandler.uriotykeingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.uriotykehoe, 1), "UU ", " s ", " s ", 'U', ItemHandler.uriotykeingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.uriotykeshovel, 1), " U ", " s ", " s ", 'U', ItemHandler.uriotykeingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.uriotykesword, 1), "gUg", "gUg", " s ", 'U', ItemHandler.uriotykeingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.uriotykepickaxe, 1), "UUU", " s ", " s ", 'U', ItemHandler.uriotykeingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.uriotykehelm, 1), "UUU", "U U", "   ", 'U', ItemHandler.uriotykeingot);
        register.addRecipe(new ItemStack(ArmorHandler.uriotykeplate, 1), "U U", "UUU", "UUU", 'U', ItemHandler.uriotykeingot);
        register.addRecipe(new ItemStack(ArmorHandler.uriotykelegs, 1), "UUU", "U U", "U U", 'U', ItemHandler.uriotykeingot);
        register.addRecipe(new ItemStack(ArmorHandler.uriotykeboots, 1), "   ", "U U", "U U", 'U', ItemHandler.uriotykeingot);
        // Gilder
        register.addRecipe(new ItemStack(BlockHandler.gilderblock, 1), "GGG", "GGG", "GGG", 'G', ItemHandler.gilder);
        register.addShapelessRecipe(new ItemStack(ItemHandler.gilder, 4), new Object[] { BlockHandler.gilderblock });
        register.addRecipe(new ItemStack(ToolHandler.gilderaxe, 1), "GG ", "Gs ", " s ", 'G', ItemHandler.gilderingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.gilderhoe, 1), "GG ", " s ", " s ", 'G', ItemHandler.gilderingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.gildershovel, 1), " G ", " s ", " s ", 'G', ItemHandler.gilderingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.gildersword, 1), "gGg", "gGg", " s ", 'G', ItemHandler.gilderingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.gilderpickaxe, 1), "GGG", " s ", " s ", 'G', ItemHandler.gilderingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.gilderhelm, 1), "GGG", "G G", "   ", 'G', ItemHandler.gilderingot);
        register.addRecipe(new ItemStack(ArmorHandler.gilderplate, 1), "G G", "GGG", "GGG", 'G', ItemHandler.gilderingot);
        register.addRecipe(new ItemStack(ArmorHandler.gilderlegs, 1), "GGG", "G G", "G G", 'G', ItemHandler.gilderingot);
        register.addRecipe(new ItemStack(ArmorHandler.gilderboots, 1), "   ", "G G", "G G", 'G', ItemHandler.gilderingot);
        // Selovar
        register.addRecipe(new ItemStack(BlockHandler.selovarblock, 1), "SSS", "SSS", "SSS", 'S', ItemHandler.selovar);
        register.addShapelessRecipe(new ItemStack(ItemHandler.selovar, 4), new Object[] { BlockHandler.selovarblock });
        register.addRecipe(new ItemStack(ToolHandler.selovaraxe, 1), "SS ", "Ss ", " s ", 'S', ItemHandler.selovaringot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.selovarhoe, 1), "SS ", " s ", " s ", 'S', ItemHandler.selovaringot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.selovarshovel, 1), " S ", " s ", " s ", 'S', ItemHandler.selovaringot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.selovarsword, 1), "gSg", "gSg", " s ", 'S', ItemHandler.selovaringot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.selovarpickaxe, 1), "SSS", " s ", " s ", 'S', ItemHandler.selovaringot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.selovarhelm, 1), "SSS", "S S", "   ", 'S', ItemHandler.selovaringot);
        register.addRecipe(new ItemStack(ArmorHandler.selovarplate, 1), "S S", "SSS", "SSS", 'S', ItemHandler.selovaringot);
        register.addRecipe(new ItemStack(ArmorHandler.selovarlegs, 1), "SSS", "S S", "S S", 'S', ItemHandler.selovaringot);
        register.addRecipe(new ItemStack(ArmorHandler.selovarboots, 1), "   ", "S S", "S S", 'S', ItemHandler.selovaringot);
        // Parfilian
        register.addRecipe(new ItemStack(BlockHandler.parfilianblock, 1), "PPP", "PPP", "PPP", 'P', ItemHandler.parfilian);
        register.addShapelessRecipe(new ItemStack(ItemHandler.parfilian, 4), new Object[] { BlockHandler.parfilianblock });
        register.addRecipe(new ItemStack(ToolHandler.parfilianaxe, 1), "PP ", "Ps ", " s ", 'P', ItemHandler.parfilianingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.parfilianhoe, 1), "PP ", " s ", " s ", 'P', ItemHandler.parfilianingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.parfilianshovel, 1), " P ", " s ", " s ", 'P', ItemHandler.parfilianingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.parfiliansword, 1), "gPg", "gPg", " s ", 'P', ItemHandler.parfilianingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.parfilianpickaxe, 1), "PPP", " s ", " s ", 'P', ItemHandler.parfilianingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.parfilianhelm, 1), "PPP", "P P", "   ", 'P', ItemHandler.parfilianingot);
        register.addRecipe(new ItemStack(ArmorHandler.parfilianplate, 1), "P P", "PPP", "PPP", 'P', ItemHandler.parfilianingot);
        register.addRecipe(new ItemStack(ArmorHandler.parfilianlegs, 1), "PPP", "P P", "P P", 'P', ItemHandler.parfilianingot);
        register.addRecipe(new ItemStack(ArmorHandler.parfilianboots, 1), "   ", "P P", "P P", 'P', ItemHandler.parfilianingot);
        // Barium
        register.addRecipe(new ItemStack(BlockHandler.bariumblock, 1), "BBB", "BBB", "BBB", 'B', ItemHandler.barium);
        register.addShapelessRecipe(new ItemStack(ItemHandler.barium, 4), new Object[] { BlockHandler.bariumblock });
        register.addRecipe(new ItemStack(ToolHandler.bariumaxe, 1), "BB ", "Bs ", " s ", 'B', ItemHandler.bariumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.bariumhoe, 1), "BB ", " s ", " s ", 'B', ItemHandler.bariumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.bariumshovel, 1), " B ", " s ", " s ", 'B', ItemHandler.bariumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.bariumsword, 1), "gBg", "gBg", " s ", 'B', ItemHandler.bariumingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.bariumpickaxe, 1), "BBB", " s ", " s ", 'B', ItemHandler.bariumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.bariumhelm, 1), "BBB", "B B", "   ", 'B', ItemHandler.bariumingot);
        register.addRecipe(new ItemStack(ArmorHandler.bariumplate, 1), "B B", "BBB", "BBB", 'B', ItemHandler.bariumingot);
        register.addRecipe(new ItemStack(ArmorHandler.bariumlegs, 1), "BBB", "B B", "B B", 'B', ItemHandler.bariumingot);
        register.addRecipe(new ItemStack(ArmorHandler.bariumboots, 1), "   ", "B B", "B B", 'B', ItemHandler.bariumingot);
        // Radium
        register.addRecipe(new ItemStack(BlockHandler.radiumblock, 1), "RRR", "RRR", "RRR", 'R', ItemHandler.radium);
        register.addShapelessRecipe(new ItemStack(ItemHandler.radium, 4), new Object[] { BlockHandler.radiumblock });
        register.addRecipe(new ItemStack(ToolHandler.radiumaxe, 1), "RR ", "Rs ", " s ", 'R', ItemHandler.radiumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.radiumhoe, 1), "RR ", " s ", " s ", 'R', ItemHandler.radiumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.radiumshovel, 1), " R ", " s ", " s ", 'R', ItemHandler.radiumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.radiumsword, 1), "gRg", "gRg", " s ", 'R', ItemHandler.radiumingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.radiumpickaxe, 1), "RRR", " s ", " s ", 'R', ItemHandler.radiumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.radiumhelm, 1), "RRR", "R R", "   ", 'R', ItemHandler.radiumingot);
        register.addRecipe(new ItemStack(ArmorHandler.radiumplate, 1), "R R", "RRR", "RRR", 'R', ItemHandler.radiumingot);
        register.addRecipe(new ItemStack(ArmorHandler.radiumlegs, 1), "RRR", "R R", "R R", 'R', ItemHandler.radiumingot);
        register.addRecipe(new ItemStack(ArmorHandler.radiumboots, 1), "   ", "R R", "R R", 'R', ItemHandler.radiumingot);
        // Gallum
        register.addRecipe(new ItemStack(BlockHandler.gallumblock, 1), "GGG", "GGG", "GGG", 'G', ItemHandler.gallum);
        register.addShapelessRecipe(new ItemStack(ItemHandler.gallum, 4), new Object[] { BlockHandler.gallumblock });
        register.addRecipe(new ItemStack(ToolHandler.gallumaxe, 1), "GG ", "Gs ", " s ", 'G', ItemHandler.gallumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.gallumhoe, 1), "GG ", " s ", " s ", 'G', ItemHandler.gallumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.gallumshovel, 1), " G ", " s ", " s ", 'G', ItemHandler.gallumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.gallumsword, 1), "gGg", "gGg", " s ", 'G', ItemHandler.gallumingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.gallumpickaxe, 1), "GGG", " s ", " s ", 'G', ItemHandler.gallumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.gallumhelm, 1), "GGG", "G G", "   ", 'G', ItemHandler.gallumingot);
        register.addRecipe(new ItemStack(ArmorHandler.gallumplate, 1), "G G", "GGG", "GGG", 'G', ItemHandler.gallumingot);
        register.addRecipe(new ItemStack(ArmorHandler.gallumlegs, 1), "GGG", "G G", "G G", 'G', ItemHandler.gallumingot);
        register.addRecipe(new ItemStack(ArmorHandler.gallumboots, 1), "   ", "G G", "G G", 'G', ItemHandler.gallumingot);
        // Vanadium
        register.addRecipe(new ItemStack(BlockHandler.vanadiumblock, 1), "VVV", "VVV", "VVV", 'V', ItemHandler.vanadium);
        register.addShapelessRecipe(new ItemStack(ItemHandler.vanadium, 4), new Object[] { BlockHandler.vanadiumblock });
        register.addRecipe(new ItemStack(ToolHandler.vanadiumaxe, 1), "VV ", "Vs ", " s ", 'V', ItemHandler.vanadiumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.vanadiumhoe, 1), "VV ", " s ", " s ", 'V', ItemHandler.vanadiumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.vanadiumshovel, 1), " V ", " s ", " s ", 'V', ItemHandler.vanadiumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.vanadiumsword, 1), "gVg", "gVg", " s ", 'V', ItemHandler.vanadiumingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.vanadiumpickaxe, 1), "VVV", " s ", " s ", 'V', ItemHandler.vanadiumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.vanadiumhelm, 1), "VVV", "V V", "   ", 'V', ItemHandler.vanadiumingot);
        register.addRecipe(new ItemStack(ArmorHandler.vanadiumplate, 1), "V V", "VVV", "VVV", 'V', ItemHandler.vanadiumingot);
        register.addRecipe(new ItemStack(ArmorHandler.vanadiumlegs, 1), "VVV", "V V", "V V", 'V', ItemHandler.vanadiumingot);
        register.addRecipe(new ItemStack(ArmorHandler.vanadiumboots, 1), "   ", "V V", "V V", 'V', ItemHandler.vanadiumingot);
        // Scandium
        register.addRecipe(new ItemStack(BlockHandler.scandiumblock, 1), "SSS", "SSS", "SSS", 'S', ItemHandler.scandium);
        register.addShapelessRecipe(new ItemStack(ItemHandler.scandium, 4), new Object[] { BlockHandler.scandiumblock });
        register.addRecipe(new ItemStack(ToolHandler.scandiumaxe, 1), "SS ", "Ss ", " s ", 'S', ItemHandler.scandiumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.scandiumhoe, 1), "SS ", " s ", " s ", 'S', ItemHandler.scandiumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.scandiumshovel, 1), " S ", " s ", " s ", 'S', ItemHandler.scandiumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.scandiumsword, 1), "gSg", "gSg", " s ", 'S', ItemHandler.scandiumingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.scandiumpickaxe, 1), "SSS", " s ", " s ", 'S', ItemHandler.scandiumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.scandiumhelm, 1), "SSS", "S S", "   ", 'S', ItemHandler.scandiumingot);
        register.addRecipe(new ItemStack(ArmorHandler.scandiumplate, 1), "S S", "SSS", "SSS", 'S', ItemHandler.scandiumingot);
        register.addRecipe(new ItemStack(ArmorHandler.scandiumlegs, 1), "SSS", "S S", "S S", 'S', ItemHandler.scandiumingot);
        register.addRecipe(new ItemStack(ArmorHandler.scandiumboots, 1), "   ", "S S", "S S", 'S', ItemHandler.scandiumingot);
        // Bismuth
        register.addRecipe(new ItemStack(BlockHandler.bismuthblock, 1), "BBB", "BBB", "BBB", 'B', ItemHandler.bismuth);
        register.addShapelessRecipe(new ItemStack(ItemHandler.bismuth, 4), new Object[] { BlockHandler.bismuthblock });
        register.addRecipe(new ItemStack(ToolHandler.bismuthaxe, 1), "BB ", "Bs ", " s ", 'B', ItemHandler.bismuthingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.bismuthhoe, 1), "BB ", " s ", " s ", 'B', ItemHandler.bismuthingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.bismuthshovel, 1), " B ", " s ", " s ", 'B', ItemHandler.bismuthingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.bismuthsword, 1), "gBg", "gBg", " s ", 'B', ItemHandler.bismuthingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.bismuthpickaxe, 1), "BBB", " s ", " s ", 'B', ItemHandler.bismuthingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.bismuthhelm, 1), "BBB", "B B", "   ", 'B', ItemHandler.bismuthingot);
        register.addRecipe(new ItemStack(ArmorHandler.bismuthplate, 1), "B B", "BBB", "BBB", 'B', ItemHandler.bismuthingot);
        register.addRecipe(new ItemStack(ArmorHandler.bismuthlegs, 1), "BBB", "B B", "B B", 'B', ItemHandler.bismuthingot);
        register.addRecipe(new ItemStack(ArmorHandler.bismuthboots, 1), "   ", "B B", "B B", 'B', ItemHandler.bismuthingot);
        // Indium
        register.addRecipe(new ItemStack(BlockHandler.indiumblock, 1), "III", "III", "III", 'I', ItemHandler.indium);
        register.addShapelessRecipe(new ItemStack(ItemHandler.indium, 4), new Object[] { BlockHandler.indiumblock });
        register.addRecipe(new ItemStack(ToolHandler.indiumaxe, 1), "II ", "Is ", " s ", 'I', ItemHandler.indiumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.indiumhoe, 1), "II ", " s ", " s ", 'I', ItemHandler.indiumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.indiumshovel, 1), " I ", " s ", " s ", 'I', ItemHandler.indiumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.indiumsword, 1), "gIg", "gIg", " s ", 'I', ItemHandler.indiumingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.indiumpickaxe, 1), "III", " s ", " s ", 'I', ItemHandler.indiumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.indiumhelm, 1), "III", "I I", "   ", 'I', ItemHandler.indiumingot);
        register.addRecipe(new ItemStack(ArmorHandler.indiumplate, 1), "I I", "III", "III", 'I', ItemHandler.indiumingot);
        register.addRecipe(new ItemStack(ArmorHandler.indiumlegs, 1), "III", "I I", "I I", 'I', ItemHandler.indiumingot);
        register.addRecipe(new ItemStack(ArmorHandler.indiumboots, 1), "   ", "I I", "I I", 'I', ItemHandler.indiumingot);
        // Platinum
        register.addRecipe(new ItemStack(BlockHandler.platinumblock, 1), "PPP", "PPP", "PPP", 'P', ItemHandler.platinum);
        register.addShapelessRecipe(new ItemStack(ItemHandler.platinum, 4), new Object[] { BlockHandler.platinumblock });
        register.addRecipe(new ItemStack(ToolHandler.platinumaxe, 1), "PP ", "Ps ", " s ", 'P', ItemHandler.platinumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.platinumhoe, 1), "PP ", " s ", " s ", 'P', ItemHandler.platinumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.platinumshovel, 1), " P ", " s ", " s ", 'P', ItemHandler.platinumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.platinumsword, 1), "gPg", "gPg", " s ", 'P', ItemHandler.platinumingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.platinumpickaxe, 1), "PPP", " s ", " s ", 'P', ItemHandler.platinumingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.platinumhelm, 1), "PPP", "P P", "   ", 'P', ItemHandler.platinumingot);
        register.addRecipe(new ItemStack(ArmorHandler.platinumplate, 1), "P P", "PPP", "PPP", 'P', ItemHandler.platinumingot);
        register.addRecipe(new ItemStack(ArmorHandler.platinumlegs, 1), "PPP", "P P", "P P", 'P', ItemHandler.platinumingot);
        register.addRecipe(new ItemStack(ArmorHandler.platinumboots, 1), "   ", "P P", "P P", 'P', ItemHandler.platinumingot);
        // Darkness
        register.addRecipe(new ItemStack(ItemHandler.darkness, 1), "DDD", "DDD", "DDD", 'D', ItemHandler.darknessshard);
        register.addRecipe(new ItemStack(BlockHandler.darknessblock, 1), "DDD", "DDD", "DDD", 'D', ItemHandler.darkness);
        register.addShapelessRecipe(new ItemStack(ItemHandler.darkness, 4), new Object[] { BlockHandler.darknessblock });
        register.addRecipe(new ItemStack(ToolHandler.darknessaxe, 1), "DD ", "Ds ", " s ", 'D', ItemHandler.darknessingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.darknesshoe, 1), "DD ", " s ", " s ", 'D', ItemHandler.darknessingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.darknessshovel, 1), " D ", " s ", " s ", 'D', ItemHandler.darknessingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.darknesssword, 1), "gDg", "gDg", " s ", 'D', ItemHandler.darknessingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.darknesspickaxe, 1), "DDD", " s ", " s ", 'D', ItemHandler.darknessingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.darknesshelm, 1), "DDD", "D D", "   ", 'D', ItemHandler.darknessingot);
        register.addRecipe(new ItemStack(ArmorHandler.darknessplate, 1), "D D", "DDD", "DDD", 'D', ItemHandler.darknessingot);
        register.addRecipe(new ItemStack(ArmorHandler.darknesslegs, 1), "DDD", "D D", "D D", 'D', ItemHandler.darknessingot);
        register.addRecipe(new ItemStack(ArmorHandler.darknessboots, 1), "   ", "D D", "D D", 'D', ItemHandler.darknessingot);
        // Light
        register.addRecipe(new ItemStack(ItemHandler.light, 1), "LLL", "LLL", "LLL", 'L', ItemHandler.lightshard);
        register.addRecipe(new ItemStack(BlockHandler.lightblock, 1), "LLL", "LLL", "LLL", 'L', ItemHandler.light);
        register.addShapelessRecipe(new ItemStack(ItemHandler.light, 4), new Object[] { BlockHandler.lightblock });
        register.addRecipe(new ItemStack(ToolHandler.lightaxe, 1), "LL ", "Ls ", " s ", 'L', ItemHandler.lightingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.lighthoe, 1), "LL ", " s ", " s ", 'L', ItemHandler.lightingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.lightshovel, 1), " L ", " s ", " s ", 'L', ItemHandler.lightingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.lightsword, 1), "gLg", "gLg", " s ", 'L', ItemHandler.lightingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.lightpickaxe, 1), "LLL", " s ", " s ", 'L', ItemHandler.lightingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.lighthelm, 1), "LLL", "L L", "   ", 'L', ItemHandler.lightingot);
        register.addRecipe(new ItemStack(ArmorHandler.lightplate, 1), "L L", "LLL", "LLL", 'L', ItemHandler.lightingot);
        register.addRecipe(new ItemStack(ArmorHandler.lightlegs, 1), "LLL", "L L", "L L", 'L', ItemHandler.lightingot);
        register.addRecipe(new ItemStack(ArmorHandler.lightboots, 1), "   ", "L L", "L L", 'L', ItemHandler.lightingot);
        // Omega
        register.addRecipe(new ItemStack(ItemHandler.omega, 1), "OOO", "OOO", "OOO", 'O', ItemHandler.omegashards);
        register.addRecipe(new ItemStack(BlockHandler.omegablock, 1), "OOO", "OOO", "OOO", 'O', ItemHandler.omega);
        register.addShapelessRecipe(new ItemStack(ItemHandler.omega, 4), new Object[] { BlockHandler.omegablock });
        register.addRecipe(new ItemStack(ToolHandler.omegaaxe, 1), "OO ", "Os ", " s ", 'O', ItemHandler.omegaingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.omegahoe, 1), "OO ", " s ", " s ", 'O', ItemHandler.omegaingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.omegashovel, 1), " O ", " s ", " s ", 'O', ItemHandler.omegaingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.omegasword, 1), "gOg", "gOg", " s ", 'O', ItemHandler.omegaingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.omegapickaxe, 1), "OOO", " s ", " s ", 'O', ItemHandler.omegaingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.omegahelm, 1), "OOO", "O O", "   ", 'O', ItemHandler.omegaingot);
        register.addRecipe(new ItemStack(ArmorHandler.omegaplate, 1), "O O", "OOO", "OOO", 'O', ItemHandler.omegaingot);
        register.addRecipe(new ItemStack(ArmorHandler.omegalegs, 1), "OOO", "O O", "O O", 'O', ItemHandler.omegaingot);
        register.addRecipe(new ItemStack(ArmorHandler.omegaboots, 1), "   ", "O O", "O O", 'O', ItemHandler.omegaingot);
        // Bubble
        register.addRecipe(new ItemStack(BlockHandler.bubbleblock, 1), "BBB", "BBB", "BBB", 'B', ItemHandler.bubbles);
        register.addRecipe(new ItemStack(ToolHandler.bubblesword, 1), "gBg", "gBg", " s ", 'B', ItemHandler.bubbles, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ItemHandler.bubbles, 1), "bbb", "bbb", "bbb", 'b', ItemHandler.bubble);
        register.addShapedRecipe(new ItemStack(ItemHandler.bubble), "dd ", "dd ", "   ", 'd', Item.diamond);
        register.addShapedRecipe(new ItemStack(ItemHandler.bubble), " dd", " dd", "   ", 'd', Item.diamond);
        register.addShapedRecipe(new ItemStack(ItemHandler.bubble), "   ", "dd ", "dd ", 'd', Item.diamond);
        register.addShapedRecipe(new ItemStack(ItemHandler.bubble), "   ", " dd", " dd", 'd', Item.diamond);
        // Berionvar
        register.addRecipe(new ItemStack(BlockHandler.berionvarblock, 1), "BBB", "BBB", "BBB", 'B', ItemHandler.berionvar);
        register.addShapelessRecipe(new ItemStack(ItemHandler.berionvar, 4), new Object[] { BlockHandler.berionvarblock });
        register.addRecipe(new ItemStack(ToolHandler.berionvaraxe, 1), "BB ", "Bs ", " s ", 'B', ItemHandler.berionvaringot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.berionvarhoe, 1), "BB ", " s ", " s ", 'B', ItemHandler.berionvaringot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.berionvarshovel, 1), " B ", " s ", " s ", 'B', ItemHandler.berionvaringot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.berionvarsword, 1), "gBg", "gBg", " s ", 'B', ItemHandler.berionvaringot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.berionvarpickaxe, 1), "BBB", " s ", " s ", 'B', ItemHandler.berionvaringot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.berionvarhelm, 1), "BBB", "B B", "   ", 'B', ItemHandler.berionvaringot);
        register.addRecipe(new ItemStack(ArmorHandler.berionvarplate, 1), "B B", "BBB", "BBB", 'B', ItemHandler.berionvaringot);
        register.addRecipe(new ItemStack(ArmorHandler.berionvarlegs, 1), "BBB", "B B", "B B", 'B', ItemHandler.berionvaringot);
        register.addRecipe(new ItemStack(ArmorHandler.berionvarboots, 1), "   ", "B B", "B B", 'B', ItemHandler.berionvaringot);
        // Charviole
        register.addRecipe(new ItemStack(BlockHandler.charvioleblock, 1), "CCC", "CCC", "CCC", 'C', ItemHandler.charviole);
        register.addShapelessRecipe(new ItemStack(ItemHandler.charviole, 4), new Object[] { BlockHandler.charvioleblock });
        register.addRecipe(new ItemStack(ToolHandler.charvioleaxe, 1), "CC ", "Cs ", " s ", 'C', ItemHandler.charvioleingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.charviolehoe, 1), "CC ", " s ", " s ", 'C', ItemHandler.charvioleingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.charvioleshovel, 1), " C ", " s ", " s ", 'C', ItemHandler.charvioleingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.charviolesword, 1), "gCg", "gCg", " s ", 'C', ItemHandler.charvioleingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.charviolepickaxe, 1), "CCC", " s ", " s ", 'C', ItemHandler.charvioleingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.charviolehelm, 1), "CCC", "C C", "   ", 'C', ItemHandler.charvioleingot);
        register.addRecipe(new ItemStack(ArmorHandler.charvioleplate, 1), "C C", "CCC", "CCC", 'C', ItemHandler.charvioleingot);
        register.addRecipe(new ItemStack(ArmorHandler.charviolelegs, 1), "CCC", "C C", "C C", 'C', ItemHandler.charvioleingot);
        register.addRecipe(new ItemStack(ArmorHandler.charvioleboots, 1), "   ", "C C", "C C", 'C', ItemHandler.charvioleingot);
        // Firlvear
        register.addRecipe(new ItemStack(BlockHandler.firlvearblock, 1), "FFF", "FFF", "FFF", 'F', ItemHandler.firlvear);
        register.addShapelessRecipe(new ItemStack(ItemHandler.firlvear, 4), new Object[] { BlockHandler.firlvearblock });
        register.addRecipe(new ItemStack(ToolHandler.firlvearaxe, 1), "FF ", "Fs ", " s ", 'F', ItemHandler.firlvearingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.firlvearhoe, 1), "FF ", " s ", " s ", 'F', ItemHandler.firlvearingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.firlvearshovel, 1), " F ", " s ", " s ", 'F', ItemHandler.firlvearingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.firlvearsword, 1), "gFg", "gFg", " s ", 'F', ItemHandler.firlvearingot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.firlvearpickaxe, 1), "FFF", " s ", " s ", 'F', ItemHandler.firlvearingot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.firlvearhelm, 1), "FFF", "F F", "   ", 'F', ItemHandler.firlvearingot);
        register.addRecipe(new ItemStack(ArmorHandler.firlvearplate, 1), "F F", "FFF", "FFF", 'F', ItemHandler.firlvearingot);
        register.addRecipe(new ItemStack(ArmorHandler.firlvearlegs, 1), "FFF", "F F", "F F", 'F', ItemHandler.firlvearingot);
        register.addRecipe(new ItemStack(ArmorHandler.firlvearboots, 1), "   ", "F F", "F F", 'F', ItemHandler.firlvearingot);
        // Selmenrer
        register.addRecipe(new ItemStack(BlockHandler.selmenrerblock, 1), "SSS", "SSS", "SSS", 'S', ItemHandler.selmenrer);
        register.addShapelessRecipe(new ItemStack(ItemHandler.selmenrer, 4), new Object[] { BlockHandler.selmenrerblock });
        register.addRecipe(new ItemStack(ToolHandler.selmenreraxe, 1), "SS ", "Ss ", " s ", 'S', ItemHandler.selmenreringot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.selmenrerhoe, 1), "SS ", " s ", " s ", 'S', ItemHandler.selmenreringot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.selmenrershovel, 1), " S ", " s ", " s ", 'S', ItemHandler.selmenreringot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.selmenrersword, 1), "gSg", "gSg", " s ", 'S', ItemHandler.selmenreringot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.selmenrerpickaxe, 1), "SSS", " s ", " s ", 'S', ItemHandler.selmenreringot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.selmenrerhelm, 1), "SSS", "S S", "   ", 'S', ItemHandler.selmenreringot);
        register.addRecipe(new ItemStack(ArmorHandler.selmenrerplate, 1), "S S", "SSS", "SSS", 'S', ItemHandler.selmenreringot);
        register.addRecipe(new ItemStack(ArmorHandler.selmenrerlegs, 1), "SSS", "S S", "S S", 'S', ItemHandler.selmenreringot);
        register.addRecipe(new ItemStack(ArmorHandler.selmenrerboots, 1), "   ", "S S", "S S", 'S', ItemHandler.selmenreringot);
        // Verilion
        register.addRecipe(new ItemStack(BlockHandler.verilionblock, 1), "VVV", "VVV", "VVV", 'V', ItemHandler.verilion);
        register.addShapelessRecipe(new ItemStack(ItemHandler.verilion, 4), new Object[] { BlockHandler.verilionblock });
        register.addRecipe(new ItemStack(ToolHandler.verilionaxe, 1), "VV ", "Vs ", " s ", 'V', ItemHandler.verilioningot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.verilionhoe, 1), "VV ", " s ", " s ", 'V', ItemHandler.verilioningot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.verilionshovel, 1), " V ", " s ", " s ", 'V', ItemHandler.verilioningot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.verilionsword, 1), "gVg", "gVg", " s ", 'V', ItemHandler.verilioningot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.verilionpickaxe, 1), "VVV", " s ", " s ", 'V', ItemHandler.verilioningot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.verilionhelm, 1), "VVV", "V V", "   ", 'V', ItemHandler.verilioningot);
        register.addRecipe(new ItemStack(ArmorHandler.verilionplate, 1), "V V", "VVV", "VVV", 'V', ItemHandler.verilioningot);
        register.addRecipe(new ItemStack(ArmorHandler.verilionlegs, 1), "VVV", "V V", "V V", 'V', ItemHandler.verilioningot);
        register.addRecipe(new ItemStack(ArmorHandler.verilionboots, 1), "   ", "V V", "V V", 'V', ItemHandler.verilioningot);
        // Vielvor
        register.addRecipe(new ItemStack(BlockHandler.vielvorblock, 1), "vvv", "vvv", "vvv", 'v', ItemHandler.vielvor);
        register.addShapelessRecipe(new ItemStack(ItemHandler.vielvor, 4), new Object[] { BlockHandler.vielvorblock });
        register.addRecipe(new ItemStack(ToolHandler.vielvoraxe, 1), "vv ", "vs ", " s ", 'v', ItemHandler.vielvoringot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.vielvorhoe, 1), "vv ", " s ", " s ", 'v', ItemHandler.vielvoringot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.vielvorshovel, 1), " v ", " s ", " s ", 'v', ItemHandler.vielvoringot, 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.vielvorsword, 1), "gvg", "gvg", " s ", 'v', ItemHandler.vielvoringot, 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.vielvorpickaxe, 1), "vvv", " s ", " s ", 'v', ItemHandler.vielvoringot, 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.vielvorhelm, 1), "vvv", "v v", "   ", 'v', ItemHandler.vielvoringot);
        register.addRecipe(new ItemStack(ArmorHandler.vielvorplate, 1), "v v", "vvv", "vvv", 'v', ItemHandler.vielvoringot);
        register.addRecipe(new ItemStack(ArmorHandler.vielvorlegs, 1), "vvv", "v v", "v v", 'v', ItemHandler.vielvoringot);
        register.addRecipe(new ItemStack(ArmorHandler.vielvorboots, 1), "   ", "v v", "v v", 'v', ItemHandler.vielvoringot);
        // seeds
        register.addRecipe(new ItemStack(ItemHandler.darkness, 1), "ddd", "ddd", "ddd", 'd', CropHandler.darknessseeds);
        register.addRecipe(new ItemStack(ItemHandler.light, 1), "lll", "lll", "lll", 'l', CropHandler.lightseeds);
    }

    public static void addSmelting(GameRegistry register) {
        // urotark
        register.addSmelting(BlockHandler.urotarkore.blockID, new ItemStack(ItemHandler.urotark, 1), 6.0F);
        register.addSmelting(BlockHandler.urotarkblock.blockID, new ItemStack(ItemHandler.urotarkingot, 1), 6.0F);
        // pearl
        register.addSmelting(BlockHandler.pearlore.blockID, new ItemStack(ItemHandler.pearl, 1), 7.0F);
        register.addSmelting(BlockHandler.pearlblock.blockID, new ItemStack(ItemHandler.pearlingot, 1), 7.0F);
        // sapphire
        register.addSmelting(BlockHandler.sapphireore.blockID, new ItemStack(ItemHandler.sapphire, 1), 8.0F);
        register.addSmelting(BlockHandler.sapphireblock.blockID, new ItemStack(ItemHandler.sapphireingot, 1), 8.0F);
        // muscovite
        register.addSmelting(BlockHandler.muscoviteore.blockID, new ItemStack(ItemHandler.muscovite, 1), 9.0F);
        register.addSmelting(BlockHandler.muscoviteblock.blockID, new ItemStack(ItemHandler.muscoviteingot, 1), 9.0F);
        // ruby
        register.addSmelting(BlockHandler.rubyore.blockID, new ItemStack(ItemHandler.ruby, 1), 10.0F);
        register.addSmelting(BlockHandler.rubyblock.blockID, new ItemStack(ItemHandler.rubyingot, 1), 10.0F);
        // uriotyke
        register.addSmelting(BlockHandler.uriotykeore.blockID, new ItemStack(ItemHandler.uriotyke, 1), 11.0F);
        register.addSmelting(BlockHandler.uriotykeblock.blockID, new ItemStack(ItemHandler.uriotykeingot, 1), 11.0F);
        // gilder
        register.addSmelting(BlockHandler.gilderore.blockID, new ItemStack(ItemHandler.gilder, 1), 12.0F);
        register.addSmelting(BlockHandler.gilderblock.blockID, new ItemStack(ItemHandler.gilderingot, 1), 12.0F);
        // selovar
        register.addSmelting(BlockHandler.selovarore.blockID, new ItemStack(ItemHandler.selovar, 1), 13.0F);
        register.addSmelting(BlockHandler.selovarblock.blockID, new ItemStack(ItemHandler.selovaringot, 1), 13.0F);
        // parfilian
        register.addSmelting(BlockHandler.parfilianore.blockID, new ItemStack(ItemHandler.parfilian, 1), 14.0F);
        register.addSmelting(BlockHandler.parfilianblock.blockID, new ItemStack(ItemHandler.parfilianingot, 1), 14.0F);
        // barium
        register.addSmelting(BlockHandler.bariumore.blockID, new ItemStack(ItemHandler.barium, 1), 15.0F);
        register.addSmelting(BlockHandler.bariumblock.blockID, new ItemStack(ItemHandler.bariumingot, 1), 15.0F);
        // radium
        register.addSmelting(BlockHandler.radiumore.blockID, new ItemStack(ItemHandler.radium, 1), 16.0F);
        register.addSmelting(BlockHandler.radiumblock.blockID, new ItemStack(ItemHandler.radiumingot, 1), 16.0F);
        // gallum
        register.addSmelting(BlockHandler.gallumore.blockID, new ItemStack(ItemHandler.gallum, 1), 17.0F);
        register.addSmelting(BlockHandler.gallumblock.blockID, new ItemStack(ItemHandler.gallumingot, 1), 17.0F);
        // vanadium
        register.addSmelting(BlockHandler.vanadiumore.blockID, new ItemStack(ItemHandler.vanadium, 1), 18.0F);
        register.addSmelting(BlockHandler.vanadiumblock.blockID, new ItemStack(ItemHandler.vanadiumingot, 1), 18.0F);
        // scandium
        register.addSmelting(BlockHandler.scandiumore.blockID, new ItemStack(ItemHandler.scandium, 1), 19.0F);
        register.addSmelting(BlockHandler.scandiumblock.blockID, new ItemStack(ItemHandler.scandiumingot, 1), 19.0F);
        // bismuth
        register.addSmelting(BlockHandler.bismuthore.blockID, new ItemStack(ItemHandler.bismuth, 1), 20.0F);
        register.addSmelting(BlockHandler.bismuthblock.blockID, new ItemStack(ItemHandler.bismuthingot, 1), 20.0F);
        // indium
        register.addSmelting(BlockHandler.indiumore.blockID, new ItemStack(ItemHandler.indium, 1), 21.0F);
        register.addSmelting(BlockHandler.indiumblock.blockID, new ItemStack(ItemHandler.indiumingot, 1), 21.0F);
        // platinum
        register.addSmelting(BlockHandler.platinumore.blockID, new ItemStack(ItemHandler.platinum, 1), 22.0F);
        register.addSmelting(BlockHandler.platinumblock.blockID, new ItemStack(ItemHandler.platinumingot, 1), 22.0F);
        // darkness
        register.addSmelting(BlockHandler.darknessore.blockID, new ItemStack(ItemHandler.darknessshard, 1), 25.0F);
        register.addSmelting(BlockHandler.darknessblock.blockID, new ItemStack(ItemHandler.darknessingot, 1), 25.0F);
        // light
        register.addSmelting(BlockHandler.lightore.blockID, new ItemStack(ItemHandler.lightshard, 1), 25.0F);
        register.addSmelting(BlockHandler.lightblock.blockID, new ItemStack(ItemHandler.lightingot, 1), 25.0F);
        // omega
        register.addSmelting(BlockHandler.omegaore.blockID, new ItemStack(ItemHandler.omegashards, 1), 30.0F);
        register.addSmelting(BlockHandler.omegablock.blockID, new ItemStack(ItemHandler.omegaingot, 1), 30.0F);
        // Berionvar
        register.addSmelting(BlockHandler.berionvarore.blockID, new ItemStack(ItemHandler.berionvar, 1), 23.0F);
        register.addSmelting(BlockHandler.berionvarblock.blockID, new ItemStack(ItemHandler.berionvaringot, 1), 23.0F);
        // Charviole
        register.addSmelting(BlockHandler.charvioleore.blockID, new ItemStack(ItemHandler.charviole, 1), 24.0F);
        register.addSmelting(BlockHandler.charvioleblock.blockID, new ItemStack(ItemHandler.charvioleingot, 1), 24.0F);
        // Firlvear
        register.addSmelting(BlockHandler.firlvearore.blockID, new ItemStack(ItemHandler.firlvear, 1), 25.0F);
        register.addSmelting(BlockHandler.firlvearblock.blockID, new ItemStack(ItemHandler.firlvearingot, 1), 25.0F);
        // Selmenrer
        register.addSmelting(BlockHandler.selmenrerore.blockID, new ItemStack(ItemHandler.selmenrer, 1), 26.0F);
        register.addSmelting(BlockHandler.selmenrerblock.blockID, new ItemStack(ItemHandler.selmenreringot, 1), 26.0F);
        // Verilion
        register.addSmelting(BlockHandler.verilionore.blockID, new ItemStack(ItemHandler.verilion, 1), 27.0F);
        register.addSmelting(BlockHandler.verilionblock.blockID, new ItemStack(ItemHandler.verilioningot, 1), 27.0F);
        // Vielvor
        register.addSmelting(BlockHandler.vielvorore.blockID, new ItemStack(ItemHandler.vielvor, 1), 28.0F);
        register.addSmelting(BlockHandler.vielvorblock.blockID, new ItemStack(ItemHandler.vielvoringot, 1), 28.0F);
    }

}
