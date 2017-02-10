package com.team.zhuoke.presenter.live.interfaces;


import android.content.Context;

import com.team.zhuoke.base.BaseModel;
import com.team.zhuoke.base.BasePresenter;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.live.bean.LiveAllList;
import com.team.zhuoke.model.logic.live.bean.LiveOtherList;

import java.util.List;

import rx.Observable;

import static android.R.attr.offset;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2017/2/7 下午5:27
 **/
public interface LiveOtherColumnListContract {
      interface View extends BaseView {
          void getViewLiveOtherColumnList(List<LiveOtherList> mLiveAllList);
          void getViewLiveOtherColumnListLoadMore(List<LiveOtherList> mLiveAllList);

          void getViewLiveFaceScoreColumnList(List<LiveOtherList> mLiveAllList);
          void getViewLiveFaceScoreColumnListLoadMore(List<LiveOtherList> mLiveAllList);
      }
      interface Model extends BaseModel {
            Observable<List<LiveOtherList>> getModelLiveOtherColumnList(Context context,String cate_id,int offset, int limit);
      }
      abstract class Presenter extends BasePresenter<View,Model> {
          //          刷新数据
          public abstract void getPresenterLiveOtherColumnList(String cate_id,int offset,int limit );
          //          加载更多
          public abstract  void  getPresenterLiveOtherColumnListLoadMore(String cate_id,int offset,int limit);

//          颜值列表
          public abstract  void getPresenterLiveFaceScoreColumnList(String cate_id,int offset,int limit);
          public abstract  void getPresenterLiveFaceScoreColumnListLoadMore(String cate_id,int offset,int limit);

      }

}
