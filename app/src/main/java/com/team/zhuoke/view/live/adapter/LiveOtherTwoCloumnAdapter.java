package com.team.zhuoke.view.live.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.team.zhuoke.model.logic.live.bean.LiveOtherTwoColumn;
import com.team.zhuoke.view.live.fragment.LiveOtherTwoColumnFragment;

import java.util.List;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2017/2/7 下午4:41
 **/
public class LiveOtherTwoCloumnAdapter extends FragmentStatePagerAdapter {

    private List<LiveOtherTwoColumn> mliveOtherTwoColumns;
    private  String[] mTiltle;
    private FragmentManager mFragmentManager;

    public LiveOtherTwoCloumnAdapter(FragmentManager fm, List<LiveOtherTwoColumn> mliveOtherTwoColumns, String[] title)
    {
        super(fm);
        this.mFragmentManager=fm;
        this.mliveOtherTwoColumns=mliveOtherTwoColumns;
        this.mTiltle=title;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTiltle[position];
    }

    @Override
    public int getCount() {
         return mTiltle.length;
    }
    @Override
    public Fragment getItem(int position) {
        return LiveOtherTwoColumnFragment.getInstance(mliveOtherTwoColumns.get(position),position);
    }
}
