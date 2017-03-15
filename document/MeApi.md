![斗鱼TV](https://staticlive.douyucdn.cn/upload/signs/201610291926483131.png)
#斗鱼Tv 我的模块API
 `android` `java` `移动端开发`
 
####版权说明：该版本为抓取Android手机客户端2.4.1.1版本API接口，该项目纯属练手，不能作为商用项目！违反上述所有，涉及商用侵权与本人无关！
[TOC]

#目录结构
>
 * ------------------------[账号登录](#1.0.1)
 * ------------------------[用户个人信息](#1.0.2)
 * ------------------------[观看历史记录](#1.0.3)
 * ------------------------[清空历史记录](#1.0.4)
 
<h4 id="1.0.1">1.账号登录</h4>
>
* 接口描述： 账号登录
* 请求URL：http://capi.douyucdn.cn/api/v1/login?username=377413612&password=123456
* 请求方式：Get
* 请求参数：
*        client_sys：设备类型 默认为：Android
*        username：用户名
*        password:密码
* 返回数据:

 ```
 {
    "uid": "89175431",
    "username": "89175431",
    "nickname": "377413612",
    "email": false,
    "qq": "",
    "mobile_phone": "008*********3224",
    "phone_status": "1",
    "email_status": "0",
    "lastlogin": "1489464467",
    "avatar": {
        "small": "https://apic.douyucdn.cn/upload/avanew/face/201611/25/12/57087d024ab648dc2eecdb63485677db_small.jpg?rltime",
        "middle": "https://apic.douyucdn.cn/upload/avanew/face/201611/25/12/57087d024ab648dc2eecdb63485677db_middle.jpg?rltime",
        "big": "https://apic.douyucdn.cn/upload/avanew/face/201611/25/12/57087d024ab648dc2eecdb63485677db_big.jpg?rltime"
    },
    "has_room": "0",
    "groupid": "1",
    "is_own_room": "0",
    "location": {
        "province": "重庆",
        "city": ""
    },
    "sex": "1",
    "birthday": "19940101",
    "gold1": "0",
    "score": "0",
    "level": {
        "current": {
            "lv": 1,
            "pic": "user1.gif",
            "mpic": "cn01.png",
            "name": "菜鸟",
            "pic_url": "https://staticlive.douyucdn.cn/common/douyu/images/classimg/user1.gif?v=v74686",
            "score": 0
        },
        "next": {
            "lv": 2,
            "pic": "user2.gif",
            "mpic": "brass05.png",
            "name": "黄铜5",
            "pic_url": "https://staticlive.douyucdn.cn/common/douyu/images/classimg/user2.gif?v=v74686",
            "score": 100
        }
    },
    "userlevel": {
        "cur_score": 76,
        "next_level_score": 106,
        "lv": 3,
        "is_full": 0
    },
    "follow": "12",
    "ios_gold_switch": 1,
    "gold": "0.0",
    "noble_gold": "0.0",
    "ident_status": "0",
    "token": "89175431_672976ffc9d8a4a4",
    "token_exp": 1490428232
}

 ```
 ---
 
 <h4 id="1.0.2">2.用户个人信息</h4>
>
* 接口描述： 查询用户个人信息
* 请求URL：http://capi.douyucdn.cn/api/v1/my_info?token=89175431_672976ffc9d8a4a4
* 请求方式：Get
* 请求参数：
*        client_sys：设备类型 默认为：Android
*        token：临时用户ID
* 返回数据:

 ```
 {
    "uid": "89175431",
    "username": "89175431",
    "nickname": "377413612",
    "email": false,
    "qq": "",
    "mobile_phone": "008*********3224",
    "phone_status": "1",
    "email_status": "0",
    "lastlogin": "1489464467",
    "avatar": {
        "small": "https://apic.douyucdn.cn/upload/avanew/face/201611/25/12/57087d024ab648dc2eecdb63485677db_small.jpg?rltime",
        "middle": "https://apic.douyucdn.cn/upload/avanew/face/201611/25/12/57087d024ab648dc2eecdb63485677db_middle.jpg?rltime",
        "big": "https://apic.douyucdn.cn/upload/avanew/face/201611/25/12/57087d024ab648dc2eecdb63485677db_big.jpg?rltime"
    },
    "has_room": "0",
    "groupid": "1",
    "is_own_room": "0",
    "location": {
        "province": "重庆",
        "city": ""
    },
    "sex": "1",
    "birthday": "19940101",
    "gold1": "0",
    "score": "0",
    "level": {
        "current": {
            "lv": 1,
            "pic": "user1.gif",
            "mpic": "cn01.png",
            "name": "菜鸟",
            "pic_url": "https://staticlive.douyucdn.cn/common/douyu/images/classimg/user1.gif?v=v74686",
            "score": 0
        },
        "next": {
            "lv": 2,
            "pic": "user2.gif",
            "mpic": "brass05.png",
            "name": "黄铜5",
            "pic_url": "https://staticlive.douyucdn.cn/common/douyu/images/classimg/user2.gif?v=v74686",
            "score": 100
        }
    },
    "userlevel": {
        "cur_score": 76,
        "next_level_score": 106,
        "lv": 3,
        "is_full": 0
    },
    "follow": "12",
    "ios_gold_switch": 1,
    "gold": "0.0",
    "noble_gold": "0.0",
    "ident_status": "0",
    "token": "89175431_672976ffc9d8a4a4",
    "token_exp": 1490428232
}

 ```
 ---
 
 <h4 id="1.0.3">3.观看历史记录</h4>
>
* 接口描述： 观看历史
* 请求URL：http://capi.douyucdn.cn/api/v1/history?token=89175431_672976ffc9d8a4a4
* 请求方式：Get
* 请求参数：
*        client_sys：设备类型 默认为：Android
*        token：临时用户ID
* 返回数据:

 ```
 {
    "room_id": "288016",
    "room_src": "https://rpic.douyucdn.cn/a1703/15/15/288016_170315155730.jpg",
    "vertical_src": "https://rpic.douyucdn.cn/a1703/15/15/288016_170315155730.jpg",
    "isVertical": 0,
    "cate_id": "1",
    "room_name": "LPL春季赛 3月12日 重播",
    "show_status": "1",
    "subject": "",
    "show_time": "1489162500",
    "owner_uid": "19344409",
    "specific_catalog": "lpl",
    "specific_status": "1",
    "vod_quality": "0",
    "nickname": "英雄联盟官方赛事",
    "online": 73699,
    "child_id": "37",
    "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201703/12/01/c465f47d89489973926c2e4fe6129f32_big.jpg",
    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201703/12/01/c465f47d89489973926c2e4fe6129f32_middle.jpg",
    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201703/12/01/c465f47d89489973926c2e4fe6129f32_small.jpg",
    "jumpUrl": "",
    "icon_data": {
        "status": 5,
        "icon_url": "",
        "icon_width": 0,
        "icon_height": 0
    },
    "url": "/lpl",
    "game_url": "/directory/game/LOL",
    "game_name": "英雄联盟",
    "rid": "288016",
    "oid": "19344409",
    "n": "LPL春季赛 3月12日 重播",
    "lt": "1489550867",
    "uc": "73460",
    "ls": "1",
    "on": "英雄联盟官方赛事",
    "fans": "1547432",
    "ranktype": 0
}
 ```
 ---
<h4 id="1.0.4">4.清空历史记录</h4>
>
* 接口描述： 账号登录
* 请求URL：http://apiv2.douyucdn.cn/Livenc/User/clearViewHistory?token=89175431_12_0523fe29db30379f_1_54371094&client_sys=android
* 请求方式：POST
* 请求参数：
*        client_sys：设备类型 默认为：Android
*        token：临时用户ID
* 返回数据:

 ```
 {
    "error": 0,
    "data": []
}
 ```
 ---





[^有接口相关问题]:
  联系QQ：377413612
  


  

 

