package com.frigate.dagger.domain


import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {
    fun inject(activity: Activity)
}