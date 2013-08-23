package kakarotvg.omega.events;

import kakarotvg.omega.Reference;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SoundEvents {

    @SideOnly(Side.CLIENT)
    @ForgeSubscribe
    public void onSoundLoad(SoundLoadEvent event) {
        // Annihilator sounds
        event.manager.addSound(Reference.MOD_ID + ":" + "mob/annihilator/say.ogg");
        event.manager.addSound(Reference.MOD_ID + ":" + "mob/annihilator/hurt.ogg");
        event.manager.addSound(Reference.MOD_ID + ":" + "mob/annihilator/death.ogg");
        // Eliminator sounds
        event.manager.addSound(Reference.MOD_ID + ":" + "mob/eliminator/say.ogg");
        event.manager.addSound(Reference.MOD_ID + ":" + "mob/eliminator/hurt.ogg");
        event.manager.addSound(Reference.MOD_ID + ":" + "mob/eliminator/death.ogg");
        // Jungle Assasin sounds
        event.manager.addSound(Reference.MOD_ID + ":" + "mob/jungleassasin/say.ogg");
        event.manager.addSound(Reference.MOD_ID + ":" + "mob/jungleassasin/hurt.ogg");
        event.manager.addSound(Reference.MOD_ID + ":" + "mob/jungleassasin/death.ogg");
        // omega killer sounds
        event.manager.addSound(Reference.MOD_ID + ":" + "mob/omegakiller/say.ogg");
        event.manager.addSound(Reference.MOD_ID + ":" + "mob/omegakiller/hurt.ogg");
        event.manager.addSound(Reference.MOD_ID + ":" + "mob/omegakiller/death.ogg");
        // slayer sounds
        event.manager.addSound(Reference.MOD_ID + ":" + "mob/slayer/say.ogg");
        event.manager.addSound(Reference.MOD_ID + ":" + "mob/slayer/hurt.ogg");
        event.manager.addSound(Reference.MOD_ID + ":" + "mob/slayer/death.ogg");
    }

}
