package com.team.zhuoke.presenter.me.interfaces;

import android.content.Context;

import com.team.zhuoke.base.BaseModel;
import com.team.zhuoke.base.BasePresenter;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.me.bean.PersonInfoBean;
import com.team.zhuoke.presenter.video.interfaces.VideoAllCateListContract;
import com.team.zhuoke.presenter.video.interfaces.VideoOtherCateContract;

import rx.Observable;

/**
 * Created by Administrator on 2017/3/17 0017.
 */

public interface MeContract {
    interface View extends BaseView{
        void getViewPersonInfo(PersonInfoBean personInfoBean);
        void showLoginPopWindow();

    }
    interface Model extends BaseModel{
        Observable<PersonInfoBean> getModelPersonInfo(Context context ,String userName, String passWord);
    }

    abstract class Presenter extends BasePresenter<View,Model>{
        public abstract  void Login();
    }
}
