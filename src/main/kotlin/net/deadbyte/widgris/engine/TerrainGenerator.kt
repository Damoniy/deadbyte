package net.deadbyte.widgris.engine

import net.deadbyte.widgris.engine.drawable.GameComponent
import net.deadbyte.widgris.engine.terrain.*

class TerrainGenerator(private val tilemap: Tilemap) {
    private val tileFactory = TileFactory()
    val tiles = arrayOfNulls<GameComponent>(tilemap.width * tilemap.height)

    init {
        this.generate()
    }

    private fun generate() {
        for(x in 0 until tilemap.width) {
            for(y in 0 until tilemap.height) {
                val index = x + (y * tilemap.width)
                val tile = tileFactory.createTile(Integer.toHexString(tilemap.pixels[index]))
                tile.setPos(x, y)
                tiles[index] = (tile)
            }
        }
    }
}
