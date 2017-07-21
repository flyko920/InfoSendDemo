package com.kdx.library.utils;

import com.kdx.library.SDKconfig;

/**
 * Created by kdx on 2017/7/18.
 * Email:zhangpengfei@kdxfilm.com
 */

public class PowerUtils {

    public static void 关机(){
        CommandUtils.exe(SDKconfig.POWER_OFF_NOW);
    }

    public static void 开机(){

    }
}
