package com.frigate.dagger.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.frigate.dagger.R
import com.frigate.dagger.domain.Activity
import com.frigate.dagger.domain.Computer

import com.frigate.dagger.domain.Keyboard
import com.frigate.dagger.domain.Mouse
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activity = Activity()
        activity.computer.toString()
        activity.computer.Monitor.click()
        activity.computer.ComputerTower.memory.toString()
    }
}