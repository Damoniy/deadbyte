package net.deadbyte.widgris.engine.registry

import net.deadbyte.widgris.engine.terrain.Tile
import net.deadbyte.widgris.engine.terrain.Tiles

abstract class Registry {
    protected val preInitRegistries = ArrayList<IRegistrable>()
    protected val initializationRegistries = ArrayList<IRegistrable>()
    protected val postInitRegistries = ArrayList<IRegistrable>()

    val tiles = ArrayList<Tile>()

    init {
    }

    fun register(registrable: IRegistrable) {
        this.preInitRegistries.add(registrable)
    }

    fun registerAll(arrayOfRegistrable: Array<IRegistrable>) {
        for(tile in arrayOfRegistrable) {
            this.tiles.add(tile as Tile)
        }
    }

    fun getRegistries(): ArrayList<IRegistrable> {
        return preInitRegistries
    }
}