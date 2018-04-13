package com.team.zhuoke.presenter.video.impl;

import com.team.zhuoke.model.logic.video.bean.VideoReClassify;
import com.team.zhuoke.net.callback.RxSubscriber;
import com.team.zhuoke.net.exception.ResponeThrowable;
import com.team.zhuoke.presenter.video.interfaces.VideoOtherCateContract;

import java.util.List;

/**
 * Created by Administrator on 2017/2/8 0008.
 */

public class VideoOtherCatePresenterImpl extends VideoOtherCateContract.Presenter{
    @Override
    public void getPresenterVideoOtherCate(String cid) {
        addSubscribe(mModel.getModelVideoAllCate(mContext,cid).subscribe(new RxSubscriber<List<VideoReClassify>>() {
            @Override
            public void onSuccess(List<VideoReClassify> videoCateListList) {
                mView.getViewVideoOtherCate(videoCateListList);
            }
            @Override
            protected void onError(ResponeThrowable ex) {
                mView.showErrorWithStatus(ex.message);
            }
        }));
    }
}
