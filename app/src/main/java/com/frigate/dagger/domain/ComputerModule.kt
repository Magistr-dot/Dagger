package com.frigate.dagger.domain

import dagger.Module
import dagger.Provides


@Module
class ComputerModule(
) {
    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun provideMemory(): Memory {
        return Memory()
    }
}