package com.team.zhuoke.presenter.home.impl;

import com.team.zhuoke.model.logic.home.bean.HomeRecommendHotCate;
import com.team.zhuoke.net.callback.RxSubscriber;
import com.team.zhuoke.net.exception.ResponeThrowable;
import com.team.zhuoke.presenter.home.interfaces.HomeCateContract;

import java.util.List;

/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：
 * 备注消息：
 * 修改时间：2016/12/12 下午4:21
 **/
public class HomeCatePresenterImp extends HomeCateContract.Presenter {
    /**
     * 导航栏+栏目列表
     *
     * @param identification
     */
    @Override
    public void getHomeCate(String identification) {
        addSubscribe(mModel.getHomeCate(mContext, identification).subscribe(new RxSubscriber<List<HomeRecommendHotCate>>() {
            @Override
            public void onSuccess(List<HomeRecommendHotCate> homeCates) {
                mView.getOtherList(homeCates);
            }

            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }

    /**
     * 刷新
     * <p></p>
     * 导航栏+栏目列表
     *
     * @param identification
     */
    @Override
    public void getHomeCateRefresh(String identification) {
        addSubscribe(mModel.getHomeCate(mContext, identification).subscribe(new RxSubscriber<List<HomeRecommendHotCate>>() {
            @Override
            public void onSuccess(List<HomeRecommendHotCate> homeCates) {
                mView.getOtherListRefresh(homeCates);
            }

            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
}
