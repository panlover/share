package com.deyang.share.common.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: yudeyang
 * Date: 13-10-28
 * Time: 下午11:21
 * To change this template use File | Settings | File Templates.
 */
public class PropertyUtil {
    public static String getPropertyValue(String key){
        Properties props = new Properties();
        try {
            InputStream in = new BufferedInputStream(new FileInputStream("config.properties"));
            props.load(in);
            String value = props.getProperty (key);
            System.out.println(key+value);
            return value;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
