package kakarotvg.omega.events;

import kakarotvg.omega.blocks.TealSapling;
import kakarotvg.omega.handlers.blocks.BlockHandler;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class BoneMealTreeEvent {

    @ForgeSubscribe
    public void bonemealtealsapling(BonemealEvent event) {
        if (event.ID == BlockHandler.tealsapling.blockID) {
            if (!event.world.isRemote) {
                ((TealSapling) BlockHandler.tealsapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
            }
        }
    }
}
