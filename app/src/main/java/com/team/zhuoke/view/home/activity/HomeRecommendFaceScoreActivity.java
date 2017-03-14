package com.team.zhuoke.view.home.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.base.SwipeBackActivity;
import com.team.zhuoke.model.logic.home.HomeFaceScoreModeLogic;
import com.team.zhuoke.model.logic.home.bean.HomeFaceScoreColumn;
import com.team.zhuoke.presenter.home.impl.HomeFaceScorePresenterImp;
import com.team.zhuoke.presenter.home.interfaces.HomeFaceScoreContract;
import com.team.zhuoke.ui.refreshview.XRefreshView;
import com.team.zhuoke.view.home.adapter.HomeRecommendFaceScoreColumnAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述： 全部颜值栏目
 * 备注消息：
 * 修改时间：2017/1/18 下午3:06
 **/
public class HomeRecommendFaceScoreActivity extends SwipeBackActivity<HomeFaceScoreModeLogic, HomeFaceScorePresenterImp> implements HomeFaceScoreContract.View {

    /**
     * 分页加载
     */
//    起始位置
    private int offset = 0;
    //    每页加载数量
    private int limit = 20;
    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.facescore_content_recyclerview)
    RecyclerView facescoreContentRecyclerview;
    @BindView(R.id.rtefresh_content)
    XRefreshView rtefreshContent;
    private HomeRecommendFaceScoreColumnAdapter mFaceScoreColumnAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_home_recommend_facescore;
    }

    @Override
    protected void onInitView(Bundle bundle) {
        tvTitle.setText(getIntent().getExtras().getString("title"));
        refresh();
        setXrefeshViewConfig();
        facescoreContentRecyclerview.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false));
        mFaceScoreColumnAdapter = new HomeRecommendFaceScoreColumnAdapter(this);
//        mFaceScoreColumnAdapter.setCustomLoadMoreView(new XRefreshViewFooter(this));
        facescoreContentRecyclerview.setAdapter(mFaceScoreColumnAdapter);
        rtefreshContent.setXRefreshViewListener(new XRefreshView.SimpleXRefreshListener() {
            @Override
            public void onRefresh() {
//                延迟500毫秒, 原因 用户体验好 !!!
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refresh();
                    }
                }, 500);
            }

            @Override
            public void onLoadMore(boolean isSilence) {
                offset += limit;
                loadMore(offset, limit);
            }
        });
    }

    /**
     * 配置XRefreshView
     */
    protected void setXrefeshViewConfig() {
        rtefreshContent.setPinnedTime(2000);
        rtefreshContent.setPullLoadEnable(true);
        rtefreshContent.setPullRefreshEnable(true);
        rtefreshContent.setMoveForHorizontal(true);
        rtefreshContent.setPinnedContent(true);
//        滚动到底部 自动加载数据
        rtefreshContent.setSilenceLoadMore();
    }

    /**
     * 刷新网络数据
     */
    private void refresh() {
//       重新开始计算
        offset = 0;
        mPresenter.getPresenterFaceScoreColumn(0, 20);
    }

    @Override
    protected void onEvent() {

    }

    private void loadMore(int offset, int limit) {
        mPresenter.getPresenterFaceScoreLoadMore(offset, limit);
    }

    @Override
    protected BaseView getView() {
        return this;
    }

    @Override
    public void getViewFaceScoreColumn(List<HomeFaceScoreColumn> homeFaceScoreColumns) {
        if (rtefreshContent != null) {
            rtefreshContent.stopRefresh();
        }
        mFaceScoreColumnAdapter.getFaceScoreColumn(homeFaceScoreColumns);
    }

    @Override
    public void getViewFaceScoreColumnLoadMore(List<HomeFaceScoreColumn> homeFaceScoreColumns) {
        if (rtefreshContent != null) {
            rtefreshContent.stopLoadMore();
        }
        mFaceScoreColumnAdapter.getFaceScoreColumnLoadMore(homeFaceScoreColumns);
    }

    @Override
    public void showErrorWithStatus(String msg) {
        if (rtefreshContent != null) {
            rtefreshContent.stopLoadMore(false);
        }
    }

    @OnClick(R.id.img_back)
    public void back() {
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
