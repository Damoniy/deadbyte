package net.deadbyte.widgris.engine.entities

import net.deadbyte.widgris.engine.drawable.GameComponent
import net.deadbyte.widgris.engine.resources.Resources
import net.deadbyte.widgris.engine.resources.Sprite

class Entity: GameComponent() {

    override val sprite: Sprite = Resources.getSprite(0)
}