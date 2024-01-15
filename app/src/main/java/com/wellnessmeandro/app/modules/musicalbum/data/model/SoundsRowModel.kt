package com.wellnessmeandro.app.modules.musicalbum.`data`.model

import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.di.MyApp
import kotlin.String

data class SoundsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPaintingForest: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_painting_forest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_min)

)
