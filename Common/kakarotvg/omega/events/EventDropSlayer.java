package kakarotvg.omega.events;

import kakarotvg.omega.entity.mobs.EntitySlayer;
import kakarotvg.omega.handlers.item.ItemHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class EventDropSlayer {

    @ForgeSubscribe
    public void onEntityDrop(LivingDropsEvent event) {
        if (event.entity instanceof EntitySlayer) {
            event.entity.entityDropItem(new ItemStack(ItemHandler.urotark, 1, 6), 0.0F);
        }
    }
}
