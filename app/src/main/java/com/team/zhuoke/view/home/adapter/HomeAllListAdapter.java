package com.team.zhuoke.view.home.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.team.zhuoke.model.logic.home.bean.HomeCateList;
import com.team.zhuoke.view.home.fragment.OtherHomeFragment;
import com.team.zhuoke.view.home.fragment.RecommendHomeFragment;

import java.util.List;

/**
 * 作者：${User}
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：
 * 类描述：
 * 修改时间：${DATA}1937
 */

public class HomeAllListAdapter extends FragmentStatePagerAdapter {

    private  List<HomeCateList> mHomeCateLists;
    private  String[] mTiltle;
    private FragmentManager fm;

    public HomeAllListAdapter(FragmentManager fm, List<HomeCateList> homeCateLists,String[] title)
    {
        super(fm);
        this.fm=fm;
        this.mHomeCateLists=homeCateLists;
        this.mTiltle=title;
    }

    @Override
    public int getCount() {
        return mTiltle.length;
    }
    @Override
    public CharSequence getPageTitle(int position) {

        return mTiltle[position];
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            return RecommendHomeFragment.getInstance();
        }
        OtherHomeFragment otherHomeFragment= OtherHomeFragment.getInstance(mHomeCateLists.get(position-1));
        return otherHomeFragment;
    }
}
