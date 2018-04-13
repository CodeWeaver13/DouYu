package com.team.zhuoke.model.logic.video.bean;

/**
 * Created by Administrator on 2017/2/7 0007.
 */
public class VideoHotColumn {

    /**
     * point_id : 207388
     * hash_id : pDrwnvzAB8lWPNaX
     * cid1 : 3
     * cid2 : 18
     * up_id : Y6dBoVYLyA08
     * nickname : 白兔糖Q
     * is_replay : 0
     * is_vertical : 0
     * is_re_audit : 0
     * video_title : 【长腿福利】卡丁车赛道鬼步舞，黑色紧身衣
     * video_status : 0
     * video_content :
     * video_cover : https://vpic.douyucdn.cn/201702/01/20/5fb454a06a81c06e284bef92a8addbf2.jpg
     * video_duration : 200.76
     * view_num : 30337
     * ctime : 1485950821
     * utime : 1485950821
     * video_source : 1
     */

    private int point_id;
    private String hash_id;
    private int cid1;
    private int cid2;
    private String up_id;
    private String nickname;
    private int is_replay;
    private int is_vertical;
    private int is_re_audit;
    private String video_title;
    private int video_status;
    private String video_content;
    private String video_cover;
    private double video_duration;
    private int view_num;
    private int ctime;
    private int utime;
    private int video_source;

    public int getPoint_id() {
        return point_id;
    }

    public void setPoint_id(int point_id) {
        this.point_id = point_id;
    }

    public String getHash_id() {
        return hash_id;
    }

    public void setHash_id(String hash_id) {
        this.hash_id = hash_id;
    }

    public int getCid1() {
        return cid1;
    }

    public void setCid1(int cid1) {
        this.cid1 = cid1;
    }

    public int getCid2() {
        return cid2;
    }

    public void setCid2(int cid2) {
        this.cid2 = cid2;
    }

    public String getUp_id() {
        return up_id;
    }

    public void setUp_id(String up_id) {
        this.up_id = up_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getIs_replay() {
        return is_replay;
    }

    public void setIs_replay(int is_replay) {
        this.is_replay = is_replay;
    }

    public int getIs_vertical() {
        return is_vertical;
    }

    public void setIs_vertical(int is_vertical) {
        this.is_vertical = is_vertical;
    }

    public int getIs_re_audit() {
        return is_re_audit;
    }

    public void setIs_re_audit(int is_re_audit) {
        this.is_re_audit = is_re_audit;
    }

    public String getVideo_title() {
        return video_title;
    }

    public void setVideo_title(String video_title) {
        this.video_title = video_title;
    }

    public int getVideo_status() {
        return video_status;
    }

    public void setVideo_status(int video_status) {
        this.video_status = video_status;
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

    public double getVideo_duration() {
        return video_duration;
    }

    public void setVideo_duration(double video_duration) {
        this.video_duration = video_duration;
    }

    public int getView_num() {
        return view_num;
    }

    public void setView_num(int view_num) {
        this.view_num = view_num;
    }

    public int getCtime() {
        return ctime;
    }

    public void setCtime(int ctime) {
        this.ctime = ctime;
    }

    public int getUtime() {
        return utime;
    }

    public void setUtime(int utime) {
        this.utime = utime;
    }

    public int getVideo_source() {
        return video_source;
    }

    public void setVideo_source(int video_source) {
        this.video_source = video_source;
    }

    @Override
    public String toString() {
        return "VideoHotColumn{" +
                "point_id=" + point_id +
                ", hash_id='" + hash_id + '\'' +
                ", cid1=" + cid1 +
                ", cid2=" + cid2 +
                ", up_id='" + up_id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", is_replay=" + is_replay +
                ", is_vertical=" + is_vertical +
                ", is_re_audit=" + is_re_audit +
                ", video_title='" + video_title + '\'' +
                ", video_status=" + video_status +
                ", video_content='" + video_content + '\'' +
                ", video_cover='" + video_cover + '\'' +
                ", video_duration=" + video_duration +
                ", view_num=" + view_num +
                ", ctime=" + ctime +
                ", utime=" + utime +
                ", video_source=" + video_source +
                '}';
    }
}
