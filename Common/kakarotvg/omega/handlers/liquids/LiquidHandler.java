package kakarotvg.omega.handlers.liquids;

import kakarotvg.omega.fluids.BlockDarkness;
import kakarotvg.omega.fluids.BlockLight;
import kakarotvg.omega.fluids.DarknessFluid;
import kakarotvg.omega.fluids.LightFluid;
import kakarotvg.omega.handlers.creativetab.CreativetabHandler;
import kakarotvg.omega.items.VgBucket;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LiquidHandler {
    
    // fluids
    public static Fluid Darkness;
    public static Fluid Light;
    
    // Liquids
    public static Block Darknessliquid;
    public static Block LightLiquid;
    
    // Buckets
    public static Item darknessbucket;
    public static Item lightbucket;
    
    public static void configurefluids() {
        
        // Darkness
        Darkness = new DarknessFluid("Darkness");
        Darknessliquid = new BlockDarkness().setBlockName("darkness");
        // Light
        Light = new LightFluid("Light");
        LightLiquid = new BlockLight().setBlockName("light");
        // buckets
        darknessbucket = new VgBucket(Darknessliquid, "darknessbucket").setCreativeTab(CreativetabHandler.vgtab2).setContainerItem(Items.bucket);
        lightbucket = new VgBucket(LightLiquid, "lightbucket").setCreativeTab(CreativetabHandler.vgtab2).setContainerItem(Items.bucket);
    }
    
    public static void registerfluids(GameRegistry registry) {
        // buckets
        registry.registerItem(darknessbucket, "darknessbucket");
        registry.registerItem(lightbucket, "lightbucket");
    }
    
    public static void addNames(LanguageRegistry registry) {
        registry.addName(Darknessliquid, "Darkness Liquid");
        registry.addName(LightLiquid, "Light Liquid");
        // buckets
        registry.addName(darknessbucket, "Darkness bucket");
        registry.addName(lightbucket, "Light Bucket");
    }
    
    public static void fluidContainerRegistry() {
        FluidContainerRegistry.registerFluidContainer(LiquidHandler.Darkness, new ItemStack(LiquidHandler.darknessbucket, 1, 1), new ItemStack(Items.bucket));
        FluidContainerRegistry.registerFluidContainer(LiquidHandler.Light, new ItemStack(LiquidHandler.lightbucket, 1, 1), new ItemStack(Items.bucket));
    }
    
}
