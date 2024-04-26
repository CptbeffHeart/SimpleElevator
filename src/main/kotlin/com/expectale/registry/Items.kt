package com.expectale.registry

import com.expectale.SimpleElevator
import xyz.xenondevs.nova.addon.registry.ItemRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage

@Init(stage = InitStage.PRE_PACK)
object Items : ItemRegistry by SimpleElevator.registry {
    
    val BLACK_ELEVATOR = registerItem(Blocks.BLACK_ELEVATOR)
    val BLUE_ELEVATOR = registerItem(Blocks.BLUE_ELEVATOR)
    val BROWN_ELEVATOR = registerItem(Blocks.BROWN_ELEVATOR)
    val CYAN_ELEVATOR = registerItem(Blocks.CYAN_ELEVATOR)
    val GRAY_ELEVATOR = registerItem(Blocks.GRAY_ELEVATOR)
    val GREEN_ELEVATOR = registerItem(Blocks.GREEN_ELEVATOR)
    val LIGHT_BLUE_ELEVATOR = registerItem(Blocks.LIGHT_BLUE_ELEVATOR)
    val LIGHT_GRAY_ELEVATOR = registerItem(Blocks.LIGHT_GRAY_ELEVATOR)
    val LIME_ELEVATOR = registerItem(Blocks.LIME_ELEVATOR)
    val MAGENTA_ELEVATOR = registerItem(Blocks.MAGENTA_ELEVATOR)
    val ORANGE_ELEVATOR = registerItem(Blocks.ORANGE_ELEVATOR)
    val PINK_ELEVATOR = registerItem(Blocks.PINK_ELEVATOR)
    val PURPLE_ELEVATOR = registerItem(Blocks.PURPLE_ELEVATOR)
    val RED_ELEVATOR = registerItem(Blocks.RED_ELEVATOR)
    val WHITE_ELEVATOR = registerItem(Blocks.WHITE_ELEVATOR)
    val YELLOW_ELEVATOR = registerItem(Blocks.YELLOW_ELEVATOR)

}