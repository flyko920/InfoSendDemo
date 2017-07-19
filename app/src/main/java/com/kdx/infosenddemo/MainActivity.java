package com.kdx.infosenddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.kdx.library.TestServices;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        LockScreenUtils.getWakeLock(this).acquire();        //唤醒
        Log.i("999","  ==  onCreate  ==  ");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("999","  ==  onResume  ==  ");
        startService(new Intent(MainActivity.this,TestServices.class));
    }


    @Override
    protected void onPause() {
        super.onPause();
//        LockScreenUtils.getWakeLock(this).release();        //休眠
        Log.i("999","  ==  onPause  ==  ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("999","  ==  onStart  ==  ");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i("999","  ==  onStop  ==  ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("999","  ==  onDestroy  ==  ");
    }
}
