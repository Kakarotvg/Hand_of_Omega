package kakarotvg.omega.blocks;

import kakarotvg.omega.CreativetabHandler;
import kakarotvg.omega.Reference;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraftforge.fluids.FluidRegistry;

public class DarknessFlow extends BlockFlowing {

    private String name;

    public DarknessFlow(int id, String name) {
        super(id, Material.water);
        blockHardness = 100F;
        this.setLightOpacity(5);
        this.setCreativeTab(CreativetabHandler.vgtab);
        this.name = name;
        this.setUnlocalizedName(this.name);
        this.setTickRandomly(true);
    }

    @Override
    public void registerIcons(IconRegister iconReg) {
        this.theIcon = new Icon[] { iconReg.registerIcon(Reference.MOD_ID + ":" + (this.name.substring(0, this.name.length() - 4) + "still")), iconReg.registerIcon(Reference.MOD_ID + ":" + this.name) };
    }

}
