package com.kilafyan.dependencyinjectionstart.example

import javax.inject.Inject

class Activity {

    private val dagger = DaggerNewComponent.create()

    @Inject
    lateinit var keyboard: Keyboard
    @Inject
    lateinit var mouse: Mouse
    @Inject
    lateinit var monitor: Monitor

    var keyboard1 = dagger.getKeyboard()
    var mouse1 = dagger.getMouse()
    var monitor1 = dagger.getMonitor()

    init {
        dagger.inject(this)
    }
}