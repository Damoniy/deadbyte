package net.deadbyte.widgris.engine.resources

object Resources {
    private val tiles = Spritesheet("/terrain/dirt.png")

    fun getSprite(id: Int): Sprite {
        return tiles.getSprite(id)
    }
}
