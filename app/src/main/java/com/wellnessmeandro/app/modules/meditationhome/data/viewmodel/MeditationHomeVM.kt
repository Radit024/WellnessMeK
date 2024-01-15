package com.wellnessmeandro.app.modules.meditationhome.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wellnessmeandro.app.modules.meditationhome.`data`.model.MeditationHomeModel
import org.koin.core.KoinComponent

class MeditationHomeVM : ViewModel(), KoinComponent {
  val meditationHomeModel: MutableLiveData<MeditationHomeModel> =
      MutableLiveData(MeditationHomeModel())

  var navArguments: Bundle? = null
}
