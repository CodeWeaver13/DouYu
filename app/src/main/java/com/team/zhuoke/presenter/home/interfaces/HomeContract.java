package com.team.zhuoke.presenter.home.interfaces;


import com.team.zhuoke.base.BaseModel;
import com.team.zhuoke.base.BasePresenter;
import com.team.zhuoke.base.BaseView;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/11/14 下午3:29
 **/

public interface HomeContract {

      interface View extends BaseView {
           void getMessge(String msg);
      }

    interface  Model extends BaseModel{

    }

      abstract class Presenter extends BasePresenter<View,Model> {
          /**
           *  提示消息
           */
          public   abstract   void message(String msg);

          public  abstract  void columnDetail();
      }


}
