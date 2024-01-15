package com.wellnessmeandro.app.modules.sleeptracker.`data`.model

import com.wellnessmeandro.app.R
import com.wellnessmeandro.app.appcomponents.di.MyApp
import kotlin.String

data class SleepTrackerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSleepTracker: String? = MyApp.getInstance().resources.getString(R.string.lbl_sleep_tracker)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSun: String? = MyApp.getInstance().resources.getString(R.string.lbl_sun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMon: String? = MyApp.getInstance().resources.getString(R.string.lbl_mon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTue: String? = MyApp.getInstance().resources.getString(R.string.lbl_tue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWed: String? = MyApp.getInstance().resources.getString(R.string.lbl_wed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThu: String? = MyApp.getInstance().resources.getString(R.string.lbl_thu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFri: String? = MyApp.getInstance().resources.getString(R.string.lbl_fri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSat: String? = MyApp.getInstance().resources.getString(R.string.lbl_sat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt10h: String? = MyApp.getInstance().resources.getString(R.string.lbl_10h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt8h: String? = MyApp.getInstance().resources.getString(R.string.lbl_8h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt6h: String? = MyApp.getInstance().resources.getString(R.string.lbl_6h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt4h: String? = MyApp.getInstance().resources.getString(R.string.lbl_4h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt2h: String? = MyApp.getInstance().resources.getString(R.string.lbl_2h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0h: String? = MyApp.getInstance().resources.getString(R.string.lbl_0h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt43increase: String? = MyApp.getInstance().resources.getString(R.string.lbl_43_increase)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLastNightSlee: String? =
      MyApp.getInstance().resources.getString(R.string.msg_last_night_slee)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_8h_20m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDailySleepSch: String? =
      MyApp.getInstance().resources.getString(R.string.msg_daily_sleep_sch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTodaySchedule: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_today_schedule)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_bedtime_09_00p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_in_6hours_22min)

)
