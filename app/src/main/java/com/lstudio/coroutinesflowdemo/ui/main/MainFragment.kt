package com.lstudio.coroutinesflowdemo.ui.main

import androidx.fragment.app.Fragment
import com.lstudio.coroutinesflowdemo.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : Fragment(R.layout.main_fragment) {

  private val viewModel: MainViewModel by viewModel()

  companion object {
    fun newInstance() = MainFragment()
  }
}