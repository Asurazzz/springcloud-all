package com.ymj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 由于所有服务都会注册到注册中心去，服务之间的调用都是通过从注册中心获取的服务列表来调用，注册中心一旦宕机，
 * 所有服务调用都会出现问题。所以我们需要多个注册中心组成集群来提供服务，下面将搭建一个双节点的注册中心集群。
 */
@EnableEurekaServer
@SpringBootApplication
public class Springcloud03EurekaServerReplicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud03EurekaServerReplicaApplication.class, args);
    }

}
