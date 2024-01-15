package com.wellnessmeandro.app.modules.musicalbum.ui

import android.view.View
import androidx.activity.viewModels
import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.base.BaseActivity
import com.wellnessmeandro.app.databinding.ActivityMusicAlbumBinding
import com.wellnessmeandro.app.modules.musicalbum.`data`.model.SoundsRowModel
import com.wellnessmeandro.app.modules.musicalbum.`data`.viewmodel.MusicAlbumVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MusicAlbumActivity : BaseActivity<ActivityMusicAlbumBinding>(R.layout.activity_music_album) {
  private val viewModel: MusicAlbumVM by viewModels<MusicAlbumVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val soundsAdapter = SoundsAdapter(viewModel.soundsList.value?:mutableListOf())
    binding.recyclerSounds.adapter = soundsAdapter
    soundsAdapter.setOnItemClickListener(
    object : SoundsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SoundsRowModel) {
        onClickRecyclerSounds(view, position, item)
      }
    }
    )
    viewModel.soundsList.observe(this) {
      soundsAdapter.updateData(it)
    }
    binding.musicAlbumVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerSounds(
    view: View,
    position: Int,
    item: SoundsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MUSIC_ALBUM_ACTIVITY"

  }
}
