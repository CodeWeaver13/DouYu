package com.team.zhuoke.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * @author: 范建海
 * @createTime: 2016/10/24 10:32
 * @className:  GsonUtil
 * @description: Gson解析相关工具类
 * @changed by:
 */
public class GsonUtil {
    // Gson实体
    private static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss:SSS").create();

    /**
     * JSON字符解析成<T>对象
     * @param <T>
     * @param json
     * @param typeToken 对象类型，参数实例化方法：new TypeToken<TestVO>(){}
     * @return
     */
    public static <T> T json2Object(String json, TypeToken<T> typeToken) {
        return gson.fromJson(json, typeToken.getType());
    }

    /**
     * JSON字符解析成List<T>对象
     * @param <T>
     * @param json
     * @param typeToken 对象类型，参数实例化方法：new TypeToken<List<TestVO>>(){}
     * @return
     */
    public static <T> List<T> json2List(String json, TypeToken<List<T>> typeToken){
        return gson.fromJson(json, typeToken.getType());
    }

    /**
     * 实体(对象/集合)转换成Json串
     * @param obj
     * @return
     */
    public static String object2Json(Object obj) {
        return gson.toJson(obj);
    }

}
