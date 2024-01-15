package com.wellnessmeandro.app.modules.meditation.`data`.model

import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.di.MyApp
import kotlin.String

data class MeditationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMeditationRe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_meditation_re2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_meditation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_guided_by_a_sho)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_45_00)

)
