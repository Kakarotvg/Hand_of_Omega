package kakarotvg.omega.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class DarknessFluid extends Fluid {

    public DarknessFluid(String fluidName) {
        super(fluidName);

        setDensity(3);
        setViscosity(600);
        setLuminosity(5);
        FluidRegistry.registerFluid(this);
    }

}
