package com.kdx.library;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;

import com.kdx.library.utils.LockScreenUtils;

/**
 * Created by kdx on 2017/7/19.
 * Email:zhangpengfei@kdxfilm.com
*/

public class TestServices extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        Log.i("999","  ==  TestServices  onBind  ==  ");
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("999","  ==  TestServices  onCreate  ==  ");
        LockScreenUtils.getWakeLock(this).acquire(20 * 1000);        //唤醒
//        LockScreenUtils.getWakeLock(this).acquire();        //唤醒
////        acquireWakeLock();
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                LockScreenUtils.getWakeLock(TestServices.this).setReferenceCounted(false);
//                LockScreenUtils.getWakeLock(TestServices.this).release();
//                Log.i("999","  ==  TestServices  release  ==  ");
////                releaseWakeLock();
//            }
//        },5 * 1000);

    }
}
