package com.team.zhuoke.model.logic.video.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/2/7 0007.
 */
public class VideoRecommendHotCate {

    /**
     * cate_id : 1
     * cate_name : 游戏竞技
     * icon_src : https://vupload.douyucdn.cn/201610/31/19/62395b4a8c030d228dc6c77fe74e3f15.png
     * video_list : [{"point_id":217443,"hash_id":"jbrN0MmdDge7pyxA","cid1":1,"cid2":5,"up_id":"z97JZExko7kY","nickname":"徐老师LIVE","is_replay":0,"is_vertical":0,"is_re_audit":0,"video_title":"2017新春特辑 徐老师视频团队大曝光","video_status":0,"video_content":"","video_cover":"https://vpic.douyucdn.cn/201702/04/16/3a6f98e9c2500d16752d13c696b18e57.jpg","video_duration":5882.6,"view_num":4742,"ctime":1486197662,"utime":1486197662,"video_source":1},{"point_id":217545,"hash_id":"285BAvq4Z2KWG4Lm","cid1":1,"cid2":5,"up_id":"Mn7Mn3kqqwj2","nickname":"中年人拳师七号","is_replay":0,"is_vertical":0,"is_re_audit":0,"video_title":"【抗韩中年人】善总结者方能无往不利,最强套路回顾(下)","video_status":0,"video_content":"善总结者方能无往不利， 我们继续回顾2016年的四十八大最强套路，新的一年会为大家带来更为精彩的套路。外设https://lol7m.taobao.com/ 零食https://7haolsd.taobao.com/ 服装https://7haochao.taobao.com/","video_cover":"https://vpic.douyucdn.cn/201702/04/16/c5966f6bc40392715fb01f629ca52df7.jpg","video_duration":2655.96,"view_num":5457,"ctime":1486199821,"utime":1486199821,"video_source":1},{"point_id":225102,"hash_id":"p2V0JMVanQE7RY5k","cid1":1,"cid2":5,"up_id":"aBADvgPGWwXm","nickname":"每日撸报","is_replay":0,"is_vertical":0,"is_re_audit":0,"video_title":"每日撸报2.6:五五开：我的男枪好像又回来了","video_status":0,"video_content":"《每日撸报》是一档每天更新的主播搞笑栏目","video_cover":"https://vpic.douyucdn.cn/201702/06/17/2702f9f62fa4e574335cd03effa815a9.jpg","video_duration":648.44,"view_num":6828,"ctime":1486374721,"utime":1486374721,"video_source":1},{"point_id":221928,"hash_id":"bEO0XvN5YedWDrBd","cid1":1,"cid2":41,"up_id":"W67QambEN70O","nickname":"Riot丶LCK","is_replay":0,"is_vertical":0,"is_re_audit":0,"video_title":"SKT vs MVP 01 2017LCK春季赛 02.05","video_status":0,"video_content":"SKT vs MVP 01 2017LCK春季赛 02.05\r\n更多赛事录像请查看up主视频空间，斗鱼独家直播2017LCK全年赛事：https://www.douyu.com/522423","video_cover":"https://vodpic2.douyucdn.cn/image/3422287620170205205648-upload-47fb/cover.jpg","video_duration":2093.16,"view_num":43218,"ctime":1486300381,"utime":1486300381,"video_source":1}]
     */

    private int cate_id;
    private String cate_name;
    private String icon_src;
    /**
     * point_id : 217443
     * hash_id : jbrN0MmdDge7pyxA
     * cid1 : 1
     * cid2 : 5
     * up_id : z97JZExko7kY
     * nickname : 徐老师LIVE
     * is_replay : 0
     * is_vertical : 0
     * is_re_audit : 0
     * video_title : 2017新春特辑 徐老师视频团队大曝光
     * video_status : 0
     * video_content :
     * video_cover : https://vpic.douyucdn.cn/201702/04/16/3a6f98e9c2500d16752d13c696b18e57.jpg
     * video_duration : 5882.6
     * view_num : 4742
     * ctime : 1486197662
     * utime : 1486197662
     * video_source : 1
     */

    private List<VideoListBean> video_list;

    public int getCate_id() {
        return cate_id;
    }

    public void setCate_id(int cate_id) {
        this.cate_id = cate_id;
    }

    public String getCate_name() {
        return cate_name;
    }

    public void setCate_name(String cate_name) {
        this.cate_name = cate_name;
    }

    public String getIcon_src() {
        return icon_src;
    }

    public void setIcon_src(String icon_src) {
        this.icon_src = icon_src;
    }

    public List<VideoListBean> getVideo_list() {
        return video_list;
    }

    public void setVideo_list(List<VideoListBean> video_list) {
        this.video_list = video_list;
    }

    public static class VideoListBean {
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
    }
}
