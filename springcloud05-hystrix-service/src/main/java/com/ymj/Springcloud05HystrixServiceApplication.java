package com.ymj;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * 在启动类上添加@EnableCircuitBreaker来开启Hystrix的断路器功能
 */
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class Springcloud05HystrixServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud05HystrixServiceApplication.class, args);
    }

}
