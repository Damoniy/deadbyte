package net.deadbyte.widgris.screen.swing

import net.deadbyte.widgris.Widgris
import net.deadbyte.widgris.screen.awt.KCanvas
import net.deadbyte.widgris.screen.awt.KeyboardInput
import java.awt.Dimension
import java.awt.Toolkit
import javax.swing.JFrame

class Window: KCanvas(), Runnable {
    private val title = "Legend of Widgris"
    private val thread = Thread(this)
    private val frame = JFrame()
    private val screenSize = Dimension(Toolkit.getDefaultToolkit().screenSize)
    private var isFullscreenMode = true

    var shouldClose = false

    init {
        this.preferredSize = Dimension(screenSize)
        this.frame.title = title
        this.frame.add(this)
        this.frame.isUndecorated = isFullscreenMode
        this.frame.isResizable = !isFullscreenMode
        this.frame.pack()
        this.frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        this.frame.isVisible = true
        this.addKeyListener(KeyboardInput())
        this.requestFocus()
    }

    @Synchronized
    fun start() {
        this.thread.start()
    }

    override fun run() { Widgris() }

    @Synchronized
    fun stop() {
        this.shouldClose = true
        this.thread.join()
    }
}