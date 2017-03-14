package com.team.zhuoke.presenter.home.interfaces;

import android.content.Context;

import com.team.zhuoke.base.BaseModel;
import com.team.zhuoke.base.BasePresenter;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.home.bean.HomeColumnMoreAllList;
import com.team.zhuoke.model.logic.home.bean.HomeColumnMoreTwoCate;

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
public interface HomeColumnMoreAllListContract {
    interface View extends BaseView {
        void getViewHomeColumnAllList(List<HomeColumnMoreAllList> mHomeColumnMoreAllList);
        void getViewHomeColumnAllListLoadMore(List<HomeColumnMoreAllList> mHomeColumnMoreAllList);
    }

    interface Model extends BaseModel {

        Observable<List<HomeColumnMoreAllList>> getModelHomeColumnMoreAllList(Context context, String cate_id, int offset, int limit);
    }

    abstract class Presenter extends BasePresenter<View, Model> {
        /**
         * 获取全部列表
         */
        public abstract void getPresenterColumnMoreAllList(String cate_id, int offset, int limit);
        /**
         *  加载更多
         */
        public abstract  void getPresenterColumnMoreAllListLoadMore(String cate_id,int offset,int limit);

    }
}
