package com.team.zhuoke.view.common.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.team.zhuoke.R;

import static android.provider.Telephony.Mms.Part.FILENAME;

public class SplashActivity extends AppCompatActivity {
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (isFinishing()) {
                    return;
                }
                Intent intent;
                if (getApplicationContext().getSharedPreferences(FILENAME, Context.MODE_PRIVATE).getBoolean
                        ("isFirst",true)) {
                    intent = new Intent(SplashActivity.this, GuideActivity.class);
                    SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences(FILENAME, Context.MODE_PRIVATE).edit();
                    edit.putBoolean("isFirst",false);
                    edit.commit();

                } else {
                    intent = new Intent(SplashActivity.this, MainActivity.class);
                }
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
