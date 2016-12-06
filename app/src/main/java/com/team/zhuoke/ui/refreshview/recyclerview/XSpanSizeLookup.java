package com.team.zhuoke.ui.refreshview.recyclerview;

import android.support.v7.widget.GridLayoutManager;

public class XSpanSizeLookup extends GridLayoutManager.SpanSizeLookup {

    private BaseRecyclerAdapter adapter;
    private int mSpanSize = 1;

    public XSpanSizeLookup(BaseRecyclerAdapter adapter, int spanSize) {
        this.adapter = adapter;
        this.mSpanSize = spanSize;
    }

    @Override
    public int getSpanSize(int position) {
        boolean isHeaderOrFooter = adapter.isFooter(position) || adapter.isHeader(position);
        return isHeaderOrFooter ? mSpanSize : 1;
    }
}