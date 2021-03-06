package com.ymj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@EnableDiscoveryClient
@SpringBootApplication
public class Springcloud05TurbineServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud05TurbineServiceApplication.class, args);
    }

}
