package com.team.zhuoke.model.logic.video;

import android.content.Context;

import com.team.zhuoke.api.video.VideoApi;
import com.team.zhuoke.model.ParamsMapUtils;
import com.team.zhuoke.model.logic.video.bean.VideoHotAuthorColumn;
import com.team.zhuoke.model.logic.video.bean.VideoHotColumn;
import com.team.zhuoke.model.logic.video.bean.VideoRecommendHotCate;
import com.team.zhuoke.net.http.HttpUtils;
import com.team.zhuoke.net.transformer.DefaultTransformer;
import com.team.zhuoke.presenter.video.interfaces.VideoRerecommendContract;

import java.util.List;

import rx.Observable;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class VideoRecommendModelLogic implements VideoRerecommendContract.Model {
    @Override
    public Observable<List<VideoHotColumn>> getModelVideoHotColumn(Context context) {
        return HttpUtils.getInstance(context)
                .getRetofitClinet()
                .setBaseUrl(" http://apiv2.douyucdn.cn")
                .builder(VideoApi.class)
                .getVideoHotColumn(ParamsMapUtils.getDefaultParams())
//               进行预处理
                .compose(new DefaultTransformer<List<VideoHotColumn>>());

    }

    @Override
    public Observable<List<VideoHotAuthorColumn>> getModelVideoHotAuthorColumn(Context context, int offset, int limit) {
        return HttpUtils.getInstance(context)
                .getRetofitClinet()
                .setBaseUrl(" http://apiv2.douyucdn.cn")
                .builder(VideoApi.class)
                .getVideoHotAuther(ParamsMapUtils.getDefaultParams())
//               进行预处理
                .compose(new DefaultTransformer<List<VideoHotAuthorColumn>>());
    }

    @Override
    public Observable<List<VideoRecommendHotCate>> getModelVideoHotCate(Context context) {
        return HttpUtils.getInstance(context)
                .getRetofitClinet()
                .setBaseUrl(" http://apiv2.douyucdn.cn")
                .builder(VideoApi.class)
                .getVideoHotCate(ParamsMapUtils.getDefaultParams())
//               进行预处理
                .compose(new DefaultTransformer<List<VideoRecommendHotCate>>());
    }
}
