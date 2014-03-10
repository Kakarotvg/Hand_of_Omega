package kakarotvg.omega.events;

import kakarotvg.omega.entity.mobs.EntityAnnihilator;
import kakarotvg.omega.handlers.item.ItemHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventDropAnnihilator {

    @SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event) {
        if (event.entity instanceof EntityAnnihilator) {
            event.entity.entityDropItem(new ItemStack(ItemHandler.urotark, 1, 10), 0.0F);
        }
    }
}
