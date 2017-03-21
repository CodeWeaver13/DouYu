package com.team.zhuoke.ui.popup;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.team.zhuoke.R;

import butterknife.BindView;
import butterknife.OnClick;
import razerdp.basepopup.BasePopupWindow;

import static com.team.zhuoke.R.id.btn_close_popup;

/**
 * Created by Administrator on 2017/3/17 0017.
 */

public class LoginPopWindow extends BasePopupWindow  {



    @BindView(R.id.tv_login_way)
    TextView tvLoginWay;
    @BindView(btn_close_popup)
    ImageView btnClosePopup;
    @BindView(R.id.tv_login_wx)
    TextView tvLoginWx;
    @BindView(R.id.tv_login_qq)
    TextView tvLoginQq;
    @BindView(R.id.tv_login_wb)
    TextView tvLoginWb;
    @BindView(R.id.tv_login_douyu)
    TextView tvLoDouyu;
    @BindView(R.id.tv_register)
    TextView tvRegister;
//    @BindView(R.id.ll_login)
//    LinearLayout llLogin;
  public LoginPopWindow(Activity context) {
        super(context);
    }

    @Override
    protected Animation initShowAnimation() {
        return null;
    }

    @Override
    public Animator initExitAnimator() {
        AnimatorSet set = new AnimatorSet();
        set.playTogether(ObjectAnimator.ofFloat(mAnimaView, "rotationX", 0f, 90f).setDuration(400),
                ObjectAnimator.ofFloat(mAnimaView, "translationY", 0f, 250f).setDuration(400),
                ObjectAnimator.ofFloat(mAnimaView, "alpha", 1f, 0f).setDuration(400 * 3 / 2));
        return set;
    }

    @Override
    public View getClickToDismissView() {
        return btnClosePopup;
    }

    @Override
    public View onCreatePopupView() {
        return createPopupById(R.layout.popup_login);
    }

    @Override
    public View initAnimaView() {
//        btnClosePopup.setOnClickListener(this);
        return null;
    }


    @OnClick(R.id.btn_close_popup)
    public void closePopup()
    {
        Toast.makeText(getContext(),"ddd",Toast.LENGTH_LONG).show();
        this.dismiss();
    }
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.tv_login_wx:
//                mOnItemClickListener.loginByWX();
//                break;
//            case R.id.tv_login_qq:
//                mOnItemClickListener.loginByQQ();
//                break;
//            case R.id.tv_login_wb:
//                mOnItemClickListener.loginByWB();
//                break;
//            case R.id.tv_login_douyu:
//                mOnItemClickListener.loginByDouyu();
//                break;
//            case R.id.tv_register:
//                mOnItemClickListener.registe();
//            break;
//          case btn_close_popup:
//              dismiss();
//                break;
//        }


}
