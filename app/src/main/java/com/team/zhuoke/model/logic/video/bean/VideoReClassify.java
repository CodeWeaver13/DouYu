package com.team.zhuoke.model.logic.video.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/2/10 0010.
 */

public class VideoReClassify implements Serializable{

    /**
     * cid2 : 42
     * cate2_name : 斗鱼主播闹元宵
     * cid1 : 3
     * recommend : 0
     */


    private String cid2;
    private String cate2_name;
    private String cid1;
    private String recommend;

    public String getCid2() {
        return cid2;
    }

    public void setCid2(String cid2) {
        this.cid2 = cid2;
    }

    public String getCate2_name() {
        return cate2_name;
    }

    public void setCate2_name(String cate2_name) {
        this.cate2_name = cate2_name;
    }

    public String getCid1() {
        return cid1;
    }

    public void setCid1(String cid1) {
        this.cid1 = cid1;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    @Override
    public String toString() {
        return "VideoReClassify{" +
                "cid2='" + cid2 + '\'' +
                ", cate2_name='" + cate2_name + '\'' +
                ", cid1='" + cid1 + '\'' +
                ", recommend='" + recommend + '\'' +
                '}';
    }
}
