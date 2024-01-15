package com.wellnessmeandro.app.modules.addalarm.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wellnessmeandro.app.modules.addalarm.`data`.model.AddAlarmModel
import org.koin.core.KoinComponent

class AddAlarmVM : ViewModel(), KoinComponent {
  val addAlarmModel: MutableLiveData<AddAlarmModel> = MutableLiveData(AddAlarmModel())

  var navArguments: Bundle? = null
}
