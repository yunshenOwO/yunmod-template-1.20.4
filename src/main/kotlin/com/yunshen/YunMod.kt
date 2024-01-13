package com.yunshen

import com.yunshen.item.ItemRegistry
import com.yunshen.item.ItemRegistry.CUSTOM_ITEM
import com.yunshen.item.ModItemGroups
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.registry.FuelRegistry


object YunMod : ModInitializer {
	const val MODID = "yunmod"


	override fun onInitialize() {
		ModItemGroups.addGroup(CUSTOM_ITEM)
		ItemRegistry.registriesItemAll()
		FuelRegistry.INSTANCE.add(CUSTOM_ITEM, 300) //让物品可作为燃料
	}
}