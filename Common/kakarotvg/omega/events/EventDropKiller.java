package kakarotvg.omega.events;

import kakarotvg.omega.entity.mobs.EntityOmegakiller;
import kakarotvg.omega.handlers.item.ItemHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class EventDropKiller {

    @ForgeSubscribe
    public void onEntityDrop(LivingDropsEvent event) {
        if (event.entity instanceof EntityOmegakiller) {
            event.entity.entityDropItem(new ItemStack(ItemHandler.urotark, 1, 2), 0.0F);
        }
    }
}
