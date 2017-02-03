package com.team.zhuoke.presenter.home.interfaces;


import android.content.Context;

import com.team.zhuoke.base.BaseModel;
import com.team.zhuoke.base.BasePresenter;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.home.bean.HomeFaceScoreColumn;

import java.util.List;

import rx.Observable;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：   全部颜值栏目
 *  备注消息：
 *  修改时间：2016/11/14 下午3:29
 **/
public interface HomeFaceScoreContract {
      interface View extends BaseView {
          //        颜值栏目
          void getViewFaceScoreColumn(List<HomeFaceScoreColumn> homeFaceScoreColumns);
          void getViewFaceScoreColumnLoadMore(List<HomeFaceScoreColumn> homeFaceScoreColumns);
      }
    interface  Model extends BaseModel{
        Observable<List<HomeFaceScoreColumn>> getModelFaceScoreColumn(Context context, int offset, int limit  );
    }
      abstract class Presenter extends BasePresenter<View,Model> {
//          刷新数据
          public abstract void getPresenterFaceScoreColumn(int offset,int limit );
//          加载更多
          public abstract  void  getPresenterFaceScoreLoadMore(int offset,int limit);
      }


}
