package com.kdx.library.utils;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.os.PowerManager;

/**
 * 执行唤醒 休眠
 * Created by kdx on 2017/7/17.
 * Email:zhangpengfei@kdxfilm.com
 */

public class LockScreenUtils {

    private static PowerManager.WakeLock wl;

    /**
     * wakeLock.acquire();   唤醒屏幕
     * wakeLock.release();   休眠屏幕
     *
     * @param activity
     * @return
     */
    public static PowerManager.WakeLock getWakeLock(Service activity) {
        if (wl == null) {
            PowerManager pm = (PowerManager) activity.getSystemService(Context.POWER_SERVICE);
//            wl = pm.newWakeLock(PowerManager.SCREEN_BRIGHT_WAKE_LOCK, "TAG");
//            wl = pm.newWakeLock(PowerManager.SCREEN_DIM_WAKE_LOCK, "TAG");
//            wl = pm.newWakeLock(PowerManager.SCREEN_BRIGHT_WAKE_LOCK | PowerManager.ACQUIRE_CAUSES_WAKEUP , "TAG");
//            wl = pm.newWakeLock(PowerManager.ACQUIRE_CAUSES_WAKEUP , "TAG");
            wl = pm.newWakeLock(PowerManager.FULL_WAKE_LOCK|PowerManager.ACQUIRE_CAUSES_WAKEUP , "TAG");
//            wl.setReferenceCounted(false);
//            pm.isIgnoringBatteryOptimizations()无视电池优化
//            pm.isDeviceIdleMode()是否是设备空闲模式
//            pm.isInteractive()是否是互动的
//            pm.isPowerSaveMode()是否是省电模式
//            pm.isSustainedPerformanceModeSupported()是否支持持续性能模式
//            pm.reboot();重启
//            pm.isWakeLockLevelSupported()是否支持后锁级别
//            pm.isScreenOn();

        }
        return wl;
    }

    public static void 唤醒() {

    }

    public static void 休眠() {

    }











}
