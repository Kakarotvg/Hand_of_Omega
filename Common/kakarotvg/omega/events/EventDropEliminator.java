package kakarotvg.omega.events;

import kakarotvg.omega.entity.mobs.EntityEliminator;
import kakarotvg.omega.handlers.item.ItemHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventDropEliminator {

    @SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event) {
        if (event.entity instanceof EntityEliminator) {
            event.entity.entityDropItem(new ItemStack(ItemHandler.urotark, 1, 9), 0.0F);
        }
    }
}
