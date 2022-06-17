package com.example.dependencyinjectionstart.example2.data.database

import android.content.Context
import android.util.Log
import com.kilafyan.dependencyinjectionstart.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val currentTime: Long
    ) {

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase ${context.getString(R.string.app_name)} $currentTime")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
