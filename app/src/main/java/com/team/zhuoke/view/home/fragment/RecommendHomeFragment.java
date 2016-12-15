package com.team.zhuoke.view.home.fragment;

import android.os.Bundle;

import com.team.zhuoke.base.BaseFragment;
import com.team.zhuoke.base.BaseView;

import static com.team.zhuoke.R.layout.fragment_home_recommend;
import static com.team.zhuoke.R.layout.fragment_live;

/**
 * 作者：${User}
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：
 * 类描述：
 * 修改时间：${DATA}1655
 */

public class RecommendHomeFragment  extends BaseFragment{

    public static RecommendHomeFragment getInstance() {
        RecommendHomeFragment rf= new RecommendHomeFragment();
        return rf;
    }
    @Override
    protected int getLayoutId() {
        return fragment_home_recommend;
    }

    @Override
    protected void onInitView(Bundle bundle) {

    }

    @Override
    protected void onEvent() {

    }

    @Override
    protected BaseView getViewImp() {
        return null;
    }
}
