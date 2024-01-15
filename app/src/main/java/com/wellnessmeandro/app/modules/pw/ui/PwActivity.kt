package com.wellnessmeandro.app.modules.pw.ui

import androidx.activity.viewModels
import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.base.BaseActivity
import com.wellnessmeandro.app.databinding.ActivityPwBinding
import com.wellnessmeandro.app.modules.pw.`data`.viewmodel.PwVM
import kotlin.String
import kotlin.Unit

class PwActivity : BaseActivity<ActivityPwBinding>(R.layout.activity_pw) {
  private val viewModel: PwVM by viewModels<PwVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pwVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PW_ACTIVITY"

  }
}
