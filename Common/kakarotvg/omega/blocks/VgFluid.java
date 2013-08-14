package kakarotvg.omega.blocks;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class VgFluid extends Fluid {

    public VgFluid(String fluidName) {
        super(fluidName);

        setDensity(10);
        setViscosity(1000);
        FluidRegistry.registerFluid(this);
    }

}
