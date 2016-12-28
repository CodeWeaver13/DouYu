package com.team.zhuoke.view.home.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.team.zhuoke.R;
import com.team.zhuoke.api.home.HomeApi;
import com.team.zhuoke.model.ParamsMapUtils;
import com.team.zhuoke.model.logic.home.bean.HomeCate;
import com.team.zhuoke.model.logic.home.bean.HomeCateList;
import com.team.zhuoke.net.callback.RxSubscriber;
import com.team.zhuoke.net.exception.ResponeThrowable;
import com.team.zhuoke.net.http.HttpUtils;
import com.team.zhuoke.net.transformer.DefaultTransformer;
import com.team.zhuoke.ui.refreshview.XRefreshView;
import com.team.zhuoke.view.home.adapter.HomeNgBarAdapter;
import com.team.zhuoke.view.home.adapter.HomeNgBarViewPagerAdapter;
import com.trello.rxlifecycle.components.support.RxFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/11/14 上午11:28
 **/
public  class OtherFragment extends RxFragment  implements ViewPager.OnPageChangeListener{
    /**
     *   导航栏 分页
     */
////    小圆点指示器
//    protected ViewGroup mPoints;
//    小圆点图片集合
    private ImageView[] mIvpoints;
    //    总共多少页
    private  int mTotalPage;
    //    每页显示的最大数量  默认为8
    private  int mPageSize=8;
    // GridView 作为一个View对象添加到ViewPager集合中
    private List<View> mViewPageList;
    //    当前页
    private int mCurrentPage;

    @BindView(R.id.ngbar_viewpager)
    ViewPager ngbarViewpager;
    @BindView(R.id.points)
    ViewGroup mPoints;
    @BindView(R.id.rtefresh_content)
    XRefreshView rtefreshContent;

    private HomeNgBarViewPagerAdapter homeNgBarViewPagerAdapter;
    private HomeNgBarAdapter homeNgBarAdapter;
    //    获得HttpUtils实例
    private static OtherFragment mInstance;
    public static OtherFragment getInstance(HomeCateList args) {
        mInstance = new OtherFragment();
        Bundle bundle=new Bundle();
        bundle.putSerializable("homecatelist",args);
        bundle.putString("type",args.getShow_order());
        mInstance.setArguments(bundle);
        return mInstance;

    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View rootView=null;
        if (rootView != null) {
            ViewGroup parent = (ViewGroup) rootView.getParent();
            if (parent != null) {
                parent.removeView(rootView);
            }
            return rootView;
        }
        refresh();
     rootView = inflater.inflate(R.layout.fragment_home_otherlist,container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ngbarViewpager.addOnPageChangeListener(this);

        rtefreshContent.setPinnedTime(2000);
        rtefreshContent.setPullLoadEnable(false);
        rtefreshContent.setPullRefreshEnable(true);
        rtefreshContent.setXRefreshViewListener(new XRefreshView.SimpleXRefreshListener()
        {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                    }
                }, 500);
            }
        });
    }
    public void refresh()
    {
        Bundle arguments = getArguments();
        HomeCateList mHomeCate;
        mHomeCate = (HomeCateList) arguments.getSerializable("homecatelist");
        String show_order = arguments.getString("type");
        if (show_order.equals(mHomeCate.getShow_order())) {
            HttpUtils.getInstance(getActivity())
                    .setLoadDiskCache(true)
                    .getRetofitClinet()
                    .builder(HomeApi.class)
                    .getHomeCate(ParamsMapUtils.getHomeCate(mHomeCate.getIdentification()))
//               进行预处理
                    .compose(new DefaultTransformer<List<HomeCate>>()).subscribe(new RxSubscriber<List<HomeCate>>() {
                @Override
                public void onSuccess(List<HomeCate> homeCates) {
                    getNgBarView(homeCates);
                }
                @Override
                protected void onError(ResponeThrowable ex) {
                }
            });
        }
    }
    public void getNgBarView(List<HomeCate> homeCates) {
        LayoutInflater inflater = LayoutInflater.from(getActivity());
//        显示总的页数  Math.ceil 先上取整
        mTotalPage = (int) Math.ceil(homeCates.size() * 1.0 / mPageSize);
        mViewPageList = new ArrayList<>();
//        移除最热栏目
        homeCates.remove(0);
        /**
         *  创建 多个GredView
         */
        for (int i = 0; i < mTotalPage; i++) {
           if(i<=1) {
               GridView gridView = (GridView) inflater.inflate(R.layout.view_layout_gridview, null);
               homeNgBarAdapter = new HomeNgBarAdapter(getContext(), homeCates, i, mPageSize);
               gridView.setAdapter(homeNgBarAdapter);
               homeNgBarAdapter.notifyDataSetChanged();
//            每一个GridView 作为一个View 对象添加到ViewPage集合中
               mViewPageList.add(gridView);
           }
        }
        homeNgBarViewPagerAdapter = new HomeNgBarViewPagerAdapter(mViewPageList);
        ngbarViewpager.setAdapter(homeNgBarViewPagerAdapter);
        homeNgBarViewPagerAdapter.notifyDataSetChanged();

        /**
         *  处理小圆点 指示器
         */
//        创建小圆点
        mIvpoints=null;
        mIvpoints = new ImageView[2];
        for (int i = 0; i < mIvpoints.length; i++) {
                  if(i<=1) {
                      ImageView imgView = new ImageView(getActivity());
//            设置小圆点宽和高
                      imgView.setLayoutParams(new ViewGroup.LayoutParams(5, 5));
//            默认设置
                      if (i == 0) {
                          imgView.setBackgroundResource(R.mipmap.page__selected_indicator);
                      } else {
                          imgView.setBackgroundResource(R.mipmap.page__normal_indicator);
                      }
                      mIvpoints[i] = imgView;
//            设置边距
                      LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT
                              , ViewGroup.LayoutParams.WRAP_CONTENT));
                      layoutParams.leftMargin = 10;
                      layoutParams.rightMargin = 10;
                      mPoints.addView(imgView, layoutParams);
                  }
        }
        if(mTotalPage==1)
        {
            mPoints.setVisibility(View.GONE);
        }
    }
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }
    @Override
    public void onPageSelected(int position){
        for (int i = 0; i < mIvpoints.length; i++) {
            if (i == position) {
                mIvpoints[i].setBackgroundResource(R.mipmap.page__selected_indicator);
            } else {
                mIvpoints[i].setBackgroundResource(R.mipmap.page__normal_indicator);
            }
        }
    }
    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
