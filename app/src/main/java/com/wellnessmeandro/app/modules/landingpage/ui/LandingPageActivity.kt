package com.wellnessmeandro.app.modules.landingpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.base.BaseActivity
import com.wellnessmeandro.app.databinding.ActivityLandingPageBinding
import com.wellnessmeandro.app.modules.landingpage.`data`.viewmodel.LandingPageVM
import kotlin.String
import kotlin.Unit

class LandingPageActivity : BaseActivity<ActivityLandingPageBinding>(R.layout.activity_landing_page)
    {
  private val viewModel: LandingPageVM by viewModels<LandingPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.landingPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LANDING_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LandingPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
