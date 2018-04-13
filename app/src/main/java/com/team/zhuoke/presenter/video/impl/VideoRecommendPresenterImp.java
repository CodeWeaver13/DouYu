package com.team.zhuoke.presenter.video.impl;

import com.team.zhuoke.model.logic.video.bean.VideoHotAuthorColumn;
import com.team.zhuoke.model.logic.video.bean.VideoHotColumn;
import com.team.zhuoke.model.logic.video.bean.VideoRecommendHotCate;
import com.team.zhuoke.net.callback.RxSubscriber;
import com.team.zhuoke.net.exception.ResponeThrowable;
import com.team.zhuoke.presenter.video.interfaces.VideoRerecommendContract;

import java.util.List;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class VideoRecommendPresenterImp extends VideoRerecommendContract.Presenter{
    @Override
    public void getPresenterVideoHotColumn() {
        addSubscribe(mModel.getModelVideoHotColumn(mContext).subscribe(new RxSubscriber<List<VideoHotColumn>>() {
            @Override
            public void onSuccess(List<VideoHotColumn> mVideoHotColumn) {
                mView.getViewHotColumn(mVideoHotColumn);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }

    @Override
    public void getPresenterVideoHotAutherColumn(int offset, int limit) {
        addSubscribe(mModel.getModelVideoHotAuthorColumn(mContext, offset,limit).subscribe(new RxSubscriber<List<VideoHotAuthorColumn>>() {
            @Override
            public void onSuccess(List<VideoHotAuthorColumn> videoHotAuthorColumns) {
                mView.getViewHotAutherColumn(videoHotAuthorColumns);
            }

            @Override
            protected void onError(ResponeThrowable ex) {

                mView.showErrorWithStatus(ex.message);
            }

        }));

    }
    @Override
    public void getPresenterVideoHotCate() {
        addSubscribe(mModel.getModelVideoHotCate(mContext).subscribe(new RxSubscriber<List<VideoRecommendHotCate>>() {
            @Override
            public void onSuccess(List<VideoRecommendHotCate> videoRecommendHotCates) {
                mView.getViewHotCate(videoRecommendHotCates);
            }

            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));

    }
}
