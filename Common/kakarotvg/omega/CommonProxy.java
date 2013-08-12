package kakarotvg.omega;

import kakarotvg.omega.egg.CustomEgg;
import kakarotvg.omega.entity.EntityEliminator;
import kakarotvg.omega.entity.EntityOmegaHound;
import kakarotvg.omega.entity.EntityOmegakiller;
import kakarotvg.omega.entity.EntitySlayer;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonProxy {

    public void registerRenderInformation() {

    }

    public void init() {

        // Omega Hound
        // spawns Omega hound and creates spawn egg
        EntityRegistry.registerGlobalEntityID(EntityOmegaHound.class, "Omega Hound", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(EntityOmegaHound.class, 3, 2, 4, EnumCreatureType.ambient, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.swampland);
        LanguageRegistry.instance().addStringLocalization("entity.Omega Hound.name", "Omega Hound");
        CustomEgg.registerCustomEntityEgg(EntityOmegaHound.class, 0x0800FF, 0x02FA0B);

        // Omega killer
        // spawns Omega Killer and creates spawn egg
        EntityRegistry.registerGlobalEntityID(EntityOmegakiller.class, "Omega Killer", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(EntityOmegakiller.class, 6, 2, 4, EnumCreatureType.monster, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.swampland);
        LanguageRegistry.instance().addStringLocalization("entity.Omega Killer.name", "Omega Killer");
        CustomEgg.registerCustomEntityEgg(EntityOmegakiller.class, 0xF2FF00, 0xFF9100);
        // Eliminator
        // spawns Eliminator and creates spawn egg
        EntityRegistry.registerGlobalEntityID(EntityEliminator.class, "Eliminator", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(EntityEliminator.class, 6, 2, 4, EnumCreatureType.monster, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.swampland);
        LanguageRegistry.instance().addStringLocalization("entity.Eliminator.name", "Eliminator");
        CustomEgg.registerCustomEntityEgg(EntityEliminator.class, 0x00FFF2, 0xFF6600);
        // Slayer
        EntityRegistry.registerGlobalEntityID(EntitySlayer.class, "Slayer", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(EntitySlayer.class, 6, 2, 4, EnumCreatureType.monster, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.swampland);
        LanguageRegistry.instance().addStringLocalization("entity.Slayer.name", "Slayer");
        CustomEgg.registerCustomEntityEgg(EntitySlayer.class, 0x350085, 0xDDFF61);
        registerRenderInformation();
    }

    public void registerRenders() {

    }

    public int addArmor(String armor) {
        return 0;
    }

}
