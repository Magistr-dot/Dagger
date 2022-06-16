package com.frigate.dagger.domain

import javax.inject.Inject

class ComputerTower @Inject constructor(
    val storage: Storage,
    val memory: Memory,
    val processor: Processor
)
