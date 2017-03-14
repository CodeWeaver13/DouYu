package com.team.zhuoke.view.home.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bigkoo.svprogresshud.SVProgressHUD;
import com.flyco.tablayout.SlidingTabLayout;
import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.base.SwipeBackActivity;
import com.team.zhuoke.model.logic.home.HomeColumnMoreModelLogic;
import com.team.zhuoke.model.logic.home.bean.HomeColumnMoreTwoCate;
import com.team.zhuoke.presenter.home.impl.HomeColumnMorePresenterImp;
import com.team.zhuoke.presenter.home.interfaces.HomeColumnMoreListContract;
import com.team.zhuoke.view.home.adapter.HomeColumnMoreTwoCateAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：  更多栏目列表
 * 备注消息：
 * 修改时间：2017/3/14 下午3:13
 **/
public class HomeColumnMoreListActivity extends SwipeBackActivity<HomeColumnMoreModelLogic, HomeColumnMorePresenterImp> implements HomeColumnMoreListContract.View {


    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.img_popup_live)
    ImageView imgPopupLive;
    @BindView(R.id.rl_bar)
    RelativeLayout rlBar;
    @BindView(R.id.twocolumn_tablayout)
    SlidingTabLayout twocolumnTablayout;
    @BindView(R.id.rl_twocolumn_bar)
    RelativeLayout rlTwocolumnBar;
    @BindView(R.id.livetwocolumn_viewpager)
    ViewPager livetwocolumnViewpager;
    private String[] mTilte;

    private SVProgressHUD svProgressHUD;

    private HomeColumnMoreTwoCateAdapter mHomeColumnMoreTwoCateAdapter;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_column_more_list;
    }

    @Override
    protected void onInitView(Bundle bundle) {
        tvTitle.setText(getIntent().getExtras().getString("title"));
        mPresenter.getPresenterHomeColumnMoreTwoCate(getIntent().getExtras().getString("cate_id"));
        svProgressHUD = new SVProgressHUD(this);
    }

    @Override
    protected void onEvent() {

    }

    @Override
    protected BaseView getView() {
        return this;
    }

    @OnClick(R.id.img_back)
    public void back() {
        finish();
    }

    @Override
    public void getViewHomeColumnMoreTwoCate(List<HomeColumnMoreTwoCate> mHomeColumnMoreTwoCate) {
        mTilte = new String[mHomeColumnMoreTwoCate.size() + 1];
        mTilte[0] = "全部";
        for (int i = 0; i < mHomeColumnMoreTwoCate.size(); i++) {
            mTilte[i + 1] = mHomeColumnMoreTwoCate.get(i).getName();
        }
        if (mTilte.length <= 1) {
            rlTwocolumnBar.setVisibility(View.GONE);
        }
        livetwocolumnViewpager.setOffscreenPageLimit(mTilte.length);
        mHomeColumnMoreTwoCateAdapter = new HomeColumnMoreTwoCateAdapter(getSupportFragmentManager(), getIntent().getExtras().getString("cate_id"), mHomeColumnMoreTwoCate, mTilte);
        livetwocolumnViewpager.setAdapter(mHomeColumnMoreTwoCateAdapter);
        mHomeColumnMoreTwoCateAdapter.notifyDataSetChanged();
        twocolumnTablayout.setViewPager(livetwocolumnViewpager, mTilte);
    }

    @Override
    public void showErrorWithStatus(String msg) {
        svProgressHUD.showErrorWithStatus("网络错误,请重试!");
    }
}
