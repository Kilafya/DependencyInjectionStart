package com.kilafyan.dependencyinjectionstart.example

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideMonitor(): Monitor = Monitor()

    @Provides
    fun provideKeyboard(): Keyboard = Keyboard()

    @Provides
    fun provideMouse(): Mouse = Mouse()

    @Provides
    fun provideMemory(): Memory = Memory()

    @Provides
    fun provideProcessor(): Processor = Processor()

    @Provides
    fun provideStorage(): Storage = Storage()

    @Provides
    fun provideComputerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ): ComputerTower = ComputerTower(storage, memory, processor)

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse
    ): Computer = Computer(monitor, computerTower, keyboard, mouse)
}