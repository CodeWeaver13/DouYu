package com.team.zhuoke.utils;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * @author: 范建海
 * @createTime: 2016/12/7 13:57
 * @className:  ViewUtil
 * @description: 处理控件相关的工具类
 * @changed by:
 */
public class ViewUtil {

    /**
     * 消除指定文本框的文本
     * @param editText 指定文本框
     * @param closeParent 关闭按钮父控件
     */
    public static void eliminateText(final EditText editText, LinearLayout closeParent) {
        if (editText != null && closeParent != null) {
            String tempStr = editText.getText().toString().trim();

            if (TextUtils.isEmpty(tempStr) || tempStr.length() <= 0) {
                closeParent.setVisibility(View.GONE);
                closeParent.setOnClickListener(null);
            }else {
                closeParent.setVisibility(View.VISIBLE);
                closeParent.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText.setText("");
                    }
                });
            }
        }
    }

    /**
     * 监听EditText焦点变化
     * @param editText
     * @param view EditText下面的横线
     */
    public static void setEditTextFocusChangeListener(EditText editText, final View view) {
        if (editText != null) {
            editText.setOnFocusChangeListener(new View.
                    OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    if (view != null) {
                        if (hasFocus) {
                            // 此处为得到焦点时的处理内容
                            view.setBackgroundColor(Color.parseColor("#47C11D"));

                        } else {
                            // 此处为失去焦点时的处理内容
                            view.setBackgroundColor(Color.parseColor("#DADADA"));
                        }
                    }

                }
            });
        }

    }
}
