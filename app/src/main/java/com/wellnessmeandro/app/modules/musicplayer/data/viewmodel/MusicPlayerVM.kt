package com.wellnessmeandro.app.modules.musicplayer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wellnessmeandro.app.modules.musicplayer.`data`.model.MusicPlayerModel
import org.koin.core.KoinComponent

class MusicPlayerVM : ViewModel(), KoinComponent {
  val musicPlayerModel: MutableLiveData<MusicPlayerModel> = MutableLiveData(MusicPlayerModel())

  var navArguments: Bundle? = null
}
