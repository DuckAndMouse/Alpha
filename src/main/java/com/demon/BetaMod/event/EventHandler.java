package com.demon.BetaMod.event;

import com.demon.BetaMod.enchantment.EnchantmentRegistryHandler;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.commons.lang3.RandomUtils;

/*
 * alpha com.demon.AlphaMod.event
 * @Author:Demon
 * @Date:2021/9/14 23:09
 * @Description:
 */
@Mod.EventBusSubscriber
public class EventHandler
{
    @SubscribeEvent
    public static void onLivingDeath(LivingDeathEvent event)
    {
        Entity source = event.getSource().getImmediateSource();
        if (source instanceof EntityPlayer && !source.world.isRemote)
        {
            /*source必须为EntityPlayer的实例才能转换*/
            EntityPlayer player = (EntityPlayer) source;
            ItemStack heldItemMainhand = player.getHeldItemMainhand();
            int level =
                    EnchantmentHelper.getEnchantmentLevel(EnchantmentRegistryHandler.EXPLOSION,
                            heldItemMainhand);
            if (level > 0)
            {
                Entity target = event.getEntity();
                target.world.createExplosion(null, target.posX, target.posY, target.posZ,
                        3 * level, false);
            }
        }
    }

    @SubscribeEvent
    public static void OnPlayerAttack(LivingAttackEvent event)
    {
        Entity source = event.getSource().getImmediateSource();
        if (source instanceof EntityPlayer && !source.world.isRemote)
        {
            EntityPlayer player = (EntityPlayer) source;
            ItemStack heldItemMainhand = player.getHeldItemMainhand();
            int level =
                    EnchantmentHelper.getEnchantmentLevel(EnchantmentRegistryHandler.ATTRACT_LIGHTNING, heldItemMainhand);
            if (level > 0)
            {
                int probability = 5 + level * 5;
                int randomInt = RandomUtils.nextInt(0, 100);
                if (randomInt <= probability)
                {
                    Entity target = event.getEntity();
                    target.getEntityWorld().addWeatherEffect(new EntityLightningBolt(target.getEntityWorld(), target.posX, target.posY,
                            target.posZ, false));
                }
            }
        }
        if (source instanceof EntityLivingBase && !source.world.isRemote)
        {
            ItemStack ChestItem = ((EntityLivingBase)event.getSource().getImmediateSource()).getItemStackFromSlot(EntityEquipmentSlot.CHEST);
            int level =
                    EnchantmentHelper.getEnchantmentLevel(EnchantmentRegistryHandler.FIRE_CHEST,
                            ChestItem);
            if (level>0)
            {
                source.setFire(3);
            }
        }

    }
}
