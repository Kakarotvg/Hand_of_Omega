package kakarotvg.omega.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class LightFluid extends Fluid {

    public LightFluid(String fluidName) {
        super(fluidName);

        setDensity(3);
        setViscosity(600);
        setLuminosity(5);
        FluidRegistry.registerFluid(this);
    }

}
