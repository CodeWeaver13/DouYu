package com.team.zhuoke.model.logic.home;

import android.content.Context;

import com.team.zhuoke.api.home.HomeApi;
import com.team.zhuoke.model.ParamsMapUtils;
import com.team.zhuoke.model.logic.home.bean.HomeCarousel;
import com.team.zhuoke.model.logic.home.bean.HomeCateList;
import com.team.zhuoke.net.http.HttpUtils;
import com.team.zhuoke.net.transformer.DefaultTransformer;
import com.team.zhuoke.presenter.home.interfaces.HomeCateListContract;
import com.team.zhuoke.presenter.home.interfaces.HomeRecommendContract;

import java.util.List;

import rx.Observable;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述： 首页 推荐页 业务逻辑
 *  备注消息：
 *  修改时间：2016/12/15 下午3:52
 **/
public class HomeRecommendModelLogic implements HomeRecommendContract.Model {

    /**
     *  获取首页轮播图
     * @param context
     * @return
     */
    @Override
    public Observable<List<HomeCarousel>> getModelCarousel(Context context) {
        return  HttpUtils.getInstance(context)
                .setLoadDiskCache(false)
                .setLoadMemoryCache(false)
                .getRetofitClinet()
                .builder(HomeApi.class)
                .getCarousel(ParamsMapUtils.getHomeCarousel())
//               进行预处理
                .compose(new DefaultTransformer<List<HomeCarousel>>());
    }
}
