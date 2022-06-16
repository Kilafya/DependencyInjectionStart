package com.kilafyan.dependencyinjectionstart.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kilafyan.dependencyinjectionstart.R
import com.kilafyan.dependencyinjectionstart.example.Activity
import com.kilafyan.dependencyinjectionstart.example.DaggerNewComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activity = Activity()
        activity.keyboard.toString()
        activity.keyboard1.toString()
        activity.mouse.toString()
        activity.mouse1.toString()
        activity.monitor.toString()
        activity.monitor1.toString()
    }
}