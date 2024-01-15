package com.wellnessmeandro.app.modules.meditationhome.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.base.BaseActivity
import com.wellnessmeandro.app.databinding.ActivityMeditationHomeBinding
import com.wellnessmeandro.app.modules.meditationhome.`data`.viewmodel.MeditationHomeVM
import kotlin.String
import kotlin.Unit

class MeditationHomeActivity :
    BaseActivity<ActivityMeditationHomeBinding>(R.layout.activity_meditation_home) {
  private val viewModel: MeditationHomeVM by viewModels<MeditationHomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.meditationHomeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MEDITATION_HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MeditationHomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
