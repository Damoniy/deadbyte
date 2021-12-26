package net.deadbyte.widgris.screen.awt

import net.deadbyte.widgris.engine.drawable.GameComponent
import java.awt.*
import java.awt.image.BufferedImage

abstract class KCanvas(): Canvas() {
    private val layer = BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB)
    private var g = layer.graphics

    fun checkBuffers() {
        if (bufferStrategy == null) {
            this.createBufferStrategy(3)
            return
        }
    }

    fun clear() {
        this.g = layer.graphics
        this.g.color = Color.BLACK
        this.g.fillRect(0, 0, this.width, this.height)
    }

    fun dispose() {
        this.g.dispose()
        this.g = bufferStrategy.drawGraphics
        this.g.drawImage(layer, 0, 0, this.width, this.height, null)
    }

    fun showBuffers() {
        bufferStrategy.show()
    }

    fun drawComponent(component: GameComponent) {
        component.draw(g)
    }

    fun drawComponentArray(array: Array<GameComponent?>) {
        for(x in 0 until 64) {
            for(y in 0 until 64) {
                this.drawComponent(array[x + (y * 64)]!!)
            }
        }
    }

    fun drawString(text: String, color: Color, font: String, x: Int, y: Int, size: Int, bold: Boolean) {
        this.g.font = Font(font, if(bold) Font.BOLD else Font.PLAIN, size)
        this.g.color = color
        this.g.drawString(text, x, y)
    }
}