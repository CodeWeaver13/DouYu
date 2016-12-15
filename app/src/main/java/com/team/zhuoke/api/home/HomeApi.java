package com.team.zhuoke.api.home;

import com.team.zhuoke.api.NetWorkApi;
import com.team.zhuoke.model.logic.home.HomeCate;
import com.team.zhuoke.model.logic.home.HomeCateList;
import com.team.zhuoke.net.response.HttpResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

import static com.team.zhuoke.api.NetWorkApi.getHomeCate;
import static com.team.zhuoke.api.NetWorkApi.getHomeCateList;

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
    @GET(getHomeCateList)
    Observable<HttpResponse<List<HomeCateList>>>  getHomeCateList(@QueryMap Map<String,String> params);

    /**
     *   首页 列表详情页
     * @return
     */
    @GET(getHomeCate)
    Observable<HttpResponse<List<HomeCate>>> getHomeCate(@QueryMap Map<String,String> params);

}
