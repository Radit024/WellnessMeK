package com.wellnessmeandro.app.modules.otp.ui

import androidx.activity.viewModels
import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.base.BaseActivity
import com.wellnessmeandro.app.databinding.ActivityOtpBinding
import com.wellnessmeandro.app.modules.otp.`data`.viewmodel.OtpVM
import kotlin.String
import kotlin.Unit

class OtpActivity : BaseActivity<ActivityOtpBinding>(R.layout.activity_otp) {
  private val viewModel: OtpVM by viewModels<OtpVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.otpVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "OTP_ACTIVITY"

  }
}
