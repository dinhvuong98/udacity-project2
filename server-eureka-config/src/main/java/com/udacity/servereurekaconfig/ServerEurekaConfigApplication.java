package com.udacity.servereurekaconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerEurekaConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerEurekaConfigApplication.class, args);
    }

}
