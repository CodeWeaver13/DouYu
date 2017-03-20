package com.team.zhuoke.presenter.video.impl;


import com.team.zhuoke.model.logic.video.bean.VideoOtherColumnList;
import com.team.zhuoke.model.logic.video.bean.VideoReClassify;
import com.team.zhuoke.net.callback.RxSubscriber;
import com.team.zhuoke.net.exception.ResponeThrowable;
import com.team.zhuoke.presenter.video.interfaces.VideoOtherTwoColumnContract;

import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/11/14 下午3:22
 **/
public class VideoOtherTwoColumnPresenterImp extends VideoOtherTwoColumnContract.Presenter {

//    @Override
//    public void getPresenterLiveOtherTwoColumn(String mCloumnName) {
//        addSubscribe(mModel.getModelLiveOtherTwoColumn(mContext,mCloumnName).subscribe(new RxSubscriber<List<LiveOtherTwoColumn>>() {
//            @Override
//            public void onSuccess(List<LiveOtherTwoColumn> mLiveOtherTwoColumns) {
//                mView.getViewLiveOtherTwoColumn(mLiveOtherTwoColumns);
//            }
//            @Override
//            protected void onError(ResponeThrowable ex) {
//                mView.showErrorWithStatus(ex.message);
//            }
//        }));
//    }

    @Override
    public void getPresenterVideoOtherTwoColumn(String  cid1,String cid2,int offset,int limit,String action ) {
        addSubscribe(mModel.getModelVideoOtherTwoColumn(mContext,cid1,cid2,offset,limit,action).subscribe(new RxSubscriber<List<VideoOtherColumnList>>() {
            @Override
            public void onSuccess(List<VideoOtherColumnList> videoReClassifies) {
                mView.getViewOtherTwoColumn(videoReClassifies);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }

    @Override
    public void getPresenterLiveOtherColumnList(String cid1, String cid2, int offset, int limit, String action) {
        addSubscribe(mModel.getModelVideoOtherTwoColumn(mContext,cid1,cid2,offset,limit,action).subscribe(new RxSubscriber<List<VideoOtherColumnList>>() {
            @Override
            public void onSuccess(List<VideoOtherColumnList> videoReClassifies) {
                mView.getViewOtherTwoColumn(videoReClassifies);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }

    @Override
    public void getPresenterLiveOtherColumnListLoadMore(String cid1, String cid2, int offset, int limit, String action) {
        addSubscribe(mModel.getModelVideoOtherTwoColumn(mContext,cid1,cid2,offset,limit,action).subscribe(new RxSubscriber<List<VideoOtherColumnList>>() {
            @Override
            public void onSuccess(List<VideoOtherColumnList> videoReClassifies) {
                mView.getViewVideoOtherColumnListLoadMore(videoReClassifies);
            }

            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
}
