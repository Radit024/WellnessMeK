package com.wellnessmeandro.app.modules.profile.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.base.BaseFragment
import com.wellnessmeandro.app.databinding.FragmentProfileBinding
import com.wellnessmeandro.app.modules.edit.ui.EditActivity
import com.wellnessmeandro.app.modules.editprofile.ui.EditProfileActivity
import com.wellnessmeandro.app.modules.profile.`data`.viewmodel.ProfileVM
import com.wellnessmeandro.app.modules.signin.ui.SignInActivity
import kotlin.String
import kotlin.Unit

class ProfileFragment : BaseFragment<FragmentProfileBinding>(R.layout.fragment_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
    binding.linearPersonalData1.setOnClickListener {
      val destIntent = EditProfileActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.btnEdit.setOnClickListener {
      val destIntent = EditActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.linearSetting.setOnClickListener {
      val destIntent = SignInActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_FRAGMENT"


    fun getInstance(bundle: Bundle?): ProfileFragment {
      val fragment = ProfileFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
