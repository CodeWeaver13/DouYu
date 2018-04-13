package com.team.zhuoke.presenter.home.interfaces;

import android.content.Context;

import com.team.zhuoke.base.BaseModel;
import com.team.zhuoke.base.BasePresenter;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.home.bean.HomeCarousel;
import com.team.zhuoke.model.logic.home.bean.HomeColumnMoreTwoCate;

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
public interface HomeColumnMoreListContract {
    interface View extends BaseView {
        void getViewHomeColumnMoreTwoCate(List<HomeColumnMoreTwoCate> mHomeColumnMoreTwoCate);

    }
    interface  Model extends BaseModel {

        Observable<List<HomeColumnMoreTwoCate>> getModelHomeColumnMoreTwoCate(Context context,String cate_id);
    }
    abstract class Presenter extends BasePresenter<View,Model> {
        /**
         *  获取栏目 更多 二级分类
         */
      public abstract void getPresenterHomeColumnMoreTwoCate(String cate_id);
    }
}
