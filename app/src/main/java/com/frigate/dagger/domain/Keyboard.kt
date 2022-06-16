package com.frigate.dagger.domain

import javax.inject.Inject

class Keyboard @Inject constructor() {
    fun click (){
        println("taptap")
    }
}