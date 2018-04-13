package com.team.zhuoke.presenter.home.impl;

import com.team.zhuoke.model.logic.home.bean.HomeColumnMoreAllList;
import com.team.zhuoke.model.logic.home.bean.HomeColumnMoreTwoCate;
import com.team.zhuoke.net.callback.RxSubscriber;
import com.team.zhuoke.net.exception.ResponeThrowable;
import com.team.zhuoke.presenter.home.interfaces.HomeColumnMoreAllListContract;
import com.team.zhuoke.presenter.home.interfaces.HomeColumnMoreListContract;

import java.util.List;

/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：
 * 备注消息：
 * 修改时间：2017/3/14 下午3:31
 **/
public class HomeColumnMoreAllListPresenterImp extends HomeColumnMoreAllListContract.Presenter {
    @Override
    public void getPresenterColumnMoreAllList(String cate_id, int offset, int limint) {
        addSubscribe(mModel.getModelHomeColumnMoreAllList(mContext, cate_id, offset, limint).subscribe(new RxSubscriber<List<HomeColumnMoreAllList>>() {
            @Override
            public void onSuccess(List<HomeColumnMoreAllList> mHomeColumnMoreAllList) {
                mView.getViewHomeColumnAllList(mHomeColumnMoreAllList);
            }

            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));

    }

    @Override
    public void getPresenterColumnMoreAllListLoadMore(String cate_id, int offset, int limit) {
        addSubscribe(mModel.getModelHomeColumnMoreAllList(mContext, cate_id, offset, limit).subscribe(new RxSubscriber<List<HomeColumnMoreAllList>>() {
            @Override
            public void onSuccess(List<HomeColumnMoreAllList> mHomeColumnMoreAllList) {
                mView.getViewHomeColumnAllListLoadMore(mHomeColumnMoreAllList);
            }

            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
}
