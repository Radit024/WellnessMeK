package com.wellnessmeandro.app.modules.edit.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wellnessmeandro.app.modules.edit.`data`.model.EditModel
import org.koin.core.KoinComponent

class EditVM : ViewModel(), KoinComponent {
  val editModel: MutableLiveData<EditModel> = MutableLiveData(EditModel())

  var navArguments: Bundle? = null
}
