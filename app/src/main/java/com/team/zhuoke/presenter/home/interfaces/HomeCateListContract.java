package com.team.zhuoke.presenter.home.interfaces;


import android.content.Context;

import com.team.zhuoke.base.BaseModel;
import com.team.zhuoke.base.BasePresenter;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.home.bean.HomeCateList;

import java.util.List;

import rx.Observable;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/12/12 下午4:04
 **/
public interface HomeCateListContract {
    interface View extends BaseView {
       void getHomeAllList(List<HomeCateList> cateLists);
    }
    interface  Model extends BaseModel {
        Observable getHomeCateList(Context context);
    }
    abstract class Presenter extends BasePresenter<View,Model> {
        public abstract void  getHomeCateList();
    }
}
