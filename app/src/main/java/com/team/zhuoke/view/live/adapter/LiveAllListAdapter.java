package com.team.zhuoke.view.live.adapter;

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
import com.team.zhuoke.model.logic.home.bean.HomeFaceScoreColumn;
import com.team.zhuoke.model.logic.live.bean.LiveAllList;
import com.team.zhuoke.ui.refreshview.recyclerview.BaseRecyclerAdapter;
import com.team.zhuoke.utils.CalculationUtils;
import com.team.zhuoke.view.home.adapter.HomeRecommendHotColumnAdapter;

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
public class LiveAllListAdapter extends BaseRecyclerAdapter<RecyclerView.ViewHolder> {

    private List<LiveAllList> mLiveList;
    private Context context;

    public LiveAllListAdapter(Context context) {
        this.context = context;
        this.mLiveList = new ArrayList<LiveAllList>();
    }

    public void getLiveAllList(List<LiveAllList> mLiveList) {

//         notifyItemRangeChanged(this.mLiveList.size(),this.mLiveList.size());
        this.mLiveList.clear();
        this.mLiveList.addAll(mLiveList);
//        notifyItemRangeInserted(this.mLiveList.size(),this.mLiveList.size());
//        notifyItemInserted(this.mLiveList.size());
        notifyDataSetChanged();
    }

    public void getLiveAllListLoadMore(List<LiveAllList> mLiveList) {
//        notifyItemRangeChanged(this.mLiveList.size(),this.mLiveList.size());
        this.mLiveList.addAll(mLiveList);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(View view) {
        return new LiveAllListHolder(view);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType, boolean isItem) {
        return new LiveAllListHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_recommend_view, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position, boolean isItem) {
        if (holder instanceof LiveAllListHolder) {
            bindLiveAll((LiveAllListHolder) holder, position);
        }
    }

    private void bindLiveAll(LiveAllListHolder holder, int position) {
        holder.img_item_gridview.setImageURI(Uri.parse(mLiveList.get(position).getVertical_src()));
        holder.tv_column_item_nickname.setText(mLiveList.get(position).getRoom_name());
        holder.tv_nickname.setText(mLiveList.get(position).getNickname());
        holder.tv_online_num.setText(CalculationUtils.getOnLine(mLiveList.get(position).getOnline()));
    }

    @Override
    public int getAdapterItemCount() {
        return this.mLiveList.size();
    }
    public class LiveAllListHolder extends BaseViewHolder {
        //        图片
        public SimpleDraweeView img_item_gridview;
        //        房间名称
        public TextView tv_column_item_nickname;
        //        在线人数
        public TextView tv_online_num;
        //        昵称
        public TextView tv_nickname;

        public LiveAllListHolder(View view) {
            super(view);
            img_item_gridview = (SimpleDraweeView) view.findViewById(R.id.img_item_gridview);
            tv_column_item_nickname = (TextView) view.findViewById(R.id.tv_column_item_nickname);
            tv_online_num = (TextView) view.findViewById(R.id.tv_online_num);
            tv_nickname = (TextView) view.findViewById(R.id.tv_nickname);
        }
    }
}
