package net.deadbyte.widgris.engine.terrain

import net.deadbyte.widgris.engine.EngineUtils

class Tilemap(directory: String) {
    private val blueprint = EngineUtils.load(directory)
    val pixels = IntArray(blueprint.width * blueprint.height)
    val width = blueprint.width
    val height = blueprint.height

    init {
        blueprint.getRGB(0, 0, blueprint.width, blueprint.height, pixels, 0, blueprint.width)
    }

}