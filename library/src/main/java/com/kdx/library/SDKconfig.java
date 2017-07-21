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
    public static final String[] POWER_OFF_NOW = {"reboot", "-p"};

    //    screencap -p /sdcard/screen.png
    public static final String[] SCREEN_CAP = {"screencap", "-p", "/sdcard/Download/screen.png"};


    //    screenrecord --time-limit 10 --verbose /sdcard/demo.mp4
    public static final String[] SCREEN_RECORD = {"screenrecord", "--time-limit","10","--verbose", "/sdcard/Download/screenrecord.mp4"};


//    Options:
//--size WIDTHxHEIGHT
//    Set the video size, e.g. "1280x720".  Default is the device's main
//    display resolution (if supported), 1280x720 if not.  For best results,
//    use a size supported by the AVC encoder.
//--bit-rate RATE
//    Set the video bit rate, in bits per second.  Value may be specified as
//    bits or megabits, e.g. '4000000' is equivalent to '4M'.  Default 4Mbps.
//--bugreport
//    Add additional information, such as a timestamp overlay, that is helpful
//    in videos captured to illustrate bugs.
//--time-limit TIME
//    Set the maximum recording time, in seconds.  Default / maximum is 180.
// --verbose
//    Display interesting information on stdout.
//--help
//    Show this message.
/*
    usage: screencap [-hp] [-d display-id] [FILENAME]
            -h: this message
            -p: save the file as a png.
          screencap -d: specify the display id to capture, default 0.
    If FILENAME ends with .png it will be saved as a png.
    If FILENAME is not given, the results will be printed to stdout.


    */

}
