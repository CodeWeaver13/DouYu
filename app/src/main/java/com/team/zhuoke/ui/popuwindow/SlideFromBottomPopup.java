package com.team.zhuoke.ui.popuwindow;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;

import com.team.zhuoke.R;


/**
 * Created by zhoug on 2016/6/8.
 */
public class SlideFromBottomPopup extends BasePopubWindow implements View.OnClickListener {

    private View popuView;
    private TextView et_buy_num;
    private String num;
    private int numInt;


    public SlideFromBottomPopup(Activity context) {
        super(context);
        bindEvent();
    }
    @Override
    protected View getClickToDismissView() {
        return popuView.findViewById(R.id.click_to_dismiss);
    }

    @Override
    protected Animation getShowAnimation() {
        return getTranslateAnimation(250 * 3, 0, 700);
    }

    @Override
    public Animation getExitAnimation() {
        return getTranslateAnimation(0, 250 * 3, 700);
    }

    @Override
    public View getPopubView() {
        //
        popuView = LayoutInflater.from(mContext).inflate(R.layout.popupwindow_slidebottom, null);
        return popuView;
    }

    @Override
    public View getAnimaView() {
        return popuView.findViewById(R.id.popup_anima);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_jia_num:
                numInt++;
//                num = et_buy_num.getText().toString();
                et_buy_num.setText(String.valueOf(numInt));
//                if(num != null){
//                    int buyNum = Integer.parseInt(num);
//                    et_buy_num.setText(++buyNum);
//                }else {
//                    Toast.makeText(mContext,"请输入一个数字",Toast.LENGTH_LONG).show();
//                }
                break;
            case R.id.iv_jian_num:
                numInt--;
                if (numInt < 1) {
                    numInt = 1;
                }
                et_buy_num.setText(String.valueOf(numInt));
//                 num = et_buy_num.getText().toString();
//                if(num != null){
//                    if(num.equals("1")){
//                        Toast.makeText(mContext,"最少是1哦",Toast.LENGTH_LONG).show();
//                        return;
//                    }
//                    int buyNum = Integer.parseInt(num);
//                    et_buy_num.setText(--buyNum);
//                }else {
//                    Toast.makeText(mContext,"请输入一个数字",Toast.LENGTH_LONG).show();
//                }
                break;
            case R.id.et_buy_num:

                break;
            case R.id.iv_cancler:
                dismiss();

                break;
            case R.id.tv_begin_award:


                break;

        }
    }



    private void bindEvent() {
        if (popuView != null) {
            popuView.findViewById(R.id.iv_jia_num).setOnClickListener(this);
            popuView.findViewById(R.id.iv_jian_num).setOnClickListener(this);
            et_buy_num = (TextView) popuView.findViewById(R.id.et_buy_num);
            et_buy_num.setOnClickListener(this);
            popuView.findViewById(R.id.iv_cancler).setOnClickListener(this);
            popuView.findViewById(R.id.tv_begin_award).setOnClickListener(this);
            num = et_buy_num.getText().toString();
            numInt = TextUtils.isEmpty(num) ? 1 : Integer.parseInt(num);
        }
    }

}
