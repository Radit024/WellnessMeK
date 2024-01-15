package com.wellnessmeandro.app.modules.otp.`data`.model

import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.di.MyApp
import kotlin.String

data class OtpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignInTofreu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_your_accou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterthecode: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_the_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_confirm)

)
