package com.wellnessmeandro.app.modules.sleepschedule.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wellnessmeandro.app.modules.sleepschedule.`data`.model.SleepScheduleModel
import org.koin.core.KoinComponent

class SleepScheduleVM : ViewModel(), KoinComponent {
  val sleepScheduleModel: MutableLiveData<SleepScheduleModel> =
      MutableLiveData(SleepScheduleModel())

  var navArguments: Bundle? = null
}
