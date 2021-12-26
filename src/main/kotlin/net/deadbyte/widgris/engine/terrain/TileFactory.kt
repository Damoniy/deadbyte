package net.deadbyte.widgris.engine.terrain

import net.deadbyte.widgris.engine.singleton.Registries

class TileFactory {
    fun createTile(hexcode: String): Tile {
        Registries.tiles.forEach {
            if(hexcode.uppercase() == it.hexadecimalCode) { println(true); return it.getTile() }
        }
        return TileDirt()
    }
}