package kakarotvg.omega.handlers.events;

import kakarotvg.omega.events.DarknessBucketEvent;
import kakarotvg.omega.events.LightBucketEvent;
import kakarotvg.omega.events.SoundEvents;
import net.minecraftforge.common.MinecraftForge;

public class VgEventHandler {

    public static void Events() {
        MinecraftForge.EVENT_BUS.register(new DarknessBucketEvent());
        MinecraftForge.EVENT_BUS.register(new LightBucketEvent());
    }

    public static void registerSound() {
        MinecraftForge.EVENT_BUS.register(new SoundEvents());
    }

}
