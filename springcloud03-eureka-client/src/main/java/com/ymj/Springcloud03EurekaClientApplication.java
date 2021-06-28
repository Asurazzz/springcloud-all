package com.ymj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Springcloud03EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud03EurekaClientApplication.class, args);
    }

}
