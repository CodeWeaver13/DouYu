package com.team.zhuoke.view.video.adapter;


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
import com.team.zhuoke.model.logic.video.bean.VideoHotColumn;
import com.team.zhuoke.utils.CalculationUtils;

import java.util.List;

/**
 *  最热栏目
 *
 */
public class VideoRecommendHotColumnAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<VideoHotColumn> mVideoHotColumn;
    private  Context context;

    public VideoRecommendHotColumnAdapter(Context context, List<VideoHotColumn> mVideoHotColumn)
    {
          this.context=context;
          this.mVideoHotColumn=mVideoHotColumn;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HotColumnHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video_recommend_view,parent,false));
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            if(holder instanceof HotColumnHolder)
            {
                bindHotColumun((HotColumnHolder) holder,position);
            }
    }
    private void bindHotColumun(HotColumnHolder holder, int position) {
         holder.img_item_gridview.setImageURI(Uri.parse(mVideoHotColumn.get(position).getVideo_cover()));
         holder.tv_column_item_nickname.setText(mVideoHotColumn.get(position).getVideo_title());
         holder.tv_nickname.setText(mVideoHotColumn.get(position).getNickname());
//       holder.tv_video_time.setText(mVideoHotColumn.get(position).getCtime());
        holder.tv_watchnum.setText(CalculationUtils.getOnLine(mVideoHotColumn.get(position).getView_num()));
    }
    @Override
    public int getItemCount() {
        return mVideoHotColumn.size();
    }
    public class HotColumnHolder extends  BaseViewHolder
    {
//        图片
        public  SimpleDraweeView  img_item_gridview;
//        房间名称
        public TextView tv_column_item_nickname;

        public TextView tv_video_time;
//        昵称
        public TextView tv_nickname;

        public TextView tv_watchnum;

        public HotColumnHolder(View view) {
            super(view);
            img_item_gridview=(SimpleDraweeView)view.findViewById(R.id.img_item_gridview);
            tv_column_item_nickname=(TextView)view.findViewById(R.id.tv_column_item_nickname);
            tv_video_time=(TextView)view.findViewById(R.id.tv_video_time);
            tv_nickname=(TextView)view.findViewById(R.id.tv_nickname);
            tv_watchnum=(TextView)view.findViewById(R.id.tv_watchnum);
        }
    }
}
