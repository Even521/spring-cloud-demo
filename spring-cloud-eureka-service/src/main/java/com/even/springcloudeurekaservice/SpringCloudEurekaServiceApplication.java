package com.even.springcloudeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @author even
 * @date 2019/4/22 14:46
 * @describe
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServiceApplication.class, args);
    }

}
