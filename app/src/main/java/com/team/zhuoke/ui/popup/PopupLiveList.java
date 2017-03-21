package com.team.zhuoke.ui.popup;

import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.GridView;

import com.team.zhuoke.R;
import com.team.zhuoke.view.live.adapter.LivePopupListAdapter;

import razerdp.basepopup.BasePopupWindow;

/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述：   直播弹框筛选列表
 * 备注消息：
 * 修改时间：2017/3/13 下午4:37
 **/
public class PopupLiveList extends BasePopupWindow {

    private GridView mListView;
    private LivePopupListAdapter mLivePopupAdapter;
//    private OnListPopupItemClickListener mOnListPopupItemClickListener;

    public PopupLiveList(Activity context) {
        super(context);
    }

//    private PopupLiveList(Activity context, Builder builder) {
//        this(context);
//        mListView = (GridView) findViewById(R.id.rv_column_list);
//        setAdapter(context, builder);
//    }
//
//    public static class Builder {
//        private List<LiveOtherTwoColumn> mLiveOtherList;
//        private Activity mContext;
//
//        public Builder(Activity context) {
//            mLiveOtherList = new ArrayList<LiveOtherTwoColumn>();
//            mContext = context;
//        }
//
//        public void addList(List<LiveOtherTwoColumn> liveOther) {
//            this.mLiveOtherList.clear();
//            this.mLiveOtherList.addAll(liveOther);
//        }
//
//        public List<LiveOtherTwoColumn> getItemEventList() {
//            return mLiveOtherList;
//        }
//
//        public PopupLiveList build() {
//            return new PopupLiveList(mContext, this);
//        }
//    }


    @Override
    protected Animation initShowAnimation() {

        return null;
    }

//    @Override
//    public Animator initShowAnimator() {
//        AnimatorSet set = new AnimatorSet();
//        set.playTogether(ObjectAnimator.ofFloat(mAnimaView, "rotationX", 90f, 0f).setDuration(400),
//                ObjectAnimator.ofFloat(mAnimaView, "translationY", 250f, 0f).setDuration(400),
//                ObjectAnimator.ofFloat(mAnimaView, "alpha", 0f, 1f).setDuration(400 * 3 / 2));
//        return set;
//    }

    @Override
    public View getClickToDismissView() {
        return getPopupWindowView();
    }

    @Override
    public View onCreatePopupView() {
        return createPopupById(R.layout.popup_live_list);
    }

    @Override
    public View initAnimaView() {
        return findViewById(R.id.rv_column_list);
    }
//    @Override
//    public Animator initExitAnimator() {
//        AnimatorSet set = new AnimatorSet();
//        set.playTogether(ObjectAnimator.ofFloat(mAnimaView, "rotationX", 0f, 90f).setDuration(400),
//                ObjectAnimator.ofFloat(mAnimaView, "translationY", 0f, 250f).setDuration(400),
//                ObjectAnimator.ofFloat(mAnimaView, "alpha",1f, 0f).setDuration(400 * 3 / 2));
//        return set;
//    }
//
//    private void setAdapter(Activity context, Builder builder) {
//        if (builder.getItemEventList() == null || builder.getItemEventList().size() == 0) return;
//
//        final LivePopupListAdapter adapter = new LivePopupListAdapter(context, builder.getItemEventList());
//        mListView.setAdapter(adapter);
////        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
////            @Override
////            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
////                if (mOnListPopupItemClickListener != null) {
////                    Object clickObj = builder.getItemEventList();
////                    if (clickObj instanceof LiveOtherTwoColumn) {
////                        mOnListPopupItemClickListener.onItemClick(position);
////                    }
////                }
////            }
////        });
//
//    }
//
//    public OnListPopupItemClickListener getOnListPopupItemClickListener() {
//        return mOnListPopupItemClickListener;
//    }
//
//    public void setOnListPopupItemClickListener(OnListPopupItemClickListener onListPopupItemClickListener) {
//        mOnListPopupItemClickListener = onListPopupItemClickListener;
//    }
//
//    public interface OnListPopupItemClickListener {
//        void onItemClick(int what);
//    }
}
