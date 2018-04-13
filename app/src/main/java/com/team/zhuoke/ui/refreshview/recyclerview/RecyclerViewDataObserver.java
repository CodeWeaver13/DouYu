package com.team.zhuoke.ui.refreshview.recyclerview;

import android.support.v7.widget.RecyclerView;

import com.team.zhuoke.ui.refreshview.XRefreshView;


/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：16/10/26 下午1:29
 **/

public class RecyclerViewDataObserver extends RecyclerView.AdapterDataObserver {
    private BaseRecyclerAdapter mAdapter;
    private XRefreshView xRefreshView;
    private boolean mAttached;
    private boolean hasData = true;

    public RecyclerViewDataObserver() {

    }

    public void setData(BaseRecyclerAdapter adapter, XRefreshView xRefreshView) {
        mAdapter = adapter;
        this.xRefreshView = xRefreshView;
//        onChanged();
    }

    private void enableEmptyView(boolean enable) {
        if (xRefreshView != null) {
            xRefreshView.enableEmptyView(enable);
        }
    }

    @Override
    public void onChanged() {
        if (mAdapter == null) {
            return;
        }
        if (mAdapter.isEmpty()) {
            if (hasData) {
                enableEmptyView(true);
                hasData = false;
            }
        } else {
            if (!hasData) {
                enableEmptyView(false);
                hasData = true;
            }
        }
    }

    @Override
    public void onItemRangeChanged(int positionStart, int itemCount, Object payload) {
        onChanged();
    }

    @Override
    public void onItemRangeChanged(int positionStart, int itemCount) {
        onChanged();
    }

    @Override
    public void onItemRangeInserted(int positionStart, int itemCount) {
        onChanged();
    }

    @Override
    public void onItemRangeRemoved(int positionStart, int itemCount) {
        onChanged();
    }

    @Override
    public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
        onChanged();
    }


    public void attach() {
        mAttached = true;
    }

    public boolean hasAttached() {
        return mAttached;
    }
}
