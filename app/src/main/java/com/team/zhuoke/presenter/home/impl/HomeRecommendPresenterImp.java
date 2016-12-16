package com.team.zhuoke.presenter.home.impl;

import com.team.zhuoke.model.logic.home.bean.HomeCarousel;
import com.team.zhuoke.net.callback.RxSubscriber;
import com.team.zhuoke.net.exception.ResponeThrowable;
import com.team.zhuoke.presenter.home.interfaces.HomeRecommendContract;
import com.team.zhuoke.utils.L;

import java.util.List;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：    首页推荐页
 *  备注消息：
 *  修改时间：2016/12/15 下午3:51
 **/
public class HomeRecommendPresenterImp extends HomeRecommendContract.Presenter {

    @Override
    public void getPresenterCarousel() {
        addSubscribe(mModel.getModelCarousel(mContext).subscribe(new RxSubscriber<List<HomeCarousel>>() {
            @Override
            public void onSuccess(List<HomeCarousel> mHomeCarousel) {
                mView.getViewCarousel(mHomeCarousel);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                L.i(ex.message+""+ex.code+"");
            }
        }));
    }
}
