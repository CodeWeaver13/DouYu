package com.team.zhuoke.view.live.fragment;

import android.os.Bundle;

import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseActivity;
import com.team.zhuoke.base.BaseFragment;
import com.team.zhuoke.base.BaseView;

/**
 * 作者：${User}
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：
 * 类描述：
 * 修改时间：${DATA}1634
 */

public class LiveOtherColumnFragment extends BaseFragment {
    public static LiveOtherColumnFragment getInstance() {
        LiveOtherColumnFragment rf = new LiveOtherColumnFragment();
        return rf;
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_live_othercolumn;
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

    @Override
    protected void lazyFetchData() {

    }

}
