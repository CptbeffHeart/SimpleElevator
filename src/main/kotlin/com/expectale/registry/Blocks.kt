package com.expectale.registry

import com.expectale.SimpleElevator
import org.bukkit.Material
import xyz.xenondevs.nova.addon.registry.BlockRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage
import xyz.xenondevs.nova.item.options.BlockOptions
import xyz.xenondevs.nova.item.tool.VanillaToolCategories
import xyz.xenondevs.nova.item.tool.VanillaToolTiers
import xyz.xenondevs.nova.world.block.sound.SoundGroup

@Init(stage = InitStage.PRE_PACK)
object Blocks : BlockRegistry by SimpleElevator.registry {
    
    private val ELEVATOR_OPTION = BlockOptions(
        2.0,
        VanillaToolCategories.PICKAXE,
        VanillaToolTiers.STONE,
        true,
        SoundGroup.STONE,
        Material.STONE)
    
    val BLACK_ELEVATOR = block("black_elevator").blockOptions(ELEVATOR_OPTION).register()
    val BLUE_ELEVATOR = block("blue_elevator").blockOptions(ELEVATOR_OPTION).register()
    val BROWN_ELEVATOR = block("brown_elevator").blockOptions(ELEVATOR_OPTION).register()
    val CYAN_ELEVATOR = block("cyan_elevator").blockOptions(ELEVATOR_OPTION).register()
    val GRAY_ELEVATOR = block("gray_elevator").blockOptions(ELEVATOR_OPTION).register()
    val GREEN_ELEVATOR = block("green_elevator").blockOptions(ELEVATOR_OPTION).register()
    val LIGHT_BLUE_ELEVATOR = block("light_blue_elevator").blockOptions(ELEVATOR_OPTION).register()
    val LIGHT_GRAY_ELEVATOR = block("light_gray_elevator").blockOptions(ELEVATOR_OPTION).register()
    val LIME_ELEVATOR = block("lime_elevator").blockOptions(ELEVATOR_OPTION).register()
    val MAGENTA_ELEVATOR = block("magenta_elevator").blockOptions(ELEVATOR_OPTION).register()
    val ORANGE_ELEVATOR = block("orange_elevator").blockOptions(ELEVATOR_OPTION).register()
    val PINK_ELEVATOR = block("pink_elevator").blockOptions(ELEVATOR_OPTION).register()
    val PURPLE_ELEVATOR = block("purple_elevator").blockOptions(ELEVATOR_OPTION).register()
    val RED_ELEVATOR = block("red_elevator").blockOptions(ELEVATOR_OPTION).register()
    val WHITE_ELEVATOR = block("white_elevator").blockOptions(ELEVATOR_OPTION).register()
    val YELLOW_ELEVATOR = block("yellow_elevator").blockOptions(ELEVATOR_OPTION).register()

}