package com.ymj.configuration;

/**
 * @Classname GenericConfiguration
 * @Description TODO
 * @Date 2021/6/23 20:29
 * @Created by yemingjie
 */
public class GenericConfiguration {
    public static void main(String[] args) {
        println(System.getProperty("user.name"));

        println(System.getProperty("user.age", "2"));
    }

    private static void println(Object object) {
        System.out.println(object);
    }
}
