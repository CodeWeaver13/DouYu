package com.team.zhuoke.view.home.adapter;

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
import com.team.zhuoke.model.logic.home.bean.HomeCate;

import java.util.List;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/12/17 下午5:37
 **/
public class HomeNgBarAdapter extends BaseAdapter {

    private List<HomeCate>  mHomeCate;
    private LayoutInflater  mInflater;
    private Context context;
//    页数下标
    private int mIndex;
//    每页显示多少
    private  int mPagerSize;

    public HomeNgBarAdapter(Context context,List<HomeCate> homeCate,int mIndex,int mPageSize)
    {
         this.context=context;
        //    移除最热栏目
//        homeCate.remove(0);
        this.mHomeCate=homeCate;
        this.mIndex=mIndex;
        this.mPagerSize=mPageSize;
        mInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mHomeCate.size()>(mIndex+1)*mPagerSize?mPagerSize:(mHomeCate.size()-mIndex*mPagerSize);
    }

    @Override
    public Object getItem(int position) {
        return mHomeCate.get(position+mIndex*mPagerSize);
    }

    @Override
    public long getItemId(int position) {
        return position+mIndex*mPagerSize;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder=null;
        if(view==null)
        {
            view=mInflater.inflate(R.layout.item_gridview,viewGroup,false);
            holder=new ViewHolder();
            holder.proName=(TextView)view.findViewById(R.id.tv_item_name);
            holder.imgIcon=(SimpleDraweeView)view.findViewById(R.id.img_item_gridview);
            view.setTag(holder);
        }
        else
        {
              holder=(ViewHolder)view.getTag();
        }
        final int pos=position+mIndex*mPagerSize;
        holder.proName.setText(mHomeCate.get(pos).getTag_name());
        holder.imgIcon.setImageURI(Uri.parse(mHomeCate.get(pos).getIcon_url()));
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"你点击了"+mHomeCate.get(pos).getTag_name(),Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
    /**
     *  定义ViewHodle
     */
    class ViewHolder
    {
        private TextView proName;

        private SimpleDraweeView imgIcon;

    }

}
