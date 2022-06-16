package com.frigate.dagger.domain

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var computer: Computer

    init {
        DaggerNewComponent.create().inject(this)
    }
}