package net.deadbyte.widgris.engine.terrain

import net.deadbyte.widgris.engine.singleton.Registries
import net.deadbyte.widgris.engine.terrain.tiles.Tile
import net.deadbyte.widgris.engine.terrain.tiles.TileDirt

class TileFactory {
    fun createTile(hexcode: String): Tile {
        Registries.tiles.forEach {
            if(hexcode.uppercase() == it.hexadecimalCode) { return it.getTile() }
        }
        return TileDirt()
    }
}