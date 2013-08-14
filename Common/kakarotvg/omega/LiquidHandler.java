package kakarotvg.omega;

import kakarotvg.omega.blocks.BlockDarkness;
import kakarotvg.omega.blocks.VgFluid;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LiquidHandler {

    public static Fluid Darkness;

    public static Block Darknessliquid;

    public static void configurefluids(Configuration config) {
        Darkness = new VgFluid("Darkness");
        Darknessliquid = new BlockDarkness(config.get("Liquid IDs", "Darkness Liquid", 2650).getInt()).setUnlocalizedName("Darkness").setCreativeTab(CreativetabHandler.vgtab);
    }

    public static void registerfluids(GameRegistry registry) {
        registry.registerBlock(Darknessliquid, "darknessliquid");
    }

    public static void addNames(LanguageRegistry registry) {
        registry.addName(Darknessliquid, "Darkness Liquid");
    }

}
