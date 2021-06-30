package com.ymj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Springcloud11AdminClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud11AdminClientApplication.class, args);
    }

}
