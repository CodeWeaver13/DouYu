package com.team.zhuoke.model.logic.common;

import android.content.Context;

import com.team.zhuoke.api.NetWorkApi;
import com.team.zhuoke.presenter.common.interfaces.CommonPhoneLiveVideoContract;
import com.team.zhuoke.utils.MD5Util;

import java.util.UUID;

import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.RequestBody;


/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：
 * 备注消息：
 * 修改时间：2017/2/10 下午7:48
 **/
public class CommonLiveVideoModelLogic implements CommonPhoneLiveVideoContract.Model {

    @Override
    public Request getModelPhoneLiveVideoInfo(Context context, String room_id) {
        /**
         * 房间加密处理
         */
        long time = System.currentTimeMillis() / (1000 * 60);
        String did = UUID.randomUUID().toString().toUpperCase();
        did = did.replace("-", "");
        String str = room_id + did + "A12Svb&%1UUmf@hC" + time;
        String sign = MD5Util.getToMd5Low32(str);
        RequestBody requestBodyPost = new FormBody.Builder()
                .add("cdn", "ws")
                .add("rate", "0")
                .add("tt", String.valueOf(time))
                .add("did", did)
                .add("sign", sign)
                .build();
        Request requestPost = new Request.Builder()
                .url(NetWorkApi.baseUrl + NetWorkApi.getLiveVideo + room_id)
                .post(requestBodyPost)
                .build();
        return requestPost;
    }
}
