package net.deadbyte.widgris.engine

import java.awt.image.BufferedImage
import javax.imageio.ImageIO

object EngineUtils {
    fun load(resourceLocation: String): BufferedImage {
        return ImageIO.read({}.javaClass.getResource(resourceLocation))
    }
}