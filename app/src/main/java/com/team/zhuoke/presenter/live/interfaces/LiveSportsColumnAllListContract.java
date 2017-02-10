package com.team.zhuoke.presenter.live.interfaces;


import android.content.Context;

import com.team.zhuoke.base.BaseModel;
import com.team.zhuoke.base.BasePresenter;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.live.bean.LiveAllList;
import com.team.zhuoke.model.logic.live.bean.LiveSportsAllList;

import java.util.List;

import rx.Observable;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2017/2/7 下午5:27
 **/
public interface LiveSportsColumnAllListContract {
      interface View extends BaseView {
          void getViewLiveSportsColumnAllListColumn(List<LiveSportsAllList> mLiveAllList);
          void getViewLiveSportsColumnAllListLoadMore(List<LiveSportsAllList> mLiveAllList);
      }
      interface Model extends BaseModel {
            Observable<List<LiveSportsAllList>> getModelLiveSportsColumnAllList(Context context, int offset, int limit);
      }
      abstract class Presenter extends BasePresenter<View,Model> {
          //          刷新数据
          public abstract void getPresenterLiveSportsColumnAllList(int offset,int limit );
          //          加载更多
          public abstract  void  getPresenterLiveSportsColumnAllListLoadMore(int offset,int limit);

      }

}
