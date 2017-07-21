package com.kdx.library;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;

import com.kdx.library.utils.CommandUtils;
import com.kdx.library.utils.LockScreenUtils;
import com.kdx.library.utils.PowerUtils;
import com.kdx.library.utils.ScreenShotsUtils;

/**
 * Created by kdx on 2017/7/19.
 * Email:zhangpengfei@kdxfilm.com
 */

public class TestServices extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        Log.i("999", "  ==  TestServices  onBind  ==  ");
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("999", "  ==  TestServices  onCreate  ==  ");
//        LockScreenUtils.getWakeLock(this).acquire(20 * 1000);        //唤醒
//        new Handler().postDelayed(new Test1Runbler(), 5 * 1000);
        new Handler().postDelayed(new Test2Runbler(), 5 * 1000);
    }

    class Test2Runbler implements Runnable {

        @Override
        public void run() {
            CommandUtils.exe(SDKconfig.WAKE_LOCK_COMMAND);
            LockScreenUtils.screenBrightOrDIm(TestServices.this, false);
            try {
                Thread.sleep(10 * 1000);
                LockScreenUtils.screenBrightOrDIm(TestServices.this, true);
                Thread.sleep(10 * 1000);
//                PowerUtils.关机();
//                ScreenShotsUtils.screenCap();
                ScreenShotsUtils.screenRecord();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }










    class Test1Runbler implements Runnable {

        @Override
        public void run() {
            Log.i("999", "  ==  TestServices  Runnable   run  ==  ");

        }
    }


}
