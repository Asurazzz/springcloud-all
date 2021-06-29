package com.ymj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Springcloud04RibbonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud04RibbonServiceApplication.class, args);
    }

}
