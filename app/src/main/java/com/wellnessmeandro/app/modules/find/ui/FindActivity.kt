package com.wellnessmeandro.app.modules.find.ui

import androidx.activity.viewModels
import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.base.BaseActivity
import com.wellnessmeandro.app.databinding.ActivityFindBinding
import com.wellnessmeandro.app.modules.find.`data`.viewmodel.FindVM
import kotlin.String
import kotlin.Unit

class FindActivity : BaseActivity<ActivityFindBinding>(R.layout.activity_find) {
  private val viewModel: FindVM by viewModels<FindVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.findVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FIND_ACTIVITY"

  }
}
