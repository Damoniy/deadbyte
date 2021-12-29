package net.deadbyte.widgris.engine.terrain

import net.deadbyte.widgris.engine.singleton.Registries
import net.deadbyte.widgris.engine.terrain.tiles.TileDirt
import net.deadbyte.widgris.engine.terrain.tiles.TileGrass

class Tiles {
    private val dirt = TileDirt()
    private val grass = TileGrass()

    init {
        Registries.registerAll(arrayOf(dirt, grass))
    }
}