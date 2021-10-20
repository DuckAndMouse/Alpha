package com.demon.BetaMod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;


/*
 * alpha com.demon.AlphaMod.enchantment
 * @Author:Demon
 * @Date:2021/9/14 21:48
 * @Description:registry enchantment
 */
@EventBusSubscriber
public class EnchantmentRegistryHandler
{
    public static final EnchantmentExplosion EXPLOSION = new EnchantmentExplosion();
    public static final EnchantmentAttractLightning ATTRACT_LIGHTNING =
            new EnchantmentAttractLightning();
    public static final EnchantmentFireChest FIRE_CHEST=new EnchantmentFireChest();

    @SubscribeEvent
    public static void OnRegistry(Register<Enchantment> event)
    {
        IForgeRegistry<Enchantment> registry = event.getRegistry();
        registry.register(EXPLOSION);
        registry.register(ATTRACT_LIGHTNING);
        registry.register(FIRE_CHEST);
    }
}
