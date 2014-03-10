package kakarotvg.omega.handlers.events;

import kakarotvg.omega.events.DarknessBucketEvent;
import kakarotvg.omega.events.EventDropAnnihilator;
import kakarotvg.omega.events.EventDropEliminator;
import kakarotvg.omega.events.EventDropJungleAssasin;
import kakarotvg.omega.events.EventDropKiller;
import kakarotvg.omega.events.EventDropSlayer;
import kakarotvg.omega.events.LightBucketEvent;
import net.minecraftforge.common.MinecraftForge;

public class VgEventHandler {
    
    public static void Events() {
        MinecraftForge.EVENT_BUS.register(new DarknessBucketEvent());
        MinecraftForge.EVENT_BUS.register(new LightBucketEvent());
        MinecraftForge.EVENT_BUS.register(new EventDropAnnihilator());
        MinecraftForge.EVENT_BUS.register(new EventDropKiller());
        MinecraftForge.EVENT_BUS.register(new EventDropSlayer());
        MinecraftForge.EVENT_BUS.register(new EventDropEliminator());
        MinecraftForge.EVENT_BUS.register(new EventDropJungleAssasin());
    }
    
}
