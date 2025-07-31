// side: client

// Tooltips

import net.minecraftforge.event.entity.player.ItemTooltipEvent

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack() in item('akashictome:tome')) {
        event.getToolTip() << '§cDO NOT ADD: Astral Tome, Lexica Alquimia, Lexica Botania'
    }
}
