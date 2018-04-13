package com.team.zhuoke.model.logic.common;

import android.content.Context;

import com.team.zhuoke.api.NetWorkApi;
import com.team.zhuoke.presenter.common.interfaces.CommonPcLiveVideoContract;
import com.team.zhuoke.presenter.common.interfaces.CommonPhoneLiveVideoContract;
import com.team.zhuoke.utils.MD5Util;

import okhttp3.Request;


/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：
 * 备注消息：
 * 修改时间：2017/2/10 下午7:48
 **/
public class CommonPhoneLiveVideoModelLogic implements CommonPhoneLiveVideoContract.Model {

    @Override
    public Request getModelPhoneLiveVideoInfo(Context context, String room_id) {
        /**
         * 房间加密处理
         */
        int time = (int)(System.currentTimeMillis() / 1000) ;
        String str = "lapi/live/thirdPart/getPlay/" + room_id + "?aid=pcclient&rate=0&time=" + time + "9TUk5fjjUjg9qIMH3sdnh";
        String auth = MD5Util.getToMd5Low32(str);
//        L.e("地址为:"+NetWorkApi.baseUrl + NetWorkApi.getLiveVideo + room_id+"?"+tempParams.toString());
        Request requestPost = new Request.Builder()
                .url(NetWorkApi.oldBaseUrl+ NetWorkApi.getOldLiveVideo+ room_id + "?rate=0")
                .get()
                .addHeader("aid","pcclient")
                .addHeader("auth",auth)
                .addHeader("time",time+"")
                .build();
        return requestPost;
    }
}
