package com.expectale.block

import com.destroystokyo.paper.event.player.PlayerJumpEvent
import com.expectale.registry.Blocks
import org.bukkit.Axis
import org.bukkit.Location
import org.bukkit.Sound
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerToggleSneakEvent
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitFun
import xyz.xenondevs.nova.initialize.InitStage
import xyz.xenondevs.nova.util.advance
import xyz.xenondevs.nova.util.playSoundNearby
import xyz.xenondevs.nova.util.registerEvents
import xyz.xenondevs.nova.world.block.BlockManager
import xyz.xenondevs.nova.world.pos

@Init(stage = InitStage.POST_WORLD)
object Elevator: Listener {
    
    @InitFun
    private fun init() {
        registerEvents()
    }
    
    @EventHandler
    private fun jump(event: PlayerJumpEvent) {
        val location = event.from.clone()
        location.advance(Axis.Y, -1.0)
        if (!isBlockElevator(location)) return
        
        for (y in location.y.toInt() + 1 until location.world.maxHeight) {
            location.y = y.toDouble()
            if (tpPlayer(location, event.player)) return
        }
    }
    
    @EventHandler
    private fun crouch(event: PlayerToggleSneakEvent) {
        if (!event.isSneaking) return
        val location = event.player.location.clone()
        location.advance(Axis.Y, -1.0)
        if (!isBlockElevator(location)) return
        
        for (y in location.y.toInt() - 1 downTo location.world.minHeight) {
            location.y = y.toDouble()
            if (tpPlayer(location, event.player)) return
        }
    }
    
    private fun tpPlayer(location: Location, player: Player): Boolean {
        if (!isBlockElevator(location) || !spaceForPlayer(location)) return false
        location.add(0.0, 1.0, 0.0)
        var tpLoc = location.toCenterLocation()
        tpLoc = tpLoc.advance(Axis.Y, -0.5)
        location.playSoundNearby(Sound.ENTITY_ENDERMAN_TELEPORT, 1f, 1f, player)
        player.teleport(tpLoc)
        player.playSound(tpLoc, Sound.ENTITY_PLAYER_TELEPORT, 1f, 1f)
        return true
    }
    
    private fun isBlockElevator(location: Location): Boolean {
        val blockState = BlockManager.getBlockState(location.pos) ?: return false
        return blockState.block == Blocks.WHITE_ELEVATOR
    }
    
    private fun spaceForPlayer(location: Location): Boolean {
        val loc = location.clone()
        for (i in 0..1) {
            loc.advance(Axis.Y)
            if (!loc.block.isReplaceable) return false
        }
        return true
    }
}