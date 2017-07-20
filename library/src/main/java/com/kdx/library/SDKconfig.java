package com.kdx.library;

import android.view.KeyEvent;

/**
 * Created by kdx on 2017/7/20.
 * Email:zhangpengfei@kdxfilm.com
 */

public class SDKconfig {

    /*以下是常用指令*/

    //    input keyevent 26         屏幕休眠  屏幕唤醒
    public static final String[] WAKE_LOCK_COMMAND = {"input", "keyevent", KeyEvent.KEYCODE_POWER + ""};

    //    sleep 10 && reboot -p     延时10S 关机
    public static final String[] ALARM_POWER_OFF_10S = {"sleep", "10", "&&", "reboot", "-p"};

    //    reboot -p                 即时关机
    public static final String[] POWER_OFF = {"reboot", "-p"};


}
