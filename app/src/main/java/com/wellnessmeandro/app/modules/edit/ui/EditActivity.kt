package com.wellnessmeandro.app.modules.edit.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.base.BaseActivity
import com.wellnessmeandro.app.databinding.ActivityEditBinding
import com.wellnessmeandro.app.modules.edit.`data`.viewmodel.EditVM
import kotlin.String
import kotlin.Unit

class EditActivity : BaseActivity<ActivityEditBinding>(R.layout.activity_edit) {
  private val viewModel: EditVM by viewModels<EditVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "EDIT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
