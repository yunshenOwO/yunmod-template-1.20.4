package com.yunshen.block

import com.yunshen.YunMod
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier

object ModBlocks {
    val RUBY_BLOCKS = registerModBlock("ruby_block",
        Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)))

    private fun registerModBlock(name:String, block: Block): Block {
        registerBlockItem(name, block)
        return Registry.register(Registries.BLOCK, Identifier(YunMod.MODID, name), block)
    }

    private fun registerBlockItem(name:String, block: Block): Item {
        return Registry.register(
            Registries.ITEM, Identifier(YunMod.MODID, name),
            BlockItem(block,FabricItemSettings())
        )
    }

    fun registerModBlocks(){
        YunMod.logger.info("注册方块成功: ${YunMod.MODID}")
    }
}