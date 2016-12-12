package com.team.zhuoke.view.home.fragment;

import android.os.Bundle;
import android.widget.Button;

import com.bigkoo.svprogresshud.SVProgressHUD;
import com.team.zhuoke.R;
import com.team.zhuoke.base.BaseFragment;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.home.HomeCateModelLogic;
import com.team.zhuoke.model.logic.home.HomeModelLogic;
import com.team.zhuoke.presenter.home.impl.HomeCatePresenterImp;
import com.team.zhuoke.presenter.home.impl.HomePresenterImp;
import com.team.zhuoke.presenter.home.interfaces.HomeCateContract;
import com.team.zhuoke.presenter.home.interfaces.HomeContract;

import butterknife.BindView;
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
public class HomeFragment extends BaseFragment<HomeCateModelLogic,HomeCatePresenterImp> implements HomeCateContract.View{
    @BindView(R.id.btn_home)
    Button btnHome;
    SVProgressHUD svProgressHUD;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void onInitView(Bundle bundle) {
      svProgressHUD=new SVProgressHUD(getActivity());

    }
    @Override
    protected void onEvent() {

    }

    @Override
    protected BaseView getViewImp() {
        return this;
    }

    @OnClick(R.id.btn_home)
    public void home()
    {
     mPresenter.getHomeCate("3e760da75be261a588c74c483063236");
    }

}
