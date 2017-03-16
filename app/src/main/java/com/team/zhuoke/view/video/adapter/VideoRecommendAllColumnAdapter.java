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
import com.team.zhuoke.model.logic.video.bean.VideoRecommendHotCate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *  全部栏目
 *
 */
public class VideoRecommendAllColumnAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<VideoRecommendHotCate.VideoListBean> mVideoListEntity;
    private  Context context;

    public VideoRecommendAllColumnAdapter(Context context, List<VideoRecommendHotCate.VideoListBean> mVideoListEntity)
    {
          this.context=context;
          this.mVideoListEntity=mVideoListEntity;
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
        holder.img_item_gridview.setImageURI(Uri.parse(mVideoListEntity.get(position).getVideo_cover()));
        holder.tv_column_item_nickname.setText(mVideoListEntity.get(position).getVideo_title());
        holder.tv_nickname.setText(mVideoListEntity.get(position).getNickname());

        String str=String.valueOf(mVideoListEntity.get(position).getCtime());
//        DateFormat df = new SimpleDateFormat("HH:mm:ss");
//        Double etDay=0.0;
//        Double etTime=0.0;
//        try {
//            etDay = Double.parseDouble(df.parse(str).getTime()/ (1000 * 60 * 60 * 24) + "");
//            etTime = df.parse(str).getHours()/24.0 +
//                    df.parse(str).getMinutes()/(24.0*60)+
//                    df.parse(str).getSeconds()/(24.0*60*60);
//        } catch (NumberFormatException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (ParseException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

        SimpleDateFormat mSimpeDateFormat=new SimpleDateFormat("hh:mm:ss");
        Date date=new Date( mVideoListEntity.get(position).getCtime());
        holder.tv_video_time.setText(mSimpeDateFormat.format(date));
        holder.tv_watchnum.setText(Integer.toString(mVideoListEntity.get(position).getView_num()));
    }
    @Override
    public int getItemCount() {
        return mVideoListEntity.size();
    }
    public class HotColumnHolder extends  BaseViewHolder
    {
        //        图片
        public  SimpleDraweeView  img_item_gridview;
        //        房间名称
        public TextView tv_column_item_nickname;
        //        在线人数
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
