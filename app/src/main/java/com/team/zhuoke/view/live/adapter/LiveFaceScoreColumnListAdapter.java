package com.team.zhuoke.view.live.adapter;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.team.zhuoke.R;
import com.team.zhuoke.model.logic.home.bean.HomeFaceScoreColumn;
import com.team.zhuoke.model.logic.live.bean.LiveOtherList;
import com.team.zhuoke.ui.refreshview.recyclerview.BaseRecyclerAdapter;
import com.team.zhuoke.utils.CalculationUtils;
import com.team.zhuoke.view.common.activity.PcLiveVideoActivity;
import com.team.zhuoke.view.common.activity.PhoneLiveVideoActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：  颜值栏目
 * 备注消息：
 * 修改时间：2017/1/17 下午1:44
 **/
public class LiveFaceScoreColumnListAdapter extends BaseRecyclerAdapter<RecyclerView.ViewHolder> {
    private List<LiveOtherList> mFaceScoreColumn;
    private Context context;

    public LiveFaceScoreColumnListAdapter(Context context) {
        this.context = context;
        this.mFaceScoreColumn = new ArrayList<LiveOtherList>();
    }

    public void getFaceScoreColumn(List<LiveOtherList> mFaceScoreColumn) {
          this.mFaceScoreColumn.clear();
        this.mFaceScoreColumn.addAll(mFaceScoreColumn);
        notifyDataSetChanged();
    }
    public void getFaceScoreColumnLoadMore(List<LiveOtherList> mFaceScoreColumn) {
        this.mFaceScoreColumn.addAll(mFaceScoreColumn);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(View view) {
        return new FaceScoreColumnHolder(view);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType, boolean isItem) {
        return new FaceScoreColumnHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_recommend_facescore, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position, boolean isItem) {
        if (holder instanceof FaceScoreColumnHolder) {
            bindFaceScoreHolder((FaceScoreColumnHolder) holder, position);

        }
    }
    private void bindFaceScoreHolder(FaceScoreColumnHolder holder, int position) {
        holder.img_item_gridview.setImageURI(Uri.parse(mFaceScoreColumn.get(position).getVertical_src()));
        holder.tv_column_item_nickname.setText(mFaceScoreColumn.get(position).getNickname());
        holder.tv_online_num.setText(CalculationUtils.getOnLine(mFaceScoreColumn.get(position).getOnline()));
        holder.tv_facescore_city.setText(mFaceScoreColumn.get(position).getAnchor_city());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PhoneLiveVideoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("Room_id",mFaceScoreColumn.get(position).getRoom_id());
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getAdapterItemCount() {
        return mFaceScoreColumn.size();
    }

    public class FaceScoreColumnHolder extends BaseViewHolder {
        public SimpleDraweeView img_item_gridview;
        public TextView tv_column_item_nickname;
        public TextView tv_online_num;
        public TextView tv_facescore_city;

        public FaceScoreColumnHolder(View view) {
            super(view);
            img_item_gridview = (SimpleDraweeView) view.findViewById(R.id.img_item_gridview);
            tv_column_item_nickname = (TextView) view.findViewById(R.id.tv_column_item_nickname);
            tv_online_num = (TextView) view.findViewById(R.id.tv_online_num);
            tv_facescore_city = (TextView) view.findViewById(R.id.tv_facescore_city);
        }
    }
}
