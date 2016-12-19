package com.team.zhuoke.view.home.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/12/17 下午5:52
 **/
public class HomeNgBarViewPagerAdapter extends PagerAdapter {

//     GridView
    private List<View> viewLists;

    public HomeNgBarViewPagerAdapter(List<View> viewLists)
    {
         this.viewLists=viewLists;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
       container.removeView(viewLists.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(viewLists.get(position));
        return viewLists.get(position);
    }

    @Override
    public int getCount() {
        return viewLists!=null?viewLists.size():0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
