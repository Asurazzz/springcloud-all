package com.ymj;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

@EnableHystrixDashboard
@EnableDiscoveryClient
@SpringBootApplication
public class Springcloud05HystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud05HystrixDashboardApplication.class, args);
    }

}
