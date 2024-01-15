package com.wellnessmeandro.app.modules.dashboard.ui

import androidx.fragment.app.viewModels
import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.base.BaseFragment
import com.wellnessmeandro.app.databinding.FragmentDashboardBinding
import com.wellnessmeandro.app.extensions.loadFragment
import com.wellnessmeandro.app.modules.dashboard.`data`.viewmodel.DashboardVM
import com.wellnessmeandro.app.modules.meditationhome.ui.MeditationHomeActivity
import com.wellnessmeandro.app.modules.profile.ui.ProfileFragment
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DashboardFragment : BaseFragment<FragmentDashboardBinding>(R.layout.fragment_dashboard) {
  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  private val REQUEST_CODE_PROFILE_FRAGMENT: Int = 107

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.dashboardVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imagePlay.setOnClickListener {
      val destFragment = ProfileFragment.getInstance(null)
      requireActivity().loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = ProfileFragment.TAG, 
          addToBackStack = true, 
          add = true, 
          enter = null, 
          exit = null, 
          )
      requireActivity().onBackPressed()
    }
    binding.btnViewMore.setOnClickListener {
      val destIntent = MeditationHomeActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "DASHBOARD_FRAGMENT"

  }
}
