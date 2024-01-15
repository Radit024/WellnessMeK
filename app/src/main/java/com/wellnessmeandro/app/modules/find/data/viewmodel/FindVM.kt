package com.wellnessmeandro.app.modules.find.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wellnessmeandro.app.modules.find.`data`.model.FindModel
import org.koin.core.KoinComponent

class FindVM : ViewModel(), KoinComponent {
  val findModel: MutableLiveData<FindModel> = MutableLiveData(FindModel())

  var navArguments: Bundle? = null
}
