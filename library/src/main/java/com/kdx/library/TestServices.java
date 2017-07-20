package com.kdx.library;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.view.KeyEvent;

import com.kdx.library.utils.LockScreenUtils;
import com.kdx.library.utils.PowerUtils2;

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

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.i("999", "  ==  TestServices  Runnable   run  ==  ");
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        PowerUtils2.sendKeyCode(KeyEvent.KEYCODE_POWER);
                    }
                }).start();
            }
        }, 5 * 1000);

//        Log.i("999", " = 输入指令 " + args[1] + " = " + keyCode + "");

    }
}
