package com.yunshen.item

import com.yunshen.YunMod
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ItemRegistry {
    val  CUSTOM_ITEM: Item = Registry.register(
        Registries.ITEM, Identifier(YunMod.MODID, "custom_item"), ModItem(
        FabricItemSettings()
    ))

    fun registriesItemAll(){
        Registry.register(Registries.ITEM_GROUP, Identifier(YunMod.MODID, "test_group"), ModItemGroups.ITEM_GROUP) //注册物品栏
    }
}