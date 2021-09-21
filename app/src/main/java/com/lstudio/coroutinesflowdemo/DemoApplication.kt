package com.lstudio.coroutinesflowdemo

import android.app.Application
import com.lstudio.coroutinesflowdemo.di.demoComponent
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DemoApplication : Application() {
  override fun onCreate() {
    super.onCreate()
    startKoin {
      androidContext(this@DemoApplication)
      modules(demoComponent)
    }
  }
}