package kakarotvg.omega.events;

import kakarotvg.omega.entity.mobs.EntityAnnihilator;
import kakarotvg.omega.handlers.item.ItemHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class EventDropAnnihilator {

    @ForgeSubscribe
    public void onEntityDrop(LivingDropsEvent event) {
        if (event.entity instanceof EntityAnnihilator) {
            event.entity.entityDropItem(new ItemStack(ItemHandler.urotark, 1, 10), 0.0F);
        }
    }
}
