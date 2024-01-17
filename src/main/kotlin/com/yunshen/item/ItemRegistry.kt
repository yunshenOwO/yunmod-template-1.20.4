package com.yunshen.item

import com.yunshen.YunMod.logger
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.registry.FuelRegistry
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
    fun registriesItemAll(){
        Registry.register(Registries.ITEM_GROUP, Identifier(MODID, "test_group"), ModItemGroups.ITEM_GROUP) //注册物品栏
        logger.info("物品注册完成")
    }
    fun addOtherEffect(){
        ModItemGroups.addGroup(CUSTOM_ITEM)
        FuelRegistry.INSTANCE.add(CUSTOM_ITEM, 300) //让物品可作为燃料
        logger.info("物品效果注册成功")
    }
}