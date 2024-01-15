package com.wellnessmeandro.app.modules.sleeptracker.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wellnessmeandro.app.modules.sleeptracker.`data`.model.SleepTrackerModel
import org.koin.core.KoinComponent

class SleepTrackerVM : ViewModel(), KoinComponent {
  val sleepTrackerModel: MutableLiveData<SleepTrackerModel> = MutableLiveData(SleepTrackerModel())

  var navArguments: Bundle? = null
}
