package com.kilafyan.dependencyinjectionstart.example

import javax.inject.Inject

class Computer (
    val monitor: Monitor,
    val computerTower: ComputerTower,
    val keyboard: Keyboard,
    val mouse: Mouse
    ) {
}