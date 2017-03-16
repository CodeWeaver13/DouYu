package com.team.zhuoke.utils;

import java.text.DecimalFormat;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：   用于服务器交互数据转换!
 *  备注消息：
 *  修改时间：2017/1/17 下午3:04
 **/
public class CalculationUtils {

      public static String  getOnLine(int number)
      {
          DecimalFormat df=new DecimalFormat(".#");
               if(number<10000)
               {
                   return number+"";
               }
              else{
                     double  nums=(double)number/10000;
                   String result=df.format(nums);
                   return  result+"万";
               }
      }

}
