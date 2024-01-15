package com.wellnessmeandro.app.modules.meditationhome.`data`.model

import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.di.MyApp
import kotlin.String

data class MeditationHomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMeditationRe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_meditation_re2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsMeditatio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_meditatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCalmyourmind: String? =
      MyApp.getInstance().resources.getString(R.string.msg_calm_your_mind)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRelaxSound: String? = MyApp.getInstance().resources.getString(R.string.lbl_relax_sound)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCalmyourmindOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_calm_your_mind2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeditation: String? = MyApp.getInstance().resources.getString(R.string.lbl_meditation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeditationOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_meditation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTechniquesBen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_techniques_ben)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWatchNow: String? = MyApp.getInstance().resources.getString(R.string.lbl_watch_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageOneValue: String? = null
)
