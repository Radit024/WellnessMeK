package com.wellnessmeandro.app.modules.dashboard.`data`.model

import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUser: String? = MyApp.getInstance().resources.getString(R.string.lbl_user)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_meditation_re)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActivityStatus: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_activity_status)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAveragesleept: String? =
      MyApp.getInstance().resources.getString(R.string.msg_average_sleep_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_6_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHoursperday: String? = MyApp.getInstance().resources.getString(R.string.lbl_hours_per_day)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSleep: String? = MyApp.getInstance().resources.getString(R.string.lbl_sleep_tracker)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_8h_20m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBMIBodyMass: String? = MyApp.getInstance().resources.getString(R.string.lbl_consultation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouhaveanorm: String? =
      MyApp.getInstance().resources.getString(R.string.msg_come_consult_wi)

)
