package com.wellnessmeandro.app.modules.sleeptracker.ui

import androidx.activity.viewModels
import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.base.BaseActivity
import com.wellnessmeandro.app.databinding.ActivitySleepTrackerBinding
import com.wellnessmeandro.app.modules.sleeptracker.`data`.viewmodel.SleepTrackerVM
import kotlin.String
import kotlin.Unit

class SleepTrackerActivity :
    BaseActivity<ActivitySleepTrackerBinding>(R.layout.activity_sleep_tracker) {
  private val viewModel: SleepTrackerVM by viewModels<SleepTrackerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sleepTrackerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SLEEP_TRACKER_ACTIVITY"

  }
}
