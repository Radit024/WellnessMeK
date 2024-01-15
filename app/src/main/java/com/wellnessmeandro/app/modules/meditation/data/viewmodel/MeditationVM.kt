package com.wellnessmeandro.app.modules.meditation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wellnessmeandro.app.modules.meditation.`data`.model.MeditationModel
import org.koin.core.KoinComponent

class MeditationVM : ViewModel(), KoinComponent {
  val meditationModel: MutableLiveData<MeditationModel> = MutableLiveData(MeditationModel())

  var navArguments: Bundle? = null
}
