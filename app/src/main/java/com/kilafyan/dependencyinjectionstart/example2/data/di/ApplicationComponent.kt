package com.example.dependencyinjectionstart.example2.data.di

import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import com.kilafyan.dependencyinjectionstart.example2.data.di.ContextModule
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class, ContextModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}