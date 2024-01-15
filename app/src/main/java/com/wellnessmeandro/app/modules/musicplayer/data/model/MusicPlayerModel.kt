package com.wellnessmeandro.app.modules.musicplayer.`data`.model

import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.di.MyApp
import kotlin.String

data class MusicPlayerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRelaxSound: String? = MyApp.getInstance().resources.getString(R.string.lbl_relax_sound)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_painting_forest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArist: String? = MyApp.getInstance().resources.getString(R.string.msg_by_painting_wi)

)
