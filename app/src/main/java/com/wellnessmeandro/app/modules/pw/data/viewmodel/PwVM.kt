package com.wellnessmeandro.app.modules.pw.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wellnessmeandro.app.modules.pw.`data`.model.PwModel
import org.koin.core.KoinComponent

class PwVM : ViewModel(), KoinComponent {
  val pwModel: MutableLiveData<PwModel> = MutableLiveData(PwModel())

  var navArguments: Bundle? = null
}
