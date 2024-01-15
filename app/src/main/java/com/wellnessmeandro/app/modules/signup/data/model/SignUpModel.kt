package com.wellnessmeandro.app.modules.signup.`data`.model

import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignInTofreu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_for_fre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAddressOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAddressTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_password_confir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up2)

)
