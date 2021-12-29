package net.deadbyte.widgris.engine.drawable

import net.deadbyte.widgris.engine.resources.Sprite
import java.awt.Graphics
import java.awt.image.BufferedImage

abstract class GameComponent(): IDrawable {
    abstract val sprite: Sprite
    private val image: BufferedImage by lazy { sprite.image }
    private val tileSize = 64
    private var x = 0
    private var y = 0

    override fun draw(graphics: Graphics) {
        graphics.drawImage(image, getX(), getY(), null)
    }

    fun setPos(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    fun getX(): Int {
        return x * tileSize
    }

    fun getY(): Int {
        return y * tileSize
    }
 }