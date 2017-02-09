package com.team.zhuoke.presenter.home.impl;

import com.team.zhuoke.model.logic.home.bean.HomeCateList;
import com.team.zhuoke.net.callback.RxSubscriber;
import com.team.zhuoke.net.exception.ResponeThrowable;
import com.team.zhuoke.presenter.home.interfaces.HomeCateListContract;
import com.team.zhuoke.utils.L;

import java.util.List;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/12/12 下午4:21
 **/
public class HomeCateListPresenterImp extends HomeCateListContract.Presenter {

    @Override
    public void getHomeCateList() {
             addSubscribe(mModel.getHomeCateList(mContext).subscribe(new RxSubscriber<List<HomeCateList>>() {
                 @Override
                 public void onSuccess(List<HomeCateList> homeCateListList) {
                    mView.getHomeAllList(homeCateListList);
                 }
                 @Override
                 protected void onError(ResponeThrowable ex) {
                   mView.showErrorWithStatus(ex.message);
                 }
             }));
    }
}
