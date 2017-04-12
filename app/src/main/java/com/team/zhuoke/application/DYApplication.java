package com.team.zhuoke.application;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.team.zhuoke.api.NetWorkApi;
import com.team.zhuoke.net.config.NetWorkConfiguration;
import com.team.zhuoke.net.http.HttpUtils;
import com.team.zhuoke.ui.pagestatemanager.PageManager;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsListener;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * Author： yolanda
 * <p>
 * CreateTime： 2016/12/7 0007 下午 2:11
 * <p>
 * description：
 */


public class DYApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        String packageName = context.getPackageName();
       String processName= getProcessName(Process.myPid());
        CrashReport.UserStrategy strategy=new CrashReport.UserStrategy(context);
        strategy.setUploadProcess(processName==null||processName.equals(packageName));
        CrashReport.initCrashReport(context,"83ba79924d",false);
        Fresco.initialize(context);
        //搜集本地tbs内核信息并上报服务器，服务器返回结果决定使用哪个内核。
        //TbsDownloader.needDownload(getApplicationContext(), false);

        QbSdk.PreInitCallback cb = new QbSdk.PreInitCallback() {

            @Override
            public void onViewInitFinished(boolean arg0) {
                // TODO Auto-generated method stub
                Log.e("app", " onViewInitFinished is " + arg0);
            }

            @Override
            public void onCoreInitFinished() {
                // TODO Auto-generated method stub

            }
        };
        QbSdk.setTbsListener(new TbsListener() {
            @Override
            public void onDownloadFinish(int i) {
                Log.d("app","onDownloadFinish is " + i);
            }

            @Override
            public void onInstallFinish(int i) {
                Log.d("app","onInstallFinish is " + i);
            }

            @Override
            public void onDownloadProgress(int i) {
                Log.d("app","onDownloadProgress:"+i);
            }
        });

        QbSdk.initX5Environment(getApplicationContext(),  cb);
        initOkHttpUtils();
        PageManager.initInApp(context);

    }

    private static String getProcessName(int pid) {
        BufferedReader reader=null;
        try {
            reader= new BufferedReader(new FileReader("/proc/"+pid+"/cmdline"));
            String processName = reader.readLine();
            if(!TextUtils.isEmpty(processName)) {
                processName=processName.trim();
            }
            return processName;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader!=null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    private void initOkHttpUtils() {
        /**
         *  网络配置
         */
        NetWorkConfiguration configuration = new NetWorkConfiguration(this)
                .baseUrl(NetWorkApi.baseUrl)
                .isCache(true)
                .isDiskCache(true)
                .isMemoryCache(true);
        HttpUtils.setConFiguration(configuration);

    }

    public static Context getContext() {
        return context;
    }
}
