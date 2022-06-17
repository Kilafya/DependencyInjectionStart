package com.example.dependencyinjectionstart.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kilafyan.dependencyinjectionstart.R
import com.kilafyan.dependencyinjectionstart.example2.ExampleApp
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val component by lazy {
        (application as ExampleApp).component
    }

    @Inject
    lateinit var viewModel: ExampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}