package com.yunshen

import com.yunshen.item.ModItem
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntries
import net.fabricmc.fabric.api.registry.FuelRegistry
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemGroups
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import org.slf4j.Logger
import org.slf4j.LoggerFactory


object YunMod : ModInitializer {
    val logger: Logger = LoggerFactory.getLogger("yunmod")
	const val MODID = "yunmod"
	val  CUSTOM_ITEM: Item = Registry.register(Registries.ITEM, Identifier(MODID, "custom_item"), ModItem(
		FabricItemSettings()
	))

	val ITEM_GROUP: ItemGroup = FabricItemGroup.builder()
		.icon { ItemStack(CUSTOM_ITEM) }
		.displayName(Text.translatable("itemGroup.yunmod.test_group"))
		.entries { context, entries ->
			entries.add(CUSTOM_ITEM)
		}
		.build()

	val GROUP:ItemGroup = Registry.register(Registries.ITEM_GROUP, Identifier(MODID, "test_group"), ITEM_GROUP)

	override fun onInitialize() {
		logger.info("Hello Fabric world!")
		logger.info("注册成功 ${CUSTOM_ITEM.name}")
		logger.info("注册成功 ${GROUP.displayName}")
		FuelRegistry.INSTANCE.add(CUSTOM_ITEM, 300) //让物品可作为燃料

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
			.register(ModifyEntries { content: FabricItemGroupEntries ->
				content.add(CUSTOM_ITEM)
			})

	}
}