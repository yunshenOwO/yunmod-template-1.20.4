package com.yunshen.item

import com.yunshen.YunMod.logger
import com.yunshen.block.CustomArmorMaterial
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.registry.FuelRegistry
import net.minecraft.item.ArmorItem
import net.minecraft.item.ArmorMaterial
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier


object ItemRegistry {
    private const val MODID = "yunmod"
    val  CUSTOM_ITEM: Item = Registry.register(
        Registries.ITEM, Identifier(MODID, "custom_item"), ModItem(
        FabricItemSettings()
    ))
    val CUSTOM_ARMOR_MATERIAL: ArmorMaterial = CustomArmorMaterial()
    val CUSTOM_MATERIAL = ModItem(Item.Settings())
    val CUSTOM_MATERIAL_HELMET: Item = ArmorItem(CUSTOM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, Item.Settings())
    val CUSTOM_MATERIAL_CHESTPLATE: Item = ArmorItem(CUSTOM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, Item.Settings())
    val CUSTOM_MATERIAL_LEGGINGS: Item = ArmorItem(CUSTOM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, Item.Settings())
    val CUSTOM_MATERIAL_BOOTS: Item = ArmorItem(CUSTOM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, Item.Settings())
    fun registriesItemAll(){
        Registry.register(Registries.ITEM_GROUP, Identifier(MODID, "test_group"), ModItemGroups.ITEM_GROUP) //注册物品栏
        Registry.register(Registries.ITEM, Identifier(MODID, "custom_material"), CUSTOM_MATERIAL)
        Registry.register(Registries.ITEM, Identifier(MODID, "custom_material_helmet"), CUSTOM_MATERIAL_HELMET)
        Registry.register(Registries.ITEM, Identifier(MODID, "custom_material_chestplate"), CUSTOM_MATERIAL_CHESTPLATE)
        Registry.register(Registries.ITEM, Identifier(MODID, "custom_material_leggings"), CUSTOM_MATERIAL_LEGGINGS)
        Registry.register(Registries.ITEM, Identifier(MODID, "custom_material_boots"), CUSTOM_MATERIAL_BOOTS)
        logger.info("物品注册完成")
    }
    fun addOtherEffect(){
        ModItemGroups.addGroup(CUSTOM_ITEM)
        FuelRegistry.INSTANCE.add(CUSTOM_ITEM, 300) //让物品可作为燃料
        logger.info("物品效果注册成功")
    }
}