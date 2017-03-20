package com.team.zhuoke.view.video.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseFragment;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.video.VideoTwoColumnModelLogic;
import com.team.zhuoke.model.logic.video.bean.VideoOtherColumnList;
import com.team.zhuoke.model.logic.video.bean.VideoReClassify;
import com.team.zhuoke.presenter.video.impl.VideoOtherTwoColumnPresenterImp;
import com.team.zhuoke.presenter.video.interfaces.VideoOtherTwoColumnContract;
import com.team.zhuoke.ui.refreshview.XRefreshView;
import com.team.zhuoke.view.home.adapter.FullyGridLayoutManager;
import com.team.zhuoke.view.video.adapter.VideoOtherColumnListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by Administrator on 2017/2/10 0010.
 */

public class VideoOtherTwoColumnFragment extends BaseFragment<VideoTwoColumnModelLogic, VideoOtherTwoColumnPresenterImp> implements VideoOtherTwoColumnContract.View {
    /**
     * 分页加载
     */
//    起始位置
    private int offset = 0;
    //    每页加载数量
    private int limit = 20;
    private static List<VideoOtherTwoColumnFragment> mVideoOtherTwoColumnFragment = new ArrayList<VideoOtherTwoColumnFragment>();
    @BindView(R.id.othercolumn_content_recyclerview)
    RecyclerView othercolumnContentRecyclerview;
    @BindView(R.id.rtefresh_content)
    XRefreshView rtefreshContent;
    //    private LiveOtherColumnListAdapter mLiveOtherColumnListAdapter;
    private VideoReClassify mLiveOtherTwoColumn;
    private VideoOtherColumnListAdapter mVideoOtherColumnListAdapter;

    public static VideoOtherTwoColumnFragment getInstance() {
        VideoOtherTwoColumnFragment rf = new VideoOtherTwoColumnFragment();
        return rf;
    }

    public static VideoOtherTwoColumnFragment getInstance(VideoReClassify mVideoReClassify, int position) {
        VideoOtherTwoColumnFragment rf = new VideoOtherTwoColumnFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("mVideoOtherTwoColumn", mVideoReClassify);
        bundle.putInt("position", position);
        mVideoOtherTwoColumnFragment.add(position, rf);
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
        othercolumnContentRecyclerview.setLayoutManager(new FullyGridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, false));
        Bundle arguments = getArguments();
        mLiveOtherTwoColumn = (VideoReClassify) arguments.getSerializable("mVideoOtherTwoColumn");

        mVideoOtherColumnListAdapter = new VideoOtherColumnListAdapter(getActivity());
        othercolumnContentRecyclerview.setAdapter(mVideoOtherColumnListAdapter);

        rtefreshContent.setXRefreshViewListener(new XRefreshView.SimpleXRefreshListener() {
            @Override
            public void onRefresh() {
//                延迟500毫秒, 原因 用户体验好 !!!
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        refresh(mLiveOtherTwoColumn.getCid1(), mLiveOtherTwoColumn.getCid2(), offset, limit, "hot");
                    }

                }, 500);
            }

            @Override
            public void onLoadMore(boolean isSilence) {
                offset += limit;

                loadMore(mLiveOtherTwoColumn.getCid1(), mLiveOtherTwoColumn.getCid2(), offset, limit, "hot");
            }

        });
    }

    private void loadMore(String cid1, String cid2, int offset, int limit, String action) {
        mPresenter.getPresenterLiveOtherColumnListLoadMore(cid1, cid2, offset, limit, action);
    }

    /**
     * 刷新网络数据
     */
    private void refresh(String cid1, String cid2, int offset, int limit, String action) {
//       重新开始计算
        offset = 0;
        mPresenter.getPresenterLiveOtherColumnList(cid1, cid2, offset, limit, action);

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
        return mVideoOtherTwoColumnFragment.get(arguments.getInt("position"));
    }

    @Override
    protected void lazyFetchData() {
        mLiveOtherTwoColumn = new VideoReClassify();
        Bundle arguments = getArguments();
        mLiveOtherTwoColumn = (VideoReClassify) arguments.getSerializable("mVideoOtherTwoColumn");
        refresh(mLiveOtherTwoColumn.getCid1(), mLiveOtherTwoColumn.getCid2(), offset, limit, "hot");

    }


    @Override
    public void showErrorWithStatus(String msg) {
        if (rtefreshContent != null) {
            rtefreshContent.stopLoadMore();
            rtefreshContent.stopRefresh();
        }
    }

    @Override
    public void getViewVideoOtherColumnListLoadMore(List<VideoOtherColumnList> mVideoOtherColumnList) {
        if (rtefreshContent != null) {
            rtefreshContent.stopLoadMore();
        }
        mVideoOtherColumnListAdapter.getLiveOtherColumnLoadMore(mVideoOtherColumnList);
    }

    @Override
    public void getViewOtherTwoColumn(List<VideoOtherColumnList> mVideoOtherColumnList) {
        if (rtefreshContent != null) {
            rtefreshContent.stopRefresh();
        }
        mVideoOtherColumnListAdapter.getLiveOtherColumnList(mVideoOtherColumnList);
    }
}
