package com.yunshen

import net.fabricmc.api.ClientModInitializer

object YunClientMod: ClientModInitializer {

    override fun onInitializeClient() {
        println("启动成功")
    }
}