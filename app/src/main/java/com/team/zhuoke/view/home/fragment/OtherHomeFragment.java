package com.team.zhuoke.view.home.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseFragment;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.home.HomeCateModelLogic;
import com.team.zhuoke.model.logic.home.bean.HomeCate;
import com.team.zhuoke.model.logic.home.bean.HomeCateList;
import com.team.zhuoke.presenter.home.impl.HomeCatePresenterImp;
import com.team.zhuoke.presenter.home.interfaces.HomeCateContract;
import com.team.zhuoke.utils.L;
import com.team.zhuoke.view.home.adapter.HomeNgBarAdapter;
import com.team.zhuoke.view.home.adapter.HomeNgBarViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：
 * 备注消息：首页 列表页  显示 手游,娱乐,游戏,趣玩等!
 * 修改时间：2016/12/14 下午8:17
 **/
public class OtherHomeFragment extends BaseFragment<HomeCateModelLogic, HomeCatePresenterImp> implements HomeCateContract.View,ViewPager.OnPageChangeListener {
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
    private  List<View> mViewPageList;
//    当前页
    private int mCurrentPage;

    @BindView(R.id.ngbar_viewpager)
    ViewPager ngbarViewpager;
    @BindView(R.id.points)
    ViewGroup mPoints;
    private  static List<OtherHomeFragment> mOtherHomeFraments=new ArrayList<OtherHomeFragment>();

    private  HomeNgBarViewPagerAdapter homeNgBarViewPagerAdapter;
    private  HomeNgBarAdapter homeNgBarAdapter;

    public static OtherHomeFragment getInstance(HomeCateList args,int position) {
        OtherHomeFragment mInstance = new OtherHomeFragment();
        Bundle bundle=new Bundle();
        bundle.putSerializable("homecatelist",args);
        bundle.putString("type",args.getShow_order());
        bundle.putInt("position",position-1);
        mInstance.setArguments(bundle);
        mOtherHomeFraments.add(position-1,mInstance);
        return mInstance;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_otherlist;
    }
    @Override
    protected void onInitView(Bundle bundle) {
        Bundle arguments = getArguments();
        HomeCateList mHomeCate = (HomeCateList) arguments.getSerializable("homecatelist");
        String  show_order=arguments.getString("type");
        if(show_order.equals(mHomeCate.getShow_order()))
        {
            mPresenter.getHomeCate(mHomeCate.getIdentification());
        }
    }
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        // TODO: inflate a fragment view
//
//        if (rootView != null) {
//            ViewGroup parent = (ViewGroup) rootView.getParent();
//            if (parent != null) {
//                parent.removeView(rootView);
//            }
//            return rootView;
//        }
//        if (getLayoutId() != 0) {
//            rootView = inflater.inflate(getLayoutId(),container, false);
//        } else {
//            rootView = super.onCreateView(inflater, container, savedInstanceState);
//        }
//        unbinder= ButterKnife.bind(this, rootView);
//        onInitView(savedInstanceState);
//        return rootView;
//    }
    @Override
    protected void onEvent() {
     ngbarViewpager.addOnPageChangeListener(this);
    }

    @Override
    protected BaseView getViewImp() {
        Bundle arguments = getArguments();
        return mOtherHomeFraments.get(arguments.getInt("position"));
    }
    /**
     * 进行懒加载   只进行加载一次
     */
    @Override
    protected void lazyFetchData() {

    }

    @Override
    public void getOtherList(List<HomeCate> homeCates) {
        /**
         * 分页 导航栏
         *
         * @param homeCates
         */
      getNgBarView(homeCates);
    }
    public void getNgBarView(List<HomeCate> homeCates)
    {
        LayoutInflater inflater=LayoutInflater.from(getActivity());
//        显示总的页数  Math.ceil 先上取整
        mTotalPage=(int)Math.ceil(homeCates.size()*1.0/mPageSize);
        mViewPageList= new ArrayList<>();
//        移除最热栏目
        homeCates.remove(0);
        /**
         *  创建 多个GredView
         */
        for(int i=0;i<mTotalPage;i++)
        {
            GridView gridView=(GridView)inflater.inflate(R.layout.view_layout_gridview,null);
            homeNgBarAdapter=new HomeNgBarAdapter(getContext(),homeCates,i,mPageSize);
            gridView.setAdapter(homeNgBarAdapter);
            homeNgBarAdapter.notifyDataSetChanged();
//            每一个GridView 作为一个View 对象添加到ViewPage集合中
            mViewPageList.add(gridView);
        }
        homeNgBarViewPagerAdapter=new HomeNgBarViewPagerAdapter(mViewPageList);
        ngbarViewpager.setAdapter(homeNgBarViewPagerAdapter);
        homeNgBarViewPagerAdapter.notifyDataSetChanged();

        /**
         *  处理小圆点 指示器
         */
//        创建小圆点
        mIvpoints=new ImageView[mTotalPage];
        for(int i=0;i<mIvpoints.length;i++)
        {
            ImageView imgView=new ImageView(getActivity());
//            设置小圆点宽和高
            imgView.setLayoutParams(new ViewGroup.LayoutParams(5,5));
//            默认设置
            if(i==0)
            {
                imgView.setBackgroundResource(R.mipmap.page__selected_indicator);
            }
            else
            {
                imgView.setBackgroundResource(R.mipmap.page__normal_indicator);
            }
            mIvpoints[i]=imgView;
//            设置边距
            LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT
                    , ViewGroup.LayoutParams.WRAP_CONTENT));
            layoutParams.leftMargin=10;
            layoutParams.rightMargin=10;
            mPoints.addView(imgView,layoutParams);
        }

    }

    @Override
    public void showErrorWithStatus(String msg) {

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
