package net.deadbyte.widgris.engine.terrain

import net.deadbyte.widgris.engine.drawable.GameComponent
import net.deadbyte.widgris.engine.registry.IRegistrable
import net.deadbyte.widgris.engine.resources.Resources
import net.deadbyte.widgris.engine.resources.Sprite
import java.awt.image.BufferedImage

abstract class Tile: GameComponent(), IRegistrable {
    abstract fun getTile(): Tile
}