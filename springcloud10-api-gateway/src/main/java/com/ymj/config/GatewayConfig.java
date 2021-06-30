package com.ymj.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname GatewayConfig
 * @Description
 *
 * 重新启动api-gateway服务，并调用该地址测试：http://localhost:9201/user/getByUsername?username=macro
 * 我们发现该请求被路由到了user-service的该路径上：http://localhost:8201/user/getByUsername?username=macro
 * @Date 2021/6/30 15:07
 * @Created by yemingjie
 */
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("path_route2", r -> r.path("/user/getByUsername")
                        .uri("http://localhost:8201/user/getByUsername"))
                .build();
    }
}
