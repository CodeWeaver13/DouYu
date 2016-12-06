package com.team.zhuoke.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import com.team.zhuoke.model.ContractProxy;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;
/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/12/5 下午3:03
 **/
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

    //    获得抽取接口Presenter对象
    protected  abstract Class getPresenterClazz();
    //    获得抽取接口Model对象
    protected  abstract Class getModelClazz();



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
            bindModel();
            onInitView(savedInstanceState);
            onEvent();
        }
    }
    private  void bindModel()
    {
        if(getModelClazz()!=null&&mPresenter!=null)
        {
            getModelImpl();
        }

    }
    private <T> T getModelImpl()
    {

        return ContractProxy.getInstance().bindModel(getModelClazz(),mPresenter);
    }
    private  void bindPresenter()
    {
        if(getPresenterClazz()!=null)
        {
            mPresenter=getPresenterImpl();
            mPresenter.mContext=this;
        }
    }

    private <T> T getPresenterImpl()
    {
        return ContractProxy.getInstance().bindPresenter(getPresenterClazz(),this);
    }

    @Override
    protected void onStart() {

        if(mPresenter!=null&&!mPresenter.isViewBind())
        {
            ContractProxy.getInstance().bindPresenter(getPresenterClazz(),this);
            ContractProxy.getInstance().bindModel(getModelClazz(),mPresenter);
            mPresenter.mContext=this;
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
            ContractProxy.getInstance().unbindPresenter(getPresenterClazz(),this);
            ContractProxy.getInstance().unbindModel(getModelClazz(),mPresenter);
            mPresenter.detachView();
        }
    }
}
