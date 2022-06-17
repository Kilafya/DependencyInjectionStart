package com.kilafyan.dependencyinjectionstart.example

import javax.inject.Inject

class ComputerTower (
    val storage: Storage,
    val memory: Memory,
    val processor: Processor
) {
}