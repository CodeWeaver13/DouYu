package com.team.zhuoke.model.logic.home.bean;

import java.util.List;

/**
 * 作者：${User}
 * 电话：18810474975
 * 邮箱：18810474975@163.com
 * 版本号：
 * 类描述：
 * 修改时间：${DATA}1559
 */

public class HomeCate {

    /**
     * room_list : [{"room_id":"1164160","room_src":"https://rpic.douyucdn.cn/a1612/12/15/1164160_161212154200.jpg","vertical_src":"https://rpic.douyucdn.cn/a1612/12/15/1164160_161212154200.jpg","isVertical":0,"cate_id":"240","room_name":"斗技碰瓷三兄弟！问你怕不怕？","show_status":"1","subject":"","show_time":"1481505967","owner_uid":"72902130","nickname":"云中欧凰","online":89596,"game_name":"阴阳师","child_id":"348","avatar_mid":"https://apic.douyucdn.cn/upload/avanew/face/201610/27/09/e578679684dac5e07b58432a181446fa_middle.jpg","avatar_small":"https://apic.douyucdn.cn/upload/avanew/face/201610/27/09/e578679684dac5e07b58432a181446fa_small.jpg","jumpUrl":""},{"room_id":"134000","room_src":"https://rpic.douyucdn.cn/a1612/12/15/134000_161212154924.jpg","vertical_src":"https://rpic.douyucdn.cn/a1612/12/15/134000_161212154924.jpg","isVertical":0,"cate_id":"181","room_name":"Q神：王者荣耀第一全能王！","show_status":"1","subject":"","show_time":"1481525995","owner_uid":"5842120","nickname":"小QIMBA","online":36927,"game_name":"王者荣耀","child_id":"224","avatar_mid":"https://apic.douyucdn.cn/upload/avatar/default/13_middle.jpg","avatar_small":"https://apic.douyucdn.cn/upload/avatar/default/13_small.jpg","jumpUrl":""},{"room_id":"187503","room_src":"https://rpic.douyucdn.cn/a1612/12/15/187503_161212154049.jpg","vertical_src":"https://rpic.douyucdn.cn/a1612/12/15/187503_161212154049.jpg","isVertical":0,"cate_id":"196","room_name":"FJ：火影，角度和花火谁强？","show_status":"1","subject":"","show_time":"1481524630","owner_uid":"8766782","nickname":"从不空大的FJ","online":18103,"game_name":"火影忍者","child_id":"19","avatar_mid":"https://apic.douyucdn.cn/upload/avatar/008/76/67/82_avatar_middle.jpg","avatar_small":"https://apic.douyucdn.cn/upload/avatar/008/76/67/82_avatar_small.jpg","jumpUrl":""},{"room_id":"573449","room_src":"https://rpic.douyucdn.cn/a1612/12/15/573449_161212154003.jpg","vertical_src":"https://rpic.douyucdn.cn/a1612/12/15/573449_161212154003.jpg","isVertical":0,"cate_id":"181","room_name":"梦幻第六人！","show_status":"1","subject":"","show_time":"1481528079","owner_uid":"8930628","nickname":"小小青蛙笑","online":11187,"game_name":"王者荣耀","child_id":"224","avatar_mid":"https://apic.douyucdn.cn/upload/avatar/face/201603/d6d0a88653f417a33e6182c514639ebb_middle.jpg","avatar_small":"https://apic.douyucdn.cn/upload/avatar/face/201603/d6d0a88653f417a33e6182c514639ebb_small.jpg","jumpUrl":""}]
     * tag_name : 最热
     * tag_id : 9
     * icon_url :
     * small_icon_url :
     * count : 469
     * count_ios : 245
     * push_vertical_screen : 0
     */

    private String tag_name;
    private String tag_id;
    private String icon_url;
    private String small_icon_url;
    private int count;
    private int count_ios;
    private int push_vertical_screen;
    /**
     * room_id : 1164160
     * room_src : https://rpic.douyucdn.cn/a1612/12/15/1164160_161212154200.jpg
     * vertical_src : https://rpic.douyucdn.cn/a1612/12/15/1164160_161212154200.jpg
     * isVertical : 0
     * cate_id : 240
     * room_name : 斗技碰瓷三兄弟！问你怕不怕？
     * show_status : 1
     * subject :
     * show_time : 1481505967
     * owner_uid : 72902130
     * nickname : 云中欧凰
     * online : 89596
     * game_name : 阴阳师
     * child_id : 348
     * avatar_mid : https://apic.douyucdn.cn/upload/avanew/face/201610/27/09/e578679684dac5e07b58432a181446fa_middle.jpg
     * avatar_small : https://apic.douyucdn.cn/upload/avanew/face/201610/27/09/e578679684dac5e07b58432a181446fa_small.jpg
     * jumpUrl :
     */

    private List<RoomListEntity> room_list;

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    public String getTag_id() {
        return tag_id;
    }

    public void setTag_id(String tag_id) {
        this.tag_id = tag_id;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getSmall_icon_url() {
        return small_icon_url;
    }

    public void setSmall_icon_url(String small_icon_url) {
        this.small_icon_url = small_icon_url;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount_ios() {
        return count_ios;
    }

    public void setCount_ios(int count_ios) {
        this.count_ios = count_ios;
    }

    public int getPush_vertical_screen() {
        return push_vertical_screen;
    }

    public void setPush_vertical_screen(int push_vertical_screen) {
        this.push_vertical_screen = push_vertical_screen;
    }

    public List<RoomListEntity> getRoom_list() {
        return room_list;
    }

    public void setRoom_list(List<RoomListEntity> room_list) {
        this.room_list = room_list;
    }

    public static class RoomListEntity {
        private String room_id;
        private String room_src;
        private String vertical_src;
        private int isVertical;
        private String cate_id;
        private String room_name;
        private String show_status;
        private String subject;
        private String show_time;
        private String owner_uid;
        private String nickname;
        private int online;
        private String game_name;
        private String child_id;
        private String avatar_mid;
        private String avatar_small;
        private String jumpUrl;

        public String getRoom_id() {
            return room_id;
        }

        public void setRoom_id(String room_id) {
            this.room_id = room_id;
        }

        public String getRoom_src() {
            return room_src;
        }

        public void setRoom_src(String room_src) {
            this.room_src = room_src;
        }

        public String getVertical_src() {
            return vertical_src;
        }

        public void setVertical_src(String vertical_src) {
            this.vertical_src = vertical_src;
        }

        public int getIsVertical() {
            return isVertical;
        }

        public void setIsVertical(int isVertical) {
            this.isVertical = isVertical;
        }

        public String getCate_id() {
            return cate_id;
        }

        public void setCate_id(String cate_id) {
            this.cate_id = cate_id;
        }

        public String getRoom_name() {
            return room_name;
        }

        public void setRoom_name(String room_name) {
            this.room_name = room_name;
        }

        public String getShow_status() {
            return show_status;
        }

        public void setShow_status(String show_status) {
            this.show_status = show_status;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getShow_time() {
            return show_time;
        }

        public void setShow_time(String show_time) {
            this.show_time = show_time;
        }

        public String getOwner_uid() {
            return owner_uid;
        }

        public void setOwner_uid(String owner_uid) {
            this.owner_uid = owner_uid;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public int getOnline() {
            return online;
        }

        public void setOnline(int online) {
            this.online = online;
        }

        public String getGame_name() {
            return game_name;
        }

        public void setGame_name(String game_name) {
            this.game_name = game_name;
        }

        public String getChild_id() {
            return child_id;
        }

        public void setChild_id(String child_id) {
            this.child_id = child_id;
        }

        public String getAvatar_mid() {
            return avatar_mid;
        }

        public void setAvatar_mid(String avatar_mid) {
            this.avatar_mid = avatar_mid;
        }

        public String getAvatar_small() {
            return avatar_small;
        }

        public void setAvatar_small(String avatar_small) {
            this.avatar_small = avatar_small;
        }

        public String getJumpUrl() {
            return jumpUrl;
        }

        public void setJumpUrl(String jumpUrl) {
            this.jumpUrl = jumpUrl;
        }

        @Override
        public String toString() {
            return "{" +
                    "room_id:'" + room_id + '\'' +
                    ", room_src:'" + room_src + '\'' +
                    ", vertical_src:'" + vertical_src + '\'' +
                    ", isVertical:" + isVertical +
                    ", cate_id:'" + cate_id + '\'' +
                    ", room_name:'" + room_name + '\'' +
                    ", show_status:'" + show_status + '\'' +
                    ", subject:'" + subject + '\'' +
                    ", show_time:'" + show_time + '\'' +
                    ", owner_uid:'" + owner_uid + '\'' +
                    ", nickname:'" + nickname + '\'' +
                    ", online:" + online +
                    ", game_name:'" + game_name + '\'' +
                    ", child_id:'" + child_id + '\'' +
                    ", avatar_mid:'" + avatar_mid + '\'' +
                    ", avatar_small:'" + avatar_small + '\'' +
                    ", jumpUrl:'" + jumpUrl + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "{" +
                "tag_name:'" + tag_name + '\'' +
                ", tag_id:'" + tag_id + '\'' +
                ", icon_url:'" + icon_url + '\'' +
                ", small_icon_url:'" + small_icon_url + '\'' +
                ", count:" + count +
                ", count_ios:" + count_ios +
                ", push_vertical_screen:" + push_vertical_screen +
                ", room_list:" + room_list +
                '}';
    }
}
