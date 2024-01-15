package com.wellnessmeandro.app.modules.addalarm.`data`.model

import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.di.MyApp
import kotlin.String

data class AddAlarmModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddAlarm: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_alarm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBedtime: String? = MyApp.getInstance().resources.getString(R.string.lbl_bedtime2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_00_pm2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHoursofsleep: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_hours_of_sleep)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_8hours_30minute)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRepeat: String? = MyApp.getInstance().resources.getString(R.string.lbl_repeat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMontoFri: String? = MyApp.getInstance().resources.getString(R.string.lbl_mon_to_fri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVibrateWhenAl: String? =
      MyApp.getInstance().resources.getString(R.string.msg_vibrate_when_al)

)
