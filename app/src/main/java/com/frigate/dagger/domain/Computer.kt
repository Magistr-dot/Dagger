package com.frigate.dagger.domain

import javax.inject.Inject

class Computer @Inject constructor(
    val ComputerTower: ComputerTower,
    val Monitor: Monitor,
    val keyboard: Keyboard,
    val mouse: Mouse
)