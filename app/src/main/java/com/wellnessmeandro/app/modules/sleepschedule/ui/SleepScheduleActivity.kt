package com.wellnessmeandro.app.modules.sleepschedule.ui

import androidx.activity.viewModels
import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.base.BaseActivity
import com.wellnessmeandro.app.databinding.ActivitySleepScheduleBinding
import com.wellnessmeandro.app.modules.sleepschedule.`data`.viewmodel.SleepScheduleVM
import kotlin.String
import kotlin.Unit

class SleepScheduleActivity :
    BaseActivity<ActivitySleepScheduleBinding>(R.layout.activity_sleep_schedule) {
  private val viewModel: SleepScheduleVM by viewModels<SleepScheduleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sleepScheduleVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SLEEP_SCHEDULE_ACTIVITY"

  }
}
