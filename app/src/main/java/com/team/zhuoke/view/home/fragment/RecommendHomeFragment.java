package com.team.zhuoke.view.home.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

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
import com.team.zhuoke.utils.L;
import com.team.zhuoke.view.home.adapter.HomeCarouselAdapter;
import com.team.zhuoke.view.home.event.RecommendEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;
import java.util.TooManyListenersException;

import butterknife.BindView;
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
        svProgressHUD = new SVProgressHUD(getActivity());
        adapter = new HomeCarouselAdapter();
        EventBus.getDefault().register(this);
        refresh();
        setXrefeshViewConfig();
    }

    /**
     *  配置XRefreshView
     */
    protected  void setXrefeshViewConfig()
    {
        rtefreshContent.setPinnedTime(2000);
        rtefreshContent.setPullLoadEnable(false);
        rtefreshContent.setPullRefreshEnable(true);
        rtefreshContent.setMoveForHorizontal(true);
        rtefreshContent.setPinnedContent(true);
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

    @Subscribe(threadMode = ThreadMode.MAIN,priority = 100) //在ui线程执行
    public void onRecommendEvent(RecommendEvent event) {
        L.i("数据为:"+event.getMsg());
        Toast.makeText(getActivity(),event.getMsg(),Toast.LENGTH_LONG).show();
    }
    /**
     * 轮播图
     *
     * @param mHomeCarousel
     */
    @Override
    public void getViewCarousel(List<HomeCarousel> mHomeCarousel) {
        if(rtefreshContent!=null) {
            rtefreshContent.stopRefresh();
        }
        ArrayList<String> pic_url = new ArrayList<String>();
        for (int i = 0; i < mHomeCarousel.size(); i++) {
            pic_url.add(mHomeCarousel.get(i).getPic_url());
        }
        if(recommed_banner!=null) {
            recommed_banner.setAdapter(adapter);
            recommed_banner.setData(R.layout.item_image_carousel, pic_url, null);
        }
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

    }
    @Override
    public void showErrorWithStatus(String msg) {
        svProgressHUD.showErrorWithStatus(msg);
        rtefreshContent.stopRefresh(false);
    }
}
