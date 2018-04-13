package com.team.zhuoke.model.logic.live.bean;

/**
 * 作者：${User}
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：
 * 类描述：
 * 修改时间：${DATA}1034
 */

public class LiveSportsAllList {

    /**
     * room_id : 10000014
     * room_name : 9:00【直播】快船vs尼克斯
     * game_name : NBA
     * online : 80739
     * room_src : http://rpic.qietv.douyucdn.cn/z1702/09/10/10000014_170209102708.jpg
     * nickname : 芒果解说
     */

    private String room_id;
    private String room_name;
    private String game_name;
    private int online;
    private String room_src;
    private String nickname;

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }

    public String getRoom_src() {
        return room_src;
    }

    public void setRoom_src(String room_src) {
        this.room_src = room_src;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "{" +
                "room_id:'" + room_id + '\'' +
                ", room_name:'" + room_name + '\'' +
                ", game_name:'" + game_name + '\'' +
                ", online:" + online +
                ", room_src:'" + room_src + '\'' +
                ", nickname:'" + nickname + '\'' +
                '}';
    }
}
