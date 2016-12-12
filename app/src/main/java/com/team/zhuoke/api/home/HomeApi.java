package com.team.zhuoke.api.home;

import com.team.zhuoke.api.NetWorkApi;
import com.team.zhuoke.model.logic.home.HomeCate;
import com.team.zhuoke.net.response.HttpResponse;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;
/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/12/12 下午4:12
 **/
public interface HomeApi {
    /**
     *  首页分类列表
     * @return
     */
    @GET(NetWorkApi.getHomeCate)
    Observable<HttpResponse<List<HomeCate>>> getHomeCate(@Query("identification") String identification);

}
