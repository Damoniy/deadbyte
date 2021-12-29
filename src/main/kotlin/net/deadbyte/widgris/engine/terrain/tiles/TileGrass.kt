package net.deadbyte.widgris.engine.terrain.tiles

import net.deadbyte.widgris.engine.resources.Resources
import net.deadbyte.widgris.engine.resources.Sprite
import java.awt.image.BufferedImage

class TileGrass: Tile() {
    override val sprite: Sprite = Resources.getSprite(1)
    override val hexadecimalCode: String = "FF5B6A32"

    override fun getTile(): Tile {
        return TileGrass()
    }
}
