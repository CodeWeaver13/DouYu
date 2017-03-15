
![斗鱼TV](https://staticlive.douyucdn.cn/upload/signs/201610291926483131.png)
 
#斗鱼Tv项目

####版权说明：该项目纯属练手项目，不作为商用项目！有涉及到侵权请告知删除，涉及商用侵权与本人无关！
##目录结构
* ------------------------[开发环境](#1.0.0)
* ------------------------[更新日志](#2.0.0)
* ------------------------[应用截图](#3.0.0)
* ------------------------[下载地址](#4.0.0)
* ------------------------[接口文档说明](#5.0.0)
* ------------------------[项目中使用到的三方库说明](#6.0.0)
* ------------------------[项目反馈](#7.0.0)
* ------------------------[参考资料](#8.0.0)
* ------------------------[Issuse Me](#9.0.0)

<h3 id="1.0.0"> 一.开发环境 </h3>

| 开发工具  | 开发语言      |SDK版本 |JDK版本|
|:------ |:---------:| :-----:     | :-----:     |
| AndroidStudio2.2   | JAVA | 25 |  1.8 |
  
  
<h3 id="2.0.0">二.更新日志 </h3>

###2017-2-23
---

* 1.添加视频弹幕功能（扩展弹幕show,hide等！）
	
* 2.绘制播放Loading动画

* 3.添加直播视频控制界面

* 4.添加直播手势控制（音量，亮度等）
	
---

###2017-2-20
---


* 1.主UI框架搭建
	
* 2.项目框架封装（包括网络，图片等）
	
* 3.封装项目中使用到的三方库，工具类等
	
* 4.针对申请Android6.0权限问题进行处理
	
* 5.接口抓取（首页，直播，视频模块接口完成度60%）
 
* 6.加入Android适配方案（百分比适配与Dimens适配）
	
* 7.书写业务逻辑（首页，直播，视频模块逻辑）
	
* 8.使用Vitamio作为直播流媒体播放器 

---

 
<h3 id="3.0.0">三.应用截图</h3>
  <center>
<img src="https://github.com/mykj/DouYu/blob/master/upload_image/678D6ACFDFAA01AC6333EC682F1A1D57.png" width="50%" height="50%" />
   <p>
  <h5>3.1.1图</h5>
  </p>
</center>
<div></div>
  <center>
<img src="https://github.com/mykj/DouYu/blob/master/upload_image/DACCBB63F4390F462D498615DCAA4BC7.png" width="50%" height="50%" />
   <p>
  <h5>3.1.2图</h5>
  </p>
</center>
<div></div>

  <center>
<img src="https://github.com/mykj/DouYu/blob/master/upload_image/97901F29A1B07C41B574829D8EAD29A1.png" width="50%" height="50%" />
   <p>
  <h5>3.1.3图</h5>
  </p>
</center>
<div></div>

  <center>
<img src="https://github.com/mykj/DouYu/blob/master/upload_image/DFC42CEC41072AF3F06FB110CAC385CC.png" width="50%" height="50%" />
   <p>
  <h5>3.1.4图</h5>
  </p>
</center>
<div></div>

  <center>
<img src="https://github.com/mykj/DouYu/blob/master/upload_image/04A99D0900B1418A37943CCE169E2C3D.png" width="50%" height="50%" />
   <p>
  <h5>3.1.5图</h5>
  </p>
</center>
<div></div>
  <center>
<img src="https://github.com/mykj/DouYu/blob/master/upload_image/7540E9A56688E00078BBD79554B000E1.png" width="50%" height="50%" />
   <p>
  <h5>3.1.6图</h5>
  </p>
</center>
<div></div>
  <center>
<img src="https://github.com/mykj/DouYu/blob/master/upload_image/3C42F496B3D447D3009DC543D1477186.png" width="50%" height="50%" />
   <p>
  <h5>3.1.7图</h5>
  </p>
</center>
<div></div>
  <center>
<img src="https://github.com/mykj/DouYu/blob/master/upload_image/35692D640637F2A6D2FCF09F9E8B4C48.jpg" width="50%" height="50%" />
   <p>
  <h5>3.1.8图</h5>
  </p>
</center>
<div></div>
  <center>
<img src="https://github.com/mykj/DouYu/blob/master/upload_image/5FC86F4A3DAE79B29DF275C69B7B75A7.jpg" width="50%" height="50%" />
   <p>
  <h5>3.1.9图</h5>
  </p>
</center>
<div></div>
  
<h3 id="4.0.0">四.下载地址</h3>
   
   下载方式
   ---
   
  * 1.扫码二维码
 
  ![app下载](https://github.com/mykj/DouYu/blob/master/upload_image/536FAFE7-C0BA-4E28-8875-D6BB134880A3.png)
       
       
  * 2.下载地址:[点击这里](https://www.pgyer.com/DouYuTv)
     
   ---
  
<h3 id="5.0.0">五.斗鱼接口文档</h3>
 
  * [首页API文档说明](https://github.com/TeamCodeForGit/DouYu/blob/master/document/HomeApi.md)
  *  [直播API文档说明](https://github.com/TeamCodeForGit/DouYu/blob/master/document/LiveApi.md)
  *  [视频API文档说明](https://github.com/TeamCodeForGit/DouYu/blob/master/document/VideoApi.md)
  *  [关注API文档说明](https://github.com/TeamCodeForGit/DouYu/blob/master/document/HomeApi.md)
  *  [个人API文档说明](https://github.com/TeamCodeForGit/DouYu/blob/master/document/HomeApi.md)
  
  ---
  
<h3 id="6.0.0">六.三方库说明</h3>
   
   
 ```
   //     适配
    compile 'com.zhy:autolayout:1.4.5'
    //黄油刀
    compile 'com.jakewharton:butterknife:8.1.0'
    apt 'com.jakewharton:butterknife-compiler:8.1.0'
    //提示框，消息框等
    compile 'com.github.GaoYin2016:Android-SVProgressHUD:1.0'
    //    侧滑返回
    compile 'me.imid.swipebacklayout.lib:library:1.0.0'
    //RxJava and RxAndroid
    compile 'io.reactivex:rxjava:1.1.8'
    compile 'io.reactivex:rxandroid:1.2.1'
    // permissions
    compile 'com.tbruyelle.rxpermissions:rxpermissions:0.9.0@aar'
    //RxLifecycle 内存泄露
    compile 'com.trello:rxlifecycle:0.6.1'
    compile 'com.trello:rxlifecycle-components:0.6.1'
    compile 'com.android.support:appcompat-v7:25.0.1'
    compile 'com.android.support:recyclerview-v7:25.0.1'
    //    网络依赖库日志打印
    compile 'com.squareup.okhttp3:logging-interceptor:3.3.1'
    //Retrofit2
    compile 'com.squareup.retrofit2:retrofit:2.1.0'
    compile 'com.squareup.retrofit2:adapter-rxjava:2.1.0'
    compile 'com.squareup.retrofit2:converter-gson:2.1.0'
    // log管理
    compile 'com.orhanobut:logger:1.15'
    compile files('libs/tbs_sdk_thirdapp_v2.5.0.1031_36880_sharewithdownload_obfs_20161107_154437.jar')
    //-------图片框架------
    compile 'com.facebook.fresco:fresco:0.12.0'
    compile 'com.facebook.fresco:imagepipeline-okhttp3:0.12.0'
    // 在 API < 14 上的机器支持 WebP 时，需要添加
    compile 'com.facebook.fresco:animated-base-support:0.12.0'

    // 支持 GIF 动图，需要添加
    compile 'com.facebook.fresco:animated-gif:0.12.0'
    // 支持 WebP （静态图+动图），需要添加
    compile 'com.facebook.fresco:animated-webp:0.12.0'
    compile 'com.facebook.fresco:webpsupport:0.12.0'
    // 仅支持 WebP 静态图，需要添加
    compile 'com.facebook.fresco:webpsupport:0.12.0'
    compile files('libs/tbs_sdk_thirdapp_v2.5.0.1037_36880_minsize_obfs_20161110_102536.jar')
    //TabLayout
    compile 'com.flyco.tablayout:FlycoTabLayout_Lib:2.1.0@aar'
//    轮播图
    compile 'cn.bingoogolapple:bga-banner:2.1.5@aar'
    compile 'com.android.support:support-v4:25.0.1'
//    eventbus
    compile 'org.greenrobot:eventbus:3.0.0'
//    视频播放器
    compile project(path: ':InitActivity')
////    adapter
    compile 'com.github.CymChad:BaseRecyclerViewAdapterHelper:2.7.7'
//    弹幕
    compile 'com.github.ctiao:DanmakuFlameMaster:0.4.6'
   
 ```
  ---
  
<h3 id="7.0.0">七.项目反馈</h3>
   
| 联系人  | QQ        |邮箱 |
|:------ |:---------:| :-----:     |
| 高印    | 377413612 |gaoyin_vip@126.com |


---

<h3 id="8.0.0">八.参考资料</h3>

* 弹幕三方库：[DanMu](https://github.com/Bilibili/DanmakuFlameMaster)

* 轮播图：[BGABanner](https://github.com/bingoogolapple/BGABanner-Android)

* 刷新加载控件[XRefreshView](https://github.com/huxq17/XRefreshView)

* 导航栏控件 [FlyCoTabLayout](https://github.com/H07000223/FlycoTabLayout)

* 弹幕与房间加密参考项目：[斗鱼项目](https://github.com/littleMeng/video-live)

* 直播视频播放器 ：[vitamio播放器](https://github.com/yixia/VitamioBundle) (备注:直播视频格式：HLS,RTMP）

---

<h3 id="9.0.0">九.Issuse</h3>


   <div>&nbsp;&nbsp;&nbsp;&nbsp;本项目所有的API利用Charles抓取，项目只适合分享，学习，交流！不得用于商业用途，觉得项目不错的小伙伴，可以在右上角Star一下，后期项目会不断优化，在这过程中遇到什么问题与BUG ，欢迎大家[Issuse Me](https://github.com/mykj/DouYu/issues)</div>
   
 &nbsp;<h6><center>Copyright 2017 GaoYin</center></h6>

---
 
