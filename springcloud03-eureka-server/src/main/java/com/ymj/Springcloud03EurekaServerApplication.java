package com.ymj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Springcloud03EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud03EurekaServerApplication.class, args);
    }

}
