package com.wellnessmeandro.app.modules.meditation.ui

import androidx.activity.viewModels
import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.base.BaseActivity
import com.wellnessmeandro.app.databinding.ActivityMeditationBinding
import com.wellnessmeandro.app.modules.meditation.`data`.viewmodel.MeditationVM
import kotlin.String
import kotlin.Unit

class MeditationActivity : BaseActivity<ActivityMeditationBinding>(R.layout.activity_meditation) {
  private val viewModel: MeditationVM by viewModels<MeditationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.meditationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MEDITATION_ACTIVITY"

  }
}
