package com.kdx.library;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by kdx on 2017/7/17.
 * Email:zhangpengfei@kdxfilm.com
 */

public class SDKReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        switch (intent.getAction()){
            case AlarmTask.ACTION_ALARM_POWER_ON:

                break;
            case AlarmTask.ACTION_ALARM_POWER_OFF:

                break;
        }

    }


}
