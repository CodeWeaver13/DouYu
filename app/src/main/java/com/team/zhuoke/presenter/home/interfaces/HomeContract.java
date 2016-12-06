package com.team.zhuoke.presenter.home.interfaces;


import com.team.zhuoke.base.BaseModel;
import com.team.zhuoke.base.CommonPresenter;
import com.team.zhuoke.base.CommonView;
import com.team.zhuoke.model.annotation.Implement;
import com.team.zhuoke.model.logic.home.HomeModelLogic;
import com.team.zhuoke.presenter.home.impl.HomePresenterImp;

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

      interface View extends CommonView {

      }

      @Implement(HomePresenterImp.class)
      interface Presenter extends CommonPresenter {
          /**
           *  提示消息
           */
          void message(String msg);
          void columnDetail();
      }

    @Implement(HomeModelLogic.class)
     interface  Model extends BaseModel{

     }







}
