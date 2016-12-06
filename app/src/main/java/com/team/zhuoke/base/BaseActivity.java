package com.team.zhuoke.base;


import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.team.zhuoke.model.ContractProxy;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity<T extends BasePresenter> extends RxAppCompatActivity implements BaseView<T> {
    //    定义Presenter
    protected  T mPresenter;
    protected Unbinder unbinder;

    //    获取布局资源文件
    protected  abstract  int getLayoutId();

//    初始化数据

    protected  abstract void onInitView(Bundle bundle);

//    初始化事件Event

    protected  abstract  void onEvent();

    //    获得抽取接口Class对象
    protected  abstract  Class getContractClazz();



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getLayoutId()!=0)
        {
//            设置布局资源文件
            setContentView(getLayoutId());
//            注解绑定
            unbinder=  ButterKnife.bind(this);
            bindPresenter();
            onInitView(savedInstanceState);
            onEvent();
        }
    }

    private  void bindPresenter()
    {
        if(getContractClazz()!=null)
        {
            mPresenter=getPresenterImpl();
        }
    }

    private <T> T getPresenterImpl()
    {

        return ContractProxy.getInstance().bind(getContractClazz(),this);
    }

    @Override
    protected void onStart() {

        if(mPresenter!=null&&!mPresenter.isViewBind())
        {
            ContractProxy.getInstance().bind(getContractClazz(),this);
        }
        super.onStart();
    }

    /**
     *  activity摧毁
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder != null) {
            unbinder.unbind();
        }
        if(mPresenter!=null)
        {
            ContractProxy.getInstance().unbind(getContractClazz(),this);
            mPresenter.detachView();
        }
    }
    /**
     * 控制APP字体不受系统字体大小影响
     *
     * @return res
     */
    @Override
    public Resources getResources() {
        Resources res = super.getResources();
        Configuration config = new Configuration();
        config.setToDefaults();
        res.updateConfiguration(config, res.getDisplayMetrics());
        return res;
    }
}
