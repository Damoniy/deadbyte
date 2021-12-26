package net.deadbyte.widgris.engine

import net.deadbyte.widgris.screen.swing.Window

abstract class Ticker {
    val window = Window()
    private val tickTime = 1000000000.0 / 80
    private var lastTime = System.nanoTime()
    private var unprocessed = 0.0
    private var counter = 0
    private var frames = 0
    private var updates = 0
    private var timer = getTimeMillis()
    var fps = 0
    var ups = 0

    init {
        this.preInit()
        this.tick()
    }

    abstract fun preInit()

    private fun tick(){
        while(!window.shouldClose) {
            val currentTime = getTimeNanos()

            unprocessed += (currentTime - lastTime) / tickTime

            lastTime = currentTime
            var shouldRender = true

            while(unprocessed >= 1) {
                updates++
                this.update()
                unprocessed -= 1
                shouldRender = true
            }

            if(shouldRender) {
                frames++
                this.doRender()
            }


            if (getTimeMillis() - timer > 1000) {
                this.fps = frames
                this.ups = updates
                counter++
                frames = 0
                updates = 0
                timer += 1000
            }
        }
        this.window.stop()
    }

    abstract fun render()

    abstract fun update()

    private fun doRender() {
        window.checkBuffers()
        window.clear()
        window.dispose()
        this.render()
        window.showBuffers()
    }

    private fun getTimeNanos(): Long{ return System.nanoTime() }

    private fun getTimeMillis(): Long{ return System.currentTimeMillis() }
}