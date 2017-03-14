package com.team.zhuoke.model.logic.home;

import android.content.Context;

import com.team.zhuoke.api.home.HomeApi;
import com.team.zhuoke.model.ParamsMapUtils;
import com.team.zhuoke.model.logic.home.bean.HomeCateList;
import com.team.zhuoke.net.http.HttpUtils;
import com.team.zhuoke.net.transformer.DefaultTransformer;
import com.team.zhuoke.presenter.home.interfaces.HomeCateListContract;

import java.util.List;

import rx.Observable;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2017/3/14 下午3:32
 **/
public class HomeCateListModelLogic implements HomeCateListContract.Model {

    @Override
    public Observable<List<HomeCateList>> getHomeCateList(Context context) {
        return HttpUtils.getInstance(context)
                .setLoadDiskCache(true)
                .getRetofitClinet()
                .builder(HomeApi.class)
                .getHomeCateList(ParamsMapUtils.getDefaultParams())
//               进行预处理
                .compose(new DefaultTransformer<List<HomeCateList>>());
    }
}
