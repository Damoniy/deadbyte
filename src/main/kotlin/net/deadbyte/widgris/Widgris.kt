package net.deadbyte.widgris

import net.deadbyte.widgris.engine.Ticker
import net.deadbyte.widgris.engine.TerrainGenerator
import net.deadbyte.widgris.engine.singleton.Registries
import net.deadbyte.widgris.engine.terrain.Tilemap
import net.deadbyte.widgris.engine.terrain.Tiles
import java.awt.Color

class Widgris: Ticker() {

    lateinit var world: World
    lateinit var tiles: Tiles
    lateinit var terrainGenerator: TerrainGenerator

    override fun preInit() {
        world = World()
        tiles = Tiles()
        println(Registries.tiles.size)
        terrainGenerator = TerrainGenerator(Tilemap("/terrain/tilemap.png"))
    }

    override fun render() {
        this.window.drawComponentArray(terrainGenerator.tiles)
        this.window.drawString("UPS: ${this.ups} FPS: ${this.fps}", Color.LIGHT_GRAY, "Arial", 25, 25, 15, false)
    }

    override fun update() {

    }
}