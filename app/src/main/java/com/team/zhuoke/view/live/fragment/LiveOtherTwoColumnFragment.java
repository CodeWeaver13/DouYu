package com.team.zhuoke.view.live.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseFragment;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.live.LiveOtherColumnListModelLogic;
import com.team.zhuoke.model.logic.live.bean.LiveOtherList;
import com.team.zhuoke.model.logic.live.bean.LiveOtherTwoColumn;
import com.team.zhuoke.presenter.live.impl.LiveOtherColumnListPresenterImp;
import com.team.zhuoke.presenter.live.interfaces.LiveOtherColumnListContract;
import com.team.zhuoke.ui.refreshview.XRefreshView;
import com.team.zhuoke.view.live.adapter.LiveFaceScoreColumnListAdapter;
import com.team.zhuoke.view.live.adapter.LiveOtherColumnListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：
 * 备注消息：
 * 修改时间：2017/2/8 上午10:22
 **/
public class LiveOtherTwoColumnFragment extends BaseFragment<LiveOtherColumnListModelLogic, LiveOtherColumnListPresenterImp> implements LiveOtherColumnListContract.View {
    /**
     * 分页加载
     */
//    起始位置
    private int offset = 0;
    //    每页加载数量
    private int limit = 20;
    private static List<LiveOtherTwoColumnFragment> mLiveOtherTwoColumnFragment = new ArrayList<LiveOtherTwoColumnFragment>();
    @BindView(R.id.othercolumn_content_recyclerview)
    RecyclerView othercolumnContentRecyclerview;
    @BindView(R.id.rtefresh_content)
    XRefreshView rtefreshContent;
    private LiveOtherColumnListAdapter mLiveOtherColumnListAdapter;
    private LiveOtherTwoColumn mLiveOtherTwoColumn;
    private LiveFaceScoreColumnListAdapter mLiveFaceScoreColumnListAdapter;
    public static LiveOtherTwoColumnFragment getInstance() {
        LiveOtherTwoColumnFragment rf = new LiveOtherTwoColumnFragment();
        return rf;
    }

    public static LiveOtherTwoColumnFragment getInstance(LiveOtherTwoColumn mLiveOtherTwoColumn, int position) {
        LiveOtherTwoColumnFragment rf = new LiveOtherTwoColumnFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("mLiveOtherTwoColumn", mLiveOtherTwoColumn);
        bundle.putInt("position", position);
        mLiveOtherTwoColumnFragment.add(position, rf);
        rf.setArguments(bundle);
        return rf;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_live_othercolumn_list;
    }

    @Override
    protected void onInitView(Bundle bundle) {
        setXrefeshViewConfig();
        othercolumnContentRecyclerview.setLayoutManager(new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, false));
        Bundle arguments = getArguments();
        mLiveOtherTwoColumn = (LiveOtherTwoColumn) arguments.getSerializable("mLiveOtherTwoColumn");
        if (mLiveOtherTwoColumn.getTag_id().equals("201")) {
            mLiveFaceScoreColumnListAdapter = new LiveFaceScoreColumnListAdapter(getActivity());
            othercolumnContentRecyclerview.setAdapter(mLiveFaceScoreColumnListAdapter);
        } else {
            mLiveOtherColumnListAdapter = new LiveOtherColumnListAdapter(getActivity());
            othercolumnContentRecyclerview.setAdapter(mLiveOtherColumnListAdapter);
        }
        rtefreshContent.setXRefreshViewListener(new XRefreshView.SimpleXRefreshListener() {
            @Override
            public void onRefresh() {
//                延迟500毫秒, 原因 用户体验好 !!!
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mLiveOtherTwoColumn.getTag_id().equals("201")) {
                            refreshFaceScore(mLiveOtherTwoColumn.getTag_id());
                        } else {
                            refresh(mLiveOtherTwoColumn.getTag_id());
                        }
                    }
                }, 500);
            }

            @Override
            public void onLoadMore(boolean isSilence) {
                offset += limit;
                if (mLiveOtherTwoColumn.getTag_id().equals("201")) {
                    loadMoreFaceScore(mLiveOtherTwoColumn.getTag_id(), offset, limit);
                } else {
                    loadMore(mLiveOtherTwoColumn.getTag_id(), offset, limit);
                }
            }
        });
    }

    private void loadMore(String cate_id, int offset, int limit) {
        mPresenter.getPresenterLiveOtherColumnListLoadMore(cate_id, offset, limit);
    }

    private void loadMoreFaceScore(String cate_id, int offset, int limit) {
        mPresenter.getPresenterLiveFaceScoreColumnListLoadMore(cate_id, offset, limit);
    }

    /**
     * 刷新网络数据
     */
    private void refresh(String cate_id) {
//       重新开始计算
        offset = 0;
        mPresenter.getPresenterLiveOtherColumnList(cate_id, offset, limit);

    }

    /**
     * 刷新网络数据
     */
    private void refreshFaceScore(String cate_id) {
//       重新开始计算
        offset = 0;
        mPresenter.getPresenterLiveFaceScoreColumnList(cate_id, offset, limit);
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

    @Override
    protected void onEvent() {

    }

    @Override
    protected BaseView getViewImp() {
        Bundle arguments = getArguments();
        return mLiveOtherTwoColumnFragment.get(arguments.getInt("position"));
    }

    @Override
    protected void lazyFetchData() {
        mLiveOtherTwoColumn = new LiveOtherTwoColumn();
        Bundle arguments = getArguments();
        mLiveOtherTwoColumn = (LiveOtherTwoColumn) arguments.getSerializable("mLiveOtherTwoColumn");
        if (mLiveOtherTwoColumn.getTag_id().equals("201")) {
            refreshFaceScore(mLiveOtherTwoColumn.getTag_id());
        } else {
            refresh(mLiveOtherTwoColumn.getTag_id());
        }
    }


    @Override
    public void getViewLiveOtherColumnList(List<LiveOtherList> mLiveAllList) {
        if (rtefreshContent != null) {
            rtefreshContent.stopRefresh();
        }
        mLiveOtherColumnListAdapter.getLiveOtherColumnList(mLiveAllList);
    }

    @Override
    public void getViewLiveOtherColumnListLoadMore(List<LiveOtherList> mLiveAllList) {

        if (rtefreshContent != null) {
            rtefreshContent.stopLoadMore();
        }
        mLiveOtherColumnListAdapter.getLiveOtherColumnLoadMore(mLiveAllList);
    }

    @Override
    public void getViewLiveFaceScoreColumnList(List<LiveOtherList> mLiveAllList) {
        if (rtefreshContent != null) {
            rtefreshContent.stopRefresh();
        }
        mLiveFaceScoreColumnListAdapter.getFaceScoreColumn(mLiveAllList);

    }

    @Override
    public void getViewLiveFaceScoreColumnListLoadMore(List<LiveOtherList> mLiveAllList) {
        if (rtefreshContent != null) {
            rtefreshContent.stopLoadMore();
        }
        mLiveFaceScoreColumnListAdapter.getFaceScoreColumnLoadMore(mLiveAllList);
    }

    @Override
    public void showErrorWithStatus(String msg) {
        if (rtefreshContent != null) {
            rtefreshContent.stopLoadMore();
            rtefreshContent.stopRefresh();
        }
    }
}
