package net.deadbyte.widgris.engine.terrain.tiles

import net.deadbyte.widgris.engine.resources.Resources
import net.deadbyte.widgris.engine.resources.Sprite

class TileDirt: Tile() {
    override val sprite: Sprite = Resources.getSprite(0)
    override val hexadecimalCode: String = "FF4A3825"

    override fun getTile(): Tile {
        return TileDirt()
    }
}