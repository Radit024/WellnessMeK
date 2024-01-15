package com.wellnessmeandro.app.modules.addalarm.ui

import androidx.activity.viewModels
import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.base.BaseActivity
import com.wellnessmeandro.app.databinding.ActivityAddAlarmBinding
import com.wellnessmeandro.app.modules.addalarm.`data`.viewmodel.AddAlarmVM
import kotlin.String
import kotlin.Unit

class AddAlarmActivity : BaseActivity<ActivityAddAlarmBinding>(R.layout.activity_add_alarm) {
  private val viewModel: AddAlarmVM by viewModels<AddAlarmVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addAlarmVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ADD_ALARM_ACTIVITY"

  }
}
