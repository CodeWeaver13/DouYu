package com.team.zhuoke.view.home.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.team.zhuoke.R;
import com.team.zhuoke.model.logic.home.bean.HomeCarousel;
import com.team.zhuoke.model.logic.home.bean.HomeHotColumn;
import com.team.zhuoke.ui.refreshview.recyclerview.BaseRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：
 * 备注消息：
 * 修改时间：2017/1/12 下午3:33
 **/
public class HomeRecommendAdapter extends BaseRecyclerAdapter<RecyclerView.ViewHolder> {

    //    最热栏目
    private List<HomeHotColumn> mHomeHotColumn;
    private Context context;
    private HomeRecommendHotColumn mHotColumnAdapter;

    /**
     * 指定 type类型
     */
//    最热栏目
    public static final int TYPE_1 = 0xff01;
    public static final int TYPE_2 = 0xff02;
    public static final int TYPE_3 = 0xff03;

    public HomeRecommendAdapter(Context context) {
        this.context = context;
        mHomeHotColumn = new ArrayList<HomeHotColumn>();
    }

    public void getHomeHotColumn(List<HomeHotColumn> mHomeHotColumn) {
        this.mHomeHotColumn.clear();
        this.mHomeHotColumn.addAll(mHomeHotColumn);
        mHotColumnAdapter = new HomeRecommendHotColumn(context,this.mHomeHotColumn);
        mHotColumnAdapter.notifyDataSetChanged();
        notifyDataSetChanged();
    }


    @Override
    public HomeRecommendAdapter.ColumnViewHolder getViewHolder(View view) {

        return new ColumnViewHolder(view);
    }

    @Override
    public HomeRecommendAdapter.ColumnViewHolder onCreateViewHolder(ViewGroup parent, int viewType, boolean isItem) {
        switch (viewType) {
            case TYPE_1:
                return new ColumnViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_recommend, parent, false));
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position, boolean isItem) {
        if (holder instanceof ColumnViewHolder) {
            bindColumnHolder((ColumnViewHolder) holder, position);
        }
    }

    @Override
    public int getAdapterItemViewType(int position) {
        return TYPE_1;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager manager = recyclerView.getLayoutManager();
        if (manager instanceof GridLayoutManager) {
            final GridLayoutManager gridManager = ((GridLayoutManager) manager);
            gridManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int position) {
                    int type = getItemViewType(position);
                    switch (type) {
                        case TYPE_1:
                        case TYPE_2:
                        case TYPE_3:
                            return gridManager.getSpanCount();
                        default:
                            return 1;
                    }
                }
            });
        }
    }

    /**
     * 栏目
     *
     * @param holder
     * @param position
     */
    private void bindColumnHolder(ColumnViewHolder holder, int position) {
        holder.rv_column_list.setLayoutManager(new FullyGridLayoutManager(holder.rv_column_list.getContext(), 2, GridLayoutManager.VERTICAL, false));
        mHotColumnAdapter = new HomeRecommendHotColumn(holder.rv_column_list.getContext(), mHomeHotColumn);
        holder.rv_column_list.setAdapter(mHotColumnAdapter);
    }


    @Override
    public int getAdapterItemCount() {
        return 100;
    }

    public class ColumnViewHolder extends RecyclerView.ViewHolder {
        //       栏目 Icon
        public ImageView img_column_icon;
        //        栏目 名称
        public TextView tv_column_name;
        //        加载更多
        public RelativeLayout rl_column_more;
        //        栏目列表
        public RecyclerView rv_column_list;

        public ColumnViewHolder(View itemView) {
            super(itemView);
            img_column_icon = (ImageView) itemView.findViewById(R.id.img_column_icon);
            tv_column_name = (TextView) itemView.findViewById(R.id.tv_column_name);
            rl_column_more = (RelativeLayout) itemView.findViewById(R.id.rl_column_more);
            rv_column_list = (RecyclerView) itemView.findViewById(R.id.rv_column_list);
        }
    }
}
