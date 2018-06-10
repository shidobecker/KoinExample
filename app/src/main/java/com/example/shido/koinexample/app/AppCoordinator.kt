package com.example.shido.koinexample.app

import android.app.Application
import com.example.shido.koinexample.di.taskModule
import org.koin.android.ext.android.startKoin

class AppCoordinator: Application() {


    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(taskModule))
    }

}