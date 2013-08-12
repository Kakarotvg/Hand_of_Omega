package kakarotvg.omega.blocks;

import kakarotvg.omega.CreativetabHandler;
import kakarotvg.omega.Reference;
import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class DarknessStill extends BlockStationary {

    private String name;

    public DarknessStill(int id, String name) {
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
        this.theIcon = new Icon[] { iconReg.registerIcon(Reference.MOD_ID + ":" + this.name), iconReg.registerIcon(Reference.MOD_ID + ":" + (this.name.substring(0, this.name.length() - 5) + "flow")) };
    }
}
