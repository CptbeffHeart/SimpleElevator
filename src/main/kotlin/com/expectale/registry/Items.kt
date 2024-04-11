package com.expectale.registry

import com.expectale.SimpleElevator
import xyz.xenondevs.nova.addon.registry.ItemRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage

@Init(stage = InitStage.PRE_PACK)
object Items : ItemRegistry by SimpleElevator.registry {
    
    val WHITE_ELEVATOR = registerItem(Blocks.WHITE_ELEVATOR)

}