package com.demon.BetaMod.enchantment;

import com.demon.BetaMod.AlphaMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

/*
 * alpha com.demon.AlphaMod.enchantment
 * @Author:Demon
 * @Date:2021/9/14 22:52
 * @Description:
 */
public class EnchantmentAttractLightning extends Enchantment
{
    public EnchantmentAttractLightning()
    {
        super(Enchantment.Rarity.RARE, EnumEnchantmentType.WEAPON,new EntityEquipmentSlot[] {EntityEquipmentSlot.MAINHAND});
        this.setName(AlphaMod.MODID+".attract_lightning");
        this.setRegistryName("attractLightning");
    }

    @Override
    public int getMaxLevel(){return 3;}

    @Override
    public int getMinEnchantability(int enchantmentLevel){return 16 + enchantmentLevel * 5;}

    @Override
    public int getMaxEnchantability(int enchantmentLevel){return 25 + enchantmentLevel * 5;}
}
