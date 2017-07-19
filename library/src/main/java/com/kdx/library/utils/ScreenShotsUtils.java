package com.kdx.library.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;

/**
 * Created by kdx on 2017/7/18.
 * Email:zhangpengfei@kdxfilm.com
 */

public class ScreenShotsUtils {

    //这种方法状态栏是空白，显示不了状态栏的信息
    private void saveCurrentImage(Activity context) {
        //获取当前屏幕的大小
        int width = context.getWindow().getDecorView().getRootView().getWidth();
        int height = context.getWindow().getDecorView().getRootView().getHeight();
        //生成相同大小的图片
        Bitmap temBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        //找到当前页面的跟布局
        View view = context.getWindow().getDecorView().getRootView();
        //设置缓存
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        //从缓存中获取当前屏幕的图片
        temBitmap = view.getDrawingCache();

//        //输出到sd卡
//        if (FileIOUtil.getExistStorage()) {
//            FileIOUtil.GetInstance().onFolderAnalysis(FileIOUtil.GetInstance().getFilePathAndName());
//            File file = new File(FileIOUtil.GetInstance().getFilePathAndName());
//            try {
//                if (!file.exists()) {
//                    file.createNewFile();
//                }
//                FileOutputStream foStream = new FileOutputStream(file);
//                temBitmap.compress(Bitmap.CompressFormat.PNG, 100, foStream);
//                foStream.flush();
//                foStream.close();
//            } catch (Exception e) {
//                Log.i("Show", e.toString());
//            }
//        }
    }

}
