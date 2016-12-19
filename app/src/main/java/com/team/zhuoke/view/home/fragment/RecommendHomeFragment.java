package com.team.zhuoke.view.home.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bigkoo.svprogresshud.SVProgressHUD;
import com.facebook.drawee.view.SimpleDraweeView;
import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseFragment;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.home.HomeRecommendModelLogic;
import com.team.zhuoke.model.logic.home.bean.HomeCarousel;
import com.team.zhuoke.presenter.home.impl.HomeRecommendPresenterImp;
import com.team.zhuoke.presenter.home.interfaces.HomeRecommendContract;
import com.team.zhuoke.ui.refreshview.XRefreshView;
import com.team.zhuoke.view.home.adapter.HomeCarouselAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bingoogolapple.bgabanner.BGABanner;


/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：  推荐页
 * 备注消息：
 * 修改时间：2016/12/15 下午4:01
 **/
public class RecommendHomeFragment extends BaseFragment<HomeRecommendModelLogic, HomeRecommendPresenterImp> implements HomeRecommendContract.View
        , BGABanner.Delegate<SimpleDraweeView, String> {
    SVProgressHUD svProgressHUD;
    @BindView(R.id.recommed_banner)
    BGABanner recommed_banner;
    HomeCarouselAdapter adapter;
    @BindView(R.id.rtefresh_content)
    XRefreshView rtefreshContent;
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

    }
    @Override
    protected void onEvent() {
        recommed_banner.setDelegate(this);
        rtefreshContent.setXRefreshViewListener(new XRefreshView.SimpleXRefreshListener()
        {
            @Override
            public void onRefresh() {
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
        rtefreshContent.stopRefresh();
        ArrayList<String> pic_url = new ArrayList<String>();
//        ArrayList<String>  title=new ArrayList<String>();
        for (int i = 0; i < mHomeCarousel.size(); i++) {
            pic_url.add(mHomeCarousel.get(i).getPic_url());
//            title.add(mHomeCarousel.get(i).getTitle());
        }
        recommed_banner.setAdapter(adapter);
        recommed_banner.setData(R.layout.item_image_carousel, pic_url, null);
    }

    /**
     *  点击Banner
     * @param banner
     * @param itemView
     * @param model
     * @param position
     */
    @Override
    public void onBannerItemClick(BGABanner banner, SimpleDraweeView itemView, String model, int position) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    /**
     *  刷新网络数据
     */
    private  void refresh()
    {
//        轮播图
        mPresenter.getPresenterCarousel();

    }
    @Override
    protected void lazyFetchData() {
        svProgressHUD = new SVProgressHUD(getActivity());
        adapter = new HomeCarouselAdapter();
        refresh();
        rtefreshContent.setPinnedTime(2000);
        rtefreshContent.setPullLoadEnable(false);
        rtefreshContent.setPullRefreshEnable(true);
    }

    @Override
    public void showErrorWithStatus(String msg) {
        svProgressHUD.showErrorWithStatus(msg);
        rtefreshContent.stopRefresh(false);
    }
}
