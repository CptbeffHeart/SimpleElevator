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
    
    val WHITE_ELEVATOR = block("white_elevator").blockOptions(ELEVATOR_OPTION).register()

}