package com.team.zhuoke.view.live.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.team.zhuoke.R;
import com.team.zhuoke.model.logic.live.bean.LiveOtherList;
import com.team.zhuoke.ui.refreshview.recyclerview.BaseRecyclerAdapter;
import com.team.zhuoke.utils.CalculationUtils;
import com.team.zhuoke.view.common.activity.PcLiveVideoActivity;
import com.team.zhuoke.view.common.activity.PhoneLiveVideoActivity;

import java.util.ArrayList;
import java.util.List;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2017/2/7 下午6:17
 **/
public class LiveOtherColumnListAdapter extends BaseRecyclerAdapter<RecyclerView.ViewHolder> {

    private List<LiveOtherList> mLiveList;
    private Context context;

    public LiveOtherColumnListAdapter(Context context) {
        this.context = context;
        this.mLiveList = new ArrayList<LiveOtherList>();
    }

    public void getLiveOtherColumnList(List<LiveOtherList> mLiveList) {
        this.mLiveList.clear();
        this.mLiveList.addAll(mLiveList);
        notifyDataSetChanged();
    }

    public void getLiveOtherColumnLoadMore(List<LiveOtherList> mLiveList) {
        this.mLiveList.addAll(mLiveList);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(View view) {
        return new LiveOtherColumnListHolder(view);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType, boolean isItem) {
        return new LiveOtherColumnListHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_recommend_view, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position, boolean isItem) {
        if (holder instanceof LiveOtherColumnListHolder) {
            bindLiveAll((LiveOtherColumnListHolder) holder, position);
        }
    }

    private void bindLiveAll(LiveOtherColumnListHolder holder, int position) {
        holder.img_item_gridview.setImageURI(Uri.parse(mLiveList.get(position).getVertical_src()));
        holder.tv_column_item_nickname.setText(mLiveList.get(position).getRoom_name());
        holder.tv_nickname.setText(mLiveList.get(position).getNickname());
        holder.tv_online_num.setText(CalculationUtils.getOnLine(mLiveList.get(position).getOnline()));
        holder.rl_live_icon.setBackgroundResource(R.drawable.search_header_live_type_pc);
        if(mLiveList.get(position).getCate_id()==201)
        {
            holder.rl_live_icon.setBackgroundResource(R.drawable.search_header_live_type_mobile);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //                颜值栏目 竖屏播放
                if(mLiveList.get(position).getCate_id()==201)
                {
                    Intent intent = new Intent(context, PhoneLiveVideoActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("Room_id",mLiveList.get(position).getRoom_id());
                    intent.putExtras(bundle);
                    context.startActivity(intent);
                }else {
                    Intent intent = new Intent(context, PcLiveVideoActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("Room_id", mLiveList.get(position).getRoom_id());
                    intent.putExtras(bundle);
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getAdapterItemCount() {
        return this.mLiveList.size();
    }
    public class LiveOtherColumnListHolder extends BaseViewHolder {
        //        图片
        public SimpleDraweeView img_item_gridview;
        //        房间名称
        public TextView tv_column_item_nickname;
        //        在线人数
        public TextView tv_online_num;
        //        昵称
        public TextView tv_nickname;
        //        Icon
        public RelativeLayout rl_live_icon;

        public LiveOtherColumnListHolder(View view) {
            super(view);
            img_item_gridview = (SimpleDraweeView) view.findViewById(R.id.img_item_gridview);
            tv_column_item_nickname = (TextView) view.findViewById(R.id.tv_column_item_nickname);
            tv_online_num = (TextView) view.findViewById(R.id.tv_online_num);
            tv_nickname = (TextView) view.findViewById(R.id.tv_nickname);
            rl_live_icon=(RelativeLayout)view.findViewById(R.id.rl_live_icon);
        }
    }
}
