package com.wellnessmeandro.app.modules.welcomescreen.`data`.model

import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomeScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWellNessMe: String? = MyApp.getInstance().resources.getString(R.string.lbl_wellnessme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTHESENGKUNI: String? = MyApp.getInstance().resources.getString(R.string.lbl_the_sengkuni)

)
