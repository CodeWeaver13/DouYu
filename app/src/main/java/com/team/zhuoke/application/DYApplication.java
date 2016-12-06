package com.team.zhuoke.application;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2016/12/6 0006.
 */

public class DYApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
