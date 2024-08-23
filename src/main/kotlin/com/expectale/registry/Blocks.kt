package com.expectale.registry

import com.expectale.SimpleElevator
import org.bukkit.Material
import xyz.xenondevs.nova.addon.registry.BlockRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage
import xyz.xenondevs.nova.resources.layout.block.BackingStateCategory
import xyz.xenondevs.nova.world.block.NovaBlock
import xyz.xenondevs.nova.world.block.behavior.BlockSounds
import xyz.xenondevs.nova.world.block.behavior.Breakable
import xyz.xenondevs.nova.world.block.sound.SoundGroup
import xyz.xenondevs.nova.world.item.tool.VanillaToolCategories
import xyz.xenondevs.nova.world.item.tool.VanillaToolTiers

@Init(stage = InitStage.PRE_PACK)
object Blocks : BlockRegistry by SimpleElevator.registry {
    
    private val ELEVATOR = Breakable(
        2.0,
        VanillaToolCategories.PICKAXE,
        VanillaToolTiers.STONE,
        true,
        Material.STONE)
    
    val BLACK_ELEVATOR = elevatorBlock("black_elevator")
    val BLUE_ELEVATOR = elevatorBlock("blue_elevator")
    val BROWN_ELEVATOR = elevatorBlock("brown_elevator")
    val CYAN_ELEVATOR = elevatorBlock("cyan_elevator")
    val GRAY_ELEVATOR = elevatorBlock("gray_elevator")
    val GREEN_ELEVATOR = elevatorBlock("green_elevator")
    val LIGHT_BLUE_ELEVATOR = elevatorBlock("light_blue_elevator")
    val LIGHT_GRAY_ELEVATOR = elevatorBlock("light_gray_elevator")
    val LIME_ELEVATOR = elevatorBlock("lime_elevator")
    val MAGENTA_ELEVATOR = elevatorBlock("magenta_elevator")
    val ORANGE_ELEVATOR = elevatorBlock("orange_elevator")
    val PINK_ELEVATOR = elevatorBlock("pink_elevator")
    val PURPLE_ELEVATOR = elevatorBlock("purple_elevator")
    val RED_ELEVATOR = elevatorBlock("red_elevator")
    val WHITE_ELEVATOR = elevatorBlock("white_elevator")
    val YELLOW_ELEVATOR = elevatorBlock("yellow_elevator")
    
    private fun elevatorBlock(
        name: String
    ): NovaBlock = block(name) {
        behaviors(ELEVATOR, BlockSounds(SoundGroup.STONE))
        models {
            stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
        }
    }
}