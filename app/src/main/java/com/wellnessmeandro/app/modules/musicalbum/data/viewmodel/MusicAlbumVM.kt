package com.wellnessmeandro.app.modules.musicalbum.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wellnessmeandro.app.modules.musicalbum.`data`.model.MusicAlbumModel
import com.wellnessmeandro.app.modules.musicalbum.`data`.model.SoundsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MusicAlbumVM : ViewModel(), KoinComponent {
  val musicAlbumModel: MutableLiveData<MusicAlbumModel> = MutableLiveData(MusicAlbumModel())

  var navArguments: Bundle? = null

  val soundsList: MutableLiveData<MutableList<SoundsRowModel>> = MutableLiveData(mutableListOf())
}
