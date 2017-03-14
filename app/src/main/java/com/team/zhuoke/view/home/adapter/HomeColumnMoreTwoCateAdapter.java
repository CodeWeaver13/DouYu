package com.team.zhuoke.view.home.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.team.zhuoke.model.logic.home.bean.HomeColumnMoreTwoCate;
import com.team.zhuoke.view.home.fragment.HomeColumnMoreAllListFragment;
import com.team.zhuoke.view.home.fragment.HomeColumnMoreOtherListFragment;

import java.util.List;

/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：
 * 备注消息：
 * 修改时间：2017/2/7 下午4:41
 **/
public class HomeColumnMoreTwoCateAdapter extends FragmentStatePagerAdapter {

    private List<HomeColumnMoreTwoCate> mHomeColumnMoreTwoCate;
    private String[] mTiltle;
    private FragmentManager mFragmentManager;
    private String cate_id;

    public HomeColumnMoreTwoCateAdapter(FragmentManager fm, String cate_id, List<HomeColumnMoreTwoCate> mHomeColumnMoreTwoCate, String[] title) {
        super(fm);
        this.cate_id = cate_id;
        this.mFragmentManager = fm;
        this.mHomeColumnMoreTwoCate = mHomeColumnMoreTwoCate;
        this.mTiltle = title;
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
        if (position == 0) {
            return HomeColumnMoreAllListFragment.getInstance(cate_id);
        }
        return HomeColumnMoreOtherListFragment.getInstance(mHomeColumnMoreTwoCate.get(position - 1).getId());
    }
}
