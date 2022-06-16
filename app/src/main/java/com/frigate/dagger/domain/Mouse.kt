package com.frigate.dagger.domain

import javax.inject.Inject

class Mouse @Inject constructor() {
    fun click() {
        println("click")
    }
}