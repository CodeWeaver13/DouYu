package com.team.zhuoke.view.video.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bigkoo.svprogresshud.SVProgressHUD;
import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseFragment;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.video.bean.VideoHotAuthorColumn;
import com.team.zhuoke.model.logic.video.bean.VideoHotColumn;
import com.team.zhuoke.model.logic.video.bean.VideoRecommendHotCate;
import com.team.zhuoke.model.logic.video.VideoRecommendModelLogic;
import com.team.zhuoke.presenter.video.impl.VideoRecommendPresenterImp;
import com.team.zhuoke.presenter.video.interfaces.VideoRerecommendContract;
import com.team.zhuoke.ui.refreshview.XRefreshView;
import com.team.zhuoke.view.home.adapter.HomeCarouselAdapter;
import com.team.zhuoke.view.video.adapter.VideoRecommendAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class RecommendVideoFragment extends BaseFragment<VideoRecommendModelLogic, VideoRecommendPresenterImp> implements VideoRerecommendContract.View {

    @BindView(R.id.recommend_content_recyclerview)
    RecyclerView recommendContentRecyclerview;
    @BindView(R.id.rtefresh_content)
    XRefreshView rtefreshContent;
    private SVProgressHUD svProgressHUD;
    private HomeCarouselAdapter mRecommedBannerAdapter;
    private VideoRecommendAdapter adapter;

    public static RecommendVideoFragment getInstance() {
        RecommendVideoFragment rf = new RecommendVideoFragment();
        return rf;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_video_recommend;
    }

    @Override
    protected void onInitView(Bundle bundle) {
        svProgressHUD = new SVProgressHUD(getActivity());
        recommendContentRecyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        final RecyclerView.RecycledViewPool pool = new RecyclerView.RecycledViewPool() {
            @Override
            public void putRecycledView(RecyclerView.ViewHolder scrap) {
                super.putRecycledView(scrap);
            }
            @Override
            public RecyclerView.ViewHolder getRecycledView(int viewType) {
                final RecyclerView.ViewHolder recycledView = super.getRecycledView(viewType);
                return recycledView;
            }
        };
        refresh();
//        mRecommedBannerAdapter = new HomeCarouselAdapter();
        adapter = new VideoRecommendAdapter(getContext());
        pool.setMaxRecycledViews(adapter.getItemViewType(0), 500);
        recommendContentRecyclerview.setRecycledViewPool(pool);
        recommendContentRecyclerview.setAdapter(adapter);
        setXrefeshViewConfig();
    }

    /**
     *  配置XRefreshView
     */
    protected  void setXrefeshViewConfig(){
        rtefreshContent.setPinnedTime(2000);
        rtefreshContent.setPullLoadEnable(false);
        rtefreshContent.setPullRefreshEnable(true);
        rtefreshContent.setMoveForHorizontal(true);
        rtefreshContent.setPinnedContent(true);
    }
    @Override
    protected void onEvent() {
        rtefreshContent.setXRefreshViewListener(new XRefreshView.SimpleXRefreshListener()
        {
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
        });
    }

    @Override
    protected BaseView getViewImp() {
        return this;
    }

    @Override
    protected void lazyFetchData() {

    }

    @Override
    public void getViewHotColumn(List<VideoHotColumn> mVideoHotColumn) {
        if(rtefreshContent!=null)
        {
            rtefreshContent.stopRefresh();
        }
        adapter.getVideoHotColumn(mVideoHotColumn);
    }

    @Override
    public void getViewHotAutherColumn(List<VideoHotAuthorColumn> videoHotAuthorColumns) {
        adapter.getFaceScoreColmun(videoHotAuthorColumns);
    }

    @Override
    public void getViewHotCate(List<VideoRecommendHotCate> videoRecommendHotCates) {
        videoRecommendHotCates.remove(1);
        adapter.getAllColumn(videoRecommendHotCates);
    }

    @Override
    public void showErrorWithStatus(String msg) {
        svProgressHUD.showErrorWithStatus(msg);
        rtefreshContent.stopRefresh(false);
    }

    /**
     *  刷新网络数据
     */
    private  void refresh()
    {

        mPresenter.getPresenterVideoHotColumn();
        mPresenter.getPresenterVideoHotCate();
        mPresenter.getPresenterVideoHotAutherColumn(0,4);
    }
}
