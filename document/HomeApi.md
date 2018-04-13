![斗鱼TV](https://staticlive.douyucdn.cn/upload/signs/201610291926483131.png)
# 斗鱼Tv 首页API
 `android` `java` `移动端开发`
 
#### 版权说明：该版本为抓取Android手机客户端2.4.1.1版本API接口，该项目纯属练手，不能作为商用项目！违反上述所有，涉及商用侵权与本人无关！
[TOC]

# 目录结构
>
 * ------------------------[栏目分类](#1.0.1)
 * ------------------------[分类详情](#1.0.2)
 * ------------------------[推荐页--轮播图](#1.0.3)
 * ------------------------[推荐页--栏目列表](#1.0.4)
 * ------------------------[推荐页--最热栏目](#1.0.5)
 * ------------------------[推荐页--颜值栏目](#1.0.6)
 * ------------------------[直播房间详情页](#1.0.7)
 * ------------------------[服务器时间戳](#1.0.8)
 * ------------------------[用户协议](#1.0.9)
 * ------------------------[栏目更多--全部](#1.1.0)
 * ------------------------[栏目更多--二级分类列表](#1.1.1)
 * ------------------------[栏目更多--二级直播视频列表](#1.1.2)

<h4 id="1.0.1">1.栏目分类</h4>
>
* 接口描述： 获取首页分类信息
* 请求URL：http://capi.douyucdn.cn/api/homeCate/getCateList
* 请求方式：Get
* 请求参数：
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
 {
    "error": 0,
    "data": [
        {
            "title": "手游",
            "show_order": "1",
            "identification": "3e760da75be261a588c74c4830632360",
            "is_video": 0
        },
        {
            "title": "娱乐",
            "show_order": "2",
            "identification": "9acf9c6f117a4c2d02de30294ec29da9",
            "is_video": 0
        },
        {
            "title": "游戏",
            "show_order": "3",
            "identification": "ba08216f13dd1742157412386eee1225",
            "is_video": 0
        },
        {
            "title": "趣玩",
            "show_order": "4",
            "identification": "393b245e8046605f6f881d415949494c",
            "is_video": 0
        }
    ]
}
 ```
 ---
 
<h4 id="1.0.2">2.分类详情</h4>
>
* 接口描述： 获取首页列表详情接口
* 请求URL：http://capi.douyucdn.cn/api/homeCate/getHotRoom?aid=android1&client_sys=android&identification=3e760da75be261a588c74c4830632360&time=1480493599&auth=b455ecdc27fd82acc4f5ed771d015a3d
* 请求方式：Get
* 请求参数：
*        client_sys：设备类型 默认为：Android
*        identification：分类ID
*        time: 时间戳
*        auth：32随机数
* 返回数据:

 ```
{
    "error": 0,
    "data": [
        {
            "room_list": [
                {
                    "room_id": "573449",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/573449_161130163924.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/573449_161130163924.jpg",
                    "isVertical": 0,
                    "cate_id": "181",
                    "room_name": "蛙神：王者荣耀国服第一露娜！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480491354",
                    "owner_uid": "8930628",
                    "nickname": "小小青蛙笑",
                    "online": 44555,
                    "game_name": "王者荣耀",
                    "child_id": "224",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201603/d6d0a88653f417a33e6182c514639ebb_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201603/d6d0a88653f417a33e6182c514639ebb_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "221869",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/221869_161130164012.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/221869_161130164012.jpg",
                    "isVertical": 0,
                    "cate_id": "179",
                    "room_name": "梦幻西游手游，免费接资源",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480480730",
                    "owner_uid": "12256351",
                    "nickname": "小儿郎丶丶",
                    "online": 35566,
                    "game_name": "梦幻西游手游",
                    "child_id": "1",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/012/25/63/51_avatar_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/012/25/63/51_avatar_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "759099",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/759099_161130163223.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/759099_161130163223.jpg",
                    "isVertical": 0,
                    "cate_id": "240",
                    "room_name": "帮老板抽卡看号！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480476761",
                    "owner_uid": "2834439",
                    "nickname": "格格哒丶",
                    "online": 27613,
                    "game_name": "阴阳师",
                    "child_id": "348",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201608/24/64582ef9d443a2b90910cf98d47d83f0_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201608/24/64582ef9d443a2b90910cf98d47d83f0_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1164160",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1164160_161130163223.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1164160_161130163223.jpg",
                    "isVertical": 0,
                    "cate_id": "240",
                    "room_name": "斗技！吸血鬼日记！无SSR阵容！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480476988",
                    "owner_uid": "72902130",
                    "nickname": "云中欧凰",
                    "online": 14421,
                    "game_name": "阴阳师",
                    "child_id": "348",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201610/27/09/e578679684dac5e07b58432a181446fa_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201610/27/09/e578679684dac5e07b58432a181446fa_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "最热",
            "tag_id": "9",
            "icon_url": "",
            "small_icon_url": "",
            "count": 422,
            "count_ios": 227,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "1224701",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1224701_161130163216.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1224701_161130163216.jpg",
                    "isVertical": 0,
                    "cate_id": "229",
                    "room_name": "【小软】直播抽卡送号",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480478893",
                    "owner_uid": "24771352",
                    "nickname": "老夫还是少女丶",
                    "online": 2335,
                    "game_name": "新游中心",
                    "child_id": "318",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201610/16/01/723d21f5e96f29d979f7b42ee17bc9cd_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201610/16/01/723d21f5e96f29d979f7b42ee17bc9cd_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "670230",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/670230_161130163200.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/670230_161130163200.jpg",
                    "isVertical": 0,
                    "cate_id": "229",
                    "room_name": "【射哥】 口袋妖怪VS 每天搞事情",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480481822",
                    "owner_uid": "11354638",
                    "nickname": "隔壁老姚会养猪",
                    "online": 1369,
                    "game_name": "新游中心",
                    "child_id": "318",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201607/20/ad1e60eb6b6a7cc0b9b20581b7bebc59_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201607/20/ad1e60eb6b6a7cc0b9b20581b7bebc59_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "575822",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/575822_161130163114.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/575822_161130163114.jpg",
                    "isVertical": 0,
                    "cate_id": "229",
                    "room_name": "口袋妖怪vs佳佳-公测第二天萌新摸索中",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480487609",
                    "owner_uid": "14773225",
                    "nickname": "渐渐流逝的青春丶",
                    "online": 1223,
                    "game_name": "新游中心",
                    "child_id": "318",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201605/12/cea4ea3c60a6b5d7cb7bdc0d9f7ff215_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201605/12/cea4ea3c60a6b5d7cb7bdc0d9f7ff215_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1343346",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1343346_161130163122.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1343346_161130163122.jpg",
                    "isVertical": 0,
                    "cate_id": "229",
                    "room_name": "放开那三国2十连走一波",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480486692",
                    "owner_uid": "21592513",
                    "nickname": "阿丶阮",
                    "online": 1140,
                    "game_name": "新游中心",
                    "child_id": "338",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/14/21/6a8f050062c9c0e08fd6833b5a620787_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/14/21/6a8f050062c9c0e08fd6833b5a620787_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "新游中心",
            "tag_id": "229",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/056c144928f4a9af94f2aa2774ee2a33.jpg",
            "small_icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/5a9db4d9b821b20cf30ca24ee7cb8c99.jpg",
            "count_ios": 27,
            "count": 40,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "759099",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/759099_161130163223.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/759099_161130163223.jpg",
                    "isVertical": 0,
                    "cate_id": "240",
                    "room_name": "帮老板抽卡看号！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480476761",
                    "owner_uid": "2834439",
                    "nickname": "格格哒丶",
                    "online": 27613,
                    "game_name": "阴阳师",
                    "child_id": "348",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201608/24/64582ef9d443a2b90910cf98d47d83f0_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201608/24/64582ef9d443a2b90910cf98d47d83f0_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1164160",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1164160_161130163223.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1164160_161130163223.jpg",
                    "isVertical": 0,
                    "cate_id": "240",
                    "room_name": "斗技！吸血鬼日记！无SSR阵容！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480476988",
                    "owner_uid": "72902130",
                    "nickname": "云中欧凰",
                    "online": 14421,
                    "game_name": "阴阳师",
                    "child_id": "348",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201610/27/09/e578679684dac5e07b58432a181446fa_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201610/27/09/e578679684dac5e07b58432a181446fa_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1139455",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1139455_161130163256.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1139455_161130163256.jpg",
                    "isVertical": 0,
                    "cate_id": "240",
                    "room_name": "三位大佬解答问题时间 快来！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480440764",
                    "owner_uid": "71932838",
                    "nickname": "腿田",
                    "online": 11056,
                    "game_name": "阴阳师",
                    "child_id": "348",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201609/29/08/f0c579f5c6be82ad9d90647325fe1c8e_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201609/29/08/f0c579f5c6be82ad9d90647325fe1c8e_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "424591",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/424591_161130163235.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/424591_161130163235.jpg",
                    "isVertical": 0,
                    "cate_id": "240",
                    "room_name": "翔羽：生命之王，生生不息！！！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480472159",
                    "owner_uid": "3714062",
                    "nickname": "翔羽",
                    "online": 7570,
                    "game_name": "阴阳师",
                    "child_id": "351",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/003/71/40/62_avatar_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/003/71/40/62_avatar_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "阴阳师",
            "tag_id": "240",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/6886d158a2308bdf2c702d64a29aa3b8.jpg",
            "small_icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/2aecba145121d8fba3c1f37091b4c308.jpg",
            "count_ios": 25,
            "count": 44,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "1298062",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1298062_161130163232.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1298062_161130163232.jpg",
                    "isVertical": 0,
                    "cate_id": "181",
                    "room_name": "斗鱼最强橘右京教你轻松上钻",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480473123",
                    "owner_uid": "18960168",
                    "nickname": "1241526543",
                    "online": 4118,
                    "game_name": "王者荣耀",
                    "child_id": "224",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/25/01/6c1eba6c61756266ae8756c3e0777f91_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/25/01/6c1eba6c61756266ae8756c3e0777f91_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "573449",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/573449_161130163924.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/573449_161130163924.jpg",
                    "isVertical": 0,
                    "cate_id": "181",
                    "room_name": "蛙神：王者荣耀国服第一露娜！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480491354",
                    "owner_uid": "8930628",
                    "nickname": "小小青蛙笑",
                    "online": 44555,
                    "game_name": "王者荣耀",
                    "child_id": "224",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201603/d6d0a88653f417a33e6182c514639ebb_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201603/d6d0a88653f417a33e6182c514639ebb_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "889024",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/889024_161130164027.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/889024_161130164027.jpg",
                    "isVertical": 0,
                    "cate_id": "181",
                    "room_name": "高冷毛o(=•ェ•=)m",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480472238",
                    "owner_uid": "61957349",
                    "nickname": "绿毛哟",
                    "online": 5766,
                    "game_name": "王者荣耀",
                    "child_id": "224",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201609/14/e19a77eb72fb6991edbcd491601532bb_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201609/14/e19a77eb72fb6991edbcd491601532bb_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "74706",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/74706_161130163138.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/74706_161130163138.jpg",
                    "isVertical": 0,
                    "cate_id": "181",
                    "room_name": "夏天：王者荣耀国服第一ADC",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480485017",
                    "owner_uid": "2006007",
                    "nickname": "声优夏天",
                    "online": 4341,
                    "game_name": "王者荣耀",
                    "child_id": "224",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/02/13/c8856742d90bf36acf5ad407d854b0cd_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/02/13/c8856742d90bf36acf5ad407d854b0cd_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "王者荣耀",
            "tag_id": "181",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/f719087663581b7a723c4d39f8721bc1.jpg",
            "small_icon_url": "",
            "count_ios": 46,
            "count": 111,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "147398",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/147398_161130164006.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/147398_161130164006.jpg",
                    "isVertical": 0,
                    "cate_id": "245",
                    "room_name": "梦诛华佗，专治疑难杂症",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480483285",
                    "owner_uid": "6191206",
                    "nickname": "维尼君y",
                    "online": 5672,
                    "game_name": "梦幻诛仙",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/006/19/12/06_avatar_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/006/19/12/06_avatar_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "870272",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/870272_161130164001.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/870272_161130164001.jpg",
                    "isVertical": 0,
                    "cate_id": "245",
                    "room_name": "梦幻诛仙：预言夫已上",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480484907",
                    "owner_uid": "57694654",
                    "nickname": "万夫爸爸",
                    "online": 2880,
                    "game_name": "梦幻诛仙",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201609/20/709c68caa0ca6a2f1f8772f639a3135a_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201609/20/709c68caa0ca6a2f1f8772f639a3135a_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1149608",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1149608_161130163207.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1149608_161130163207.jpg",
                    "isVertical": 0,
                    "cate_id": "245",
                    "room_name": "梦诛小来专业制衡各种不服，",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480480726",
                    "owner_uid": "47963354",
                    "nickname": "小来ggg",
                    "online": 2497,
                    "game_name": "梦幻诛仙",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/04/13/edccd5c4eca33331a7d07e4bf0bf3aa7_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/04/13/edccd5c4eca33331a7d07e4bf0bf3aa7_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "513575",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/513575_161130163223.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/513575_161130163223.jpg",
                    "isVertical": 0,
                    "cate_id": "245",
                    "room_name": "【小生】梦幻诛仙 化生专业包10~~",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480476882",
                    "owner_uid": "31955876",
                    "nickname": "a刘小生",
                    "online": 2183,
                    "game_name": "梦幻诛仙",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/031/95/58/76_avatar_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/031/95/58/76_avatar_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "梦幻诛仙",
            "tag_id": "245",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/d8775d5f606b87ea2c72e47da3ae8bfd.jpg",
            "small_icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/1f90851c9517ad9784b036c5400fdc76.jpg",
            "count_ios": 18,
            "count": 20,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "1399921",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1399921_161130163055.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1399921_161130163055.jpg",
                    "isVertical": 0,
                    "cate_id": "192",
                    "room_name": "1哥：限量版跑车想翻车都难",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480490199",
                    "owner_uid": "87505351",
                    "nickname": "11枝独秀",
                    "online": 1490,
                    "game_name": "球球大作战",
                    "child_id": "22",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/20/18/6492f1a9b6c53a2cf7ab5d102f8cb48a_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/20/18/6492f1a9b6c53a2cf7ab5d102f8cb48a_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "534017",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/534017_161130163216.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/534017_161130163216.jpg",
                    "isVertical": 0,
                    "cate_id": "192",
                    "room_name": "天真：极限生存，保底15心！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480478906",
                    "owner_uid": "35182211",
                    "nickname": "我叫天真丶",
                    "online": 1219,
                    "game_name": "球球大作战",
                    "child_id": "22",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201606/27/f5f9dbcc52618309e7934d8d8169f8ee_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201606/27/f5f9dbcc52618309e7934d8d8169f8ee_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1346757",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1346757_161130163229.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1346757_161130163229.jpg",
                    "isVertical": 0,
                    "cate_id": "192",
                    "room_name": "橙熟：史上最强扫码2带3",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480474615",
                    "owner_uid": "20249525",
                    "nickname": "a912766984",
                    "online": 323,
                    "game_name": "球球大作战",
                    "child_id": "22",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201610/22/19/f5e89524eaca4184700a9704ee4cb40c_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201610/22/19/f5e89524eaca4184700a9704ee4cb40c_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "856047",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/856047_161130164027.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/856047_161130164027.jpg",
                    "isVertical": 0,
                    "cate_id": "192",
                    "room_name": "雨夜：牛",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480465013",
                    "owner_uid": "17286444",
                    "nickname": "雨夜国服第一C位",
                    "online": 278,
                    "game_name": "球球大作战",
                    "child_id": "22",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201610/19/07/3d5b90c9c3adb12e1b4ff8dbdbd35994_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201610/19/07/3d5b90c9c3adb12e1b4ff8dbdbd35994_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "球球大作战",
            "tag_id": "192",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/d55ab0fa8a2c840f71123738e83fd088.jpg",
            "small_icon_url": "",
            "count_ios": 8,
            "count": 22,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "132638",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/132638_161130163100.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/132638_161130163100.jpg",
                    "isVertical": 0,
                    "cate_id": "190",
                    "room_name": "【七海】七海八号亲自上阵。",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480489399",
                    "owner_uid": "3946825",
                    "nickname": "七海丶千秋",
                    "online": 5131,
                    "game_name": "皇室战争",
                    "child_id": "31",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201607/31/52485d57943d62b6388c0dbe034ec2d2_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201607/31/52485d57943d62b6388c0dbe034ec2d2_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "891234",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/15/891234_161130151714.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/15/891234_161130151714.jpg",
                    "isVertical": 0,
                    "cate_id": "190",
                    "room_name": "2000=120强者之路",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480473409",
                    "owner_uid": "62203389",
                    "nickname": "laofaren",
                    "online": 682,
                    "game_name": "皇室战争",
                    "child_id": "31",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201608/04/de045e061d87aa2b055e141fc5cf53d7_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201608/04/de045e061d87aa2b055e141fc5cf53d7_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "160834",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/160834_161130164001.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/160834_161130164001.jpg",
                    "isVertical": 0,
                    "cate_id": "190",
                    "room_name": "天狗石头套12胜70",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480484831",
                    "owner_uid": "2284593",
                    "nickname": "霹雳源撩妹艾特熏熏",
                    "online": 459,
                    "game_name": "皇室战争",
                    "child_id": "31",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201608/26/0a621370ac8f7b47f51d3ff04bda9f32_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201608/26/0a621370ac8f7b47f51d3ff04bda9f32_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "502697",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/502697_161130163134.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/502697_161130163134.jpg",
                    "isVertical": 0,
                    "cate_id": "190",
                    "room_name": "蚌埠倒数第一。PS是主角。",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480485559",
                    "owner_uid": "31633660",
                    "nickname": "固镇吴奇隆",
                    "online": 68,
                    "game_name": "皇室战争",
                    "child_id": "31",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/031/63/36/60_avatar_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/031/63/36/60_avatar_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "皇室战争",
            "tag_id": "190",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/f63d3a8d35d08e4804879f1793f3eb71.jpg",
            "small_icon_url": "",
            "count_ios": 5,
            "count": 5,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "187503",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/187503_161130164002.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/187503_161130164002.jpg",
                    "isVertical": 0,
                    "cate_id": "196",
                    "room_name": "FJ：火影忍者，身体被掏空，好虚啊！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480485019",
                    "owner_uid": "8766782",
                    "nickname": "从不空大的FJ",
                    "online": 13547,
                    "game_name": "火影忍者",
                    "child_id": "19",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/008/76/67/82_avatar_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/008/76/67/82_avatar_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "595265",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/595265_161130163143.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/595265_161130163143.jpg",
                    "isVertical": 0,
                    "cate_id": "196",
                    "room_name": "你根本不知道什么是力量~",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480484408",
                    "owner_uid": "44116782",
                    "nickname": "奶瓶lxx",
                    "online": 7345,
                    "game_name": "火影忍者",
                    "child_id": "19",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201604/10/06b563d61e407b5b2a2132fc63d45e8b_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201604/10/06b563d61e407b5b2a2132fc63d45e8b_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "542603",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/542603_161130163936.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/542603_161130163936.jpg",
                    "isVertical": 0,
                    "cate_id": "196",
                    "room_name": "（布衣）赛季结束了。~",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480490007",
                    "owner_uid": "38397302",
                    "nickname": "布衣殿堂丶",
                    "online": 1573,
                    "game_name": "火影忍者",
                    "child_id": "19",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201604/29/bedd0ddbda6838ed26280a2f81f6d6be_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201604/29/bedd0ddbda6838ed26280a2f81f6d6be_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "592385",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/592385_161130163138.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/592385_161130163138.jpg",
                    "isVertical": 0,
                    "cate_id": "196",
                    "room_name": "疾风：（重感冒）各位大神让让我",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480485011",
                    "owner_uid": "14618354",
                    "nickname": "吊车尾疾风",
                    "online": 1284,
                    "game_name": "火影忍者",
                    "child_id": "19",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201608/18/f6ec52f827206524ec1e71cc65b9421c_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201608/18/f6ec52f827206524ec1e71cc65b9421c_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "火影忍者",
            "tag_id": "196",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/b780dc8903efd237b7125b5ce92d5aff.jpg",
            "small_icon_url": "",
            "count_ios": 18,
            "count": 32,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "645867",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/645867_161130163907.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/645867_161130163907.jpg",
                    "isVertical": 0,
                    "cate_id": "179",
                    "room_name": "夏天：69日常.军火.合宠.挖宝接接接！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480492898",
                    "owner_uid": "8779015",
                    "nickname": "NeverBeAlong",
                    "online": 104,
                    "game_name": "梦幻西游手游",
                    "child_id": "1",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201609/20/ed2b1e80acedb8aeaf69e8de041a81cc_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201609/20/ed2b1e80acedb8aeaf69e8de041a81cc_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1235688",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1235688_161130163131.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1235688_161130163131.jpg",
                    "isVertical": 0,
                    "cate_id": "179",
                    "room_name": "109五开刷直播一个月辣",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480485769",
                    "owner_uid": "5045089",
                    "nickname": "第五个季节JJJ",
                    "online": 98,
                    "game_name": "梦幻西游手游",
                    "child_id": "1",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/19/00/cf8543638ab36f6c895940cf2de24a97_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/19/00/cf8543638ab36f6c895940cf2de24a97_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1314812",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1314812_161130163241.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1314812_161130163241.jpg",
                    "isVertical": 0,
                    "cate_id": "179",
                    "room_name": "平民神兽的不归路，欢迎吹",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480472652",
                    "owner_uid": "73104861",
                    "nickname": "琴灬哥",
                    "online": 71,
                    "game_name": "梦幻西游手游",
                    "child_id": "1",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/01/14/d464be57b33bb2c8b6539180b3ac69eb_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/01/14/d464be57b33bb2c8b6539180b3ac69eb_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "60668",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/60668_161130163151.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/60668_161130163151.jpg",
                    "isVertical": 0,
                    "cate_id": "179",
                    "room_name": "聊会儿天,回答大家的问题.",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480483394",
                    "owner_uid": "1702608",
                    "nickname": "哈里俊个俊",
                    "online": 68,
                    "game_name": "梦幻西游手游",
                    "child_id": "1",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/001/70/26/08_avatar_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/001/70/26/08_avatar_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "梦幻西游手游",
            "tag_id": "179",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/27bc3ae8a92fb40f02bd9a71adbd9db9.jpg",
            "small_icon_url": "",
            "count_ios": 7,
            "count": 12,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "593243",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/593243_161130163151.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/593243_161130163151.jpg",
                    "isVertical": 0,
                    "cate_id": "30",
                    "room_name": "【少女咖啡枪】试玩中！！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480483254",
                    "owner_uid": "26683531",
                    "nickname": "低调的小悲伤",
                    "online": 72,
                    "game_name": "综合手游",
                    "child_id": "16",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201608/30/05e3cb2137e6305cb8860e625d41fad4_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201608/30/05e3cb2137e6305cb8860e625d41fad4_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "797426",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/797426_161130164008.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/797426_161130164008.jpg",
                    "isVertical": 0,
                    "cate_id": "30",
                    "room_name": "舰R日常/战利品，没有资源我好方",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480482726",
                    "owner_uid": "20109444",
                    "nickname": "ashcsft",
                    "online": 71,
                    "game_name": "综合手游",
                    "child_id": "340",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201606/16/f54c7223368d184323331753af68a0a4_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201606/16/f54c7223368d184323331753af68a0a4_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "507460",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/507460_161130163230.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/507460_161130163230.jpg",
                    "isVertical": 0,
                    "cate_id": "30",
                    "room_name": "fgo 蛋糕刷够了开始刷袜子",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480473729",
                    "owner_uid": "797279",
                    "nickname": "凤凰院秀吉",
                    "online": 69,
                    "game_name": "综合手游",
                    "child_id": "340",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/02/17/7b73a35300ebaceb6f3e4592c99575a1_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/02/17/7b73a35300ebaceb6f3e4592c99575a1_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "786728",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/786728_161130164006.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/786728_161130164006.jpg",
                    "isVertical": 0,
                    "cate_id": "30",
                    "room_name": "诛仙手游：缘聚诛仙，只因有你！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480483031",
                    "owner_uid": "27838627",
                    "nickname": "不离龙龙",
                    "online": 68,
                    "game_name": "综合手游",
                    "child_id": "273",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201609/24/e5cc473c7d0d3ad7f1e409b671bf4ca9_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201609/24/e5cc473c7d0d3ad7f1e409b671bf4ca9_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "综合手游",
            "tag_id": "30",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/fecada4ba3e0b4997d6892f8094eb2e7.jpg",
            "small_icon_url": "",
            "count_ios": 30,
            "count": 49,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "1041457",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1041457_161130163205.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1041457_161130163205.jpg",
                    "isVertical": 0,
                    "cate_id": "244",
                    "room_name": "斗鱼杯王者之战！观赛抢大礼包！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480481172",
                    "owner_uid": "67890101",
                    "nickname": "大咖陈",
                    "online": 3527,
                    "game_name": "街篮",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201609/09/96155a15303ba54c1c5389292036b7d0_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201609/09/96155a15303ba54c1c5389292036b7d0_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1408214",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1408214_161130163244.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1408214_161130163244.jpg",
                    "isVertical": 0,
                    "cate_id": "244",
                    "room_name": "王者C没目标了",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480468840",
                    "owner_uid": "55619544",
                    "nickname": "老霸啊",
                    "online": 2251,
                    "game_name": "街篮",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201606/29/9ce0263cd87ee4d3910057eb34d0a8fc_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201606/29/9ce0263cd87ee4d3910057eb34d0a8fc_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1436789",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1436789_161130163122.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1436789_161130163122.jpg",
                    "isVertical": 0,
                    "cate_id": "244",
                    "room_name": "街篮王者带坑爬分",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480486656",
                    "owner_uid": "59171519",
                    "nickname": "Wulichun",
                    "online": 2181,
                    "game_name": "街篮",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/29/15/8e7edb2f23ab7ffb172cf84d0e8c7fad_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/29/15/8e7edb2f23ab7ffb172cf84d0e8c7fad_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1189019",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1189019_161130163144.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1189019_161130163144.jpg",
                    "isVertical": 0,
                    "cate_id": "244",
                    "room_name": "持续连胜稳定混分",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480484554",
                    "owner_uid": "42033199",
                    "nickname": "幺六6666",
                    "online": 1474,
                    "game_name": "街篮",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201604/1dfd81ffc8e8aa72e3ebf942da398a0e_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201604/1dfd81ffc8e8aa72e3ebf942da398a0e_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "街篮",
            "tag_id": "244",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/6ec677b6e8f52211b493c279d569c5fc.jpg",
            "small_icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/5f9c3ccea101e1e5740ff5109931c2d3.png",
            "count_ios": 4,
            "count": 16,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "1091244",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1091244_161130162946.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1091244_161130162946.jpg",
                    "isVertical": 0,
                    "cate_id": "178",
                    "room_name": "丶灬丿捺橫竖的直播间",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480495308",
                    "owner_uid": "45557704",
                    "nickname": "丶灬丿捺橫竖",
                    "online": 2,
                    "game_name": "CF手游",
                    "child_id": "5",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201604/132d4d2bd6220f9d0469ff68ccc4862c_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201604/132d4d2bd6220f9d0469ff68ccc4862c_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1299197",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1299197_161130161443.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1299197_161130161443.jpg",
                    "isVertical": 0,
                    "cate_id": "178",
                    "room_name": "非专业，纯娱乐。。可带可虐待。",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480493600",
                    "owner_uid": "78370978",
                    "nickname": "撸泽贰",
                    "online": 1,
                    "game_name": "CF手游",
                    "child_id": "5",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/19/02/6abc3f84063245f357874637e56beb50_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/19/02/6abc3f84063245f357874637e56beb50_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1441070",
                    "room_src": "https://staticlive.douyucdn.cn/upload/web_pic/default2_thumb.jpg",
                    "vertical_src": "https://staticlive.douyucdn.cn/upload/web_pic/default2_thumb.jpg",
                    "isVertical": 0,
                    "cate_id": "178",
                    "room_name": "猫丨爷的直播间",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480494600",
                    "owner_uid": "90071441",
                    "nickname": "猫丨爷",
                    "online": 0,
                    "game_name": "CF手游",
                    "child_id": "5",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/30/16/582e287f9a5b420cfd9f441ab4ff8f33_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/30/16/582e287f9a5b420cfd9f441ab4ff8f33_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1434342",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1434342_161130161138.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1434342_161130161138.jpg",
                    "isVertical": 0,
                    "cate_id": "178",
                    "room_name": "开森的鸭梨的直播间",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480490728",
                    "owner_uid": "12449418",
                    "nickname": "xxxxaxxxx",
                    "online": 0,
                    "game_name": "CF手游",
                    "child_id": "5",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/012/44/94/18_avatar_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/012/44/94/18_avatar_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "CF手游",
            "tag_id": "178",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/ebbf074141143acdd95764c16b094ca3.jpg",
            "small_icon_url": "",
            "count_ios": 9,
            "count": 16,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "680340",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/680340_161130163147.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/680340_161130163147.jpg",
                    "isVertical": 0,
                    "cate_id": "198",
                    "room_name": "今天特邀发小通宵抽坐骑，谢谢大家的资源！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480483852",
                    "owner_uid": "24733757",
                    "nickname": "周口丶吴彦祖",
                    "online": 3107,
                    "game_name": "问道",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/19/17/ad8da7d12646233d4421a191e9d592ae_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/19/17/ad8da7d12646233d4421a191e9d592ae_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1394913",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1394913_161130163243.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1394913_161130163243.jpg",
                    "isVertical": 0,
                    "cate_id": "198",
                    "room_name": "晚上24点抽坐骑(预约开放中...)",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480469146",
                    "owner_uid": "86982917",
                    "nickname": "十年问道丶青帝",
                    "online": 2260,
                    "game_name": "问道",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/19/16/028041be51ec64cd18e41a8efe83b3ee_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/19/16/028041be51ec64cd18e41a8efe83b3ee_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "519454",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/519454_161130163012.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/519454_161130163012.jpg",
                    "isVertical": 0,
                    "cate_id": "198",
                    "room_name": "活动直播间-今晚12点抽坐骑（开始预约）",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480493497",
                    "owner_uid": "33763106",
                    "nickname": "主播老谢",
                    "online": 2008,
                    "game_name": "问道",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201609/21/8a086a72f69842326c15a1aac47d8c8f_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201609/21/8a086a72f69842326c15a1aac47d8c8f_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1372455",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1372455_161130163035.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1372455_161130163035.jpg",
                    "isVertical": 0,
                    "cate_id": "198",
                    "room_name": "问道国色天香区日常交友",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480491864",
                    "owner_uid": "12655439",
                    "nickname": "女神召唤师",
                    "online": 1236,
                    "game_name": "问道",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201605/15/330ae040fce8bdffbe275d44c3deee74_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201605/15/330ae040fce8bdffbe275d44c3deee74_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "问道",
            "tag_id": "198",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/f9b73a21e9efbf9a47f2f61a27b9fff5.jpg",
            "small_icon_url": "",
            "count_ios": 6,
            "count": 17,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "623938",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/623938_161130163126.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/623938_161130163126.jpg",
                    "isVertical": 0,
                    "cate_id": "177",
                    "room_name": "小磊:帮水友代打部落战了！黑星走起！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480486264",
                    "owner_uid": "47243470",
                    "nickname": "飞翔的小磊",
                    "online": 3618,
                    "game_name": "部落冲突",
                    "child_id": "4",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201605/03/4327fed2263c809ddf04e6cecb0d4678_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201605/03/4327fed2263c809ddf04e6cecb0d4678_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "473910",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/473910_161130163953.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/473910_161130163953.jpg",
                    "isVertical": 0,
                    "cate_id": "177",
                    "room_name": "哥布林满血复活",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480487547",
                    "owner_uid": "8643269",
                    "nickname": "DouYu大師兄",
                    "online": 1476,
                    "game_name": "部落冲突",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201610/03/06/48d281a8bfff98a91581ae4f878a3c50_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201610/03/06/48d281a8bfff98a91581ae4f878a3c50_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1161110",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1161110_161130163158.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1161110_161130163158.jpg",
                    "isVertical": 0,
                    "cate_id": "177",
                    "room_name": "僵尸单盾，小男人",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480482023",
                    "owner_uid": "73285695",
                    "nickname": "僵尸小男人",
                    "online": 100,
                    "game_name": "部落冲突",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/20/14/b499b97c660adeeb4e0d3e53e8f5871d_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/20/14/b499b97c660adeeb4e0d3e53e8f5871d_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1330156",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1330156_161130163146.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1330156_161130163146.jpg",
                    "isVertical": 0,
                    "cate_id": "177",
                    "room_name": "免费部落冲突辅助COC霸主",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480483941",
                    "owner_uid": "80548871",
                    "nickname": "凯泽部落",
                    "online": 69,
                    "game_name": "部落冲突",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/12/15/de2db6849f60be3a4b9882038f4dbcaf_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/12/15/de2db6849f60be3a4b9882038f4dbcaf_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "部落冲突",
            "tag_id": "177",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/eea39cd8b41bf91ab38fab338351c0f6.jpg",
            "small_icon_url": "",
            "count_ios": 2,
            "count": 6,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "1439122",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/02/1439122_161130023148.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/02/1439122_161130023148.jpg",
                    "isVertical": 0,
                    "cate_id": "161",
                    "room_name": "night暗香盈袖的直播间",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480495282",
                    "owner_uid": "55244610",
                    "nickname": "night暗香盈袖",
                    "online": 7,
                    "game_name": "虚荣",
                    "child_id": "2",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/30/02/219b6bf8f333f950372884fda4c1ee2f_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/30/02/219b6bf8f333f950372884fda4c1ee2f_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1380617",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1380617_161130160414.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1380617_161130160414.jpg",
                    "isVertical": 0,
                    "cate_id": "161",
                    "room_name": "虚荣 直播间",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480495561",
                    "owner_uid": "44718016",
                    "nickname": "大雕棒棒的",
                    "online": 1,
                    "game_name": "虚荣",
                    "child_id": "2",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201604/a5e7b92a41ecbfcb0f69ee059c881938_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201604/a5e7b92a41ecbfcb0f69ee059c881938_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "虚荣",
            "tag_id": "161",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/8985eaceefc34658d99eee205b53b7eb.jpg",
            "small_icon_url": "",
            "count_ios": 0,
            "count": 1,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "1384856",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1384856_161130163240.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1384856_161130163240.jpg",
                    "isVertical": 0,
                    "cate_id": "243",
                    "room_name": "蛇蛇高端局，苦练技术中。",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480469776",
                    "owner_uid": "19755993",
                    "nickname": "被神崇拜123",
                    "online": 380,
                    "game_name": "蛇蛇争霸",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/019/75/59/93_avatar_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/019/75/59/93_avatar_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "59244",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/59244_161130163014.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/59244_161130163014.jpg",
                    "isVertical": 0,
                    "cate_id": "243",
                    "room_name": "菜鸟超神主播随便玩玩播一播",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480493332",
                    "owner_uid": "1631474",
                    "nickname": "429507524",
                    "online": 308,
                    "game_name": "蛇蛇争霸",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/30/03/a7c7815be263950bd71064025399c0ac_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/30/03/a7c7815be263950bd71064025399c0ac_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1377759",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1377759_161130163947.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1377759_161130163947.jpg",
                    "isVertical": 0,
                    "cate_id": "243",
                    "room_name": "新的一周，新的开始~~~",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480489008",
                    "owner_uid": "84121771",
                    "nickname": "5小宝",
                    "online": 304,
                    "game_name": "蛇蛇争霸",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/29/22/66e888ab52f9cd6e1ba874197dce20d1_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/29/22/66e888ab52f9cd6e1ba874197dce20d1_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1041313",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1041313_161130163135.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1041313_161130163135.jpg",
                    "isVertical": 0,
                    "cate_id": "243",
                    "room_name": "蛇蛇争霸 不刷不黑做一个玩蛇的奶爸",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480485460",
                    "owner_uid": "20004297",
                    "nickname": "蓝墨文化传媒",
                    "online": 220,
                    "game_name": "蛇蛇争霸",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201609/08/cfede3be51f0c98bdd19fb2b1a786335_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201609/08/cfede3be51f0c98bdd19fb2b1a786335_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "蛇蛇争霸",
            "tag_id": "243",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/5fc7fec9adeae07588939b0db8c0dd7d.jpg",
            "small_icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/6c87679af1a725b5a42c5ec8a46383f7.jpg",
            "count_ios": 16,
            "count": 17,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "1417653",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1417653_161130163101.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1417653_161130163101.jpg",
                    "isVertical": 0,
                    "cate_id": "228",
                    "room_name": "打鱼打鱼吧",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480489224",
                    "owner_uid": "89005501",
                    "nickname": "诚信渔乐",
                    "online": 277,
                    "game_name": "单机手游",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/default/03_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/default/03_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1155648",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1155648_161130163145.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1155648_161130163145.jpg",
                    "isVertical": 0,
                    "cate_id": "228",
                    "room_name": "网络游戏日常",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480484276",
                    "owner_uid": "72783485",
                    "nickname": "慕容琳霜",
                    "online": 68,
                    "game_name": "单机手游",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/22/09/ed89f49e44894dcf62f3fb4d55ec5b58_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/22/09/ed89f49e44894dcf62f3fb4d55ec5b58_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "970920",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/970920_161130163951.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/970920_161130163951.jpg",
                    "isVertical": 0,
                    "cate_id": "228",
                    "room_name": "QQ飞车娱乐边境解说",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480487884",
                    "owner_uid": "48184127",
                    "nickname": "雪白琉璃月",
                    "online": 59,
                    "game_name": "单机手游",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201605/f7370c27951eecb6d94934f4fb1b9ff1_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201605/f7370c27951eecb6d94934f4fb1b9ff1_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "530096",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/530096_161130163117.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/530096_161130163117.jpg",
                    "isVertical": 0,
                    "cate_id": "228",
                    "room_name": "红石科技与建筑的完美结合",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480487190",
                    "owner_uid": "25560031",
                    "nickname": "拱白菜了",
                    "online": 58,
                    "game_name": "单机手游",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/02/09/66a5c4101cc89f42563dc062079bbabb_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/02/09/66a5c4101cc89f42563dc062079bbabb_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "单机手游",
            "tag_id": "228",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/40bbaa98defda3289bd4678d6626de06.jpg",
            "small_icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/b93022638adafa5cbc9698dcc5f5b4a7.jpg",
            "count_ios": 3,
            "count": 10,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "945511",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/945511_161130163224.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/945511_161130163224.jpg",
                    "isVertical": 0,
                    "cate_id": "213",
                    "room_name": "百变怪来了！懒人版依旧风骚！",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480476650",
                    "owner_uid": "25286948",
                    "nickname": "ly1521",
                    "online": 1427,
                    "game_name": "精灵宝可梦",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201608/17/14b1d87b2acd8c2892dc507305a6e525_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201608/17/14b1d87b2acd8c2892dc507305a6e525_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "1085562",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1085562_161130163854.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1085562_161130163854.jpg",
                    "isVertical": 0,
                    "cate_id": "213",
                    "room_name": "小夜直播：图鉴大师 的日常，谢谢关注",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480493402",
                    "owner_uid": "13124008",
                    "nickname": "470028290",
                    "online": 9,
                    "game_name": "精灵宝可梦",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/29/10/b89604b68ba5c32c1caede4940e31a77_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/29/10/b89604b68ba5c32c1caede4940e31a77_small.jpg",
                    "jumpUrl": ""
                },
                {
                    "room_id": "485602",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/485602_161130163846.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/485602_161130163846.jpg",
                    "isVertical": 0,
                    "cate_id": "213",
                    "room_name": "寶可夢 測試中",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480493832",
                    "owner_uid": "25079984",
                    "nickname": "花儿朵朵放",
                    "online": 6,
                    "game_name": "精灵宝可梦",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201610/13/19/1b1ce17671804f7973396a997ffd0f40_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201610/13/19/1b1ce17671804f7973396a997ffd0f40_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "精灵宝可梦",
            "tag_id": "213",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/5dff752e7715db8d792007b68cc25f92.jpg",
            "small_icon_url": "",
            "count_ios": 2,
            "count": 3,
            "push_vertical_screen": 0
        },
        {
            "room_list": [],
            "tag_name": "像三国",
            "tag_id": "129",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/4b207ace81031c22b55d1c29a5f29b05.jpg",
            "small_icon_url": "",
            "count_ios": 0,
            "count": 0,
            "push_vertical_screen": 0
        },
        {
            "room_list": [
                {
                    "room_id": "1146876",
                    "room_src": "https://rpic.douyucdn.cn/a1611/30/16/1146876_161130163212.jpg",
                    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/16/1146876_161130163212.jpg",
                    "isVertical": 0,
                    "cate_id": "224",
                    "room_name": "笑颜：一百种死法翻来覆去",
                    "show_status": "1",
                    "subject": "",
                    "show_time": "1480479876",
                    "owner_uid": "8995464",
                    "nickname": "情到深处自然成",
                    "online": 136,
                    "game_name": "剑侠世界",
                    "child_id": "0",
                    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/008/99/54/64_avatar_middle.jpg",
                    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/008/99/54/64_avatar_small.jpg",
                    "jumpUrl": ""
                }
            ],
            "tag_name": "剑侠世界",
            "tag_id": "224",
            "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/17734ce67487af4942e6da517b7a93e5.jpg",
            "small_icon_url": "",
            "count_ios": 1,
            "count": 1,
            "push_vertical_screen": 0
        }
    ]
}
 ```
----

<h4 id="1.0.3">3.推荐页面轮播图接口</h4>
>
* 接口描述： 首页推荐页面轮播图接口
* 请求URL：http://capi.douyucdn.cn/api/v1/slide/6?version=2.421&client_sys=android
* 请求方式：Get
* 请求参数：
*        version：版本号
*        client_sys：设备类型
* 返回数据:

 ```
{
    "error": 0,
    "data": [
        {
            "id": 213715,
            "title": "鬼叔的另类帝国玩法",
            "pic_url": "https://staticlive.douyucdn.cn/upload/signs/201611301739538479.png",
            "tv_pic_url": "https://staticlive.douyucdn.cn/upload/signs/201611301739534194.png",
            "room": {
                "room_id": "213715",
                "room_src": "https://rpic.douyucdn.cn/a1611/30/17/213715_161130174144.jpg",
                "vertical_src": "https://rpic.douyucdn.cn/a1611/30/17/213715_161130174144.jpg",
                "isVertical": 0,
                "cate_id": "26",
                "room_name": "乱斗野蛮人",
                "vod_quality": "0",
                "show_status": "1",
                "show_time": "1480493543",
                "owner_uid": "6620192",
                "specific_catalog": "wog",
                "specific_status": "1",
                "credit_illegal": "0",
                "is_white_list": "0",
                "cur_credit": "12",
                "low_credit": "4",
                "online": 1988,
                "nickname": "帝国鬼叔",
                "url": "/wog",
                "game_url": "/directory/game/classic",
                "game_name": "怀旧游戏",
                "game_icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/568029e11adb524c778da572b578f2e3.jpg",
                "show_details": "参与方式入群看公告——鬼叔群号：567790209      口令：鬼叔威武 |||||\n主播直播时间：10：00-22：00 \n下载及所有问题可入群求助",
                "owner_avatar": "https://apic.douyucdn.cn/upload/avatar/006/62/01/92_avatar_big.jpg?rltime",
                "cdnsWithName": [
                    {
                        "name": "主线路",
                        "cdn": "ws"
                    },
                    {
                        "name": "备用线路5",
                        "cdn": "tct"
                    },
                    {
                        "name": "备用线路2",
                        "cdn": "ws2"
                    },
                    {
                        "name": "备用线路3",
                        "cdn": "dl"
                    }
                ],
                "is_pass_player": 0,
                "owner_weight": "14.02t",
                "fans": "24650",
                "is_high_game": 1,
                "column_id": "1"
            }
        },
        {
            "id": 428812,
            "title": "天堂永恒 韩服首测",
            "pic_url": "https://staticlive.douyucdn.cn/upload/signs/201611301548098685.jpg",
            "tv_pic_url": "https://staticlive.douyucdn.cn/upload/signs/201611301548099448.jpg",
            "room": {
                "room_id": "428812",
                "room_src": "https://rpic.douyucdn.cn/a1611/30/17/428812_161130174203.jpg",
                "vertical_src": "https://rpic.douyucdn.cn/a1611/30/17/428812_161130174203.jpg",
                "isVertical": 0,
                "cate_id": "62",
                "room_name": "天堂永恒韩服首测！看看怎么样",
                "vod_quality": "0",
                "show_status": "1",
                "show_time": "1480488953",
                "owner_uid": "3782278",
                "specific_catalog": "BG6",
                "specific_status": "1",
                "credit_illegal": "0",
                "is_white_list": "0",
                "cur_credit": "12",
                "low_credit": "4",
                "online": 9348,
                "nickname": "饼哥azz",
                "url": "/BG6",
                "game_url": "/directory/game/wyqz",
                "game_name": "网游前瞻",
                "game_icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/5e6e39b582ee38494d08d95f4fcc91d2.jpg",
                "show_details": "新浪微博：饼哥azz   \n【岛2交流群303297838】【冒险岛1交流群136175060】禁言通知群554514464\n近期直播时间:中午12-7.",
                "owner_avatar": "https://apic.douyucdn.cn/upload/avanew/face/201611/16/13/398c11bba86fc3cf6416fcbb05779901_big.jpg?rltime",
                "cdnsWithName": [
                    {
                        "name": "主线路",
                        "cdn": "ws"
                    },
                    {
                        "name": "备用线路5",
                        "cdn": "tct"
                    },
                    {
                        "name": "备用线路2",
                        "cdn": "ws2"
                    },
                    {
                        "name": "备用线路3",
                        "cdn": "dl"
                    }
                ],
                "is_pass_player": 0,
                "owner_weight": "12.65t",
                "fans": "29456",
                "column_id": "1"
            }
        },
        {
            "id": 106795,
            "title": "魅族科技新品发布会",
            "pic_url": "https://staticlive.douyucdn.cn/upload/signs/201611301426377723.jpg",
            "tv_pic_url": "https://staticlive.douyucdn.cn/upload/signs/201611301426374192.jpg",
            "room": {
                "room_id": "106795",
                "room_src": "https://rpic.douyucdn.cn/a1611/30/17/106795_161130173610.jpg",
                "vertical_src": "https://rpic.douyucdn.cn/a1611/30/17/106795_161130173610.jpg",
                "isVertical": 0,
                "cate_id": "134",
                "room_name": "14:30 魅族科技新品发布会",
                "vod_quality": "0",
                "show_status": "1",
                "show_time": "1480471303",
                "owner_uid": "5103230",
                "specific_catalog": "meizu",
                "specific_status": "1",
                "credit_illegal": "0",
                "is_white_list": "0",
                "cur_credit": "12",
                "low_credit": "4",
                "online": 36027,
                "nickname": "魅族科技",
                "url": "/meizu",
                "game_url": "/directory/game/smkj",
                "game_name": "数码科技",
                "game_icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/7d14c2a7e7e8c8f773d9d25c18f40ae9.jpg",
                "show_details": "魅族科技新品发布会",
                "owner_avatar": "https://apic.douyucdn.cn/upload/avatar/005/10/32/30_avatar_big.jpg?rltime",
                "cdnsWithName": [
                    {
                        "name": "主线路",
                        "cdn": "ws"
                    },
                    {
                        "name": "备用线路5",
                        "cdn": "tct"
                    },
                    {
                        "name": "备用线路2",
                        "cdn": "ws2"
                    },
                    {
                        "name": "备用线路3",
                        "cdn": "dl"
                    }
                ],
                "is_pass_player": 0,
                "owner_weight": "638.74kg",
                "fans": "19236",
                "column_id": "3"
            }
        },
        {
            "id": 786261,
            "title": "愤怒军团制作人访谈",
            "pic_url": "https://staticlive.douyucdn.cn/upload/signs/201611301734194730.jpg",
            "tv_pic_url": "https://staticlive.douyucdn.cn/upload/signs/201611301734198301.jpg",
            "room": {
                "room_id": "786261",
                "room_src": "https://rpic.douyucdn.cn/a1611/30/17/786261_161130173415.jpg",
                "vertical_src": "https://rpic.douyucdn.cn/a1611/30/17/786261_161130173415.jpg",
                "isVertical": 0,
                "cate_id": "19",
                "room_name": "【国产游戏】愤怒军团制作人访谈",
                "vod_quality": "0",
                "show_status": "1",
                "show_time": "1480498203",
                "owner_uid": "57788883",
                "specific_catalog": "indienova",
                "specific_status": "1",
                "credit_illegal": "0",
                "is_white_list": "0",
                "cur_credit": "12",
                "low_credit": "4",
                "online": 2621,
                "nickname": "indienova",
                "url": "/indienova",
                "game_url": "/directory/game/TVgame",
                "game_name": "主机游戏",
                "game_icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/602c38f19a4fe9af40fdb64a00ce9ed5.jpg",
                "show_details": "官方直播，每周一三五下午五点半开始。微博、公众号：indienova。找更多好玩独立游戏请前往 indienova.com",
                "owner_avatar": "https://apic.douyucdn.cn/upload/avanew/face/201610/21/16/0eb30832785c52e040ce330bc2d1537b_big.jpg?rltime",
                "cdnsWithName": [
                    {
                        "name": "主线路",
                        "cdn": "ws"
                    },
                    {
                        "name": "备用线路5",
                        "cdn": "tct"
                    },
                    {
                        "name": "备用线路2",
                        "cdn": "ws2"
                    },
                    {
                        "name": "备用线路3",
                        "cdn": "dl"
                    }
                ],
                "is_pass_player": 0,
                "owner_weight": "349.3kg",
                "fans": "8676",
                "is_high_game": 1,
                "column_id": "1"
            }
        },
        {
            "id": 567695,
            "title": "连连观影感",
            "pic_url": "https://staticlive.douyucdn.cn/upload/signs/201611301726522722.JPG",
            "tv_pic_url": "https://staticlive.douyucdn.cn/upload/signs/201611301726528355.JPG",
            "room": {
                "room_id": "567695",
                "room_src": "https://rpic.douyucdn.cn/a1611/30/17/567695_161130172838.jpg",
                "vertical_src": "https://rpic.douyucdn.cn/a1611/30/17/567695_161130172838.jpg",
                "isVertical": 0,
                "cate_id": "174",
                "room_name": "《我在故宫修文物》 观影会",
                "vod_quality": "0",
                "show_status": "1",
                "show_time": "1480497197",
                "owner_uid": "39767531",
                "specific_catalog": "",
                "specific_status": "0",
                "credit_illegal": "0",
                "is_white_list": "0",
                "cur_credit": "12",
                "low_credit": "4",
                "online": 1524,
                "nickname": "帅气的连连",
                "url": "/567695",
                "game_url": "/directory/game/ecy",
                "game_name": "二次元",
                "game_icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/c0a2f7ab21e356f8418c26313c779fc6.jpg",
                "show_details": "这里是萌萌的连连~喜欢烘培，画漫画，手办开箱，跟我混有饭吃唷~，粉丝2群：551433446 微博：连连一边绑窜天猴一边等过年  微信号：lianliankan520 ， 两架飞机上♂房♂管，两架飞机指定下♂房管~大家好好相处喔~",
                "owner_avatar": "https://apic.douyucdn.cn/upload/avanew/face/201611/29/23/1a674cf5bad00dbde8d01b7340427273_big.jpg?rltime",
                "cdnsWithName": [
                    {
                        "name": "主线路",
                        "cdn": "ws"
                    },
                    {
                        "name": "备用线路5",
                        "cdn": "tct"
                    },
                    {
                        "name": "备用线路2",
                        "cdn": "ws2"
                    },
                    {
                        "name": "备用线路3",
                        "cdn": "dl"
                    }
                ],
                "is_pass_player": 0,
                "owner_weight": "5.9t",
                "fans": "56092",
                "column_id": "2"
            }
        },
        {
            "id": 595032,
            "title": "鱼乐侃古今-萌叔古事",
            "pic_url": "https://staticlive.douyucdn.cn/upload/signs/201611301743495859.jpg",
            "tv_pic_url": "https://staticlive.douyucdn.cn/upload/signs/201611301743491667.jpg",
            "room": {
                "room_id": "595032",
                "room_src": "https://rpic.douyucdn.cn/a1611/30/17/595032_161130173516.jpg",
                "vertical_src": "https://rpic.douyucdn.cn/a1611/30/17/595032_161130173516.jpg",
                "isVertical": 0,
                "cate_id": "195",
                "room_name": "萌叔:保证不污的安史之乱~！！",
                "vod_quality": "0",
                "show_status": "1",
                "show_time": "1480492832",
                "owner_uid": "44682232",
                "specific_catalog": "",
                "specific_status": "0",
                "credit_illegal": "0",
                "is_white_list": "0",
                "cur_credit": "12",
                "low_credit": "4",
                "online": 3613,
                "nickname": "国艺藏香",
                "url": "/595032",
                "game_url": "/directory/game/yj",
                "game_name": "鱼教",
                "game_icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/ac9e22d6b80cb57b878e6fa3cca15400.jpg",
                "show_details": "欢迎大家来到“萌叔古事“直播间，周一至周五每天下午四点，周六晚上八点准时开播。\n水友群： 555108829     加群每天不定时抽奖\n过往节目回放：http://i.youku.com/i/UMzkxNTEzMjEy/videos",
                "owner_avatar": "https://apic.douyucdn.cn/upload/avatar/face/201604/30/00c39695892826194ae0c8e4b4082837_big.jpg?rltime",
                "cdnsWithName": [
                    {
                        "name": "主线路",
                        "cdn": "ws"
                    },
                    {
                        "name": "备用线路5",
                        "cdn": "tct"
                    },
                    {
                        "name": "备用线路2",
                        "cdn": "ws2"
                    },
                    {
                        "name": "备用线路3",
                        "cdn": "dl"
                    }
                ],
                "is_pass_player": 0,
                "owner_weight": "431.26kg",
                "fans": "4657",
                "column_id": "11"
            }
        }
    ]
}
 ```
 ---
 
<h4 id="1.0.4">4.推荐页--栏目列表</h4>
>
* 接口描述：获取到推荐页面 如英雄联盟，户外，数码科技等栏目
* 请求URL：http://capi.douyucdn.cn/api/v1/getHotCate?aid=android1&client_sys=android&time=1480500054&token=89175431_12_cd2cb4963d259081_1_54371072&auth=19ca301d4523a0af1c4945887ae0b03e
* 请求方式：Get
* 请求参数：
*        client_sys：设备类型 默认为：Android
*        time：时间戳
*        token：登录后token值
*        auth：
* 返回数据:

 ```
{
    "room_list": [
        {
            "specific_catalog": "",
            "vertical_src": "https://rpic.douyucdn.cn/a1611/30/17/846805_161130175453.jpg",
            "ranktype": "0",
            "nickname": "青铜皇帝赏金术士",
            "subject": "",
            "room_src": "https://rpic.douyucdn.cn/a1611/30/17/846805_161130175453.jpg",
            "cate_id": "1",
            "specific_status": "0",
            "game_name": "英雄联盟",
            "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201607/27/7dd14fa4de36dd10104c3e5f92f63e06_small.jpg",
            "online": 180377,
            "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201607/27/7dd14fa4de36dd10104c3e5f92f63e06_middle.jpg",
            "vod_quality": "0",
            "room_name": "赏金术士:答应大家的发条来了",
            "child_id": "32",
            "room_id": "846805",
            "show_time": "1480496318",
            "isVertical": 0,
            "show_status": "1",
            "jumpUrl": ""
        },
        {
            "specific_catalog": "cangshu",
            "vertical_src": "https://rpic.douyucdn.cn/a1611/30/17/244317_161130175502.jpg",
            "ranktype": "0",
            "nickname": "仓鼠炼金",
            "subject": "",
            "room_src": "https://rpic.douyucdn.cn/a1611/30/17/244317_161130175502.jpg",
            "cate_id": "1",
            "specific_status": "1",
            "game_name": "英雄联盟",
            "avatar_small": "https://apic.douyucdn.cn/upload/avatar/014/77/41/84_avatar_small.jpg",
            "online": 62224,
            "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/014/77/41/84_avatar_middle.jpg",
            "vod_quality": "0",
            "room_name": "三天上不了王者是狗",
            "child_id": "32",
            "room_id": "244317",
            "show_time": "1480495547",
            "isVertical": 0,
            "show_status": "1",
            "jumpUrl": ""
        },
        {
            "specific_catalog": "liangrenmiao",
            "vertical_src": "https://rpic.douyucdn.cn/a1611/30/17/526408_161130175455.jpg",
            "ranktype": "0",
            "nickname": "良人与猫zzz",
            "subject": "",
            "room_src": "https://rpic.douyucdn.cn/a1611/30/17/526408_161130175455.jpg",
            "cate_id": "1",
            "specific_status": "0",
            "game_name": "英雄联盟",
            "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201608/09/097352252f6ec72a4ad8942bbeb7ddf8_small.jpg",
            "online": 34482,
            "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201608/09/097352252f6ec72a4ad8942bbeb7ddf8_middle.jpg",
            "vod_quality": "0",
            "room_name": "骚良Adc: 韩服Adc从零单排新界面!",
            "child_id": "35",
            "room_id": "526408",
            "show_time": "1480496260",
            "isVertical": 0,
            "show_status": "1",
            "jumpUrl": ""
        },
        {
            "specific_catalog": "",
            "vertical_src": "https://rpic.douyucdn.cn/a1611/30/18/12313_161130180106.jpg",
            "ranktype": "0",
            "nickname": "叶音符",
            "subject": "",
            "room_src": "https://rpic.douyucdn.cn/a1611/30/18/12313_161130180106.jpg",
            "cate_id": "1",
            "specific_status": "0",
            "game_name": "英雄联盟",
            "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/16/00/4585c56859a589c549a5986619dd88aa_small.jpg",
            "online": 3693,
            "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/16/00/4585c56859a589c549a5986619dd88aa_middle.jpg",
            "vod_quality": "0",
            "room_name": "100%胜率皇子，输就送10000点券",
            "child_id": "34",
            "room_id": "12313",
            "show_time": "1480499987",
            "isVertical": 0,
            "show_status": "1",
            "jumpUrl": ""
        }
    ],
    "push_vertical_screen": "0",
    "icon_url": "https://staticlive.douyucdn.cn/upload/game_cate/f0a531a7198cac2ba0747c435644d690.jpg",
    "tag_name": "英雄联盟",
    "tag_id": "1"
}
 ```
 ----

<h4 id="1.0.5">5.推荐页--最热栏目</h4>
>
* 接口描述：首页--推荐页--最热栏目
* 请求URL：http://capi.douyucdn.cn/api/v1/getbigDataRoom?aid=android1&client_sys=android&time=1480501445&token=89175431_12_cd2cb4963d259081_1_54371072&auth=43b3facb607f9f0251a49182491bdceb
* 请求方式：Get
* 请求参数：
*        client_sys：设备类型 默认为：Android
*        time：时间戳
*        token：登录后token值
*        auth：
* 返回数据:

 ```
{
    "specific_catalog": "kk9",
    "vertical_src": "https://rpic.douyucdn.cn/a1611/30/18/235520_161130181604.jpg",
    "ranktype": "6",
    "nickname": "14yearsold天残少年K9",
    "subject": "",
    "room_src": "https://rpic.douyucdn.cn/a1611/30/18/235520_161130181604.jpg",
    "cate_id": "3",
    "specific_status": "1",
    "game_name": "DOTA2",
    "online": 11857,
    "avatar_small": "https://apic.douyucdn.cn/upload/avatar/013/50/64/21_avatar_small.jpg",
    "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/013/50/64/21_avatar_middle.jpg",
    "recomType": "0",
    "vod_quality": "0",
    "room_name": "K9：无情的上分机器！++25",
    "child_id": "92",
    "room_id": "235520",
    "show_time": "1480490200",
    "isVertical": 0,
    "show_status": "1",
    "jumpUrl": ""
}
 ```
 ---

<h4 id="1.0.6">6.推荐页--颜值栏目 </h4>
>
* 接口描述：首页--推荐页--颜值栏目 本栏目做全屏直播 单独跳转到全屏直播详情页
* 请求URL：http://capi.douyucdn.cn/api/v1/getVerticalRoom?offset=0&limit=4&client_sys=android
* 请求方式：Get
* 请求参数：
*        client_sys：设备类型 默认为：Android
*        offset：从第几个开始  （分页加载数据）
*        limit： 到那个结束
* 返回数据：

 ```
 {
    "room_id": "622090",
    "room_src": "https://rpic.douyucdn.cn/appCovers/2016/11/11/622090_201611112121_small.jpg",
    "vertical_src": "https://rpic.douyucdn.cn/appCovers/2016/11/11/622090_201611112121_big.jpg",
    "isVertical": 1,
    "cate_id": "201",
    "room_name": "我是中国人！！",
    "show_status": "1",
    "subject": "",
    "show_time": "1480499177",
    "owner_uid": "47020181",
    "specific_catalog": "",
    "specific_status": "0",
    "vod_quality": "0",
    "nickname": "杨家有个欢妹子",
    "online": 66172,
    "game_name": "颜值",
    "child_id": "0",
    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201611/12/18/cecdc51d522310faa050f501c1e0fb4c_middle.jpg",
    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201611/12/18/cecdc51d522310faa050f501c1e0fb4c_small.jpg",
    "jumpUrl": "",
    "ranktype": 0,
    "show_type": 1,
    "anchor_city": "Seongbuk"
}
 ```
 ----
 

<h4 id="1.0.7">7.直播房间详情页</h4>
>
* 接口描述：直播房间详情页---为了查找auth的算法，我先是反编译了斗鱼的apk，结果他们把算法藏在了JNI里，随后尝试反汇编找出来的Share Object,无果。然后在斗鱼网页里的javascript里各种找，也没有，不过发现网页里也有一条类似的API，是从swf里发出的。之后去逐个反编译斗鱼网页里的swf，发现核心的core.swf是被加密了的，好在webroom.swf里找到了解密逻辑。解密后找到一个算sign/auth的function，然而没看懂，是一种变形的C。。最后的最后我在github上搜了一下之前解密用的key，发现之前果然有大神找到了auth算法，[附链接](https://github.com/0987363/douyutv-fix/blob/3dd6b9762a4cf5d359170b4a912457a0d4b5f5e5/DouYu-kodi-fix/APIHelper.py)。拿到算法，玩了一圈发现必须是这个格式才行，把android换成ios就会验证失败
* 请求URL：http://capi.douyucdn.cn/api/v1/room/235520?aid=android1&client_sys=android&ne=1&support_pwd=1&time=1480501469&token=89175431_12_cd2cb4963d259081_1_54371072&auth=6fddd0d2e155255e923e208bebd7efb9
* 请求方式：Get
* 请求参数：
*        client_sys：设备类型 默认为：Android
*        roomid:房间ID
*        time:unixtime/1000 
*        aid:设备标示   默认：Android1
*        ne：          默认：1
*        support_pwd： 默认：1
*        token： 登录后获取token
*        auth: md5("room/"+roomid+"?aid=android&clientsys=android&time="+1231)注意：time要和上面一致，android也不能改成ios 
 
* 返回数据：

 ```
 {
    "error": 0,
    "data": {
    "room_id": "58428",
    "room_src": "http://rpic.douyucdn.cn/z1602/23/23/58428_160223234559.jpg",
    "cate_id": "3",
    "room_name": "yyf直播间  电子竞技只有锤！",
    "vod_quality": "0",
    "show_status": "2",
    "show_time": "1456221459",
    "owner_uid": "236231",
    "specific_catalog": "",
    "specific_status": "1",
    "online": 0,   // 这个是在线人数，虽然比较虚
    "nickname": "yyfyyf",
    "url": "/58428",
    "game_url": "/directory/game/DOTA2",
    "game_name": "DOTA2",
    "game_icon_url": "http://staticlive.douyutv.com/upload/game_cate/bfe845a28fef8106cf645ed3b83aa375.jpg",
    "rtmp_url": "",   //如果再直播会有，我抓这个时候鱼鱼枫已经被怼的下播了
    "rtmp_live": "",
    "rtmp_cdn": "",
    "rtmp_multi_bitrate": [],
    "hls_url": "",
    "servers": [   //这个就比较重要了，这个是弹幕验证服务器列表！弹幕相关的socket加密解密源代码我也找到了。如有需求请留言，我看情况发出来。
        {
        "ip": "119.90.49.93",
        "port": "8063"
        },
        ....略
    ],
    "use_p2p": "0",
    "room_dm_delay": 30,
    "black": [],
    "show_details": "yyf贴吧: http://tieba.baidu.com/f?kw=yyf&amp;fr=ala0&amp;tpl=5\n新浪微博: http://www.weibo.com/u/2176141495/home?wvr=5",
    "owner_avatar": "http://uc.douyutv.com/avatar.php?uid=236231&size=big",
    "cdns": [],
    "owner_weight": "304.67t",   //主播体重
    "fans": "492867",             //这个应该是关注数。
    "gift": [                  //一些礼物信息
        {
        "id": "59",
        "name": "火箭",
        "pc": "50000",
        "type": "2",
        "gx": 5000,
        "desc": "赠送网站广播并派送出神秘宝箱",
        "intro": "我们的征途是星辰大海",
        "ef": 1,
        "pimg": "http://staticlive.douyutv.com/upload/dygift/447b61f6c0d6890d4490a90d0bdbf8bc.png",
        "mimg": "http://staticlive.douyutv.com/upload/dygift/ab957377200959761121a3791a54b9b7.png",
        "cimg": "http://staticlive.douyutv.com/upload/dygift/7dce6b2170eebecf85596b47370217ce.gif",
        "himg": "http://staticlive.douyutv.com/upload/dygift/7f0643700d331aca31a6f6ea255e323e.gif",
        "stay_time": 200000,
        "drgb": "",
        "urgb": "#732909",
        "grgb": "#732909",
        "brgb": "#5861b5",
        "pdbimg": "http://staticlive.douyutv.com/upload/dygift/005786105dd86e3964732e7fc2fc2085.png",
        "pdhimg": "http://staticlive.douyutv.com/upload/dygift/6ffb9bc8d35d315943ae117dc788824e.gif",
        "small_effect_icon": "http://staticlive.douyutv.com/upload/dygift/75e55aae938fc703d977e8c966fef91d.png",
        "big_effect_icon": "http://staticlive.douyutv.com/upload/dygift/40f964e70faa46923dcc4c4931bbac8f.gif",
        "pad_big_effect_icon": "http://staticlive.douyutv.com/upload/dygift/ccffe8c6453074a68be1730802203241.gif"
        },
        ...略
    ]
    }
} 

 ```
 ----

<h4 id="1.0.8">8.获取服务器端时间戳</h4>
>
* 接口描述： 获取服务端时间戳
* 请求URL：http://capi.douyucdn.cn/api/v1/timestamp
* 请求方式：Get
* 返回数据:

 ```
{
    "error": 0,
    "data": 1481721800
}
 ```
---

<h4 id="1.0.9">9.用户注册协议</h4>
>
* 接口描述： 用户注册协议
* 请求URL：http://www.douyu.com/protocal/client

 ---
 
 
<h4 id="1.1.0">10.栏目--全部视频</h4>
>
* 接口描述： 获取某个栏目中的全部视频 
* 请求URL：http://capi.douyucdn.cn/api/v1/live/1?offset=0&limit=20&client_sys=android
* 请求方式：Get
* 请求参数：
*        1  ---> tag_id
*        client_sys：设备类型 默认为：Android
*        offset：从第几个开始  （分页加载数据）
*        limit： 到那个结束
* 返回数据:

 ```
 [
    {
        "room_id": "12306",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/12306_170313135306.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/12306_170313135306.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "刷会儿深渊 然后LOL",
        "show_status": "1",
        "subject": "",
        "show_time": "1489376013",
        "owner_uid": "310260",
        "specific_catalog": "DianGun",
        "specific_status": "1",
        "vod_quality": "0",
        "nickname": "电棍",
        "online": 9140,
        "url": "/DianGun",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 34,
        "avatar": "https://apic.douyucdn.cn/upload/avatar/000/31/02/60_avatar_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/000/31/02/60_avatar_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avatar/000/31/02/60_avatar_small.jpg",
        "jumpUrl": "",
        "fans": "261481",
        "ranktype": 2,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "39300",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/39300_170313135337.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/39300_170313135337.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "舟：打野教学，99%胜率爆炸凯瑞！",
        "show_status": "1",
        "subject": "",
        "show_time": "1489368801",
        "owner_uid": "526822",
        "specific_catalog": "zhouge",
        "specific_status": "1",
        "vod_quality": "0",
        "nickname": "Zhou_",
        "online": 18804,
        "url": "/zhouge",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 33,
        "avatar": "https://apic.douyucdn.cn/upload/avatar/face/201609/01/bfd919909343472a10e40fa785bc390b_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201609/01/bfd919909343472a10e40fa785bc390b_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201609/01/bfd919909343472a10e40fa785bc390b_small.jpg",
        "jumpUrl": "",
        "fans": "268667",
        "ranktype": 2,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "653999",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/653999_170313135353.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/653999_170313135353.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "找状态磨心态一个星期",
        "show_status": "1",
        "subject": "",
        "show_time": "1489360369",
        "owner_uid": "49859805",
        "specific_catalog": "",
        "specific_status": "0",
        "vod_quality": "0",
        "nickname": "监狱薇恩光头强i",
        "online": 4018,
        "url": "/653999",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 35,
        "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201610/22/07/0331fe323ede30ab55c12ae2d00888ed_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201610/22/07/0331fe323ede30ab55c12ae2d00888ed_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201610/22/07/0331fe323ede30ab55c12ae2d00888ed_small.jpg",
        "jumpUrl": "",
        "fans": "99582",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "522424",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/522424_170313134956.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/522424_170313134956.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "TL vs C9 重播 16点 LCS EU",
        "show_status": "1",
        "subject": "",
        "show_time": "1485141294",
        "owner_uid": "34223270",
        "specific_catalog": "lcs",
        "specific_status": "1",
        "vod_quality": "0",
        "nickname": "Riot丶LCS",
        "online": 41530,
        "url": "/lcs",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 37,
        "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201612/22/11/cd342c0703b2a9a6efa038eb51ef94ac_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201612/22/11/cd342c0703b2a9a6efa038eb51ef94ac_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201612/22/11/cd342c0703b2a9a6efa038eb51ef94ac_small.jpg",
        "jumpUrl": "",
        "fans": "92948",
        "ranktype": 7,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "16487",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/16487_170313135157.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/16487_170313135157.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "USB:王者U今天带老二上分",
        "show_status": "1",
        "subject": "",
        "show_time": "1489381660",
        "owner_uid": "330400",
        "specific_catalog": "woshiu",
        "specific_status": "1",
        "vod_quality": "0",
        "nickname": "U神曾龙",
        "online": 33976,
        "url": "/woshiu",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 34,
        "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201612/15/13/5c28debaaefe675042558f299df6f5f8_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201612/15/13/5c28debaaefe675042558f299df6f5f8_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201612/15/13/5c28debaaefe675042558f299df6f5f8_small.jpg",
        "jumpUrl": "",
        "fans": "212435",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "37807",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/37807_170313135223.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/37807_170313135223.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "今天休息...爷爷奶奶结婚60周年",
        "show_status": "1",
        "subject": "",
        "show_time": "1489380660",
        "owner_uid": "881294",
        "specific_catalog": "vrkof97",
        "specific_status": "1",
        "vod_quality": "0",
        "nickname": "战神_河池VR",
        "online": 29817,
        "url": "/vrkof97",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 168,
        "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201702/22/06/5fc1436da3e1c10dec422e5fd7ca0573_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201702/22/06/5fc1436da3e1c10dec422e5fd7ca0573_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201702/22/06/5fc1436da3e1c10dec422e5fd7ca0573_small.jpg",
        "jumpUrl": "",
        "fans": "389287",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "1065655",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/14/1065655_170313140229.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/14/1065655_170313140229.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "电一排位赛主打输出",
        "show_status": "1",
        "subject": "",
        "show_time": "1489384338",
        "owner_uid": "8629126",
        "specific_catalog": "LBB333",
        "specific_status": "0",
        "vod_quality": "0",
        "nickname": "脾气不好天仙老婆",
        "online": 3516,
        "url": "/1065655",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 168,
        "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201703/03/10/6e16607ce79d3e197c2d57e9c769c913_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201703/03/10/6e16607ce79d3e197c2d57e9c769c913_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201703/03/10/6e16607ce79d3e197c2d57e9c769c913_small.jpg",
        "jumpUrl": "",
        "fans": "56929",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "1305436",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/14/1305436_170313140243.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/14/1305436_170313140243.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "QAQ陪伴是最深情的告白",
        "show_status": "1",
        "subject": "",
        "show_time": "1489383906",
        "owner_uid": "79004282",
        "specific_catalog": "",
        "specific_status": "0",
        "vod_quality": "0",
        "nickname": "萌萌欣๑",
        "online": 2835,
        "url": "/1305436",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 168,
        "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201703/13/10/d07a132c6ca6a5f22910a8743384861c_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201703/13/10/d07a132c6ca6a5f22910a8743384861c_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201703/13/10/d07a132c6ca6a5f22910a8743384861c_small.jpg",
        "jumpUrl": "",
        "fans": "3373",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "288016",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/288016_170313134306.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/288016_170313134306.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "LPL春季赛 3月12日 重播",
        "show_status": "1",
        "subject": "",
        "show_time": "1489162500",
        "owner_uid": "19344409",
        "specific_catalog": "lpl",
        "specific_status": "1",
        "vod_quality": "0",
        "nickname": "英雄联盟官方赛事",
        "online": 246313,
        "url": "/lpl",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 37,
        "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201703/12/01/c465f47d89489973926c2e4fe6129f32_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201703/12/01/c465f47d89489973926c2e4fe6129f32_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201703/12/01/c465f47d89489973926c2e4fe6129f32_small.jpg",
        "jumpUrl": "",
        "fans": "1544155",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "271934",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/271934_170313134241.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/271934_170313134241.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "久哥 ：我笑的时候贼狠。",
        "show_status": "1",
        "subject": "",
        "show_time": "1489366846",
        "owner_uid": "13165979",
        "specific_catalog": "skt9",
        "specific_status": "0",
        "vod_quality": "0",
        "nickname": "叫我久哥哥",
        "online": 218601,
        "url": "/271934",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 34,
        "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201610/22/13/67d72ffdbcfd99ba0d0eab64b379a055_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201610/22/13/67d72ffdbcfd99ba0d0eab64b379a055_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201610/22/13/67d72ffdbcfd99ba0d0eab64b379a055_small.jpg",
        "jumpUrl": "",
        "fans": "1247988",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "891464",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/891464_170313134911.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/891464_170313134911.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "人帅操作虎",
        "show_status": "1",
        "subject": "",
        "show_time": "1489372132",
        "owner_uid": "10665210",
        "specific_catalog": "",
        "specific_status": "0",
        "vod_quality": "0",
        "nickname": "太原马超丶",
        "online": 65762,
        "url": "/891464",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 168,
        "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201612/27/16/6ab5459516819a64364635a02a315456_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201612/27/16/6ab5459516819a64364635a02a315456_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201612/27/16/6ab5459516819a64364635a02a315456_small.jpg",
        "jumpUrl": "",
        "fans": "120062",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "522423",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/522423_170313135255.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/522423_170313135255.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "2017LCK春季赛 3月12日重播",
        "show_status": "1",
        "subject": "",
        "show_time": "1489377944",
        "owner_uid": "34222876",
        "specific_catalog": "lck",
        "specific_status": "1",
        "vod_quality": "0",
        "nickname": "Riot丶LCK",
        "online": 56621,
        "url": "/lck",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 37,
        "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201612/22/11/d78b969ee15585976403feee9f246d51_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201612/22/11/d78b969ee15585976403feee9f246d51_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201612/22/11/d78b969ee15585976403feee9f246d51_small.jpg",
        "jumpUrl": "",
        "fans": "815091",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "599358",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/599358_170313135331.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/599358_170313135331.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "伞皇：心态爆炸反冲王者！",
        "show_status": "1",
        "subject": "",
        "show_time": "1489370387",
        "owner_uid": "24190777",
        "specific_catalog": "",
        "specific_status": "0",
        "vod_quality": "0",
        "nickname": "良小伞san",
        "online": 56471,
        "url": "/599358",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 35,
        "avatar": "https://apic.douyucdn.cn/upload/avatar/face/201608/16/0cc8ad314c3aee4350d3e426c8ecf872_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201608/16/0cc8ad314c3aee4350d3e426c8ecf872_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201608/16/0cc8ad314c3aee4350d3e426c8ecf872_small.jpg",
        "jumpUrl": "",
        "fans": "562451",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "524080",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/524080_170313134223.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/524080_170313134223.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "小晚：他们说我",
        "show_status": "1",
        "subject": "",
        "show_time": "1489374130",
        "owner_uid": "34032631",
        "specific_catalog": "",
        "specific_status": "0",
        "vod_quality": "0",
        "nickname": "南小晚",
        "online": 37630,
        "url": "/524080",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 168,
        "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201701/01/03/03dff17b0e3eca2d2057acc7bbe44f1e_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201701/01/03/03dff17b0e3eca2d2057acc7bbe44f1e_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201701/01/03/03dff17b0e3eca2d2057acc7bbe44f1e_small.jpg",
        "jumpUrl": "",
        "fans": "368790",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "571881",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/571881_170313135247.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/571881_170313135247.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "工号9527老陈：北美大叔盲僧",
        "show_status": "1",
        "subject": "",
        "show_time": "1489378849",
        "owner_uid": "27165101",
        "specific_catalog": "baofengob",
        "specific_status": "1",
        "vod_quality": "0",
        "nickname": "暴风OB",
        "online": 37280,
        "url": "/baofengob",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 33,
        "avatar": "https://apic.douyucdn.cn/upload/avatar/face/201603/944ea40936ef35b4fa5ca0215f6bbadf_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/face/201603/944ea40936ef35b4fa5ca0215f6bbadf_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avatar/face/201603/944ea40936ef35b4fa5ca0215f6bbadf_small.jpg",
        "jumpUrl": "",
        "fans": "245214",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "69618",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/69618_170313135347.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/69618_170313135347.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "可以上大师了！！",
        "show_status": "1",
        "subject": "",
        "show_time": "1489365305",
        "owner_uid": "2422516",
        "specific_catalog": "xiaomifan",
        "specific_status": "1",
        "vod_quality": "0",
        "nickname": "第一女蛮王丶饭饭",
        "online": 35993,
        "url": "/xiaomifan",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 168,
        "avatar": "https://apic.douyucdn.cn/upload/avatar/002/42/25/16_avatar_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avatar/002/42/25/16_avatar_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avatar/002/42/25/16_avatar_small.jpg",
        "jumpUrl": "",
        "fans": "421619",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "24418",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/24418_170313134929.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/24418_170313134929.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "OB青铜五:好好看 好好学 做好笔记",
        "show_status": "1",
        "subject": "",
        "show_time": "1489334054",
        "owner_uid": "409388",
        "specific_catalog": "AZW",
        "specific_status": "1",
        "vod_quality": "0",
        "nickname": "斗鱼丶华仔",
        "online": 23696,
        "url": "/AZW",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 37,
        "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201702/24/17/5dee9ae7c4c3b41a48551d61d7a0a265_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201702/24/17/5dee9ae7c4c3b41a48551d61d7a0a265_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201702/24/17/5dee9ae7c4c3b41a48551d61d7a0a265_small.jpg",
        "jumpUrl": "",
        "fans": "567854",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "329364",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/329364_170313135330.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/329364_170313135330.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "❤老阳：版本全ADC教学系列~❤",
        "show_status": "1",
        "subject": "",
        "show_time": "1489370517",
        "owner_uid": "9446102",
        "specific_catalog": "ailaoyang",
        "specific_status": "0",
        "vod_quality": "0",
        "nickname": "老阳解说",
        "online": 18731,
        "url": "/329364",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 35,
        "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201703/09/23/c8bbb0844c81263006ddb39ffa7e1bf1_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201703/09/23/c8bbb0844c81263006ddb39ffa7e1bf1_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201703/09/23/c8bbb0844c81263006ddb39ffa7e1bf1_small.jpg",
        "jumpUrl": "",
        "fans": "242519",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "22822",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/22822_170313135332.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/22822_170313135332.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "齐小岳:韩服王者质量局",
        "show_status": "1",
        "subject": "",
        "show_time": "1489369909",
        "owner_uid": "546798",
        "specific_catalog": "",
        "specific_status": "0",
        "vod_quality": "0",
        "nickname": "齐小岳丶",
        "online": 12748,
        "url": "/22822",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 33,
        "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201701/29/22/d02d87635d27746bb73b3a231359a0e8_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201701/29/22/d02d87635d27746bb73b3a231359a0e8_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201701/29/22/d02d87635d27746bb73b3a231359a0e8_small.jpg",
        "jumpUrl": "",
        "fans": "83340",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    },
    {
        "room_id": "633980",
        "room_src": "https://rpic.douyucdn.cn/a1703/13/13/633980_170313135351.jpg",
        "vertical_src": "https://rpic.douyucdn.cn/a1703/13/13/633980_170313135351.jpg",
        "isVertical": 0,
        "cate_id": 1,
        "room_name": "狗康：一刀秒杀流皎月，早8开播",
        "show_status": "1",
        "subject": "",
        "show_time": "1489363255",
        "owner_uid": "47490147",
        "specific_catalog": "kdiana",
        "specific_status": "1",
        "vod_quality": "0",
        "nickname": "狗康Bfate丶",
        "online": 11791,
        "url": "/kdiana",
        "game_url": "/directory/game/LOL",
        "game_name": "英雄联盟",
        "child_id": 34,
        "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201610/15/22/c266ffaeacc4f3c04bbaca0a9d7680b6_big.jpg",
        "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201610/15/22/c266ffaeacc4f3c04bbaca0a9d7680b6_middle.jpg",
        "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201610/15/22/c266ffaeacc4f3c04bbaca0a9d7680b6_small.jpg",
        "jumpUrl": "",
        "fans": "230807",
        "ranktype": 0,
        "is_noble_rec": 0,
        "anchor_city": ""
    }
] 

 ```
 ---

<h4 id="1.1.1">11.栏目更多--二级分类列表</h4>
>
* 接口描述： 获取首页分类信息
* 请求URL：http://capi.douyucdn.cn/api/v1/getThreeCate?tag_id=1&client_sys=android
* 请求方式：Get
* 请求参数：
*        tag_id：父类ID
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
[
    {
        "id": "168",
        "name": "妹纸主播"
    },
    {
        "id": "32",
        "name": "荣耀上单"
    },
    {
        "id": "33",
        "name": "野区霸主"
    },
    {
        "id": "34",
        "name": "中路杀神"
    },
    {
        "id": "35",
        "name": "最强AD"
    },
    {
        "id": "36",
        "name": "神级辅助"
    },
    {
        "id": "37",
        "name": "赛事直播"
    }
]
 ```
 ---
 
<h4 id="1.1.2">12.二级栏目直播列表</h4>
>
* 接口描述： 获取首页分类信息
* 请求URL：http://capi.douyucdn.cn/api/v1/getThreeList?cate_id=168&offset=0&limit=20&client_sys=android
* 请求方式：Get
* 请求参数：
*        cate_id：分类ID
*        client_sys：设备类型 默认为：Android
* 返回数据:

 ```
{
    "room_id": "891464",
    "room_src": "https://rpic.douyucdn.cn/a1703/13/14/891464_170313140442.jpg",
    "vertical_src": "https://rpic.douyucdn.cn/a1703/13/14/891464_170313140442.jpg",
    "isVertical": 0,
    "cate_id": 1,
    "room_name": "人帅操作虎",
    "show_status": "1",
    "subject": "",
    "show_time": "1489372132",
    "owner_uid": "10665210",
    "specific_catalog": "",
    "specific_status": "0",
    "vod_quality": "0",
    "nickname": "太原马超丶",
    "online": 52558,
    "url": "/891464",
    "game_url": "/directory/game/LOL",
    "game_name": "英雄联盟",
    "child_id": 168,
    "avatar": "https://apic.douyucdn.cn/upload/avanew/face/201612/27/16/6ab5459516819a64364635a02a315456_big.jpg",
    "avatar_mid": "https://apic.douyucdn.cn/upload/avanew/face/201612/27/16/6ab5459516819a64364635a02a315456_middle.jpg",
    "avatar_small": "https://apic.douyucdn.cn/upload/avanew/face/201612/27/16/6ab5459516819a64364635a02a315456_small.jpg",
    "jumpUrl": "",
    "icon_data": {
        "status": 5,
        "icon_url": "",
        "icon_width": 0,
        "icon_height": 0
    },
    "fans": "120085",
    "ranktype": 0,
    "anchor_city": "",
    "is_noble_rec": 0
}
 ```
 ---

[^有接口相关问题]:
  联系QQ：377413612
  


  

 

