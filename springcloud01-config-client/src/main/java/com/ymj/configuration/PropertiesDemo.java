package com.ymj.configuration;

import java.io.IOException;
import java.util.Properties;

/**
 * @Classname PropertiesDemo
 * @Description TODO
 * @Date 2021/6/24 19:45
 * @Created by yemingjie
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("name", "yemingjie");
        properties.setProperty("age", "24");

        properties.storeToXML(System.out, "This is a comment", "UTF-8");
    }
}
