package com.yunshen

import com.yunshen.YunMod.logger
import net.fabricmc.api.ClientModInitializer

object YunClientMod: ClientModInitializer {

    override fun onInitializeClient() {
        logger.info("启动成功")
    }
}