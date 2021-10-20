package com.demon.BetaMod.enchantment;

import com.demon.BetaMod.BetaMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;

/*
 * alpha com.demon.AlphaMod.enchantment
 * @Author:Demon
 * @Date:2021/9/14 22:48
 * @Description:
 */
public class EnchantmentExplosion extends Enchantment
{
    public EnchantmentExplosion()
    {
        super(Enchantment.Rarity.RARE, EnumEnchantmentType.WEAPON,new EntityEquipmentSlot[] {EntityEquipmentSlot.MAINHAND});
        this.setName(BetaMod.MODID+".explosion");
        this.setRegistryName("explosion");
    }

    @Override
    public int getMaxLevel()
    {
        return 3;
    }

    @Override
    public int getMinEnchantability(int enchantmentLevel)
    {
        return 16 + enchantmentLevel * 5;
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel)
    {
        return 21 + enchantmentLevel * 5;
    }

    /*附魔时判断条件，符合条件的返回false禁止附魔
     * 不兼容同类不同等级附魔(父类方法)
     * 不能与横扫共同存在
     * */
    @Override
    protected boolean canApplyTogether(Enchantment ench)
    {
        return super.canApplyTogether(ench) && Enchantments.SWEEPING != ench;
    }
}
