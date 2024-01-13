package com.yunshen

import com.yunshen.datagen.ModLanguageProvider
import com.yunshen.datagen.ModModelProvider
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput

object YunModDataGenerator : DataGeneratorEntrypoint {
	override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
		val pack = fabricDataGenerator.createPack()

		pack.addProvider { output:FabricDataOutput ->
			ModModelProvider(
				output
			)
		}
		pack.addProvider { output: FabricDataOutput ->
			ModLanguageProvider(
				output
			)

		}
	}
}