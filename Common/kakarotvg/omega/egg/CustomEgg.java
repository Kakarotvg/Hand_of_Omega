package kakarotvg.omega.egg;

import kakarotvg.omega.handlers.creativetab.CreativetabHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.projectile.EntityEgg;

public class CustomEgg extends Vgegg {
    
    public CustomEgg() {
        super();
        this.setCreativeTab(CreativetabHandler.vgtab2);
    }
    
    public static int getUniqueID() {
        int EntityID = 300;
        do {
            EntityID++;
        }
        while (EntityList.getStringFromID(EntityID) != null);
        return EntityID;
    }
    
    public static void registerCustomEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) {
        int id = getUniqueID();
        EntityList.IDtoClassMapping.put(id, entity);
        EntityList.entityEggs.put(id, new EntityEgg(null, id, primaryColor, secondaryColor));
        
    }
    
}
