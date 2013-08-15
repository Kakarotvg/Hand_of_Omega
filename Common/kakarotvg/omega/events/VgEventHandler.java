package kakarotvg.omega.events;

import kakarotvg.omega.items.VgBucket;
import net.minecraftforge.common.MinecraftForge;

public class VgEventHandler {

    public static void Events() {
        MinecraftForge.EVENT_BUS.register(new DarknessBucketEvent());
        MinecraftForge.EVENT_BUS.register(new LightBucketEvent());
    }

}
