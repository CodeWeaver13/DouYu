package com.team.zhuoke.model.logic.video.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/2/8 0008.
 */

public class VideoCateList implements Serializable{

    /**
     * cid1 : 1
     * cate1_name : 游戏竞技
     * mobile_icon : https://staticlive.douyucdn.cn/upload/201610/31/19/62395b4a8c030d228dc6c77fe74e3f15.png
     */

    private String cid1;
    private String cate1_name;
    private String mobile_icon;

    public String getCid1() {
        return cid1;
    }

    public void setCid1(String cid1) {
        this.cid1 = cid1;
    }

    public String getCate1_name() {
        return cate1_name;
    }

    public void setCate1_name(String cate1_name) {
        this.cate1_name = cate1_name;
    }

    public String getMobile_icon() {
        return mobile_icon;
    }

    public void setMobile_icon(String mobile_icon) {
        this.mobile_icon = mobile_icon;
    }

    @Override
    public String toString() {
        return "VideoCateList{" +
                "cid1='" + cid1 + '\'' +
                ", cate1_name='" + cate1_name + '\'' +
                ", mobile_icon='" + mobile_icon + '\'' +
                '}';
    }
}
