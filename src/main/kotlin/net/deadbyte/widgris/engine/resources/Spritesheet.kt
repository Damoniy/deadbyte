package net.deadbyte.widgris.engine.resources

import net.deadbyte.widgris.engine.EngineUtils

class Spritesheet(private val resource: String) {
    private val spritesheet = HashMap<Int, Sprite>()

    init {
        this.extract()
    }

    private fun extract() {
        var id = 0
        val resource = EngineUtils.load(resource)
        for(x in 0 until resource.width step 64) {
            for(y in 0 until resource.height step 64) {
                spritesheet[id] = Sprite(resource.getSubimage(x, y, 64, 64))
                id++
            }
        }
    }

    fun getSprite(id: Int): Sprite {
        return this.spritesheet[id]!!
    }
}