package com.team.zhuoke.view.live.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;
import com.team.zhuoke.R;
import com.team.zhuoke.model.logic.home.bean.HomeRecommendHotCate;
import com.team.zhuoke.model.logic.live.bean.LiveOtherTwoColumn;
import com.team.zhuoke.ui.popup.PopupLiveList;

import java.util.List;

/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：
 * 备注消息：
 * 修改时间：2016/12/17 下午5:37
 **/
public class LivePopupListAdapter extends BaseAdapter {

    private List<LiveOtherTwoColumn> mLiveColumn;
    private LayoutInflater mInflater;
    private Context context;

    public LivePopupListAdapter(Context context, List<LiveOtherTwoColumn> mLiveColumnder) {
        this.context = context;
        this.mLiveColumn = mLiveColumnder;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mLiveColumn.size();
    }

    @Override
    public Object getItem(int position) {
        return mLiveColumn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view == null) {
            view = mInflater.inflate(R.layout.item_popup_live_gridview, viewGroup, false);
            holder = new ViewHolder();
            holder.proName = (TextView) view.findViewById(R.id.tv_item_name);
            holder.imgIcon = (SimpleDraweeView) view.findViewById(R.id.img_item_gridview);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.proName.setText(mLiveColumn.get(position).getTag_name());
        holder.imgIcon.setImageURI(Uri.parse(mLiveColumn.get(position).getIcon_url()));
        return view;
    }

    /**
     * 定义ViewHodle
     */
    class ViewHolder {
        private TextView proName;

        private SimpleDraweeView imgIcon;

    }

}
