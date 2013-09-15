package kakarotvg.omega.handlers.crafting;

import kakarotvg.omega.computer.ComputerRecipes;
import kakarotvg.omega.handlers.armor.ArmorHandler;
import kakarotvg.omega.handlers.blocks.BlockHandler;
import kakarotvg.omega.handlers.crops.CropHandler;
import kakarotvg.omega.handlers.item.ItemHandler;
import kakarotvg.omega.handlers.liquids.LiquidHandler;
import kakarotvg.omega.handlers.tileentity.TileEntityHandler;
import kakarotvg.omega.handlers.tools.ToolHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
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
        register.addRecipe(new ItemStack(BlockHandler.urotarkblock, 1, 1), "PPP", "PPP", "PPP", 'P', new ItemStack(ItemHandler.urotark, 1, 1));
        register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4, 1), new Object[] { new ItemStack(BlockHandler.urotarkblock, 1, 1) });
        register.addRecipe(new ItemStack(ToolHandler.pearlaxe, 1), "PP ", "Ps ", " s ", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 1), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.pearlhoe, 1), "PP ", " s ", " s ", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 1), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.pearlshovel, 1), " P ", " s ", " s ", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 1), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.pearlsword, 1), "gPg", "gPg", " s ", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 1), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.pearlpickaxe, 1), "PPP", " s ", " s ", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 1), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.pearlhelm, 1), "PPP", "P P", "   ", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 1));
        register.addRecipe(new ItemStack(ArmorHandler.pearlplate, 1), "P P", "PPP", "PPP", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 1));
        register.addRecipe(new ItemStack(ArmorHandler.pearllegs, 1), "PPP", "P P", "P P", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 1));
        register.addRecipe(new ItemStack(ArmorHandler.pearlboots, 1), "   ", "P P", "P P", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 1));
        // Sapphire
        register.addRecipe(new ItemStack(BlockHandler.urotarkblock, 1, 2), "SSS", "SSS", "SSS", 'S', new ItemStack(ItemHandler.urotark, 1, 2));
        register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4, 2), new Object[] { new ItemStack(BlockHandler.urotarkblock, 1, 2) });
        register.addRecipe(new ItemStack(ToolHandler.sapphireaxe, 1), "SS ", "Ss ", " s ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 2), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.sapphirehoe, 1), "SS ", " s ", " s ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 2), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.sapphireshovel, 1), " S ", " s ", " s ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 2), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.sapphiresword, 1), "gSg", "gSg", " s ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 2), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.sapphirepickaxe, 1), "SSS", " s ", " s ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 2), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.sapphirehelm, 1), "SSS", "S S", "   ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 2));
        register.addRecipe(new ItemStack(ArmorHandler.sapphireplate, 1), "S S", "SSS", "SSS", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 2));
        register.addRecipe(new ItemStack(ArmorHandler.sapphirelegs, 1), "SSS", "S S", "S S", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 2));
        register.addRecipe(new ItemStack(ArmorHandler.sapphireboots, 1), "   ", "S S", "S S", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 2));
        // Muscovite
        register.addRecipe(new ItemStack(BlockHandler.muscoviteblock, 1), "MMM", "MMM", "MMM", 'M', new ItemStack(ItemHandler.urotark, 1, 3));
        register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4, 3), new Object[] { BlockHandler.muscoviteblock });
        register.addRecipe(new ItemStack(ToolHandler.muscoviteaxe, 1), "MM ", "Ms ", " s ", 'M', new ItemStack(ItemHandler.urotarkingot, 1, 3), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.muscovitehoe, 1), "MM ", " s ", " s ", 'M', new ItemStack(ItemHandler.urotarkingot, 1, 3), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.muscoviteshovel, 1), " M ", " s ", " s ", 'M', new ItemStack(ItemHandler.urotarkingot, 1, 3), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.muscovitesword, 1), "gMg", "gMg", " s ", 'M', new ItemStack(ItemHandler.urotarkingot, 1, 3), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.muscovitepickaxe, 1), "MMM", " s ", " s ", 'M', new ItemStack(ItemHandler.urotarkingot, 1, 3), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.muscovitehelm, 1), "MMM", "M M", "   ", 'M', new ItemStack(ItemHandler.urotarkingot, 1, 3));
        register.addRecipe(new ItemStack(ArmorHandler.muscoviteplate, 1), "M M", "MMM", "MMM", 'M', new ItemStack(ItemHandler.urotarkingot, 1, 3));
        register.addRecipe(new ItemStack(ArmorHandler.muscovitelegs, 1), "MMM", "M M", "M M", 'M', new ItemStack(ItemHandler.urotarkingot, 1, 3));
        register.addRecipe(new ItemStack(ArmorHandler.muscoviteboots, 1), "   ", "M M", "M M", 'M', new ItemStack(ItemHandler.urotarkingot, 1, 3));
        // Ruby
        register.addRecipe(new ItemStack(BlockHandler.muscoviteblock, 1, 1), "RRR", "RRR", "RRR", 'R', new ItemStack(ItemHandler.urotark, 1, 4));
        register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4, 4), new Object[] { new ItemStack(BlockHandler.muscoviteblock, 1, 1) });
        register.addRecipe(new ItemStack(ToolHandler.rubyaxe, 1), "RR ", "Rs ", " s ", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 4), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.rubyhoe, 1), "RR ", " s ", " s ", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 4), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.rubyshovel, 1), " R ", " s ", " s ", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 4), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.rubysword, 1), "gRg", "gRg", " s ", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 4), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.rubypickaxe, 1), "RRR", " s ", " s ", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 4), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.rubyhelm, 1), "RRR", "R R", "   ", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 4));
        register.addRecipe(new ItemStack(ArmorHandler.rubyplate, 1), "R R", "RRR", "RRR", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 4));
        register.addRecipe(new ItemStack(ArmorHandler.rubylegs, 1), "RRR", "R R", "R R", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 4));
        register.addRecipe(new ItemStack(ArmorHandler.rubyboots, 1), "   ", "R R", "R R", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 4));
        // Uriotyke
        register.addRecipe(new ItemStack(BlockHandler.muscoviteblock, 1, 2), "UUU", "UUU", "UUU", 'U', new ItemStack(ItemHandler.urotark, 1, 5));
        register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4, 5), new Object[] { new ItemStack(BlockHandler.muscoviteblock, 1, 2) });
        register.addRecipe(new ItemStack(ToolHandler.uriotykeaxe, 1), "UU ", "Us ", " s ", 'U', new ItemStack(ItemHandler.urotarkingot, 1, 5), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.uriotykehoe, 1), "UU ", " s ", " s ", 'U', new ItemStack(ItemHandler.urotarkingot, 1, 5), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.uriotykeshovel, 1), " U ", " s ", " s ", 'U', new ItemStack(ItemHandler.urotarkingot, 1, 5), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.uriotykesword, 1), "gUg", "gUg", " s ", 'U', new ItemStack(ItemHandler.urotarkingot, 1, 5), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.uriotykepickaxe, 1), "UUU", " s ", " s ", 'U', new ItemStack(ItemHandler.urotarkingot, 1, 5), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.uriotykehelm, 1), "UUU", "U U", "   ", 'U', new ItemStack(ItemHandler.urotarkingot, 1, 5));
        register.addRecipe(new ItemStack(ArmorHandler.uriotykeplate, 1), "U U", "UUU", "UUU", 'U', new ItemStack(ItemHandler.urotarkingot, 1, 5));
        register.addRecipe(new ItemStack(ArmorHandler.uriotykelegs, 1), "UUU", "U U", "U U", 'U', new ItemStack(ItemHandler.urotarkingot, 1, 5));
        register.addRecipe(new ItemStack(ArmorHandler.uriotykeboots, 1), "   ", "U U", "U U", 'U', new ItemStack(ItemHandler.urotarkingot, 1, 5));
        // Gilder
        register.addRecipe(new ItemStack(BlockHandler.gilderblock, 1), "GGG", "GGG", "GGG", 'G', new ItemStack(ItemHandler.urotark, 1, 6));
        register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4, 6), new Object[] { BlockHandler.gilderblock });
        register.addRecipe(new ItemStack(ToolHandler.gilderaxe, 1), "GG ", "Gs ", " s ", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 6), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.gilderhoe, 1), "GG ", " s ", " s ", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 6), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.gildershovel, 1), " G ", " s ", " s ", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 6), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.gildersword, 1), "gGg", "gGg", " s ", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 6), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.gilderpickaxe, 1), "GGG", " s ", " s ", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 6), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.gilderhelm, 1), "GGG", "G G", "   ", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 6));
        register.addRecipe(new ItemStack(ArmorHandler.gilderplate, 1), "G G", "GGG", "GGG", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 6));
        register.addRecipe(new ItemStack(ArmorHandler.gilderlegs, 1), "GGG", "G G", "G G", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 6));
        register.addRecipe(new ItemStack(ArmorHandler.gilderboots, 1), "   ", "G G", "G G", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 6));
        // Selovar
        register.addRecipe(new ItemStack(BlockHandler.gilderblock, 1, 1), "SSS", "SSS", "SSS", 'S', new ItemStack(ItemHandler.urotark, 1, 7));
        register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4, 7), new Object[] { new ItemStack(BlockHandler.gilderblock, 1, 1) });
        register.addRecipe(new ItemStack(ToolHandler.selovaraxe, 1), "SS ", "Ss ", " s ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 7), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.selovarhoe, 1), "SS ", " s ", " s ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 7), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.selovarshovel, 1), " S ", " s ", " s ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 7), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.selovarsword, 1), "gSg", "gSg", " s ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 7), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.selovarpickaxe, 1), "SSS", " s ", " s ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 7), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.selovarhelm, 1), "SSS", "S S", "   ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 7));
        register.addRecipe(new ItemStack(ArmorHandler.selovarplate, 1), "S S", "SSS", "SSS", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 7));
        register.addRecipe(new ItemStack(ArmorHandler.selovarlegs, 1), "SSS", "S S", "S S", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 7));
        register.addRecipe(new ItemStack(ArmorHandler.selovarboots, 1), "   ", "S S", "S S", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 7));
        // Parfilian
        register.addRecipe(new ItemStack(BlockHandler.gilderblock, 1, 2), "PPP", "PPP", "PPP", 'P', new ItemStack(ItemHandler.urotark, 1, 8));
        register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4, 8), new Object[] { new ItemStack(BlockHandler.gilderblock, 1, 2) });
        register.addRecipe(new ItemStack(ToolHandler.parfilianaxe, 1), "PP ", "Ps ", " s ", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 8), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.parfilianhoe, 1), "PP ", " s ", " s ", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 8), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.parfilianshovel, 1), " P ", " s ", " s ", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 8), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.parfiliansword, 1), "gPg", "gPg", " s ", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 8), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.parfilianpickaxe, 1), "PPP", " s ", " s ", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 8), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.parfilianhelm, 1), "PPP", "P P", "   ", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 8));
        register.addRecipe(new ItemStack(ArmorHandler.parfilianplate, 1), "P P", "PPP", "PPP", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 8));
        register.addRecipe(new ItemStack(ArmorHandler.parfilianlegs, 1), "PPP", "P P", "P P", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 8));
        register.addRecipe(new ItemStack(ArmorHandler.parfilianboots, 1), "   ", "P P", "P P", 'P', new ItemStack(ItemHandler.urotarkingot, 1, 8));
        // Barium
        register.addRecipe(new ItemStack(BlockHandler.bariumblock, 1), "BBB", "BBB", "BBB", 'B', new ItemStack(ItemHandler.urotark, 1, 9));
        register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4, 9), new Object[] { BlockHandler.bariumblock });
        register.addRecipe(new ItemStack(ToolHandler.bariumaxe, 1), "BB ", "Bs ", " s ", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 9), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.bariumhoe, 1), "BB ", " s ", " s ", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 9), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.bariumshovel, 1), " B ", " s ", " s ", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 9), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.bariumsword, 1), "gBg", "gBg", " s ", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 9), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.bariumpickaxe, 1), "BBB", " s ", " s ", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 9), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.bariumhelm, 1), "BBB", "B B", "   ", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 9));
        register.addRecipe(new ItemStack(ArmorHandler.bariumplate, 1), "B B", "BBB", "BBB", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 9));
        register.addRecipe(new ItemStack(ArmorHandler.bariumlegs, 1), "BBB", "B B", "B B", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 9));
        register.addRecipe(new ItemStack(ArmorHandler.bariumboots, 1), "   ", "B B", "B B", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 9));
        // Radium
        register.addRecipe(new ItemStack(BlockHandler.bariumblock, 1, 1), "RRR", "RRR", "RRR", 'R', new ItemStack(ItemHandler.urotark, 1, 10));
        register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4, 10), new Object[] { new ItemStack(BlockHandler.bariumblock, 1, 1) });
        register.addRecipe(new ItemStack(ToolHandler.radiumaxe, 1), "RR ", "Rs ", " s ", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 10), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.radiumhoe, 1), "RR ", " s ", " s ", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 10), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.radiumshovel, 1), " R ", " s ", " s ", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 10), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.radiumsword, 1), "gRg", "gRg", " s ", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 10), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.radiumpickaxe, 1), "RRR", " s ", " s ", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 10), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.radiumhelm, 1), "RRR", "R R", "   ", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 10));
        register.addRecipe(new ItemStack(ArmorHandler.radiumplate, 1), "R R", "RRR", "RRR", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 10));
        register.addRecipe(new ItemStack(ArmorHandler.radiumlegs, 1), "RRR", "R R", "R R", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 10));
        register.addRecipe(new ItemStack(ArmorHandler.radiumboots, 1), "   ", "R R", "R R", 'R', new ItemStack(ItemHandler.urotarkingot, 1, 10));
        // Gallum
        register.addRecipe(new ItemStack(BlockHandler.bariumblock, 1, 2), "GGG", "GGG", "GGG", 'G', new ItemStack(ItemHandler.urotark, 1, 11));
        register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4, 11), new Object[] { new ItemStack(BlockHandler.bariumblock, 1, 2) });
        register.addRecipe(new ItemStack(ToolHandler.gallumaxe, 1), "GG ", "Gs ", " s ", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 11), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.gallumhoe, 1), "GG ", " s ", " s ", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 11), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.gallumshovel, 1), " G ", " s ", " s ", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 11), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.gallumsword, 1), "gGg", "gGg", " s ", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 11), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.gallumpickaxe, 1), "GGG", " s ", " s ", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 11), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.gallumhelm, 1), "GGG", "G G", "   ", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 11));
        register.addRecipe(new ItemStack(ArmorHandler.gallumplate, 1), "G G", "GGG", "GGG", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 11));
        register.addRecipe(new ItemStack(ArmorHandler.gallumlegs, 1), "GGG", "G G", "G G", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 11));
        register.addRecipe(new ItemStack(ArmorHandler.gallumboots, 1), "   ", "G G", "G G", 'G', new ItemStack(ItemHandler.urotarkingot, 1, 11));
        // Vanadium
        register.addRecipe(new ItemStack(BlockHandler.vanadiumblock, 1), "VVV", "VVV", "VVV", 'V', new ItemStack(ItemHandler.urotark, 1, 12));
        register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4, 12), new Object[] { BlockHandler.vanadiumblock });
        register.addRecipe(new ItemStack(ToolHandler.vanadiumaxe, 1), "VV ", "Vs ", " s ", 'V', new ItemStack(ItemHandler.urotarkingot, 1, 12), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.vanadiumhoe, 1), "VV ", " s ", " s ", 'V', new ItemStack(ItemHandler.urotarkingot, 1, 12), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.vanadiumshovel, 1), " V ", " s ", " s ", 'V', new ItemStack(ItemHandler.urotarkingot, 1, 12), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.vanadiumsword, 1), "gVg", "gVg", " s ", 'V', new ItemStack(ItemHandler.urotarkingot, 1, 12), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.vanadiumpickaxe, 1), "VVV", " s ", " s ", 'V', new ItemStack(ItemHandler.urotarkingot, 1, 12), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.vanadiumhelm, 1), "VVV", "V V", "   ", 'V', new ItemStack(ItemHandler.urotarkingot, 1, 12));
        register.addRecipe(new ItemStack(ArmorHandler.vanadiumplate, 1), "V V", "VVV", "VVV", 'V', new ItemStack(ItemHandler.urotarkingot, 1, 12));
        register.addRecipe(new ItemStack(ArmorHandler.vanadiumlegs, 1), "VVV", "V V", "V V", 'V', new ItemStack(ItemHandler.urotarkingot, 1, 12));
        register.addRecipe(new ItemStack(ArmorHandler.vanadiumboots, 1), "   ", "V V", "V V", 'V', new ItemStack(ItemHandler.urotarkingot, 1, 12));
        // Scandium
        register.addRecipe(new ItemStack(BlockHandler.vanadiumblock, 1, 1), "SSS", "SSS", "SSS", 'S', new ItemStack(ItemHandler.urotark, 1, 13));
        register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4, 13), new Object[] { new ItemStack(BlockHandler.vanadiumblock, 1, 1) });
        register.addRecipe(new ItemStack(ToolHandler.scandiumaxe, 1), "SS ", "Ss ", " s ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 13), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.scandiumhoe, 1), "SS ", " s ", " s ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 13), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.scandiumshovel, 1), " S ", " s ", " s ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 13), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.scandiumsword, 1), "gSg", "gSg", " s ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 13), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.scandiumpickaxe, 1), "SSS", " s ", " s ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 13), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.scandiumhelm, 1), "SSS", "S S", "   ", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 13));
        register.addRecipe(new ItemStack(ArmorHandler.scandiumplate, 1), "S S", "SSS", "SSS", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 13));
        register.addRecipe(new ItemStack(ArmorHandler.scandiumlegs, 1), "SSS", "S S", "S S", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 13));
        register.addRecipe(new ItemStack(ArmorHandler.scandiumboots, 1), "   ", "S S", "S S", 'S', new ItemStack(ItemHandler.urotarkingot, 1, 13));
        // Bismuth
        register.addRecipe(new ItemStack(BlockHandler.bismuthblock, 1), "BBB", "BBB", "BBB", 'B', new ItemStack(ItemHandler.urotark, 1, 14));
        register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4, 14), new Object[] { BlockHandler.bismuthblock });
        register.addRecipe(new ItemStack(ToolHandler.bismuthaxe, 1), "BB ", "Bs ", " s ", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 14), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.bismuthhoe, 1), "BB ", " s ", " s ", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 14), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.bismuthshovel, 1), " B ", " s ", " s ", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 14), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.bismuthsword, 1), "gBg", "gBg", " s ", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 14), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.bismuthpickaxe, 1), "BBB", " s ", " s ", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 14), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.bismuthhelm, 1), "BBB", "B B", "   ", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 14));
        register.addRecipe(new ItemStack(ArmorHandler.bismuthplate, 1), "B B", "BBB", "BBB", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 14));
        register.addRecipe(new ItemStack(ArmorHandler.bismuthlegs, 1), "BBB", "B B", "B B", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 14));
        register.addRecipe(new ItemStack(ArmorHandler.bismuthboots, 1), "   ", "B B", "B B", 'B', new ItemStack(ItemHandler.urotarkingot, 1, 14));
        // Indium
        register.addRecipe(new ItemStack(BlockHandler.bismuthblock, 1, 1), "III", "III", "III", 'I', new ItemStack(ItemHandler.urotark, 1, 15));
        register.addShapelessRecipe(new ItemStack(ItemHandler.urotark, 4, 15), new Object[] { new ItemStack(BlockHandler.bismuthblock, 1, 1) });
        register.addRecipe(new ItemStack(ToolHandler.indiumaxe, 1), "II ", "Is ", " s ", 'I', new ItemStack(ItemHandler.urotarkingot, 1, 15), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.indiumhoe, 1), "II ", " s ", " s ", 'I', new ItemStack(ItemHandler.urotarkingot, 1, 15), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.indiumshovel, 1), " I ", " s ", " s ", 'I', new ItemStack(ItemHandler.urotarkingot, 1, 15), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.indiumsword, 1), "gIg", "gIg", " s ", 'I', new ItemStack(ItemHandler.urotarkingot, 1, 15), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.indiumpickaxe, 1), "III", " s ", " s ", 'I', new ItemStack(ItemHandler.urotarkingot, 1, 15), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.indiumhelm, 1), "III", "I I", "   ", 'I', new ItemStack(ItemHandler.urotarkingot, 1, 15));
        register.addRecipe(new ItemStack(ArmorHandler.indiumplate, 1), "I I", "III", "III", 'I', new ItemStack(ItemHandler.urotarkingot, 1, 15));
        register.addRecipe(new ItemStack(ArmorHandler.indiumlegs, 1), "III", "I I", "I I", 'I', new ItemStack(ItemHandler.urotarkingot, 1, 15));
        register.addRecipe(new ItemStack(ArmorHandler.indiumboots, 1), "   ", "I I", "I I", 'I', new ItemStack(ItemHandler.urotarkingot, 1, 15));
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
        register.addRecipe(new ItemStack(ItemHandler.platinum, 1, 1), "DDD", "DDD", "DDD", 'D', ItemHandler.darknessshard);
        register.addRecipe(new ItemStack(BlockHandler.darknessblock, 1), "DDD", "DDD", "DDD", 'D', new ItemStack(ItemHandler.platinum, 1, 1));
        register.addShapelessRecipe(new ItemStack(ItemHandler.platinum, 4, 1), new Object[] { BlockHandler.darknessblock });
        register.addRecipe(new ItemStack(ToolHandler.darknessaxe, 1), "DD ", "Ds ", " s ", 'D', new ItemStack(ItemHandler.platinumingot, 1, 1), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.darknesshoe, 1), "DD ", " s ", " s ", 'D', new ItemStack(ItemHandler.platinumingot, 1, 1), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.darknessshovel, 1), " D ", " s ", " s ", 'D', new ItemStack(ItemHandler.platinumingot, 1, 1), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.darknesssword, 1), "gDg", "gDg", " s ", 'D', new ItemStack(ItemHandler.platinumingot, 1, 1), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.darknesspickaxe, 1), "DDD", " s ", " s ", 'D', new ItemStack(ItemHandler.platinumingot, 1, 1), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.darknesshelm, 1), "DDD", "D D", "   ", 'D', new ItemStack(ItemHandler.platinumingot, 1, 1));
        register.addRecipe(new ItemStack(ArmorHandler.darknessplate, 1), "D D", "DDD", "DDD", 'D', new ItemStack(ItemHandler.platinumingot, 1, 1));
        register.addRecipe(new ItemStack(ArmorHandler.darknesslegs, 1), "DDD", "D D", "D D", 'D', new ItemStack(ItemHandler.platinumingot, 1, 1));
        register.addRecipe(new ItemStack(ArmorHandler.darknessboots, 1), "   ", "D D", "D D", 'D', new ItemStack(ItemHandler.platinumingot, 1, 1));
        // Light
        register.addRecipe(new ItemStack(ItemHandler.platinum, 1, 2), "LLL", "LLL", "LLL", 'L', ItemHandler.lightshard);
        register.addRecipe(new ItemStack(BlockHandler.darknessblock, 1, 1), "LLL", "LLL", "LLL", 'L', new ItemStack(ItemHandler.platinum, 1, 2));
        register.addShapelessRecipe(new ItemStack(ItemHandler.platinum, 4, 2), new Object[] { new ItemStack(BlockHandler.darknessblock, 1, 1) });
        register.addRecipe(new ItemStack(ToolHandler.lightaxe, 1), "LL ", "Ls ", " s ", 'L', new ItemStack(ItemHandler.platinumingot, 1, 2), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.lighthoe, 1), "LL ", " s ", " s ", 'L', new ItemStack(ItemHandler.platinumingot, 1, 2), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.lightshovel, 1), " L ", " s ", " s ", 'L', new ItemStack(ItemHandler.platinumingot, 1, 2), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.lightsword, 1), "gLg", "gLg", " s ", 'L', new ItemStack(ItemHandler.platinumingot, 1, 2), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.lightpickaxe, 1), "LLL", " s ", " s ", 'L', new ItemStack(ItemHandler.platinumingot, 1, 2), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.lighthelm, 1), "LLL", "L L", "   ", 'L', new ItemStack(ItemHandler.platinumingot, 1, 2));
        register.addRecipe(new ItemStack(ArmorHandler.lightplate, 1), "L L", "LLL", "LLL", 'L', new ItemStack(ItemHandler.platinumingot, 1, 2));
        register.addRecipe(new ItemStack(ArmorHandler.lightlegs, 1), "LLL", "L L", "L L", 'L', new ItemStack(ItemHandler.platinumingot, 1, 2));
        register.addRecipe(new ItemStack(ArmorHandler.lightboots, 1), "   ", "L L", "L L", 'L', new ItemStack(ItemHandler.platinumingot, 1, 2));
        // Omega
        register.addRecipe(new ItemStack(ItemHandler.platinum, 1, 3), "OOO", "OOO", "OOO", 'O', ItemHandler.omegashards);
        register.addRecipe(new ItemStack(BlockHandler.omegablock, 1), "OOO", "OOO", "OOO", 'O', new ItemStack(ItemHandler.platinum, 1, 3));
        register.addShapelessRecipe(new ItemStack(ItemHandler.platinum, 4, 3), new Object[] { BlockHandler.omegablock });
        register.addRecipe(new ItemStack(ToolHandler.omegaaxe, 1), "OO ", "Os ", " s ", 'O', new ItemStack(ItemHandler.platinumingot, 1, 3), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.omegahoe, 1), "OO ", " s ", " s ", 'O', new ItemStack(ItemHandler.platinumingot, 1, 3), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.omegashovel, 1), " O ", " s ", " s ", 'O', new ItemStack(ItemHandler.platinumingot, 1, 3), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.omegasword, 1), "gOg", "gOg", " s ", 'O', new ItemStack(ItemHandler.platinumingot, 1, 3), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.omegapickaxe, 1), "OOO", " s ", " s ", 'O', new ItemStack(ItemHandler.platinumingot, 1, 3), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.omegahelm, 1), "OOO", "O O", "   ", 'O', new ItemStack(ItemHandler.platinumingot, 1, 3));
        register.addRecipe(new ItemStack(ArmorHandler.omegaplate, 1), "O O", "OOO", "OOO", 'O', new ItemStack(ItemHandler.platinumingot, 1, 3));
        register.addRecipe(new ItemStack(ArmorHandler.omegalegs, 1), "OOO", "O O", "O O", 'O', new ItemStack(ItemHandler.platinumingot, 1, 3));
        register.addRecipe(new ItemStack(ArmorHandler.omegaboots, 1), "   ", "O O", "O O", 'O', new ItemStack(ItemHandler.platinumingot, 1, 3));
        // Bubble
        register.addRecipe(new ItemStack(BlockHandler.bubbleblock, 1), "BBB", "BBB", "BBB", 'B', new ItemStack(ItemHandler.platinumingot, 1, 5));
        register.addRecipe(new ItemStack(ToolHandler.bubblesword, 1), "gBg", "gBg", " s ", 'B', new ItemStack(ItemHandler.platinumingot, 1, 5), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ItemHandler.platinumingot, 1, 5), "bbb", "bbb", "bbb", 'b', new ItemStack(ItemHandler.platinum, 1, 5));
        register.addShapedRecipe(new ItemStack(ItemHandler.platinum, 1, 5), "dd ", "dd ", "   ", 'd', Item.diamond);
        register.addShapedRecipe(new ItemStack(ItemHandler.platinum, 1, 5), " dd", " dd", "   ", 'd', Item.diamond);
        register.addShapedRecipe(new ItemStack(ItemHandler.platinum, 1, 5), "   ", "dd ", "dd ", 'd', Item.diamond);
        register.addShapedRecipe(new ItemStack(ItemHandler.platinum, 1, 5), "   ", " dd", " dd", 'd', Item.diamond);
        // Berionvar
        register.addRecipe(new ItemStack(BlockHandler.berionvarblock, 1), "BBB", "BBB", "BBB", 'B', new ItemStack(ItemHandler.platinum, 1, 6));
        register.addShapelessRecipe(new ItemStack(ItemHandler.platinum, 4, 6), new Object[] { BlockHandler.berionvarblock });
        register.addRecipe(new ItemStack(ToolHandler.berionvaraxe, 1), "BB ", "Bs ", " s ", 'B', new ItemStack(ItemHandler.platinumingot, 1, 6), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.berionvarhoe, 1), "BB ", " s ", " s ", 'B', new ItemStack(ItemHandler.platinumingot, 1, 6), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.berionvarshovel, 1), " B ", " s ", " s ", 'B', new ItemStack(ItemHandler.platinumingot, 1, 6), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.berionvarsword, 1), "gBg", "gBg", " s ", 'B', new ItemStack(ItemHandler.platinumingot, 1, 6), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.berionvarpickaxe, 1), "BBB", " s ", " s ", 'B', new ItemStack(ItemHandler.platinumingot, 1, 6), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.berionvarhelm, 1), "BBB", "B B", "   ", 'B', new ItemStack(ItemHandler.platinumingot, 1, 6));
        register.addRecipe(new ItemStack(ArmorHandler.berionvarplate, 1), "B B", "BBB", "BBB", 'B', new ItemStack(ItemHandler.platinumingot, 1, 6));
        register.addRecipe(new ItemStack(ArmorHandler.berionvarlegs, 1), "BBB", "B B", "B B", 'B', new ItemStack(ItemHandler.platinumingot, 1, 6));
        register.addRecipe(new ItemStack(ArmorHandler.berionvarboots, 1), "   ", "B B", "B B", 'B', new ItemStack(ItemHandler.platinumingot, 1, 6));
        // Charviole
        register.addRecipe(new ItemStack(BlockHandler.berionvarblock, 1, 1), "CCC", "CCC", "CCC", 'C', new ItemStack(ItemHandler.platinum, 1, 7));
        register.addShapelessRecipe(new ItemStack(ItemHandler.platinum, 4, 7), new Object[] { new ItemStack(BlockHandler.berionvarblock, 1, 1) });
        register.addRecipe(new ItemStack(ToolHandler.charvioleaxe, 1), "CC ", "Cs ", " s ", 'C', new ItemStack(ItemHandler.platinumingot, 1, 7), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.charviolehoe, 1), "CC ", " s ", " s ", 'C', new ItemStack(ItemHandler.platinumingot, 1, 7), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.charvioleshovel, 1), " C ", " s ", " s ", 'C', new ItemStack(ItemHandler.platinumingot, 1, 7), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.charviolesword, 1), "gCg", "gCg", " s ", 'C', new ItemStack(ItemHandler.platinumingot, 1, 7), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.charviolepickaxe, 1), "CCC", " s ", " s ", 'C', new ItemStack(ItemHandler.platinumingot, 1, 7), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.charviolehelm, 1), "CCC", "C C", "   ", 'C', new ItemStack(ItemHandler.platinumingot, 1, 7));
        register.addRecipe(new ItemStack(ArmorHandler.charvioleplate, 1), "C C", "CCC", "CCC", 'C', new ItemStack(ItemHandler.platinumingot, 1, 7));
        register.addRecipe(new ItemStack(ArmorHandler.charviolelegs, 1), "CCC", "C C", "C C", 'C', new ItemStack(ItemHandler.platinumingot, 1, 7));
        register.addRecipe(new ItemStack(ArmorHandler.charvioleboots, 1), "   ", "C C", "C C", 'C', new ItemStack(ItemHandler.platinumingot, 1, 7));
        // Firlvear
        register.addRecipe(new ItemStack(BlockHandler.firlvearblock, 1), "FFF", "FFF", "FFF", 'F', new ItemStack(ItemHandler.platinum, 1, 8));
        register.addShapelessRecipe(new ItemStack(ItemHandler.platinum, 4, 8), new Object[] { BlockHandler.firlvearblock });
        register.addRecipe(new ItemStack(ToolHandler.firlvearaxe, 1), "FF ", "Fs ", " s ", 'F', new ItemStack(ItemHandler.platinumingot, 1, 8), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.firlvearhoe, 1), "FF ", " s ", " s ", 'F', new ItemStack(ItemHandler.platinumingot, 1, 8), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.firlvearshovel, 1), " F ", " s ", " s ", 'F', new ItemStack(ItemHandler.platinumingot, 1, 8), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.firlvearsword, 1), "gFg", "gFg", " s ", 'F', new ItemStack(ItemHandler.platinumingot, 1, 8), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.firlvearpickaxe, 1), "FFF", " s ", " s ", 'F', new ItemStack(ItemHandler.platinumingot, 1, 8), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.firlvearhelm, 1), "FFF", "F F", "   ", 'F', new ItemStack(ItemHandler.platinumingot, 1, 8));
        register.addRecipe(new ItemStack(ArmorHandler.firlvearplate, 1), "F F", "FFF", "FFF", 'F', new ItemStack(ItemHandler.platinumingot, 1, 8));
        register.addRecipe(new ItemStack(ArmorHandler.firlvearlegs, 1), "FFF", "F F", "F F", 'F', new ItemStack(ItemHandler.platinumingot, 1, 8));
        register.addRecipe(new ItemStack(ArmorHandler.firlvearboots, 1), "   ", "F F", "F F", 'F', new ItemStack(ItemHandler.platinumingot, 1, 8));
        // Selmenrer
        register.addRecipe(new ItemStack(BlockHandler.firlvearblock, 1, 1), "SSS", "SSS", "SSS", 'S', new ItemStack(ItemHandler.platinum, 1, 9));
        register.addShapelessRecipe(new ItemStack(ItemHandler.platinum, 4, 9), new Object[] { new ItemStack(BlockHandler.firlvearblock, 1, 1) });
        register.addRecipe(new ItemStack(ToolHandler.selmenreraxe, 1), "SS ", "Ss ", " s ", 'S', new ItemStack(ItemHandler.platinumingot, 1, 9), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.selmenrerhoe, 1), "SS ", " s ", " s ", 'S', new ItemStack(ItemHandler.platinumingot, 1, 9), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.selmenrershovel, 1), " S ", " s ", " s ", 'S', new ItemStack(ItemHandler.platinumingot, 1, 9), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.selmenrersword, 1), "gSg", "gSg", " s ", 'S', new ItemStack(ItemHandler.platinumingot, 1, 9), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.selmenrerpickaxe, 1), "SSS", " s ", " s ", 'S', new ItemStack(ItemHandler.platinumingot, 1, 9), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.selmenrerhelm, 1), "SSS", "S S", "   ", 'S', new ItemStack(ItemHandler.platinumingot, 1, 9));
        register.addRecipe(new ItemStack(ArmorHandler.selmenrerplate, 1), "S S", "SSS", "SSS", 'S', new ItemStack(ItemHandler.platinumingot, 1, 9));
        register.addRecipe(new ItemStack(ArmorHandler.selmenrerlegs, 1), "SSS", "S S", "S S", 'S', new ItemStack(ItemHandler.platinumingot, 1, 9));
        register.addRecipe(new ItemStack(ArmorHandler.selmenrerboots, 1), "   ", "S S", "S S", 'S', new ItemStack(ItemHandler.platinumingot, 1, 9));
        // Verilion
        register.addRecipe(new ItemStack(BlockHandler.verilionblock, 1), "VVV", "VVV", "VVV", 'V', new ItemStack(ItemHandler.platinum, 1, 10));
        register.addShapelessRecipe(new ItemStack(ItemHandler.platinum, 4, 10), new Object[] { BlockHandler.verilionblock });
        register.addRecipe(new ItemStack(ToolHandler.verilionaxe, 1), "VV ", "Vs ", " s ", 'V', new ItemStack(ItemHandler.platinumingot, 1, 10), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.verilionhoe, 1), "VV ", " s ", " s ", 'V', new ItemStack(ItemHandler.platinumingot, 1, 10), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.verilionshovel, 1), " V ", " s ", " s ", 'V', new ItemStack(ItemHandler.platinumingot, 1, 10), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.verilionsword, 1), "gVg", "gVg", " s ", 'V', new ItemStack(ItemHandler.platinumingot, 1, 10), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.verilionpickaxe, 1), "VVV", " s ", " s ", 'V', new ItemStack(ItemHandler.platinumingot, 1, 10), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.verilionhelm, 1), "VVV", "V V", "   ", 'V', new ItemStack(ItemHandler.platinumingot, 1, 10));
        register.addRecipe(new ItemStack(ArmorHandler.verilionplate, 1), "V V", "VVV", "VVV", 'V', new ItemStack(ItemHandler.platinumingot, 1, 10));
        register.addRecipe(new ItemStack(ArmorHandler.verilionlegs, 1), "VVV", "V V", "V V", 'V', new ItemStack(ItemHandler.platinumingot, 1, 10));
        register.addRecipe(new ItemStack(ArmorHandler.verilionboots, 1), "   ", "V V", "V V", 'V', new ItemStack(ItemHandler.platinumingot, 1, 10));
        // Vielvor
        register.addRecipe(new ItemStack(BlockHandler.verilionblock, 1, 1), "vvv", "vvv", "vvv", 'v', new ItemStack(ItemHandler.platinum, 1, 11));
        register.addShapelessRecipe(new ItemStack(ItemHandler.platinum, 4, 11), new Object[] { new ItemStack(BlockHandler.verilionblock, 1, 1) });
        register.addRecipe(new ItemStack(ToolHandler.vielvoraxe, 1), "vv ", "vs ", " s ", 'v', new ItemStack(ItemHandler.platinumingot, 1, 11), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.vielvorhoe, 1), "vv ", " s ", " s ", 'v', new ItemStack(ItemHandler.platinumingot, 1, 11), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.vielvorshovel, 1), " v ", " s ", " s ", 'v', new ItemStack(ItemHandler.platinumingot, 1, 11), 's', Item.stick);
        register.addRecipe(new ItemStack(ToolHandler.vielvorsword, 1), "gvg", "gvg", " s ", 'v', new ItemStack(ItemHandler.platinumingot, 1, 11), 's', Item.stick, 'g', Item.ingotGold);
        register.addRecipe(new ItemStack(ToolHandler.vielvorpickaxe, 1), "vvv", " s ", " s ", 'v', new ItemStack(ItemHandler.platinumingot, 1, 11), 's', Item.stick);
        register.addRecipe(new ItemStack(ArmorHandler.vielvorhelm, 1), "vvv", "v v", "   ", 'v', new ItemStack(ItemHandler.platinumingot, 1, 11));
        register.addRecipe(new ItemStack(ArmorHandler.vielvorplate, 1), "v v", "vvv", "vvv", 'v', new ItemStack(ItemHandler.platinumingot, 1, 11));
        register.addRecipe(new ItemStack(ArmorHandler.vielvorlegs, 1), "vvv", "v v", "v v", 'v', new ItemStack(ItemHandler.platinumingot, 1, 11));
        register.addRecipe(new ItemStack(ArmorHandler.vielvorboots, 1), "   ", "v v", "v v", 'v', new ItemStack(ItemHandler.platinumingot, 1, 11));
        // seeds
        register.addRecipe(new ItemStack(ItemHandler.platinum, 1, 1), "ddd", "ddd", "ddd", 'd', CropHandler.darknessseeds);
        register.addRecipe(new ItemStack(ItemHandler.platinum, 1, 2), "lll", "lll", "lll", 'l', CropHandler.lightseeds);
        // new stuff
        register.addRecipe(new ItemStack(TileEntityHandler.darknesssolid, 1), "sss", "sss", "sss", 's', ItemHandler.soliddarkness);
        register.addRecipe(new ItemStack(TileEntityHandler.computer, 1), "uds", "olo", "DhD", 'u', ItemHandler.urotarkingot, 'd', new ItemStack(ItemHandler.platinumingot, 1, 1), 's', new ItemStack(ItemHandler.urotarkingot, 1, 7), 'l', LiquidHandler.lightbucket, 'o', new ItemStack(ItemHandler.platinumingot, 1, 3), 'D', new ItemStack(ItemHandler.platinumingot, 1, 4), 'h', ToolHandler.omegahand);
        register.addRecipe(new ItemStack(LiquidHandler.darknessbucket, 1), " l ", " d ", " b ", 'l', Item.bucketLava, 'd', new ItemStack(BlockHandler.darknessblock, 1), 'b', Item.bucketEmpty);
        register.addRecipe(new ItemStack(LiquidHandler.lightbucket, 1), " l ", " L ", " b ", 'l', Item.bucketLava, 'L', new ItemStack(BlockHandler.darknessblock, 1, 1), 'b', Item.bucketEmpty);
    }

    public static void addSmelting(GameRegistry register) {
        // urotark
        register.addSmelting(BlockHandler.urotarkore.blockID, new ItemStack(ItemHandler.urotark, 1), 6.0F);
        register.addSmelting(BlockHandler.urotarkblock.blockID, new ItemStack(ItemHandler.urotarkingot, 1), 6.0F);
        // pearl
        FurnaceRecipes.smelting().addSmelting(BlockHandler.urotarkore.blockID, 1, new ItemStack(ItemHandler.urotark, 1, 1), 7.0F);
        FurnaceRecipes.smelting().addSmelting(BlockHandler.urotarkblock.blockID, 1, new ItemStack(ItemHandler.urotarkingot, 1, 1), 7.0F);
        // sapphire
        FurnaceRecipes.smelting().addSmelting(BlockHandler.urotarkore.blockID, 2, new ItemStack(ItemHandler.urotark, 1, 2), 8.0F);
        FurnaceRecipes.smelting().addSmelting(BlockHandler.urotarkblock.blockID, 2, new ItemStack(ItemHandler.urotarkingot, 1, 2), 8.0F);
        // muscovite
        register.addSmelting(BlockHandler.muscoviteore.blockID, new ItemStack(ItemHandler.urotark, 1, 3), 9.0F);
        register.addSmelting(BlockHandler.muscoviteblock.blockID, new ItemStack(ItemHandler.urotarkingot, 1, 3), 9.0F);
        // ruby
        FurnaceRecipes.smelting().addSmelting(BlockHandler.muscoviteore.blockID, 1, new ItemStack(ItemHandler.urotark, 1, 4), 10.0F);
        FurnaceRecipes.smelting().addSmelting(BlockHandler.muscoviteblock.blockID, 1, new ItemStack(ItemHandler.urotarkingot, 1, 4), 10.0F);
        // uriotyke
        FurnaceRecipes.smelting().addSmelting(BlockHandler.muscoviteore.blockID, 2, new ItemStack(ItemHandler.urotark, 1, 5), 11.0F);
        FurnaceRecipes.smelting().addSmelting(BlockHandler.muscoviteblock.blockID, 2, new ItemStack(ItemHandler.urotarkingot, 1, 5), 11.0F);
        // gilder
        register.addSmelting(BlockHandler.gilderore.blockID, new ItemStack(ItemHandler.urotark, 1, 6), 12.0F);
        register.addSmelting(BlockHandler.gilderblock.blockID, new ItemStack(ItemHandler.urotarkingot, 1, 6), 12.0F);
        // selovar
        FurnaceRecipes.smelting().addSmelting(BlockHandler.gilderore.blockID, 1, new ItemStack(ItemHandler.urotark, 1, 7), 13.0F);
        FurnaceRecipes.smelting().addSmelting(BlockHandler.gilderblock.blockID, 1, new ItemStack(ItemHandler.urotarkingot, 1, 7), 13.0F);
        // parfilian
        FurnaceRecipes.smelting().addSmelting(BlockHandler.gilderore.blockID, 2, new ItemStack(ItemHandler.urotark, 1, 8), 14.0F);
        FurnaceRecipes.smelting().addSmelting(BlockHandler.gilderblock.blockID, 2, new ItemStack(ItemHandler.urotarkingot, 1, 8), 14.0F);
        // barium
        register.addSmelting(BlockHandler.bariumore.blockID, new ItemStack(ItemHandler.urotark, 1, 9), 15.0F);
        register.addSmelting(BlockHandler.bariumblock.blockID, new ItemStack(ItemHandler.urotarkingot, 1, 9), 15.0F);
        // radium
        FurnaceRecipes.smelting().addSmelting(BlockHandler.bariumore.blockID, 1, new ItemStack(ItemHandler.urotark, 1, 10), 16.0F);
        FurnaceRecipes.smelting().addSmelting(BlockHandler.bariumblock.blockID, 2, new ItemStack(ItemHandler.urotarkingot, 1, 10), 16.0F);
        // gallum
        FurnaceRecipes.smelting().addSmelting(BlockHandler.bariumore.blockID, 2, new ItemStack(ItemHandler.urotark, 1, 11), 17.0F);
        FurnaceRecipes.smelting().addSmelting(BlockHandler.bariumblock.blockID, 2, new ItemStack(ItemHandler.urotarkingot, 1, 11), 17.0F);
        // vanadium
        register.addSmelting(BlockHandler.vanadiumore.blockID, new ItemStack(ItemHandler.urotark, 1, 12), 18.0F);
        register.addSmelting(BlockHandler.vanadiumblock.blockID, new ItemStack(ItemHandler.urotarkingot, 1, 12), 18.0F);
        // scandium
        FurnaceRecipes.smelting().addSmelting(BlockHandler.vanadiumore.blockID, 1, new ItemStack(ItemHandler.urotark, 1, 13), 19.0F);
        FurnaceRecipes.smelting().addSmelting(BlockHandler.vanadiumblock.blockID, 1, new ItemStack(ItemHandler.urotarkingot, 1, 13), 19.0F);
        // bismuth
        register.addSmelting(BlockHandler.bismuthore.blockID, new ItemStack(ItemHandler.urotark, 1, 14), 20.0F);
        register.addSmelting(BlockHandler.bismuthblock.blockID, new ItemStack(ItemHandler.urotarkingot, 1, 14), 20.0F);
        // indium
        FurnaceRecipes.smelting().addSmelting(BlockHandler.bismuthore.blockID, 1, new ItemStack(ItemHandler.urotark, 1, 15), 21.0F);
        FurnaceRecipes.smelting().addSmelting(BlockHandler.bismuthblock.blockID, 1, new ItemStack(ItemHandler.urotarkingot, 1, 15), 21.0F);
        // platinum
        register.addSmelting(BlockHandler.platinumore.blockID, new ItemStack(ItemHandler.platinum, 1), 22.0F);
        register.addSmelting(BlockHandler.platinumblock.blockID, new ItemStack(ItemHandler.platinumingot, 1), 22.0F);
        // darkness
        register.addSmelting(BlockHandler.darknessore.blockID, new ItemStack(ItemHandler.darknessshard, 1), 25.0F);
        register.addSmelting(BlockHandler.darknessblock.blockID, new ItemStack(ItemHandler.platinumingot, 1, 1), 25.0F);
        // light
        FurnaceRecipes.smelting().addSmelting(BlockHandler.darknessore.blockID, 1, new ItemStack(ItemHandler.lightshard, 1), 25.0F);
        FurnaceRecipes.smelting().addSmelting(BlockHandler.darknessblock.blockID, 1, new ItemStack(ItemHandler.platinumingot, 1, 2), 25.0F);
        // omega
        register.addSmelting(BlockHandler.omegaore.blockID, new ItemStack(ItemHandler.omegashards, 1), 30.0F);
        register.addSmelting(BlockHandler.omegablock.blockID, new ItemStack(ItemHandler.platinumingot, 1, 3), 30.0F);
        // Berionvar
        register.addSmelting(BlockHandler.berionvarore.blockID, new ItemStack(ItemHandler.platinum, 1, 6), 23.0F);
        register.addSmelting(BlockHandler.berionvarblock.blockID, new ItemStack(ItemHandler.platinumingot, 1, 6), 23.0F);
        // Charviole
        FurnaceRecipes.smelting().addSmelting(BlockHandler.berionvarore.blockID, 1, new ItemStack(ItemHandler.platinum, 1, 7), 24.0F);
        FurnaceRecipes.smelting().addSmelting(BlockHandler.berionvarblock.blockID, 1, new ItemStack(ItemHandler.platinumingot, 1, 7), 24.0F);
        // Firlvear
        register.addSmelting(BlockHandler.firlvearore.blockID, new ItemStack(ItemHandler.platinum, 1, 8), 25.0F);
        register.addSmelting(BlockHandler.firlvearblock.blockID, new ItemStack(ItemHandler.platinumingot, 1, 8), 25.0F);
        // Selmenrer
        FurnaceRecipes.smelting().addSmelting(BlockHandler.firlvearore.blockID, new ItemStack(ItemHandler.platinum, 1, 9), 26.0F);
        FurnaceRecipes.smelting().addSmelting(BlockHandler.firlvearblock.blockID, 1, new ItemStack(ItemHandler.platinumingot, 1, 9), 26.0F);
        // Verilion
        register.addSmelting(BlockHandler.verilionore.blockID, new ItemStack(ItemHandler.platinum, 1, 10), 27.0F);
        register.addSmelting(BlockHandler.verilionblock.blockID, new ItemStack(ItemHandler.platinumingot, 1, 10), 27.0F);
        // Vielvor
        FurnaceRecipes.smelting().addSmelting(BlockHandler.verilionore.blockID, 1, new ItemStack(ItemHandler.platinum, 1, 11), 28.0F);
        FurnaceRecipes.smelting().addSmelting(BlockHandler.verilionblock.blockID, 1, new ItemStack(ItemHandler.platinumingot, 1, 11), 28.0F);

    }

}
