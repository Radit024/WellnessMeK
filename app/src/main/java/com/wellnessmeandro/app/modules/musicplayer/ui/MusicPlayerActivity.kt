package com.wellnessmeandro.app.modules.musicplayer.ui

import androidx.activity.viewModels
import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.base.BaseActivity
import com.wellnessmeandro.app.databinding.ActivityMusicPlayerBinding
import com.wellnessmeandro.app.modules.musicplayer.`data`.viewmodel.MusicPlayerVM
import kotlin.String
import kotlin.Unit

class MusicPlayerActivity : BaseActivity<ActivityMusicPlayerBinding>(R.layout.activity_music_player)
    {
  private val viewModel: MusicPlayerVM by viewModels<MusicPlayerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.musicPlayerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MUSIC_PLAYER_ACTIVITY"

  }
}
