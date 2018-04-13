package com.team.zhuoke.view.home.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bigkoo.svprogresshud.SVProgressHUD;
import com.facebook.drawee.view.SimpleDraweeView;
import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseFragment;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.home.HomeRecommendModelLogic;
import com.team.zhuoke.model.logic.home.bean.HomeCarousel;
import com.team.zhuoke.model.logic.home.bean.HomeFaceScoreColumn;
import com.team.zhuoke.model.logic.home.bean.HomeHotColumn;
import com.team.zhuoke.model.logic.home.bean.HomeRecommendHotCate;
import com.team.zhuoke.presenter.home.impl.HomeRecommendPresenterImp;
import com.team.zhuoke.presenter.home.interfaces.HomeRecommendContract;
import com.team.zhuoke.ui.refreshview.XRefreshView;
import com.team.zhuoke.view.common.activity.PcLiveVideoActivity;
import com.team.zhuoke.view.common.activity.PhoneLiveVideoActivity;
import com.team.zhuoke.view.home.adapter.HomeCarouselAdapter;
import com.team.zhuoke.view.home.adapter.HomeRecommendAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import cn.bingoogolapple.bgabanner.BGABanner;

import static com.team.zhuoke.R.id.recyclerView;


/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：  推荐页
 * 备注消息：
 * 修改时间：2016/12/15 下午4:01
 **/
public class RecommendHomeFragment extends BaseFragment<HomeRecommendModelLogic, HomeRecommendPresenterImp> implements HomeRecommendContract.View, BGABanner.Delegate<SimpleDraweeView, String> {
    SVProgressHUD svProgressHUD;
    @BindView(R.id.rtefresh_content)
    XRefreshView rtefreshContent;
    @BindView(R.id.recommend_content_recyclerview)
    RecyclerView recommed_recyclerview;
    private HomeRecommendAdapter adapter;
    private HomeCarouselAdapter mRecommedBannerAdapter;
    private BGABanner recommed_banner;
    private View haderView;
    private List<HomeCarousel> mHomeCarousel;

    public static RecommendHomeFragment getInstance() {
        RecommendHomeFragment rf = new RecommendHomeFragment();
        return rf;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_recommend;
    }

    @Override
    protected void onInitView(Bundle bundle) {
        svProgressHUD = new SVProgressHUD(getActivity());
        recommed_recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new HomeRecommendAdapter(getContext());
        mHomeCarousel=new ArrayList<HomeCarousel>();
        pool.setMaxRecycledViews(adapter.getItemViewType(0), 500);
        recommed_recyclerview.setRecycledViewPool(pool);
        recommed_recyclerview.setAdapter(adapter);
        mRecommedBannerAdapter = new HomeCarouselAdapter();
        haderView = adapter.setHeaderView(R.layout.item_home_recommend_banner, recommed_recyclerview);
        recommed_banner=(BGABanner) haderView.findViewById(R.id.recommed_banner);
        recommed_banner.setDelegate(this);
        recommed_banner.setAdapter(mRecommedBannerAdapter);
        setXrefeshViewConfig();
    }
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

    /**
     * 配置XRefreshView
     */
    protected void setXrefeshViewConfig() {
        rtefreshContent.setPinnedTime(2000);
        rtefreshContent.setPullLoadEnable(false);
        rtefreshContent.setPullRefreshEnable(true);
        rtefreshContent.setMoveForHorizontal(true);
        rtefreshContent.setPinnedContent(true);
    }

    @Override
    protected void onEvent() {
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
        });
    }

    @Override
    protected BaseView getViewImp() {
        return this;
    }

    /**
     * 轮播图
     *
     * @param mHomeCarousel
     */
    @Override
    public void getViewCarousel(List<HomeCarousel> mHomeCarousel) {
        if (rtefreshContent != null) {
            rtefreshContent.stopRefresh();
        }
        this.mHomeCarousel.clear();
        this.mHomeCarousel.addAll(mHomeCarousel);
//        recommed_banner.setDelegate(this);
        ArrayList<String> pic_url = new ArrayList<String>();
        for (int i = 0; i < mHomeCarousel.size(); i++) {
            pic_url.add(mHomeCarousel.get(i).getPic_url());
        }
        if (recommed_banner != null && pic_url.size() > 0) {

            recommed_banner.setData(R.layout.item_image_carousel, pic_url, null);
        }
        adapter.notifyDataSetChanged();
    }

    //最热
    @Override
    public void getViewHotColumn(List<HomeHotColumn> mHomeHotColumn) {
        adapter.getHomeHotColumn(mHomeHotColumn);
    }

    //颜值
    @Override
    public void getViewFaceScoreColumn(List<HomeFaceScoreColumn> homeFaceScoreColumns) {
        adapter.getFaceScoreColmun(homeFaceScoreColumns);
    }

    //热门
    @Override
    public void getViewHotCate(List<HomeRecommendHotCate> homeRecommendHotCates) {
//        去掉颜值栏目
        homeRecommendHotCates.remove(1);
        adapter.getAllColumn(homeRecommendHotCates);
    }

    /**
     * 刷新网络数据
     */
    private void refresh() {
//        轮播图
        mPresenter.getPresenterCarousel();
        mPresenter.getPresenterHotColumn();
        mPresenter.getPresenterFaceScoreColumn(0, 4);
        mPresenter.getPresenterHotCate();
    }

    @Override
    protected void lazyFetchData() {
        refresh();
    }

    @Override
    public void showErrorWithStatus(String msg) {
        svProgressHUD.showErrorWithStatus(msg);
        rtefreshContent.stopRefresh(false);
    }

    @Override
    public void onBannerItemClick(BGABanner banner, SimpleDraweeView itemView, String model, int position) {
        Intent intent = new Intent(getActivity(), PcLiveVideoActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("Room_id",mHomeCarousel.get(position).getRoom().getRoom_id());
        intent.putExtras(bundle);
        getActivity().startActivity(intent);
    }
}
