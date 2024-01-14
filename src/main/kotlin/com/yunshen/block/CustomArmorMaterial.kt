package com.yunshen.block

import net.minecraft.item.ArmorItem
import net.minecraft.item.ArmorMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents

class CustomArmorMaterial: ArmorMaterial {
    private val BASE_DURABILITY = intArrayOf(13, 15, 16, 11)
    private val PROTECTION_VALUES = intArrayOf(3, 6, 8, 3)
    override fun getDurability(type: ArmorItem.Type): Int {
        return BASE_DURABILITY[type.equipmentSlot.entitySlotId] * PROTECTION_VALUES[0]
    }
    override fun getProtection(type: ArmorItem.Type): Int {
        return PROTECTION_VALUES[type.equipmentSlot.entitySlotId]
    }

    override fun getEnchantability(): Int {
        return 3
    }

    override fun getEquipSound(): SoundEvent {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON
    }

    override fun getRepairIngredient(): Ingredient {
        return Ingredient.ofItems()
    }

    override fun getName(): String {
        return "yun"
    }

    override fun getToughness(): Float {
        return 6.0f
    }

    override fun getKnockbackResistance(): Float {
        return 0.8f
    }
}