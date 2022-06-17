package com.kilafyan.dependencyinjectionstart.example

import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {
    fun inject(activity: Activity)
}