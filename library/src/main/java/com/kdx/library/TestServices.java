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
        new Handler().postDelayed(new Test2Runbler(), 5 * 1000);
    }

    class Test2Runbler implements Runnable {

        @Override
        public void run() {
//            CommandUtils.exe(SDKconfig.WAKE_LOCK_COMMAND);
            try {
                LockScreenUtils.screenBrightOrDIm(TestServices.this, false);    //灭屏
                Thread.sleep(10 * 1000);
                LockScreenUtils.screenBrightOrDIm(TestServices.this, true);     //亮屏
                Thread.sleep(10 * 1000);
                ScreenShotsUtils.screenCap();                                   //截图
                Thread.sleep(10 * 1000);
                ScreenShotsUtils.screenRecord();                                //录屏  10S
                Thread.sleep(10 * 1000);
                PowerUtils.关机();                                              //关机
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
