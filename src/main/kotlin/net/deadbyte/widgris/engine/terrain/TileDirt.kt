package net.deadbyte.widgris.engine.terrain

import net.deadbyte.widgris.engine.resources.Resources
import net.deadbyte.widgris.engine.resources.Sprite
import java.awt.image.BufferedImage

class TileDirt: Tile() {
    override val sprite: Sprite = Resources.getSprite(0)
    override val image: BufferedImage = sprite.image
    override val hexadecimalCode: String = "FF4A3825"

    override fun getTile(): Tile {
        return TileDirt()
    }
}