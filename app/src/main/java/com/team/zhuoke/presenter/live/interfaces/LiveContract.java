package com.team.zhuoke.presenter.live.interfaces;


import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.base.CommonPresenter;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/11/14 下午3:29
 **/
public interface LiveContract {
      interface View extends BaseView {

      }
      interface Presenter extends CommonPresenter {

            /**
             *  提示消息
             */
            void message(String msg);

            void allLiveList();

      }
}
