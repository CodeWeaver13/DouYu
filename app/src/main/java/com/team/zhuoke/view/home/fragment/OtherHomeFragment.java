package com.team.zhuoke.view.home.fragment;

import android.os.Bundle;

import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseFragment;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.home.bean.HomeCate;
import com.team.zhuoke.model.logic.home.bean.HomeCateList;
import com.team.zhuoke.model.logic.home.HomeCateModelLogic;
import com.team.zhuoke.presenter.home.impl.HomeCatePresenterImp;
import com.team.zhuoke.presenter.home.interfaces.HomeCateContract;
import com.team.zhuoke.utils.L;

import java.util.List;


/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：首页 列表页  显示 手游,娱乐,游戏,趣玩等!
 *  修改时间：2016/12/14 下午8:17
 **/
public class OtherHomeFragment extends BaseFragment<HomeCateModelLogic,HomeCatePresenterImp> implements HomeCateContract.View {

  private  HomeCateList mHomeCate;
    public static OtherHomeFragment getInstance(Bundle args) {
        OtherHomeFragment sf = new OtherHomeFragment();
        sf.setArguments(args);
        return sf;
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_live;
    }
    @Override
    protected void onInitView(Bundle bundle) {
        Bundle arguments = getArguments();
        mHomeCate=(HomeCateList)arguments.getSerializable("homecatelist");
        L.i("信息为ID:"+mHomeCate.getIdentification());
        mPresenter.getHomeCate(mHomeCate.getIdentification());
    }
    @Override
    protected void onEvent() {

    }
    @Override
    protected BaseView getViewImp() {
        return this;
    }
    @Override
    public void getOtherList(List<HomeCate> homeCates) {

//        L.i("获取到的数据为:"+homeCates.toString());
    }
}
