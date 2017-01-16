package com.team.zhuoke.view.home.adapter;


import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.team.zhuoke.R;
import com.team.zhuoke.model.logic.home.bean.HomeHotColumn;

import java.util.List;

public class HomeRecommendHotColumn extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<HomeHotColumn> mHomeHotColumn;
    private  Context context;

    public HomeRecommendHotColumn(Context context, List<HomeHotColumn> mHomeHotColumn)
    {
          this.context=context;
          this.mHomeHotColumn=mHomeHotColumn;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HotColumnHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_recommend_view,parent,false));
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            if(holder instanceof HotColumnHolder)
            {
                   ((HotColumnHolder) holder).img_item_gridview.setImageURI(Uri.parse(mHomeHotColumn.get(position).getVertical_src()));
                   ((HotColumnHolder) holder).tv_column_item_nickname.setText(mHomeHotColumn.get(position).getRoom_name());
            }
    }
    @Override
    public int getItemCount() {
        return mHomeHotColumn.size();
    }

    public class HotColumnHolder extends  BaseViewHolder
    {
        public  SimpleDraweeView  img_item_gridview;
        public TextView tv_column_item_nickname;

        public HotColumnHolder(View view) {
            super(view);
            img_item_gridview=(SimpleDraweeView)view.findViewById(R.id.img_item_gridview);
            tv_column_item_nickname=(TextView)view.findViewById(R.id.tv_column_item_nickname);
        }
    }
}
