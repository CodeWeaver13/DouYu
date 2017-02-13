package com.team.zhuoke.presenter.video.interfaces;


import android.content.Context;

import com.team.zhuoke.base.BaseModel;
import com.team.zhuoke.base.BasePresenter;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.video.bean.VideoOtherColumnList;

import java.util.List;

import rx.Observable;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：   视频分类
 *  备注消息：
 *  修改时间：2016/11/14 下午3:29
 **/
public interface VideoOtherTwoColumnContract {
      interface View extends BaseView {
            void getViewVideoOtherColumnListLoadMore(List<VideoOtherColumnList> mVideoOtherColumnList);
            void getViewOtherTwoColumn(List<VideoOtherColumnList> mVideoReClassify);
      }
      interface Model extends BaseModel {
            Observable<List<VideoOtherColumnList>> getModelVideoOtherTwoColumn(Context context, String  cid1, String cid2, int offset, int limit, String action );
      }
      abstract class Presenter extends BasePresenter<View,Model> {
//  http://apiv2.douyucdn.cn/video/Videoroomlist/getRecVideoList?cid1=1&cid2=5&offset=0&limit=20&action=hot&client_sys=android
            public  abstract void getPresenterVideoOtherTwoColumn(String  cid1,String cid2,int offset,int limit,String action );
            //          刷新数据
            public abstract void getPresenterLiveOtherColumnList(String  cid1,String cid2,int offset,int limit,String action  );
            //          加载更多
            public abstract  void  getPresenterLiveOtherColumnListLoadMore(String  cid1,String cid2,int offset,int limit,String action );
      }

}
