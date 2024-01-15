package com.wellnessmeandro.app.modules.sleepschedule.`data`.model

import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.di.MyApp
import kotlin.String

data class SleepScheduleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSleepSchedule: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_sleep_schedule)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIdealHoursfor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ideal_hours_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_8hours_30minute)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourSchedule: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_schedule)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWed: String? = MyApp.getInstance().resources.getString(R.string.lbl_wed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwelve: String? = MyApp.getInstance().resources.getString(R.string.lbl_12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThus: String? = MyApp.getInstance().resources.getString(R.string.lbl_thus)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_13)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFri: String? = MyApp.getInstance().resources.getString(R.string.lbl_fri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFourteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_14)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSat: String? = MyApp.getInstance().resources.getString(R.string.lbl_sat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSun: String? = MyApp.getInstance().resources.getString(R.string.lbl_sun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSixteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_16)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_bedtime_09_00p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_in_6hours_22min)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_alarm_05_10am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_in_14hours_30mi)

)
