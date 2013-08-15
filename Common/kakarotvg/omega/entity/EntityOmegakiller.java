package kakarotvg.omega.entity;

import kakarotvg.omega.Reference;
import kakarotvg.omega.items.ItemHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityLivingData;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityOmegakiller extends EntityMob {

    public EntityOmegakiller(World par1World) {
        super(par1World);
        this.setSize(0.9F, 0.9F);
        this.getNavigator().setAvoidsWater(false);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(6, new EntityAIWander(this, 0.25D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
    }

    public int getMaxHealth() {
        return 20;
    }

    public int getMaxDamage() {
        return 4;
    }

    public int getMaxSpeed() {
        return 1;
    }

    public int setSpeed() {
        return 3;
    }

    public boolean isAIEnabled() {
        return true;
    }

    protected String getLivingSound() {
        return "mob.endermen.idle";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound() {
        return "mob.endermen.hit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound() {
        return "mob.endermen.death";
    }

    protected int getDropItemId() {
        return ItemHandler.sapphire.itemID;
    }
}
