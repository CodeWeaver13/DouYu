package com.team.zhuoke.model.logic.live;

import android.content.Context;

import com.team.zhuoke.api.live.LiveApi;
import com.team.zhuoke.model.ParamsMapUtils;
import com.team.zhuoke.model.logic.live.bean.LiveAllList;
import com.team.zhuoke.model.logic.live.bean.LiveOtherList;
import com.team.zhuoke.net.http.HttpUtils;
import com.team.zhuoke.net.transformer.DefaultTransformer;
import com.team.zhuoke.presenter.live.interfaces.LiveOtherColumnListContract;

import java.util.List;

import rx.Observable;

import static android.R.attr.offset;

/**
 * 作者：gaoyin
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：1.0
 * 类描述： 全部直播
 * 备注消息：
 * 修改时间：2017/2/7 下午5:35
 **/
public class LiveOtherColumnListModelLogic implements LiveOtherColumnListContract.Model {
    /**
     * 获取全部视频
     *
     * @param context
     * @param offset
     * @param limit
     * @return
     */
    @Override
    public Observable<List<LiveOtherList>> getModelLiveOtherColumnList(Context context, String cate_id, int offset, int limit) {
        return HttpUtils.getInstance(context)
                .setLoadDiskCache(true)
                .getRetofitClinet()
                .builder(LiveApi.class)
                .getLiveOtherList(cate_id, ParamsMapUtils.getHomeFaceScoreColumn(offset, limit))
//               进行预处理
                .compose(new DefaultTransformer<List<LiveOtherList>>());
    }
}
