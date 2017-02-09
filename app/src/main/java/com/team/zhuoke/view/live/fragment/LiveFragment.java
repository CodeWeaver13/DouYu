package com.team.zhuoke.view.live.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bigkoo.svprogresshud.SVProgressHUD;
import com.flyco.tablayout.SlidingTabLayout;
import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseFragment;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.live.LiveOtherColumnModelLogic;
import com.team.zhuoke.model.logic.live.bean.LiveOtherColumn;
import com.team.zhuoke.presenter.live.impl.LiveOtherColumnPresenterImp;
import com.team.zhuoke.presenter.live.interfaces.LiveOtherColumnContract;
import com.team.zhuoke.view.live.adapter.LiveAllCloumnAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：
 * 备注消息：
 * 修改时间：2016/11/14 上午11:50
 **/
public class LiveFragment extends BaseFragment<LiveOtherColumnModelLogic, LiveOtherColumnPresenterImp> implements LiveOtherColumnContract.View {

    SVProgressHUD svProgressHUD;
    @BindView(R.id.live_sliding_tab)
    SlidingTabLayout liveSlidingTab;
    @BindView(R.id.live_viewpager)
    ViewPager liveViewpager;
    private String[] mTilte;

    private LiveAllCloumnAdapter mLiveAllColumnAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_live;
    }

    @Override
    protected void onInitView(Bundle bundle) {
        svProgressHUD = new SVProgressHUD(getActivity());

    }

    @Override
    protected void onEvent() {

    }

    @Override
    protected BaseView getViewImp() {
        return this;
    }

    /**
     * 懒加载
     */
    @Override
    protected void lazyFetchData() {
        mPresenter.getPresenterLiveOtherColumn();
    }

    @Override
    public void showErrorWithStatus(String msg) {

    }

    /**
     * 获取全部栏目分类
     *
     * @param mLiveOtherColumns
     */
    @Override
    public void getViewLiveOtherColumn(List<LiveOtherColumn> mLiveOtherColumns) {
        mTilte = new String[mLiveOtherColumns.size() + 3];
        mTilte[0] = "常用";
        mTilte[1] = "全部";
        for (int i = 0; i < mLiveOtherColumns.size(); i++) {
            mTilte[i + 2] = mLiveOtherColumns.get(i).getCate_name();
        }
        mTilte[mTilte.length - 1] = "体育直播";
        liveViewpager.setOffscreenPageLimit(mTilte.length);
        mLiveAllColumnAdapter = new LiveAllCloumnAdapter(getChildFragmentManager(), mLiveOtherColumns, mTilte);
        liveViewpager.setAdapter(mLiveAllColumnAdapter);
        mLiveAllColumnAdapter.notifyDataSetChanged();
        liveSlidingTab.setViewPager(liveViewpager, mTilte);
        liveSlidingTab.setCurrentTab(1);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }
}
