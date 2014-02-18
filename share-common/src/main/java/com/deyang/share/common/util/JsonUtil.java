package com.deyang.share.common.util;

import java.util.List;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 把对象变为Json字符串或者把字符串变成对象
 */
public class JsonUtil {

    /**
     * 把对象变为json字符串
     * @param object
     * @return
     */
    public static String getJsonFromObject(Object object){
        String json=null;
        json=JSONObject.fromObject(object).toString();
        return json;
    }

    public static String getJsonFromList(List list){
        String json=null;
        json=JSONArray.fromObject(list).toString();
        return json;
    }
    /**
     * json格式字符串转换成json对象
     * @param str
     * @return
     */
    public static JSONObject strToJson(String str){
        try{
            JSONObject jsonObject = JSONObject.fromObject(str);
            return jsonObject;
        }catch(Exception e){
            return null;
        }
    }
    /**
     * 把json对象转换成指定的对象
     * @param jsonObj
     * @param clazz
     * @return
     */
    public static Object jsonToBean(JSONObject jsonObj,Class clazz){
        if(jsonObj!=null){
            try{
                Object obj = clazz.cast(JSONObject.toBean(jsonObj,clazz));
                return obj;
            }catch(Exception e){
                return null;
            }
        }else{
            return null;
        }
    }
    /**
     * 将一个model对象转换成json对象
     * @param obj
     * @return
     */
    public static JSONArray  beanToJson(Object obj){
        if(obj!=null){
            try{
                JSONArray  json = JSONArray.fromObject(obj);
                return json;
            }catch(Exception e){
                return null;
            }

        }else{
            return null;
        }
    }
    /**
     * 将一个model的list对象转换成json对象
     * @param list
     * @return
     */
    public static JSONArray listToJson(List list){
        if(list!=null&&list.size()>0){
            try{
                JSONArray  json = JSONArray.fromObject(list);
                return json;
            }catch(Exception e){
                return null;
            }
        }else{
            return null;
        }
    }
    /**
     * 将JSONArray转化为list
     * @param jsonArray
     * @param clazz
     * @return
     */
    public static List jsonToList( JSONArray jsonArray,Class clazz){
        if(jsonArray!=null){
            try{
                List  list =  JSONArray.toList(jsonArray,clazz);
                return list;
            }catch(Exception e){
                return null;
            }
        }else{
            return null;
        }
    }
}

