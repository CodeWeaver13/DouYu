package com.team.zhuoke.net.callback;
import com.team.zhuoke.net.exception.ResponeThrowable;
import com.team.zhuoke.utils.L;

import rx.Subscriber;

/**
 * 作者：${User}
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：
 * 类描述：
 * 修改时间：${DATA}0056
 */

public abstract class ErrorSubscriber<T> extends Subscriber<T> {
    @Override
    public void onError(Throwable e) {
        L.e("错误信息:"+e.getMessage());
        if(e instanceof ResponeThrowable){
            onError((ResponeThrowable)e);
        }else{

            onError(new ResponeThrowable(e,1000));
        }
    }
    /**
     * 错误回调
     */
    protected abstract void onError(ResponeThrowable ex);
}

