package com.team.zhuoke.presenter.live.impl;

import com.team.zhuoke.model.logic.live.bean.LiveOtherList;
import com.team.zhuoke.net.callback.RxSubscriber;
import com.team.zhuoke.net.exception.ResponeThrowable;
import com.team.zhuoke.presenter.live.interfaces.LiveOtherColumnListContract;

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
public class LiveOtherColumnListPresenterImp extends LiveOtherColumnListContract.Presenter {
//     刷新数据
    @Override
    public void getPresenterLiveOtherColumnList(String cate_id,int offset, int limit) {
        addSubscribe(mModel.getModelLiveOtherColumnList(mContext,cate_id,offset,limit).subscribe(new RxSubscriber<List<LiveOtherList>>() {
            @Override
            public void onSuccess(List<LiveOtherList> mLiveAllList) {
                mView.getViewLiveOtherColumnList(mLiveAllList);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
//加载更多
    @Override
    public void getPresenterLiveOtherColumnListLoadMore(String cate_id,int offset, int limit) {
        addSubscribe(mModel.getModelLiveOtherColumnList(mContext,cate_id,offset,limit).subscribe(new RxSubscriber<List<LiveOtherList>>() {
            @Override
            public void onSuccess(List<LiveOtherList> mLiveAllList) {
                mView.getViewLiveOtherColumnListLoadMore(mLiveAllList);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
    /**
     *  颜值 列表
     */

    @Override
    public void getPresenterLiveFaceScoreColumnList(String cate_id, int offset, int limit) {
        addSubscribe(mModel.getModelLiveOtherColumnList(mContext,cate_id,offset,limit).subscribe(new RxSubscriber<List<LiveOtherList>>() {
            @Override
            public void onSuccess(List<LiveOtherList> mLiveAllList) {
                mView.getViewLiveFaceScoreColumnList(mLiveAllList);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }

    @Override
    public void getPresenterLiveFaceScoreColumnListLoadMore(String cate_id, int offset, int limit) {
        addSubscribe(mModel.getModelLiveOtherColumnList(mContext,cate_id,offset,limit).subscribe(new RxSubscriber<List<LiveOtherList>>() {
            @Override
            public void onSuccess(List<LiveOtherList> mLiveAllList) {
                mView.getViewLiveFaceScoreColumnListLoadMore(mLiveAllList);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }



}
