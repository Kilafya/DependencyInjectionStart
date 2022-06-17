package com.kilafyan.dependencyinjectionstart.example

import javax.inject.Inject

class Activity {

    private val component = DaggerNewComponent.create()

    @Inject
    lateinit var computer: Computer

    init {
        component.inject(this)
    }
}