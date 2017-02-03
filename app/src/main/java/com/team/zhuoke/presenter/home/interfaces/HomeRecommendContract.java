package com.team.zhuoke.presenter.home.interfaces;


import android.content.Context;

import com.team.zhuoke.base.BaseModel;
import com.team.zhuoke.base.BasePresenter;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.home.bean.HomeCarousel;
import com.team.zhuoke.model.logic.home.bean.HomeFaceScoreColumn;
import com.team.zhuoke.model.logic.home.bean.HomeHotColumn;
import com.team.zhuoke.model.logic.home.bean.HomeRecommendHotCate;

import java.util.List;

import rx.Observable;

/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：
 * 备注消息：
 * 修改时间：2016/12/12 下午4:04
 **/
public interface HomeRecommendContract {
    interface View extends BaseView {
        //        轮播图
        void getViewCarousel(List<HomeCarousel> mHomeCarousel);

        //        最热栏目
        void getViewHotColumn(List<HomeHotColumn> mHomeHotColumn);

        //        颜值栏目
        void getViewFaceScoreColumn(List<HomeFaceScoreColumn> homeFaceScoreColumns);

        //       热门栏目
        void getViewHotCate(List<HomeRecommendHotCate> homeRecommendHotCates);
    }

    interface Model extends BaseModel {
        Observable<List<HomeCarousel>> getModelCarousel(Context context);

        Observable<List<HomeHotColumn>> getModelHotColumn(Context context);

        Observable<List<HomeFaceScoreColumn>> getModelFaceScoreColumn(Context context,int offset,int limit  );

        Observable<List<HomeRecommendHotCate>> getModelHotCate(Context context);
    }

    abstract class Presenter extends BasePresenter<View, Model> {
        //        轮播
        public abstract void getPresenterCarousel();

        //        最热栏目
        public abstract void getPresenterHotColumn();

        public abstract void getPresenterFaceScoreColumn(int offset,int limit );

        public abstract void getPresenterHotCate();

    }
}
