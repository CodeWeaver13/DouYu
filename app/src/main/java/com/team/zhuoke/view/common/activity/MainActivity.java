package com.team.zhuoke.view.common.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.Toast;

import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.ui.NavigateTabBar;
import com.team.zhuoke.view.follow.fragment.FollowFragment;
import com.team.zhuoke.view.home.fragment.HomeFragment;
import com.team.zhuoke.view.live.fragment.LiveFragment;
import com.team.zhuoke.view.user.fragment.UserFragment;
import com.team.zhuoke.view.video.fragment.VideoFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/11/30 上午9:56
 **/
public class MainActivity extends  AppCompatActivity implements BaseView{
    private static final String TAG_PAGE_HOME = "首页";
    private static final String TAG_PAGE_LIVE= "直播";
    private static final String TAG_PAGE_VIDEO = "视频";
    private static final String TAG_PAGE_FOLLOW = "关注";
    private static final String TAG_PAGE_USER = "我的";
    protected Unbinder unbinder;
    //    退出时间
    private long exitTime = 0;

    @BindView(R.id.mainTabBar)
    NavigateTabBar mNavigateTabBar;
    NavigateTabBar.ViewHolder mHolder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
        mNavigateTabBar.onRestoreInstanceState(savedInstanceState);
        mNavigateTabBar.addTab(HomeFragment.class, new NavigateTabBar.TabParam(R.mipmap.home_pressed, R.mipmap
                .home_selected, TAG_PAGE_HOME));
        mNavigateTabBar.addTab(LiveFragment.class, new NavigateTabBar.TabParam(R.mipmap.live_pressed, R.mipmap
                .live_selected, TAG_PAGE_LIVE));
        mNavigateTabBar.addTab(VideoFragment.class, new NavigateTabBar.TabParam(R.mipmap.video, R
                .mipmap.video_selected, TAG_PAGE_VIDEO));
        mNavigateTabBar.addTab(FollowFragment.class, new NavigateTabBar.TabParam(R.mipmap.follow_pressed,
                R.mipmap.follow_selected, TAG_PAGE_FOLLOW));
        mNavigateTabBar.addTab(UserFragment.class, new NavigateTabBar.TabParam(R.mipmap.user_pressed, R.mipmap
                .user_selected, TAG_PAGE_USER));
        mNavigateTabBar.setTabSelectListener(new NavigateTabBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(NavigateTabBar.ViewHolder holder) {
//                Toast.makeText(MainActivity.this, "信息为:"+holder.tag, Toast.LENGTH_SHORT).show();
                switch (holder.tag.toString()) {
//                    首页
                    case TAG_PAGE_HOME:
                        mNavigateTabBar.showFragment(holder);
                        break;
//                    直播
                    case TAG_PAGE_LIVE:

                        mNavigateTabBar.showFragment(holder);
                        break;
//                    视频
                    case TAG_PAGE_VIDEO:
                        mNavigateTabBar.showFragment(holder);
                        break;
//                    关注
                    case TAG_PAGE_FOLLOW:
                        mNavigateTabBar.showFragment(holder);
                        break;
//                    我的
                    case TAG_PAGE_USER:
                        if(mNavigateTabBar!=null)
                        mNavigateTabBar.showFragment(holder);
                        break;
                }
            }
        });
//        // 获取所有权限
//        PermissionUtil.requestAllPermission(new PermissionUtil.RequestPermission() {
//            @Override
//            public void onRequestPermissionSuccess() {
//
//            }
//
//            @Override
//            public void onRequestPermissionFailed() {
//
//            }
//        }, new RxPermissions(MainActivity.this),this);
    }

    @Override
    protected void onRestart() {

        super.onRestart();
    }

    /**
     * 拦截返回键，要求点击两次返回键才退出应用
     *
     * @param keyCode 按键代码
     * @param event   点击事件
     * @return 是否处理本次事件
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void exit() {
        if ((System.currentTimeMillis() - exitTime) > 2000) {
            Toast.makeText(getApplicationContext(), "再按一次退出程序",
                    Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
        } else {
            finish();
            System.exit(0);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder != null) {
            unbinder.unbind();
        }
    }

    /**
     * 保存数据状态
     *
     * @param outState
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mNavigateTabBar.onSaveInstanceState(outState);
    }

    @Override
    public void showErrorWithStatus(String msg) {

    }
}
