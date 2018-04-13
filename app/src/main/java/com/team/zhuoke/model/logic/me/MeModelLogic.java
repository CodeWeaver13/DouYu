package com.team.zhuoke.model.logic.me;

import android.content.Context;

import com.team.zhuoke.api.home.HomeApi;
import com.team.zhuoke.api.me.MeApi;
import com.team.zhuoke.model.ParamsMapUtils;
import com.team.zhuoke.model.logic.home.bean.HomeCarousel;
import com.team.zhuoke.model.logic.me.bean.PersonInfoBean;
import com.team.zhuoke.net.http.HttpUtils;
import com.team.zhuoke.net.transformer.DefaultTransformer;
import com.team.zhuoke.presenter.me.interfaces.MeContract;

import java.util.List;

import rx.Observable;

/**
 * Created by Administrator on 2017/3/17 0017.
 */

public class MeModelLogic implements MeContract.Model {
    @Override
    public Observable<PersonInfoBean> getModelPersonInfo(Context context, String userName, String passWord) {
        return HttpUtils.getInstance(context)
                .setLoadDiskCache(false)
                .getRetofitClinet()
                .builder(MeApi.class)
                .getPersonInfos(ParamsMapUtils.getPersonInfo(userName,passWord))
//               进行预处理
                .compose(new DefaultTransformer<PersonInfoBean>());
    }
}
