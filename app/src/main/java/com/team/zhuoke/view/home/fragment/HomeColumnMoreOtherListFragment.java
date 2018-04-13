package com.team.zhuoke.view.home.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bigkoo.svprogresshud.SVProgressHUD;
import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseFragment;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.home.HomeColumnMoreOtherListModelLogic;
import com.team.zhuoke.model.logic.home.bean.HomeColumnMoreOtherList;
import com.team.zhuoke.presenter.home.impl.HomeColumnMoreOtherListPresenterImp;
import com.team.zhuoke.presenter.home.interfaces.HomeColumnMoreOtherListContract;
import com.team.zhuoke.ui.refreshview.XRefreshView;
import com.team.zhuoke.view.home.adapter.HomeColumnMoreAllListAdapter;
import com.team.zhuoke.view.home.adapter.HomeColumnMoreOtherListAdapter;

import java.util.List;

import butterknife.BindView;

/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：
 * 备注消息：
 * 修改时间：2017/3/14 下午3:55
 **/
public class HomeColumnMoreOtherListFragment extends BaseFragment<HomeColumnMoreOtherListModelLogic, HomeColumnMoreOtherListPresenterImp> implements HomeColumnMoreOtherListContract.View {

    @BindView(R.id.other_content_recyclerview)
    RecyclerView otherContentRecyclerview;
    @BindView(R.id.rtefresh_content)
    XRefreshView rtefreshContent;

    private String cate_id;
    private SVProgressHUD svProgressHUD;
    private HomeColumnMoreOtherListAdapter mHomeColumnMoreOtherListAdapter;

    public static HomeColumnMoreOtherListFragment getInstance(String cate_id) {
        HomeColumnMoreOtherListFragment rf = new HomeColumnMoreOtherListFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("cate_id", cate_id);
        rf.setArguments(bundle);
        return rf;
    }
    /**
     * 分页加载
     */
//    起始位置
    private int offset = 0;
    //    每页加载数量
    private int limit = 20;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_column_other_cate_list;
    }

    @Override
    protected void onInitView(Bundle bundle) {
        Bundle arguments = getArguments();
        cate_id = arguments.getString("cate_id");
        setXrefeshViewConfig();
        svProgressHUD = new SVProgressHUD(getActivity());
        otherContentRecyclerview.setLayoutManager(new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, false));
        mHomeColumnMoreOtherListAdapter = new HomeColumnMoreOtherListAdapter(getActivity());
        otherContentRecyclerview.setAdapter(mHomeColumnMoreOtherListAdapter);
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
        mPresenter.getPresenterColumnMoreOtherList(cate_id, 0, 20);
    }

    private void loadMore(int offset, int limit) {
        mPresenter.getPresenterColumnMoreOtherListLoadMore(cate_id, offset, limit);
    }

    @Override
    protected void onEvent() {

    }

    @Override
    protected BaseView getViewImp() {
        return this;
    }

    @Override
    protected void lazyFetchData() {
        refresh();
    }

    @Override
    public void getViewHomeColumnOtherList(List<HomeColumnMoreOtherList> mHomeColumnMoreOtherList) {
        if (rtefreshContent != null) {
            rtefreshContent.stopRefresh();
        }
        mHomeColumnMoreOtherListAdapter.getLiveAllList(mHomeColumnMoreOtherList);
    }

    @Override
    public void getViewHomeColumnOtherListLoadMore(List<HomeColumnMoreOtherList> mHomeColumnMoreOtherList) {
        if (rtefreshContent != null) {
            rtefreshContent.stopLoadMore();
        }
        mHomeColumnMoreOtherListAdapter.getLiveAllListLoadMore(mHomeColumnMoreOtherList);
    }

    @Override
    public void showErrorWithStatus(String msg) {
        if (rtefreshContent != null) {
            rtefreshContent.stopRefresh(false);
            rtefreshContent.stopLoadMore(false);
        }
        svProgressHUD.showErrorWithStatus("网络错误,请重试!");
    }
}
