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
 
 
 