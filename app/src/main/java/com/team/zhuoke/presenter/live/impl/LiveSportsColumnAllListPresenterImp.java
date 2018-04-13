package com.team.zhuoke.presenter.live.impl;

import com.team.zhuoke.model.logic.live.bean.LiveAllList;
import com.team.zhuoke.model.logic.live.bean.LiveSportsAllList;
import com.team.zhuoke.net.callback.RxSubscriber;
import com.team.zhuoke.net.exception.ResponeThrowable;
import com.team.zhuoke.presenter.live.interfaces.LiveAllListContract;
import com.team.zhuoke.presenter.live.interfaces.LiveSportsColumnAllListContract;

import java.util.List;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2017/2/7 下午5:33
 **/
public class LiveSportsColumnAllListPresenterImp extends LiveSportsColumnAllListContract.Presenter {
//     刷新数据
    @Override
    public void getPresenterLiveSportsColumnAllList(int offset, int limit) {
        addSubscribe(mModel.getModelLiveSportsColumnAllList(mContext,offset,limit).subscribe(new RxSubscriber<List<LiveSportsAllList>>() {
            @Override
            public void onSuccess(List<LiveSportsAllList> mLiveAllList) {
                mView.getViewLiveSportsColumnAllListColumn(mLiveAllList);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
//加载更多
    @Override
    public void getPresenterLiveSportsColumnAllListLoadMore(int offset, int limit) {
        addSubscribe(mModel.getModelLiveSportsColumnAllList(mContext,offset,limit).subscribe(new RxSubscriber<List<LiveSportsAllList>>() {
            @Override
            public void onSuccess(List<LiveSportsAllList> mLiveAllList) {
                mView.getViewLiveSportsColumnAllListLoadMore(mLiveAllList);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
}
