package com.kdx.library.utils;

import android.app.Service;
import android.content.Context;
import android.os.PowerManager;
import android.util.Log;

import com.kdx.library.SDKconfig;

/**
 * 执行唤醒 休眠
 * Created by kdx on 2017/7/17.
 * Email:zhangpengfei@kdxfilm.com
 */

public class LockScreenUtils {

    /**
     * @param activity
     * @param brightOrDim       true == 亮屏； flase == 灭屏
     */
    public static void screenBrightOrDIm(Service activity,boolean brightOrDim) {
        PowerManager pm = (PowerManager) activity.getSystemService(Context.POWER_SERVICE);
        if (pm.isScreenOn()!=brightOrDim){
            CommandUtils.exe(SDKconfig.WAKE_LOCK_COMMAND);
        }
        Log.i("999", "  == 屏幕是否亮起 ==  "+pm.isScreenOn());
    }





}
