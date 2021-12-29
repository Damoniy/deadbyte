package net.deadbyte.widgris.engine.terrain.tiles

import net.deadbyte.widgris.engine.drawable.GameComponent
import net.deadbyte.widgris.engine.registry.IRegistrable

abstract class Tile: GameComponent(), IRegistrable {
    abstract fun getTile(): Tile
}