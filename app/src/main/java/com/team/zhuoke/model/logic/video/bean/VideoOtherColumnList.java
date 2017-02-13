package com.team.zhuoke.model.logic.video.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/2/13 0013.
 */

public class VideoOtherColumnList implements Serializable {

    /**
     * video_duration : 7201.24
     * is_replay : 10155503
     * is_vertical : 0
     * hash_id : l0Q8mMY0nBJ749Ad
     * up_id : lOdEy3M5bdnR
     * view_num : 11173
     * utime : 1486426922
     * video_title : 卢本伟White五五开 迟到了道歉! 2017-02-06 21点场
     * video_content :
     * video_cover : https://vodpic1.douyucdn.cn/image/live-138286rAsePM5lv7--20170206212418/cover.jpg
     * nickname : White55开解说
     */

    private double video_duration;
    private String is_replay;
    private int is_vertical;
    private String hash_id;
    private String up_id;
    private String view_num;
    private int utime;
    private String video_title;
    private String video_content;
    private String video_cover;
    private String nickname;

    public double getVideo_duration() {
        return video_duration;
    }

    public void setVideo_duration(double video_duration) {
        this.video_duration = video_duration;
    }

    public String getIs_replay() {
        return is_replay;
    }

    public void setIs_replay(String is_replay) {
        this.is_replay = is_replay;
    }

    public int getIs_vertical() {
        return is_vertical;
    }

    public void setIs_vertical(int is_vertical) {
        this.is_vertical = is_vertical;
    }

    public String getHash_id() {
        return hash_id;
    }

    public void setHash_id(String hash_id) {
        this.hash_id = hash_id;
    }

    public String getUp_id() {
        return up_id;
    }

    public void setUp_id(String up_id) {
        this.up_id = up_id;
    }

    public String getView_num() {
        return view_num;
    }

    public void setView_num(String view_num) {
        this.view_num = view_num;
    }

    public int getUtime() {
        return utime;
    }

    public void setUtime(int utime) {
        this.utime = utime;
    }

    public String getVideo_title() {
        return video_title;
    }

    public void setVideo_title(String video_title) {
        this.video_title = video_title;
    }

    public String getVideo_content() {
        return video_content;
    }

    public void setVideo_content(String video_content) {
        this.video_content = video_content;
    }

    public String getVideo_cover() {
        return video_cover;
    }

    public void setVideo_cover(String video_cover) {
        this.video_cover = video_cover;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "VideoOtherColumnList{" +
                "video_duration=" + video_duration +
                ", is_replay='" + is_replay + '\'' +
                ", is_vertical=" + is_vertical +
                ", hash_id='" + hash_id + '\'' +
                ", up_id='" + up_id + '\'' +
                ", view_num='" + view_num + '\'' +
                ", utime=" + utime +
                ", video_title='" + video_title + '\'' +
                ", video_content='" + video_content + '\'' +
                ", video_cover='" + video_cover + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
