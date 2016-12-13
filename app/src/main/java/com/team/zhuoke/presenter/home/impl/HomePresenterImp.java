package com.team.zhuoke.presenter.home.impl;


import com.team.zhuoke.base.BasePresenter;
import com.team.zhuoke.model.logic.home.HomeModelLogic;
import com.team.zhuoke.presenter.home.interfaces.HomeContract;
import com.team.zhuoke.view.home.fragment.HomeFragment;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/11/14 下午3:22
 **/
public class HomePresenterImp extends HomeContract.Presenter {
    @Override
    public void message(String msg) {
          mView.getMessge(msg);
    }
    @Override
    public void columnDetail() {

    }


}
