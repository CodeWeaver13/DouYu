package com.team.zhuoke.view.live.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.flyco.tablayout.SlidingTabLayout;
import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseFragment;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.live.LiveOtherTwoColumnModelLogic;
import com.team.zhuoke.model.logic.live.bean.LiveOtherColumn;
import com.team.zhuoke.model.logic.live.bean.LiveOtherTwoColumn;
import com.team.zhuoke.presenter.live.impl.LiveOtherTwoColumnPresenterImp;
import com.team.zhuoke.presenter.live.interfaces.LiveOtherTwoColumnContract;
import com.team.zhuoke.ui.popup.PopupLiveList;
import com.team.zhuoke.view.live.adapter.LiveOtherTwoCloumnAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import static com.team.zhuoke.R.id.img_popup_live;

/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：
 * 备注消息：
 * 修改时间：2017/2/8 上午10:22
 **/
public class LiveOtherColumnFragment extends BaseFragment<LiveOtherTwoColumnModelLogic, LiveOtherTwoColumnPresenterImp> implements LiveOtherTwoColumnContract.View {
    private static List<LiveOtherColumnFragment> mLiveOtherColumnFragment = new ArrayList<LiveOtherColumnFragment>();
    @BindView(R.id.twocolumn_tablayout)
    SlidingTabLayout twocolumnTablayout;
    @BindView(R.id.livetwocolumn_viewpager)
    ViewPager livetwocolumnViewpager;
    @BindView(R.id.rl_twocolumn_bar)
    RelativeLayout rlTwocolumnBar;
    @BindView(img_popup_live)
    ImageView imgPopupLive;
    private LiveOtherColumn mLiveOtherColumn;
    private LiveOtherTwoCloumnAdapter mLiveOtherTwoColumnAdapter;
    private String[] mTilte;

    private PopupLiveList mPopupLiveList;

    private List<LiveOtherTwoColumn> mLiveOtherTwoColumn;

    public static LiveOtherColumnFragment getInstance(LiveOtherColumn mLiveOtherColumn, int position) {
        LiveOtherColumnFragment rf = new LiveOtherColumnFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("mLiveOtherColumn", mLiveOtherColumn);
        bundle.putInt("position", position);
        mLiveOtherColumnFragment.add(position, rf);
        rf.setArguments(bundle);
        return rf;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_live_othercolumn;
    }

    @Override
    protected void onInitView(Bundle bundle) {
        mLiveOtherTwoColumn = new ArrayList<LiveOtherTwoColumn>();
//        imgPopupLive.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (mLiveOtherTwoColumn != null) {
//                    Toast.makeText(getContext(), "直播", Toast.LENGTH_LONG).show();
//                    PopupLiveList liveList = new PopupLiveList(getActivity());
//                    liveList.showPopupWindow();
////            PopupLiveList.Builder builder = new PopupLiveList.Builder(getActivity());
////            builder.addList(mLiveOtherTwoColumn);
////            mPopupLiveList = builder.build();
////            mPopupLiveList.showPopupWindow();
////            mPopupLiveList.setOnListPopupItemClickListener(what -> {
////
////
//            });
//                }
//            }
//        });
    }

    @Override
    protected void onEvent() {

    }
//
//    /**
//     * 弹框 筛选列表
//     */
//    @OnClick(img_popup_live)
//    public void popupLiveList() {
//        if (mLiveOtherTwoColumn != null) {
//            Toast.makeText(getContext(), "直播", Toast.LENGTH_LONG).show();
//            PopupLiveList liveList = new PopupLiveList(getActivity());
//            liveList.showPopupWindow();
////            PopupLiveList.Builder builder = new PopupLiveList.Builder(getActivity());
////            builder.addList(mLiveOtherTwoColumn);
////            mPopupLiveList = builder.build();
////            mPopupLiveList.showPopupWindow();
////            mPopupLiveList.setOnListPopupItemClickListener(what -> {
////
////
////            });
//        }
//    }

    @Override
    protected BaseView getViewImp() {
        Bundle arguments = getArguments();
        return mLiveOtherColumnFragment.get(arguments.getInt("position"));
    }

    @Override
    protected void lazyFetchData() {
        Bundle arguments = getArguments();
        mLiveOtherColumn = (LiveOtherColumn) arguments.getSerializable("mLiveOtherColumn");
        mPresenter.getPresenterLiveOtherTwoColumn(mLiveOtherColumn.getShort_name());

    }

    @Override
    public void showErrorWithStatus(String msg) {

    }

    /**
     * 获取二级分类 栏目
     *
     * @param mLiveOtherTwoCloumn
     */
    @Override
    public void getViewLiveOtherTwoColumn(List<LiveOtherTwoColumn> mLiveOtherTwoCloumn) {
        mTilte = new String[mLiveOtherTwoCloumn.size()];
        for (int i = 0; i < mLiveOtherTwoCloumn.size(); i++) {
            mTilte[i] = mLiveOtherTwoCloumn.get(i).getTag_name();
        }
        if (mTilte.length <= 1) {
            rlTwocolumnBar.setVisibility(View.GONE);
        }
        this.mLiveOtherTwoColumn.clear();
        this.mLiveOtherTwoColumn.addAll(mLiveOtherTwoCloumn);

        livetwocolumnViewpager.setOffscreenPageLimit(mTilte.length);
        mLiveOtherTwoColumnAdapter = new LiveOtherTwoCloumnAdapter(getChildFragmentManager(), mLiveOtherTwoCloumn, mTilte);
        livetwocolumnViewpager.setAdapter(mLiveOtherTwoColumnAdapter);
        mLiveOtherTwoColumnAdapter.notifyDataSetChanged();
        twocolumnTablayout.setViewPager(livetwocolumnViewpager, mTilte);
    }
}
