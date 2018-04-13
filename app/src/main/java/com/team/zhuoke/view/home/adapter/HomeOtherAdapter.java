package com.team.zhuoke.view.home.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.team.zhuoke.R;
import com.team.zhuoke.model.logic.home.bean.HomeRecommendHotCate;
import com.team.zhuoke.ui.refreshview.recyclerview.BaseRecyclerAdapter;
import com.team.zhuoke.view.home.activity.HomeColumnMoreListActivity;
import com.team.zhuoke.view.home.activity.HomeRecommendFaceScoreActivity;

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
public class HomeOtherAdapter extends BaseRecyclerAdapter<RecyclerView.ViewHolder> {

    private Context context;
    //    全部栏目
    private List<HomeRecommendHotCate> mHomeRecommendHotCate;
    private HomeRecommendAllColumnAdapter mAllColumnAdapter;

    /**
     * 指定 type类型
     */
    public static final int TYPE_1 = 0xff01;

    public HomeOtherAdapter(Context context, List<HomeRecommendHotCate> mHomeRecommendHotCate) {
        this.context = context;
        this.mHomeRecommendHotCate = mHomeRecommendHotCate;
        notifyDataSetChanged();
    }

    /**
     * 全部栏目
     *
     * @param mHomeRecommendHotCate
     */
    public void getAllColumn(List<HomeRecommendHotCate> mHomeRecommendHotCate) {
        this.mHomeRecommendHotCate.clear();
        this.mHomeRecommendHotCate.addAll(mHomeRecommendHotCate);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(View view) {
        return new ColumnViewHolder(view);
    }

    @Override
    public HomeOtherAdapter.ColumnViewHolder onCreateViewHolder(ViewGroup parent, int viewType, boolean isItem) {
        switch (viewType) {
            case TYPE_1:
                return new ColumnViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_recommend, parent, false));
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position, boolean isItem) {
        bindAllColumnHolder((ColumnViewHolder) holder, position);
    }

    /**
     * 全部栏目
     *
     * @param holder
     * @param position
     */
    private void bindAllColumnHolder(ColumnViewHolder holder, int position) {
//        if(mHomeRecommendHotCate.get(position).getRoom_list().size()>=4) {
        holder.img_column_icon.setImageResource(R.mipmap.icon_column);
        holder.tv_column_name.setText(mHomeRecommendHotCate.get(position).getTag_name());
        holder.rv_column_list.setLayoutManager(new GridLayoutManager(holder.rv_column_list.getContext(), 2, GridLayoutManager.VERTICAL, false));
        mAllColumnAdapter = new HomeRecommendAllColumnAdapter(holder.rv_column_list.getContext(), mHomeRecommendHotCate.get(position).getRoom_list());
        holder.rv_column_list.setAdapter(mAllColumnAdapter);
        holder.rl_column_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HomeColumnMoreListActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("title", holder.tv_column_name.getText().toString());
                bundle.putString("cate_id",mHomeRecommendHotCate.get(position).getTag_id());
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
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
                            return gridManager.getSpanCount();
                        default:
                            return 1;
                    }
                }
            });
        }
    }

    @Override
    public int getAdapterItemCount() {
        return mHomeRecommendHotCate.size();
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

        public LinearLayout item_home_recommed_girdview;

        public ColumnViewHolder(View itemView) {
            super(itemView);
            img_column_icon = (ImageView) itemView.findViewById(R.id.img_column_icon);
            tv_column_name = (TextView) itemView.findViewById(R.id.tv_column_name);
            rl_column_more = (RelativeLayout) itemView.findViewById(R.id.rl_column_more);
            rv_column_list = (RecyclerView) itemView.findViewById(R.id.rv_column_list);
            item_home_recommed_girdview = (LinearLayout) itemView.findViewById(R.id.item_home_recommed_girdview);
        }
    }

}
