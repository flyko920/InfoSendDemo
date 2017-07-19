package com.kdx.library;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.util.Calendar;

/**
 * 处理定时休眠，定时唤醒
 * Created by kdx on 2017/7/13.
 * Email:zhangpengfei@kdxfilm.com
 */

public class AlarmTask {

    public static final String ACTION_ALARM_POWER_ON = "action.alarm.power.on";
    public static final String ACTION_ALARM_POWER_OFF = "action.alarm.power.off";

    public static void 定时任务(Context mContext, TimeBean mTimeBean, String action_type) {
        AlarmManager mAlarmManager = (AlarmManager) mContext.getSystemService(Context.ALARM_SERVICE);
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, mTimeBean.getYear());
        c.set(Calendar.MONTH, mTimeBean.getMonth());
        c.set(Calendar.DAY_OF_MONTH, mTimeBean.getDay());
        c.set(Calendar.HOUR_OF_DAY, mTimeBean.getHour());
        c.set(Calendar.MINUTE, mTimeBean.getMinute());
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);

        Intent PowerOnIntent = new Intent();
        PowerOnIntent.setAction(action_type);
        PowerOnIntent.setClass(mContext, BroadcastReceiver.class);
        PendingIntent mPowerOnPendingIntent = PendingIntent.getBroadcast(mContext, 0, PowerOnIntent, PendingIntent.FLAG_ONE_SHOT | PendingIntent.FLAG_UPDATE_CURRENT);
        mAlarmManager.set(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(), mPowerOnPendingIntent);
    }
}
