package com.wellnessmeandro.app.modules.musicalbum.`data`.model

import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.di.MyApp
import kotlin.String

data class MusicAlbumModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRelaxSound: String? = MyApp.getInstance().resources.getString(R.string.lbl_relax_sound)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_relax_sounds)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSometimesthem: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sometimes_the_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlayNow: String? = MyApp.getInstance().resources.getString(R.string.lbl_play_now)

)
