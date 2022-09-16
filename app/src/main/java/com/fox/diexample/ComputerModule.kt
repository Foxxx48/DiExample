package com.fox.diexample

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }
    @Provides
    fun provideKeyboard(): Keyboard {
        return Keyboard()
    }
    @Provides
    fun provideMouse(): Mouse {
        return Mouse()
    }

    @Provides
    fun provideComputerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ): ComputerTower {
        return ComputerTower(storage, memory, processor)
    }

    @Provides
    fun provideMemory(): Memory {
        return Memory()
    }

    @Provides
    fun provideStorage(): Storage {
        return Storage()
    }

    @Provides
    fun provideProcessor(): Processor {
        return Processor()
    }

    @Provides
    fun provideComputer(
        monitor: Monitor,
        mouse: Mouse,
        keyboard: Keyboard,
        computerTower: ComputerTower
    ): Computer {
        return Computer(monitor, computerTower, keyboard, mouse )
    }

    }
