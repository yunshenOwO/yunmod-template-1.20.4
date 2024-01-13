package com.yunshen

import com.yunshen.item.ItemRegistry
import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory


object YunMod : ModInitializer {
	val logger: Logger = LoggerFactory.getLogger("yunmod")
	override fun onInitialize() {
		ItemRegistry.registriesItemAll()
		ItemRegistry.addOtherEffect()

	}
}