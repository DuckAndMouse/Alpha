package com.demon.BetaMod.enchantment;

import com.demon.BetaMod.AlphaMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

/*
 * alpha com.demon.AlphaMod.enchantment
 * @Author:Demon
 * @Date:2021/9/14 22:53
 * @Description:
 */
public class EnchantmentFireChest extends Enchantment
{
    public EnchantmentFireChest()
    {
        super(Enchantment.Rarity.RARE, EnumEnchantmentType.ARMOR_CHEST,
                new EntityEquipmentSlot[] {EntityEquipmentSlot.CHEST});
        this.setName(AlphaMod.MODID+".fire_chest");
        this.setRegistryName("fireChest");
    }
    @Override
    public int getMaxLevel(){return 3;}

    @Override
    public int getMinEnchantability(int enchantmentLevel){return 16 + enchantmentLevel * 5;}

    @Override
    public int getMaxEnchantability(int enchantmentLevel){return 25 + enchantmentLevel * 5;}
}
