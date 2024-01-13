package com.yunshen.datagen

import com.yunshen.block.ModBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator

class ModModelProvider(output: FabricDataOutput):FabricModelProvider(output) {
    override fun generateBlockStateModels(blockStateModelGenerator: BlockStateModelGenerator?) {
        blockStateModelGenerator?.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCKS)
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerator?) {
    }
}