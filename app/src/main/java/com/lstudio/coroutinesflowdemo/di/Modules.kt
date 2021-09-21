package com.lstudio.coroutinesflowdemo.di

import com.lstudio.coroutinesflowdemo.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val demoComponent = listOf(demoModule())

private fun demoModule() = module {
  viewModel { MainViewModel() }
}
