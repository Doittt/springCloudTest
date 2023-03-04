package com.test.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@EnableEurekaServer
@SpringBootApplication
public class nacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(nacosApplication.class,args);
    }
}
