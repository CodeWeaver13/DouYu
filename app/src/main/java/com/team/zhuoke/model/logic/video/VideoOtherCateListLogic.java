package com.team.zhuoke.model.logic.video;

import android.content.Context;

import com.team.zhuoke.api.video.VideoApi;
import com.team.zhuoke.model.ParamsMapUtils;
import com.team.zhuoke.model.logic.video.bean.VideoReClassify;
import com.team.zhuoke.net.http.HttpUtils;
import com.team.zhuoke.net.transformer.DefaultTransformer;
import com.team.zhuoke.presenter.video.interfaces.VideoOtherCateContract;

import java.util.List;

import rx.Observable;

/**
 * Created by Administrator on 2017/2/9 0009.
 */

public class VideoOtherCateListLogic implements VideoOtherCateContract.Model{
    @Override
    public Observable<List<VideoReClassify>> getModelVideoAllCate(Context context ,String  cid) {

        return HttpUtils.getInstance(context)
                .getRetofitClinet()
                .setBaseUrl(" http://apiv2.douyucdn.cn")
                .builder(VideoApi.class)
                .getVideoReCateList(ParamsMapUtils.getVideoOtherTwoColumn(cid))

//               进行预处理
                .compose(new DefaultTransformer<List<VideoReClassify>>());
    }
}
