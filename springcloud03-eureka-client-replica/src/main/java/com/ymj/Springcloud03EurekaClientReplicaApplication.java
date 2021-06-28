package com.ymj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Springcloud03EurekaClientReplicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud03EurekaClientReplicaApplication.class, args);
    }

}
