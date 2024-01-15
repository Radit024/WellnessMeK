package com.wellnessmeandro.app.modules.pw.`data`.model

import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.di.MyApp
import kotlin.String

data class PwModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignInTofreu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_your_accou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetyournewpa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_set_your_new_pa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAddressOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_password_confir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_submit)

)
