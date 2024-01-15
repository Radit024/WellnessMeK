package com.wellnessmeandro.app.modules.welcomescreen.ui

import androidx.activity.viewModels
import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.base.BaseActivity
import com.wellnessmeandro.app.databinding.ActivityWelcomeScreenBinding
import com.wellnessmeandro.app.modules.signin.ui.SignInActivity
import com.wellnessmeandro.app.modules.welcomescreen.`data`.viewmodel.WelcomeScreenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WelcomeScreenActivity :
    BaseActivity<ActivityWelcomeScreenBinding>(R.layout.activity_welcome_screen) {
  private val viewModel: WelcomeScreenVM by viewModels<WelcomeScreenVM>()

  private val REQUEST_CODE_SIGN_IN_ACTIVITY: Int = 982

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.welcomeScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageImg.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SIGN_IN_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "WELCOME_SCREEN_ACTIVITY"

  }
}
