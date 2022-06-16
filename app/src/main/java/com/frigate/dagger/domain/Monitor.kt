package com.frigate.dagger.domain

import dagger.Provides
import javax.inject.Inject


class Monitor {
    fun click() {
        println("blink")
    }
}