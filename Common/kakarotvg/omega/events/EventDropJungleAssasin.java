package kakarotvg.omega.events;

import kakarotvg.omega.entity.mobs.EntityJungleAssasin;
import kakarotvg.omega.handlers.item.ItemHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class EventDropJungleAssasin {

    @ForgeSubscribe
    public void onEntityDrop(LivingDropsEvent event) {
        if (event.entity instanceof EntityJungleAssasin) {
            event.entity.entityDropItem(new ItemStack(ItemHandler.platinum, 1, 7), 0.0F);
        }
    }
}
