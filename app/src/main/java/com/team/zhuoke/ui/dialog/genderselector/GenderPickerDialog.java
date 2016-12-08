package com.team.zhuoke.ui.dialog.genderselector;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.team.zhuoke.R;

import java.util.ArrayList;

/**
 * Created by YolandaLi on 2016/5/10 0010.
 */
public class GenderPickerDialog extends Dialog {


    private final static int DEFAULT_ITEMS = 5;

    private Activity mContext;

    private ArrayList<String> mGender = new ArrayList<>();
    AbstractWheelTextAdapter genderAdapter;
    WheelView genderWheel;

    public static interface onGenderPickedListener {
        public void onPicked(String selectGender);
    }

    public GenderPickerDialog(Activity context,
                              String defaultGender,
                              final onGenderPickedListener listener) {
        super(context);
        mContext = context;
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setGravity(Gravity.BOTTOM);
        getWindow().setBackgroundDrawable(
                new ColorDrawable(Color.parseColor("#00000000")));
        getWindow().setWindowAnimations(R.style.AnimBottom);
        View rootView = getLayoutInflater().inflate(
                R.layout.dialog_gender_picker, null);
        int screenWidth = mContext.getWindowManager().getDefaultDisplay()
                .getWidth();
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(screenWidth,
                ViewGroup.LayoutParams.MATCH_PARENT);
        super.setContentView(rootView, params);

        mGender.add("男");
        mGender.add("女");

        initViews();
        setDefaultArea(defaultGender);

        View done = findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (listener != null) {
                    String gender = mGender.size() > 0 ? mGender
                            .get(genderWheel.getCurrentItem()) : null;
                    listener.onPicked(gender);
                }
                dismiss();
            }
        });

        View cancel = findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

    }

    private void setDefaultArea(String defaultGender) {

        int provinceItem = 0;

        if (defaultGender == null) {
            defaultGender = mGender.get(0);
            provinceItem = 0;
        } else {
            for (int i = 0; i < mGender.size(); i++) {


                if (mGender.get(i)
                        .equals(defaultGender)) {
                    provinceItem = i;
                    break;
                }
            }
        }
        genderWheel.setCurrentItem(provinceItem, false);

    }

    private void initViews() {

        genderWheel = (WheelView) findViewById(R.id.genderWheel);


        genderAdapter = new AbstractWheelTextAdapter(mContext,
                R.layout.wheel_text) {

            @Override
            public int getItemsCount() {

                return mGender.size();
            }

            @Override
            protected CharSequence getItemText(int index) {

                return mGender.get(index);
            }
        };


        genderWheel.setViewAdapter(genderAdapter);
        genderWheel.setCyclic(false);
        genderWheel.setVisibleItems(DEFAULT_ITEMS);

        OnWheelClickedListener clickListener = new OnWheelClickedListener() {

            @Override
            public void onItemClicked(WheelView wheel, int itemIndex) {
                if (itemIndex != wheel.getCurrentItem()) {
                    wheel.setCurrentItem(itemIndex, true, 500);
                }
            }
        };

        genderWheel.addClickingListener(clickListener);

        genderWheel.addChangingListener(new OnWheelChangedListener() {

            @Override
            public void onChanged(WheelView wheel, int oldValue, int newValue) {


            }
        });

    }
}
