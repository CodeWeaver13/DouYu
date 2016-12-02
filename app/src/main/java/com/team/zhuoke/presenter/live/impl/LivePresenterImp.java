package com.team.zhuoke.presenter.live.impl;


import com.team.zhuoke.base.BasePresenter;
import com.team.zhuoke.presenter.live.interfaces.LiveContract;
import com.team.zhuoke.view.common.fragment.LiveFragment;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/11/14 下午3:22
 **/
public class LivePresenterImp extends BasePresenter<LiveFragment> implements LiveContract.Presenter {

    @Override
    public void message(String msg) {
        mView.showSuccessWithStatus(msg);
    }

    @Override
    public void allLiveList() {

}
}
