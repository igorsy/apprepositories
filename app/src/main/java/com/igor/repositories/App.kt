package com.igor.repositories

import android.app.Application
import com.igor.repositories.data.di.DataModule
import com.igor.repositories.domain.di.DomainModule
import com.igor.repositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}