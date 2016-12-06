package com.team.zhuoke.view.common.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.team.zhuoke.R;
import com.team.zhuoke.utils.SharedPreferenceUtils;

public class SplashActivity extends AppCompatActivity {
    Handler handler;
    Intent intent;
    private boolean isFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        这步取值操作不能放在run中，否则会执行两次导致页面跳转出错
        isFirst = SharedPreferenceUtils.getBooleanData("isFirst", true);
//        LogUtils.e("isFirst=" + isFirst);
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
//                LogUtils.e(Thread.currentThread().getName() + "++++");
                if (isFinishing()) {
                    return;
                }
                if (isFirst) {
                    intent = new Intent(SplashActivity.this, GuideActivity.class);
                    SharedPreferenceUtils.setBooleanData("isFirst", false);

                } else {
                    intent = new Intent(SplashActivity.this, MainActivity.class);
                }
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
