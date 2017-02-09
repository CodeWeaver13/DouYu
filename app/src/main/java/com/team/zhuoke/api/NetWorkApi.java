package com.team.zhuoke.api;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：   接口Api
 *  备注消息：
 *  修改时间：2016/12/15 下午4:12
 **/
public class NetWorkApi {

//    Base地址
     public static String baseUrl="https://capi.douyucdn.cn";
    /**
     *   ************************* 首页接口*******************************
     */
    //****************************推荐模块***************************************

    //    首页轮播
    public static final String getCarousel="/api/v1/slide/6";
    //    首页---推荐---热栏目
    public static final String getHomeHotColumn="/api/v1/getbigDataRoom";
    //    首页---颜值栏目
    public static final String getHomeFaceScoreColumn="/api/v1/getVerticalRoom";
//    其他热门 种类
     public static final String getHomeRecommendHotCate="/api/v1/getHotCate";

//****************************其他***************************************
//     首页列表
  public static final String getHomeCateList="/api/homeCate/getCateList";
    //     列表详情
    public static final String getHomeCate="/api/homeCate/getHotRoom";
    /**
     *   ********************************************************************
     */
    /**
     *   ************************* 直播接口*******************************
     */
//    直播其他栏目分类
    public static final String getLiveOtherColumn="/api/v1/getColumnList";
//    全部直播
    public static final String getLiveAllList="/api/v1/live";
//    其他二级栏目分类
    public static final String getLiveOtherTwoColumn="/api/v1/getColumnDetail";
//   二级栏目分类列表
    public static final String  getLiveOtherTwoList="/api/v1/live/";
//    体育直播
    public static final String getLiveSportsAllList="/api/v1/qie";


}
