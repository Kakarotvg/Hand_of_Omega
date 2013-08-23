package kakarotvg.omega.entity;

import kakarotvg.omega.Reference;
import kakarotvg.omega.handlers.ItemHandler;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityEliminator extends EntityMob {

    public EntityEliminator(World par1World) {
        super(par1World);
        this.setSize(0.9F, 0.9F);
        this.getNavigator().setAvoidsWater(false);
        this.tasks.addTask(0, new EntityAISwimming(this));
        // sets the movement speed
        this.tasks.addTask(6, new EntityAIWander(this, 0.25D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        // gets the mob to attack the player
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.25D, false));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, 0.25D, true));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
    }

    public int getMaxHealth() {
        return 20;
    }

    public int getAttackStrength() {
        return 4;
    }

    public static int getArmorValue() {
        return 4;
    }

    public boolean isAIEnabled() {
        return true;
    }

    protected String getLivingSound() {
        return Reference.MOD_ID + ":" + "mob.eliminator.say";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound() {
        return Reference.MOD_ID + ":" + "mob.eliminator.hurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound() {
        return Reference.MOD_ID + ":" + "mob.eliminator.death";
    }

    protected int getDropItemId() {
        return ItemHandler.barium.itemID;
    }

}
