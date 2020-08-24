package com.ytc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //表明自己是eureak服务端
public class SpringcloudEurakeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurakeServerApplication.class, args);
    }

}
