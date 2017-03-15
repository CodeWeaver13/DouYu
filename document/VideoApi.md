![斗鱼TV](https://staticlive.douyucdn.cn/upload/signs/201610291926483131.png)
#斗鱼Tv 视频API
 `android` `java` `移动端开发`
 
####版权说明：该版本为抓取Android手机客户端2.4.1.1版本API接口，该项目纯属练手，不能作为商用项目！违反上述所有，涉及商用侵权与本人无关！
[TOC]

#目录结构
>
 * ------------------------[推荐栏目--热门视频](#3.0.1)
 * ------------------------[推荐栏目--分类栏目](#3.0.2)
 * ------------------------[推荐栏目--热门作者](#3.0.3)
 * ------------------------[推荐栏目--作者视频列表](#3.0.4)
 * ------------------------[一级栏目分类](#3.0.5)
 * ------------------------[二级栏目分类](#3.0.6)
 * ------------------------[视频列表页](#3.0.7)
 * ------------------------[视频详情页](#3.0.8)
 * ------------------------[视频详情弹幕](#3.0.9)
 * ------------------------[视频详情页--热门视频](#3.1.0) 
 * ------------------------[视频详情页--推荐视频](#3.1.1) 
 * ------------------------[视频详情页--视频源](#3.1.2)  

<h4 id="3.0.1">1.热门视频</h4>
>
* 接口描述：热门视频栏目 
* 请求URL：http://apiv2.douyucdn.cn/video/Video/getHotVideoList1?clicknum=2&token=&client_sys=android
* 请求方式：Get
* 请求参数：
*        clicknum：点击+1 切换热门视频数据 
*        token: 登录后获取  
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "point_id": 207388,
    "hash_id": "pDrwnvzAB8lWPNaX",
    "cid1": 3,
    "cid2": 18,
    "up_id": "Y6dBoVYLyA08",
    "nickname": "白兔糖Q",
    "is_replay": 0,
    "is_vertical": 0,
    "is_re_audit": 0,
    "video_title": "【长腿福利】卡丁车赛道鬼步舞，黑色紧身衣",
    "video_status": 0,
    "video_content": "",
    "video_cover": "https://vpic.douyucdn.cn/201702/01/20/5fb454a06a81c06e284bef92a8addbf2.jpg",
    "video_duration": 200.76,
    "view_num": 30337,
    "ctime": 1485950821,
    "utime": 1485950821,
    "video_source": 1
}
 ```
 ---
  <h4 id="3.0.2">2.分类栏目</h4>
>
* 接口描述： 分类栏目为热门推荐显示按照不同的栏目推荐4个条目 
* 请求URL：http://apiv2.douyucdn.cn/video/Video/getCateHotVideoList1?token=&client_sys=android
* 请求方式：Get
* 请求参数：
*        token: 登录后获取  
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "cate_id": 1,
    "cate_name": "游戏竞技",
    "icon_src": "https://vupload.douyucdn.cn/201610/31/19/62395b4a8c030d228dc6c77fe74e3f15.png",
    "video_list": [
        {
            "point_id": 217443,
            "hash_id": "jbrN0MmdDge7pyxA",
            "cid1": 1,
            "cid2": 5,
            "up_id": "z97JZExko7kY",
            "nickname": "徐老师LIVE",
            "is_replay": 0,
            "is_vertical": 0,
            "is_re_audit": 0,
            "video_title": "2017新春特辑 徐老师视频团队大曝光",
            "video_status": 0,
            "video_content": "",
            "video_cover": "https://vpic.douyucdn.cn/201702/04/16/3a6f98e9c2500d16752d13c696b18e57.jpg",
            "video_duration": 5882.6,
            "view_num": 4742,
            "ctime": 1486197662,
            "utime": 1486197662,
            "video_source": 1
        },
        {
            "point_id": 217545,
            "hash_id": "285BAvq4Z2KWG4Lm",
            "cid1": 1,
            "cid2": 5,
            "up_id": "Mn7Mn3kqqwj2",
            "nickname": "中年人拳师七号",
            "is_replay": 0,
            "is_vertical": 0,
            "is_re_audit": 0,
            "video_title": "【抗韩中年人】善总结者方能无往不利,最强套路回顾(下)",
            "video_status": 0,
            "video_content": "善总结者方能无往不利， 我们继续回顾2016年的四十八大最强套路，新的一年会为大家带来更为精彩的套路。外设https://lol7m.taobao.com/ 零食https://7haolsd.taobao.com/ 服装https://7haochao.taobao.com/",
            "video_cover": "https://vpic.douyucdn.cn/201702/04/16/c5966f6bc40392715fb01f629ca52df7.jpg",
            "video_duration": 2655.96,
            "view_num": 5457,
            "ctime": 1486199821,
            "utime": 1486199821,
            "video_source": 1
        },
        {
            "point_id": 225102,
            "hash_id": "p2V0JMVanQE7RY5k",
            "cid1": 1,
            "cid2": 5,
            "up_id": "aBADvgPGWwXm",
            "nickname": "每日撸报",
            "is_replay": 0,
            "is_vertical": 0,
            "is_re_audit": 0,
            "video_title": "每日撸报2.6:五五开：我的男枪好像又回来了",
            "video_status": 0,
            "video_content": "《每日撸报》是一档每天更新的主播搞笑栏目",
            "video_cover": "https://vpic.douyucdn.cn/201702/06/17/2702f9f62fa4e574335cd03effa815a9.jpg",
            "video_duration": 648.44,
            "view_num": 6828,
            "ctime": 1486374721,
            "utime": 1486374721,
            "video_source": 1
        },
        {
            "point_id": 221928,
            "hash_id": "bEO0XvN5YedWDrBd",
            "cid1": 1,
            "cid2": 41,
            "up_id": "W67QambEN70O",
            "nickname": "Riot丶LCK",
            "is_replay": 0,
            "is_vertical": 0,
            "is_re_audit": 0,
            "video_title": "SKT vs MVP 01 2017LCK春季赛 02.05",
            "video_status": 0,
            "video_content": "SKT vs MVP 01 2017LCK春季赛 02.05\r\n更多赛事录像请查看up主视频空间，斗鱼独家直播2017LCK全年赛事：https://www.douyu.com/522423",
            "video_cover": "https://vodpic2.douyucdn.cn/image/3422287620170205205648-upload-47fb/cover.jpg",
            "video_duration": 2093.16,
            "view_num": 43218,
            "ctime": 1486300381,
            "utime": 1486300381,
            "video_source": 1
        }
    ]
}
 ```
 ---
  <h4 id="3.0.1">3.热门作者</h4>
>
* 接口描述：推荐栏目热门作者栏目 
* 请求URL：http://apiv2.douyucdn.cn/video/Home/getHotAuthors?client_sys=android
* 请求方式：Get
* 请求参数：
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "nickname": "起小点是大腿",
    "up_id": "y9LA15JV6AqW",
    "follow_num": "32393",
    "author_avatar": "https://apic.douyucdn.cn/upload/avatar/000/12/71/39_avatar_middle.jpg?rltime",
    "submit_num": 29
}
 ```
 ---
  <h4 id="3.0.4">4.作者视频列表</h4>
>
* 接口描述：作者针对上传视频列表页接口
* 请求URL：http://apiv2.douyucdn.cn/video/VideoRoomList/getAuthorVidList?up_id=y9LA15JV6AqW&offset=0&limit=20&client_sys=android
* 请求方式：Get
* 请求参数：
*        up_id：上传视频作者ID
*        offset：起始值
*        limit: 增量大小 
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "cid2": 5,
    "status": 0,
    "cid1": 1,
    "is_re_audit": 0,
    "video_duration": 2079.84,
    "is_replay": "0",
    "is_vertical": 0,
    "hash_id": "ra2JEMJ502m7Nxml",
    "up_id": "y9LA15JV6AqW",
    "view_num": "73177",
    "point_id": 213250,
    "utime": 1486102621,
    "ctime": 1486102621,
    "video_title": "【主播真会玩】：2016年度颁奖典礼",
    "nickname": "起小点是大腿",
    "video_cover": "https://vpic.douyucdn.cn/201702/03/13/237830c7a52ce693812c59e96d33b1b8.jpg",
    "video_content": "《主播真会玩》年度贺岁片。\r\n先在这里给大家拜个年！祝大家鸡年大吉！新年行好运！\r\n\r\n一年一度的主播真会玩颁奖典礼又来啦！快来看看你支持的主播这次得了什么奖呢？\r\n\r\n别忘了参与我们的微信投票还能有机会中主播定制抱枕哦！\r\n\r\n配音 : @虫叔是大腿 \r\n\r\n出品：@是大腿"
}
 ```
 ---
  <h4 id="3.0.5">5.一级栏目分类</h4>
>
* 接口描述：一级栏目分类栏目
* 请求URL：http://apiv2.douyucdn.cn/video/Cate/getVideoHomeCate1?client_sys=android
* 请求方式：Get
* 请求参数：
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "cid1": "1",
    "cate1_name": "游戏竞技",
    "mobile_icon": "https://staticlive.douyucdn.cn/upload/201610/31/19/62395b4a8c030d228dc6c77fe74e3f15.png"
}
 ```
 ---
  <h4 id="3.0.6">6.二级栏目分类</h4>
>
* 接口描述：二级栏目分类
* 请求URL：http://apiv2.douyucdn.cn/video/Cate/getVideoCate2?cid1=3&client_sys=android
* 请求方式：Get
* 请求参数：
*        cid1：一级栏目分类ID
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "cid2": "42",
    "cate2_name": "斗鱼主播闹元宵",
    "cid1": "3",
    "recommend": "0"
}
 ```
 ---
  <h4 id="3.0.7">7.分类视频列表</h4>
>
* 接口描述：分类视频列表
* 请求URL：http://apiv2.douyucdn.cn/video/Videoroomlist/getRecVideoList?cid1=1&cid2=5&offset=0&limit=20&action=hot&client_sys=android
* 请求方式：Get
* 请求参数：
*        cid1：一级栏目分类ID
*        cid2: 二级栏目分类ID
*        offset：起始值
*        limit: 增量大小 
*        action：hot  固定值
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "video_duration": 7201.24,
    "is_replay": "10155503",
    "is_vertical": 0,
    "hash_id": "l0Q8mMY0nBJ749Ad",
    "up_id": "lOdEy3M5bdnR",
    "view_num": "11173",
    "utime": 1486426922,
    "video_title": "卢本伟White五五开 迟到了道歉! 2017-02-06 21点场",
    "video_content": "",
    "video_cover": "https://vodpic1.douyucdn.cn/image/live-138286rAsePM5lv7--20170206212418/cover.jpg",
    "nickname": "White55开解说"
}
 ```
 ---
 
 <h4 id="3.0.8">8.视频详情页</h4>
>
* 接口描述：视频详情页面 
* 请求URL：http://apiv2.douyucdn.cn/video/videoinfo/getVidInfo?vid=jXqeO74p0Ze7xywG&client_sys=android
* 请求方式：Get
* 请求参数：
*        vid：视频ID
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "time_point": [],
    "cid2": 5,
    "cid1": 1,
    "is_re_audit": 0,
    "video_duration": 4679.56,
    "is_vertical": 0,
    "is_replay": "10150224",
    "hash_id": "jXqeO74p0Ze7xywG",
    "up_id": "rEdl9v02JANM",
    "view_num": 2282,
    "point_id": 226295,
    "cate1_name": "游戏竞技",
    "cate2_name": "英雄联盟",
    "is_anchor": 1,
    "is_living": 0,
    "room_id": 846805,
    "barrage_ip": [
        {
            "ip": "119.90.50.16",
            "port": "40027"
        },
        {
            "ip": "119.90.50.16",
            "port": "40029"
        },
        {
            "ip": "119.90.50.16",
            "port": "40026"
        },
        {
            "ip": "119.90.50.16",
            "port": "40030"
        },
        {
            "ip": "119.90.50.16",
            "port": "40028"
        },
        {
            "ip": "119.90.50.13",
            "port": "40015"
        },
        {
            "ip": "119.90.50.14",
            "port": "40019"
        },
        {
            "ip": "119.90.50.20",
            "port": "40048"
        },
        {
            "ip": "119.90.50.15",
            "port": "40025"
        },
        {
            "ip": "119.90.50.12",
            "port": "40008"
        },
        {
            "ip": "119.90.50.17",
            "port": "40032"
        },
        {
            "ip": "119.90.50.18",
            "port": "40036"
        },
        {
            "ip": "119.90.50.12",
            "port": "40006"
        },
        {
            "ip": "119.90.50.13",
            "port": "40011"
        },
        {
            "ip": "119.90.50.14",
            "port": "40020"
        },
        {
            "ip": "119.90.50.19",
            "port": "40045"
        },
        {
            "ip": "119.90.50.19",
            "port": "40042"
        },
        {
            "ip": "119.90.50.15",
            "port": "40021"
        },
        {
            "ip": "119.90.50.15",
            "port": "40024"
        },
        {
            "ip": "119.90.50.11",
            "port": "40003"
        },
        {
            "ip": "119.90.50.17",
            "port": "40035"
        },
        {
            "ip": "119.90.50.13",
            "port": "40012"
        },
        {
            "ip": "119.90.50.11",
            "port": "40004"
        },
        {
            "ip": "119.90.50.11",
            "port": "40001"
        },
        {
            "ip": "119.90.50.14",
            "port": "40016"
        },
        {
            "ip": "119.90.50.12",
            "port": "40010"
        },
        {
            "ip": "119.90.50.18",
            "port": "40037"
        },
        {
            "ip": "119.90.50.17",
            "port": "40033"
        },
        {
            "ip": "119.90.50.20",
            "port": "40047"
        },
        {
            "ip": "119.90.50.20",
            "port": "40049"
        }
    ],
    "owner_avatar": "https://apic.douyucdn.cn/upload/avatar/face/201607/27/7dd14fa4de36dd10104c3e5f92f63e06_middle.jpg?rltime_middle.jpg?rltime",
    "video_content": "斗鱼视频 - 最6的弹幕视频网站",
    "video_title": "1夹子秒杀流女警。谁踩洞谁死 2017-02-06 21点场",
    "video_status": 0,
    "follow_num": "17613",
    "submit_num": 174,
    "utime": 1486425001,
    "ctime": 1486425001,
    "video_cover": "https://vodpic1.douyucdn.cn/image/live-846805rdbuXiIgiY--20170206213131/cover.jpg",
    "nickname": "青铜皇帝赏金术士",
    "author_id": 60415251,
    "isVertical": 0,
    "vertical_src": ""
}
 ```
 ---
 
  <h4 id="3.0.9">9.视频弹幕</h4>
>
* 接口描述：视频弹幕接口
* 请求URL：http://apiv2.douyucdn.cn/video/videoinfo/getDanMu?vid=jXqeO74p0Ze7xywG&client_sys=android
* 请求方式：Get
* 请求参数：
*        vid：视频ID
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "result": [
        {
            "col": 0,
            "ctt": "牛逼",
            "ft": 0,
            "mid": "8b9c5aed448440fc9b39000000000000",
            "mtype": 0,
            "nn": "13571906",
            "rl": 0,
            "sts": 1486446860,
            "tl": 2832851,
            "uid": 10307375,
            "v": 1,
            "vid": "226295"
        },
        {
            "col": 0,
            "ctt": "v",
            "ft": 0,
            "mid": "8b9c5aed448440fc9939000000000000",
            "mtype": 0,
            "nn": "你二大爷的爹地",
            "rl": 0,
            "sts": 1486443303,
            "tl": 1928074,
            "uid": 48566605,
            "v": 1,
            "vid": "226295"
        }
    ],
    "barrage_density": [
        ""
    ]
}
 ```
 ---
  <h4 id="3.1.0">10.热门视频</h4>
>
* 接口描述：热门推荐视频栏目 
* 请求URL：http://apiv2.douyucdn.cn/video/VideoRoomList/hotVideo?cid2=5&up_id=rEdl9v02JANM&client_sys=android
* 请求方式：Get
* 请求参数：
*        cid2：二级分类ID
*        up_id: 上传者ID 
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "is_vertical": 0,
    "weight": 0.054380203246188,
    "ranktype": "20",
    "contents": "",
    "status": 0,
    "rpos": "41",
    "cid2": 5,
    "view_num": 2326,
    "hash_id": "jXqeO74p0Ze7xywG",
    "cid1": 1,
    "recomType": 1,
    "create_time": 1486425001,
    "is_replay": "10150224",
    "video_duration": 4679.56,
    "up_id": "rEdl9v02JANM",
    "video_cover": "https://vodpic1.douyucdn.cn/image/live-846805rdbuXiIgiY--20170206213131/cover.jpg",
    "video_title": "1夹子秒杀流女警。谁踩洞谁死 2017-02-06 21点场",
    "point_id": 226295,
    "utime": 1486425001,
    "nickname": "青铜皇帝赏金术士"
}
 ```
 ---
 <h4 id="3.1.1">11.直播推荐视频</h4>
>
* 接口描述：直播推荐视频栏目 
* 请求URL：http://apiv2.douyucdn.cn/video/VideoRoomList/liveRec?cid2=5&client_sys=android
* 请求方式：Get
* 请求参数：
*        cid2：二级分类ID
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "specific_catalog": "luguanfei",
    "vertical_src": "https://rpic.douyucdn.cn/a1702/07/13/453751_170207135511.jpg",
    "ranktype": "29",
    "nickname": "我叫撸管飞",
    "subject": "",
    "room_src": "https://rpic.douyucdn.cn/a1702/07/13/453751_170207135511.jpg",
    "rpos": "42",
    "cate_id": "1",
    "specific_status": "1",
    "game_name": "英雄联盟",
    "online": 476075,
    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/027/11/32/13_avatar_small.jpg",
    "recomType": "0",
    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/027/11/32/13_avatar_middle.jpg",
    "vod_quality": "0",
    "room_name": "国服第一风暴诺克！光速血怒！",
    "child_id": "32",
    "room_id": "453751",
    "isVertical": 0,
    "show_time": "1486432242",
    "show_status": "1"
}
 ```
 ---
 
 <h4 id="3.1.2">12.视频播放源</h4>
>
* 接口描述：视频播放源地址
* 请求URL：http://apiv2.douyucdn.cn/videonc/Stream/getAppPlayer?client_sys=android
* 请求方式：Post
* 请求参数：
*        vid：视频ID
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
	"error": 0,
	"data": {
		"thumb_video": {
			"normal": "http:\/\/vodhls1.douyucdn.cn\/live\/normal_live-846805rdbuXiIgiY--20170206213131\/playlist.m3u8?k=aeaee2836240253e977ee789a1857c1a&t=58995d84&d=b71f9694-2309-4443-ab7f-3665b9840ab5&u=0&ct=android&vid=226295",
			"super": "",
			"high": ""
		},
		"timestamp": 7200
	}
}
 ```
 ---

 

 