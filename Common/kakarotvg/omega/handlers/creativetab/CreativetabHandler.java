package kakarotvg.omega.handlers.creativetab;

import kakarotvg.omega.handlers.armor.ArmorHandler;
import kakarotvg.omega.handlers.blocks.BlockHandler;
import kakarotvg.omega.handlers.item.ItemHandler;
import kakarotvg.omega.handlers.tools.ToolHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CreativetabHandler {

    public static CreativeTabs vgtab = new CreativeTabs("vgtab") {
        public ItemStack getIconItemStack() {
            return new ItemStack(BlockHandler.urotarkblock, 1, 0);
        }
    };

    public static CreativeTabs vgtab2 = new CreativeTabs("vgtab2") {
        public ItemStack getIconItemStack() {
            return new ItemStack(ItemHandler.selovaringot, 1, 0);
        }
    };

    public static CreativeTabs vgtab3 = new CreativeTabs("vgtab3") {
        public ItemStack getIconItemStack() {
            return new ItemStack(ToolHandler.muscovitepickaxe, 1, 0);
        }
    };

    public static CreativeTabs vgtab4 = new CreativeTabs("vgtab4") {

        public ItemStack getIconItemStack() {
            return new ItemStack(ArmorHandler.gallumplate, 1, 0);
        }

    };

    public static void setNames(LanguageRegistry registry) {
        registry.instance().addStringLocalization("itemGroup.vgtab", "en_US", "Omega Blocks");
        registry.instance().addStringLocalization("itemGroup.vgtab2", "en_US", "Omega Items");
        registry.instance().addStringLocalization("itemGroup.vgtab3", "en_US", "Omega Tools");
        registry.instance().addStringLocalization("itemGroup.vgtab4", "en_US", "Omega Combat");

    }

}
