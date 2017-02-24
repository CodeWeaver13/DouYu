package com.team.zhuoke.presenter.common.impl;


import com.google.gson.Gson;
import com.team.zhuoke.model.logic.common.bean.LiveVideoInfo;
import com.team.zhuoke.presenter.common.interfaces.CommonPhoneLiveVideoContract;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2017/2/24 下午3:27
 **/
public class CommonPhoneLiveVideoPresenterImp extends CommonPhoneLiveVideoContract.Presenter {
    @Override
    public void getPresenterPhoneLiveVideoInfo(String room_id) {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build();
       client.newCall(mModel.getModelPhoneLiveVideoInfo(mContext,room_id)).enqueue(new okhttp3.Callback() {
           @Override
           public void onFailure(okhttp3.Call call, IOException e) {
             mView.showErrorWithStatus(e.getMessage());
           }
           @Override
           public void onResponse(okhttp3.Call call, okhttp3.Response response) throws IOException {
               Gson gson=new Gson();
                LiveVideoInfo mLiveVideoInfo= gson.fromJson(response.body().string(),LiveVideoInfo.class);
               mView.getViewPhoneLiveVideoInfo(mLiveVideoInfo);
           }
       });
    }
}
