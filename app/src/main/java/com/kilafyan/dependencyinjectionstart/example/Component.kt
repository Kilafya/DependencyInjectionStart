package com.kilafyan.dependencyinjectionstart.example

class Component {

    fun getComputer() = Computer(
        Monitor(),
        ComputerTower(Storage(), Memory(), Processor()),
        Keyboard(),
        Mouse()
    )

    fun inject(activity: Activity) {
        activity.keyboard = Keyboard()
    }
}