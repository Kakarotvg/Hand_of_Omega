package kakarotvg.omega.handlers;

import kakarotvg.omega.events.DarknessBucketEvent;
import kakarotvg.omega.events.LightBucketEvent;
import kakarotvg.omega.items.VgBucket;
import net.minecraftforge.common.MinecraftForge;

public class VgEventHandler {

    public static void Events() {
        MinecraftForge.EVENT_BUS.register(new DarknessBucketEvent());
        MinecraftForge.EVENT_BUS.register(new LightBucketEvent());
    }

}
