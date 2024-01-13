package com.yunshen.item

import com.yunshen.item.ItemRegistry.CUSTOM_ITEM
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemGroups
import net.minecraft.item.ItemStack
import net.minecraft.text.Text

object ModItemGroups {
    val ITEM_GROUP: ItemGroup = FabricItemGroup.builder()
        .icon { ItemStack(CUSTOM_ITEM) }
        .displayName(Text.translatable("itemGroup.yunmod.test_group"))
        .entries { _, entries ->
            entries.add(CUSTOM_ITEM)
        }
        .build()

    fun addGroup(item:Item){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
            .register(ItemGroupEvents.ModifyEntries { content: FabricItemGroupEntries ->
                content.add(item)
            })

    }
}