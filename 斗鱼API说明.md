
![斗鱼TV](https://staticlive.douyucdn.cn/upload/signs/201610291926483131.png)
#斗鱼Tv API

##一.首页模块 

###1.首页分类列表
>
* 接口描述： 获取首页分类信息
* 请求URL：http://capi.douyucdn.cn/api/homeCate/getCateList
* 请求方式：Get
* 请求参数：
*        client_sys：设备类型 默认为：Android
* 返回数据: Json数据


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
 

