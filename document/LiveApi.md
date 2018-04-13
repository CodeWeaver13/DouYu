![斗鱼TV](https://staticlive.douyucdn.cn/upload/signs/201610291926483131.png)
# 斗鱼Tv 直播API
 `android` `java` `移动端开发`
 
#### 版权说明：该版本为抓取Android手机客户端2.4.1.1版本API接口，该项目纯属练手，不能作为商用项目！违反上述所有，涉及商用侵权与本人无关！
[TOC]

# 目录结构

>
 * ------------------------[全部直播](#2.0.2)
 * ------------------------[一级栏目分类](#2.0.1)
 * ------------------------[二级栏目分类](#2.0.3)
 * ------------------------[二级栏目列表](#2.0.4)
 * ------------------------[三级栏目分类](#2.0.5)
 * ------------------------[体育直播栏目](#2.0.6)
 * ------------------------[体育直播详情](#2.0.7)
 
<h4 id="2.0.2">1.全部直播</h4>
>
* 接口描述：全部直播 
* 请求URL：http://capi.douyucdn.cn/api/v1/live?offset=0&limit=20&client_sys=android
* 请求方式：Get
* 请求参数：
*        offset：起始值
*        limit: 增量大小
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "room_id": "924562",
    "room_src": "https://rpic.douyucdn.cn/a1702/06/16/924562_170206162616.jpg",
    "vertical_src": "https://rpic.douyucdn.cn/a1702/06/16/924562_170206162616.jpg",
    "isVertical": 0,
    "cate_id": 175,
    "room_name": "209民谣专场：还是那个艾达妹妹",
    "show_status": "1",
    "subject": "",
    "show_time": "1486366695",
    "owner_uid": "63452963",
    "specific_catalog": "",
    "specific_status": "0",
    "vod_quality": "0",
    "nickname": "母老虎Ada",
    "online": 5958,
    "url": "/924562",
    "game_url": "/directory/game/music",
    "game_name": "音乐",
    "child_id": 283,
    "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201612/13/21/351ddd6df0444bd93a71ac122a6d11bc_big.jpg",
    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201612/13/21/351ddd6df0444bd93a71ac122a6d11bc_middle.jpg",
    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201612/13/21/351ddd6df0444bd93a71ac122a6d11bc_small.jpg",
    "jumpUrl": "",
    "fans": "151144",
    "ranktype": 0,
    "anchor_city": ""
}
 ```
 ---

<h4 id="2.0.1">2.栏目分类</h4>
>
* 接口描述： 直播一级分类列表
* 请求URL：http://capi.douyucdn.cn/api/v1/getColumnList?client_sys=android
* 请求方式：Get
* 请求参数：
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "cate_id": "1",
    "cate_name": "热门游戏",
    "short_name": "game",
    "push_ios": "1",
    "push_show": "0",
    "push_vertical_screen": "0",
    "push_nearby": "0"
}
 ```
 ---
 
<h4 id="2.0.3">3.二级栏目分类</h4>
>
* 接口描述：直播二级分类
* 请求URL：http://capi.douyucdn.cn/api/v1/getColumnDetail?shortName=&client_sys=android
* 请求方式：Get
* 请求参数：
*        shortName： 父级名称，根据父类分类获取二级分类
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "tag_id": "181",
    "short_name": "wzry",
    "tag_name": "王者荣耀",
    "pic_name": "b14b8890330ca7cb5185b954808485fc.jpg",
    "pic_name2": "3b1ae2d3fb371c4ebc487cb9936c6603.jpg",
    "icon_name": "f719087663581b7a723c4d39f8721bc1.jpg",
    "small_icon_name": "7f9e3b5077427438a3dd3cd3a3a93757.png",
    "orderdisplay": "2",
    "rank_score": "0",
    "night_rank_score": "0",
    "nums": "0",
    "push_ios": "1",
    "push_home": "1",
    "is_game_cate": "1",
    "cate_id": "9",
    "is_del": "0",
    "is_relate": "1",
    "push_vertical_screen": "0",
    "push_nearby": "0",
    "push_qqapp": "1",
    "broadcast_limit": "3",
    "vodd_cateids": "22",
    "open_full_screen": "0",
    "pic_url": "https://staticlive.douyucdn.cn/upload/game_cate/b14b8890330ca7cb5185b954808485fc.jpg",
    "pic_url2": "https://staticlive.douyucdn.cn/upload/game_cate/3b1ae2d3fb371c4ebc487cb9936c6603.jpg",
    "url": "/directory/game/wzry",
    "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/f719087663581b7a723c4d39f8721bc1.jpg",
    "small_icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/7f9e3b5077427438a3dd3cd3a3a93757.png",
    "count": "116",
    "count_ios": "57"
}
 ```
 ---
 
<h4 id="2.0.4">4.二级栏目列表</h4>
>
* 接口描述： 直播模块二级分类列表  212指二级分类ID
* 请求URL：http://capi.douyucdn.cn/api/v1/live/212?offset=0&limit=20&client_sys=android
* 请求方式：Get
* 请求参数：
*        offset：起始值
*        limit: 增量大小
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "room_id": "602595",
    "room_src": "https://rpic.douyucdn.cn/a1702/07/10/602595_170207103523.jpg",
    "vertical_src": "https://rpic.douyucdn.cn/a1702/07/10/602595_170207103523.jpg",
    "isVertical": 0,
    "cate_id": 212,
    "room_name": "18世纪单兵武器发展",
    "show_status": "1",
    "subject": "",
    "show_time": "1486431027",
    "owner_uid": "20848115",
    "specific_catalog": "",
    "specific_status": "0",
    "vod_quality": "0",
    "nickname": "ALEX热带龙",
    "online": 7368,
    "url": "/602595",
    "game_url": "/directory/game/js",
    "game_name": "军事",
    "child_id": 359,
    "avatar": "https://apic.douyucdn.cn/upload/avatar/face/201604/19/f5c8c72f8582eb56a375385a2ecebd17_big.jpg",
    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201604/19/f5c8c72f8582eb56a375385a2ecebd17_middle.jpg",
    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201604/19/f5c8c72f8582eb56a375385a2ecebd17_small.jpg",
    "jumpUrl": "",
    "fans": "34377",
    "ranktype": 2,
    "anchor_city": ""
}
 ```
 ---
 
<h4 id="2.0.5">5.三级栏目分类</h4>
>
* 接口描述：直播模块三级栏目分类  注：  tag_id --- 二级栏目分类ID
* 请求URL：http://capi.douyucdn.cn/api/v1/getThreeCate?tag_id=212&client_sys=android
* 请求方式：Get
* 请求参数：
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "id": "346",
    "name": "军武装备"
}
 ```
 ---
 
<h4 id="2.0.6">6.体育直播</h4>
>
* 接口描述：外链 体育直播栏目
* 请求URL：http://capi.douyucdn.cn/api/v1/qie?offset=0&limit=20&client_sys=android
* 请求方式：Get
* 请求参数：
*        offset：起始值
*        limit: 增量大小
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "room_id": "10000014",
    "room_name": "10:30【直播】灰熊vs马刺",
    "game_name": "NBA",
    "online": 78825,
    "room_src": "http://rpic.qietv.douyucdn.cn/z1702/07/10/10000014_170207105713.jpg",
    "nickname": "芒果解说"
}
 ```
 ---
 
<h4 id="2.0.2">7.体育直播外链详情页</h4>
>
* 接口描述：全部直播 
* 请求URL：http://m.live.qq.com/10000181?from=dy
* 请求方式：Get
* 请求参数：
*        10000181： 直播ID
*        from：来自哪里
* 返回数据:
 --- 
 
