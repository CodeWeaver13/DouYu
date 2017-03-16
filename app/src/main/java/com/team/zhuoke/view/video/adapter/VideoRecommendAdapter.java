package com.team.zhuoke.view.video.adapter;

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
import com.team.zhuoke.model.logic.video.bean.VideoHotAuthorColumn;
import com.team.zhuoke.model.logic.video.bean.VideoHotColumn;
import com.team.zhuoke.model.logic.video.bean.VideoRecommendHotCate;
import com.team.zhuoke.ui.refreshview.recyclerview.BaseRecyclerAdapter;
import com.team.zhuoke.view.home.activity.HomeRecommendFaceScoreActivity;
import com.team.zhuoke.view.home.adapter.FullyGridLayoutManager;

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
public class VideoRecommendAdapter extends BaseRecyclerAdapter<RecyclerView.ViewHolder> {

    //    最热栏目
    private List<VideoHotColumn> mVideoHotColumn;
    //    作者栏目
    private List<VideoHotAuthorColumn> mVideoHotAuthorColumn;
    private Context context;
    //    最热adapter
    private VideoRecommendHotColumnAdapter mHotColumnAdapter;
    //    作者
    private VideoHotAuthorColumnAdapter mVideoHotAuthorColumnAdapter;
    //    全部栏目
    private List<VideoRecommendHotCate> mVideoRecommendHotCate;
    private VideoRecommendAllColumnAdapter mAllColumnAdapter;


    /**
     * 指定 type类型
     */
//    最热栏目
    public static final int TYPE_1 = 0xff01;
    public static final int TYPE_2 = 0xff02;
    public static final int TYPE_3 = 0xff03;

    public VideoRecommendAdapter(Context context) {
        this.context = context;
        mVideoHotColumn = new ArrayList<VideoHotColumn>();
        mVideoHotAuthorColumn = new ArrayList<VideoHotAuthorColumn>();
        mVideoRecommendHotCate = new ArrayList<VideoRecommendHotCate>();
        mVideoHotAuthorColumnAdapter = new VideoHotAuthorColumnAdapter(context);

    }

    /**
     * 最热栏目
     *
     * @param mVideoHotColumn
     */
    public void getVideoHotColumn(List<VideoHotColumn> mVideoHotColumn) {
        this.mVideoHotColumn.clear();
        this.mVideoHotColumn.addAll(mVideoHotColumn);
        notifyDataSetChanged();
    }

    /**
     * 作者栏目
     *
     * @param
     */
    public void getFaceScoreColmun(List<VideoHotAuthorColumn> mVideoHotAuthorColumn) {
        this.mVideoHotAuthorColumn.clear();
        this.mVideoHotAuthorColumn.addAll(mVideoHotAuthorColumn);
        mVideoHotAuthorColumnAdapter.getFaceScoreColumn(mVideoHotAuthorColumn);
        notifyDataSetChanged();
    }

    /**
     * 全部栏目
     *
     * @param mVideoRecommendHotCate
     */
    public void getAllColumn(List<VideoRecommendHotCate> mVideoRecommendHotCate) {
        this.mVideoRecommendHotCate.clear();
        this.mVideoRecommendHotCate.addAll(mVideoRecommendHotCate);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(View view) {
        return new ColumnViewHolder(view);
    }

    @Override
    public VideoRecommendAdapter.ColumnViewHolder onCreateViewHolder(ViewGroup parent, int viewType, boolean isItem) {
        switch (viewType) {
            case TYPE_1:
                return new ColumnViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video_recommend, parent, false));
            case TYPE_2:
                return new ColumnViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_recommend, parent, false));
            case TYPE_3:
                return new ColumnViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_recommend, parent, false));
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position, boolean isItem) {
        if (holder instanceof ColumnViewHolder && position == 0) {
            bindColumnHolder((ColumnViewHolder) holder, position);
        } else if (holder instanceof ColumnViewHolder && position == mVideoRecommendHotCate.size()+1) {
            bindFaceScoreColumnHolder((ColumnViewHolder) holder, position, isItem);
        } else {
            bindAllColumnHolder((ColumnViewHolder) holder, position);
        }
    }

    /**
     * 全部栏目
     *
     * @param holder
     * @param position
     */
    private void bindAllColumnHolder(ColumnViewHolder holder, int position) {
        holder.img_column_icon.setImageResource(R.mipmap.icon_column);
        holder.tv_column_name.setText(mVideoRecommendHotCate.get(position - 1).getCate_name());
        holder.rv_column_list.setLayoutManager(new FullyGridLayoutManager(holder.rv_column_list.getContext(), 2, GridLayoutManager.VERTICAL, false));
        mAllColumnAdapter = new VideoRecommendAllColumnAdapter(holder.rv_column_list.getContext(), mVideoRecommendHotCate.get(position - 1).getVideo_list());
        holder.rv_column_list.setAdapter(mAllColumnAdapter);
        holder.rl_column_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HomeRecommendFaceScoreActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("title", holder.tv_column_name.getText().toString());
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
    }

    /**
     *  热门作者
     * @param holder
     * @param position
     * @param isItem
     */
    private void bindFaceScoreColumnHolder(ColumnViewHolder holder, int position, boolean isItem) {

        holder.img_column_icon.setImageResource(R.mipmap.icon_reco_mobile);
        holder.tv_column_name.setText("热门作者");
        holder.rv_column_list.setLayoutManager(new FullyGridLayoutManager(holder.rv_column_list.getContext(), 1, GridLayoutManager.VERTICAL, false));
        holder.rv_column_list.setAdapter(mVideoHotAuthorColumnAdapter);
        holder.rl_column_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HomeRecommendFaceScoreActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("title", holder.tv_column_name.getText().toString());
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getAdapterItemViewType(int position) {
        if (position == 0) {
            return TYPE_1;
        } else if (position == mVideoRecommendHotCate.size()+1) {
            return TYPE_2;
        }
        return TYPE_3;
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
     *  最热栏目
     *
     * @param holder
     * @param position
     */
    private void bindColumnHolder(ColumnViewHolder holder, int position) {
        holder.img_column_icon.setImageResource(R.mipmap.reco_game_txt_icon);
        holder.tv_column_name.setText("热门视频");
        holder.rv_column_list.setLayoutManager(new FullyGridLayoutManager(holder.rv_column_list.getContext(), 2, GridLayoutManager.VERTICAL, false));
        mHotColumnAdapter = new VideoRecommendHotColumnAdapter(holder.rv_column_list.getContext(), mVideoHotColumn);
        holder.rv_column_list.setAdapter(mHotColumnAdapter);

    }

    @Override
    public int getAdapterItemCount() {
        return mVideoRecommendHotCate.size() + 2;
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
