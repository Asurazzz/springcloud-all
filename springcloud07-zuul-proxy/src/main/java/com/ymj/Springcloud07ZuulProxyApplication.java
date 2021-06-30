package com.ymj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 访问http://localhost:8801/userService/user/1可以发现请求路由到了user-service上了；
 *
 * 访问http://localhost:8801/feignService/user/1可以发现请求路由到了feign-service上了。
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class Springcloud07ZuulProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud07ZuulProxyApplication.class, args);
    }

}
