package com.team.zhuoke.view.user.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bigkoo.svprogresshud.SVProgressHUD;
import com.facebook.drawee.view.SimpleDraweeView;
import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseFragment;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.me.MeModelLogic;
import com.team.zhuoke.model.logic.me.bean.PersonInfoBean;
import com.team.zhuoke.presenter.me.impl.MePresenterImpl;
import com.team.zhuoke.presenter.me.interfaces.MeContract;
import com.team.zhuoke.ui.popup.LoginPopWindow;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：
 * 备注消息：
 * 修改时间：2016/11/14 上午11:50
 **/
public  class UserFragment extends BaseFragment<MeModelLogic, MePresenterImpl> implements MeContract
        .View {

    @BindView(R.id.iv_avatar)
    SimpleDraweeView ivAvatar;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.btn_register)
    Button btnRegister;
    @BindView(R.id.rl_not_login)
    RelativeLayout rlNotLogin;
    @BindView(R.id.tv_nickname)
    TextView tvNickname;
    @BindView(R.id.iv_setting)
    ImageView ivSetting;
    @BindView(R.id.rl_aready_login)
    RelativeLayout rlAreadyLogin;
    @BindView(R.id.iv_icon)
    ImageView ivIcon;
    @BindView(R.id.rl_history_watch)
    RelativeLayout rlHistoryWatch;
    @BindView(R.id.iv_icon1)
    ImageView ivIcon1;
    @BindView(R.id.rl_letters)
    RelativeLayout rlLetters;
    @BindView(R.id.iv_icon2)
    ImageView ivIcon2;
    @BindView(R.id.rl_my_task)
    RelativeLayout rlMyTask;
    @BindView(R.id.iv_icon3)
    ImageView ivIcon3;
    @BindView(R.id.rl_chongzhi)
    RelativeLayout rlChongzhi;
    @BindView(R.id.iv_anchor)
    ImageView ivAnchor;
    @BindView(R.id.rl_anchor_recruit)
    RelativeLayout rlAnchorRecruit;
    @BindView(R.id.iv_my_video)
    ImageView ivMyVideo;
    @BindView(R.id.rl_my_video)
    RelativeLayout rlMyVideo;
    @BindView(R.id.iv_video_collection)
    ImageView ivVideoCollection;
    @BindView(R.id.rl_video_collection)
    RelativeLayout rlVideoCollection;
    @BindView(R.id.iv_my_account)
    ImageView ivMyAccount;
    @BindView(R.id.rl_my_account)
    RelativeLayout rlMyAccount;
    @BindView(R.id.iv_image_game)
    ImageView ivImageGame;
    @BindView(R.id.rl_game_center)
    RelativeLayout rlGameCenter;
    @BindView(R.id.iv_clock)
    ImageView ivClock;
    @BindView(R.id.rl_clock)
    RelativeLayout rlClock;
    private  LoginPopWindow mLoginPopwindow;

    @Override
   public void getViewPersonInfo(PersonInfoBean personInfoBean) {

    }

    @Override
    public void showLoginPopWindow() {
//        mLoginPopwindow.showPopupWindow();
        if(mLoginPopwindow!=null)
        mLoginPopwindow.showPopupWindow();
    }

    @Override
    public void showErrorWithStatus(String msg) {

    }

    SVProgressHUD svProgressHUD;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void onInitView(Bundle bundle) {
        svProgressHUD = new SVProgressHUD(getActivity());
        mLoginPopwindow=new LoginPopWindow(getActivity());
    }

    @Override
    protected void onEvent() {

    }

    @Override
    protected BaseView getViewImp() {
        return this;
    }

    @Override
    protected void lazyFetchData() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @OnClick(R.id.btn_login)
    public void login() {
        mPresenter.Login();
    }

    @OnClick(R.id.btn_register)
    public void register(){
        mPresenter.Login();
    }

//    @Override
//    public void loginByWX() {
//
//    }
//
//    @Override
//    public void loginByQQ() {
//
//    }
//
//    @Override
//    public void loginByWB() {
//
//    }
//
//    @Override
//    public void loginByDouyu() {
//
//    }
//
//    @Override
//    public void registe() {
//
//    }
}
